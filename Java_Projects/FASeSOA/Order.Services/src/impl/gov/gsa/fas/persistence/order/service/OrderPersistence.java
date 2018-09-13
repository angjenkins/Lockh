/*
 * @(#)OrderPersistence.java			Feb 29, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.service;

import java.util.List;

import gov.gsa.fas.persistence.order.model.OrderCancel;
import gov.gsa.fas.persistence.order.model.GecoOrderSale;
import gov.gsa.fas.persistence.order.model.GgsOrderSale;
import gov.gsa.fas.persistence.order.model.OrderHistory;
import gov.gsa.fas.persistence.order.model.OrderSale;
import gov.gsa.fas.persistence.order.model.OrderSession;
import gov.gsa.fas.persistence.order.model.OrderShipAddress;

/**
 * <code>OrderPersistence</code> is the persistence interface 
 * which provides operations to retrieve Order related data. 
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface OrderPersistence {

	/**
	 * Retrieves list of <code>OrderSession</code> objects by searching 
	 * Advantage Database by session number.
	 * 
	 * @param 	sessionNo
	 * @return	list of <code>OrderSession</code> objects
	 * @throws 	OrderPersistenceException
	 */
	public List<OrderSession> retrieveOrderSession(int sessionNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves the list of <code>OrderHistory</code> item object for the corresponding 
	 * Order number from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	list of <code>OrderHistory</code> objects
	 * @throws 	OrderPersistenceException
	 */
	public List<OrderHistory> retrieveOrderHistory(long orderNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves the <code>OrderShipAddress</code> object for the corresponding
	 * order number from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>OrderShipAddress</code> object
	 * @throws 	OrderPersistenceException
	 */
	public OrderShipAddress retrieveOrderShippingAddress(long orderNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves the <code>GgsOrderSale</code> object for the corresponding order number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>OrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */
	public OrderSale retrieveOrderSale(long orderNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves the <code>GgsOrderSale</code> object for the corresponding session number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>GgsOrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */
	public GgsOrderSale retrieveOrderSessionSale(Long sessionNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves the <code>GecoOrderSale</code> object for the corresponding geco order number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>GgsOrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */	
	public GecoOrderSale retrieveGecoOrderSale(Long gecoOrderNo) throws OrderPersistenceException;
	
	/**
	 * Retrieves PO related information like po no by web order number, manufacture part number
	 * and prefix.
	 * 
	 * @param 	ggsSessionNumber
	 * @param 	manufacturePartNumber
	 * @param 	prefix
	 * @return	poNumber string
	 * @throws 	OrderPersistenceException
	 */
	public String retrievePOData(long webOrderNumber,String manufacturePartNumber, String prefix) 
													throws OrderPersistenceException;
	
	/**
	 * Persists order cancel request in legacy VISS database.
	 * 
	 * @param 	ordCancel
	 * @return	true, if successful
	 * @throws 	OrderPersistenceException
	 */
	public boolean cancelOrder(OrderCancel ordCancel) throws OrderPersistenceException;
}
