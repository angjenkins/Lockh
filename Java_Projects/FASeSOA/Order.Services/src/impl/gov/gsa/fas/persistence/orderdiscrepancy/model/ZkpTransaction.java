/*
 * @(#)ZkpTransaction.java			Jun 12, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <code>ZkpTransaction</code> is the persistence model
 * for Order Discrepancy transaction type "ZKP".
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ZkpTransaction implements Serializable {

	private static final long serialVersionUID = -6800421932712530165L;

	private Long zkpKey;
	private Long rodKey;
	private Byte pendingFlag;
	private String header;
	private String techCode;
	private String requisitionNumber;
	private String requisitionSuffix;
	private String reportType;
	private Timestamp createdTime;
	
	/**
	 * @return the zkpKey
	 */
	public Long getZkpKey() {
		return zkpKey;
	}
	/**
	 * @param zkpKey the zkpKey to set
	 */
	public void setZkpKey(Long zkpKey) {
		this.zkpKey = zkpKey;
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
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * @return the techCode
	 */
	public String getTechCode() {
		return techCode;
	}
	/**
	 * @param techCode the techCode to set
	 */
	public void setTechCode(String techCode) {
		this.techCode = techCode;
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
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}
	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	/**
	 * @return the createdTime
	 */
	public Timestamp getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
}
