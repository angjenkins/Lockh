/*
 * @(#)PricePersistenceException.java			May 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.pricing.service;

/**
 * <code>PricePersistenceException</code> is the custom exception thrown 
 * if any failure or error occurs while calling any down stream systems.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class PricePersistenceException extends Exception {

	private static final long serialVersionUID = 227871022692982617L;

	/**
	 * @param message
	 * @param cause
	 */
	public PricePersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PricePersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PricePersistenceException(Throwable cause) {
		super(cause);
	}

}
