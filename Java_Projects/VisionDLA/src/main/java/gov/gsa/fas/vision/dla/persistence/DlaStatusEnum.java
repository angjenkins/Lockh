/*
 * @(#)DlaStatusEnum.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

/**
 * <code>DlaStatusEnum</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public enum DlaStatusEnum {

	REQUEST_RECEIVED 										(1,  "Request Data Received"),
	REQUEST_SCHEMA_VALIDATION_FAILED		(2,  "Request XML Schema Validation Failed"),
	REQUEST_READY_TO_SEND								(3,  "Request Data Ready To Send Salesforce"),
	REQUEST_SENT_SF											(4,  "Request Data Transmitted To Salesforce"),
	REQUEST_SEND_SF_FAILED							(5,  "Request Data Transmission To Salesforce Failed"),
	RESPONSE_RECEIVED										(6,  "Response Data Received From Salesforce"),
	RESPONSE_RECEIVE_FAILED							(7,  "Response Data Receive Failed"),
	RESPONSE_XML_GEN_FAILED							(8, "Response XML Generation Failed"),
	RESPONSE_SENT_DLA										(9, "Response Data Transmitted To DLA"),
	RESPONSE_SEND_DLA_FAILED						(10, "Response Data Transmission To DLA Failed"),
	SYSTEM_ERROR												(15, "System Error");
	
	private final int statusId;
	private final String status;
	
	DlaStatusEnum(int statusId, String status){
		this.statusId = statusId;
		this.status = status;
	}
	
	public int statusId(){
		return statusId;
	}
	
	public String status(){
		return  status;
	}
}
