/*
 * @(#)ComplaintPersistenceException.java			Aug 15, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.complaint.service;

import javax.ejb.ApplicationException;

/**
 * <code>ComplaintPersistenceException</code> is the custom exception thrown 
 * if any failure or error occurs while calling any OCMS down stream system.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

@ApplicationException(rollback=true) 
public class ComplaintPersistenceException extends Exception {
	
	private static final long serialVersionUID = -3002467704489626455L;

	/**
	 * @param message
	 * @param cause
	 */
	public ComplaintPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ComplaintPersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ComplaintPersistenceException(Throwable cause) {
		super(cause);
	}
}
