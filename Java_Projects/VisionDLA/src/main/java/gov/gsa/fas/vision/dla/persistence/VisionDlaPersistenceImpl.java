/*
 * @(#)VisionDlaPersistenceImpl.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.List;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.mail.EmailNotification;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.response.CaseOutcomeData;

/**
 * <code>VisionDlaPersistenceImpl</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
@Stateless
public class VisionDlaPersistenceImpl extends BaseDao implements
									VisionDlaPersistence{
	private static Logger logger = Logger.getLogger(VisionDlaPersistenceImpl.class);
	
	
	public boolean saveRequestXml(String stagingDir, String reqXmlFileName) 
			throws VisionDlaPersistenceException{
		logger.info("saveRequestXml(): Saving request Xml file->" + reqXmlFileName);
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		int insertCnt = wsdrReqDao.creteWsdrRequest(reqXmlFileName, stagingDir);
		if(insertCnt > 0){return true;}
		return false;
	}
	
	public List<Long> getUnprpocessedRequestIds() 
							throws VisionDlaPersistenceException{
		logger.info("getUnprpocessedRequestIds():Getting all unprocessed Request Ids");
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		List<Long> wsdrReqIds = wsdrReqDao.retreieveWsdrReqIdsByStatus("C");
		return wsdrReqIds;
	}
	
	public List<Long> getReceivedRequestIds() 
			throws VisionDlaPersistenceException{
		logger.info("getUnprpocessedRequestIds():Getting all received Request Ids");
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		List<Long> wsdrReqIds = wsdrReqDao.retreieveWsdrReqIdsByStatus("R");
		return wsdrReqIds;
	}	
	
	public WsdrRequestData getWsdrRequestXml(long wsdrReqId)
							 throws VisionDlaPersistenceException{
		logger.info("getWsdrRequestXml():Getting Wsdr Request Xml for Wsdr Req Id->" + wsdrReqId);
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		WsdrRequestData wsdrReqData = wsdrReqDao.retrieveRequestXml(wsdrReqId);
		return wsdrReqData;		
	}
	
	public java.util.Date getWsdrRequestCratedDate(long wsdrReqId)
			 throws VisionDlaPersistenceException{
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		return wsdrReqDao.retrieveCreatedDate(wsdrReqId);
	}
	
	public boolean createVisionDla(WsdrRequestData wsdrReqData) 
			throws VisionDlaPersistenceException{
		logger.info("createVisionDla():Creating VisionDLA entry for Document Number->" + wsdrReqData.getDocumentNumber());
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int insertCnt = visionDlaDao.createVisionDla(wsdrReqData);
		if(insertCnt > 0){return true;}
		return false;		
	}
	
	public long getReceivedVisionDlaId(WsdrRequestData wsdrReqData) throws VisionDlaPersistenceException{
		logger.info("getWsdrRequestXml():Getting VisionDLA Id for " +
				"WsdrRequestId->" + wsdrReqData.getWsdrRequestId());
		long visionDlaId = -1;
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		List<Long> visionDlaIds = visionDlaDao.retrieveVisionDlaId(wsdrReqData.getWsdrRequestId(), 
				wsdrReqData.getWebsdrNumber(), DlaStatusEnum.REQUEST_RECEIVED.statusId());
		if(visionDlaIds != null && visionDlaIds.size() > 0){
			return visionDlaIds.get(0);
		}
		return visionDlaId;
	}
	
	public boolean updateValidationStatuses(WsdrRequestData wsdrReqData)
			throws VisionDlaPersistenceException{
		logger.info("updateValidationStatuses(): Updating Validation Statuses for Vision DLA Id->" + 
			wsdrReqData.getVisionDlaId() + ", Requisition Valid->" + wsdrReqData.isDocumentNumberValid() + 
			", DOD AAC valid->" + wsdrReqData.isDodAacValid());
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updCnt = visionDlaDao.updateValidationStatuses(wsdrReqData.getVisionDlaId(), 
				wsdrReqData.isDocumentNumberValid(), wsdrReqData.isDodAacValid());
		if(updCnt > 0){
			return true;
		}
		return false;
	}
	
	public boolean updateSFTransmissionStatus(long visionDlaId,
			String sfStagingId, boolean isSfSuccess) throws VisionDlaPersistenceException{
		logger.info("updateSFTransmissionStatus(): Updating SF Transmission status for Vision DLA Id->" + 
				visionDlaId + ", SF stagin Id->" + sfStagingId + ", is Succcess->" + isSfSuccess);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int sfStatusId = (isSfSuccess)?DlaStatusEnum.REQUEST_SENT_SF.statusId():
			DlaStatusEnum.REQUEST_SEND_SF_FAILED.statusId();
		int updCnt = visionDlaDao.updateSfStatus(visionDlaId, sfStagingId, sfStatusId);
//		if(isSfSuccess){
//			WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
//			wsdrReqDao.updateWsdrRequestStatus(wsdrReqId, "S");
//		}
		if(updCnt > 0){
			return true;
		}
		return false;
	}
	
	public boolean setSchemaErrorStatus(long wsdrReqId)
			throws VisionDlaPersistenceException{
		logger.info("setSchemaErrorStatus(): Setting Error Status for WsdrRequestId ->" + wsdrReqId);
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		int updCnt = wsdrReqDao.updateWsdrRequestStatus(wsdrReqId, "E");
		if(updCnt > 0) {return true;}
		return false;		
	}
	
	public boolean updateWsdrStatus(long wsdrReqId, String status) 
			throws VisionDlaPersistenceException{
		logger.info("setReceivedStatus(): Updating WsdrRequest Status for WsdrRequestId->" + wsdrReqId +
				", Status->" + status);
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		int updCnt = wsdrReqDao.updateWsdrRequestStatus(wsdrReqId, status);
		if(updCnt > 0) {return true;}
		return false;
	}
	
	public boolean createCaseOutcome(CaseOutcomeData caseData) 
			throws VisionDlaPersistenceException{
		logger.info("createCaseOutcome():Creating CaseOutcome entry for VisionDlaKey->" + caseData.getVisionDlaKey());
		CaseOutcomeDao caseDao = new CaseOutcomeDao();
		int insertCnt = caseDao.createCaseOutcome(caseData);
		if(insertCnt > 0){return true;}
		return false;		
	}
	
	public WsdrRequestData getVisionDla(long visionDlaKey)	throws VisionDlaPersistenceException{
		logger.info("createCaseOutcome():Checking Vision DLA entry for VisionDlaKey->" + visionDlaKey);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		WsdrRequestData wsdrReqData = visionDlaDao.retrieveVisionDlaById(visionDlaKey);
		if(wsdrReqData != null){return wsdrReqData;}
		return null;		
	}
	
	public boolean updateVisionDlaCaseStatus(long visionDlaId, String caseStatus)
			throws VisionDlaPersistenceException{
		logger.info("updateVisionDlaCaseStatus():Updating Vision Dla case status->" + 
			caseStatus + " for VisionDla Key->" + visionDlaId);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updCnt = visionDlaDao.updateCaseStatus(visionDlaId, caseStatus,
				DlaStatusEnum.RESPONSE_RECEIVED.statusId());
		if(updCnt > 0) return true;
		return false;
	}
	
	public boolean saveResponseXml(String respXml, long visionDlaId, String respFileName) 
			throws VisionDlaPersistenceException{
		logger.info("saveResponseXml(): Saving response Xml->" + respXml);
		WsdrResponseDao wsdrRespDao = new WsdrResponseDao();
		int insertCnt = wsdrRespDao.creteWsdrResponse(respXml, visionDlaId, respFileName);
		if(insertCnt > 0){return true;}
		return false;
	}
	
	public boolean isAacValid(long visionDlaKey)	throws VisionDlaPersistenceException{
		logger.info("createCaseOutcome():Checking Vision DLA entry for VisionDlaKey->" + visionDlaKey);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		String aacValidStr = visionDlaDao.retrieveAACValidStatus(visionDlaKey);
		if(aacValidStr != null && aacValidStr.equalsIgnoreCase("Y")){return true;}
		return false;		
	}	
	
	public boolean setSentToSFStatus(long wsdrReqId, long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("setSentToSFStatus(): Setting Sent Status for WsdrRequestId ->" + wsdrReqId);
		WsdrRequestDao wsdrReqDao = new WsdrRequestDao();
		int updReqCnt = wsdrReqDao.updateWsdrRequestStatus(wsdrReqId, "S");
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updDlaCnt = visionDlaDao.updateVisionDlaStatusByDlaId(visionDlaId, DlaStatusEnum.REQUEST_SENT_SF.statusId());
		if(updReqCnt > 0 && updDlaCnt > 0) {return true;}
		return false;
	}	
	
	public boolean setSentToSFFailed(long visionDlaId) 
		throws VisionDlaPersistenceException{
		logger.info("setSentToSFFailed():Setting SF Sent Failed satus for VisionDla Id->" + visionDlaId);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updDlaCnt = visionDlaDao.updateVisionDlaStatusByDlaId(visionDlaId, DlaStatusEnum.REQUEST_SEND_SF_FAILED.statusId());
		if(updDlaCnt > 0) {return true;}
		return false;
	}
	
	public boolean setSentToSftpSuccess(long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("setSentToSftpSuccess():Setting SFTP Sent Successful satus for VisionDla Id->" + visionDlaId);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updDlaCnt = visionDlaDao.updateVisionDlaStatusByDlaId(visionDlaId, DlaStatusEnum.RESPONSE_SENT_DLA.statusId());
		WsdrResponseDao wsdrRespDao = new WsdrResponseDao();
		int updRespCnt = wsdrRespDao.updateResponseStatusByDlaId(visionDlaId, "S");
		if(updDlaCnt > 0 & updRespCnt >0) {return true;}
		return false;
	}	
	
	public boolean setSentToSftpFailed(long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("setSentToSftpFailed():Setting SF Sent Failed satus for VisionDla Id->" + visionDlaId);
		VisionDlaDao visionDlaDao = new VisionDlaDao();
		int updDlaCnt = visionDlaDao.updateVisionDlaStatusByDlaId(visionDlaId, DlaStatusEnum.RESPONSE_SEND_DLA_FAILED.statusId());
		WsdrResponseDao wsdrRespDao = new WsdrResponseDao();
		int updRespCnt = wsdrRespDao.updateResponseStatusByDlaId(visionDlaId, "E");
		if(updDlaCnt > 0 & updRespCnt >0) {return true;}
		if(updDlaCnt > 0) {return true;}
		return false;
	}

	public int createResponseAttNames(List<String> attachmentNameList,
			long visionDlaId) throws VisionDlaPersistenceException {
		logger.info("createAttachmentNames(): Creating attachment names for " +
				"Vision DLA Key->" + visionDlaId);
		WsdrResponseDao respDao = new WsdrResponseDao();
		long wsdrRespId = respDao.retrieveResponseIdByDlaId(visionDlaId);
		logger.info("createAttachmentNames(): Response Id->" + wsdrRespId);
		if(wsdrRespId <= 0){
			throw new VisionDlaPersistenceException("Failed to get Resposne Id");
		}
		for(String attName : attachmentNameList){
			respDao.createResponseAttachment(wsdrRespId, attName);
		}
		return attachmentNameList.size();
	}
	
	public boolean setResponseAttReceived(long visionDlaId, String fileName)
		throws VisionDlaPersistenceException{
		WsdrResponseDao respDao = new WsdrResponseDao();
		long wsdrRespId = respDao.retrieveResponseIdByDlaId(visionDlaId);
		if(wsdrRespId <= 0){
			throw new VisionDlaPersistenceException("Failed to get Resposne Id");
		}
		respDao.updateRespAttStatusByRespId(wsdrRespId, fileName, "R");
		return true;
	}

	public ResponseData getResponseXml(long visionDlaId)
			throws VisionDlaPersistenceException {
		logger.info("getResponseXml():Getting Wsdr Response Xml for VisionDlaId->" + visionDlaId);
		WsdrResponseDao wsdrRespDao = new WsdrResponseDao();
		ResponseData respData = wsdrRespDao.retrieveResponseXml(visionDlaId);
		return respData;	
	}
	
	public boolean setResponseAttSent(long visionDlaId, String fileName)
			throws VisionDlaPersistenceException{
		WsdrResponseDao respDao = new WsdrResponseDao();
		long wsdrRespId = respDao.retrieveResponseIdByDlaId(visionDlaId);
		if(wsdrRespId <= 0){
			throw new VisionDlaPersistenceException("Failed to get Resposne Id");
		}
		respDao.updateRespAttStatusByRespId(wsdrRespId, fileName, "S");
		return true;		
	}
	
	public boolean setResponseAttSendFailed(long visionDlaId, String fileName)
			throws VisionDlaPersistenceException{
		WsdrResponseDao respDao = new WsdrResponseDao();
		long wsdrRespId = respDao.retrieveResponseIdByDlaId(visionDlaId);
		if(wsdrRespId <= 0){
			throw new VisionDlaPersistenceException("Failed to get Resposne Id");
		}
		respDao.updateRespAttStatusByRespId(wsdrRespId, fileName, "E");
		return true;	
	}
	
	public boolean isAllResponseAttSent(long visionDlaId) 
				throws VisionDlaPersistenceException{
		WsdrResponseDao respDao = new WsdrResponseDao();
		long wsdrRespId = respDao.retrieveResponseIdByDlaId(visionDlaId);
		if(wsdrRespId <= 0){
			throw new VisionDlaPersistenceException("Failed to get Resposne Id");
		}
		List<String> listAtt = respDao.retrieveAttachmentsNotSent(wsdrRespId);
		if(listAtt == null || listAtt.size() == 0){
			logger.info("isAllResponseAttSent(): All response attachments sent for DLA Id->" + visionDlaId);
			return true;
		}
		logger.info("isAllResponseAttSent():Attachments not sent->" + listAtt.size());
		return false;
	}
	
	public void createRequestAttNames(List<String> attachmentNames, long wsdrReqId)
			throws VisionDlaPersistenceException{
		WsdrRequestDao reqDao = new WsdrRequestDao();
		for(String attName: attachmentNames){
			reqDao.createRequestAttachment(wsdrReqId, attName);
		}
	}
	
	public List<String> getAttNamesWaiting(long wsdrReqId) 
			throws VisionDlaPersistenceException{
		WsdrRequestDao reqDao = new WsdrRequestDao();
		List<String> attNames = reqDao.retrieveWaitingAttachments(wsdrReqId);
		return attNames;
	}
	
	
	public List<String> getAttNamesReceived(long wsdrReqId) 
			throws VisionDlaPersistenceException{
		WsdrRequestDao reqDao = new WsdrRequestDao();
		List<String> attNames = reqDao.retrieveReceivedAttachments(wsdrReqId);
		return attNames;
	}	
	
	public boolean updateRequestAttStatus(long wsdrReqId, String attFile, String status)
			throws VisionDlaPersistenceException{
		WsdrRequestDao reqDao = new WsdrRequestDao();
		int updCnt = reqDao.updateReqAttachmentStatus(wsdrReqId, attFile, status);
		return updCnt > 0;		
	}
	
	public EmailNotification getEmailNotification(int notificationId) 
			throws VisionDlaPersistenceException{
		EmailNotificationDao emailDao = new EmailNotificationDao();
		return emailDao.retrieveEmailNotification(notificationId);
	}
}
