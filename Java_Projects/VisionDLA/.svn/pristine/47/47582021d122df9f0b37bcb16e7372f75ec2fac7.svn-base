/*
 * @(#)RequestProcessorJob.java			Aug 23, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.job;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>RequestProcessorJob</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class RequestProcessorJob implements Job {

	private static final Logger logger = Logger.getLogger(RequestProcessorJob.class.getName());
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info("execute(): Start--RequestProcessorJob");
		if(!isRunJob()){
			logger.info("execute():Flag set to N, skipping job");
			return;
		}
		try {
			processUnprocessedWsdrRequests();
			processWsdrAttRequests();
		} catch (Exception e) {
			logger.error("execute(): Failed--RequestProcessorJob", e);
		}
		logger.info("execute(): Completed--RequestProcessorJob");
	}
	
	private void  processUnprocessedWsdrRequests(){
		logger.info("processUnprocessedWsdrRequests(): Processing unprocessed WSDR requests");
		List<Long> unprocessedWsdrs = null;
		try {
			unprocessedWsdrs = RequestJobHelper.getUnprocessedWsdrs();
			if(unprocessedWsdrs == null || unprocessedWsdrs.size() == 0){
				logger.info("processUnprocessedWsdrRequests(): There are no WSDR Requests to process");
				return;
			}	
		} catch (VisionDlaException e2) {
			// TODO - System error for All
			logger.error("processUnprocessedWsdrRequests():Failed to get Unprocessed Wsdr Request Ids", e2);
			return;
		}
		for(long wsdrReqId : unprocessedWsdrs){
			processWsdrRequestData(wsdrReqId);
		}
	}
	
	private void processWsdrAttRequests(){
		logger.info("processWsdrAttRequests(): Processing Wsdr requests waiting for attachments");
		List<Long> receivedWsdrs = null;
		try {
			receivedWsdrs = RequestJobHelper.getReceivedWsdrs();
			if(receivedWsdrs == null || receivedWsdrs.size() == 0){
				logger.info("processWsdrAttRequests(): There are no WSDR Requests waiting for attachments");
				return;			
			}
		} catch (VisionDlaException e) {
			// TODO - System error for All
			logger.error("processWsdrAttRequests():Failed to get Received Wsdr Request Ids", e);
			return;
		}
		for(long wsdrReqId : receivedWsdrs){
			processReceivedWsdr(wsdrReqId);
		}
	}
	
	private void processWsdrRequestData(long wsdrReqId){
		WsdrRequestData wsdrReqData = null;
		try {
			List<WsdrRequestData> wsdrList = RequestJobHelper.getWsdrRequestData(wsdrReqId);
			wsdrReqData = wsdrList.get(0);
			RequestJobHelper.createVisioinDlaEntry(wsdrReqData);
			RequestJobHelper.updateWsdrStatus(wsdrReqId, "R");
			//Check for Attachment count
			if(wsdrReqData.getAttachmentCount() > 0){
				logger.info("processWsdrRequestData(): Attachments exist for WsdrReqId->"+ wsdrReqId);
				RequestJobHelper.createAttachments(wsdrReqId, wsdrReqData.getAttachmentNames());
				return;
			}
			RequestJobHelper.processValidations(wsdrReqData);
			RequestJobHelper.sendWsdrDataToSalesforce(wsdrReqData);
			RequestJobHelper.updateWsdrStatus(wsdrReqId, "S");
		} catch (VisionDlaException e) {
			logger.error("processWsdrRequestData():Failed to process Wsdr Request Id->" + wsdrReqId);
			RequestJobHelper.notifyXMLProcessingFailed(wsdrReqId, wsdrReqData, e.getMessage(), e.getErrorMessage());
			try {
				RequestJobHelper.updateWsdrStatus(wsdrReqId, "E");
			} catch (VisionDlaException e1) {
				logger.error("processWsdrRequestData(): Failed to update failed " +
						"status for Request Id->" + wsdrReqId, e1);
				// TODO - System error for that job request Id
			}
		}
	}
	
	private void processReceivedWsdr(long wsdrReqId){
		WsdrRequestData wsdrReqData = null;
		try {
			List<String> attWaiting = RequestJobHelper.getAttNamesWaiting(wsdrReqId);
			RequestJobHelper.checkAttachmentsReceived(attWaiting, wsdrReqId);
			attWaiting =  RequestJobHelper.getAttNamesWaiting(wsdrReqId);
			if(attWaiting == null || attWaiting.size() == 0){
				logger.info("processReceivedWsdr(): All attachments received for WsdrReqId->" + wsdrReqId);
				processReceivedAttWsdr(wsdrReqId);
				return;
			}
			RequestJobHelper.checkAttachmentWaitTime(wsdrReqId, attWaiting);
		} catch (VisionDlaException e) {
			logger.error("processReceivedWsdr():Failed to process Wsdr Request Id->" + wsdrReqId);
			RequestJobHelper.notifyXMLProcessingFailed(wsdrReqId, wsdrReqData, e.getMessage(), e.getErrorMessage());
			try {
				RequestJobHelper.updateWsdrStatus(wsdrReqId, "E");
			} catch (VisionDlaException e1) {
				logger.error("processWsdrRequestData(): Failed to update failed " +
						"status for Request Id->" + wsdrReqId, e1);
				// TODO - System error for that job request Id
			}
		}
	}
	
	private WsdrRequestData processReceivedAttWsdr(long wsdrReqId) throws VisionDlaException{
		List<WsdrRequestData> wsdrList = RequestJobHelper.getWsdrRequestData(wsdrReqId);
		WsdrRequestData wsdrReqData = wsdrList.get(0);	
		RequestJobHelper.getReceivedVisionDLAId(wsdrReqData);
		RequestJobHelper.resolveAttachments(wsdrReqData);
		RequestJobHelper.getAttachments(wsdrReqData.getAttachmentNames());
		RequestJobHelper.processValidations(wsdrReqData);
		RequestJobHelper.sendWsdrDataToSalesforce(wsdrReqData);
		RequestJobHelper.updateWsdrStatus(wsdrReqId, "S");
		return wsdrReqData;
	}

	private boolean isRunJob(){
		String runFlag = VisionDlaConfig.getPropertyValue(ConfigConstants.JOB_REQUEST_PROCESS);
		if(runFlag != null && runFlag.equalsIgnoreCase("N")){
			return false;
		}
		return true;
	}
	
}
