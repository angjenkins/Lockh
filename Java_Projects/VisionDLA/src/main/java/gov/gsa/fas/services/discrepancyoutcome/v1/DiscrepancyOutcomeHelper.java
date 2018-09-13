/*
 * @(#)DiscrepancyOutcomeHelper.java			Aug 30, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.services.discrepancyoutcome.v1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.discrepancyoutcome.v1.ProcessResponse;
import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.mail.EmailNotificationEnum;
import gov.gsa.fas.vision.dla.mail.EmailNotificationManager;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistence;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;
import gov.gsa.fas.vision.dla.request.RequestXmlDataProcessor;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.response.CaseOutcomeData;
import gov.gsa.fas.vision.dla.response.ResponseXmlProcessor;
import gov.gsa.fas.vision.dla.sftp.DlaSftpAdapter;

/**
 * <code>DiscrepancyOutcomeHelper</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class DiscrepancyOutcomeHelper {
	
	static long sequence=0;
	
	private static final Logger logger = Logger.getLogger(DiscrepancyOutcomeHelper.class.getName());

	private static WsdrRequestData getWsdrRequestData(long wsdrReqId) 
			throws VisionDlaException{
		String reqXml= null;
		try {
			VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
			WsdrRequestData reqData = visionPers.getWsdrRequestXml(wsdrReqId);
			if(reqData != null){reqXml = reqData.getRequestXml();}
		} catch (VisionDlaPersistenceException e) {
			logger.error("getWsdrRequestData(): Failed to get request XML from DB " +
					"for WsdrRequest Id->" + wsdrReqId);
			throw new VisionDlaException("Failed to get request XML content");
		}
		RequestXmlDataProcessor reqXmlProc = new RequestXmlDataProcessor(reqXml);
		reqXmlProc.setIncludeDataModel(true);
		List<WsdrRequestData> reqDataList = null;
		try {
			reqDataList = reqXmlProc.processRequestXml();
		} catch (VisionDlaException e) {
			logger.error("getWsdrRequestData(): Failed to extract request Content from XML " +
					"for WsdrRequest Id->" + wsdrReqId);
		}
		WsdrRequestData wsdrData = null;
		if(reqDataList == null || reqDataList.size() == 0){
			logger.error("getWsdrRequestData(): Failed to get the request XML content " +
					"for Wsdr ReqId->" + 
					wsdrReqId);
			throw new VisionDlaException("Failed to get the request XML content");
		}
		for(WsdrRequestData wsdrReqData:reqDataList){
			if(wsdrReqData != null && wsdrReqData.getWebsdrNumber() != null){
				wsdrData = wsdrReqData;
				break;
			}
		}
		if(wsdrData == null){
			logger.error("getWsdrRequestData(): Failed to get the request XML content " +
					"for Wsdr ReqId->" + 
					wsdrReqId);
			throw new VisionDlaException("Failed to get the request XML content");
		}	
		return wsdrData;
	}
	
//	static String generateResponseXml(CaseOutcomeData caseData, 
//			WsdrRequestData wsdrReqData) throws VisionDlaException{
//		logger.info ("generateResponseXml():Generating response XML for VisionDLAKey->" + caseData.getVisionDlaKey());
//		if(wsdrReqData == null || caseData == null){
//			logger.error("generateResponseXml(): WsdrRequest data or Case data is null");
//			throw new VisionDlaException("Data not provided to generated resposne Xml");
//		}
//		wsdrReqData.setDodAacValid(isAACValid(caseData.getVisionDlaKey()));
//		ResponseXmlProcessor respXmlProcessor = new ResponseXmlProcessor(wsdrReqData, caseData);
//		String responseXml = respXmlProcessor.processResponseXml();
//		return responseXml;
//	}
	
	static String getResponseFileName() {
		String julianDate = "";
		String fileNameComponent = "";
		String fileName = "GSA_O";
		Calendar calendar = Calendar.getInstance();
		int julianDay = calendar.get(Calendar.DAY_OF_YEAR);
		julianDate = julianDay + "";
		int jdLength = julianDate.length();
		if (3 > jdLength) {
			for (int i = 0; i < (3 - jdLength); i++) {
				julianDate = '0' + julianDate;
			}
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyHHmmss");
		fileNameComponent = formatter.format(calendar.getTime());
		fileName += fileNameComponent.substring(0, 4) + julianDate
				+ fileNameComponent.substring(4);
		fileName += "_" + getSequence();
		fileName += ".xml";
		logger.info("getResponseFileName():Response File Name->" + fileName);
		return fileName;
	}
	
	private static String getSequence() {
		if (sequence == 1000) {
			sequence = 0;
		}
		sequence++;
		return String.format("%04d", sequence);
	}	
	
	private static boolean isAACValid(long visionDlaKey) throws VisionDlaException{
		try {
			VisionDlaPersistence visionDlaPers = Utility.getVisionDlaPersistenceLocal();
			return visionDlaPers.isAacValid(visionDlaKey);
		} catch (VisionDlaPersistenceException e) {
			logger.error("isAACValid(): Failed to check AAC valid", e);
			throw new VisionDlaException("Failed to check AAC valid");
		}
	}

	/**
	 * @param respXml
	 * @param respFileName
	 */
	public static boolean saveResponseStagingFile(String respXml, String respFileName) 
			throws ServiceFault{
		String stagingDir = VisionDlaConfig.getPropertyValue(ConfigConstants.RESPONSE_XML_STAGING_DIR);
		String respFilePath = stagingDir + "/" + respFileName;
		logger.info("saveResponseStagingFile(): Saving Response File to the Staging directory->" + respFilePath);
    try {
			BufferedWriter out = new BufferedWriter(new FileWriter(respFilePath));
			out.write(respXml);
			out.flush();
			out.close();
			return true;
		} catch (IOException e) {
			logger.error("saveResponseStagingFile(): Failed to save Response XML to the" +
					"Staging file->" + respFilePath, e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to save response XML to the staging directory"));
		}
	}	
	
	public static boolean sendResponseXmlFile(String respXml, String respFileName, long visionDlaId) 
			throws ServiceFault{
		boolean isSent = false;
		saveResponseStagingFile(respXml, respFileName);
		logger.info("sendResponseXmlFile(): Response file saved to the staging dirctory for DLAKey->" + visionDlaId);
		try {
			isSent = DlaSftpAdapter.sendResponseXmlFile(respFileName);
		} catch (VisionDlaException e) {
			logger.error("sendResponseXmlFile(): Failed to send response Xml file to SFTP Server for DLAKey->" + visionDlaId, e);
			throw new ServiceFault("", createFault("E", "System Error: Failed to send response Xml file to SFTP Server"));
		}

		try {
			VisionDlaPersistence visionDlaPers = Utility.getVisionDlaPersistenceLocal();
			if(isSent){
				visionDlaPers.setSentToSftpSuccess(visionDlaId);
			}else{
				visionDlaPers.setSentToSftpFailed(visionDlaId);
				notifyResponseFTPFailure("Failed to send Response Xml file to SFTP Server");
			}
		} catch (VisionDlaPersistenceException e) {
			logger.error("sendResponseXmlFile(): Failed to update VisionDLA status ->" + visionDlaId,e);
			//Don't throw exception 
		} catch (VisionDlaException e) {
			logger.error("sendResponseXmlFile(): Failed to update VisionDLA status ->" + visionDlaId,e);
		}
		DlaSftpAdapter.deleteStagingFile(VisionDlaConfig.getPropertyValue(
				ConfigConstants.RESPONSE_XML_STAGING_DIR), respFileName);
		return isSent;
	}
	
	static WsdrRequestData getVisionDlaEntry(long visionDlaKey) throws ServiceFault{
		WsdrRequestData dbVisDla=null;
		try {
			VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
			dbVisDla = visionPers.getVisionDla(visionDlaKey);
		} catch (VisionDlaException e) {
			logger.error("getVisionDlaEntry():Failed to get VisionDLA Persistence Local EJB->" + visionDlaKey, e);
			throw new ServiceFault("", createFault("E", "System Error: Failed to check DLA entry exists"));
		} catch (VisionDlaPersistenceException e) {
			logger.error("getVisionDlaEntry():Failed to check DLA entry exists->" + visionDlaKey, e);
			throw new ServiceFault("", createFault("E", "System Error: Failed to check DLA entry exists"));
		}
		if(dbVisDla == null || dbVisDla.getVisionDlaId() <= 0 || 
				dbVisDla.getWsdrRequestId() <= 0){
			logger.error("getVisionDlaEntry(): VisionDLA Entry not exists for key->" + visionDlaKey);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "VisionDLA Entry not exists"));			
		}else{
			logger.info("getVisionDlaEntry(): VisionDLA Entry exists for Key->" + visionDlaKey);
			return dbVisDla;
		}
	}
	
	static boolean createCaseOutcomeData(CaseOutcomeData caseData) throws ServiceFault{
		boolean isOutcomeCreated=false;
		boolean isStatusUpdated = false;
		try {
			VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
			isOutcomeCreated = visionPers.createCaseOutcome(caseData);
			isStatusUpdated = visionPers.updateVisionDlaCaseStatus(caseData.getVisionDlaKey(), 
					caseData.getCaseStatus());
		} catch (VisionDlaException e) {
			logger.error("createCaseOutcomeData():Failed to create VisionDLA Outcome entry->" + 
						caseData.getVisionDlaKey(), e);
			throw new ServiceFault("", createFault("E", "System Error: Failed to create VisionDLA Outcome entry"));
		} catch (VisionDlaPersistenceException e) {
			logger.error("createCaseOutcomeData():Failed to create VisionDLA Outcome entry->" + 
					caseData.getVisionDlaKey(), e);
			throw new ServiceFault("", createFault("E", "System Error: Failed to create VisionDLA Outcome entry"));
		}
		return isOutcomeCreated & isStatusUpdated;
	}
	
	static String generateResponseXml(long wsdrRequestId, CaseOutcomeData caseData) 
				throws ServiceFault{
		String respXml;
		WsdrRequestData wsdrData = null;
		try {
			wsdrData = getWsdrRequestData(wsdrRequestId);
			wsdrData.setDodAacValid(isAACValid(caseData.getVisionDlaKey()));			
			ResponseXmlProcessor respXmlProc = new ResponseXmlProcessor(wsdrData, caseData);
			respXml = respXmlProc.processResponseXml();
		} catch (VisionDlaException e) {
			logger.error("generateResponseXml(): Failed to generate Response XML", e);
			notifyResponseXMLFailure(wsdrData, e.getMessage(), e.getErrorMessage());
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", e.getMessage()));
		}
		if(respXml == null){
			logger.error("generateResponseXml(): Failed to generate Response XML");
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to generate Response XML"));
		}	
		return respXml;
	}
	
	static boolean saveResponseXml(long visionDlaId, String responseXml, String respFileName)
			throws ServiceFault{
		boolean isSaved = false;
		try {
			VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
			isSaved = visionPers.saveResponseXml(responseXml, visionDlaId, respFileName);
			logger.info("saveResponseXml(): Response XML file saved->" + isSaved);
		} catch (VisionDlaPersistenceException e) {
			logger.error("saveResponseXml(): Failed to save response Xml file in database", e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to save response Xml"));
		}	catch (VisionDlaException e) {
			logger.error("saveResponseXml(): Failed to save response Xml file in database", e);
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault("E", "Failed to save response Xml"));
		}		
		return isSaved;
	}

	static gov.gsa.fas.faults.v1.ServiceFault createFault(String code, String msg){
		gov.gsa.fas.faults.v1.ServiceFault sFault = new gov.gsa.fas.faults.v1.ServiceFault();
		sFault.setCode(code);
		sFault.setMessage(msg);
		return sFault;
	}
	
	static ProcessResponse createProcessResponse(long visionDlaKey, 
			String webSdrNumber, boolean isSuccess){
		ProcessResponse processResp = new ProcessResponse();
		processResp.setSuccessful(isSuccess);
		processResp.setVisionDlaKey(visionDlaKey);
		processResp.setWebSDRNumber(webSdrNumber);	
		return processResp;
	}
	
	static void notifyResponseXMLFailure(WsdrRequestData wsdrReqData, String message, String errorMessage) {
		EmailNotificationManager emailMgr = new EmailNotificationManager();
		try {
			if(wsdrReqData != null){
				emailMgr.setDocumentNumber(wsdrReqData.getDocumentNumber());
				emailMgr.setWebSdrNumber(wsdrReqData.getWebsdrNumber());
			}
			String errMsg = (errorMessage != null)? errorMessage:message;
			emailMgr.setErrorMessage(errMsg);
			emailMgr.sendEmail(EmailNotificationEnum.RESPONSE_GENERATION_ERROR);
		} catch (VisionDlaException e) {
			logger.error("notifyXMLProcessingFailed(): Failed send Email Notification for Response XML generation failed", e);
		}
	}
	
	static void notifyResponseFTPFailure(String errorMessage) {
		EmailNotificationManager emailMgr = new EmailNotificationManager();
		try {
			emailMgr.setErrorMessage(errorMessage);
			emailMgr.sendEmail(EmailNotificationEnum.RESPONSE_FTP_ERROR);
		} catch (VisionDlaException e) {
			logger.error("notifyResponseFTPFailure(): Failed send Email Notification for Response FTP failure", e);
		}
	}		
}
