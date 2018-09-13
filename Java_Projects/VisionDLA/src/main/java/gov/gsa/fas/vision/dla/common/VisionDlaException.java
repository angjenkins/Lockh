/*
 * @(#)VisionDlaException.java			Aug 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.common;

/**
 * <code>VisionDlaException</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaException extends Exception {

	/** Generated serial version Id	 */
	private static final long serialVersionUID = -1547918578255955883L;
	
	private String errorMessage;

	/**
	 * 
	 */
	public VisionDlaException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public VisionDlaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public VisionDlaException(String message) {
		super(message);
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
