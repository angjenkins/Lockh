/*
 * @(#)OrderHeader.java			Feb 23, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.model;

import java.io.Serializable;

/**
 * <code>OrderHeader</code> contains Order header information.
 *
 * @author  PrasadRNerayanuru
 */

public class OrderHeader implements Serializable {

	private static final long serialVersionUID = -312747108154305515L;

	private String store;
	
	private Long orderNumber;
	
	private Double time;
	
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

	public void setDesc(String description) {
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

	public void setControlNr(Long controlNumber) {
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
}
