/*
 * @(#)VisionDlaPersistence.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.List;

import gov.gsa.fas.vision.dla.mail.EmailNotification;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.response.CaseOutcomeData;


/**
 * <code>VisionDlaPersistence</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */

public interface VisionDlaPersistence {

	public boolean saveRequestXml(String stagingDir, String reqXmlFileName) 
			throws VisionDlaPersistenceException;
	
	public List<Long> getUnprpocessedRequestIds() 
			throws VisionDlaPersistenceException;
	
	public List<Long> getReceivedRequestIds() 
			throws VisionDlaPersistenceException;	
	
	public WsdrRequestData getWsdrRequestXml(long wsdrReqId)
			 throws VisionDlaPersistenceException;
	
	public java.util.Date getWsdrRequestCratedDate(long wsdrReqId)
			 throws VisionDlaPersistenceException;	
	
	public boolean createVisionDla(WsdrRequestData wsdrReqData) 
			throws VisionDlaPersistenceException;	
	
	public boolean updateWsdrStatus(long wsdrReqId, String status) 
			throws VisionDlaPersistenceException;
	
	public long getReceivedVisionDlaId(WsdrRequestData wsdrReqData) 
			throws VisionDlaPersistenceException;

	public boolean updateValidationStatuses(WsdrRequestData wsdrReqData)
			throws VisionDlaPersistenceException;

	public boolean updateSFTransmissionStatus(long visionDlaId,
			String wsdrStagingId, boolean isSfSuccess)throws VisionDlaPersistenceException;
	
	public boolean createCaseOutcome(CaseOutcomeData caseData) 
			throws VisionDlaPersistenceException;
	
	public WsdrRequestData getVisionDla(long visionDlaId)	
			throws VisionDlaPersistenceException;
	
	public boolean updateVisionDlaCaseStatus(long visionDlaId, String caseStatus)
			throws VisionDlaPersistenceException;
	
	public boolean saveResponseXml(String respXml, long visionDlaId, String respFileName) 
			throws VisionDlaPersistenceException;
	
	public ResponseData getResponseXml(long visionDlaId) 
			throws VisionDlaPersistenceException;
	
	public boolean isAacValid(long visionDlaKey)	
			throws VisionDlaPersistenceException;
	
	public int createResponseAttNames(List<String> attachmentNameList,
			long visionDlaKey) throws VisionDlaPersistenceException;
	
	public boolean setSentToSftpSuccess(long visionDlaId) 
			throws VisionDlaPersistenceException;
	
	public boolean setSentToSftpFailed(long visionDlaId) 
			throws VisionDlaPersistenceException;	
	
	public boolean isAllResponseAttSent(long visionDlaId) 
			throws VisionDlaPersistenceException;
	
	public boolean setResponseAttReceived(long visionDlaId, String fileName)
			throws VisionDlaPersistenceException;	
	
	public boolean setResponseAttSent(long visionDlaId, String fileName)
			throws VisionDlaPersistenceException;
	
	public boolean setResponseAttSendFailed(long visionDlaId, String fileName)
			throws VisionDlaPersistenceException;

	public void createRequestAttNames(List<String> attachmentNames, long wsdrReqId)
			throws VisionDlaPersistenceException;

	public List<String> getAttNamesWaiting(long wsdrReqId) 
			throws VisionDlaPersistenceException;
	
	public List<String> getAttNamesReceived(long wsdrReqId) 
			throws VisionDlaPersistenceException;

	public boolean updateRequestAttStatus(long wsdrReqId, String attFile, String status)
			throws VisionDlaPersistenceException;
	
	public EmailNotification getEmailNotification(int notitifcationId) 
			throws VisionDlaPersistenceException;
		
}
