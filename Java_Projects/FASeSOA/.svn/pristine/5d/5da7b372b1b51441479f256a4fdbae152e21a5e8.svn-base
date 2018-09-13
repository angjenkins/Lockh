/*
 * @(#)TransactionTransformation.java			Jun 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.orderdiscrepancy.v1;

import java.util.HashMap;

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
import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.VendorOffsetTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZlaTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZsaTransaction;
import gov.gsa.fas.services.common.DateUtility;
import gov.gsa.fas.services.common.Utility;
import gov.gsa.fas.services.messages.v1.DiscrepancyTransactions;
import gov.gsa.fas.services.messages.v1.TransactionType;

/**
 * <code>TransactionTransformation</code> transforms order discrepancy
 * Canonical model to persistence model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class TransactionTransformation {
	
	private static final Logger logger = Logger.getLogger(TransactionTransformation.class.getName());
	
	
	static HashMap<String, Object> transformTransactions(DiscrepancyTransactions transactions){
		logger.info("transformTransactions(): Transforming all Transactions");
		HashMap<String, Object> transPersMap = new HashMap<String, Object>();
		if(transactions.getZkp() != null){
			ZkpTransaction zkpPers = transformZKP(transactions.getZkp());
			transPersMap.put(TransactionType.ZKP.value(), zkpPers);
		}
		if(transactions.getFinance305Credit() != null){
			Finance305Transaction fin305Pers = transformFinance305(
					transactions.getFinance305Credit());
			transPersMap.put(TransactionType.FINANCE_305_CREDIT.value(), fin305Pers);
		}
		if(transactions.getFinance305Debit() != null){
			Finance305Transaction fin305Pers = transformFinance305(
					transactions.getFinance305Debit());
			transPersMap.put(TransactionType.FINANCE_305_DEBIT.value(), fin305Pers);
		}		
		if(transactions.getReshipment() != null){
			ReshipmentTransaction reshipPers = transformReshipment(transactions.getReshipment());
			transPersMap.put(TransactionType.RESHIPMENT.value(), reshipPers);
		}
		if(transactions.getMaterialReturn() != null){
			MaterialReturnTransaction mraPers = transformMaterialReturn(transactions.getMaterialReturn());
			transPersMap.put(TransactionType.MATERIAL_RETURN.value(), mraPers);
		}
		if(transactions.getZlaCredit() != null){
			ZlaTransaction zlaPers = transformZLA(transactions.getZlaCredit());
			transPersMap.put(TransactionType.ZLA_CREDIT.value(), zlaPers);
		}
		if(transactions.getZlaDebit() != null){
			ZlaTransaction zlaPers = transformZLA(transactions.getZlaDebit());
			transPersMap.put(TransactionType.ZLA_DEBIT.value(), zlaPers);
		}		
		if(transactions.getZsaCredit() != null){
			ZsaTransaction zsaPers = transformZSA(transactions.getZsaCredit());
			transPersMap.put(TransactionType.ZSA_CREDIT.value(), zsaPers);
		}
		if(transactions.getZsaDebit() != null){
			ZsaTransaction zsaPers = transformZSA(transactions.getZsaDebit());
			transPersMap.put(TransactionType.ZSA_DEBIT.value(), zsaPers);
		}
		if(transactions.getZsaPZ() != null){
			ZsaTransaction zsaPers = transformZSA(transactions.getZsaPZ());
			transPersMap.put(TransactionType.ZSA_PZ.value(), zsaPers);
		}		
		if(transactions.getVendorOffset() != null){
			VendorOffsetTransaction voPers = transformVendorOffset(transactions.getVendorOffset());
			transPersMap.put(TransactionType.VENDOR_OFFSET.value(), voPers);
		}
		return transPersMap;
	}

	 /**
	  * Transforms canonical model <code>ZKP</code> transaction object
	  * to persistence model <code>ZkpTransaction</code> object.
	  * 
	  * @param 	zkp	<code>ZKP</code> object
	  * @return	returns <code>ZkpTransaction</code> object
	  */
	 private static ZkpTransaction transformZKP(ZKP zkp){
		 logger.info("transformZKP(): Transforming ZKP transaction ->" + 
				 zkp.getDiscrepancyKey());
		 if(zkp == null) return null;
		 ZkpTransaction zkpPers = new ZkpTransaction();
		 zkpPers.setRodKey(zkp.getDiscrepancyKey());
		 zkpPers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 zkpPers.setHeader(TransactionConstants.ZKP_HEADER);
		 zkpPers.setTechCode(zkp.getCreatedUserCode());
		 zkpPers.setRequisitionNumber(zkp.getRequisitionNumber());
		 zkpPers.setRequisitionSuffix(Utility.padRight(zkp.getRequisitionSuffix(), 1));
		 zkpPers.setReportType(TransactionConstants.ZKP_REPORT_TYPE_IND);
		 zkpPers.setCreatedTime(DateUtility.getCurrentTimestamp());
		 logger.info("transformZKP(): ZKP Transformation completed->" + 
				 zkp.getDiscrepancyKey());
		 return zkpPers;
	 }
	 
	 /**
	  * Transforms canonical model <code>Finance305</code> transaction object
	  * to persistence model <code>Finance305Transaction</code> object.
	  * 
	  * @param 	fin305	<code>Finance305</code> object
	  * @return	returns <code>Finance305Transaction</code> object
	  */
	 private static Finance305Transaction transformFinance305(Finance305 fin305){
		 logger.info("transformFinance305(): Transforming Finance305 transaction ->" + 
				 fin305.getDiscrepancyKey());
		 if(fin305 == null) return null;
		 Finance305Transaction fin305Pers = new Finance305Transaction();
		 fin305Pers.setRodKey(fin305.getDiscrepancyKey());
		 fin305Pers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 fin305Pers.setFileId(TransactionConstants.FINANCE305_FILE_ID);
		 fin305Pers.setRecordId(fin305.getRecordId());
		 fin305Pers.setDocId(TransactionConstants.FINANCE305_DOC_ID);
		 fin305Pers.setRtgId(fin305.getRtgId());
		 fin305Pers.setComCtrCd(fin305.getComCtrCd());
		 DiscrepancyItem discrItem = fin305.getDiscrepancyItem();
		 if(discrItem != null){
			 fin305Pers.setNsn(Utility.padRight(discrItem.getNiin(), 15));
			 fin305Pers.setUnit(discrItem.getUnitCode());
			 fin305Pers.setQuantity(discrItem.getAdjustedQuantity());
			 fin305Pers.setRequisitionNumber(discrItem.getRequisitionNumber());
			 fin305Pers.setRequisitionSuffix(Utility.padRight(discrItem.getRequisitionSuffix(), 1));
		 }
		 fin305Pers.setSupplementAddrAAC(Utility.padRight(fin305.getSupplementAddrAAC(), 6));
		 WdcOrderCodes ordCodes = fin305.getOrderCodes();
		 if(ordCodes != null){
			 fin305Pers.setSignalCode(Utility.padRight(ordCodes.getSignalCode(), 1));
			 fin305Pers.setFundCode(Utility.padRight(ordCodes.getFundCode(), 2));
			 fin305Pers.setDistributionCode(Utility.padRight(ordCodes.getDistributionCode(), 3));
			 fin305Pers.setProjectCode(Utility.padRight(ordCodes.getProjectCode(), 3));
			 fin305Pers.setPriorityCode(leftPadWith0(ordCodes.getPriorityCode(), 2));
		 }
		 fin305Pers.setCycleDate(TransactionConstants.FINANCE305_CYCLE_DATE);
		 fin305Pers.setModeOfShip(TransactionConstants.FINANCE305_MODE_OF_SHIP);
		 fin305Pers.setExtSellValue(fin305.getExtSellValue());
		 fin305Pers.setSellPrice(fin305.getSellPrice());
		 fin305Pers.setCostPrice(TransactionConstants.FINANCE305_COST_PRICE);
		 fin305Pers.setTdSer8Ind(TransactionConstants.FINANCE305_TD_SER8_IND);
		 AgencyDetails agencyDetails = fin305.getAgencyDetails();
		 if(agencyDetails != null){
			 fin305Pers.setAgencyBureauCode(agencyDetails.getAgencyBureauCode());
			 fin305Pers.setStateCode(leftPadWith0(agencyDetails.getStateCode(), 2));
			 fin305Pers.setCityCode(leftPadWith0(agencyDetails.getCityCode(), 4));
		 }
		 fin305Pers.setExpDomInd(fin305.getExportDomesticCode());
		 fin305Pers.setTdCode(fin305.getActionCode());
		 fin305Pers.setManifestPONumber(fin305.getManifestPONumber());
		 fin305Pers.setBoac(Utility.padRight(fin305.getBoac(), 6));
		 fin305Pers.setRegion(fin305.getRegion());
		 fin305Pers.setAdviceCode(fin305.getAdviceCode());
		 fin305Pers.setFasPONumber(fin305.getFasPONumber());
		 logger.info("transformFinance305(): Finance305 Transformation completed->" + 
				 fin305.getDiscrepancyKey());		 
		 return fin305Pers;
	 }
	 
	 /**
	  * Transforms canonical model <code>Reshipment</code> transaction object
	  * to persistence model <code>ReshipmentTransaction</code> object.
	  * 
	  * @param 	reship	<code>Reshipment</code> object
	  * @return	returns <code>ReshipmentTransaction</code> object
	  */	 
	 private static ReshipmentTransaction transformReshipment(Reshipment reship){
		 logger.info("transformReshipment(): Transforming Reshipment transaction ->" + 
				 reship.getDiscrepancyKey());
		 if(reship == null) return null;
		 ReshipmentTransaction reshipPers = new ReshipmentTransaction();
		 reshipPers.setRodKey(reship.getDiscrepancyKey());
		 reshipPers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 reshipPers.setDocId(TransactionConstants.RESHIPMENT_DOC_ID);
		 reshipPers.setDocIdExt(reship.getDocIdentifierExtension());
		 reshipPers.setRoutingIdCode(reship.getRoutingIdentifierCode());
		 reshipPers.setMediaStatus(reship.getMediaStatus());
		 DiscrepancyItem discrItem = reship.getDiscrepancyItem();
		 if(discrItem != null){
			 reshipPers.setNsn(Utility.padRight(discrItem.getNiin(), 15));
			 reshipPers.setUnit(discrItem.getUnitCode());
			 reshipPers.setQuantity(discrItem.getAdjustedQuantity());
			 reshipPers.setRequisitionNumber(discrItem.getRequisitionNumber());
		 }
		 reshipPers.setSupplementAddrAAC(Utility.padRight(reship.getSupplementAddrAAC(), 6));
		 WdcOrderCodes ordCodes = reship.getOrderCodes();
		 if(ordCodes != null){
			 reshipPers.setSignalCode(Utility.padRight(ordCodes.getSignalCode(), 1));
			 reshipPers.setFundCode(Utility.padRight(ordCodes.getFundCode(), 2));
			 reshipPers.setDistributionCode(Utility.padRight(ordCodes.getDistributionCode(), 3));
			 reshipPers.setProjectCode(Utility.padRight(ordCodes.getProjectCode(), 3));
			 reshipPers.setPriorityCode(Utility.padRight(ordCodes.getPriorityCode(), 2));
		 }
		 reshipPers.setRequiredDeliveryDate(Utility.padLeft(reship.getRequiredDeliveryDate(),3));
		 reshipPers.setAdviceCode(Utility.padRight(reship.getAdviceCode(), 2));
		 reshipPers.setTdCode(reship.getTransportDispositionCode());
		 reshipPers.setRegionCode(TransactionConstants.RESHIPMENT_REGION_CODE);
		 reshipPers.setRoutingCode(TransactionConstants.RESHIPMENT_ROUTING_CODE);
		 reshipPers.setCreatedUserCode(reship.getCreatedUserCode());
		 logger.info("transformReshipment(): Reshipment Transformation completed->" + 
				 reship.getDiscrepancyKey());
		 return reshipPers;
	 }
	 
	 /**
	  * Transforms canonical model <code>MaterialReturn</code> transaction object
	  * to persistence model <code>MaterialReturnTransaction</code> object.
	  * 
	  * @param 	reship	<code>MaterialReturn</code> object
	  * @return	returns <code>MaterialReturnTransaction</code> object
	  */	 
	 private static MaterialReturnTransaction transformMaterialReturn(MaterialReturn mr){
		 logger.info("transformMaterialReturn(): Transforming Material Return transaction ->" +
				 mr.getDiscrepancyKey());
		 if(mr == null) return null;	
		 MaterialReturnTransaction mrPers = new MaterialReturnTransaction();
		 mrPers.setRodKey(mr.getDiscrepancyKey());
		 mrPers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 mrPers.setDocId(TransactionConstants.MATERIAL_RETURN_DOC_ID);
		 DiscrepancyItem discrItem = mr.getDiscrepancyItem();
		 if(discrItem != null){
			 mrPers.setNsn(Utility.padRight(discrItem.getNiin(), 15));
			 mrPers.setUnit(discrItem.getUnitCode());
			 mrPers.setQuantity(discrItem.getAdjustedQuantity());
			 mrPers.setRequisitionNumber(discrItem.getRequisitionNumber());
			 mrPers.setRequisitionSuffix(Utility.padRight(discrItem.getRequisitionSuffix(), 1));
		 }
		 mrPers.setSupplementAddrAAC(Utility.padRight(mr.getSupplementAddrAAC(), 6));
		 mrPers.setSignalCode(Utility.padRight(mr.getSignalCode(), 1));
		 mrPers.setFundCode(Utility.padRight(mr.getFundCode(), 2));
		 mrPers.setRoutingIdCode(mr.getRoutingIdentifierCode());
		 mrPers.setExtendValue(mr.getAdjustedValue());
		 mrPers.setCreatedUserCode(mr.getCreatedUserCode());
		 mrPers.setLiabilityCode(mr.getLiabilityCode());
		 mrPers.setRegionCode(TransactionConstants.MATERIAL_RETURN_REGION);
		 logger.info("transformMaterialReturn(): Material Transformation completed->" + 
				 mr.getDiscrepancyKey());
		 return mrPers;
	 }
	 
	 /**
	  * Transforms canonical model <code>ZLA</code> transaction object
	  * to persistence model <code>ZlaTransaction</code> object.
	  * 
	  * @param 	zla	<code>ZLA</code> object
	  * @return	returns <code>ZlaTransaction</code> object
	  */	 
	 private static ZlaTransaction transformZLA(ZLA zla){
		 logger.info("transformZLA(): Transforming ZLA transaction ->" + 
				 zla.getDiscrepancyKey());
		 if(zla == null) return null;
		 ZlaTransaction zlaPers = new ZlaTransaction();
		 zlaPers.setRodKey(zla.getDiscrepancyKey());
		 zlaPers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 zlaPers.setDocId(TransactionConstants.ZLA_DOC_ID);
		 zlaPers.setRoutingIdCode(zla.getRoutingIdentifierCode());
		 zlaPers.setBillToIndicator(TransactionConstants.ZLA_BILL_TO_INDICATOR);
		 DiscrepancyItem discrItem = zla.getDiscrepancyItem();
		 if(discrItem != null){
			 zlaPers.setNsn(Utility.padRight(discrItem.getNiin(), 15));
			 zlaPers.setUnit(discrItem.getUnitCode());
			 zlaPers.setQuantity(discrItem.getAdjustedQuantity());
			 zlaPers.setRequisitionNumber(discrItem.getRequisitionNumber());
			 zlaPers.setRequisitionSuffix(Utility.padRight(discrItem.getRequisitionSuffix(), 1));
		 }
		 zlaPers.setSupplementAddrAAC(Utility.padRight(zla.getSupplementAddrAAC(), 6));
		 WdcOrderCodes ordCodes = zla.getOrderCodes();
		 if(ordCodes != null){
			 zlaPers.setSignalCode(Utility.padRight(ordCodes.getSignalCode(), 1));
			 zlaPers.setFundCode(Utility.padRight(ordCodes.getFundCode(), 2));
			 zlaPers.setDistributionCode(Utility.padRight(ordCodes.getDistributionCode(), 3));
			 zlaPers.setProjectCode(Utility.padRight(ordCodes.getProjectCode(), 3));
			 zlaPers.setPriorityCode(leftPadWith0(ordCodes.getPriorityCode(), 2));
		 }
		 zlaPers.setSellPrice(zla.getSellPrice());
		 zlaPers.setChargeBackIndicator(TransactionConstants.ZLA_CHARGE_BACK_INDICATOR);
		 zlaPers.setRegionCode(TransactionConstants.ZLA_REGION);
		 zlaPers.setOriginalTdCode(TransactionConstants.ZLA_ORIGINAL_TD_CODE);
		 zlaPers.setImq(TransactionConstants.ZLA_IMQ);
		 zlaPers.setItemManager(TransactionConstants.ZLA_ITEM_MANAGER);
		 zlaPers.setNumberOfCards(TransactionConstants.ZLA_NO_OF_CARDS);
		 zlaPers.setCardNo1(TransactionConstants.ZLA_CARD_NO_1);
		 zlaPers.setOriginalDocId(zla.getDocIdentifierCode());
		 zlaPers.setShippedDate(DateUtility.xmlGregCalendarToTimestamp(
				 zla.getShippedDate()));
		 zlaPers.setCostPrice(zla.getCostPrice());
		 AgencyDetails agencyDetails = zla.getAgencyDetails();
		 if(agencyDetails != null){
			 zlaPers.setAgencyBureauCode(agencyDetails.getAgencyBureauCode());
			 zlaPers.setStateCode(leftPadWith0(agencyDetails.getStateCode(), 2));
			 zlaPers.setCityCode(leftPadWith0(agencyDetails.getCityCode(), 4));
		 }
		 zlaPers.setBoac(Utility.padRight(zla.getConsigneeAAC(), 6));
		 zlaPers.setGlobalPONumber(zla.getPoNumber());
		 zlaPers.setActionTdCode1(zla.getActionCode().substring(0,1));
		 zlaPers.setActionTdCode2(zla.getActionCode().substring(1,2));
		 zlaPers.setExportDomesticCode(Utility.padRight(zla.getExportDomesticCode(), 1));
		 zlaPers.setCreatedDate(DateUtility.getCurrentTimestamp());
		 zlaPers.setCreatedUserCode(zla.getCreatedUserCode());
		 zlaPers.setAdviceCode(zla.getAdviceCode());
		 zlaPers.setCardNo2(TransactionConstants.ZLA_CARD_NO_2);
		 logger.info("transformZLA(): ZLA Transformation completed->" + 
				 zla.getDiscrepancyKey());
		 return zlaPers;
	 }
	 
	 /**
	  * Transforms canonical model <code>ZSA</code> transaction object
	  * to persistence model <code>ZsaTransaction</code> object.
	  * 
	  * @param 	zsa	<code>ZSA</code> object
	  * @return	returns <code>ZsaTransaction</code> object
	  */	
	 private static ZsaTransaction transformZSA(ZSA zsa){
		 logger.info("transformZSA(): Transforming ZSA transaction ->" + 
				 zsa.getDiscrepancyKey());
		 if(zsa == null) return null;
		 ZsaTransaction zsaPers = new ZsaTransaction();
		 zsaPers.setRodKey(zsa.getDiscrepancyKey());
		 zsaPers.setPendingFlag(TransactionConstants.RESUBMIT_FLAG_ZERO);
		 zsaPers.setHeader(TransactionConstants.ZSA_HEADER);
		 DiscrepancyItem discrItem = zsa.getDiscrepancyItem();
		 if(discrItem != null){
			 zsaPers.setNsn(Utility.padRight(discrItem.getNiin(), 15));
			 zsaPers.setUnit(discrItem.getUnitCode());
			 zsaPers.setQuantity(discrItem.getAdjustedQuantity());
			 zsaPers.setRequisitionNumber(discrItem.getRequisitionNumber());
			 zsaPers.setRequisitionSuffix(Utility.padRight(discrItem.getRequisitionSuffix(), 1));
		 }
		 zsaPers.setCreatedDate(DateUtility.getCurrentTimestamp());
		 zsaPers.setCostPrice(zsa.getCostPrice());
		 zsaPers.setSellPrice(zsa.getSellPrice());
		 zsaPers.setChargeBackIndicator(TransactionConstants.ZSA_CHARGE_BACK_INDICATOR);
		 zsaPers.setRegionCode(TransactionConstants.ZSA_REGION);
		 zsaPers.setCreatedUserCode(zsa.getCreatedUserCode());
		 zsaPers.setActionCode(zsa.getActionCode());
		 if(zsa.getAdviceCode() != null){
			 zsaPers.setAdviceCode(zsa.getAdviceCode());
		 }else {
			 zsaPers.setAdviceCode(Utility.padRight(zsa.getAdviceCode(), 3));
		 }
		 logger.info("transformZSA(): ZSA Transformation completed->" + 
				 zsa.getDiscrepancyKey());
		 return zsaPers;
	 }
	 
	 /**
	  * Transforms canonical model <code>VendorOffset</code> transaction object
	  * to persistence model <code>VendorOffsetTransaction</code> object.
	  * 
	  * @param 	vo	<code>VendorOffset</code> object
	  * @return	returns <code>VendorOffsetTransaction</code> object
	  */	
	 private static VendorOffsetTransaction transformVendorOffset(VendorOffset vo){
		 logger.info("transformVendorOffset(): Transforming Vendor Offset transaction ->" + 
				 vo.getDiscrepancyKey());
		 if(vo == null) return null;
		 VendorOffsetTransaction voPers = new VendorOffsetTransaction();
		 voPers.setRodKey(vo.getDiscrepancyKey());
		 voPers.setPoNumber(vo.getPoNumber());
		 voPers.setContractNumber(vo.getContractNumber());
		 voPers.setOffsetAmount(vo.getOffsetAmount());
		 voPers.setCreatedUserCode(vo.getCreatedUserCode());
		 voPers.setAcoName(vo.getAcoName());
		 voPers.setProblemType(vo.getProblemType());
		 logger.info("transformVendorOffset(): Vendor Offset Transformation completed->" + 
				 vo.getDiscrepancyKey());
		 return voPers;
	 }
		
	 
//	 /**
//	  * Transforms value by left padding with '0', 
//	  * but if null pads with spaces.
//	  * 
//	  * @param 	str
//	  * @return
//	  */
//	 private static String leftPadWith0NullSpaces(String str, int n){
//		 if(str != null && str.trim().length() == n){
//			 return str;
//		 }else if(str == null || str.length() == 0){
//			 return Utility.padLeft(str, n);
//		 }else if(str.trim().length() < n){
//			 return Utility.padLeft(str, n, '0');
//		 }
//		 return str;
//	 }
	 
	 /**
	  * Transforms value by left padding with '0'
	  * 
	  * @param str
	  * @return
	  */
	 private static String leftPadWith0(String str, int n){
		 if(str != null && str.trim().length() == n){
			 return str;
		 }else if(str == null || str.trim().length() < n){
			 return Utility.padLeft(str, n, '0');
		 }
		 return str;
	 }
	 
	 //For testing purpose only
	 public static void main(String args[]){
		 System.out.println("Transformed code->" + leftPadWith0("1", 2) + "-" );
	 }
}
