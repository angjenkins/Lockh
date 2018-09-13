/*
 * @(#)ResponseData.java			Sep 10, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

/**
 * <code>ResponseData</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class ResponseData {
	private String responseFileName;
	private String responseXml;
	/**
	 * @return the responseFileName
	 */
	public String getResponseFileName() {
		return responseFileName;
	}
	/**
	 * @param responseFileName the responseFileName to set
	 */
	public void setResponseFileName(String responseFileName) {
		this.responseFileName = responseFileName;
	}
	/**
	 * @return the responseXml
	 */
	public String getResponseXml() {
		return responseXml;
	}
	/**
	 * @param responseXml the responseXml to set
	 */
	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}
}
