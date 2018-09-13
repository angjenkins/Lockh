/*
 * @(#)VendorOffsetTransaction.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.model;

import java.io.Serializable;

/**
 * <code>VendorOffsetTransaction</code> is the persistence model
 * for Order Discrepancy transaction type "VendorOffset".
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class VendorOffsetTransaction implements Serializable {

	private static final long serialVersionUID = 6455820727028513357L;

	private Long vendorOffsetKey;
	private Long rodKey;
	private String poNumber;
	private String contractNumber;
	private Long offsetAmount;
	private String createdUserCode;
	private String acoName;
	private String problemType;
	
	/**
	 * @return the vendorOffsetKey
	 */
	public Long getVendorOffsetKey() {
		return vendorOffsetKey;
	}
	/**
	 * @param vendorOffsetKey the vendorOffsetKey to set
	 */
	public void setVendorOffsetKey(Long vendorOffsetKey) {
		this.vendorOffsetKey = vendorOffsetKey;
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
	 * @return the poNumber
	 */
	public String getPoNumber() {
		return poNumber;
	}
	/**
	 * @param poNumber the poNumber to set
	 */
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	/**
	 * @return the contractNumber
	 */
	public String getContractNumber() {
		return contractNumber;
	}
	/**
	 * @param contractNumber the contractNumber to set
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	/**
	 * @return the offsetAmount
	 */
	public Long getOffsetAmount() {
		return offsetAmount;
	}
	/**
	 * @param offsetAmount the offsetAmount to set
	 */
	public void setOffsetAmount(Long offsetAmount) {
		this.offsetAmount = offsetAmount;
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
	 * @return the acoName
	 */
	public String getAcoName() {
		return acoName;
	}
	/**
	 * @param acoName the acoName to set
	 */
	public void setAcoName(String acoName) {
		this.acoName = acoName;
	}
	/**
	 * @return the problemType
	 */
	public String getProblemType() {
		return problemType;
	}
	/**
	 * @param problemType the problemType to set
	 */
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
}
