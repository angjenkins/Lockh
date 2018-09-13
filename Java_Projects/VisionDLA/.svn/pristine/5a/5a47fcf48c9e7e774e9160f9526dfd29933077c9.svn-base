/*
 * @(#)RequestJobHelper.java			Sep 12, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.mail.EmailNotificationEnum;
import gov.gsa.fas.vision.dla.mail.EmailNotificationManager;
import gov.gsa.fas.vision.dla.mf.CafAddress;
import gov.gsa.fas.vision.dla.mf.CafPortProgram;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistence;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;
import gov.gsa.fas.vision.dla.request.RequestXmlDataProcessor;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.WsdrRequestValidator;
import gov.gsa.fas.vision.dla.sf.VisionDlaRequestClient;
import gov.gsa.fas.vision.dla.sf.caserequest.DLAResponse;
import gov.gsa.fas.vision.dla.sftp.DlaSftpAdapter;

/**
 * <code>RequestJobHelper</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class RequestJobHelper {
	
	private static final Logger logger = Logger.getLogger(RequestJobHelper.class.getName());
	
	static List<Long> getUnprocessedWsdrs() throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		List<Long> unprocessedWsdrs = null;
		try {
			unprocessedWsdrs = visionDlaPers.getUnprpocessedRequestIds();
		} catch (VisionDlaPersistenceException e) {
			logger.error("getUnprocessedWsdrs(): Failed to get Unprocessed WSDR request Ids");
			throw new VisionDlaException("Failed to get unprocessed WSDRs");
		}
		return unprocessedWsdrs;
	}
	
	public static List<Long> getReceivedWsdrs() throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		List<Long> receivedWsdrs = null;
		try {
			receivedWsdrs = visionDlaPers.getReceivedRequestIds();
		} catch (VisionDlaPersistenceException e) {
			logger.error("getReceivedWsdrs(): Failed to get Received WSDR request Ids");
			throw new VisionDlaException("Failed to get Received WSDRs");
		}
		return receivedWsdrs;
	}			

	static void processValidations(WsdrRequestData wsdrReqData) throws VisionDlaException{
		logger.info("processValidations(): Validating WsdrRequest Data for " +
				"VisionDlaId->" + wsdrReqData.getVisionDlaId());
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		WsdrRequestValidator validator = new WsdrRequestValidator();
		boolean isValid=false;
		try {
			isValid = validator.validateRequestData(wsdrReqData);
		} catch (VisionDlaException e1) {
			logger.error("processValidations(): Exception occurred while conducting validations", e1);
			throw e1;
		}
		logger.info("processValidations():Is request Data valid->" + isValid);
		try {
			visionDlaPers.updateValidationStatuses(wsdrReqData);
		} catch (VisionDlaPersistenceException e) {
			logger.error("processValidations(): Failed to updated validation Statuses for " +
					"VisionDlaId->" + wsdrReqData.getVisionDlaId());
		}
		if(wsdrReqData.isDodAacValid()){
			CafPortProgram cafpgm = new CafPortProgram();
			CafAddress cafAddress = cafpgm.getAddressForAac(wsdrReqData.getSubmitterDodAAC());
			if(cafAddress != null){
				debugCafAddress(cafAddress);
				wsdrReqData.setCafAddress(cafAddress);
			}
		}		
	}
	
	static void sendWsdrDataToSalesforce(WsdrRequestData wsdrReqData) throws VisionDlaException{
		logger.info("sendWsdrDataToSalesforce():Sending WsdrRequestData to Salesforce for " +
				"VisionDLAId->" + wsdrReqData.getVisionDlaId());
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		VisionDlaRequestClient client = new VisionDlaRequestClient();
		long visionDlaId = wsdrReqData.getVisionDlaId();
		boolean isSfSuccess = false;
		boolean isSfXmlSuccess = false;
		boolean isAllAttSuccess = false;
		try {
			client.login();
			String sessonId = client.getSfSessionId();
			logger.info("sendWsdrDataToSalesforce(): Salesforce Session Id->" +  sessonId);
			DLAResponse dlaResp = client.postRequestDetails(wsdrReqData);
			String sfStagingId = null;
			if(dlaResp != null && dlaResp.getStatus().equalsIgnoreCase("Success")){
				isSfSuccess = true;
			}
			logger.info("sendWsdrDataToSalesforce():Wsdr data transmission to SF ->" + isSfSuccess);
			if (isSfSuccess) {
				DLAResponse dlaResp1 = client.postRequestAttachment(wsdrReqData, 
						wsdrReqData.getRequestFileName(), getRequestXmlContent(wsdrReqData.getRequestXml()));
				if(dlaResp1 != null && dlaResp1.getStatus().equalsIgnoreCase("Success")){
					isSfXmlSuccess = true;
				}
				logger.info("sendWsdrDataToSalesforce():Wsdr XML transmission to SF ->" + isSfXmlSuccess);
				if(wsdrReqData.getAttachmentCount() > 0){
					isAllAttSuccess = sendWsdrAttToSalesforce(client, wsdrReqData);
					logger.info("sendWsdrDataToSalesforce():Wsdr Attachments transmission to SF ->" + isAllAttSuccess);
					isSfSuccess = isSfSuccess & isSfXmlSuccess & isAllAttSuccess;
				}else{
					isSfSuccess = isSfSuccess & isSfXmlSuccess;
				}
			}
			if(dlaResp != null && dlaResp.getWSDRStagingId() != null && 
					dlaResp.getWSDRStagingId().getValue() != null){
				sfStagingId = dlaResp.getWSDRStagingId().getValue();
				logger.info("sendWsdrDataToSalesforce(): SF staging Id->" + dlaResp.getWSDRStagingId().getValue());
			}
			try {
				visionDlaPers.updateSFTransmissionStatus(visionDlaId, sfStagingId, isSfSuccess);
			} catch (VisionDlaPersistenceException e) {
				logger.error("processValidations(): Failed to update SF transmission status for " +
						"VisionDlaId->" + wsdrReqData.getVisionDlaId());
//				throw new VisionDlaException("Failed to update SF transmission status");
			}
		} catch (VisionDlaException e) {
			logger.error("sendWsdrDataToSalesforce(): Failed to send WSDR Request Data to SF->" + visionDlaId);
			try {
				visionDlaPers.updateSFTransmissionStatus(visionDlaId, null, isSfSuccess);
			} catch (VisionDlaPersistenceException e1) {
				logger.error("processValidations(): Failed to update SF transmission status for " +
						"VisionDlaId->" + wsdrReqData.getVisionDlaId());
			}
			return;
		}		
	}	

	static List<WsdrRequestData> getWsdrRequestData(long wsdrReqId) throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		logger.info("processWsdrRequest(): Processing WsdrRequestId->" + wsdrReqId);
		String reqXml = null;
		String reqFileName = null;
		try {
			WsdrRequestData wsdrReqData = visionDlaPers.getWsdrRequestXml(wsdrReqId);
			if(wsdrReqData != null){
				reqXml = wsdrReqData.getRequestXml();
				reqFileName = wsdrReqData.getRequestFileName();
			}
		} catch (VisionDlaPersistenceException e1) {
			logger.error("processWsdrRequest(): Failed to get Request XML for Req Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to get Request XML");
		}
		if(reqXml == null || reqXml.length() == 0){
			logger.error("processWsdrRequest(): Failed to get Request XML for Req Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to get Request XML");
		}
		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(reqXml);
		List<WsdrRequestData> wsdrList = null;
		try {
			wsdrList = reqXmlProcessor.processRequestXml();
		} catch (VisionDlaException e) {
			logger.error("processWsdrRequest(): Failed to transform Request XML for Wsdr Req Id->" + wsdrReqId);
			throw e;
		}	
		if(wsdrList == null || wsdrList.size() == 0){
			logger.error("processWsdrRequest(): WSDRRequest Data list is empty");
			throw new VisionDlaException("Failed to process Request XML");
		}
		for(WsdrRequestData wsdrData:wsdrList){
			wsdrData.setWsdrRequestId(wsdrReqId);
			wsdrData.setRequestXml(reqXml);
			wsdrData.setRequestFileName(reqFileName);
		}	
		return wsdrList;
	}
	
	static long createVisioinDlaEntry(WsdrRequestData wsdrReqData) throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		boolean isVisionKeyCreated = false;
		long visionDlaKey;
		try {
			isVisionKeyCreated = visionDlaPers.createVisionDla(wsdrReqData);
		} catch (VisionDlaPersistenceException e) {
			logger.error("createVisioinDlaEntry(): Failed to persist the Vision DLA Data for " +
					"WSDR Req Id->" + wsdrReqData.getWsdrRequestId(), e);
			throw new VisionDlaException("Failed to create VisionDlaEntry");
		}
		if(!isVisionKeyCreated){
			logger.error("createVisioinDlaEntry(): Failed to created Vision DLA Key for " +
					"WSDR Req Id->" + wsdrReqData.getWsdrRequestId());
			throw new VisionDlaException("Failed to create VisionDlaEntry");
		}
		try {
			visionDlaKey = visionDlaPers.getReceivedVisionDlaId(wsdrReqData);
		} catch (VisionDlaPersistenceException e) {
			logger.error("createVisioinDlaEntry(): Failed to get Vision DLA Id for " +
					"WsdrReqId->" + wsdrReqData.getWsdrRequestId());
			throw new VisionDlaException("Failed to create VisionDlaEntry");
		}
		if(visionDlaKey < 0){
			logger.error("createVisioinDlaEntry(): Failed to get Vision DLA Id for " +
					"WsdrReqId->" + wsdrReqData.getWsdrRequestId());
			throw new VisionDlaException("Failed to create VisionDlaEntry");
		}
		wsdrReqData.setVisionDlaId(visionDlaKey);
		return visionDlaKey;
	}
	
	static void updateWsdrStatus(long wsdrReqId, String status) throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			visionDlaPers.updateWsdrStatus(wsdrReqId, status);
		} catch (VisionDlaPersistenceException e) {
			logger.error("updateWsdrStatus():Failed to update WSDR Status");
			throw new VisionDlaException("Failed to update WSDR Status");
		}
	}
	
	
	private static byte[] getRequestXmlContent(String requestXml) {
		return requestXml.getBytes();
	}	
	
	private static void debugCafAddress(CafAddress cafAddr){
		System.out.println("Caf Agency Code->" + cafAddr.getAgencyCode());
		System.out.println("Caf Agency Name->" + cafAddr.getAgencyName());
		System.out.println("Caf Address1->" + cafAddr.getAddressLine1());
		System.out.println("Caf Address2->" + cafAddr.getAddressLine2());
		System.out.println("Caf Address3->" + cafAddr.getAddressLine3());
		System.out.println("Caf City->" + cafAddr.getCity());
		System.out.println("Caf State->" + cafAddr.getStateCode());
		System.out.println("Caf Zip->" + cafAddr.getZipCode());
		System.out.println("Caf Phone->" + cafAddr.getCommPhone());
		System.out.println("Caf Const Code->" + cafAddr.getConstCode());
		System.out.println("Caf Dsn Phone->" + cafAddr.getDsnPhone());
	}

	public static void createAttachments(long wsdrReqId,
			List<String> attachmentNames) throws VisionDlaException{
		logger.info("createAttachments(): Creating attachment names in the database for WsdrRequestId->" + wsdrReqId +
				", Attachments->" + attachmentNames);
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			visionDlaPers.createRequestAttNames(attachmentNames, wsdrReqId);
		} catch (VisionDlaPersistenceException e) {
			logger.error("createAttachments(): Failed to create attachment names " +
					"for Wsdr Request Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to create attachment names");
		}
	}

	public static List<String> getAttNamesWaiting(long wsdrReqId) 
			throws VisionDlaException{
		logger.info("getAttNamesWaiting():Checking for attachments received for " +
				"Wsdr Request Id->" + wsdrReqId);
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			List<String> attNamesList = visionDlaPers.getAttNamesWaiting(wsdrReqId);
			if(attNamesList == null){
				return null;
			}
			for(String attName : attNamesList){
				logger.info("getAttNamesWaiting():Attachment name for waiting->" + attName);
			}
			return attNamesList;
		} catch (VisionDlaPersistenceException e) {
			logger.info("getAttNamesWaiting(): Failed to get attachments waiting " +
					" for Request Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to get Attachments waiting list");
		}
	}
	
	public static List<String> getAttNamesReceived(long wsdrReqId) 
			throws VisionDlaException{
		logger.info("getAttNamesReceived(): Getting attachments received for " +
				"Wsdr Request Id->" + wsdrReqId);
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			List<String> attNamesList = visionDlaPers.getAttNamesReceived(wsdrReqId);
			if(attNamesList == null){
				return null;
			}
			for(String attName : attNamesList){
				logger.info("getAttNamesReceived():Attachment name received->" + attName);
			}
			return attNamesList;
		} catch (VisionDlaPersistenceException e) {
			logger.info("getAttNamesReceived(): Failed to get attachments received " +
					" for Request Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to get Attachments Received list");
		}
	}	

	public static void getReceivedVisionDLAId(WsdrRequestData wsdrReqData) throws VisionDlaException{
		long visionDlaKey;
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			visionDlaKey = visionDlaPers.getReceivedVisionDlaId(wsdrReqData);
		} catch (VisionDlaPersistenceException e) {
			logger.error("getReceivedVisionDLAId(): Failed to get Vision DLA Id for " +
					"WsdrReqId->" + wsdrReqData.getWsdrRequestId());
			throw new VisionDlaException("Failed to get Vision DLA Id");
		}
		wsdrReqData.setVisionDlaId(visionDlaKey);
	}

	public static void getAttachments(List<String> attachmentNames) throws VisionDlaException{
		if(attachmentNames == null || attachmentNames.size() == 0){
			logger.info("getAttachments(): Getting Attachments list is empty");
			return;
		}
		List<String> attFtpFiles = DlaSftpAdapter.getRequestAttFileNames();
		if(attFtpFiles == null || attFtpFiles.size() == 0){
			logger.info("getAttachments(): SFTP Attachments directory is empty");
			return;
		}
		List<String> filesToGet = new ArrayList<String>();
		for(String attFile:attFtpFiles){
			attachmentNames.contains(attFile);
			filesToGet.add(attFile);
		}
		if(filesToGet.size() > 0){
			DlaSftpAdapter.getRequestAttFiles(filesToGet);
		}
	}

	public static void checkAttachmentsReceived(List<String> attWaiting, long wsdrReqId) 
				throws VisionDlaException{
		if(attWaiting == null || attWaiting.size() == 0){
			logger.info("checkAttachmentsReceived(): Attachments check list is empty");
			return;
		}
		List<String> attFtpFiles = DlaSftpAdapter.getRequestAttFileNames();
		if(attFtpFiles == null || attFtpFiles.size() == 0){
			logger.info("checkAttachmentsReceived(): SFTP Attachments directory is empty");
			return;
		}
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		for(String attFile:attFtpFiles){
			if(!attWaiting.contains(attFile)){continue;}
			try {
				visionDlaPers.updateRequestAttStatus(wsdrReqId, attFile, "R");
			} catch (VisionDlaPersistenceException e) {
				logger.error("checkAttachmentsReceived(): Failed to update Attachment " +
						"Received Status->" + wsdrReqId + ", File Name->" + attFile);
				throw new VisionDlaException("Failed to update attachment status as Received");
			}
		}
	}
	
	public static void checkAttachmentWaitTime(long wsdrReqId, List<String> attWaiting) throws VisionDlaException{
		int waitMts = VisionDlaConfig.getPropertyNumericValue(ConfigConstants.REQUEST_ATT_WAIT_MINUTES);
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		try {
			Date reqCreatedDate = visionDlaPers.getWsdrRequestCratedDate(wsdrReqId);
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.MINUTE, -waitMts);
			Date waitMaxTime= cal.getTime();
			if(waitMaxTime.compareTo(reqCreatedDate) > 0){
				logger.info("checkAttachmentWaitTime(): Request Attachments wait time elapsed->" + waitMts + 
						" for ->" + wsdrReqId);
				for(String attFile : attWaiting){
					visionDlaPers.updateRequestAttStatus(wsdrReqId, attFile, "E");
				}
			}
		} catch (VisionDlaPersistenceException e) {
			logger.error("checkAttachmentWaitTime(): Failed to check Attachements wait time for ->" + wsdrReqId);
			throw new VisionDlaException("Failed to check attachment wait time", e);
		}
	}	

	private static boolean sendWsdrAttToSalesforce(VisionDlaRequestClient client, 
			WsdrRequestData wsdrReqData) throws VisionDlaException{
		VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
		boolean isAllAttSent = true;
		logger.info("sendWsdrAttToSalesforce(): Sending Attachments to Salesfroce for " +
				"Request Id->" + wsdrReqData.getWsdrRequestId());
		List<String> attNames = wsdrReqData.getAttachmentNames();
		for(String attName:attNames){
			DLAResponse dlaResp = client.postRequestAttachment(wsdrReqData, 
					attName, getAttachmentContent(attName));
			try {
				if(dlaResp != null && dlaResp.getStatus().equalsIgnoreCase("Success")){
					logger.info("sendWsdrAttToSalesforce(): Attachment sent successfully->" + attName);
					visionDlaPers.updateRequestAttStatus(wsdrReqData.getWsdrRequestId(), attName, "S");
					DlaSftpAdapter.archiveRequestAttachmentFile(attName);
				}else{
					isAllAttSent = false;
					visionDlaPers.updateRequestAttStatus(wsdrReqData.getWsdrRequestId(), attName, "E");
				}
			} catch (VisionDlaPersistenceException e) {
				logger.error("sendWsdrAttToSalesforce(): Failed to update Request Attachemnt status->" + attName);
				//Don't throw
			}
			DlaSftpAdapter.deleteStagingFile(VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_ATT_STAGING_DIR), 
					attName);
		}
		return isAllAttSent;
	}
	
	private static byte[] getAttachmentContent(String attName) throws VisionDlaException{
		String fileStagingdir = VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_ATT_STAGING_DIR);
		File attFile = new File(fileStagingdir + File.separator + attName);
    byte[] attContent = new byte[(int) attFile.length()];
    FileInputStream fileInputStream = null;
    try {
    	fileInputStream = new FileInputStream(attFile);
    	fileInputStream.read(attContent);
    } catch (FileNotFoundException e) {
    	logger.error("getAttachmentContent(): Attachment File Not Found->" + 
    			fileStagingdir + File.separator + attName);
    	throw new VisionDlaException("Attachment File " + attName + " Not Found");
    }catch (IOException e1) {
    	logger.error("getAttachmentContent(): Error Reading Attachment File->" + 
    			fileStagingdir + File.separator + attName);
    	throw new VisionDlaException("Failed to read Attachment File " + attName);
    }finally{
    	try {
    		if(fileInputStream != null){
    			fileInputStream.close();
    		}
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
		return attContent;
	}	
	
	static void notifyXMLProcessingFailed(long wsdrReqId, WsdrRequestData wsdrReqData, 
			String message, String errorMessage) {
		EmailNotificationManager emailMgr = new EmailNotificationManager();
		try {
			if(wsdrReqData == null){
				VisionDlaPersistence  visionDlaPers = Utility.getVisionDlaPersistenceLocal();
				WsdrRequestData wsdrData = visionDlaPers.getWsdrRequestXml(wsdrReqId);
				if(wsdrData != null){
					emailMgr.setFileName(wsdrData.getRequestFileName());
					emailMgr.setXmlData(wsdrData.getRequestXml());
				}
			}
			if(wsdrReqData != null){
				emailMgr.setDocumentNumber(wsdrReqData.getDocumentNumber());
				emailMgr.setWebSdrNumber(wsdrReqData.getWebsdrNumber());
				emailMgr.setFileName(wsdrReqData.getRequestFileName());
				emailMgr.setXmlData(wsdrReqData.getRequestXml());
			}
			String errMsg = (errorMessage != null)? errorMessage:message;
			emailMgr.setErrorMessage(errMsg);
			emailMgr.sendEmail(EmailNotificationEnum.REQUEST_XML_PROCESS_FAILED);
		} catch (VisionDlaException e) {
			logger.error("notifyXMLProcessingFailed(): Failed send Email Notification for XML process failed", e);
		} catch (VisionDlaPersistenceException e) {
			logger.error("notifyXMLProcessingFailed(): Failed send Email Notification for XML process failed", e);
		}
	}


	public static void resolveAttachments(WsdrRequestData wsdrReqData) throws VisionDlaException{
		List<String> attNamesReceived = getAttNamesReceived(wsdrReqData.getWsdrRequestId());
		int attReceivedCnt = (attNamesReceived != null) ? attNamesReceived.size() : 0;
		if(attReceivedCnt != wsdrReqData.getAttachmentCount()){
			String attMissingCmt = "Attachments were specified in the WSDR record. However, they have not been received. " +
					"Please contact the originator and request that they resend the WSDR as a correction " +
					"if necessary to aid in processing of this WSDR.";
			wsdrReqData.addRemarks(attMissingCmt);
		}
		//Send what ever received to Salesforce with comment
		wsdrReqData.setAttachmentNames(attNamesReceived);
		wsdrReqData.setAttachmentCount(attReceivedCnt);
	}
}
