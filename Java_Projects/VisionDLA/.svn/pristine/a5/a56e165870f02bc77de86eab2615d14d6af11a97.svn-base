/*
 * @(#)WsdrRequestData.java			Jul 26, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import gov.gsa.fas.vision.dla.mf.CafAddress;

/**
 * <code>WsdrRequestData</code> is data object for VISION DLA Request.
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrRequestData implements Serializable{

	/** Generated serial version Id **/
	private static final long serialVersionUID = -7036014960145275389L;
	
	private String documentNumber;
	private String docNumberSuffix;
	private String websdrNumber;
	private String sdrType;
	private String transactionPurposeCode;
	private String transetControlNumber;
	private List<String> discrepancyCodeList;
	private String submitterName;
	private String submitterDodAAC;
	private String NSN;
	private String nsnDescription;
	private String unitOfIssue;
	private Integer shippedQuantity;
	private Integer receivedQuantity;
	private Integer discrepancyQuantity;
	private BigDecimal unitPrice;
	private BigDecimal totalCost;
	private String actionCode;
	private List<String> remarks;
	private String contactName;
	private String contactEmail;
	private String contactPhone;
	private String contactPhoneExt;
	private String documentType;
	private List<String> attachmentNames;
	private int attachmentCount;
	//Functional fields
	private String requestFileName;
	private String responseFileName;
	private long wsdrRequestId;
	private long visionDlaId;
	private boolean isDocumentNumberValid;
	private boolean isDodAacValid;
	private CafAddress cafAddress;
	//For additional information
	private RequestDataAggregate requestDataAggregate = 
			new RequestDataAggregate();
	private String requestXml;
	
	private String wrongItemCAGECode;
	private String wrongItemDescription;
	private String wrongItemManufacturerName;
	private String wrongItemNSN;
	private String wrongItemPartNumber;
	private String wrongItemQuantityReceived;
	private String wrongItemUI;
	
	/**
	 * @return the wrongItemCAGECode
	 */
	public String getWrongItemCAGECode() {
		return wrongItemCAGECode;
	}
	/**
	 * @param wrongItemCAGECode the wrongItemCAGECode to set
	 */
	public void setWrongItemCAGECode(String wrongItemCAGECode) {
		this.wrongItemCAGECode = wrongItemCAGECode;
	}
	/**
	 * @return the wrongItemDescription
	 */
	public String getWrongItemDescription() {
		return wrongItemDescription;
	}
	/**
	 * @param wrongItemDescription the wrongItemDescription to set
	 */
	public void setWrongItemDescription(String wrongItemDescription) {
		this.wrongItemDescription = wrongItemDescription;
	}
	/**
	 * @return the wrongItemManufacturerName
	 */
	public String getWrongItemManufacturerName() {
		return wrongItemManufacturerName;
	}
	/**
	 * @param wrongItemManufacturerName the wrongItemManufacturerName to set
	 */
	public void setWrongItemManufacturerName(String wrongItemManufacturerName) {
		this.wrongItemManufacturerName = wrongItemManufacturerName;
	}
	/**
	 * @return the wrongItemNSN
	 */
	public String getWrongItemNSN() {
		return wrongItemNSN;
	}
	/**
	 * @param wrongItemNSN the wrongItemNSN to set
	 */
	public void setWrongItemNSN(String wrongItemNSN) {
		this.wrongItemNSN = wrongItemNSN;
	}
	/**
	 * @return the wrongItemPartNumber
	 */
	public String getWrongItemPartNumber() {
		return wrongItemPartNumber;
	}
	/**
	 * @param wrongItemPartNumber the wrongItemPartNumber to set
	 */
	public void setWrongItemPartNumber(String wrongItemPartNumber) {
		this.wrongItemPartNumber = wrongItemPartNumber;
	}
	/**
	 * @return the wrongItemQuantityReceived
	 */
	public String getWrongItemQuantityReceived() {
		return wrongItemQuantityReceived;
	}
	/**
	 * @param wrongItemQuantityReceived the wrongItemQuantityReceived to set
	 */
	public void setWrongItemQuantityReceived(String wrongItemQuantityReceived) {
		this.wrongItemQuantityReceived = wrongItemQuantityReceived;
	}
	/**
	 * @return the wrongItemUI
	 */
	public String getWrongItemUI() {
		return wrongItemUI;
	}
	/**
	 * @param wrongItemUI the wrongItemUI to set
	 */
	public void setWrongItemUI(String wrongItemUI) {
		this.wrongItemUI = wrongItemUI;
	}
	
	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}
	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	/**
	 * @return the docNumberSuffix
	 */
	public String getDocNumberSuffix() {
		return docNumberSuffix;
	}
	/**
	 * @param docNumberSuffix the docNumberSuffix to set
	 */
	public void setDocNumberSuffix(String docNumberSuffix) {
		this.docNumberSuffix = docNumberSuffix;
	}
	/**
	 * @return the websdrNumber
	 */
	public String getWebsdrNumber() {
		return websdrNumber;
	}
	/**
	 * @param websdrNumber the websdrNumber to set
	 */
	public void setWebsdrNumber(String websdrNumber) {
		this.websdrNumber = websdrNumber;
	}
	/**
	 * @return the sdrType
	 */
	public String getSdrType() {
		return sdrType;
	}
	/**
	 * @param sdrType the sdrType to set
	 */
	public void setSdrType(String sdrType) {
		this.sdrType = sdrType;
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
	 * @return the transetControlNumber
	 */
	public String getTransetControlNumber() {
		return transetControlNumber;
	}
	/**
	 * @param transetControlNumber the transetControlNumber to set
	 */
	public void setTransetControlNumber(String transetControlNumber) {
		this.transetControlNumber = transetControlNumber;
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
	
	public void addDiscrepancyCode(String discrepancyCode){
		if(discrepancyCodeList == null){
			discrepancyCodeList = new ArrayList<String>();
		}
		discrepancyCodeList.add(discrepancyCode);
	}
	
	/**
	 * @return the submitterName
	 */
	public String getSubmitterName() {
		return submitterName;
	}
	/**
	 * @param submitterName the submitterName to set
	 */
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	/**
	 * @return the submitterDodAAC
	 */
	public String getSubmitterDodAAC() {
		return submitterDodAAC;
	}
	/**
	 * @param submitterDodAAC the submitterDodAAC to set
	 */
	public void setSubmitterDodAAC(String submitterDodAAC) {
		this.submitterDodAAC = submitterDodAAC;
	}
	/**
	 * @return the nSN
	 */
	public String getNSN() {
		return NSN;
	}
	/**
	 * @param nSN the nSN to set
	 */
	public void setNSN(String nSN) {
		NSN = nSN;
	}
	/**
	 * @return the nsnDescription
	 */
	public String getNsnDescription() {
		return nsnDescription;
	}
	/**
	 * @param nsnDescription the nsnDescription to set
	 */
	public void setNsnDescription(String nsnDescription) {
		this.nsnDescription = nsnDescription;
	}
	/**
	 * @return the unitOfIssue
	 */
	public String getUnitOfIssue() {
		return unitOfIssue;
	}
	/**
	 * @param unitOfIssue the unitOfIssue to set
	 */
	public void setUnitOfIssue(String unitOfIssue) {
		this.unitOfIssue = unitOfIssue;
	}
	/**
	 * @return the shippedQuantity
	 */
	public Integer getShippedQuantity() {
		return shippedQuantity;
	}
	/**
	 * @param shippedQuantity the shippedQuantity to set
	 */
	public void setShippedQuantity(Integer shippedQuantity) {
		this.shippedQuantity = shippedQuantity;
	}
	/**
	 * @return the receivedQuantity
	 */
	public Integer getReceivedQuantity() {
		return receivedQuantity;
	}
	/**
	 * @param receivedQuantity the receivedQuantity to set
	 */
	public void setReceivedQuantity(Integer receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}
	/**
	 * @return the discrepancyQuantity
	 */
	public Integer getDiscrepancyQuantity() {
		return discrepancyQuantity;
	}
	/**
	 * @param discrepancyQuantity the discrepancyQuantity to set
	 */
	public void setDiscrepancyQuantity(Integer discrepancyQuantity) {
		this.discrepancyQuantity = discrepancyQuantity;
	}

	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the totalCost
	 */
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
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
	 * @return the remarks
	 */
	public List<String> getRemarks() {
		return remarks;
	}
	
	public void addRemarks(String remarks1){
		if(remarks == null){
			remarks = new ArrayList<String>();
		}
		remarks.add(remarks1);
	}
	
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(List<String> remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * @param contactPhone the contactPhone to set
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * @return the contactPhoneExt
	 */
	public String getContactPhoneExt() {
		return contactPhoneExt;
	}
	/**
	 * @param contactPhoneExt the contactPhoneExt to set
	 */
	public void setContactPhoneExt(String contactPhoneExt) {
		this.contactPhoneExt = contactPhoneExt;
	}
	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}
	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	/**
	 * @return the attachmentNames
	 */
	public List<String> getAttachmentNames() {
		return attachmentNames;
	}
	/**
	 * @param attachmentNames the attachmentNames to set
	 */
	public void setAttachmentNames(List<String> attachmentNames) {
		this.attachmentNames = attachmentNames;
	}
	
	public void addAttachmentName(String attachmentName){
		if(attachmentNames == null){
			attachmentNames = new ArrayList<String>();
		}
		attachmentNames.add(attachmentName);
	}
	/**
	 * @return the requestFileName
	 */
	public String getRequestFileName() {
		return requestFileName;
	}
	/**
	 * @param requestFileName the requestFileName to set
	 */
	public void setRequestFileName(String requestFileName) {
		this.requestFileName = requestFileName;
	}
	/**
	 * @return the responseFileName
	 */
	public String getResponseFileName() {
		return responseFileName;
	}
	/**
	 * @param responseFileName the responseFileName to set
	 */
	public void setResponseFileName(String responseFileName) {
		this.responseFileName = responseFileName;
	}
	/**
	 * @return the wsdrRequestId
	 */
	public long getWsdrRequestId() {
		return wsdrRequestId;
	}
	/**
	 * @param wsdrRequestId the wsdrRequestId to set
	 */
	public void setWsdrRequestId(long wsdrRequestId) {
		this.wsdrRequestId = wsdrRequestId;
	}
	/**
	 * @return the visionDlaId
	 */
	public long getVisionDlaId() {
		return visionDlaId;
	}
	/**
	 * @param visionDlaId the visionDlaId to set
	 */
	public void setVisionDlaId(long visionDlaId) {
		this.visionDlaId = visionDlaId;
	}
	/**
	 * @return the isDocumentNumberValid
	 */
	public boolean isDocumentNumberValid() {
		return isDocumentNumberValid;
	}
	/**
	 * @param isDocumentNumberValid the isDocumentNumberValid to set
	 */
	public void setDocumentNumberValid(boolean isDocumentNumberValid) {
		this.isDocumentNumberValid = isDocumentNumberValid;
	}
	/**
	 * @return the isDodAacValid
	 */
	public boolean isDodAacValid() {
		return isDodAacValid;
	}
	/**
	 * @param isDodAacValid the isDodAacValid to set
	 */
	public void setDodAacValid(boolean isDodAacValid) {
		this.isDodAacValid = isDodAacValid;
	}
	/**
	 * @return the cafAddress
	 */
	public CafAddress getCafAddress() {
		return cafAddress;
	}
	/**
	 * @param cafAddress the cafAddress to set
	 */
	public void setCafAddress(CafAddress cafAddress) {
		this.cafAddress = cafAddress;
	}
	/**
	 * @return the requestDataAggregate
	 */
	public RequestDataAggregate getRequestDataAggregate() {
		return requestDataAggregate;
	}
	/**
	 * @param requestDataAggregate the requestDataAggregate to set
	 */
	public void setRequestDataAggregate(RequestDataAggregate requestDataAggregate) {
		this.requestDataAggregate = requestDataAggregate;
	}
	/**
	 * @return the requestXml
	 */
	public String getRequestXml() {
		return requestXml;
	}
	/**
	 * @param requestXml the requestXml to set
	 */
	public void setRequestXml(String requestXml) {
		this.requestXml = requestXml;
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
}
