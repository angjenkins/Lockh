/*
 * @(#)CaseOutcomeData.java			Aug 26, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.util.List;

/**
 * <code>CaseOutcomeData</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class CaseOutcomeData {
	
	private long visionDlaKey;
	private String webSdrNumber;
	private String adjustedQuantity;
	private String adjustedUnitCode;
	private String adjustedUnitPrice;
	private String transactionPurposeCode;
	private List<String> discrepancyCodeList;
	private List<String> dispositionCodeList;
	private String actionCode;
	private String comments;
	private int attachmentCount;
	private String caseStatus;
	private List<String> attachmentNameList;
	
	/**
	 * @return the visionDlaKey
	 */
	public long getVisionDlaKey() {
		return visionDlaKey;
	}
	/**
	 * @param visionDlaKey the visionDlaKey to set
	 */
	public void setVisionDlaKey(long visionDlaKey) {
		this.visionDlaKey = visionDlaKey;
	}
	/**
	 * @return the webSdrNumber
	 */
	public String getWebSdrNumber() {
		return webSdrNumber;
	}
	/**
	 * @param webSdrNumber the webSdrNumber to set
	 */
	public void setWebSdrNumber(String webSdrNumber) {
		this.webSdrNumber = webSdrNumber;
	}
	/**
	 * @return the adjustedQuantity
	 */
	public String getAdjustedQuantity() {
		return adjustedQuantity;
	}
	/**
	 * @param adjustedQuantity the adjustedQuantity to set
	 */
	public void setAdjustedQuantity(String adjustedQuantity) {
		this.adjustedQuantity = adjustedQuantity;
	}
	/**
	 * @return the adjustedUnitCode
	 */
	public String getAdjustedUnitCode() {
		return adjustedUnitCode;
	}
	/**
	 * @param adjustedUnitCode the adjustedUnitCode to set
	 */
	public void setAdjustedUnitCode(String adjustedUnitCode) {
		this.adjustedUnitCode = adjustedUnitCode;
	}
	/**
	 * @return the adjustedUnitPrice
	 */
	public String getAdjustedUnitPrice() {
		return adjustedUnitPrice;
	}
	/**
	 * @param adjustedUnitPrice the adjustedUnitPrice to set
	 */
	public void setAdjustedUnitPrice(String adjustedUnitPrice) {
		this.adjustedUnitPrice = adjustedUnitPrice;
	}
	/**
	 * @return the transactionPurposeCode
	 */
	public String getTransactionPurposeCode() {
		return transactionPurposeCode;
	}
	/**
	 * @param transactionPurposeCode the transactionPurposeCode to set
	 */
	public void setTransactionPurposeCode(String transactionPurposeCode) {
		this.transactionPurposeCode = transactionPurposeCode;
	}
	/**
	 * @return the discrepancyCodeList
	 */
	public List<String> getDiscrepancyCodeList() {
		return discrepancyCodeList;
	}
	/**
	 * @param discrepancyCodeList the discrepancyCodeList to set
	 */
	public void setDiscrepancyCodeList(List<String> discrepancyCodeList) {
		this.discrepancyCodeList = discrepancyCodeList;
	}
	/**
	 * @return the dispositionCodeList
	 */
	public List<String> getDispositionCodeList() {
		return dispositionCodeList;
	}
	/**
	 * @param dispositionCodeList the dispositionCodeList to set
	 */
	public void setDispositionCodeList(List<String> dispositionCodeList) {
		this.dispositionCodeList = dispositionCodeList;
	}
	/**
	 * @return the actionCode
	 */
	public String getActionCode() {
		return actionCode;
	}
	/**
	 * @param actionCode the actionCode to set
	 */
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the attachmentCount
	 */
	public int getAttachmentCount() {
		return attachmentCount;
	}
	/**
	 * @param attachmentCount the attachmentCount to set
	 */
	public void setAttachmentCount(int attachmentCount) {
		this.attachmentCount = attachmentCount;
	}
	/**
	 * @return the caseStatus
	 */
	public String getCaseStatus() {
		return caseStatus;
	}
	/**
	 * @param caseStatus the caseStatus to set
	 */
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	/**
	 * @return the attachmentNameList
	 */
	public List<String> getAttachmentNameList() {
		return attachmentNameList;
	}
	/**
	 * @param attachmentNameList the attachmentNameList to set
	 */
	public void setAttachmentNameList(List<String> attachmentNameList) {
		this.attachmentNameList = attachmentNameList;
	}

}
