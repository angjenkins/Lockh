/*
 * @(#)AdministrativeContact.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request.model;

/**
 * <code>AdministrativeContact</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class AdministrativeContact {
	private String functionCode;
	private String contactName;
	private String qualifier;
	private String contact;
	private String qualifier1;
	private String contact1;
	private String qualifier2;
	private String contact2;
	private boolean isNonConformance;
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the qualifier
	 */
	public String getQualifier() {
		return qualifier;
	}
	/**
	 * @param qualifier the qualifier to set
	 */
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the qualifier1
	 */
	public String getQualifier1() {
		return qualifier1;
	}
	/**
	 * @param qualifier1 the qualifier1 to set
	 */
	public void setQualifier1(String qualifier1) {
		this.qualifier1 = qualifier1;
	}
	/**
	 * @return the contact1
	 */
	public String getContact1() {
		return contact1;
	}
	/**
	 * @param contact1 the contact1 to set
	 */
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	/**
	 * @return the qualifier2
	 */
	public String getQualifier2() {
		return qualifier2;
	}
	/**
	 * @param qualifier2 the qualifier2 to set
	 */
	public void setQualifier2(String qualifier2) {
		this.qualifier2 = qualifier2;
	}
	/**
	 * @return the contact2
	 */
	public String getContact2() {
		return contact2;
	}
	/**
	 * @param contact2 the contact2 to set
	 */
	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}
	/**
	 * @return the functionCode
	 */
	public String getFunctionCode() {
		return functionCode;
	}
	/**
	 * @param functionCode the functionCode to set
	 */
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
	/**
	 * @return the isNonConformance
	 */
	public boolean isNonConformance() {
		return isNonConformance;
	}
	/**
	 * @param isNonConformance the isNonConformance to set
	 */
	public void setNonConformance(boolean isNonConformance) {
		this.isNonConformance = isNonConformance;
	}
	
}
