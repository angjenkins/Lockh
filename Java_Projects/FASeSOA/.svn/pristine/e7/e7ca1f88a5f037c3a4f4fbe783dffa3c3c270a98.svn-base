/*
 * @(#)VendorPersistence.java			Aug 20, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.service;

import gov.gsa.fas.persistence.vendor.model.VendorContract;
import gov.gsa.fas.persistence.vendor.model.VendorInfo;
import gov.gsa.fas.persistence.vendor.model.VendorInvoice;

/**
 * <code>VendorPersistence</code> is the persistence interface 
 * which provides operations to retrieve Vendor related data.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface VendorPersistence {

	/**
	 * Retrieves Vendor company information by DUNS Number.
	 * 
	 * @param 	dunsNo
	 * @return	<code>VendorInfo</code> vendor company information
	 * @throws 	VendorPersistenceException
	 */
	public VendorInfo retrieveVendorInfo(String dunsNo) 
											throws VendorPersistenceException;
	
	/**
	 * Retrieves Vendor invoice related information by PO
	 * number.
	 * 
	 * @param 	poNumber
	 * @return	<code>VendorInvoice</code> vendor invoice information
	 * @throws 	VendorPersistenceException
	 */
	public VendorInvoice retrieveVendorInvoice(String poNumber)
											throws VendorPersistenceException;
	
	/**
	 * Retrieves Vendor Contract and Fax information by PO number.
	 * 
	 * @param 	poNumber
	 * @return	<code>VendorContract</code> vendor contract information
	 * @throws 	VendorPersistenceException
	 */
	public VendorContract retrieveVendorContract(String poNumber)
											throws VendorPersistenceException; 
}
