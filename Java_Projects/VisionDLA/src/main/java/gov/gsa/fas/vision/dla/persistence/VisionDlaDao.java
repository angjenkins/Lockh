/*
 * @(#)VisionDlaDao.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>VisionDlaDao</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaDao extends BaseDao{
	private static Logger logger = Logger.getLogger(VisionDlaDao.class);
	
	public int createVisionDla(WsdrRequestData wsdrReqData) 
										throws VisionDlaPersistenceException {
		logger.info("createVisionDla(): Creating Vision DLA Entry for Req#->" + wsdrReqData.getDocumentNumber());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_VISIONDLA);
			pst.setString(1, wsdrReqData.getDocumentNumber());
			pst.setString(2, wsdrReqData.getDocNumberSuffix());
			pst.setString(3, wsdrReqData.getWebsdrNumber());
			pst.setString(4, wsdrReqData.getTransactionPurposeCode());
			pst.setLong(5,  wsdrReqData.getWsdrRequestId());
			pst.setInt(6, DlaStatusEnum.REQUEST_RECEIVED.statusId());;
			pst.setTimestamp(7, Utility.getCurrentTimestamp());

			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createVisionDla(): VisionDLA entry created");
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("createVisionDla(): Error occurred while inserting VisionDla record", e);
			throw new VisionDlaPersistenceException("Failed to insert VisionDLA Entry" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}	
	
	int updateVisionDlaStatusByDlaId(long visionDlaId, int statusId) 
			throws VisionDlaPersistenceException{
		logger.info("updateVisionDlaStatus(): Updating VisionDLAStatus for->" + visionDlaId + 
				", Status->" + statusId);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_VISIONDLA_STATUS_BY_DLAID);
			pst.setInt(1, statusId);
			pst.setTimestamp(2, Utility.getCurrentTimestamp());
			pst.setLong(3, visionDlaId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateVisionDlaStatus(): VisionDla status updated for Wsdr Req Id->" +
						visionDlaId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateVisionDlaStatus(): Error occurred while updating VisionDLA status->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to update vision dla status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}

	public List<Long> retrieveVisionDlaId(long wsdrRequestId, String websdrNumber,
			int statusId) throws VisionDlaPersistenceException{
		logger.info("retrieveVisionDlaId(): Retrieving Vision Dla Id for Wsdr Request Id->" + wsdrRequestId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  List<Long> visionDlaIds = new ArrayList<Long>();
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_VISIONDLA_ID_BY_STATUS);
	  	pst.setLong(1, wsdrRequestId);
	  	pst.setString(2, websdrNumber);
	  	pst.setInt(3, statusId);
	  	rs = pst.executeQuery();
			while(rs != null && rs.next()){
				visionDlaIds.add(rs.getLong("vision_dla_id"));
			}
			return visionDlaIds;
		} catch (SQLException e) {
			logger.error("retrieveVisionDlaId(): Error occurred while retrieving Vision DLA Ids for " +
					"WSDRReqId->" + wsdrRequestId, e);
			throw new VisionDlaPersistenceException("Failed to retrieve VisionDlaId", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}			
	}

	public int updateValidationStatuses(long visionDlaId,
			boolean documentNumberValid, boolean dodAacValid) throws VisionDlaPersistenceException{
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_VISIONDLA_VALIDATION_STATUSES);
			String documentValid= (documentNumberValid)?"Y":"N";
			String aacValid= (dodAacValid)?"Y":"N";
			pst.setString(1, documentValid);
			pst.setString(2, aacValid);
			pst.setTimestamp(3,  Utility.getCurrentTimestamp());
			pst.setLong(4, visionDlaId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateValidationStatuses(): VisionDla validations statuses updated for Vision Dla Id->" +
						visionDlaId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateValidationStatuses(): Error occurred while updating VisionDLA validation statuses->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to update vision dla validation statuses" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}			
	}

	public int updateSfStatus(long visionDlaId, String sfStagingId, int sfStatusId) 
				throws VisionDlaPersistenceException{
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_VISIONDLA_SF_TRANSMIT);
			pst.setString(1, sfStagingId);
			pst.setInt(2, sfStatusId);
			pst.setTimestamp(3,  Utility.getCurrentTimestamp());
			pst.setLong(4, visionDlaId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateSfStatus(): VisionDla SF transmission status updated for Vision Dla Id->" +
						visionDlaId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateSfStatus(): Error occurred while updating VisionDLA SF transmission status->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to update VisionDLA SF transmission status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}	
	}

	public WsdrRequestData retrieveVisionDlaById(long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveVisionDlaById(): Retrieving Vision Dla for Vision Dla Id->" + visionDlaId);
		  PreparedStatement pst = null;
		  ResultSet rs = null;
		  Connection conn = null;
		  WsdrRequestData wsdrReqData = null;
		  try{
		  	conn = getVisionDlaConnection();
		  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_VISIONDLA_ID_BY_ID);
		  	pst.setLong(1, visionDlaId);
		  	rs = pst.executeQuery();
				while(rs != null && rs.next()){
					wsdrReqData = new WsdrRequestData();
					wsdrReqData.setVisionDlaId(rs.getLong("vision_dla_id"));
					wsdrReqData.setWsdrRequestId(rs.getLong("wsdr_req_id"));
				}
				return wsdrReqData;
			} catch (SQLException e) {
				logger.error("retrieveVisionDlaById(): Error occurred while retrieving Vision DLA for " +
						"VisionDLA Id->" + visionDlaId, e);
				throw new VisionDlaPersistenceException("Failed to retrieve VisionDla", e);
			}finally{
				closeResultSet(rs);
				closePreparedStatement(pst);
				closeConnection(conn);
			}			
	}

	public int updateCaseStatus(long visionDlaId, String caseStatus,
			int dlaStatusId) throws VisionDlaPersistenceException{
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_VISIONDLA_CASE_STATUS);
			pst.setString(1, caseStatus);
			pst.setLong(2, dlaStatusId);
			pst.setTimestamp(3,  Utility.getCurrentTimestamp());
			pst.setLong(4, visionDlaId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateCaseStatus(): VisionDla case status updated for Vision Dla Id->" +
						visionDlaId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateCaseStatus(): Error occurred while updating case status->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to update case status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}	
	}
	
	public String retrieveAACValidStatus(long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveAACValidStatus(): Retrieving AAC valid status for Vision Dla Id->" + visionDlaId);
		  PreparedStatement pst = null;
		  ResultSet rs = null;
		  Connection conn = null;
		  try{
		  	conn = getVisionDlaConnection();
		  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_AAC_VALID_STATUS);
		  	pst.setLong(1, visionDlaId);
		  	rs = pst.executeQuery();
				if(rs != null && rs.next()){
					return rs.getString("dod_aac_valid");
				}
				return null;
			} catch (SQLException e) {
				logger.error("retrieveAACValidStatus(): Error occurred while retrieving AAC valid status for " +
						"VisionDLA Id->" + visionDlaId, e);
				throw new VisionDlaPersistenceException("Failed to retrieve AAC valid status", e);
			}finally{
				closeResultSet(rs);
				closePreparedStatement(pst);
				closeConnection(conn);
			}			
	}	
}
