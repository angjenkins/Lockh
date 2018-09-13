/*
 * @(#)ResponseXmlHelper.java			Aug 29, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.io.StringWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.model.IndustryCode;
import gov.gsa.fas.vision.dla.request.model.ItemIdentification;
import gov.gsa.fas.vision.dla.request.model.OrganizationInfo;
import gov.gsa.fas.vision.dla.request.model.ReferenceIdentification;
import gov.gsa.fas.vision.dla.response.beans.F_File_842AR;
import gov.gsa.fas.vision.dla.response.beans.ObjectFactory;

/**
 * <code>ResponseXmlHelper</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class ResponseXmlHelper {
	
	private static final Logger logger = Logger.getLogger(ResponseXmlHelper.class.getName());
	
	static String marshallResponse(F_File_842AR fFile842AR) throws VisionDlaException {
		try {
			JAXBContext context = JAXBContext.newInstance(F_File_842AR.class);
			Marshaller marshaller = context.createMarshaller();
			SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
			String schemaLocation = "004030F842A3RA26_Oct0913_ADC_1068.xsd";
			URL schemaUrl = ResponseXmlHelper.class.getClassLoader().getResource(schemaLocation);
      Schema schema = sf.newSchema(schemaUrl);
      marshaller.setSchema(schema);			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
      marshaller.setEventHandler(new ValidationEventHandler() {
      	public boolean handleEvent(ValidationEvent ve) {
      		String eventMsg = "SEVERITY: " + ve.getSeverity() + " " + 
      											"MESSAGE: " + ve.getMessage() + " " +
      											"OBJECT: " + ve.getLocator().getObject() + " " + 
      											"NODE: " + ve.getLocator().getNode();
      		logger.error("handleEvent(): Marshaller event handler says->" + eventMsg);
      		return false;
      	}
      });
      StringWriter stringWriter = new StringWriter();
      ObjectFactory objectFactory = new ObjectFactory();
      JAXBElement<F_File_842AR> ffile842ARJaxb = objectFactory.createFile(fFile842AR);
      marshaller.marshal(ffile842ARJaxb,stringWriter);
      logger.info("marshallResponse(): JAXB marshalling completed");
      return stringWriter.toString();

		}catch(JAXBException jbe){
			logger.error("marshallResponse():SAXException occured while writing to Outstream", jbe);
			VisionDlaException vdException = new VisionDlaException("JAXBException occured while writing to Outstream", jbe);
			if(jbe.getLinkedException() != null && jbe.getLinkedException().getMessage() != null){
				vdException.setErrorMessage(jbe.getLinkedException().getMessage());
			}
			throw vdException;			
		}catch(Exception e){
			logger.error("marshallResponse():Unknown Exception occured while writing to Outstream ", e);
			throw new VisionDlaException("Unknown Exception Occured while writing to Outstream", e);
		}
            
	}		
	
	/**
	 * @param wsdrReqData
	 * @param string
	 * @return
	 */
	static ReferenceIdentification getReferenceIdentification(
			WsdrRequestData wsdrReqData, String qualifier) {
		List<ReferenceIdentification> listRi = wsdrReqData.getRequestDataAggregate().
				getReferenceIdentification();
		if(listRi == null) 	return null;
		for(ReferenceIdentification ri:listRi){
			if(ri != null && ri.getQualifier().equalsIgnoreCase(qualifier)){
				return ri;
			}
		}
		return null;
	}
	
	static OrganizationInfo getOrganiztionInfo(WsdrRequestData wsdrReqData, 
			String entityIdCode){
		List<OrganizationInfo> listOi = wsdrReqData.getRequestDataAggregate().
				getOrganizationInfo();
		if(listOi == null) return null;
		for(OrganizationInfo oi:listOi){
			if(oi != null && oi.getEntitiyIdCode().equalsIgnoreCase(entityIdCode)){
				return oi;
			}
		}
		return null;
	}
	
	static OrganizationInfo getOrganizationInfo(WsdrRequestData wsdrReqData, 
			String entityIdCode, String idCdQualifier){
		List<OrganizationInfo> listOi = wsdrReqData.getRequestDataAggregate().
				getOrganizationInfo();
		if(listOi == null) return null;
		for(OrganizationInfo oi:listOi){
			if(oi != null 
					&& oi.getEntitiyIdCode().equalsIgnoreCase(entityIdCode) 
					&& oi.getIdCdQualifier().equalsIgnoreCase(idCdQualifier)
			){
				return oi;
			}
		}
		return null;
	}
	
	static List<OrganizationInfo> getOrganiztionInfo(WsdrRequestData wsdrReqData){
		List<OrganizationInfo> listOi = wsdrReqData.getRequestDataAggregate().
				getOrganizationInfo();
		return listOi;
	}	
	
	static List<ItemIdentification> getItemIdentification(WsdrRequestData wsdrReqData){
		return wsdrReqData.getRequestDataAggregate().getItemIdentification();
	}
	
	static List<IndustryCode> getIndustryCode(WsdrRequestData wsdrReqData){
		return wsdrReqData.getRequestDataAggregate().getIndustryCode();
	}
	
	static boolean isValidIndustryCode(String qualifier){
		List<String> validValues = Arrays.asList(new String[]{"D", "EQ", "FD"});
		return isValidValue(qualifier, validValues);
	}
	
	static boolean isValidLncaOrganizationEntityCode(String entityCode){
		List<String> validValues = Arrays.asList(new String[]{"SUS"});
		return isValidValue(entityCode, validValues);
	}
	
	static boolean isValidLncaIndustryCode(String qualifier){
		List<String> validValues = Arrays.asList(new String[]{"HA"});
		return isValidValue(qualifier, validValues);
	}	
	
	static String replaceSpecialCharacters(String comments){
		if(comments == null){
			return null;
		}
  	comments = comments.replaceAll("\r\n", "");
  	comments = comments.replaceAll("\\r\\n", "");
  	
  	comments = comments.replaceAll("<", "_");
  	comments = comments.replaceAll(">", "_");
  	comments = comments.replaceAll("&", "_");
  	comments = comments.replaceAll("%", "_");
  	comments = comments.replaceAll("/", "_");
  	comments = comments.replaceAll("\\?", "_");
  	comments = comments.replaceAll("'", "_");
  	comments = comments.replaceAll("\"", "_");
  	return comments;
	}
	
	private static boolean isValidValue(String value, List<String> validValues) {                
  	if (validValues.contains(value)) {
  		return true;
  	}
  	return false;
  }
}
