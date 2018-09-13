/**
 * 
 */
package gov.gsa.fas.fpdsatomfeed.service;

import gov.gsa.fas.fpdsatomfeed.common.Parser;
import gov.gsa.fas.fpdsatomfeed.common.getFPDSUpdates;


import gov.gsa.fas.fpdsatomfeed.common.xmlUtil;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBElement;

import org.jboss.wsf.spi.annotation.WebContext;

import com.fpdsng.fpds.ListOfAwards;
import com.fpdsng.fpds.ListOfIDVs;

/**
 * @author KamalJSarabi
 *
 */
@Stateless()
@Remote(FPDSAtomFeedAccess.class)
@WebContext(contextRoot = "/FPDSAtomFeed.service", urlPattern = "/FPDSAtomFeedAccess")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(endpointInterface = "gov.gsa.fas.fpdsatomfeed.service.FPDSAtomFeedAccess", 
		portName = "FPDSAtomFeedAccess",targetNamespace="http://fas.gsa.gov/FPDSAtomFeed/service")

public class FPDSAtomFeedAccessImpl implements FPDSAtomFeedAccess {
	private final static Logger logger = Logger.getLogger(System.class
			.getName());

	
	//@Override
	public String getAtomFeed(AtomFeedRequest req)
			throws ServiceFault{
		logger.info("getAtomFeed is called.");
		validateInput(req);
	try{
		StringBuilder Result=getAtomFeedStr(req);
		if (Result != null){
			xmlUtil util=new xmlUtil();
			// parsing atomFeed XML
			String outXml=util.processAtomXml(Result.toString(), req.getContractType());
			return outXml;
			
		}	
		else 
			logger.info("result is null");
	}catch(Exception e){
	    e.printStackTrace();
		throw new ServiceFault("soap Error Fault",e.getMessage());
	}
		return "";
	}

	//@Override
	public long getAtomFeedCount(AtomFeedRequest req)
			throws ServiceFault {
		logger.info("getAtomFeedCount is called.");
		validateInput(req);
		long count=0;
		try{
			getFPDSUpdates GetFPDSUpdates = new getFPDSUpdates();
			count=getRecordCount(GetFPDSUpdates,req);
			logger.info("count:"+count);
		}catch(Exception e){
		    e.printStackTrace();
			throw new ServiceFault("soap Error Fault",e.getMessage());
		}
		return count;
	}
	
	private void validateInput(AtomFeedRequest req)throws ServiceFault {
		String ErMsg="";
		if (req == null || req.getContractType()==null || req.getContractType().trim().equals(""))
			ErMsg="Input can not be Null or Empty.";
		else if ((req.getLastModDateStart() == null || req.getLastModDateStart().trim().equals("") ||
				req.getLastModDateEnd() == null || req.getLastModDateEnd().trim().equals(""))&&
				(req.getSignedDateStart() == null || req.getSignedDateStart().equals("") ||
				req.getSignedDateEnd() == null || req.getSignedDateEnd().equals("") ))
			ErMsg="Both last mod date & Signed dates can not be Null or Empty.";
		
		else{
			    req.setContractType(req.getContractType().trim());
			    if (req.getStart() < 0)
			    	ErMsg="start should be valid integer number >= 0\n";
			    if (req.getLastModDateStart() != null && !req.getLastModDateStart().trim().equals(""))	
				    if (req.getLastModDateStart().length()!=10 || getDateFromStr(req.getLastModDateStart())== null )
				    	ErMsg+="Last modified start date should be a valiud date i.e: YYYY/MM/DD";
			    if (req.getLastModDateEnd() != null && !req.getLastModDateEnd().trim().equals(""))	
				    if (req.getLastModDateEnd().length()!=10 || getDateFromStr(req.getLastModDateEnd())== null )
				    	ErMsg+="Last modified end date should be a valiud date i.e: YYYY/MM/DD";
			    if (req.getSignedDateStart() != null && !req.getSignedDateStart().trim().equals(""))	
				    if (req.getSignedDateStart().length()!=10 || getDateFromStr(req.getSignedDateStart())== null )
				    	ErMsg+="SignedDateStart should be a valiud date i.e: YYYY/MM/DD";
			    if (req.getSignedDateEnd() != null && !req.getSignedDateEnd().trim().equals(""))	
				    if (req.getSignedDateEnd().length()!=10 || getDateFromStr(req.getSignedDateEnd())== null )
				    	ErMsg+="SignedDateEnd should be a valiud date i.e: YYYY/MM/DD";    
			    if (!(req.getContractType().equals("AWARD")||req.getContractType().equals("IDV")||req.getContractType().equals("DELETE")))
			    	ErMsg+="ContractType should be AWARD OR IDV OR DELETE.";
			    if (req.getModificationNumber() != null && !req.getModificationNumber().trim().equals(""))
			    	if(req.getModificationNumber().trim().length()> 25)
			    	ErMsg+="MODIFICATION_NUMBER (String): max length is 25 characters.";
			    if (req.getPIID() != null && !req.getPIID().trim().equals(""))
			    	if(req.getPIID().trim().length()> 50)
			    	ErMsg+="PIID (String): max length is 50 characters.";
		}
		
		if (!ErMsg.equals("") ){
			throw new ServiceFault("soap Request Fault",ErMsg);
		}
			
	}
	
	private long getRecordCount(getFPDSUpdates GetFPDSUpdates,AtomFeedRequest req) throws Exception{
		
		     
		        long nReturnValue=0;
		        String sQuery=getAtomFeedQuery(req);
		        String sContractType=req.getContractType();
	          
				if (sContractType.equals("AWARD"))
		        {
		          nReturnValue = GetFPDSUpdates.getXMLFileRecordCount(sQuery, sContractType, xmlUtil.getSchemaVersion(sContractType));
		//"//ftpdata//cartuser//atomfeeds//afawards//AWARD_" +
		         // wXMLOut = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( "//ftpdata//cartuser//atomfeeds//afawards//AWARD_"  + sYear + sMonth + sDay + "_" + nReturnValue + ".xml"), "UTF-8"));
		        }
	
		        if (sContractType.equals("IDV"))
		        {
		          nReturnValue = GetFPDSUpdates.getXMLFileRecordCount(sQuery, sContractType, xmlUtil.getSchemaVersion(sContractType));
		//"//ftpdata//cartuser//atomfeeds//afidv//IDV_" +
		         // wXMLOut = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("//ftpdata//cartuser//atomfeeds//afidv//IDV_" + sYear + sMonth + sDay + "_" + nReturnValue + ".xml"), "UTF-8"));
		        }
	
		        if (sContractType.equals("DELETE"))
		        {
		          nReturnValue = GetFPDSUpdates.getDELETEXMLFileRecordCount(sQuery, sContractType);
		//"//ftpdata//cartuser//atomfeeds//afdelete//DELETE" +
		        //  wXMLdelOut = new PrintStream(new FileOutputStream("//ftpdata//cartuser//atomfeeds//afdelete//DELETE" + sYear + sMonth + sDay + "_" + nReturnValue + ".txt", true));
		        //  wXMLdelOut.print("recordtype^|agencyID^|referencedIDVIDAgency^|agencydesc^|pidd^|modNumber^|signedDate^|obligatedAmount^|lastModifiedDate^|refmodNumber^|refpidd^|transactionNumber^|sDate1");
		        }
	
		        logger.info("nReturnValue: " +nReturnValue);
		
	      return nReturnValue;
	}

	private String getAtomFeedQuery(AtomFeedRequest req){
		String sQuery = "";
		if (req.getSignedDateStart() != null && !req.getSignedDateStart().trim().equals("") &&
		    	req.getSignedDateEnd() != null && !req.getSignedDateEnd().trim().equals("")	)
		    	sQuery +="SIGNED_DATE:["+req.getSignedDateStart().trim()+","+req.getSignedDateEnd().trim()+"]";
	    if (req.getLastModDateStart() != null && !req.getLastModDateStart().trim().equals("") &&
		    	req.getLastModDateEnd() != null && !req.getLastModDateEnd().trim().equals("")	)
		    	sQuery +="%20LAST_MOD_DATE:["+req.getLastModDateStart().trim()+","+req.getLastModDateEnd().trim()+"]";
	    if (req.getModificationNumber() != null && !req.getModificationNumber().trim().equals(""))
	    	sQuery += "%20MODIFICATION_NUMBER:\""+req.getModificationNumber().trim()+"\"";
	    if (req.getPIID() != null && !req.getPIID().trim().equals(""))
	    	sQuery += "%20PIID:\""+req.getPIID().trim()+"\"";
		    
		    logger.info("The final query is " + sQuery);
		return  sQuery;   
		
	}
	private StringBuilder getAtomFeedStr(AtomFeedRequest req) throws Exception{
		getFPDSUpdates GetFPDSUpdates = new getFPDSUpdates();
	    
	    StringBuilder x = null ;

	    long startTime = System.currentTimeMillis();

	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	    dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));

	    long nReturnValue = -1L;

	    String sContractType = req.getContractType();

	    logger.info("Contract Type: " + sContractType);
	    
	   /* String sYear = sQuery.substring(0, 4);
	    String sMonth = sQuery.substring(5, 7);
	    String sDay = sQuery.substring(8, 10);
	    logger.info("YEAR: " + sYear +", sMonth: " + sMonth +", sDay: " + sDay);*/
	    
	    String sQuery = getAtomFeedQuery( req);

	    

	    
	    logger.info("nStart: " + req.getStart());
        String nStart=req.getStart()+"";

    	//nReturnValue=getRecordCount(GetFPDSUpdates,sContractType,sLastUpdatedInCART);
        if (sContractType.equals("AWARD"))
        {
          x = GetFPDSUpdates.getAWARDXMLFileViaAtom("", sQuery, nStart, xmlUtil.getSchemaVersion("AWARD"));
        }

        if (sContractType.equals("IDV"))
        {
          x = GetFPDSUpdates.getIDVXMLFileViaAtom("", sQuery, nStart, xmlUtil.getSchemaVersion("IDV"));
        }

        if (sContractType.equals("DELETE")) {
          logger.info("DELETE FUNCTION CALL : " + "" + " :: " + sQuery + " :: " + nStart + " :: " + nReturnValue);
          x = GetFPDSUpdates.getDELETEXMLFileViaAtom("", sQuery, nStart, nReturnValue);
        }


	    long endTime = System.currentTimeMillis();
	    long elapsedTime = endTime - startTime;

	    SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
	    dateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));

	   //logger.info("Start: (" + dateFormat.format(new Date(startTime)) + ") End: (" + dateFormat.format(new Date(endTime)) + ") - Last Updated: - " + sYear + "/" + sMonth + "/" + sDay + " - Batch Count: " + nReturnValue + " - CONTRACT_TYPE: " + sContractType);

	   logger.info("  * Elapsed Time: " + dateFormat2.format(new Date(elapsedTime)));

	   // pStrLog.close();

	    logger.info("Goodbye:... ");
	  
		return x;
	}
	
	private Calendar getDateFromStr(String in){
		Calendar cal=null;
		try{
			String sYear = in.substring(0, 4);
		    String sMonth = in.substring(5, 7);
		    String sDay = in.substring(8, 10);
		    logger.info("YEAR: " + sYear +", sMonth: " + sMonth +", sDay: " + sDay);
		    cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, Integer.parseInt(sYear));
			cal.set(Calendar.MONTH, Integer.parseInt(sMonth)-1);
			cal.set(Calendar.DATE, Integer.parseInt(sDay));
			logger.info(cal.getTime()+"");
		}catch (Exception e){
			cal=null;
		}
		return cal;
	}
	
	
	public static void main(String[] args) throws ParseException {
		String in="2013:7:19";
		Calendar cal=null;
		String sYear = in.substring(0, 4);
	    String sMonth = in.substring(5, 7);
	    String sDay = in.substring(8, 10);
	    logger.info("YEAR: " + sYear +", sMonth: " + sMonth +", sDay: " + sDay);
	    cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(sYear));
		cal.set(Calendar.MONTH, Integer.parseInt(sMonth)-1);
		cal.set(Calendar.DATE, Integer.parseInt(sDay));
		logger.info(cal.getTime()+"");
	}

	//@Override
	public ListOfAwards getAwardList(AtomFeedRequest req)
			throws ServiceFault {
		if (req == null)
			throw new ServiceFault("soap Request Fault","soap request is null");
		req.setContractType("AWARD");
		String xmlStr=getAtomFeed(req);
		JAXBElement<ListOfAwards> xmlObj=(JAXBElement<ListOfAwards> )Parser.unmarshall(ListOfAwards.class, new ByteArrayInputStream(xmlStr.getBytes()));
		
		return xmlObj.getValue();
	}

	//@Override
	public ListOfIDVs getIDVList(AtomFeedRequest req)
			throws ServiceFault {
		if (req == null)
			throw new ServiceFault("soap Request Fault","soap request is null");
		req.setContractType("IDV");
		String xmlStr=getAtomFeed(req);
		JAXBElement<ListOfIDVs> xmlObj=(JAXBElement<ListOfIDVs>) Parser.unmarshall(ListOfIDVs.class, new ByteArrayInputStream(xmlStr.getBytes()));
		
		return xmlObj.getValue();
	}



}
