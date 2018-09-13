/*
 * @(#)OrderDiscrepancyTransactionImpl.java			Jun 10, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.orderdiscrepancy.v1;

import java.util.HashMap;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistence;
import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistenceException;
import gov.gsa.fas.services.messages.v1.DiscrepancyTransactions;
import gov.gsa.fas.services.messages.v1.TransactionsResponse;

/**
 * <code>OrderDiscrepancyTransactionImpl</code> provides service implementation for
 * OrderDiscrepancyTransactionService.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     gov.gsa.fas.services.orderdiscrepancy.v1.OrderDiscrepancyTransaction
 */

@WebContext(contextRoot = "/order.services", urlPattern = "/OrderDiscrepancyTransaction")
@WebService(endpointInterface = "gov.gsa.fas.services.orderdiscrepancy.v1.OrderDiscrepancyTransaction", portName = "OrderDiscrepancyTransaction", targetNamespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(OrderDiscrepancyTransaction.class)
@Stateless

public class OrderDiscrepancyTransactionImpl implements
		OrderDiscrepancyTransaction {
	
	private static final Logger logger = Logger.getLogger(OrderDiscrepancyTransactionImpl.class.getName());

	/**
	 * Processes and persists Order discrepancy transactions in the VISS DB.
	 * 
	 * @param 	discrepancyTransactions <code>DiscrepancyTransactions</code> object
	 * @return	<code>TransactionsResponse</code> object
	 * @throws 	ServiceFault, if any system error occurs
	 */
	@Override
	public TransactionsResponse createDiscrepancyTransactions(
			DiscrepancyTransactions discrepancyTransactions) throws ServiceFault {
		logger.info("createDiscrepancyTransactions(): Processing Order Discrepancy Transactions");
		//Validations
		TransactionsResponse transResp = TransactionValidator.validateTransactions(
				discrepancyTransactions);
		//Check size of Transaction responses, if 0 throw Service Fault
		if(transResp.getTransactionResponse() != null && 
				transResp.getTransactionResponse().size() == 0){
			throw new ServiceFault("", TransactionHelper.createFault("E", "Transaction input request is empty"));
		}
		//If any validations failed return response
		if(!transResp.isAllSuccessful()){
			return transResp;
		}
		//Transformation
		HashMap<String, Object> transPersMap = TransactionTransformation.transformTransactions(
				discrepancyTransactions);
		//Check existence
		transResp = TransactionHelper.checkTransactionsExist(transPersMap);
		//If any transaction exists return response
		if(!transResp.isAllSuccessful()){
			return transResp;
		}		
		//Persist Transactions
		transResp = persistTransactions(transPersMap, discrepancyTransactions);
		return transResp;
	}
	
	/**
	 * Resets ZKP transaction table, by deleting all records.
	 * 
	 * @param 	resetReq, empty reset request
	 * @return	true, if successful
	 * @throws 	ServiceFault
	 */
	public boolean resetZKP(RequestZkpReq resetReq) throws ServiceFault {
		logger.info("resetZKP(): Resetting ZKP transaction table");
		TransactionPersistence tranPers = TransactionHelper.getTransactionPersistenceLocal();
		boolean isDeleted = false;
		try {
			isDeleted = tranPers.deleteZkp();
		} catch (TransactionPersistenceException tpe) {
			logger.error("resetZKP():Failed to reset ZKP Transaction table");
			throw new ServiceFault("", TransactionHelper.createFault("E", "Failed to reset ZKP transaction records-" + tpe.getMessage()));	
		}
		return isDeleted;
	}	
	
	/**
	 * Persists all transactions by delegating call to TransactionsPersistence.
	 * 
	 * @param transPersMap
	 * @param transactions
	 * @return
	 * @throws ServiceFault
	 */
	private TransactionsResponse persistTransactions(HashMap<String, Object> transPersMap, 
			DiscrepancyTransactions transactions) throws ServiceFault{
		if(transPersMap == null || transPersMap.size() == 0){
			logger.error("persistTransactions(): Transactions map is null or empty");
			return null;
		}
		logger.info("persistTransactions(): Persisting Transactions size->" + transPersMap.size());
		TransactionPersistence tranPers = TransactionHelper.getTransactionPersistenceLocal();
		boolean isPersisted = false;
		try {
			isPersisted = tranPers.createTransactions(transPersMap);
		} catch (TransactionPersistenceException tpe) {
			logger.error("persistTransactions():Failed to persist Transactions");
			throw new ServiceFault("",  TransactionHelper.createFault("E", "System Failure:Failed to persist Transactions-" + tpe.getMessage()));	
		}
		TransactionsResponse transResponse = TransactionHelper.createTransactionsResponse(isPersisted, transactions);
		return transResponse;
	}	
}
