/*
 * @(#)ComplaintPersistence.java			Aug 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.complaint.service;

import gov.gsa.fas.persistence.order.complaint.model.OrderComplaint;
import gov.gsa.fas.persistence.order.complaint.model.OrderInvestigation;

/**
 * <code>ComplaintPersistence</code> is the persistence interface 
 * which provides operations to save and retrieve Order complaint,
 * investigation related data.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface ComplaintPersistence {

	/**
	 * Creates order quality complain data in OCMS system.
	 * 
	 * @param 	orderComplaint <code>OrderComplaint</code> object
	 * @return	complaint key
	 * @throws 	ComplaintPersistenceException
	 */
	public long createComplaint(OrderComplaint orderComplaint) 
												throws ComplaintPersistenceException;

	/**
	 * Retrieves order quality complaint data from OCMS system for the corresponding
	 * complaint key.
	 * 
	 * @param 	complaintKey
	 * @return	<code>OrderComplaint</code> object
	 * @throws 	ComplaintPersistenceException
	 */
	public OrderComplaint retrieveComplaint(long complaintKey) 
												throws ComplaintPersistenceException; 	
	
	/**
	 * Updates order quality complaint data in the OCMS system
	 * for the specified complaint key.
	 * 
	 * @param 	orderComplaint modified <code>OrderComplaint</code> object
	 * @param 	existComplaint existing <code>OrderComplaint</code> object
	 * @return	true, if successful
	 * @throws 	ComplaintPersistenceException
	 */
	public boolean updateComplaint(OrderComplaint orderComplaint, 
			OrderComplaint existComplaint) throws ComplaintPersistenceException;
	
	/**
	 * Cancels order quality complaint in the OCMS systems
	 * by updating "CMPLNT_CLOSED" to "Y".
	 * 
	 * @param 	complaintKey
	 * @return	true if successful
	 * @throws 	ComplaintPersistenceException
	 */
	public boolean cancelComplaint(long complaintKey) 
												throws ComplaintPersistenceException;
	
	/**
	 * Retrieves the investigation details in the OCMS system
	 * for the corresponding complaint key
	 * 
	 * @param 	complaintKey
	 * @return	<code>OrderInvestigation</code> object
	 * @throws 	ComplaintPersistenceException
	 */
	public OrderInvestigation retrieveInvestigation(long complaintKey)
												throws ComplaintPersistenceException;
}
