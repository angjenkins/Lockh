/*
 * @(#)MonetaryAmount.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request.model;

import java.math.BigDecimal;

/**
 * <code>MonetaryAmount</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class MonetaryAmount {
	private String qualifier;
	private BigDecimal amount;
	/**
	 * @return the qualifier
	 */
	public String getQualifier() {
		return qualifier;
	}
	/**
	 * @param qualifier the qualifier to set
	 */
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
