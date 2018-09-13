/*
 * @(#)OrderCancel.java			Aug 27, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.model;

import java.io.Serializable;

/**
 * <code>OrderCancel</code> provides persistence model to
 * cancel order request.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderCancel implements Serializable {

	private static final long serialVersionUID = 935286390769987577L;
	
	private String documentIdentifierCode;
	private String routingIdentifierCode;
	private String nsn;
	private String unit;
	private Integer quantity;
	private String requisitionNumber;
	private String requisitionSuffix;
	private String supplementAddrAAC;
	private String distributionCode;
	private String projectCode;
	private Integer priorityCode;
	private String createdDate;
	/**
	 * @return the documentIdentifierCode
	 */
	public String getDocumentIdentifierCode() {
		return documentIdentifierCode;
	}
	/**
	 * @param documentIdentifierCode the documentIdentifierCode to set
	 */
	public void setDocumentIdentifierCode(String documentIdentifierCode) {
		this.documentIdentifierCode = documentIdentifierCode;
	}
	/**
	 * @return the routingIdentifierCode
	 */
	public String getRoutingIdentifierCode() {
		return routingIdentifierCode;
	}
	/**
	 * @param routingIdentifierCode the routingIdentifierCode to set
	 */
	public void setRoutingIdentifierCode(String routingIdentifierCode) {
		this.routingIdentifierCode = routingIdentifierCode;
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
	public Integer getPriorityCode() {
		return priorityCode;
	}
	/**
	 * @param priorityCode the priorityCode to set
	 */
	public void setPriorityCode(Integer priorityCode) {
		this.priorityCode = priorityCode;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
