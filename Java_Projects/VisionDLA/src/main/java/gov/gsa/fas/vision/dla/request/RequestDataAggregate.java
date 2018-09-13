/*
 * @(#)RequestDataAggregate.java			Aug 29, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import java.util.List;

import gov.gsa.fas.vision.dla.request.model.IndustryCode;
import gov.gsa.fas.vision.dla.request.model.ItemIdentification;
import gov.gsa.fas.vision.dla.request.model.OrganizationInfo;
import gov.gsa.fas.vision.dla.request.model.ReferenceIdentification;

/**
 * <code>RequestDataAggregate</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class RequestDataAggregate {

	private List<ReferenceIdentification> referenceIdentification;
	private List<OrganizationInfo> organizationInfo;
	private List<IndustryCode> industryCode;
	private List<ItemIdentification> itemIdentification;
	/**
	 * @return the referenceIdentification
	 */
	public List<ReferenceIdentification> getReferenceIdentification() {
		return referenceIdentification;
	}
	/**
	 * @param referenceIdentification the referenceIdentification to set
	 */
	public void setReferenceIdentification(
			List<ReferenceIdentification> referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}
	/**
	 * @return the organizationInfo
	 */
	public List<OrganizationInfo> getOrganizationInfo() {
		return organizationInfo;
	}
	/**
	 * @param organizationInfo the organizationInfo to set
	 */
	public void setOrganizationInfo(List<OrganizationInfo> organizationInfo) {
		this.organizationInfo = organizationInfo;
	}
	/**
	 * @return the industryCode
	 */
	public List<IndustryCode> getIndustryCode() {
		return industryCode;
	}
	/**
	 * @param industryCode the industryCode to set
	 */
	public void setIndustryCode(List<IndustryCode> industryCode) {
		this.industryCode = industryCode;
	}
	/**
	 * @return the itemIdentification
	 */
	public List<ItemIdentification> getItemIdentification() {
		return itemIdentification;
	}
	/**
	 * @param itemIdentification the itemIdentification to set
	 */
	public void setItemIdentification(List<ItemIdentification> itemIdentification) {
		this.itemIdentification = itemIdentification;
	} 
}
