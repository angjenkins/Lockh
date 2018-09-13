/*
 * @(#)OrderDiscrepancyOutcomeImpl.java			Aug 13, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.services.discrepancyoutcome.v1;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

import gov.gsa.fas.discrepancyoutcome.v1.Attachment;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessAttachmentRequest;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessResponse;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.response.CaseOutcomeData;
import gov.gsa.fas.vision.dla.response.CaseOutcomeDataTransformation;



/**
 * <code>OrderDiscrepancyOutcomeImpl</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */

@WebContext(contextRoot = "/dla.services", urlPattern = "/OrderDiscrepancyOutcome")
@WebService(endpointInterface = "gov.gsa.fas.services.discrepancyoutcome.v1.OrderDiscrepancyOutcome", portName = "OrderDiscrepancyOutcome", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(OrderDiscrepancyOutcome.class)
@Stateless

public class OrderDiscrepancyOutcomeImpl implements OrderDiscrepancyOutcome {
	

	private static final Logger logger = Logger.getLogger(OrderDiscrepancyOutcomeImpl.class.getName());

	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.discrepancyoutcome.v1.OrderDiscrepancyOutcome#processDiscrepancyOutcome(gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome)
	 */
	@Override
	@WebMethod
	@WebResult(name = "outcomeResponse", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", partName = "outcomeResponse")
	public ProcessResponse processDiscrepancyOutcome(
			@WebParam(name = "discrepancyOutcome", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", partName = "discrepancyOutcome") gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome discrepancyOutcome)
			throws ServiceFault {
		boolean isSuccessful = true;
		long visionDlaKey = discrepancyOutcome.getVisionDlaKey();
		String webSdrNumber = discrepancyOutcome.getWebSDRNumber();
		String caseStatus = discrepancyOutcome.getStatus();
		logger.info("processDiscrepancyOutcome(): Processing discrepancy outcome for " +
				"Vision DLA Key->" + visionDlaKey + ", Vision DLA WebSDR Number->" + webSdrNumber + 
				", Case status->" + caseStatus);
		boolean isValidated = DiscrepancyOutcomeValidator.validateDiscrepancyOutcome(discrepancyOutcome);
		logger.info("processDiscrepancyOutcome(): Discrepancy outcome data validated for DLAKey" + visionDlaKey + 
				", Success->" + isValidated);
		WsdrRequestData dbVisDla= DiscrepancyOutcomeHelper.getVisionDlaEntry(visionDlaKey);
		CaseOutcomeData caseData = CaseOutcomeDataTransformation.transformCaseOutcomeData(discrepancyOutcome);
		boolean isCaseCreated = DiscrepancyOutcomeHelper.createCaseOutcomeData(caseData);
		logger.info("processDiscrepancyOutcome():Caseoutcome data created for DLAKey" + visionDlaKey + 
				", Success->" + isCaseCreated);
		if(caseStatus != null && caseStatus.equalsIgnoreCase("IGNORED")){
			logger.info("processDiscrepancyOutcome(): Case Status is IGNORED, " +
					"so skip response XML->"+ visionDlaKey);
			return DiscrepancyOutcomeHelper.createProcessResponse(
					visionDlaKey, webSdrNumber, isSuccessful);
		}
		String respXml=DiscrepancyOutcomeHelper.generateResponseXml(dbVisDla.getWsdrRequestId(), caseData);
		String respFileName = DiscrepancyOutcomeHelper.getResponseFileName();
		boolean isRespDbSaved = DiscrepancyOutcomeHelper.saveResponseXml(visionDlaKey, respXml, respFileName);
		logger.info("processDiscrepancyOutcome(): Response file saved to the DB for DLAKey->" + visionDlaKey + 
				", Success->" + isRespDbSaved);
		if(caseData.getAttachmentCount() != 0){
			ResponseAttachmentHelper.saveAttachmentNames(caseData.getAttachmentNameList(), visionDlaKey);
			return DiscrepancyOutcomeHelper.createProcessResponse(
					visionDlaKey, webSdrNumber, isSuccessful);
		}
		boolean isSent = DiscrepancyOutcomeHelper.sendResponseXmlFile(respXml, respFileName, 
				dbVisDla.getVisionDlaId());
		logger.info("processDiscrepancyOutcome(): Response XML Sent to SFTP for DLAKey->" + visionDlaKey + 
				", Success->" + isSent);
		return DiscrepancyOutcomeHelper.createProcessResponse(
				visionDlaKey, webSdrNumber, isSuccessful);
	}
	
	/* (non-Javadoc)
	 * @see gov.gsa.fas.services.discrepancyoutcome.v1.OrderDiscrepancyOutcome#processAttachment(gov.gsa.fas.discrepancyoutcome.v1.ProcessAttachmentRequest)
	 */
	@Override
	@WebMethod
	@WebResult(name = "processAttResponse", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", partName = "processAttResponse")
	public ProcessResponse processAttachment(
			@WebParam(name = "processAttRequest", targetNamespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", partName = "processAttRequest") ProcessAttachmentRequest processAttRequest)
			throws ServiceFault {
		ResponseAttachmentHelper.validateAttachmentRequest(processAttRequest);
		boolean isSuccessful = true;
		long visionDlaKey = processAttRequest.getVisionDlaKey();
		String webSdrNumber = processAttRequest.getWebSDRNumber();	
		DiscrepancyOutcomeHelper.getVisionDlaEntry(visionDlaKey);		
		logger.info("processAttachment(): Processing Attachment for Vision DLA Key->" + 
			processAttRequest.getVisionDlaKey()+ ", Document Name->" + processAttRequest.getAttachment());
		Attachment attachment = processAttRequest.getAttachment(); 
		String documentName = attachment.getDocumentName();
		byte[] docBytes = attachment.getDocument();
		boolean isRespAttSaved = ResponseAttachmentHelper.saveAttachment(documentName, docBytes);
		logger.info("processAttachment():Attachment saved to Staging -> " + documentName + 
				", Success->" + isRespAttSaved);
		boolean isRespAttSent = false;
		if(isRespAttSaved){
			isRespAttSent = ResponseAttachmentHelper.sendResponseAttachment(documentName, visionDlaKey);
		}
		logger.info("processAttachment():Attachment sent to SFTP server -> " + documentName + 
				", Success->" + isRespAttSent);
		ResponseAttachmentHelper.checkAndSendResponseXML(visionDlaKey);
		return DiscrepancyOutcomeHelper.createProcessResponse(
				visionDlaKey, webSdrNumber, isSuccessful);
	}
}
