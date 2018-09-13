/*
 * @(#)DiscrepancyOutcomeValidator.java			Sep 4, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.services.discrepancyoutcome.v1;

import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.discrepancyoutcome.v1.AdjustedQuantity;

/**
 * <code>DiscrepancyOutcomeValidator</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class DiscrepancyOutcomeValidator {

	private static final Logger logger = Logger.getLogger(DiscrepancyOutcomeValidator.class.getName());

	static boolean validateDiscrepancyOutcome(
			gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome discrOutcome) 
			throws ServiceFault{
		boolean isValid = true;
		if(discrOutcome == null) {
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Discrepancy Outcome invalid"));
		}
		if(discrOutcome.getVisionDlaKey() <=0){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "VisionDLA Key required"));
		}
		if(discrOutcome.getWebSDRNumber() == null || 
				discrOutcome.getWebSDRNumber().trim().length() == 0){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "WebSDR Number required"));
		}
		if(discrOutcome.getStatus() == null || 
				discrOutcome.getStatus().length() == 0){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Case Status required"));
		}
		validateComments(discrOutcome.getComments());
		validateAdjustedQuantity(discrOutcome.getAdjustedQuantity());
		validateAttachments(discrOutcome.getAttachmentName(), discrOutcome.getAttachmentCount());
		return isValid;
	}
	
	private static boolean validateAdjustedQuantity(AdjustedQuantity adjQty) throws ServiceFault{
		if(adjQty == null){
			return true;
		}
		if(adjQty.getQuantity() == null || adjQty.getQuantity().trim().isEmpty()){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Adjusted quantity not valid"));
		}
		if(adjQty.getUnitPrice() == null || adjQty.getUnitPrice().trim().isEmpty()){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Adjusted quantity unit price not valid"));
		}	
		if(adjQty.getUnitCode() == null || adjQty.getUnitCode().trim().isEmpty()){
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Adjusted quantity unit code not valid"));
		}
		//Checking quantity and price numeric
		try {
			Long.parseLong(adjQty.getQuantity());
		} catch (NumberFormatException e) {
			logger.error("validateDiscrepancyOutcome(): Quantity is not numeric->" + adjQty.getQuantity());
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Adjusted quantity should be numeric"));
		}
		try {
			Double.parseDouble(adjQty.getUnitPrice());
		} catch (NumberFormatException e) {
			logger.error("validateDiscrepancyOutcome(): Unit Price is not numeric->" + adjQty.getUnitPrice());
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Adjusted quantity unit price should be numeric"));
		}	
		return true;
	}
	
	/**
	 * @param attachmentName
	 * @param attachmentCount
	 */
	private static boolean validateAttachments(List<String> attachmentList,
			int attachmentCount) throws ServiceFault{
		int attCnt = (attachmentList != null) ? attachmentList.size():0;
		if(attachmentCount != attCnt){
			logger.error("validateAttachments(): Attachment List size not matching count->" + attachmentList.size());
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Attachment list size and attachment count not equal"));
		}
		return true;
	}
	
	/**
	 * @param comments
	 */
	private static void validateComments(String comments) throws ServiceFault{
		if(comments != null && comments.length() > 500){
			logger.error("validateComments(): Comments length exceeds length 500->" + comments.length());
			throw new ServiceFault("", DiscrepancyOutcomeHelper.createFault(
					"E", "Comments field exceeds 500 in length"));
		}
		
	}	
	
}
