/*
 * @(#)OrderSession.java			Feb 22, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * <code>OrderSession</code> represents ACIS Order session details.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderSession implements java.io.Serializable{

	private static final long serialVersionUID = -2729188734914919441L;

	private String orderNumber;
	private Long sessionNumber;
	private Timestamp orderDate;
	private String vendorName;
	private String orderStatus;
	private String partNumber;
	private String productName;
	private Integer quantity;
	private BigDecimal price;
	private String estimatedShipDate;
	private String shipDate;
	private String docId;
	private String unitOfIssue;
	private Integer shipToSerialNumber;
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
 
	public Long getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(Long sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String getEstimatedShipDate() {
		return estimatedShipDate;
	}
	public void setEstimatedShipDate(String estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}
	
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	
	public String getUnitOfIssue() {
		return unitOfIssue;
	}
	public void setUnitOfIssue(String unitOfIssue) {
		this.unitOfIssue = unitOfIssue;
	}
	
	public Integer getShipToSerialNumber() {
		return shipToSerialNumber;
	}
	public void setShipToSerialNumber(Integer shipToSerialNumber) {
		this.shipToSerialNumber = shipToSerialNumber;
	}
	
}
