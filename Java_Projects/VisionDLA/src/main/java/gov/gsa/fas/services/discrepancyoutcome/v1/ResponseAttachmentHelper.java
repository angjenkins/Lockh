/*
 * @(#)ResponseAttachmentHelper.java			Sep 8, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.services.discrepancyoutcome.v1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

//import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import gov.gsa.fas.discrepancyoutcome.v1.Attachment;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessAttachmentRequest;
import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.persistence.ResponseData;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistence;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;
import gov.gsa.fas.vision.dla.persistence.WsdrResponseDao;
import gov.gsa.fas.vision.dla.sftp.DlaSftpAdapter;

/**
 * <code>ResponseAttachmentHelper</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class ResponseAttachmentHelper {

	private static Logger logger = Logger.getLogger(ResponseAttachmentHelper.class);
	
	/**
	 * @param attachmentNameList
	 * @param visionDlaKey
	 */
	static void saveAttachmentNames(List<String> attachmentNameList,
			long visionDlaKey) throws ServiceFault{
		try {
			VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
			visionPers.createResponseAttNames(attachmentNameList,visionDlaKey);
		} catch (VisionDlaException e) {
			logger.error("saveAttachmentNames(): Failed to save attachment names for " +
					"Dla Key->" + visionDlaKey, e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E","Failed to save attachment names"));
		} catch (VisionDlaPersistenceException e) {
			logger.error("saveAttachmentNames(): Failed to save attachment names for " +
					"Dla Key->" + visionDlaKey, e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E","Failed to save attachment names"));
		}
		
	}

	static void validateAttachmentRequest(
			ProcessAttachmentRequest processAttRequest)  throws ServiceFault{
		if(processAttRequest == null || processAttRequest.getAttachment() == null){
			logger.error("validateAttachmentRequest(): Attachment Request is nulll");
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E","Attachment request is invalid")); 
		}
		if(processAttRequest.getVisionDlaKey() <=0){
			logger.error("validateAttachmentRequest(): Vision DLA Key is not valid value");
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "VisionDLA Key required"));
		}
		Attachment att = processAttRequest.getAttachment();
		if(att.getDocumentName() == null || att.getDocumentName().trim().isEmpty()){
			logger.error("validateAttachmentRequest(): Document name is null or empty");
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Document name required"));
		}
		if(att.getDocument() == null || att.getDocument().length <=0){
			logger.error("validateAttachmentRequest(): Document binary is null or empty");
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Document not attached"));
		}		
	}

	static boolean saveAttachment(String respAttName, byte[] docBytes) 
							throws ServiceFault{
		logger.info("saveAttachment():Saving document to local staging directory->" + 
				respAttName);
		String stagingDir = VisionDlaConfig.getPropertyValue(ConfigConstants.RESPONSE_ATT_STAGING_DIR);
		String respFilePath = stagingDir + "/" + respAttName;
    try {
    	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(respFilePath));
    	//byte[] decodedBytes = Base64.decodeBase64(docBytes);
    	byte[] decodedBytes = docBytes; 
  		logger.info("processAttachment():Attachment Size -> " + decodedBytes.length);
    	bos.write(decodedBytes);
    	bos.flush();
    	bos.close();
			return true;
		} catch (IOException e) {
			logger.error("saveAttachment(): Failed to save Response attachment to the" +
					"Staging file->" + respFilePath, e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to save response attachment to the staging directory"));
		}
	}
	
	static boolean sendResponseAttachment(String respAttName, long visionDlaId) 
			throws ServiceFault{
		boolean isSent = false;
		try {
			isSent = DlaSftpAdapter.sendResponseAttFile(respAttName);
		} catch (VisionDlaException e) {
			logger.error("sendResponseAttachment(): Failed to send response attachment file to SFTP->" + respAttName, e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "System Error: Failed to send response attachment file to SFTP Server"));
		}

		try {
			VisionDlaPersistence visionDlaPers = Utility.getVisionDlaPersistenceLocal();
			if(isSent){
				visionDlaPers.setResponseAttSent(visionDlaId, respAttName);
			}else{
				visionDlaPers.setResponseAttSendFailed(visionDlaId, respAttName);
			}
		} catch (VisionDlaPersistenceException e) {
			logger.error("sendResponseAttachment(): Failed to update Response attachment status ->" + respAttName,e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to update response attachment status"));
		} catch (VisionDlaException e) {
			logger.error("sendResponseAttachment(): Failed to update response attachment status ->" + respAttName,e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to update response attachment status"));
		}
		DlaSftpAdapter.deleteStagingFile(VisionDlaConfig.getPropertyValue(
				ConfigConstants.RESPONSE_ATT_STAGING_DIR), respAttName);		
		return isSent;		
	}

	public static void checkAndSendResponseXML(long visionDlaKey) throws ServiceFault{
		ResponseData responseData;
		try {
			VisionDlaPersistence visionDlaPers = Utility.getVisionDlaPersistenceLocal();
			boolean isAllSent = visionDlaPers.isAllResponseAttSent(visionDlaKey);
			if(!isAllSent){return;}
			responseData = visionDlaPers.getResponseXml(visionDlaKey);
		} catch (VisionDlaException e) {
			logger.error("checkAndSendResponseXML(): Failed to check Response attachments DLA Key->" + visionDlaKey,e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to check response attachments statuses"));
		} catch (VisionDlaPersistenceException e) {
			logger.error("checkAndSendResponseXML(): Failed to check Response attachments DLA Key->" + visionDlaKey,e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to check response attachments statuses"));
		}
		if(responseData == null || responseData.getResponseXml()== null){
			logger.error("checkAndSendResponseXML(): System Error::Response XML not " +
					"found for VisionDlaId->" + visionDlaKey);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to get response XML"));
		}
		DiscrepancyOutcomeHelper.sendResponseXmlFile(responseData.getResponseXml(), 
				responseData.getResponseFileName(), visionDlaKey);
	}
}
