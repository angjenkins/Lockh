package gov.gsa.fas.fpdsatomfeed.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PropertyResourceBundle;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xmlUtil {
	private final static Logger logger = Logger.getLogger(System.class
			.getName());
	static String rootFolder="/opt/sw/jboss/FPDS/";
	private static int reloadTime = 60; //refresh source xml every 60 seconds
	private static long loadTime;
	File output = new File(rootFolder+"output.xml");
	static File getXpaths = new File(rootFolder+"getXpaths.xsl");
	static File awardXml = new File(rootFolder+"Award.xml");
	static File idvXml = new File(rootFolder+"Idv.xml");
	static File schema_version = new File(rootFolder+"schema_version.properties");
	static File  AtomAwardXml = new File(rootFolder+"Atomfeed.xml");
	static String awardListnameSpace="/ns1:listOfAwards";
	static String awardnameSpace="/ns1:award";
	static String idvListnameSpace="/ns1:listOfIDVs";
	static String idvnameSpace="/ns1:IDV";
	public static PropertyResourceBundle versionProps;
	ArrayList<String>  awardsXpaths=null;
	ArrayList<String>  idvXpaths=null;
	static public void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
	      //Getting the instance of DocumentBuilderFactory 
	      domFactory.setNamespaceAware(true);
	      //true if the parser produced will provide support for XML namespaces; 
	      DocumentBuilder builder = domFactory.newDocumentBuilder();
	      Document atomDoc = builder.parse(AtomAwardXml);
	      xmlUtil util=new xmlUtil();
	      util.processAtomXml(util.getXmlStr(atomDoc), "AWARD");

	}
	
	public String processAtomXml(String AtomXml,String contractType){
		if (AtomXml == null || AtomXml.trim().equals("") )
			return "";
		String outXml=null;
		if (contractType.equals("AWARD"))
			outXml=transform(AtomXml,awardXml,awardListnameSpace,awardnameSpace);
		else if (contractType.equals("IDV"))
			outXml=transform(AtomXml,idvXml,idvListnameSpace,idvnameSpace);
		else
			outXml=AtomXml;
		return outXml;
	}
	
	
	
	private void printList(ArrayList<String> list){
		for(String str:list)
			logger.info(str);
	}
	
	private  String transform(String atomXml, File refXml,
			String listNameSpace, String typeNameSpace) {
		String outStr=null;
		try {

		      DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		      //Getting the instance of DocumentBuilderFactory 
		      domFactory.setNamespaceAware(true);
		      //true if the parser produced will provide support for XML namespaces; 
		      DocumentBuilder builder = domFactory.newDocumentBuilder();
		      //Creating document builder
		      ByteArrayInputStream inStream=new ByteArrayInputStream(atomXml.getBytes());
		      Document atomDoc = builder.parse(inStream);
		      //logger.info("Saving the input");
		      //saveXml(atomDoc, AtomAwardXml);
		      Document dsrDoc = builder.parse(refXml);
		      ArrayList<Node> tempList=new ArrayList<Node>();
		      XPath atomXpath = XPathFactory.newInstance().newXPath();
		      atomXpath.setNamespaceContext(new UniversalNamespaceCache(atomDoc, true));
		      XPath dsrXpath = XPathFactory.newInstance().newXPath();
		      dsrXpath.setNamespaceContext(new UniversalNamespaceCache(dsrDoc, true));
		      XPathExpression expr = atomXpath.compile(listNameSpace+typeNameSpace);
		      NodeList result = (NodeList) expr.evaluate(atomDoc, XPathConstants.NODESET);
		      int total=result.getLength();
		      logger.info("number of Nodes:"+total);
		      ArrayList<String> sourcePaths=null;
		      ArrayList<String> missingPaths=null;
		      ArrayList<String> newPaths=null;
		      Node missingNode=null;
		      Node newNode=null;
		     // total=1;
		      for(int i=0;i<total;i++){
		    	  Node anAtomNode=result.item(i);
		    	  sourcePaths=getSortedList(transform(new DOMSource(anAtomNode),getXpaths));
		    	  missingPaths=getMissing(sourcePaths, getContractTypeXpaths(typeNameSpace));
		    	  logger.info("*********** Number of missing tags from AtomFeed ["+missingPaths.size()+"]");
		    	  //printList(missingPaths);
		    	  newPaths = getMissing(getContractTypeXpaths(typeNameSpace),sourcePaths);
		    	  logger.info("*********** Number of new tags from AtomFeed ["+newPaths.size()+"]");
		    	  printList(newPaths);
		    	 // System.exit(1);
		    	  if (missingPaths != null && !missingPaths.isEmpty() )	  
			    	  for (String str:missingPaths){
			    		  String parentStr=listNameSpace+str.substring(0,str.lastIndexOf("/"));
			    		  //logger.info("Adding missing tag:"+str);
			    		  //logger.info("Parent missing tag:"+parentStr);
			    		  expr = dsrXpath.compile(str);
			    		  missingNode = (Node) expr.evaluate(dsrDoc, XPathConstants.NODE);
			    		  if(missingNode.getTextContent()==null || missingNode.getTextContent().equals(" "))
			    			  missingNode.setTextContent("");
			    		  if (missingNode != null && missingNode.getChildNodes().getLength()>1){
			    			  missingNode=missingNode.cloneNode(false);
			    		  }
			    		  expr = atomXpath.compile(parentStr);
			    		  newNode = (Node) expr.evaluate(anAtomNode, XPathConstants.NODE);
			    		// new node into the destination document
			    		  if (missingNode != null && newNode != null){
			    		  missingNode = atomDoc.importNode(missingNode, true);
			    		  newNode.appendChild(missingNode);
			    		  }
			    	  }
		    	  if (newPaths != null && !newPaths.isEmpty() )	  
			    	  for (String tag:newPaths){
			    		  String str=listNameSpace+tag;
			    		  logger.info("removing added tag:"+str);
			    		  expr = atomXpath.compile(str);
			    		  newNode = (Node) expr.evaluate(anAtomNode, XPathConstants.NODE);
			    		// new node into the destination document
			    		  if (newNode != null){
			    			  logger.info("Removing new element:"+newNode.getNodeName()+":"+newNode.getNodeValue());
			    			  newNode.getParentNode().removeChild(newNode);
			    		  }
			    		 
			    	  }
		    	  
		    	  
		    	  tempList.add(anAtomNode);
		    	  anAtomNode.getParentNode().removeChild(anAtomNode);
		      }
		    for (Node aNode:tempList)	{
		    	if (aNode != null){
		    		//logger.info("inserting nodes..");
		    		// new node into the destination document
		    	     newNode = atomDoc.importNode(aNode, true);
		    	    // Make the new node an actual item in the target document
		    	     atomDoc.getDocumentElement().appendChild(newNode);
		    	}
		    }
			saveXml(atomDoc,output);
			
			
            outStr=getXmlStr(atomDoc);

           // logger.info(outStr);
		         
		        logger.info("Success!");
		    } catch (Exception e) {
		        e.printStackTrace(System.err);
		    }
		   
		return outStr;
	}

	public  void removeAllChildren(Node node)
	{
	    
		for (Node child; (child = node.getFirstChild()) != null; node.removeChild(child));
	    
	}
	
	private  void saveXml(Document doc,File out) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		 Transformer transformer = transformerFactory.newTransformer();
		 transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		 transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		  DOMSource source = new DOMSource(doc);
		  StreamResult streamResult =  new StreamResult(out);
		  transformer.transform(source, streamResult);
		
	}
	
	private  String getXmlStr(Document doc) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		 Transformer transformer = transformerFactory.newTransformer();
		 transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		 transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		  DOMSource source = new DOMSource(doc);
		  ByteArrayOutputStream out = new ByteArrayOutputStream();
		  StreamResult streamResult =  new StreamResult(out);
		  transformer.transform(source, streamResult);
		return out.toString();
		
	}
	private  ArrayList<String> updateList(ArrayList<String> newPaths,
			ArrayList<String> missing) {
		if(missing == null ||missing.isEmpty() )
			return newPaths;
		if (newPaths == null || newPaths.isEmpty())
				newPaths = missing;
		else{
			for(String str:missing)
				if(!newPaths.contains(str))
					newPaths.add(str);
		}
		return newPaths;
	}
	
	public static String getSchemaVersion(String typeName) throws FileNotFoundException, IOException{
		String version="";
		if(typeName ==null)
			return version;
		if (versionProps == null)
			versionProps = new PropertyResourceBundle(new FileInputStream(schema_version));
		if(typeName.equals("AWARD") && versionProps != null ){
			version=versionProps.getString("AWARD");	
		} else if(typeName.equals("IDV") && versionProps != null ){
			version=versionProps.getString("IDV");	
		}
		if (version != null && !version.trim().equals("")){
			logger.info("Schema version->"+version);
			return "&VERSION="+version.trim();
		}
		return "";
			
	}
	public  ArrayList<String> getContractTypeXpaths(String typeNameSpace) throws TransformerException, FileNotFoundException, IOException{
		
		boolean isRefreshTime=(System.currentTimeMillis()-loadTime)/1000-reloadTime > 0;
		if (isRefreshTime && typeNameSpace !=null){
			logger.info("Refreshing refrence xpaths ....");
			loadTime = System.currentTimeMillis();
			if(typeNameSpace.equals(awardnameSpace))
				awardsXpaths = null;
			else
				idvXpaths = null;
			versionProps = new PropertyResourceBundle(new FileInputStream(schema_version));
		}
		if(typeNameSpace ==null ||typeNameSpace.equals(awardnameSpace))
			if (awardsXpaths != null)
				 return awardsXpaths;
			else{
				awardsXpaths=getSortedList(transform(new StreamSource(awardXml),getXpaths));
				return awardsXpaths;
			}
		if(typeNameSpace.equals(idvnameSpace))
				if (idvXpaths != null)
					 return idvXpaths;
				idvXpaths=getSortedList(transform(new StreamSource(idvXml),getXpaths));
				return idvXpaths;			
			
		
	}
	 public  String transform(Source  xmlSource,File xsltfile) throws TransformerException{
		// Setup XSLT
		 
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer(new StreamSource(xsltfile));
         ByteArrayOutputStream output = new ByteArrayOutputStream();
         transformer.transform( xmlSource, new StreamResult( output ) );
		 String result=output.toString();
		return result;
	 }
	 
	 public  ArrayList<String> getSortedList(String input){
		StringTokenizer tokens=new StringTokenizer(input,"\n");
		ArrayList<String> out=new ArrayList<String>();
		String token=null;
		while(tokens.hasMoreTokens()){
			token=tokens.nextToken();
			if(!out.contains(token))
			    out.add(token);
		}
		Collections.sort(out);
		//logger.info("Sorted list:"+out);
		return out;
		 
	 }
	public  ArrayList<String> getMissing(ArrayList<String> input,ArrayList<String> master){
		ArrayList<String> missings = new ArrayList<String>();
		for (String str:master)
			if(!input.contains(str))
				missings.add(str);
		Collections.sort(missings);
		return missings;
	}
}
