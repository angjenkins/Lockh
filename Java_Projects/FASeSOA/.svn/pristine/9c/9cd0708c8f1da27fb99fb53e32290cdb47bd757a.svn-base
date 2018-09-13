/*
 * @(#)TransactionHelper.java			Sep 7, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.orderdiscrepancy.v1;

import java.util.HashMap;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.VendorOffsetTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZlaTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZsaTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistence;
import gov.gsa.fas.persistence.orderdiscrepancy.service.TransactionPersistenceException;
import gov.gsa.fas.services.messages.v1.TransactionResponse;
import gov.gsa.fas.services.messages.v1.TransactionResponse.Message;
import gov.gsa.fas.services.messages.v1.DiscrepancyTransactions;
import gov.gsa.fas.services.messages.v1.TransactionType;
import gov.gsa.fas.services.messages.v1.TransactionsResponse;

/**
 * <code>TransactionHelper</code> provides helper methods
 * for processing transactions.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class TransactionHelper {
	
	private static final Logger logger = Logger.getLogger(TransactionHelper.class.getName());
	private static InitialContext ctx;
	
	/**
	 * Creates transactions response boolean parameter.
	 * 
	 * @param 	isPersisted
	 * @param 	transactions
	 * @return	<code>TransactionsResponse</code> object.
	 */
	static TransactionsResponse createTransactionsResponse(
			boolean isPersisted, DiscrepancyTransactions transactions) {
		logger.info("validateTransactions(): Validating all Transactions");
		TransactionsResponse transResp = new TransactionsResponse();
		transResp.setAllSuccessful(isPersisted);
		if(transactions.getZkp() != null){
			TransactionResponse zkpResp = new TransactionResponse();
			zkpResp.setSuccessful(isPersisted);
			zkpResp.setTransactionType(TransactionType.ZKP);
			transResp.getTransactionResponse().add(zkpResp);
		}
		if(transactions.getFinance305Credit() != null){
			TransactionResponse fin305CreditResp = new TransactionResponse();
			fin305CreditResp.setSuccessful(isPersisted);
			fin305CreditResp.setTransactionType(TransactionType.FINANCE_305_CREDIT);
			transResp.getTransactionResponse().add(fin305CreditResp);		
		}
		if(transactions.getFinance305Debit() != null){
			TransactionResponse fin305DebitResp = new TransactionResponse();
			fin305DebitResp.setSuccessful(isPersisted);
			fin305DebitResp.setTransactionType(TransactionType.FINANCE_305_DEBIT);
			transResp.getTransactionResponse().add(fin305DebitResp);						
		}		
		if(transactions.getReshipment() != null){
			TransactionResponse reshipResp = new TransactionResponse();
			reshipResp.setSuccessful(isPersisted);
			reshipResp.setTransactionType(TransactionType.RESHIPMENT);
			transResp.getTransactionResponse().add(reshipResp);		
		}
		if(transactions.getMaterialReturn() != null){
			TransactionResponse mraResp = new TransactionResponse();
			mraResp.setSuccessful(isPersisted);
			mraResp.setTransactionType(TransactionType.MATERIAL_RETURN);
			transResp.getTransactionResponse().add(mraResp);			
		}
		if(transactions.getZlaCredit() != null){
			TransactionResponse zlaCreditResp = new TransactionResponse();
			zlaCreditResp.setSuccessful(isPersisted);
			zlaCreditResp.setTransactionType(TransactionType.ZLA_CREDIT);
			transResp.getTransactionResponse().add(zlaCreditResp);					
		}
		if(transactions.getZlaDebit() != null){
			TransactionResponse zlaDebitResp = new TransactionResponse();
			zlaDebitResp.setSuccessful(isPersisted);
			zlaDebitResp.setTransactionType(TransactionType.ZLA_DEBIT);
			transResp.getTransactionResponse().add(zlaDebitResp);						
		}		
		if(transactions.getZsaCredit() != null){
			TransactionResponse zsaCreditResp = new TransactionResponse();
			zsaCreditResp.setSuccessful(isPersisted);
			zsaCreditResp.setTransactionType(TransactionType.ZSA_CREDIT);
			transResp.getTransactionResponse().add(zsaCreditResp);				
		}
		if(transactions.getZsaDebit() != null){
			TransactionResponse zsaDebitResp = new TransactionResponse();
			zsaDebitResp.setSuccessful(isPersisted);
			zsaDebitResp.setTransactionType(TransactionType.ZSA_DEBIT);
			transResp.getTransactionResponse().add(zsaDebitResp);					
		}
		if(transactions.getZsaPZ() != null){
			TransactionResponse zsaPzResp = new TransactionResponse();
			zsaPzResp.setSuccessful(isPersisted);
			zsaPzResp.setTransactionType(TransactionType.ZSA_PZ);
			transResp.getTransactionResponse().add(zsaPzResp);			
		}		
		if(transactions.getVendorOffset() != null){
			TransactionResponse voResp = new TransactionResponse();
			voResp.setSuccessful(isPersisted);
			voResp.setTransactionType(TransactionType.VENDOR_OFFSET);
			transResp.getTransactionResponse().add(voResp);					
		}
		return transResp;
	}		
	
	/**
	 * Checks whether transactions exists or not.
	 * 
	 * @param transPersMap
	 * @return
	 * @throws ServiceFault
	 */
	static TransactionsResponse checkTransactionsExist(HashMap<String, Object> transPersMap) 
												throws ServiceFault{
		TransactionsResponse transResponse = new TransactionsResponse();
		logger.info("checkTransactionsExist(): Checking whether Transactions Exists already");
		if(transPersMap.containsKey(TransactionType.ZKP.value())){
			TransactionResponse zkpResp = checkZkpExists((ZkpTransaction)transPersMap.get(
					TransactionType.ZKP.value()));
			transResponse.getTransactionResponse().add(zkpResp);
		}
		if(transPersMap.containsKey(TransactionType.FINANCE_305_CREDIT.value())){
			TransactionResponse fin305Resp = checkFinance305Exists((Finance305Transaction)transPersMap.get(
					TransactionType.FINANCE_305_CREDIT.value()), 
					TransactionConstants.ACTION_CREDIT);
			transResponse.getTransactionResponse().add(fin305Resp);
		}
		if(transPersMap.containsKey(TransactionType.FINANCE_305_DEBIT.value())){
			TransactionResponse fin305Resp = checkFinance305Exists((Finance305Transaction)transPersMap.get(
					TransactionType.FINANCE_305_DEBIT.value()), 
					TransactionConstants.ACTION_DEBIT);
			transResponse.getTransactionResponse().add(fin305Resp);
		}
		if(transPersMap.containsKey(TransactionType.RESHIPMENT.value())){
			TransactionResponse reshipResp = checkReshipmentExists((ReshipmentTransaction)transPersMap.get(
					TransactionType.RESHIPMENT.value()));
			transResponse.getTransactionResponse().add(reshipResp);
		}
		if(transPersMap.containsKey(TransactionType.MATERIAL_RETURN.value())){
			TransactionResponse mraResp = checkMRAExists((MaterialReturnTransaction)transPersMap.get(
					TransactionType.MATERIAL_RETURN.value()));
			transResponse.getTransactionResponse().add(mraResp);
		}
		if(transPersMap.containsKey(TransactionType.ZLA_CREDIT.value())){
			TransactionResponse zlaResp = checkZlaExists((ZlaTransaction)transPersMap.get(
					TransactionType.ZLA_CREDIT.value()), TransactionConstants.ACTION_CREDIT);
			transResponse.getTransactionResponse().add(zlaResp);
		}
		if(transPersMap.containsKey(TransactionType.ZLA_DEBIT.value())){
			TransactionResponse zlaResp = checkZlaExists((ZlaTransaction)transPersMap.get(
					TransactionType.ZLA_DEBIT.value()), TransactionConstants.ACTION_DEBIT);
			transResponse.getTransactionResponse().add(zlaResp);
		}
		if(transPersMap.containsKey(TransactionType.ZSA_CREDIT.value())){
			TransactionResponse zsaResp = checkZsaExists((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_CREDIT.value()), TransactionConstants.ACTION_CREDIT);
			transResponse.getTransactionResponse().add(zsaResp);
		}
		if(transPersMap.containsKey(TransactionType.ZSA_DEBIT.value())){
			TransactionResponse zsaResp = checkZsaExists((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_DEBIT.value()), TransactionConstants.ACTION_DEBIT);
			transResponse.getTransactionResponse().add(zsaResp);
		}
		if(transPersMap.containsKey(TransactionType.ZSA_PZ.value())){
			TransactionResponse zsaResp = checkZsaExists((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_PZ.value()), TransactionConstants.ACTION_PZ);
			transResponse.getTransactionResponse().add(zsaResp);
		}
		if(transPersMap.containsKey(TransactionType.VENDOR_OFFSET.value())){
			TransactionResponse voResp = checkVendorOffsetExists((VendorOffsetTransaction)transPersMap.get(
					TransactionType.VENDOR_OFFSET.value()));
			transResponse.getTransactionResponse().add(voResp);
		}		
		transResponse.setAllSuccessful(true);
		//For setting overall response
		for(TransactionResponse resp : transResponse.getTransactionResponse()){
			if(!resp.isSuccessful()){
				transResponse.setAllSuccessful(false);
			}
		}
		//If Overall failed, then set remaining all failed
		if(!transResponse.isAllSuccessful()){
			for(TransactionResponse resp : transResponse.getTransactionResponse()){
				resp.setSuccessful(false);
			}	
		}
		return transResponse;
	}

	/**
	 * Check whether ZKP transaction exists or not.
	 * 
	 * @param transPersMap
	 * @param transResponse
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkZkpExists(ZkpTransaction zkpPersModel) 
															throws ServiceFault{
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		ZkpTransaction zkpExists = null;
		try {
			zkpExists = tranPers.retrieveZkp(zkpPersModel.getRequisitionNumber(), 
						zkpPersModel.getRequisitionSuffix());
		}catch (TransactionPersistenceException tpe) {
			logger.error("checkZkpExists(): System Failure: Failed to get ZKP Transaction->" + zkpPersModel.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get ZKP Transaction-" + tpe.getMessage()));
		}
		if(zkpExists != null){
			logger.error("checkZkpExists(): ZKP transaction exists for Req No->" + 
						zkpPersModel.getRequisitionNumber() + " And Suffix->" + zkpPersModel.getRequisitionSuffix());
			return createExistsTransactionResponse(TransactionType.ZKP);
		}
		TransactionResponse zkpResp = new TransactionResponse();
		zkpResp.setTransactionType(TransactionType.ZKP);
		zkpResp.setSuccessful(true);
		return zkpResp;
	}
	
	/**
	 * Checks whether Finance305 Transaction exists or not.
	 * 
	 * @param fin305PersModel
	 * @param actionType
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkFinance305Exists(Finance305Transaction fin305PersModel, 
			String actionType) throws ServiceFault{
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		Finance305Transaction fin305Exists = null;
		try {
			fin305Exists = tranPers.retrieveFinance305(fin305PersModel.getRequisitionNumber(), 
					fin305PersModel.getRequisitionSuffix(), actionType);
		} catch (TransactionPersistenceException tpe) {
			logger.error("checkFinance305Exists(): System Failure: Failed to get Finance305 Transaction for Req No->" + 
					fin305PersModel.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Finance305 Transaction-" + tpe.getMessage()));
		}
		if(fin305Exists != null){
			if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
				logger.error("checkFinance305Exists(): Finance305 transaction exists for Req No->" + 
						fin305PersModel.getRequisitionNumber() + " And Suffix->" + fin305PersModel.getRequisitionSuffix());
				return createExistsTransactionResponse(TransactionType.FINANCE_305_CREDIT);
			}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
				logger.error("checkFinance305Exists(): Finance305 transaction exists for Req No->" + 
							fin305PersModel.getRequisitionNumber() + " And Suffix->" + fin305PersModel.getRequisitionSuffix());						
				return createExistsTransactionResponse(TransactionType.FINANCE_305_DEBIT);
			}
		}	
		TransactionResponse fin305Resp = new TransactionResponse();
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			fin305Resp.setTransactionType(TransactionType.FINANCE_305_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			fin305Resp.setTransactionType(TransactionType.FINANCE_305_DEBIT);
		}
		fin305Resp.setSuccessful(true);
		return fin305Resp;
	}
	
	/**
	 * Checks whether Reshipment transaction exists or not.
	 * 
	 * @param reshipPersModel
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkReshipmentExists(ReshipmentTransaction reshipPersModel) 
																						throws ServiceFault{
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		ReshipmentTransaction reshipExists = null;
		try {
			reshipExists = tranPers.retrieveReshipment(reshipPersModel.getRequisitionNumber());
		} catch (TransactionPersistenceException tpe) {
			logger.error("checkReshipmentExists(): System Failure: Failed to get Reshipment Transaction->" + reshipPersModel.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Reshipment Transaction-" + tpe.getMessage()));
		}
		if(reshipExists != null){
			logger.error("checkReshipmentExists(): Reshipment transaction exists for Req No->" + 
					reshipPersModel.getRequisitionNumber());
			return createExistsTransactionResponse(TransactionType.RESHIPMENT);
		}
		TransactionResponse reshipResp = new TransactionResponse();
		reshipResp.setSuccessful(true);
		reshipResp.setTransactionType(TransactionType.RESHIPMENT);
		return reshipResp;
	}
	
	/**
	 * Checks whether MaterialReturn Transaction exists or not.
	 * 
	 * @param mrPersModel
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkMRAExists(MaterialReturnTransaction mrPersModel) 
																								throws ServiceFault	{
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		MaterialReturnTransaction mraExists = null;
		try {
			mraExists = tranPers.retrieveMaterialReturn(mrPersModel.getRequisitionNumber(), 
					mrPersModel.getRequisitionSuffix());
		} catch (TransactionPersistenceException tpe) {
			logger.error("checkMRAExists(): System Failure: Failed to get Material Return Transaction->" + 
					mrPersModel.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Material Return Transaction-" + tpe.getMessage()));
		}
		if(mraExists != null){
			logger.error("checkMRAExists(): Material Return transaction exists for Req No->" + 
					mrPersModel.getRequisitionNumber() + " And Suffix->" + mrPersModel.getRequisitionSuffix());
			TransactionResponse transResp = createExistsTransactionResponse(TransactionType.MATERIAL_RETURN);
			return transResp;
		}	
		TransactionResponse mrResp = new TransactionResponse();
		mrResp.setSuccessful(true);
		mrResp.setTransactionType(TransactionType.MATERIAL_RETURN);
		return mrResp;		
	}
	
	/**
	 * Checks whether ZLA Transaction exists or not.
	 * 
	 * @param zlaPers
	 * @param actionType
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkZlaExists(ZlaTransaction zlaPers, 
			String actionType) throws ServiceFault{	
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		ZlaTransaction zlaExists = null;
		try {
			zlaExists = tranPers.retrieveZla(zlaPers.getRequisitionNumber(), 
					zlaPers.getRequisitionSuffix(), actionType);
		} catch (TransactionPersistenceException tpe) {
			logger.error("checkZlaExists(): System Failure: Failed to get Zla Transaction for Requisition No->" + 
					zlaPers.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get ZLA Transaction-" + tpe.getMessage()));
		}
		if(zlaExists != null){
			if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
				logger.error("checkZlaExists(): ZLA transaction exists for Req No->" + 
						zlaPers.getRequisitionNumber() + " And Suffix->" + zlaPers.getRequisitionSuffix());
				return createExistsTransactionResponse(TransactionType.ZLA_CREDIT);
			}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
				logger.error("checkZlaExists(): ZLA transaction exists for Req No->" + 
							zlaPers.getRequisitionNumber() + " And Suffix->" + zlaPers.getRequisitionSuffix());						
				return createExistsTransactionResponse(TransactionType.ZLA_DEBIT);
			}
		}
		TransactionResponse zlaResp = new TransactionResponse();
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			zlaResp.setTransactionType(TransactionType.ZLA_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			zlaResp.setTransactionType(TransactionType.ZLA_DEBIT);
		}		
		zlaResp.setSuccessful(true);
		return zlaResp;		
	}
	
	/**
	 * Checks whether ZSA transaction exists or not.
	 * 
	 * @param zsaPersModel
	 * @param actionType
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkZsaExists(ZsaTransaction zsaPersModel, 
			String actionType) throws ServiceFault{	
		TransactionPersistence tranPers = TransactionHelper.getTransactionPersistenceLocal();
		ZsaTransaction zsaExists = null;
		try {
			zsaExists = tranPers.retrieveZsa(zsaPersModel.getRequisitionNumber(), 
					zsaPersModel.getRequisitionSuffix(), actionType);
		} catch (TransactionPersistenceException tpe) {
			logger.error("checkZsaExists(): System Failure: Failed to get Zsa Transaction for Requisition No->" + 
					zsaPersModel.getRequisitionNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get ZSA Transaction-" + tpe.getMessage()));
		}
		if(zsaExists != null){
			if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
				logger.error("checkZsaExists(): ZSA transaction exists for Req No->" + 
						zsaPersModel.getRequisitionNumber() + " And Suffix->" + zsaPersModel.getRequisitionSuffix());
				return createExistsTransactionResponse(TransactionType.ZSA_CREDIT);
			}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
				logger.error("checkZsaExists(): ZSA transaction exists for Req No->" + 
							zsaPersModel.getRequisitionNumber() + " And Suffix->" + zsaPersModel.getRequisitionSuffix());						
				return createExistsTransactionResponse(TransactionType.ZSA_DEBIT);
			}else if(actionType.equals(TransactionConstants.ACTION_PZ)){
				logger.error("checkZsaExists(): ZSA transaction exists for Req No->" + 
							zsaPersModel.getRequisitionNumber() + " And Suffix->" + zsaPersModel.getRequisitionSuffix());						
				return createExistsTransactionResponse(TransactionType.ZSA_PZ);
			}
		}
		TransactionResponse zsaResp = new TransactionResponse();
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			zsaResp.setTransactionType(TransactionType.ZSA_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			zsaResp.setTransactionType(TransactionType.ZSA_DEBIT);
		}else if(actionType.equals(TransactionConstants.ACTION_PZ)){
			zsaResp.setTransactionType(TransactionType.ZSA_PZ);
		}		
		zsaResp.setSuccessful(true);
		return zsaResp;		
	}
	
	/**
	 * Checks whether Vendor Offset transaction exists or not
	 * 
	 * @param voPersModel
	 * @return
	 * @throws ServiceFault
	 */
	private static TransactionResponse checkVendorOffsetExists(VendorOffsetTransaction voPers) 
																				throws ServiceFault{	
		TransactionPersistence tranPers = getTransactionPersistenceLocal();
		VendorOffsetTransaction voExists = null;
		try {
			voExists = tranPers.retrieveVendorOffset(voPers.getPoNumber());
		} catch (TransactionPersistenceException tpe) {
			logger.error("processVendorOffsetTransaction(): System Failure: Failed to get Vendor Offset Transaction->" + voPers.getPoNumber());
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Vendor Offset Transaction-" + tpe.getMessage()));
		}
		if(voExists != null){
			logger.error("processVendorOffsetTransaction(): Vendor Offset transaction exists for PO No->" + 
					voPers.getPoNumber());
			return createExistsTransactionResponse(TransactionType.VENDOR_OFFSET);
		}	
		TransactionResponse voResp = new TransactionResponse();
		voResp.setSuccessful(true);
		voResp.setTransactionType(TransactionType.VENDOR_OFFSET);
		return voResp;		
	}
	
	/**
	 * Get the local EJB of <code>TransactionPersistence</code> object.
	 * 
	 * @return	<code>TransactionPersistence</code> local object
	 * @throws 	NamingException, if lookup fails
	 */
	static TransactionPersistence getTransactionPersistenceLocal() throws ServiceFault{
		String transPersistenceJNDI = "enterprise.services/TransactionPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( transPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getTransactionPersistenceLocal(): System Failure: Failed to get TransactionPersistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getTransactionPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (TransactionPersistence)robj;		
	}	
	
	/**
	 * Creates and returns the <code>gov.gsa.fas.faults.v1.ServiceFault</code> detailed fault
	 * element. 
	 * 
	 * @param 	code
	 * @param 	msg
	 * @return	<code>gov.gsa.fas.faults.v1.ServiceFault</code> object
	 */
	static gov.gsa.fas.faults.v1.ServiceFault createFault(String code, String msg){
		gov.gsa.fas.faults.v1.ServiceFault sFault = new gov.gsa.fas.faults.v1.ServiceFault();
		sFault.setCode(code);
		sFault.setMessage(msg);
		return sFault;
	}
	
	/**
	 * Creates <code>TransactionResponse</code> for transaction type.
	 * 
	 * @param transType
	 * @return
	 */
	private static TransactionResponse createExistsTransactionResponse(TransactionType transType){
		TransactionResponse transResp = new TransactionResponse();
		transResp.setTransactionType(transType);
		transResp.setSuccessful(false);				
		List<Message> msgs = transResp.getMessage();
		Message msg = new Message();
		msg.setMessage(transType.value() + " Transaction record already Exists");
		msg.setCode("E");
		msgs.add(msg);
		return transResp;
	}
	
}
