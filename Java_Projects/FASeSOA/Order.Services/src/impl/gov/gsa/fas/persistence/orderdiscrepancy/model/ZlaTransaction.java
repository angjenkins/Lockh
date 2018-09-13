/*
 * @(#)ZlaTransaction.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <code>ZlaTransaction</code> is the persistence model
 * for Order Discrepancy transaction type "ZLA".
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ZlaTransaction implements Serializable {

	private static final long serialVersionUID = -7830747283221673594L;

	private Long zlaKey;
	private Long rodKey;
	private Byte pendingFlag;
	private String docId;
	private String routingIdCode;
	private String billToIndicator;
	private String nsn;
	private String unit;
	private Integer quantity;
	private String requisitionNumber;
	private String requisitionSuffix;
	private String supplementAddrAAC;
	private String signalCode;
	private String fundCode;
	private String distributionCode;
	private String projectCode;
	private Long sellPrice;
	private String chargeBackIndicator;
	private String regionCode;
	private String originalTdCode;
	private String imq;
	private String itemManager;
	private String priorityCode;
	private String numberOfCards;
	private String cardNo1;
	private String originalDocId;
	private Timestamp shippedDate;
	private Long costPrice;
	private String stateCode;
	private String cityCode;
	private String agencyBureauCode;
	private String boac;
	private String globalPONumber;
	private String actionTdCode1;
	private String actionTdCode2;
	private String exportDomesticCode;
	private Timestamp createdDate;
	private String createdUserCode;
	private String adviceCode;
	private String cardNo2;
	
	/**
	 * @return the zlaKey
	 */
	public Long getZlaKey() {
		return zlaKey;
	}
	/**
	 * @param zlaKey the zlaKey to set
	 */
	public void setZlaKey(Long zlaKey) {
		this.zlaKey = zlaKey;
	}
	/**
	 * @return the rodKey
	 */
	public Long getRodKey() {
		return rodKey;
	}
	/**
	 * @param rodKey the rodKey to set
	 */
	public void setRodKey(Long rodKey) {
		this.rodKey = rodKey;
	}
	/**
	 * @return the pendingFlag
	 */
	public Byte getPendingFlag() {
		return pendingFlag;
	}
	/**
	 * @param pendingFlag the pendingFlag to set
	 */
	public void setPendingFlag(Byte pendingFlag) {
		this.pendingFlag = pendingFlag;
	}
	/**
	 * @return the docId
	 */
	public String getDocId() {
		return docId;
	}
	/**
	 * @param docId the docId to set
	 */
	public void setDocId(String docId) {
		this.docId = docId;
	}
	/**
	 * @return the routingIdCode
	 */
	public String getRoutingIdCode() {
		return routingIdCode;
	}
	/**
	 * @param routingIdCode the routingIdCode to set
	 */
	public void setRoutingIdCode(String routingIdCode) {
		this.routingIdCode = routingIdCode;
	}
	/**
	 * @return the billToIndicator
	 */
	public String getBillToIndicator() {
		return billToIndicator;
	}
	/**
	 * @param billToIndicator the billToIndicator to set
	 */
	public void setBillToIndicator(String billToIndicator) {
		this.billToIndicator = billToIndicator;
	}
	/**
	 * @return the nsn
	 */
	public String getNsn() {
		return nsn;
	}
	/**
	 * @param nsn the nsn to set
	 */
	public void setNsn(String nsn) {
		this.nsn = nsn;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the requisitionNumber
	 */
	public String getRequisitionNumber() {
		return requisitionNumber;
	}
	/**
	 * @param requisitionNumber the requisitionNumber to set
	 */
	public void setRequisitionNumber(String requisitionNumber) {
		this.requisitionNumber = requisitionNumber;
	}
	/**
	 * @return the requisitionSuffix
	 */
	public String getRequisitionSuffix() {
		return requisitionSuffix;
	}
	/**
	 * @param requisitionSuffix the requisitionSuffix to set
	 */
	public void setRequisitionSuffix(String requisitionSuffix) {
		this.requisitionSuffix = requisitionSuffix;
	}
	/**
	 * @return the supplementAddrAAC
	 */
	public String getSupplementAddrAAC() {
		return supplementAddrAAC;
	}
	/**
	 * @param supplementAddrAAC the supplementAddrAAC to set
	 */
	public void setSupplementAddrAAC(String supplementAddrAAC) {
		this.supplementAddrAAC = supplementAddrAAC;
	}
	/**
	 * @return the signalCode
	 */
	public String getSignalCode() {
		return signalCode;
	}
	/**
	 * @param signalCode the signalCode to set
	 */
	public void setSignalCode(String signalCode) {
		this.signalCode = signalCode;
	}
	/**
	 * @return the fundCode
	 */
	public String getFundCode() {
		return fundCode;
	}
	/**
	 * @param fundCode the fundCode to set
	 */
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	/**
	 * @return the distributionCode
	 */
	public String getDistributionCode() {
		return distributionCode;
	}
	/**
	 * @param distributionCode the distributionCode to set
	 */
	public void setDistributionCode(String distributionCode) {
		this.distributionCode = distributionCode;
	}
	/**
	 * @return the projectCode
	 */
	public String getProjectCode() {
		return projectCode;
	}
	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	/**
	 * @return the sellPrice
	 */
	public Long getSellPrice() {
		return sellPrice;
	}
	/**
	 * @param sellPrice the sellPrice to set
	 */
	public void setSellPrice(Long sellPrice) {
		this.sellPrice = sellPrice;
	}
	/**
	 * @return the chargeBackIndicator
	 */
	public String getChargeBackIndicator() {
		return chargeBackIndicator;
	}
	/**
	 * @param chargeBackIndicator the chargeBackIndicator to set
	 */
	public void setChargeBackIndicator(String chargeBackIndicator) {
		this.chargeBackIndicator = chargeBackIndicator;
	}
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	/**
	 * @return the originalTdCode
	 */
	public String getOriginalTdCode() {
		return originalTdCode;
	}
	/**
	 * @param originalTdCode the originalTdCode to set
	 */
	public void setOriginalTdCode(String originalTdCode) {
		this.originalTdCode = originalTdCode;
	}
	/**
	 * @return the imq
	 */
	public String getImq() {
		return imq;
	}
	/**
	 * @param imq the imq to set
	 */
	public void setImq(String imq) {
		this.imq = imq;
	}
	/**
	 * @return the itemManager
	 */
	public String getItemManager() {
		return itemManager;
	}
	/**
	 * @param itemManager the itemManager to set
	 */
	public void setItemManager(String itemManager) {
		this.itemManager = itemManager;
	}
	/**
	 * @return the priorityCode
	 */
	public String getPriorityCode() {
		return priorityCode;
	}
	/**
	 * @param priorityCode the priorityCode to set
	 */
	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
	}
	/**
	 * @return the numberOfCards
	 */
	public String getNumberOfCards() {
		return numberOfCards;
	}
	/**
	 * @param numberOfCards the numberOfCards to set
	 */
	public void setNumberOfCards(String numberOfCards) {
		this.numberOfCards = numberOfCards;
	}
	/**
	 * @return the cardNo1
	 */
	public String getCardNo1() {
		return cardNo1;
	}
	/**
	 * @param cardNo1 the cardNo1 to set
	 */
	public void setCardNo1(String cardNo1) {
		this.cardNo1 = cardNo1;
	}
	/**
	 * @return the originalDocId
	 */
	public String getOriginalDocId() {
		return originalDocId;
	}
	/**
	 * @param originalDocId the originalDocId to set
	 */
	public void setOriginalDocId(String originalDocId) {
		this.originalDocId = originalDocId;
	}
	/**
	 * @return the shippedDate
	 */
	public Timestamp getShippedDate() {
		return shippedDate;
	}
	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(Timestamp shippedDate) {
		this.shippedDate = shippedDate;
	}
	/**
	 * @return the costPrice
	 */
	public Long getCostPrice() {
		return costPrice;
	}
	/**
	 * @param costPrice the costPrice to set
	 */
	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return the agencyBureauCode
	 */
	public String getAgencyBureauCode() {
		return agencyBureauCode;
	}
	/**
	 * @param agencyBureauCode the agencyBureauCode to set
	 */
	public void setAgencyBureauCode(String agencyBureauCode) {
		this.agencyBureauCode = agencyBureauCode;
	}
	/**
	 * @return the boac
	 */
	public String getBoac() {
		return boac;
	}
	/**
	 * @param boac the boac to set
	 */
	public void setBoac(String boac) {
		this.boac = boac;
	}
	/**
	 * @return the globalPONumber
	 */
	public String getGlobalPONumber() {
		return globalPONumber;
	}
	/**
	 * @param globalPONumber the globalPONumber to set
	 */
	public void setGlobalPONumber(String globalPONumber) {
		this.globalPONumber = globalPONumber;
	}
	/**
	 * @return the actionTdCode1
	 */
	public String getActionTdCode1() {
		return actionTdCode1;
	}
	/**
	 * @param actionTdCode1 the actionTdCode1 to set
	 */
	public void setActionTdCode1(String actionTdCode1) {
		this.actionTdCode1 = actionTdCode1;
	}
	/**
	 * @return the actionTdCode2
	 */
	public String getActionTdCode2() {
		return actionTdCode2;
	}
	/**
	 * @param actionTdCode2 the actionTdCode2 to set
	 */
	public void setActionTdCode2(String actionTdCode2) {
		this.actionTdCode2 = actionTdCode2;
	}
	/**
	 * @return the exportDomesticCode
	 */
	public String getExportDomesticCode() {
		return exportDomesticCode;
	}
	/**
	 * @param exportDomesticCode the exportDomesticCode to set
	 */
	public void setExportDomesticCode(String exportDomesticCode) {
		this.exportDomesticCode = exportDomesticCode;
	}
	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the createdUserCode
	 */
	public String getCreatedUserCode() {
		return createdUserCode;
	}
	/**
	 * @param createdUserCode the createdUserCode to set
	 */
	public void setCreatedUserCode(String createdUserCode) {
		this.createdUserCode = createdUserCode;
	}
	/**
	 * @return the adviceCode
	 */
	public String getAdviceCode() {
		return adviceCode;
	}
	/**
	 * @param adviceCode the adviceCode to set
	 */
	public void setAdviceCode(String adviceCode) {
		this.adviceCode = adviceCode;
	}
	/**
	 * @return the cardNo2
	 */
	public String getCardNo2() {
		return cardNo2;
	}
	/**
	 * @param cardNo2 the cardNo2 to set
	 */
	public void setCardNo2(String cardNo2) {
		this.cardNo2 = cardNo2;
	}
}
