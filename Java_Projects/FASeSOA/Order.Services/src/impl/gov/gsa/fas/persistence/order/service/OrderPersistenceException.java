/*
 * @(#)OrderPersistenceException.java			Mar 12, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.service;

/**
 * <code>OrderPersistenceException</code> is the custom exception thrown 
 * if any failure or error occurs while calling any down stream systems.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderPersistenceException extends Exception {

	private static final long serialVersionUID = -1642950768007062507L;

	/**
	 * @param message
	 * @param cause
	 */
	public OrderPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public OrderPersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public OrderPersistenceException(Throwable cause) {
		super(cause);
	}
}
