/*
 * @(#)EmailNotification.java			Sep 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mail;

import java.util.List;

/**
 * <code>EmailNotification</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailNotification {

	private String notificationType;
	private List<String> toAddress;
	private String fromAddress;
	private List<String> ccAddress;
	private String subject;
	private String content;
	/**
	 * @return the notificationType
	 */
	public String getNotificationType() {
		return notificationType;
	}
	/**
	 * @param notificationType the notificationType to set
	 */
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}
	/**
	 * @return the toAddress
	 */
	public List<String> getToAddress() {
		return toAddress;
	}
	/**
	 * @param toAddress the toAddress to set
	 */
	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}
	/**
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}
	/**
	 * @param fromAddress the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	/**
	 * @return the ccAddress
	 */
	public List<String> getCcAddress() {
		return ccAddress;
	}
	/**
	 * @param ccAddress the ccAddress to set
	 */
	public void setCcAddress(List<String> ccAddress) {
		this.ccAddress = ccAddress;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
