/*
 * @(#)ContactPersistence.java			Mar 13, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.contact.service;

import gov.gsa.fas.persistence.contact.model.CustomerContact;

import java.util.List;

/**
 * <code>ContactPersistence</code> is the persistence interface 
 * which provides operations to retrieve Customer contact related data.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface ContactPersistence {

	/**
	 * Retrieves Customer contact data by Activity Address code 
	 * from Advantage bvdb database.
	 * 
	 * @param 	aac
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */
	public List<CustomerContact> retrieveContactByAAC(String aac) 
								throws ContactPersistenceException;
	
	/**
	 * Retrieves Customer contact data by last name and first name 
	 * from Advantage adb database.
	 * 
	 * @param 	lastName
	 * @param 	firstName
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */
	public List<CustomerContact> retrieveContactByName(String lastName, String firstName) 
													throws ContactPersistenceException;
	
	/**
	 * Retrieves Customer contact data by email 
	 * from Advantage adb database.
	 * 
	 * @param 	email
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */
	public List<CustomerContact> retrieveContactByEmail(String email) 
													throws ContactPersistenceException;
}
