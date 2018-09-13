/*
 * @(#)PriceCheckPersistence.java			May 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.pricing.service;

import gov.gsa.fas.persistence.pricing.model.EddItemPrice;
import gov.gsa.fas.persistence.pricing.model.NiinItemPrice;

import java.util.List;

/**
 * <code>PriceCheckPersistence</code> is the persistence interface 
 * which provides operations to retrieve pricing information
 * for CSC system items. 
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface PriceCheckPersistence {

	/**
	 * Retrieves the list of <code>EddItemPrice</code> objects for the corresponding
	 * EDD prefix and manufacture part number.
	 * 
	 * @param 	prefix
	 * @param 	mfrPartNo
	 * @return	list of <code>EddItemPrice</code> objects
	 * @throws 	PricePersistenceException
	 */
	public List<EddItemPrice> retrieveEddItemPrice(String prefix, String mfrPartNo) throws PricePersistenceException;
	
	/**
	 * Retrieves the <code>NiinItemPrice</code> object for the corresponding NIIN7 and store.
	 * 
	 * @param 	niin7
	 * @param 	store
	 * @return	<code>NiinItemPrice</code> object
	 * @throws 	PricePersistenceException
	 */
	public NiinItemPrice retrieveNiinItemPrice(String niin7, String store) throws PricePersistenceException;
}
