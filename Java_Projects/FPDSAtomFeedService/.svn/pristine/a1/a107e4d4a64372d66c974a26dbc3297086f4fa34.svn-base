package gov.gsa.fas.fpdsatomfeed.common;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.xml.sax.InputSource;

import com.fpdsng.fpds.ListOfAwards;

public class Parser {
	private final static Logger logger = Logger.getLogger(System.class.getName());
	
	public static String marshal(Object ad){
		try {
			JAXBContext jc = JAXBContext.newInstance("ns1:"+ad.getClass().getPackage().getName());
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			marshaller.marshal(createJAXB(ad), os);
			String marshAD = os.toString();
			logger.info("XML String is created from Object->"+ad.getClass().getName());
			return marshAD;

		} catch (Exception ex) {
		
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
    public static JAXBElement createJAXB(Object obj) {

    	logger.info("The Object array is an array of object type [" + obj.getClass().getSimpleName() +"]") ;
		JAXBElement jaxbObj = new JAXBElement(new QName("", obj.getClass().getSimpleName()),
														obj.getClass(),
														obj
														) ;
		return jaxbObj;

    }
    
    public static Object unmarshall(Class targetObject,InputStream in) {
		logger.info("creating xml object from Xml");
	
		Object obj = null;
		try {
		    JAXBContext jc = JAXBContext.newInstance(targetObject.getPackage().getName());
		    Unmarshaller unmarshaller = jc.createUnmarshaller();
		    obj = unmarshaller.unmarshal(in);	    
			logger.info(targetObject.getName()+ " object is created from XML");
		} catch (Exception ex) {
		
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		return obj;
	}
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File output = new File("/opt/sw/jboss/FPDS/output.xml");
		JAXBElement<ListOfAwards> aw=(JAXBElement<ListOfAwards>) unmarshall(ListOfAwards.class, new FileInputStream(output));
		
	}

}

