/*
 * @(#)ComplaintPersistenceImpl.java			Aug 16, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.complaint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gov.gsa.fas.persistence.common.BaseDAO;
import gov.gsa.fas.persistence.order.complaint.model.OrderComplaint;
import gov.gsa.fas.persistence.order.complaint.model.OrderInvestigation;

/**
 * <code>ComplaintPersistenceImpl</code> is the local EJB implementation for
 * Complaint Persistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see    	gov.gsa.fas.persistence.order.complaint.service.ComplaintPersistence 
 */

@Stateless
public class ComplaintPersistenceImpl extends BaseDAO implements
																						ComplaintPersistence {
	
	private static final Logger logger = 
		Logger.getLogger(ComplaintPersistenceImpl.class.getName());	

	/**
	 * Creates order quality complain data in OCMS system.
	 * 
	 * @param 	orderComplaint <code>OrderComplaint</code> object
	 * @return	complaint key
	 * @throws 	ComplaintPersistenceException
	 */
	public long createComplaint(OrderComplaint complaint)
			throws ComplaintPersistenceException {
		if(complaint == null){
			logger.error("createComplaint(): Order Complaint object is null");
			throw new ComplaintPersistenceException("Order Complaint object is Empty");			
		}
		logger.info("createComplaint(): Persisting Order Complaint for NSN->" + complaint.getNsn() + 
				", Item Name->" + complaint.getItemName());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.INSERT_COMPLAINT);
			long complaintKey = getNextSequenceValue(conn);
			logger.info("createComplaint(): Complaint Key->"+ complaintKey);
			pst.setLong(1, complaintKey);
			pst.setString(2, complaint.getNsn());
			pst.setString(3, complaint.getItemName());
			pst.setString(4, complaint.getCategory());
			pst.setString(5, complaint.getComplaintDate());
			pst.setString(6, complaint.getReceivedDate());
			pst.setString(7, complaint.getOriginatorName());
			pst.setString(8, complaint.getOriginatorAddress1());
			pst.setString(9, complaint.getOriginatorAddress2());
			pst.setString(10, complaint.getOriginatorCity());
			pst.setString(11, complaint.getOriginatorState());
			pst.setString(12, complaint.getOriginatorZip());
			pst.setString(13, complaint.getPocName());
			pst.setString(14, complaint.getPocPhone());
			pst.setString(15, complaint.getRequisitionNumber());
			pst.setString(16, complaint.getNotificationType());
			pst.setString(17, complaint.getNotificationTypeText());
			pst.setString(18, complaint.getPurchaseOrderNumber());
			pst.setString(19, complaint.getQuantityReceived());
			pst.setString(20, complaint.getQuantityRejected());
			pst.setString(21, complaint.getNatureOfComplaint());
			pst.setString(22, complaint.getOperationCenter());
			pst.setString(23, complaint.getContractNumber());
			pst.setString(24, complaint.getComplaintClosed());
			pst.setString(25, complaint.getNcscFirstName());
			pst.setString(26, complaint.getNcscLastName());
			pst.setString(27, complaint.getNcscEmail());
			pst.setString(28, complaint.getNcscPhone());
			pst.setString(29, complaint.getNcscPhoneExt());
			pst.setLong(30, 1); //LST_MODFD_BY hard coded to 1
			pst.setString(31, complaint.getLastModifiedTime());
			pst.setString(32, complaint.getLastModifiedDate());
			pst.setString(33, complaint.getModifyAction());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createComplaint(): Complaint created for Comlaint key->" + 
						complaint.getComplaintKey());				
				return complaintKey;
			}
		} catch (SQLException e) {
			logger.error("createComplaint(): Error occurred while inserting Complaint record", e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createComplaint(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return -1;
	}
	
	/**
	 * Retrieves order quality complaint data from OCMS system for the corresponding
	 * complaint key.
	 * 
	 * @param 	complaintKey
	 * @return	<code>OrderComplaint</code> object
	 * @throws 	ComplaintPersistenceException
	 */
	public OrderComplaint retrieveComplaint(long complaintKey) 
																throws ComplaintPersistenceException {
		if(complaintKey <= 0){
			logger.error("retrieveComplaint(): Complaint key is 0");
			throw new ComplaintPersistenceException("Complaint key is not valid");			
		}
		logger.info("retrieveComplaint(): Retrieving Order Complaint for Complaint Key->" + complaintKey);
		OrderComplaint complaint = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.RETRIEVE_COMPLAINT);
			pst.setLong(1, complaintKey);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			while(rs.next()){
				complaint = new OrderComplaint();
				complaint.setComplaintKey(rs.getLong("CMPLNT_KEY"));
				complaint.setControlNumber(rs.getString("CI_CNTRL_NBR"));
				complaint.setNsn(rs.getString("NSN"));
				complaint.setItemName(rs.getString("ITM_NME"));
				complaint.setCategory(rs.getString("CTGRY"));
				complaint.setComplaintDate(rs.getString("CMPLNT_DT"));
				complaint.setReceivedDate(rs.getString("CMPLNT_RCVD_DT"));
				complaint.setOriginatorName(rs.getString("CMPLNT_ORGNTR_NME"));
				complaint.setOriginatorAddress1(rs.getString("CMPLNT_ORGNTR_ADDR1"));
				complaint.setOriginatorAddress2(rs.getString("CMPLNT_ORGNTR_ADDR2"));
				complaint.setOriginatorCity(rs.getString("CMPLNT_ORGNTR_CTY"));
				complaint.setOriginatorState(rs.getString("CMPLNT_ORGNTR_ST"));
				complaint.setOriginatorZip(rs.getString("CMPLNT_ORGNTR_ZIP"));
				complaint.setPocName(rs.getString("CMPLNT_POC_NME"));
				complaint.setPocPhone(rs.getString("CMPLNT_POC_PHNE"));
				complaint.setRequisitionNumber(rs.getString("AGNCY_REQSTN_NBR"));
				complaint.setNotificationType(rs.getString("NOTFY_TYP"));
				complaint.setNotificationTypeText(rs.getString("NOTFY_TYP_TXT"));
				complaint.setPurchaseOrderNumber(rs.getString("PRCHSE_ORDR_NBR"));
				complaint.setQuantityReceived(rs.getString("QNTY_RCVD"));
				complaint.setQuantityRejected(rs.getString("QNTY_RJCTD"));
				complaint.setNatureOfComplaint(rs.getString("NTURE_OF_CMPLNT"));
				complaint.setOperationCenter(rs.getString("OPRTN_CNTR"));
				complaint.setContractNumber(rs.getString("FRML_CNTRCT_NBR"));
				complaint.setInvestigationClosed(rs.getString("INVSTGTN_CLOSED"));
				complaint.setComplaintClosed(rs.getString("CMPLNT_CLOSED"));
				complaint.setNcscFirstName(rs.getString("NCSC_ORGNTR_FNME"));
				complaint.setNcscLastName(rs.getString("NCSC_ORGNTR_LNME"));
				complaint.setNcscEmail(rs.getString("NCSC_ORGNTR_EMAIL"));
				complaint.setNcscPhone(rs.getString("NCSC_ORGNTR_PHNE"));
				complaint.setNcscPhoneExt(rs.getString("NCSC_ORGNTR_PHNE_EXT"));
				complaint.setLastModifiedBy(rs.getInt("LST_MODFD_BY"));
				complaint.setLastModifiedTime(rs.getString("LST_MODFD_TM"));
				complaint.setLastModifiedDate(rs.getString("LST_MODFD_DT"));
				complaint.setModifyAction(rs.getString("MODFY_ACTN"));
			}
		} catch (SQLException e) {
			logger.error("retrieveComplaint(): Error occurred while retrieving complaint Details->" + 
					complaintKey, e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveComplaint(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		logger.info("retrieveComplaint(): Retrieved complaint details for Complaint Key ->" +complaintKey);			
		return complaint;		
	}

	/**
	 * Updates order quality complaint data in the OCMS system
	 * for the specified complaint key.
	 * 
	 * @param 	orderComplaint <code>OrderComplaint</code> object
	 * @param 	existComplaint existing <code>OrderComplaint</code> object
	 * @return	true, if successful
	 * @throws 	ComplaintPersistenceException
	 */
	public boolean updateComplaint(OrderComplaint complaint, 
			OrderComplaint existComplaint) throws ComplaintPersistenceException {
		if(complaint == null){
			logger.error("updateComplaint(): Order Complaint object is null");
			throw new ComplaintPersistenceException("Order Complaint object is Empty");			
		}
		logger.info("updateComplaint(): Updating Order Complaint for Complaint Key->" + complaint.getComplaintKey());
		boolean isHistUpdate = createComplaintHistory(existComplaint);
		if(!isHistUpdate){
			logger.error("updateComplaint():Failed to create history record");
			throw new ComplaintPersistenceException("Failed to create history record");	
		}
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.UPDATE_COMPLAINT);
			pst.setString(1, complaint.getNsn());
			pst.setString(2, complaint.getItemName());
			pst.setString(3, complaint.getCategory());
			pst.setString(4, complaint.getComplaintDate());
			pst.setString(5, complaint.getReceivedDate());
			pst.setString(6, complaint.getOriginatorName());
			pst.setString(7, complaint.getOriginatorAddress1());
			pst.setString(8, complaint.getOriginatorAddress2());
			pst.setString(9, complaint.getOriginatorCity());
			pst.setString(10, complaint.getOriginatorState());
			pst.setString(11, complaint.getOriginatorZip());
			pst.setString(12, complaint.getPocName());
			pst.setString(13, complaint.getPocPhone());
			pst.setString(14, complaint.getRequisitionNumber());
			pst.setString(15, complaint.getNotificationType());
			pst.setString(16, complaint.getNotificationTypeText());
			pst.setString(17, complaint.getPurchaseOrderNumber());
			pst.setString(18, complaint.getQuantityReceived());
			pst.setString(19, complaint.getQuantityRejected());
			pst.setString(20, complaint.getNatureOfComplaint());
			pst.setString(21, complaint.getOperationCenter());
			pst.setString(22, complaint.getContractNumber());
			pst.setString(23, complaint.getComplaintClosed());
			pst.setString(24, complaint.getNcscFirstName());
			pst.setString(25, complaint.getNcscLastName());
			pst.setString(26, complaint.getNcscEmail());
			pst.setString(27, complaint.getNcscPhone());
			pst.setString(28, complaint.getNcscPhoneExt());
			pst.setLong(29, 1); //LST_MODFD_BY hard coded to 1
			pst.setString(30, complaint.getLastModifiedTime());
			pst.setString(31, complaint.getLastModifiedDate());
			pst.setString(32, complaint.getModifyAction());
			pst.setLong(33, complaint.getComplaintKey());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("updateComplaint(): Error occurred while updating Complaint record", e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("updateComplaint(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Cancels order quality complaint in the OCMS systems
	 * by updating "CMPLNT_CLOSED" to "Y".
	 * 
	 * @param 	complaintKey
	 * @return	true if successful
	 * @throws 	ComplaintPersistenceException
	 */
	public boolean cancelComplaint(long complaintKey)
			throws ComplaintPersistenceException {
		if(complaintKey <= 0){
			logger.error("cancelComplaint(): Complaint key is 0");
			throw new ComplaintPersistenceException("Complaint key is not valid");			
		}
		logger.info("cancelComplaint(): Cancelling Order Complaint for Complaint Key->" + complaintKey);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.CANCEL_COMPLAINT);
			pst.setLong(1, complaintKey);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("cancelComplaint(): Error occurred while cancelling Complaint record", e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("cancelComplaint(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Retrieves the investigation details in the OCMS system
	 * for the corresponding complaint key
	 * 
	 * @param 	complaintKey
	 * @return	<code>OrderInvestigation</code> object
	 * @throws 	ComplaintPersistenceException
	 */
	public OrderInvestigation retrieveInvestigation(long complaintKey)
			throws ComplaintPersistenceException {
		if(complaintKey <= 0){
			logger.error("retrieveInvestigation(): Complaint key is 0");
			throw new ComplaintPersistenceException("Complaint key is not valid");			
		}
		logger.info("retrieveInvestigation(): Retrieving Investigation details for Complaint Key->" +complaintKey);
		OrderInvestigation investigation = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.RETRIEVE_INVESTIGATION);
			pst.setLong(1, complaintKey);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			while(rs.next()){
				investigation = new OrderInvestigation();
				investigation.setInvestigationKey(rs.getLong("INVSTGTN_KEY"));
				investigation.setControlNumber(rs.getString("CI_CNTRL_NBR"));
				investigation.setStatus(rs.getString("FRM_STATS"));
				investigation.setCimKey(rs.getLong("CIM_KEY"));
				investigation.setFirstName(rs.getString("FNAME"));
				investigation.setMiddleName(rs.getString("MNAME"));
				investigation.setLastName(rs.getString("LNAME"));
				investigation.setPhone(rs.getString("ALT_PHONE"));
				investigation.setFax(rs.getString("FAX"));
				investigation.setEmail(rs.getString("GEN_EMAIL"));
				investigation.setLastModifiedBy(rs.getInt("LST_MODFD_BY"));
				investigation.setLastModifiedTime(rs.getString("LST_MODFD_TM"));
				investigation.setLastModifiedDate(rs.getString("LST_MODFD_DT"));
				investigation.setModifiedAction(rs.getString("MODFY_ACTN"));
				investigation.setOperationCenter(rs.getString("OPRTN_CNTR"));
			}
		} catch (SQLException e) {
			logger.error("retrieveInvestigation(): Error occurred while retrieving investigation Details->" + 
					complaintKey, e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveInvestigation(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		logger.info("retrieveInvestigation(): Retrieved Investigation details for Complaint Key ->" +complaintKey);			
		return investigation;		
	}

	/**
	 * Getting the next sequence value for Complaint key.
	 * 
	 * @param 	conn
	 * @return	value of complaint key
	 * @throws 	ComplaintPersistenceException
	 */
	private Long getNextSequenceValue(Connection conn) 
																		throws ComplaintPersistenceException{
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			String maxSql = "select MAX(CMPLNT_KEY) MAX_VAL from M_QCOMPLAINT_M";
			logger.info("getNextSequenceValue(): Max Sequence ->" + maxSql);
			pst = conn.prepareStatement(maxSql);
			rs = pst.executeQuery();
			if(rs == null){
				throw new ComplaintPersistenceException("Failed to get next sequence value for Complaint Key");
			}	
			if(rs.next()){
				return rs.getLong("MAX_VAL") + 1;
			}
		}catch (SQLException e) {
			logger.error("getNextSequenceValue(): Error occurred while getting next sequence value for D524M3S2 "+ 
					" and Column CMPLNT_KEY", e);
			throw new ComplaintPersistenceException("VISS Database Error-" + e.getMessage(), e);
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
	 * Creates order quality complain data in the history table.
	 * 
	 * @param 	orderComplaint <code>OrderComplaint</code> object
	 * @return	true, if successful
	 * @throws 	ComplaintPersistenceException
	 */
	private boolean createComplaintHistory(OrderComplaint complaint)
			throws ComplaintPersistenceException {
		if(complaint == null){
			logger.error("createComplaintHistory(): Order Complaint object is null");
			throw new ComplaintPersistenceException("Order Complaint object is Empty");			
		}
		logger.info("createComplaintHistory(): Persisting Order Complaint History for NSN->" + complaint.getNsn() + 
				", Item Name->" + complaint.getItemName());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getOCMSConnection();
			pst = conn.prepareStatement(OrderComplaintSqlConstants.INSERT_COMPLAINT_HISTORY);
			logger.info("createComplaint(): Complaint Key->"+ complaint.getComplaintKey());
			pst.setLong(1, complaint.getComplaintKey());
			pst.setString(2, complaint.getControlNumber());
			pst.setString(3, complaint.getNsn());
			pst.setString(4, complaint.getItemName());
			pst.setString(5, complaint.getCategory());
			pst.setString(6, complaint.getComplaintDate());
			pst.setString(7, complaint.getReceivedDate());
			pst.setString(8, complaint.getOriginatorName());
			pst.setString(9, complaint.getOriginatorAddress1());
			pst.setString(10, complaint.getOriginatorAddress2());
			pst.setString(11, complaint.getOriginatorCity());
			pst.setString(12, complaint.getOriginatorState());
			pst.setString(13, complaint.getOriginatorZip());
			pst.setString(14, complaint.getPocName());
			pst.setString(15, complaint.getPocPhone());
			pst.setString(16, complaint.getRequisitionNumber());
			pst.setString(17, complaint.getNotificationType());
			pst.setString(18, complaint.getNotificationTypeText());
			pst.setString(19, complaint.getPurchaseOrderNumber());
			pst.setString(20, complaint.getQuantityReceived());
			pst.setString(21, complaint.getQuantityRejected());
			pst.setString(22, complaint.getNatureOfComplaint());
			pst.setString(23, complaint.getOperationCenter());
			pst.setString(24, complaint.getContractNumber());
			pst.setString(25, complaint.getInvestigationClosed());
			pst.setString(26, complaint.getComplaintClosed());
			pst.setString(27, complaint.getNcscFirstName());
			pst.setString(28, complaint.getNcscLastName());
			pst.setString(29, complaint.getNcscEmail());
			pst.setString(30, complaint.getNcscPhone());
			pst.setString(31, complaint.getNcscPhoneExt());
			pst.setLong(32, complaint.getLastModifiedBy()); 
			pst.setString(33, complaint.getLastModifiedTime());
			pst.setString(34, complaint.getLastModifiedDate());
			pst.setString(35, complaint.getModifyAction());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createComplaintHistory(): Complaint history record created for Comlaint key->" + 
						complaint.getComplaintKey());
				return true;
			}
		} catch (SQLException e) {
			logger.error("createComplaintHistory(): Error occurred while inserting Complaint history record", e);
			throw new ComplaintPersistenceException("OCMS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("createComplaintHistory(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return false;
	}	
	
}
