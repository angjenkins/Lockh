/*
 * @(#)TransactionPersistence.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.service;

import java.util.HashMap;

import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.VendorOffsetTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZlaTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZsaTransaction;

/**
 * <code>TransactionPersistence</code> is the persistence interface 
 * which provides operations to persist order discrepancy transactions.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface TransactionPersistence {
	
	/**
	 * Create order discrepancy transactions. If one transaction 
	 * creation failed, then remaining all transactions will be rolled
	 * back.
	 * 
	 * @param 	transactions
	 * @return	true, if successful
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createTransactions(HashMap<String, Object> transPersMap)
														throws TransactionPersistenceException;

	/**
	 * Creates "ZKP" transaction record.
	 * 
	 * @param 	zkp	<code>ZkpTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createZkp(ZkpTransaction zkp)
			throws TransactionPersistenceException;

	/**
	 * Creates "Finance305" transaction record.
	 * 
	 * @param 	fin305 <code>Finance305Transaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createFinance305(Finance305Transaction fin305)
			throws TransactionPersistenceException;

	/**
	 * Creates "Reshipment(A15)" transaction record.
	 * 
	 * @param 	reship <code>ReshipmentTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createReshipment(ReshipmentTransaction reship)
			throws TransactionPersistenceException;

	/**
	 * Creates "MaterialReturn(ZAU)" transaction record.
	 * 
	 * @param 	mr <code>MaterialReturnTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createMaterialReturn(MaterialReturnTransaction mr)
			throws TransactionPersistenceException;

	/**
	 * Creates "ZLA" transaction record.
	 * 
	 * @param 	zla	<code>ZlaTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createZla(ZlaTransaction zla)
			throws TransactionPersistenceException;

	/**
	 * Creates "ZSA" transaction record.
	 * 
	 * @param 	zsa, <code>ZsaTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createZsa(ZsaTransaction zsa)
			throws TransactionPersistenceException;

	/**
	 * Creates "VendorOffset" transaction record.
	 * 
	 * @param 	vo, <code>VendorOffsetTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	public boolean createVendorOffset(VendorOffsetTransaction vo)
			throws TransactionPersistenceException;
	
	/**
	 * Retrieves Zkp transaction for the provided requisition Number
	 * and requisition suffix.
	 * 
	 * @param 	reqNo	Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @return	return <code>ZkpTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ZkpTransaction retrieveZkp(String reqNo, String reqSuffix) 									
													throws TransactionPersistenceException;

	/**
	 * Retrieves Finance305 transaction for the provided requisition number
	 * and requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @param 	actionType Credit or Debit
	 * @return	<code>Finance305Transaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public Finance305Transaction retrieveFinance305(String reqNo, String reqSuffix,
			String actionType) throws TransactionPersistenceException;
	
	/**
	 * Retrieves Reshipment transaction for the provided requisition Number.
	 * 
	 * @param 	reqNo Requisition Number
	 * @return	return <code>ReshipmentTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ReshipmentTransaction retrieveReshipment(String reqNo) 									
													throws TransactionPersistenceException;
	
	/**
	 * Retrieves Material Return transaction for the provided requisition Number
	 * and requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @return	return <code>MaterialReturnTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public MaterialReturnTransaction retrieveMaterialReturn(String reqNo, String reqSuffix) 									
													throws TransactionPersistenceException;	
	
	/**
	 * Retrieves ZLA transaction for the provided requisition number, requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @return	<code>ZlaTransaction</code> object
	 * @param 	actionType Credit or Debit
	 * @throws 	TransactionPersistenceException
	 */
	public ZlaTransaction retrieveZla(String reqNo, String reqSuffix,
			String actionType) throws TransactionPersistenceException;
	
	/**
	 * Retrieves ZSA transaction for the provided requisition number, requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @param 	actionType Credit or Debit
	 * @return	<code>ZsaTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ZsaTransaction retrieveZsa(String reqNo, String reqSuffix,
			String actionType) throws TransactionPersistenceException;	
	
	/**
	 * Retrieves Vendor Offset transaction for the provided PO Number.
	 * 
	 * @param 	poNo PO Number
	 * @return	<code>ZsaTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public VendorOffsetTransaction retrieveVendorOffset(String poNo) 
				throws TransactionPersistenceException;		
	
	/**
	 * Deletes all Zkp records from ZKP transaction table.
	 * 
	 * @return	true, if successful
	 * @throws 	TransactionPersistenceException
	 */
	public boolean deleteZkp() throws TransactionPersistenceException;
	
}
