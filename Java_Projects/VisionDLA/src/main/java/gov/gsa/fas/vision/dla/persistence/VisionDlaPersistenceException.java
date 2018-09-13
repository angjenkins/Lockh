/*
 * @(#)VisionDlaPersistenceException.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

/**
 * <code>VisionDlaPersistenceException</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaPersistenceException extends Exception{

	/** Generated serial version Id  */
	private static final long serialVersionUID = -4070001976883104391L;

	/**
	 * 
	 */
	public VisionDlaPersistenceException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public VisionDlaPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public VisionDlaPersistenceException(String message) {
		super(message);
	}

}
