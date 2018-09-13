/*
 * @(#)TransactionPersistenceImpl.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gov.gsa.fas.persistence.common.BaseDAO;
import gov.gsa.fas.persistence.orderdiscrepancy.model.Finance305Transaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.MaterialReturnTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ReshipmentTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.VendorOffsetTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZkpTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZlaTransaction;
import gov.gsa.fas.persistence.orderdiscrepancy.model.ZsaTransaction;
import gov.gsa.fas.services.messages.v1.TransactionType;
import gov.gsa.fas.services.orderdiscrepancy.v1.TransactionConstants;

/**
 * <code>TransactionPersistenceImpl</code> is the local EJB implementation for
 * Transaction Persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */
@Stateless
public class TransactionPersistenceImpl extends BaseDAO 
										implements TransactionPersistence {

	private static final Logger logger = 
		Logger.getLogger(TransactionPersistenceImpl.class.getName());
	

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
			throws TransactionPersistenceException {
		logger.info("createTransactions(): Persisting transactions");
		if(transPersMap.containsKey(TransactionType.ZKP.value())){
			boolean isZkpSuccess = createZkp((ZkpTransaction)transPersMap.get(
					TransactionType.ZKP.value()));
			if(!isZkpSuccess){
				logger.error("createTransactions(): Failed to create ZKP transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}
		}
		if(transPersMap.containsKey(TransactionType.FINANCE_305_CREDIT.value())){
			boolean isFin305Success = createFinance305((Finance305Transaction)transPersMap.get(
					TransactionType.FINANCE_305_CREDIT.value()));
			if(!isFin305Success){
				logger.error("createTransactions(): Failed to create Finance305 Credit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}			
		}
		if(transPersMap.containsKey(TransactionType.FINANCE_305_DEBIT.value())){
			boolean isFin305Success = createFinance305((Finance305Transaction)transPersMap.get(
					TransactionType.FINANCE_305_DEBIT.value()));
			if(!isFin305Success){
				logger.error("createTransactions(): Failed to create Finance305 Debit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.RESHIPMENT.value())){
			boolean isReshipSuccess = createReshipment((ReshipmentTransaction)transPersMap.get(
					TransactionType.RESHIPMENT.value()));
			if(!isReshipSuccess){
				logger.error("createTransactions(): Failed to create Reshipment transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.MATERIAL_RETURN.value())){
			boolean isMraSuccess = createMaterialReturn((MaterialReturnTransaction)transPersMap.get(
					TransactionType.MATERIAL_RETURN.value()));
			if(!isMraSuccess){
				logger.error("createTransactions(): Failed to create Material Return transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.ZLA_CREDIT.value())){
			boolean isZlaSuccess = createZla((ZlaTransaction)transPersMap.get(
					TransactionType.ZLA_CREDIT.value()));
			if(!isZlaSuccess){
				logger.error("createTransactions(): Failed to create ZLA Credit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.ZLA_DEBIT.value())){
			boolean isZlaSuccess = createZla((ZlaTransaction)transPersMap.get(
					TransactionType.ZLA_DEBIT.value()));
			if(!isZlaSuccess){
				logger.error("createTransactions(): Failed to create ZLA Debit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.ZSA_CREDIT.value())){
			boolean isZsaSuccess = createZsa((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_CREDIT.value()));
			if(!isZsaSuccess){
				logger.error("createTransactions(): Failed to create ZSA Credit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.ZSA_DEBIT.value())){
			boolean isZsaSuccess = createZsa((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_DEBIT.value()));
			if(!isZsaSuccess){
				logger.error("createTransactions(): Failed to create ZSA Debit transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.ZSA_PZ.value())){
			boolean isZsaSuccess = createZsa((ZsaTransaction)transPersMap.get(
					TransactionType.ZSA_PZ.value()));
			if(!isZsaSuccess){
				logger.error("createTransactions(): Failed to create ZSA PZ transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}
		if(transPersMap.containsKey(TransactionType.VENDOR_OFFSET.value())){
			boolean isVoSuccess = createVendorOffset((VendorOffsetTransaction)transPersMap.get(
					TransactionType.VENDOR_OFFSET.value()));
			if(!isVoSuccess){
				logger.error("createTransactions(): Failed to create Vendor Offset transaction");
				throw new TransactionPersistenceException("Failed to persist transactions");
			}				
		}				
		return true;
	}	
	
	/**
	 * Creates "ZKP" transaction record.
	 * 
	 * @param 	zkp	<code>ZkpTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	@Override
	public boolean createZkp(ZkpTransaction zkp)
			throws TransactionPersistenceException {
		if(zkp == null){
			logger.error("createZkp(): ZkpTransaction object is null");
			throw new TransactionPersistenceException("ZkpTransaction object is null");			
		}
		logger.info("createZkp(): Persisting ZKP transaction for Key->" + zkp.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.ZKP_CREATE);
			//Following 2 lines temporary
			long zkpKey = getNextSequenceValue(conn, "zkp", "zkp_key");
			pst.setLong(1, zkpKey);
			pst.setLong(2, zkp.getRodKey());
			pst.setByte(3, zkp.getPendingFlag());
			pst.setString(4, zkp.getHeader());
			pst.setString(5, zkp.getTechCode());
			pst.setString(6, zkp.getRequisitionNumber());
			pst.setString(7, zkp.getRequisitionSuffix());
			pst.setString(8, zkp.getReportType());
			pst.setTimestamp(9, zkp.getCreatedTime());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createZkp(): Error occurred while inserting ZKP Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createZkp(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Creates "Finance305" transaction record.
	 * 
	 * @param 	fin305 <code>Finance305Transaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	@Override
	public boolean createFinance305(Finance305Transaction fin305)
			throws TransactionPersistenceException {
		if(fin305 == null){
			logger.error("createFinance305(): Finance305 Transaction object is null");
			throw new TransactionPersistenceException("Finance305 Transaction object is null");			
		}
		logger.info("createFinance305(): Persisting Finance305 transaction for Key->" + fin305.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.FINANCE305_CREATE);
			//Following 2 lines temporary
			long fin305Key = getNextSequenceValue(conn, "fin_305", "fin_305_key");
			pst.setLong(1, fin305Key);
			pst.setLong(2, fin305.getRodKey());
			pst.setByte(3, fin305.getPendingFlag());
			pst.setString(4, fin305.getFileId());
			pst.setInt(5, fin305.getRecordId());
			pst.setString(6, fin305.getDocId());
			pst.setString(7, fin305.getRtgId());
			pst.setString(8, fin305.getComCtrCd());
			pst.setString(9, fin305.getNsn());
			pst.setString(10, fin305.getUnit());
			pst.setInt(11, fin305.getQuantity());
			pst.setString(12, fin305.getRequisitionNumber());
			pst.setString(13, fin305.getRequisitionSuffix());
			pst.setString(14, fin305.getSupplementAddrAAC());
			pst.setString(15, fin305.getSignalCode());
			pst.setString(16, fin305.getFundCode());
			pst.setString(17, fin305.getDistributionCode());
			pst.setString(18, fin305.getProjectCode());
			pst.setString(19, fin305.getPriorityCode());
			pst.setString(20, fin305.getCycleDate());
			pst.setString(21, fin305.getModeOfShip());
			pst.setLong(22, fin305.getExtSellValue());
			pst.setLong(23, fin305.getSellPrice());	
			pst.setShort(24, fin305.getCostPrice());
			pst.setString(25, fin305.getTdSer8Ind());
			pst.setString(26, fin305.getAgencyBureauCode());
			pst.setString(27, fin305.getStateCode());
			pst.setString(28, fin305.getCityCode());
			pst.setString(29, fin305.getExpDomInd());
			pst.setString(30, fin305.getTdCode());
			pst.setString(31, fin305.getManifestPONumber());
			pst.setString(32, fin305.getBoac());
			pst.setString(33, fin305.getRegion());
			pst.setString(34, fin305.getAdviceCode());
			pst.setString(35, fin305.getFasPONumber());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createFinance305(): Error occurred while inserting Finance305 Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createFinance305(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Creates "Reshipment(A15)" transaction record.
	 * 
	 * @param 	reship <code>ReshipmentTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */	
	@Override
	public boolean createReshipment(ReshipmentTransaction reship)
			throws TransactionPersistenceException {
		if(reship == null){
			logger.error("createReshipment(): Reshipment(A15) Transaction object is null");
			throw new TransactionPersistenceException("Reshipment Transaction object is null");			
		}
		logger.info("createReshipment(): Persisting Reshipment transaction for Key->" + reship.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.RESHIPMENT_CREATE);
			//Following 2 lines temporary
			long a15Key = getNextSequenceValue(conn, "a15", "a15_key");
			pst.setLong(1, a15Key);
			pst.setLong(2, reship.getRodKey());
			pst.setByte(3, reship.getPendingFlag());
			pst.setString(4, reship.getDocId());
			pst.setString(5, reship.getDocIdExt());
			pst.setString(6, reship.getRoutingIdCode());
			pst.setString(7, reship.getMediaStatus());
			pst.setString(8, reship.getNsn());
			pst.setString(9, reship.getUnit());
			pst.setInt(10, reship.getQuantity());
			pst.setString(11, reship.getRequisitionNumber());
			pst.setString(12, reship.getSupplementAddrAAC());
			pst.setString(13, reship.getSignalCode());
			pst.setString(14, reship.getFundCode());
			pst.setString(15, reship.getDistributionCode());
			pst.setString(16, reship.getProjectCode());
			pst.setString(17, reship.getPriorityCode());
			pst.setString(18, reship.getRequiredDeliveryDate());
			pst.setString(19, reship.getAdviceCode());
			pst.setString(20, reship.getTdCode());
			pst.setString(21, reship.getRegionCode());
			pst.setString(22, reship.getRoutingCode());	
			pst.setString(23, reship.getCreatedUserCode());
	
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createReshipment(): Error occurred while inserting Reshipment(A15) Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createReshipment(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Creates "MaterialReturn(ZAU)" transaction record.
	 * 
	 * @param 	mr <code>MaterialReturnTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */	
	@Override
	public boolean createMaterialReturn(MaterialReturnTransaction mr)
			throws TransactionPersistenceException {
		if(mr == null){
			logger.error("createMaterialReturn(): Material Return(ZAU) Transaction object is null");
			throw new TransactionPersistenceException("Material Return(ZAU) object is null");			
		}
		logger.info("createMaterialReturn(): Persisting Material Return(ZAU) transaction for Key->" + mr.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.MATERIAL_RETURN_CREATE);
			//Following 2 lines temporary
			long zauKey = getNextSequenceValue(conn, "zau", "zau_key");
			System.out.println("ZAU Key->" + zauKey);
			pst.setLong(1, zauKey);
			pst.setLong(2, mr.getRodKey());
			pst.setByte(3, mr.getPendingFlag());
			pst.setString(4, mr.getDocId());
			pst.setString(5, mr.getNsn());
			pst.setString(6, mr.getUnit());
			pst.setInt(7, mr.getQuantity());
			pst.setString(8, mr.getRequisitionNumber());
			pst.setString(9, mr.getRequisitionSuffix());
			pst.setString(10, mr.getSupplementAddrAAC());
			pst.setString(11, mr.getSignalCode());
			pst.setString(12, mr.getFundCode());
			pst.setString(13, mr.getRoutingIdCode());
			pst.setLong(14, mr.getExtendValue());
			pst.setString(15, mr.getCreatedUserCode());
			pst.setString(16, mr.getLiabilityCode());
			pst.setString(17, mr.getRegionCode());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createMaterialReturn(): Error occurred while inserting Material Return(ZAU) Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createMaterialReturn(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Creates "ZLA" transaction record.
	 * 
	 * @param 	zla	<code>ZlaTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */	
	@Override
	public boolean createZla(ZlaTransaction zla)
			throws TransactionPersistenceException {
		if(zla == null){
			logger.error("createZla(): ZLA Transaction object is null");
			throw new TransactionPersistenceException("ZLA Transaction object is null");			
		}
		logger.info("createZla(): Persisting ZLA transaction for Key->" + zla.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.ZLA_CREATE);
			//Following 2 lines temporary
			long zlaKey = getNextSequenceValue(conn, "zla", "zla_key");
			pst.setLong(1, zlaKey);
			pst.setLong(2, zla.getRodKey());
			pst.setByte(3, zla.getPendingFlag());
			pst.setString(4, zla.getDocId());
			pst.setString(5, zla.getRoutingIdCode());
			pst.setString(6, zla.getBillToIndicator());
			pst.setString(7, zla.getNsn());
			pst.setString(8, zla.getUnit());
			pst.setInt(9, zla.getQuantity());
			pst.setString(10, zla.getRequisitionNumber());
			pst.setString(11, zla.getRequisitionSuffix());	
			pst.setString(12, zla.getSupplementAddrAAC());
			pst.setString(13, zla.getSignalCode());
			pst.setString(14, zla.getFundCode());
			pst.setString(15, zla.getDistributionCode());
			pst.setString(16, zla.getProjectCode());
			pst.setLong(17, zla.getSellPrice());
			pst.setString(18, zla.getChargeBackIndicator());
			pst.setString(19, zla.getRegionCode());
			pst.setString(20, zla.getOriginalTdCode());
			pst.setString(21, zla.getImq());
			pst.setString(22, zla.getItemManager());
			pst.setString(23, zla.getPriorityCode());	
			pst.setString(24, zla.getNumberOfCards());
			pst.setString(25, zla.getCardNo1());
			pst.setString(26, zla.getOriginalDocId());
			pst.setTimestamp(27, zla.getShippedDate());
			pst.setLong(28, zla.getCostPrice());
			pst.setString(29, zla.getStateCode());
			pst.setString(30, zla.getCityCode());
			pst.setString(31, zla.getAgencyBureauCode());
			pst.setString(32, zla.getBoac());
			pst.setString(33, zla.getGlobalPONumber());
			pst.setString(34, zla.getActionTdCode1());
			pst.setString(35, zla.getActionTdCode2());
			pst.setString(36, zla.getExportDomesticCode());
			pst.setTimestamp(37, zla.getCreatedDate());
			pst.setString(38, zla.getCreatedUserCode());
			pst.setString(39, zla.getAdviceCode());
			pst.setString(40, zla.getCardNo2());

	
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createZla(): Error occurred while inserting ZLA Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createZla(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;

	}

	/**
	 * Creates "ZSA" transaction record.
	 * 
	 * @param 	zsa, <code>ZsaTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	@Override
	public boolean createZsa(ZsaTransaction zsa)
			throws TransactionPersistenceException {
		if(zsa == null){
			logger.error("createZsa(): ZSA Transaction object is null");
			throw new TransactionPersistenceException("ZSA Transaction object is null");			
		}
		logger.info("createZsa(): Persisting ZSA transaction for Key->" + zsa.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.ZSA_CREATE);
			//Following 2 lines temporary
			long zsaKey = getNextSequenceValue(conn, "zsa", "zsa_key");
			pst.setLong(1, zsaKey);
			pst.setLong(2, zsa.getRodKey());
			pst.setByte(3, zsa.getPendingFlag());
			pst.setString(4, zsa.getHeader());
			pst.setString(5, zsa.getNsn());
			pst.setString(6, zsa.getUnit());
			pst.setInt(7, zsa.getQuantity());
			pst.setString(8, zsa.getRequisitionNumber());			
			pst.setString(9, zsa.getRequisitionSuffix());
			pst.setTimestamp(10, zsa.getCreatedDate());
			pst.setLong(11, zsa.getCostPrice());
			pst.setLong(12, zsa.getSellPrice());
			pst.setString(13, zsa.getChargeBackIndicator());
			pst.setString(14, zsa.getRegionCode());
			pst.setString(15, zsa.getCreatedUserCode());
			pst.setString(16, zsa.getActionCode());
			pst.setString(17, zsa.getAdviceCode());
	
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createZsa(): Error occurred while inserting ZSA Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createZsa(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Creates "VendorOffset" transaction record.
	 * 
	 * @param 	vo, <code>VendorOffsetTransaction</code> object
	 * @return	true, if the successfully persisted
	 * @throws 	TransactionPersistenceException, if any error occurs
	 */
	@Override
	public boolean createVendorOffset(VendorOffsetTransaction vo)
			throws TransactionPersistenceException {
		if(vo == null){
			logger.error("createVendorOffset(): Vendor Offset Transaction object is null");
			throw new TransactionPersistenceException("Vendor Offset transaction object is null");			
		}
		logger.info("createVendorOffset(): Persisting Vendor Offset transaction for Key->" + vo.getRodKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.VENDOR_OFFSET_CREATE);
			//Following 2 lines temporary
			long zauKey = getNextSequenceValue(conn, "vendor_offset", "vendor_offset_key");
			pst.setLong(1, zauKey);
			pst.setLong(2, vo.getRodKey());
			pst.setString(3, vo.getPoNumber());
			pst.setString(4, vo.getContractNumber());
			pst.setLong(5, vo.getOffsetAmount());
			pst.setString(6, vo.getCreatedUserCode());
			pst.setString(7, vo.getAcoName());
			pst.setString(8, vo.getProblemType());
	
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("createVendorOffset(): Error occurred while inserting Vendor Offset Transaction record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createVendorOffset(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}
	
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
													throws TransactionPersistenceException{
		logger.info("retrieveZkp(): Retrieving Zkp for requisition Number->" + reqNo + 
				" and Suffix->" + reqSuffix);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveZkp(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for ZKP lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  ZkpTransaction zkp = null;
	  try {
			conn = getVISSConnection();
			String zkpRetrieveSql = TransactionSqlConstants.ZKP_RETRIEVE;
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				zkpRetrieveSql = zkpRetrieveSql + " and zkp_sfx=?";
			}
			pst = conn.prepareStatement(zkpRetrieveSql);
			pst.setString(1, reqNo);
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				pst.setString(2, reqSuffix);
			}
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			if(rs.next()){
				zkp = new ZkpTransaction();
				zkp.setZkpKey(rs.getLong("ZKP_KEY"));
				zkp.setRequisitionNumber(rs.getString("ZKP_REQ"));
				zkp.setRequisitionSuffix(rs.getString("ZKP_SFX"));
				return zkp;
			}
		} catch (SQLException e) {
			logger.error("retrieveZkp(): Error occurred while retrieving Zkp record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveZkp(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return zkp;
	}

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
			String actionType) throws TransactionPersistenceException{
		logger.info("retrieveFinance305(): Retrieving Finance305 for requisition Number->" + reqNo + 
				" and Suffix->" + reqSuffix);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveFinance305(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for Finance305 lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  Finance305Transaction fin305 = null;
	  try {
			conn = getVISSConnection();
			String fin305RetrieveSql = TransactionSqlConstants.FINANCE305_RETRIEVE;
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				fin305RetrieveSql = fin305RetrieveSql + " and fin_305_sfx=?";
			}
			pst = conn.prepareStatement(fin305RetrieveSql);
			pst.setString(1, reqNo);
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				pst.setString(2, reqSuffix);
			}
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			while(rs.next()){
				fin305 = new Finance305Transaction();
				fin305.setFin305Key(rs.getLong("FIN_305_KEY"));
				fin305.setRequisitionNumber(rs.getString("FIN_305_REQ"));
				fin305.setRequisitionSuffix(rs.getString("FIN_305_SFX"));
				String actionCode = rs.getString("FIN_305_T_D_CDE");
				fin305.setTdCode(actionCode);
				if(getActionCodes(actionType).contains(actionCode)){
					return fin305;
				}
			}
		} catch (SQLException e) {
			logger.error("retrieveFinance305(): Error occurred while retrieving Finance305 record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveFinance305(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return null;		
	}
	
	/**
	 * Retrieves Reshipment transaction for the provided requisition Number.
	 * 
	 * @param 	reqNo Requisition Number
	 * @return	return <code>ReshipmentTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ReshipmentTransaction retrieveReshipment(String reqNo) 									
													throws TransactionPersistenceException{
		logger.info("retrieveReshipment(): Retrieving Reshipment for requisition Number->" + reqNo);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveReshipment(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for Reshipment lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  ReshipmentTransaction reshipment = null;
	  try {
			conn = getVISSConnection();
			String reshipRetrieveSql = TransactionSqlConstants.RESHIPMENT_RETRIEVE;
			pst = conn.prepareStatement(reshipRetrieveSql);
			pst.setString(1, reqNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			if(rs.next()){
				reshipment = new ReshipmentTransaction();
				reshipment.setA15Key(rs.getLong("A15_KEY"));
				reshipment.setRequisitionNumber(rs.getString("A15_REQ"));
				return reshipment;
			}
		} catch (SQLException e) {
			logger.error("retrieveReshipment(): Error occurred while retrieving Reshipment record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveReshipment(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return reshipment;				
	}
	
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
													throws TransactionPersistenceException{
		logger.info("retrieveMaterialReturn(): Retrieving Material Return for requisition Number->" + reqNo + 
				" and Suffix->" + reqSuffix);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveMaterialReturn(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for Material Return lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  MaterialReturnTransaction mra = null;
	  try {
			conn = getVISSConnection();
			String mraRetrieveSql = TransactionSqlConstants.MATERIAL_RETURN_RETRIEVE;
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				mraRetrieveSql = mraRetrieveSql + " and zau_sfx=?";
			}
			pst = conn.prepareStatement(mraRetrieveSql);
			pst.setString(1, reqNo);
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				pst.setString(2, reqSuffix);
			}
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			if(rs.next()){
				mra = new MaterialReturnTransaction();
				mra.setZauKey(rs.getLong("ZAU_KEY"));
				mra.setRequisitionNumber(rs.getString("ZAU_REQ"));
				mra.setRequisitionSuffix(rs.getString("ZAU_SFX"));
				return mra;
			}
		} catch (SQLException e) {
			logger.error("retrieveMaterialReturn(): Error occurred while retrieving MRA record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveMaterialReturn(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return mra;				
	}
	
	/**
	 * Retrieves ZLA transaction for the provided requisition number, requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @param 	actionType
	 * @return	<code>ZlaTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ZlaTransaction retrieveZla(String reqNo, String reqSuffix,
			String actionType) throws TransactionPersistenceException{
		logger.info("retrieveZla(): Retrieving ZLA for requisition Number->" + reqNo + 
				" and Suffix->" + reqSuffix);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveZla(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for ZLA lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  ZlaTransaction zla = null;
	  try {
			conn = getVISSConnection();
			String zlaRetrieveSql = TransactionSqlConstants.ZLA_RETRIEVE;
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				zlaRetrieveSql = zlaRetrieveSql + " and zla_sfx=?";
			}
			pst = conn.prepareStatement(zlaRetrieveSql);
			pst.setString(1, reqNo);
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				pst.setString(2, reqSuffix);
			}
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			while(rs.next()){
				zla = new ZlaTransaction();
				zla.setZlaKey(rs.getLong("ZLA_KEY"));
				zla.setRequisitionNumber(rs.getString("ZLA_REQ"));
				zla.setRequisitionSuffix(rs.getString("ZLA_SFX"));
				String actionCode1 = rs.getString("ZLA_ACTION_TD_CD_1");
				String actionCode2 = rs.getString("ZLA_ACTION_TD_CD_2");
				zla.setActionTdCode1(actionCode1);
				zla.setActionTdCode2(actionCode2);
				String actionCode = actionCode1 + actionCode2;
				if(getActionCodes(actionType).contains(actionCode)){
					return zla;
				}
			}
		} catch (SQLException e) {
			logger.error("retrieveZla(): Error occurred while retrieving ZLA record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveZla(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return null;				
	}
	
	/**
	 * Retrieves ZSA transaction for the provided requisition number, requisition suffix.
	 * 
	 * @param 	reqNo Requisition Number
	 * @param 	reqSuffix Requisition suffix
	 * @param 	actionType
	 * @return	<code>ZsaTransaction</code> object
	 * @throws 	TransactionPersistenceException
	 */
	public ZsaTransaction retrieveZsa(String reqNo, String reqSuffix,
			String actionType) throws TransactionPersistenceException{
		logger.info("retrieveZsa(): Retrieving ZSA for requisition Number->" + reqNo + 
				" and Suffix->" + reqSuffix);
		if(reqNo == null || reqNo.isEmpty()){
			logger.error("retrieveZsa(): Requisition number is null");
			throw new TransactionPersistenceException("Requisition Number is required for ZSA lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  ZsaTransaction zsa = null;
	  try {
			conn = getVISSConnection();
			String zsaRetrieveSql = TransactionSqlConstants.ZSA_RETRIEVE;
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				zsaRetrieveSql = zsaRetrieveSql + " and zsa_sfx=?";
			}
			pst = conn.prepareStatement(zsaRetrieveSql);
			pst.setString(1, reqNo);
			if(reqSuffix != null && !reqSuffix.trim().isEmpty()){
				pst.setString(2, reqSuffix);
			}
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			while(rs.next()){
				zsa = new ZsaTransaction();
				zsa.setZsaKey(rs.getLong("ZSA_KEY"));
				zsa.setRequisitionNumber(rs.getString("ZSA_REQ"));
				zsa.setRequisitionSuffix(rs.getString("ZSA_SFX"));
				String actionCode = rs.getString("ZSA_ACN_CDE");
				zsa.setActionCode(actionCode);
				if(getActionCodes(actionType).contains(actionCode)){
					return zsa;
				}
			}
		} catch (SQLException e) {
			logger.error("retrieveZsa(): Error occurred while retrieving ZSA record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveZsa(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return null;				
	}
	
	/**
	 * Retrieves VendorOffset transaction for the PO Number.
	 * 
	 * @param 	poNo
	 * @return	VendorOffset
	 * @throws 	TransactionPersistenceException
	 */
	public VendorOffsetTransaction retrieveVendorOffset(String poNo)
			throws TransactionPersistenceException {
		logger.info("retrieveVendorOffset(): Retrieving Vendor Offset for PO Number->" + poNo);
		if(poNo == null || poNo.isEmpty()){
			logger.error("retrieveVendorOffset(): PO number is null");
			throw new TransactionPersistenceException("PO Number is required for Vendor Offset lookup");
		}
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  VendorOffsetTransaction vo = null;
	  try {
			conn = getVISSConnection();
			String voRetrieveSql = TransactionSqlConstants.VENDOR_OFFSET_RETRIEVE;
			pst = conn.prepareStatement(voRetrieveSql);
			pst.setString(1, poNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			if(rs.next()){
				vo = new VendorOffsetTransaction();
				vo.setVendorOffsetKey(rs.getLong("VENDOR_OFFSET_KEY"));
				vo.setPoNumber(rs.getString("VENDOR_OFFSET_PO_NBR"));
				return vo;
			}
		} catch (SQLException e) {
			logger.error("retrieveVendorOffset(): Error occurred while retrieving Vendor Offset record", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveVendorOffset(): Failed to close Connection or PreparedStatement", e);
			}
		}
		return vo;
	}	
	
	/**
	 * Deletes all Zkp records from ZKP transaction table.
	 * 
	 * @return	true, if successful
	 * @throws 	TransactionPersistenceException
	 */
	public boolean deleteZkp() throws TransactionPersistenceException{
		logger.error("deleteZkp(): Deleting all ZKP records");
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(TransactionSqlConstants.ZKP_DELETE);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("deleteZkp(): Error occurred while deleting ZKP records", e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("deleteZkp(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;		
	}
	
	///////////////////////////////////////////////////////
	//////////// This is temporary until sequence created//
	///////////////////////////////////////////////////////
	private Long getNextSequenceValue(Connection conn, String table, String column) 
																	throws TransactionPersistenceException{
	  PreparedStatement pst = null;
	  ResultSet rs = null;
		try{
			String maxSql = "select MAX(" + column + ") MAX_VAL from " + table;
			logger.info("getNextSequenceValue(): Max Sequence ->" + maxSql);
			pst = conn.prepareStatement(maxSql);
			rs = pst.executeQuery();
			if(rs == null){
				return new Long(10000 + 1);
			}	
			if(rs.next()){
				return rs.getLong("MAX_VAL") + 1;
			}
		}catch (SQLException e) {
			logger.error("getNextSequenceValue(): Error occurred while getting next sequence value for->" + table + 
					" and Column->" + column, e);
			throw new TransactionPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(pst != null){
					pst.close();
				}
			} catch (SQLException e) {
				logger.error("getNextSequenceValue(): Failed to close Resultset or PreparedStatement", e);
			}
		}	
		return null;
	}
	
	/**
	 * Get the list of action codes based on action type.
	 * 
	 * @param 	actionType
	 * @return	
	 */
	private List<String> getActionCodes(String actionType) {
		String[] actionCodes = null;
		if(actionType.equals(TransactionConstants.ACTION_CREDIT)){
			actionCodes = TransactionConstants.ACTION_CODES_CREDIT;
		}else if(actionType.equals(TransactionConstants.ACTION_DEBIT)){
			actionCodes = TransactionConstants.ACTION_CODES_DEBIT;
		}else if(actionType.equals(TransactionConstants.ACTION_PZ)){
			actionCodes = TransactionConstants.ACTION_CODES_PZ;
		}
		return Arrays.asList(actionCodes);
	}
	
	
	//For testing purpose only overridden
	public Connection getVISSConnection1() throws SQLException{
		String JDBC_URL = "jdbc:sybase:Tds:eagu35.fss.gsa.gov:5610/viss";
		String DB_USER = "vissowner";
		String DB_PASSWORD ="vo123456";
		Connection conn=null;
		try {
			Class.forName("com.sybase.jdbc3.jdbc.SybDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Properties props = new Properties();
		props.put("user", DB_USER);
		props.put("password", DB_PASSWORD);
		System.out.println("JDBC Url->" + JDBC_URL);
		try {
			conn = DriverManager.getConnection(JDBC_URL, props);
//			checkForWarning(conn.getWarnings());
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return conn;
	}
}
