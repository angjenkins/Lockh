/*
 * @(#)CaseOutcomeDataTransformation.java			Aug 26, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import org.apache.log4j.Logger;

import gov.gsa.fas.discrepancyoutcome.v1.AdjustedQuantity;
import gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome;

/**
 * <code>CaseOutcomeDataTransformation</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class CaseOutcomeDataTransformation {
	
	private static final Logger logger = Logger.getLogger(CaseOutcomeDataTransformation.class.getName());	

	public static CaseOutcomeData transformCaseOutcomeData(OrderDiscrepancyOutcome discrOutcome){
		if(discrOutcome == null){
			logger.error("transformCaseOutcomeData():OrderDiscrepancyOutcome object is null");
			return null;
		}
		CaseOutcomeData caseData = new CaseOutcomeData();
		caseData.setVisionDlaKey(discrOutcome.getVisionDlaKey());
		caseData.setWebSdrNumber(discrOutcome.getWebSDRNumber());
		caseData.setTransactionPurposeCode(discrOutcome.getTransactionSetPurposeCode());
		transformAdjustedQuantity(discrOutcome.getAdjustedQuantity(), caseData);
		if(discrOutcome.getDiscrepancyCode() != null){
			caseData.setDiscrepancyCodeList(discrOutcome.getDiscrepancyCode());
		}
		if(discrOutcome.getDispositionCode() != null){
			caseData.setDispositionCodeList(discrOutcome.getDispositionCode());
		}
		caseData.setActionCode(discrOutcome.getActionCode());
		caseData.setComments(discrOutcome.getComments());
		caseData.setAttachmentCount(discrOutcome.getAttachmentCount());
		caseData.setCaseStatus(discrOutcome.getStatus());
		if(discrOutcome.getAttachmentName() != null){
			caseData.setAttachmentNameList(discrOutcome.getAttachmentName());
		}
		return caseData;
	}
	
	private static void transformAdjustedQuantity(AdjustedQuantity adjQty, 
			CaseOutcomeData caseData){
		if(adjQty == null){
			return;
		}
		if(adjQty.getQuantity() != null){
			caseData.setAdjustedQuantity(adjQty.getQuantity());
		}
		if(adjQty.getUnitCode() != null){
			caseData.setAdjustedUnitCode(adjQty.getUnitCode());
		}
		if(adjQty.getUnitPrice() != null){
			caseData.setAdjustedUnitPrice(adjQty.getUnitPrice());
		}
	}
}
