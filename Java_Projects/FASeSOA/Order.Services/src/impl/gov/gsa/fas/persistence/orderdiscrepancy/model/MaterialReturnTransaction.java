/*
 * @(#)MaterialReturnTransaction.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.model;

import java.io.Serializable;

/**
 * <code>MaterialReturnTransaction</code> is the persistence model
 * for Order Discrepancy transaction type 
 * "MaterialReturnAuthorization(ZAU)".
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class MaterialReturnTransaction implements Serializable {

	private static final long serialVersionUID = -1998780158240360406L;

	private Long zauKey;
	private Long rodKey;
	private Byte pendingFlag;
	private String docId;
	private String nsn;
	private String unit;
	private Integer quantity;
	private String requisitionNumber;
	private String requisitionSuffix;
	private String supplementAddrAAC;
	private String signalCode;
	private String fundCode;
	private String routingIdCode;
	private Long extendValue;
	private String createdUserCode;
	private String liabilityCode;
	private String regionCode;
	
	/**
	 * @return the zauKey
	 */
	public Long getZauKey() {
		return zauKey;
	}
	/**
	 * @param zauKey the zauKey to set
	 */
	public void setZauKey(Long zauKey) {
		this.zauKey = zauKey;
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
	 * @return the extendValue
	 */
	public Long getExtendValue() {
		return extendValue;
	}
	/**
	 * @param extendValue the extendValue to set
	 */
	public void setExtendValue(Long extendValue) {
		this.extendValue = extendValue;
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
	 * @return the liabilityCode
	 */
	public String getLiabilityCode() {
		return liabilityCode;
	}
	/**
	 * @param liabilityCode the liabilityCode to set
	 */
	public void setLiabilityCode(String liabilityCode) {
		this.liabilityCode = liabilityCode;
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
}
