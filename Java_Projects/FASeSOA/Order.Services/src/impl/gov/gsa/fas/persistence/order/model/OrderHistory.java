/*
 * @(#)OrderHistory.java			Feb 27, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.model;

import java.io.Serializable;

/**
 * <code>OrderHistory</code> represents the CSC Order History details.
 *
 * @author  PrasadRNerayanuru
 */

public class OrderHistory implements Serializable {

	private static final long serialVersionUID = 8630371609327688638L;

	private String store;
	
	private Long orderNumber;
	
	private Double time;
	
	private Long webOrderNumber;
	
	private Double costPrice;	
	
	private String niin;
	
	private Integer quantity;
	
	private String ui;
	
	private String description;
	
	private Double sellPrice;
	
	private String backOrder;
	
	private String eddIdPrefix;
	
	private String manufacturePartNo;
	
	private Long controlNumber; 
	
	private String docNo;
	
	private String docSuff;
	
	private String manifestNumber;
	
	private String depot;
	
	private Double weight;
	
	private Long receiptDateOrd;
	
	private Long receiptDateRcd;	
	
	private String saleAAC;
	
	private String saleAccess;
	
	private String salePickup;
	
	private String carrier;
	
	private String gbl;
	
	private String shipMode;
	
	private String tcn;
	
	private String trackingNumber;
	
	private Long shipDate;
	
	private String appropNo;
	
	private String projCode;
	
	private Integer prioCode;

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Long getWebOrderNumber() {
		return webOrderNumber;
	}

	public void setWebOrderNumber(Long webOrderNumber) {
		this.webOrderNumber = webOrderNumber;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public String getNiin() {
		return niin;
	}

	public void setNiin(String niin) {
		this.niin = niin;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUi() {
		return ui;
	}

	public void setUi(String ui) {
		this.ui = ui;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getBackOrder() {
		return backOrder;
	}

	public void setBackOrder(String backOrder) {
		this.backOrder = backOrder;
	}

	public String getEddIdPrefix() {
		return eddIdPrefix;
	}

	public void setEddIdPrefix(String eddIdPrefix) {
		this.eddIdPrefix = eddIdPrefix;
	}

	public String getManufacturePartNo() {
		return manufacturePartNo;
	}

	public void setManufacturePartNo(String manufacturePartNo) {
		this.manufacturePartNo = manufacturePartNo;
	}

	public Long getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(Long controlNumber) {
		this.controlNumber = controlNumber;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getDocSuff() {
		return docSuff;
	}

	public void setDocSuff(String docSuff) {
		this.docSuff = docSuff;
	}

	public String getManifestNumber() {
		return manifestNumber;
	}

	public void setManifestNumber(String manifestNumber) {
		this.manifestNumber = manifestNumber;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Long getReceiptDateOrd() {
		return receiptDateOrd;
	}

	public void setReceiptDateOrd(Long receiptDateOrd) {
		this.receiptDateOrd = receiptDateOrd;
	}

	public Long getReceiptDateRcd() {
		return receiptDateRcd;
	}

	public void setReceiptDateRcd(Long receiptDateRcd) {
		this.receiptDateRcd = receiptDateRcd;
	}

	public String getSaleAAC() {
		return saleAAC;
	}

	public void setSaleAAC(String saleAAC) {
		this.saleAAC = saleAAC;
	}

	public String getSaleAccess() {
		return saleAccess;
	}

	public void setSaleAccess(String saleAccess) {
		this.saleAccess = saleAccess;
	}

	public String getSalePickup() {
		return salePickup;
	}

	public void setSalePickup(String salePickup) {
		this.salePickup = salePickup;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getGbl() {
		return gbl;
	}

	public void setGbl(String gbl) {
		this.gbl = gbl;
	}

	public String getShipMode() {
		return shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getTcn() {
		return tcn;
	}

	public void setTcn(String tcn) {
		this.tcn = tcn;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Long getShipDate() {
		return shipDate;
	}

	public void setShipDate(Long shipDate) {
		this.shipDate = shipDate;
	}

	public String getAppropNo() {
		return appropNo;
	}

	public void setAppropNo(String appropNo) {
		this.appropNo = appropNo;
	}

	public String getProjCode() {
		return projCode;
	}

	public void setProjCode(String projCode) {
		this.projCode = projCode;
	}

	public Integer getPrioCode() {
		return prioCode;
	}

	public void setPrioCode(Integer prioCode) {
		this.prioCode = prioCode;
	}

}