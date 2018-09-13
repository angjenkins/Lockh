/*
 * @(#)TransactionPersistenceException.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.service;

import javax.ejb.ApplicationException;

/**
 * <code>TransactionPersistenceException</code> is the custom exception thrown 
 * if any failure or error occurs while persisting Discrepancy Transactions.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

@ApplicationException(rollback=true) 
public class TransactionPersistenceException extends Exception {

	private static final long serialVersionUID = 9032463699728640868L;
	/**
	 * @param message
	 * @param cause
	 */
	public TransactionPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public TransactionPersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public TransactionPersistenceException(Throwable cause) {
		super(cause);
	}
}
