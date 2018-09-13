/*
 * @(#)OrganizationInfo.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request.model;

/**
 * <code>OrganizationInfo</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class OrganizationInfo {

	private String name;
	private String idCdQualifier;
	private String entitiyIdCode;
	private String identificationCode;
	/**
	 * @return the idCdQualifier
	 */
	public String getIdCdQualifier() {
		return idCdQualifier;
	}
	/**
	 * @param idCdQualifier the idCdQualifier to set
	 */
	public void setIdCdQualifier(String idCdQualifier) {
		this.idCdQualifier = idCdQualifier;
	}
	/**
	 * @return the entitiyIdCode
	 */
	public String getEntitiyIdCode() {
		return entitiyIdCode;
	}
	/**
	 * @param entitiyIdCode the entitiyIdCode to set
	 */
	public void setEntitiyIdCode(String entitiyIdCode) {
		this.entitiyIdCode = entitiyIdCode;
	}
	/**
	 * @return the identificationCode
	 */
	public String getIdentificationCode() {
		return identificationCode;
	}
	/**
	 * @param identificationCode the identificationCode to set
	 */
	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
