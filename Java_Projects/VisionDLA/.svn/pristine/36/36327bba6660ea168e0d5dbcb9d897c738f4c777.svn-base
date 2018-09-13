/*
 * @(#)EmailNotificationEnum.java			Sep 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mail;

/**
 * <code>EmailNotificationEnum</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public enum EmailNotificationEnum {

	REQUEST_XML_PROCESS_FAILED 		(1,  "REQUEST_XML_PROCESS_FAILED"),
	VISION_DATABASE_ERROR					(2,  "VISION_DATABASE_ERROR"),
	RESPONSE_GENERATION_ERROR			(3,  "RESPONSE_GENERATION_ERROR"),
	RESPONSE_FTP_ERROR						(4,  "RESPONSE_FTP_ERROR");
	
	private int notificationId;
	private String notificationType;
	
	EmailNotificationEnum(int notificationId, String notificationType){
		this.notificationId = notificationId;
		this.notificationType = notificationType;
	}
	
	public int notificationId(){
		return notificationId;
	}
	
	public String notificationType(){
		return notificationType;
	}
}
