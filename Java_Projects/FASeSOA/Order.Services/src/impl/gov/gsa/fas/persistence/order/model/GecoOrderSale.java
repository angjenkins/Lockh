/*
 * @(#)GecoOrderSale.java			Feb 28, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.model;

import java.io.Serializable;

/**
 * <code>GecoOrderSale/code> contains GECO Order sale information.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class GecoOrderSale implements Serializable{

	private static final long serialVersionUID = -3978971682534879724L;

	private Long gecoOrderNumber;
	
	private String store;
	
	private Long saleDate;
	
	private Long orderNumber;	
	
	private Long saleGregDate;
	
	private Long ticket;
	
	private Long gecoOrderDate;
	
	private String AAC;
	
	private String access;
	
	private String liidId;
	
	public Long getGecoOrderNumber() {
		return gecoOrderNumber;
	}

	public void setGecoOrderNumber(Long gecoOrderNumber) {
		this.gecoOrderNumber = gecoOrderNumber;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Long getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Long saleDate) {
		this.saleDate = saleDate;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getSaleGregDate() {
		return saleGregDate;
	}

	public void setSaleGregDate(Long saleGregDate) {
		this.saleGregDate = saleGregDate;
	}

	public Long getTicket() {
		return ticket;
	}

	public void setTicket(Long ticket) {
		this.ticket = ticket;
	}

	public Long getGecoOrderDate() {
		return gecoOrderDate;
	}

	public void setGecoOrderDate(Long gecoOrderDate) {
		this.gecoOrderDate = gecoOrderDate;
	}

	public String getAAC() {
		return AAC;
	}

	public void setAAC(String aAC) {
		AAC = aAC;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	/**
	 * @return the liidId
	 */
	public String getLiidId() {
		return liidId;
	}

	/**
	 * @param liidId the liidId to set
	 */
	public void setLiidId(String liidId) {
		this.liidId = liidId;
	}
}
