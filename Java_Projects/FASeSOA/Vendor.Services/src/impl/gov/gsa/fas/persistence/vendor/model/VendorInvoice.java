/*
 * @(#)VendorInvoice.java			Aug 20, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.model;

import java.io.Serializable;

/**
 * <code>VendorInvoice</code> provides persistence model for vendor 
 * invoice details.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class VendorInvoice implements Serializable{

	private static final long serialVersionUID = -6354496550998482113L;
	
	private String invoiceNumber;
	private String poNumber;
	private Integer quantity;
	private Double amount;

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
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
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
