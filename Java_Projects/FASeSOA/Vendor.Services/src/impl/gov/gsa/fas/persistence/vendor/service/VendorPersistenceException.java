/*
 * @(#)VendorPersistenceException.java			Aug 21, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.service;

/**
 * <code>VendorPersistenceException</code> is the custom exception
 * while accessing Vendor details.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class VendorPersistenceException extends Exception {

	private static final long serialVersionUID = 6167718165140916106L;

	/**
	 * @param message
	 * @param cause
	 */
	public VendorPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public VendorPersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public VendorPersistenceException(Throwable cause) {
		super(cause);
	}
}
