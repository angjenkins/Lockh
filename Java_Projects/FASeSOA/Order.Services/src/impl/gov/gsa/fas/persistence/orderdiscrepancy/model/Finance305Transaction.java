/*
 * @(#)Finance305Transaction.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.model;

import java.io.Serializable;

/**
 * <code>Finance305Transaction</code> is the persistence model
 * for Order Discrepancy transaction type "Finance305".
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class Finance305Transaction implements Serializable {

	private static final long serialVersionUID = -848488658561802278L;

	private Long fin305Key;
	private Long rodKey;
	private Byte pendingFlag;
	private String fileId;
	private Integer recordId;
	private String docId;
	private String rtgId;
	private String comCtrCd;
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
	private String priorityCode;
	private String cycleDate;
	private String modeOfShip;
	private Long extSellValue;
	private Long sellPrice;
	private Short costPrice;
	private String tdSer8Ind;
	private String agencyBureauCode;
	private String stateCode;
	private String cityCode;
	private String expDomInd;
	private String tdCode;
	private String manifestPONumber;
	private String boac;
	private String region;
	private String adviceCode;
	private String fasPONumber;
	
	/**
	 * @return the fin305Key
	 */
	public Long getFin305Key() {
		return fin305Key;
	}
	/**
	 * @param fin305Key the fin305Key to set
	 */
	public void setFin305Key(Long fin305Key) {
		this.fin305Key = fin305Key;
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
	 * @return the fileId
	 */
	public String getFileId() {
		return fileId;
	}
	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	/**
	 * @return the recordId
	 */
	public Integer getRecordId() {
		return recordId;
	}
	/**
	 * @param recordId the recordId to set
	 */
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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
	 * @return the rtgId
	 */
	public String getRtgId() {
		return rtgId;
	}
	/**
	 * @param rtgId the rtgId to set
	 */
	public void setRtgId(String rtgId) {
		this.rtgId = rtgId;
	}
	/**
	 * @return the comCtrCd
	 */
	public String getComCtrCd() {
		return comCtrCd;
	}
	/**
	 * @param comCtrCd the comCtrCd to set
	 */
	public void setComCtrCd(String comCtrCd) {
		this.comCtrCd = comCtrCd;
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
	 * @return the cycleDate
	 */
	public String getCycleDate() {
		return cycleDate;
	}
	/**
	 * @param cycleDate the cycleDate to set
	 */
	public void setCycleDate(String cycleDate) {
		this.cycleDate = cycleDate;
	}
	/**
	 * @return the modeOfShip
	 */
	public String getModeOfShip() {
		return modeOfShip;
	}
	/**
	 * @param modeOfShip the modeOfShip to set
	 */
	public void setModeOfShip(String modeOfShip) {
		this.modeOfShip = modeOfShip;
	}
	/**
	 * @return the extSellValue
	 */
	public Long getExtSellValue() {
		return extSellValue;
	}
	/**
	 * @param extSellValue the extSellValue to set
	 */
	public void setExtSellValue(Long extSellValue) {
		this.extSellValue = extSellValue;
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
	 * @return the costPrice
	 */
	public Short getCostPrice() {
		return costPrice;
	}
	/**
	 * @param costPrice the costPrice to set
	 */
	public void setCostPrice(Short costPrice) {
		this.costPrice = costPrice;
	}
	/**
	 * @return the tdSer8Ind
	 */
	public String getTdSer8Ind() {
		return tdSer8Ind;
	}
	/**
	 * @param tdSer8Ind the tdSer8Ind to set
	 */
	public void setTdSer8Ind(String tdSer8Ind) {
		this.tdSer8Ind = tdSer8Ind;
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
	 * @return the expDomInd
	 */
	public String getExpDomInd() {
		return expDomInd;
	}
	/**
	 * @param expDomInd the expDomInd to set
	 */
	public void setExpDomInd(String expDomInd) {
		this.expDomInd = expDomInd;
	}
	/**
	 * @return the tdCode
	 */
	public String getTdCode() {
		return tdCode;
	}
	/**
	 * @param tdCode the tdCode to set
	 */
	public void setTdCode(String tdCode) {
		this.tdCode = tdCode;
	}
	/**
	 * @return the manifestPONumber
	 */
	public String getManifestPONumber() {
		return manifestPONumber;
	}
	/**
	 * @param manifestPONumber the manifestPONumber to set
	 */
	public void setManifestPONumber(String manifestPONumber) {
		this.manifestPONumber = manifestPONumber;
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
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
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
	 * @return the fasPONumber
	 */
	public String getFasPONumber() {
		return fasPONumber;
	}
	/**
	 * @param fasPONumber the fasPONumber to set
	 */
	public void setFasPONumber(String fasPONumber) {
		this.fasPONumber = fasPONumber;
	}

}
