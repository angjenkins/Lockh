/*
 * @(#)TransactionValidator.java			Jun 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.orderdiscrepancy.v1;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.orderdiscrepancy.v1.AgencyDetails;
import gov.gsa.fas.orderdiscrepancy.v1.DiscrepancyItem;
import gov.gsa.fas.orderdiscrepancy.v1.Finance305;
import gov.gsa.fas.orderdiscrepancy.v1.MaterialReturn;
import gov.gsa.fas.orderdiscrepancy.v1.Reshipment;
import gov.gsa.fas.orderdiscrepancy.v1.VendorOffset;
import gov.gsa.fas.orderdiscrepancy.v1.WdcOrderCodes;
import gov.gsa.fas.orderdiscrepancy.v1.ZKP;
import gov.gsa.fas.orderdiscrepancy.v1.ZLA;
import gov.gsa.fas.orderdiscrepancy.v1.ZSA;
import gov.gsa.fas.services.messages.v1.DiscrepancyTransactions;
import gov.gsa.fas.services.messages.v1.TransactionResponse;
import gov.gsa.fas.services.messages.v1.TransactionResponse.Message;
import gov.gsa.fas.services.messages.v1.TransactionType;
import gov.gsa.fas.services.messages.v1.TransactionsResponse;

/**
 * <code>TransactionValidator</code> validates order discrepancy
 * transaction objects.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class TransactionValidator {

	private static final Logger logger = Logger.getLogger(TransactionValidator.class.getName());
	
	/**
	 * Delegates call to individual transaction validations. If one of the validations
	 * failed then set all remaining transactions false.
	 * 
	 * @param 	transactions
	 * @return	<code>TransactionsResponse</code> object
	 */
	static TransactionsResponse validateTransactions(
			DiscrepancyTransactions transactions){
		logger.info("validateTransactions(): Validating all Transactions");
		TransactionsResponse transResp = new TransactionsResponse();
		if(transactions.getZkp() != null){
			TransactionResponse zkpResp = validateZKP(transactions.getZkp());
			transResp.getTransactionResponse().add(zkpResp);
			if(!zkpResp.isSuccessful()){
				logger.error("validateTransactions(): ZKP validations failed for discrepancy key->" + 
						transactions.getZkp().getDiscrepancyKey());
			}			
		}
		if(transactions.getFinance305Credit() != null){
			TransactionResponse fin305Resp = validateFinance305(
					transactions.getFinance305Credit(), TransactionConstants.ACTION_CREDIT);
			transResp.getTransactionResponse().add(fin305Resp);
			if(!fin305Resp.isSuccessful()){
				logger.error("validateTransactions(): Finance305Credit validations failed for discrepancy key->" + 
						transactions.getFinance305Credit().getDiscrepancyKey());
			}			
		}
		if(transactions.getFinance305Debit() != null){
			TransactionResponse fin305Resp = validateFinance305(
					transactions.getFinance305Debit(), TransactionConstants.ACTION_DEBIT);
			transResp.getTransactionResponse().add(fin305Resp);
			if(!fin305Resp.isSuccessful()){
				logger.error("validateTransactions(): Finance305Debit validations failed for discrepancy key->" + 
						transactions.getFinance305Debit().getDiscrepancyKey());
			}					
		}		
		if(transactions.getReshipment() != null){
			TransactionResponse reshipResp = validateReshipment(transactions.getReshipment());
			transResp.getTransactionResponse().add(reshipResp);
			if(!reshipResp.isSuccessful()){
				logger.error("validateTransactions(): Reshipment validations failed for discrepancy key->" + 
						transactions.getReshipment().getDiscrepancyKey());
			}			
		}
		if(transactions.getMaterialReturn() != null){
			TransactionResponse mrResp = validateMaterialReturn(transactions.getMaterialReturn());
			transResp.getTransactionResponse().add(mrResp);
			if(!mrResp.isSuccessful()){
				logger.error("validateTransactions(): Material Return validations failed for discrepancy key->" + 
						transactions.getMaterialReturn().getDiscrepancyKey());
			}			
		}
		if(transactions.getZlaCredit() != null){
			TransactionResponse zlaResp = validateZLA(transactions.getZlaCredit(), 
					TransactionConstants.ACTION_CREDIT);
			transResp.getTransactionResponse().add(zlaResp);
			if(!zlaResp.isSuccessful()){
				logger.error("validateTransactions(): ZLA Credit validations failed for discrepancy key->" + 
						transactions.getZlaCredit().getDiscrepancyKey());
			}			
		}
		if(transactions.getZlaDebit() != null){
			TransactionResponse zlaResp = validateZLA(transactions.getZlaDebit(), 
					TransactionConstants.ACTION_DEBIT);
			transResp.getTransactionResponse().add(zlaResp);
			if(!zlaResp.isSuccessful()){
				logger.error("validateTransactions(): ZLA Debit validations failed for discrepancy key->" + 
						transactions.getZlaDebit().getDiscrepancyKey());
			}					
		}		
		if(transactions.getZsaCredit() != null){
			TransactionResponse zsaResp = validateZSA(transactions.getZsaCredit(), 
					TransactionConstants.ACTION_CREDIT);
			transResp.getTransactionResponse().add(zsaResp);
			if(!zsaResp.isSuccessful()){
				logger.error("validateTransactions(): ZSA Credit validations failed for discrepancy key->" + 
						transactions.getZsaCredit().getDiscrepancyKey());
			}					
		}
		if(transactions.getZsaDebit() != null){
			TransactionResponse zsaResp = validateZSA(transactions.getZsaDebit(), 
					TransactionConstants.ACTION_DEBIT);
			transResp.getTransactionResponse().add(zsaResp);
			if(!zsaResp.isSuccessful()){
				logger.error("validateTransactions(): ZSA Debit validations failed for discrepancy key->" + 
						transactions.getZsaDebit().getDiscrepancyKey());
			}					
		}
		if(transactions.getZsaPZ() != null){
			TransactionResponse zsaResp = validateZSA(transactions.getZsaPZ(), 
					TransactionConstants.ACTION_PZ);
			transResp.getTransactionResponse().add(zsaResp);
			if(!zsaResp.isSuccessful()){
				logger.error("validateTransactions(): ZSA PZ validations failed for discrepancy key->" + 
						transactions.getZsaPZ().getDiscrepancyKey());
			}				
		}		
		if(transactions.getVendorOffset() != null){
			TransactionResponse vendorOffsetResp = validateVendorOffset(transactions.getVendorOffset());
			transResp.getTransactionResponse().add(vendorOffsetResp);
			if(!vendorOffsetResp.isSuccessful()){
				logger.error("validateTransactions(): Vendor Offset validations failed for discrepancy key->" + 
						transactions.getVendorOffset().getDiscrepancyKey());
			}				
		}
		transResp.setAllSuccessful(true);
		//For setting overall response
		for(TransactionResponse resp : transResp.getTransactionResponse()){
			if(!resp.isSuccessful()){
				transResp.setAllSuccessful(false);
			}
		}
		//If Overall failed, then set remaining all failed
		if(!transResp.isAllSuccessful()){
			for(TransactionResponse resp : transResp.getTransactionResponse()){
				resp.setSuccessful(false);
			}	
		}
		return transResp;		
	}
	
	/**
	 * Validates ZKP order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	zkp	<code>ZKP</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateZKP(ZKP zkp){
		logger.info("validateZKP(): Validating ZKP transaction for discrepancy key->" + 
				zkp.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(zkp.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(zkp.getResubmitFlag(), new int[]{0, 1},
				true, "Resubmit Flag", msgs);
		//Created User code
		validateField(zkp.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);
		//Requisition Number
		validateField(zkp.getRequisitionNumber(), 14, true,
				"Requisition Number", msgs);
		//Requisition Suffix
		validateField(zkp.getRequisitionSuffix(), 1, false,
							"Requisition Suffix", msgs);
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		transResp.setTransactionType(TransactionType.ZKP);
		return transResp;
	}
	
	/**
	 * Validates Finance305 order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	fin305	<code>Finance305</code> transaction object
	 * @param 	actionType "Credit" or "Debit"
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateFinance305(Finance305 fin305, String actionType){	
		logger.info("validateFinance305(): Validating Finance305 transaction for discrepancy key->" + 
				fin305.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(fin305.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(fin305.getResubmitFlag(), new int[]{0, 1},
				true, "Resubmit Flag", msgs);
		//Record Id
		validateField(fin305.getRecordId(), new int[]{5030, 5040},
				true, "Record Id", msgs);
		//Rtg Id
		validateField(fin305.getRtgId(), new String[]{"GA1", "GN3","GF1", "GK1", "GN1", "GS1", "GT1", "GN3"},
				true, "Rtg Id", msgs);
		//Rtg Id
		validateField(fin305.getComCtrCd(), 1,
				true, "Com Ctr Cd", msgs);
		//Validate Discrepancy Item object
		validateDiscrepancyItem(fin305.getDiscrepancyItem(), msgs);
		//Supplement Address AAC
		validateField(fin305.getSupplementAddrAAC(), 6, false, 
				"Supplement Address AAC", msgs);
		//Validate order codes
		validateOrderCodes(fin305.getOrderCodes(), msgs, null);
		//Ext Sell value
		validateField(fin305.getExtSellValue(), 99999999L, true, 
				"Ext sell value", msgs);
		//Sell Price
		validateField(fin305.getSellPrice(), 99999999L, false, 
				"Sell Price", msgs);
		//Validate Agencty details
		validateAgencyDetails(fin305.getAgencyDetails(), msgs);
		//Export Domestic code
		validateField(fin305.getExportDomesticCode(), 1, true, 
				"Export Domestic Code", msgs);
		//Action Code
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			validateField(fin305.getActionCode(), TransactionConstants.ACTION_CODES_CREDIT, true, 
					"Action Code", msgs);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			validateField(fin305.getActionCode(), TransactionConstants.ACTION_CODES_DEBIT, true, 
					"Action Code", msgs);
		}
		//PO Number
		validateField(fin305.getManifestPONumber(), 8, true, 
				"Manifest PO Number", msgs);
		//BOAC
		validateField(fin305.getBoac(), 6, true, "BOAC", msgs);
		//Region Code
		validateField(fin305.getRegion(), 1, true, "Region", msgs);
		//Advice Code
		validateField(fin305.getAdviceCode(), 2, true, "Advice Code", msgs);
		//FAS PO Number
		validateField(fin305.getFasPONumber(), 10, true, "FAS PO Number", msgs);
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			transResp.setTransactionType(TransactionType.FINANCE_305_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			transResp.setTransactionType(TransactionType.FINANCE_305_DEBIT);
		}
		return transResp;
	}
	
	/**
	 * Validates Reshipment order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	reship	<code>Reshipment</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateReshipment(Reshipment reship){	
		logger.info("validateReshipment(): Validating Reshipment transaction for discrepancy key->" + 
				reship.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(reship.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(reship.getResubmitFlag(), new int[]{0, 1},
				true, "Resubmit Flag", msgs);	
		//Doc Identifier Extension 
		validateField(reship.getDocIdentifierExtension(), 1, true, 
				"Doc Identifier Extension", msgs);
		//Routing Identifier Code
		validateField(reship.getRoutingIdentifierCode(), 3, true, 
				"Routing Identifier Code", msgs);
		//Media Status
		validateField(reship.getMediaStatus(), 1, true, 
				"Media Status", msgs);
		//Validate Discrepancy Item object
		validateDiscrepancyItem(reship.getDiscrepancyItem(), msgs);
		//Supplement Address AAC
		validateField(reship.getSupplementAddrAAC(), 6, false, 
				"Supplement Address AAC", msgs);
		//Validate order codes
		validateOrderCodes(reship.getOrderCodes(), msgs, null);
		//Required Delivery Date
		validateField(reship.getRequiredDeliveryDate(), 3, false, 
				"Required Delivery Date", msgs);
		//Advice Code
		validateField(reship.getAdviceCode(), 2, false, 
				"Advice Code", msgs);
		validateField(reship.getTransportDispositionCode(), 2, true, 
				"Transport Disposition Code", msgs);
		//Created User Code
		validateField(reship.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);		
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		transResp.setTransactionType(TransactionType.RESHIPMENT);
		return transResp;
	}
	
	/**
	 * Validates MaterialReturn order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	mra	<code>MaterialReturn</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateMaterialReturn(MaterialReturn mra){
		logger.info("validateMaterialReturn(): Validating Material Return transaction for discrepancy key->" + 
				mra.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(mra.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(mra.getResubmitFlag(), new int[]{1, 2},
				true, "Resubmit Flag", msgs);	
		//Validate Discrepancy Item object
		validateDiscrepancyItem(mra.getDiscrepancyItem(), msgs);
		//Supplement Address AAC
		validateField(mra.getSupplementAddrAAC(), 6, false, 
				"Supplement Address AAC", msgs);
		//Signal Code
		validateField(mra.getSignalCode(), new String[]{"A","B","C","J","K","L"}, false, 
				"Signal Code",  msgs);		
		//Fund Code
		validateField(mra.getFundCode(), 2, false, 
				"Fund Code", msgs);
		//Routing Identifier Code
		validateField(mra.getRoutingIdentifierCode(), 3, true, 
				"Routing Identifier Code", msgs);	
		//Adjusted value
		validateField(mra.getAdjustedValue(), 99999999L, true, 
				"Adjusted Value", msgs);
		//Created User Code
		validateField(mra.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);
		//Liability Code
		validateField(mra.getLiabilityCode(), 1, true, 
				"Liability Code", msgs);
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		transResp.setTransactionType(TransactionType.MATERIAL_RETURN);
		return transResp;		
	}
	
	/**
	 * Validates ZLA order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	zla	<code>ZLA</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateZLA(ZLA zla, String actionType){	
		logger.info("validateZLA(): Validating ZLA transaction for discrepancy key->" + 
				zla.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(zla.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(zla.getResubmitFlag(), new int[]{1, 2},
				true, "Resubmit Flag", msgs);
		//Routing Identifier Code
		validateField(zla.getRoutingIdentifierCode(), 3, true, 
				"Routing Identifier Code", msgs);
		//Validate Discrepancy Item object
		validateDiscrepancyItem(zla.getDiscrepancyItem(), msgs);
		//Supplement Address AAC
		validateField(zla.getSupplementAddrAAC(), 6, false, 
				"Supplement Address AAC", msgs);
		//Validate order codes
		validateOrderCodes(zla.getOrderCodes(), msgs, new String[]{"A","B","C","J","K","L"});
		//Sell Price
		validateField(zla.getSellPrice(), 9999999L, false, 
				"Sell Price", msgs);
		//Document Identifier Code
		validateField(zla.getDocIdentifierCode(), 3, true, 
				"Document Identifier Code", msgs);
		//Date Shipped
		//??
		//Cost Price
		validateField(zla.getCostPrice(), 9999999L, false, 
				"Cost Price", msgs);
		//Validate Agencty details
		validateAgencyDetails(zla.getAgencyDetails(), msgs);
		//Consignee AAC
		validateField(zla.getConsigneeAAC(), 6, true, "Consignee AAC", msgs);	
		//PO Number
		validateField(zla.getPoNumber(), 8, true,
				"PO Number", msgs);
		//Action Code
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){		
			validateField(zla.getActionCode(), TransactionConstants.ACTION_CODES_CREDIT, true, 
				"Action Code", msgs);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			validateField(zla.getActionCode(), TransactionConstants.ACTION_CODES_DEBIT, true, 
					"Action Code", msgs);
		}
		//Export Domestic code
		validateField(zla.getExportDomesticCode(), new String[]{"E","D"}, true, 
				"Export Domestic Code", msgs);		
		//Created User Code
		validateField(zla.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);
		//Advice Code
		validateField(zla.getAdviceCode(), 3, true, 
				"Advice Code", msgs);		
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			transResp.setTransactionType(TransactionType.ZLA_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			transResp.setTransactionType(TransactionType.ZLA_DEBIT);
		}
		return transResp;		
	}
	
	/**
	 * Validates ZSA order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	zsa	<code>ZSA</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateZSA(ZSA zsa, String actionType){
		logger.info("validateZSA(): Validating ZSA transaction for discrepancy key->" + 
				zsa.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(zsa.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//Resubmit flag values
		validateField(zsa.getResubmitFlag(), new int[]{1, 2},
				true, "Resubmit Flag", msgs);
		//Validate Discrepancy Item object
		if(!actionType.equals(TransactionConstants.ACTION_PZ)){
			validateDiscrepancyItem(zsa.getDiscrepancyItem(), msgs);
		}else{
			if(zsa.getDiscrepancyItem() != null){
				//NIIN
				validateField(zsa.getDiscrepancyItem().getNiin(), 15,
						true, "NIIN", msgs);
				//Unit
				validateField(zsa.getDiscrepancyItem().getUnitCode(), 2,
						false, "Unit Code", msgs);
				//Adjusted quantity
				validateField(zsa.getDiscrepancyItem().getAdjustedQuantity(), 99999,
						true, "Adjusted Quantity", msgs);
				//Requisition Number
				validateField(zsa.getDiscrepancyItem().getRequisitionNumber(), 14, true,
						"Requisition Number", msgs);
				//Requisition Suffix
				validateField(zsa.getDiscrepancyItem().getRequisitionSuffix(), 1, false,
									"Requisition Suffix", msgs);		
			}else{
				msgs.add(createMessage("Discrepancy item object is null", "E"));
			}
		}
		//Cost Price
		validateField(zsa.getCostPrice(), 9999999L, false, 
				"Cost Price", msgs);
		//Sell Price
		validateField(zsa.getSellPrice(), 9999999L, false, 
				"Sell Price", msgs);
		//Created User Code
		validateField(zsa.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);
		//Action Code
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			validateField(zsa.getActionCode(), TransactionConstants.ACTION_CODES_CREDIT, true, 
					"Action Code", msgs);	
			//Advice Code
			validateField(zsa.getAdviceCode(), 3, true, 
					"Advice Code", msgs);		
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			validateField(zsa.getActionCode(), TransactionConstants.ACTION_CODES_DEBIT, true, 
					"Action Code", msgs);
			//Advice Code
			validateField(zsa.getAdviceCode(), 3, true, 
					"Advice Code", msgs);		
		}else if(actionType.equals(TransactionConstants.ACTION_PZ)){
			validateField(zsa.getActionCode(), TransactionConstants.ACTION_CODES_PZ, true, 
					"Action Code", msgs);	
			//Advice Code
			validateField(zsa.getAdviceCode(), 3, false, 
					"Advice Code", msgs);		
		}
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			transResp.setTransactionType(TransactionType.ZSA_CREDIT);
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			transResp.setTransactionType(TransactionType.ZSA_DEBIT);
		}else if(actionType.equals(TransactionConstants.ACTION_PZ)){
			transResp.setTransactionType(TransactionType.ZSA_PZ);
		}
		return transResp;		
	}
	
	/**
	 * Validates Vendor Offset order discrepancy transaction object.
	 * If not valid sets the flag in the response object as
	 * false and provides list of validation messages.
	 * 
	 * @param 	vendorOffset	<code>VendorOffset</code> transaction object
	 * @return	<code>TransactionResponse</code> object.
	 */
	private static TransactionResponse validateVendorOffset(VendorOffset vendorOffset){	
		logger.info("validateVendorOffset(): Validating Vendor Offset transaction for discrepancy key->" + 
				vendorOffset.getDiscrepancyKey());
		TransactionResponse transResp = new TransactionResponse();
		List<Message> msgs = transResp.getMessage();
		//Discrepancy Key
		validateField(vendorOffset.getDiscrepancyKey(), 9999999999L,
				true,"Discrepancy Key", msgs);
		//PO Number
		validateField(vendorOffset.getPoNumber(), 10, true, 
				"PO Number", msgs);		
		//Contract Number
		validateField(vendorOffset.getContractNumber(), 15, true, 
				"Contract Number", msgs);		
		//Offset Amount
		validateField(vendorOffset.getOffsetAmount(), 999999999999L, true, 
				"Offset Amount", msgs);		
		//Created User Code
		validateField(vendorOffset.getCreatedUserCode(), 2, true, 
				"Created User Code", msgs);		
		//ACO Name
		validateField(vendorOffset.getAcoName(), 20, false, 
				"ACO Name", msgs);		
		//Problem Type
		validateField(vendorOffset.getProblemType(), 20, true, 
				"Problem Type", msgs);				
		//If messages exists setting response flag 
		if(msgs != null && msgs.size() > 0){
			transResp.setSuccessful(false);
		}else{
			transResp.setSuccessful(true);
		}
		transResp.setTransactionType(TransactionType.VENDOR_OFFSET);
		return transResp;		
	}		
	
	/**
	 * Validates <code>DiscrepancyItem</code> object fields.
	 * 
	 * @param discrItem
	 * @param msgs
	 * @return
	 */
	private static List<Message> validateDiscrepancyItem(DiscrepancyItem discrItem, List<Message> msgs){
		if(discrItem == null){
			msgs.add(createMessage("Discrepancy item object is null", "E"));
			return msgs;
		}
		//NIIN
		validateField(discrItem.getNiin(), 15,
				true, "NIIN", msgs);
		//Unit
		validateField(discrItem.getUnitCode(), 2,
				true, "Unit Code", msgs);
		//Adjusted quantity
		validateField(discrItem.getAdjustedQuantity(), 99999,
				true, "Adjusted Quantity", msgs);
		//Requisition Number
		validateField(discrItem.getRequisitionNumber(), 14, true,
				"Requisition Number", msgs);
		//Requisition Suffix
		validateField(discrItem.getRequisitionSuffix(), 1, false,
							"Requisition Suffix", msgs);		
		return msgs;
	}
	
	/**
	 * Validates <code>WdcOrderCodes</code> object fields.
	 * 
	 * @param orderCodes
	 * @param msgs
	 * @return
	 */
	private static List<Message> validateOrderCodes(WdcOrderCodes orderCodes, List<Message> msgs, 
			String[] validSignalCodes){
		if(orderCodes == null){
			return msgs;
		}
		//Signal Code
		if(validSignalCodes != null && validSignalCodes.length > 0){
			validateField(orderCodes.getSignalCode(), validSignalCodes, false, 
					"Signal Code",  msgs);
		}else{
			validateField(orderCodes.getSignalCode(), 1, false, 
				"Signal Code", msgs);
		}
		//Fund Code
		validateField(orderCodes.getFundCode(), 2, false, 
				"Fund Code", msgs);
		//Project Code
		validateField(orderCodes.getProjectCode(), 3, false, 
				"Project Code", msgs);
		//Priority Code
		validateField(orderCodes.getPriorityCode(), 2, false, 
				"Priority Code", msgs);
		//Distribution Code
		validateField(orderCodes.getDistributionCode(), 3, false, 
				"Distribution Code", msgs);
		return msgs;
	}
	
	/**
	 * Validates <code>AgencyDetails</code> object fields.
	 * 
	 * @param agencyDetails
	 * @param msgs
	 * @return
	 */
	private static List<Message> validateAgencyDetails(AgencyDetails agencyDetails, List<Message> msgs){
		if(agencyDetails == null){
			return msgs;
		}
		//Agency or Bureau code
		validateField(agencyDetails.getAgencyBureauCode(), 4, true, 
				"Agency or Bureau Code", msgs);
		//State code
		validateField(agencyDetails.getStateCode(), 2, false, "State Code", msgs);
		//City code
		validateField(agencyDetails.getCityCode(), 4, false, "City Code", msgs);
		return msgs;
	}
	
	/**
	 * Checks if the field required or not, also checks length
	 * of the field. If the field validation failed returns 
	 * <code>Message</code> object.
	 * 
	 * @param field
	 * @param maxLen
	 * @param required
	 * @param fieldName
	 * @param msgs
	 * @return
	 */
	private static Message validateField(String field, int maxLen, 
			boolean required, String fieldName, List<Message> msgs){
		Message msg = null;
		//Required
		if(required && (field == null || field.trim().isEmpty() 
				|| field.trim().equalsIgnoreCase("NULL"))){
			msg = createMessage(fieldName + " is required field, can't be null or empty", "E");
			msgs.add(msg);
			return msg;
		}
		if(field != null && field.length() > maxLen){
			msg  = createMessage (fieldName + " length exceeds maximum length " + maxLen, "E");
			msgs.add(msg);
			return msg;
		}
		return null;
	}
	
	/**
	 * Validates numeric field value is <= 0, also if field value
	 * exceeds maximum value or not. If the field validation failed 
	 * returns <code>Message</code> object.
	 * 
	 * @param field
	 * @param maxVal
	 * @param required
	 * @param fieldName
	 * @param msgs
	 * @return
	 */
	private static Message validateField(long field, long maxVal,
			boolean required, String fieldName, List<Message> msgs){
		Message msg = null;
		if(required && field <= 0){
			msg = createMessage(fieldName + " is required field, can't be 0", "E");
			msgs.add(msg);
			return msg;
		}
		if(field > maxVal){
			msg = createMessage (fieldName + " exceeds maximum value " + maxVal, "E");
			msgs.add(msg);
			return msg;
		}
		return null;
	}
	
	/**
	 * Validates numeric field value is <= 0, also if field value
	 * is in the specified range or not. If the field validation failed 
	 * returns <code>Message</code> object.
	 * 
	 * @param field
	 * @param allowedValues
	 * @param required
	 * @param fieldName
	 * @param msgs
	 * @return
	 */
	private static Message validateField(long field, int[] allowedValues,
			boolean required, String fieldName, List<Message> msgs){
		Message msg = null;
		if(required && allowedValues != null && allowedValues.length > 0){
			boolean valueValid = false;
			for(int validValue:allowedValues){
				if(field == validValue){
					valueValid = true;
					break;
				}
			}
			if(!valueValid){
				String allowedValStr = Arrays.toString(allowedValues);
				msg = createMessage (fieldName + " is not in the range of values " + allowedValStr, "E");
				msgs.add(msg);
				return msg;
			}
		}
		return null;
	}	
	
	/**
	 * Checks if the field required or not, also checks value is in valid
	 * values. If the field validation failed returns 
	 * <code>Message</code> object.
	 * 
	 * @param field
	 * @param allowedValues
	 * @param required
	 * @param fieldName
	 * @param msgs
	 * @return
	 */
	private static Message validateField(String field, String[] allowedValues,
			boolean required, String fieldName, List<Message> msgs){
		Message msg = null;
		if(required && (field == null || field.trim().isEmpty())){
			msg = createMessage(fieldName + " is required field, can't be null or empty", "E");
			msgs.add(msg);
			return msg;
		}
		if(field != null && allowedValues != null && allowedValues.length > 0){
			boolean valueValid = false;
			for(String validValue:allowedValues){
				if(field.equals(validValue)){
					valueValid = true;
					break;
				}
			}
			if(!valueValid){
				String allowedValStr = Arrays.toString(allowedValues);
				msg = createMessage (fieldName + " is not in the range of values " + allowedValStr, "E");
				msgs.add(msg);
				return msg;
			}	
		}
		return null;		
	}		
	
	/**
	 * Creates <code>Message</code> object.
	 * 
	 * @param message
	 * @param messageType
	 * @return
	 */
	private static Message createMessage(String message, String messageType){
		Message msg = new Message();
		msg.setMessage(message);
		msg.setCode(messageType);
		return msg;
	}
}
