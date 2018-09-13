/*
 * @(#)WsdrRequestDao.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>WsdrRequestDao</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrRequestDao extends BaseDao{

	private static Logger logger = Logger.getLogger(WsdrRequestDao.class);
	
	int creteWsdrRequest(String reqFileName, String stagingDir) 
			throws VisionDlaPersistenceException{
		logger.info("createWsdrRequest(): Inserting Request XML file->" + reqFileName);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  Clob reqClob = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_WSDR_REQ);
			reqClob = conn.createClob();
			Writer reqClobWriter = reqClob.setCharacterStream(1);
			readRequestXml(stagingDir, reqFileName, reqClobWriter);
			logger.info("createWsdrRequest(): Clob length->" + reqClob.length());
			pst.setClob(1, reqClob);
			pst.setString(2, reqFileName);
			pst.setTimestamp(3, Utility.getCurrentTimestamp());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createWsdrRequest(): Wsdr request xml file inserted->" +
										reqFileName);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("createWsdrRequest(): Error occurred while inserting request XML->" 
						+ reqFileName, e);
			throw new VisionDlaPersistenceException("Failed to insert request xml" + e.getMessage(), e);
		}finally{
			if(reqClob != null){
				try{reqClob.free();} catch(SQLException se){
					logger.error("Failed to free clob resources", se);
				};
			}
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}
	
	int updateWsdrRequestStatus(long wsdrReqId, String status) 
			throws VisionDlaPersistenceException{
		logger.info("updateWsdrRequestStatus(): Updating Wsdr Request Status for->" + wsdrReqId + 
				", Status->" + status);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_WSDR_REQ_STATUS);
			pst.setString(1, status);
			pst.setTimestamp(2, Utility.getCurrentTimestamp());
			pst.setLong(3, wsdrReqId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateWsdrRequestStatus(): Wsdr request status updated for Req Id->" +
						wsdrReqId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateWsdrRequestStatus(): Error occurred while updating request status->" 
						+ wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to update request status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}	
	
	WsdrRequestData retrieveRequestXml(long wsdrReqId) throws VisionDlaPersistenceException{
		logger.info("retrieveRequestXml(): Retrieving request XML for req Id->" + wsdrReqId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  Clob reqXmlClob = null;
	  WsdrRequestData wsdrReqData = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_WSDR_REQ_XML);
	  	pst.setLong(1, wsdrReqId);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				wsdrReqData = new WsdrRequestData();
				reqXmlClob = rs.getClob(1);
				wsdrReqData.setRequestFileName(rs.getString("xml_filename"));
			}
			if(reqXmlClob != null){
				wsdrReqData.setRequestXml(reqXmlClob.getSubString(1, (int)reqXmlClob.length()));
			}
			return wsdrReqData;
		} catch (SQLException e) {
			logger.error("retrieveRequestXml(): Error occurred while retrieving Request XML->" + wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to get Request XML", e);
		}finally{
			if(reqXmlClob != null){
				try{reqXmlClob.free();} catch(SQLException se){
					logger.error("Failed to free clob resources", se);
				};
			}
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}				
	}
	
	long retrieveWsdrRequestId(String reqXmlFileName) throws VisionDlaPersistenceException{
		logger.info("retrieveWsdrRequestId(): Retrieving request XML for req Id->" + reqXmlFileName);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  long wsdrReqId = -1;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_WSDR_REQ_ID);
	  	pst.setString(1, reqXmlFileName);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				wsdrReqId = rs.getLong(1);
			}
			return wsdrReqId;
		} catch (SQLException e) {
			logger.error("retrieveWsdrRequestId(): Error occurred while retrieving Wsdr Request Id for file->" + reqXmlFileName, e);
			throw new VisionDlaPersistenceException("Failed to get Wsdr Request Id", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}						
	}
	
	List<Long> retreieveWsdrReqIdsByStatus(String status) 
			throws VisionDlaPersistenceException{
		logger.info("retreieveWsdrReqIdsByStatus(): Retrieving Request Ids by Status->" + status);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  List<Long> wsdrReqIds = new ArrayList<Long>();
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_WSDR_REQ_IDS_BY_STATUS);
	  	pst.setString(1, status);
	  	rs = pst.executeQuery();
			while(rs != null && rs.next()){
				wsdrReqIds.add(rs.getLong("wsdr_request_id"));
			}
			return wsdrReqIds;
		} catch (SQLException e) {
			logger.error("retreieveWsdrReqIdsByStatus(): Error occurred while retrieving Wsdr Request Ids by status->" + status, e);
			throw new VisionDlaPersistenceException("Failed to get Wsdr Request Ids", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}		
	}
	
	private void readRequestXml(String stagingDir, String fileName, 
			Writer clobWriter) throws VisionDlaPersistenceException{
		String reqXmlPath = stagingDir + File.separator + fileName;
		try {
			FileReader xmlfileReader = new FileReader(reqXmlPath);
			BufferedReader br = new BufferedReader(xmlfileReader);
			String nextLine = "";
			while ((nextLine = br.readLine()) != null) {
				clobWriter.write(nextLine);
			}
			clobWriter.flush();
			if(br != null){
				br.close();
			}
		} catch (FileNotFoundException e) {
			logger.error("readRequestXml(): Request XML file not found->" + reqXmlPath);
			throw new VisionDlaPersistenceException("Request XML file not found");
		} catch (IOException e) {
			logger.error("readRequestXml(): Failed to read Request XML file->" + reqXmlPath);
			throw new VisionDlaPersistenceException("Failed to read Request XML file");
		}
	}


	public int createRequestAttachment(long wsdrReqId,String attName) throws VisionDlaPersistenceException{
		logger.info("createRequestAttachment(): Creating Request Attachment entry for attName->" + attName);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_WSDR_ATT_REQUEST);
			pst.setString(1, attName);
			pst.setLong(2, wsdrReqId);
			pst.setString(3, "C");
			pst.setTimestamp(4, Utility.getCurrentTimestamp());

			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createRequestAttachment(): Request Attachment entry created for->" + attName);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("createRequestAttachment(): Error occurred while inserting Request Attachment record", e);
			throw new VisionDlaPersistenceException("Failed to insert request attachment entry" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}		
		
	}

	public List<String> retrieveWaitingAttachments(long wsdrReqId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveWaitingAttachments(): Retrieving Attachments " +
				"waiting for receive->" + wsdrReqId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  List<String> attNames = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_ATT_WAITING);
	  	pst.setLong(1, wsdrReqId);
	  	rs = pst.executeQuery();
			while(rs != null && rs.next()){
				if(attNames == null){attNames = new ArrayList<String>();}
				attNames.add(rs.getString("attachment_filename"));
			}
			return attNames;
		} catch (SQLException e) {
			logger.error("retrieveWaitingAttachments(): Error occurred while retrieving " +
					"Attachments waiting for receive->" + wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to get Attachments names, yet to receive", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}			
	}
	

	public List<String> retrieveReceivedAttachments(long wsdrReqId) 
				throws VisionDlaPersistenceException{
		logger.info("retrieveReceivedAttachments(): Retrieving received Attachments " +
				"for->" + wsdrReqId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  List<String> attNames = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_ATT_RECEIVED);
	  	pst.setLong(1, wsdrReqId);
	  	rs = pst.executeQuery();
			while(rs != null && rs.next()){
				if(attNames == null){attNames = new ArrayList<String>();}
				attNames.add(rs.getString("attachment_filename"));
			}
			return attNames;
		} catch (SQLException e) {
			logger.error("retrieveReceivedAttachments(): Error occurred while retrieving " +
					"Attachments received for->" + wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to get Attachments names received", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}
	}	

	public int updateReqAttachmentStatus(long wsdrReqId, String fileName, String status) 
			throws VisionDlaPersistenceException{
		logger.info("updateReqAttachmentStatus(): Updating Request Attachment Status for->" + wsdrReqId + 
					", File Name->" + fileName + ", Status->" + status);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_WSDR_REQ_ATT_STATUS);
			pst.setString(1, status);
			pst.setTimestamp(2, Utility.getCurrentTimestamp());
			pst.setLong(3, wsdrReqId);
			pst.setString(4,  fileName);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateReqAttachmentStatus(): Request attachment status updated for request Id->" +
						wsdrReqId + ", file Name->" + fileName);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateRespAttStatusByRespId(): Error occurred while updating req attachment status->" 
						+ wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to update request attachment status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}	
	
	public java.util.Date retrieveCreatedDate(long wsdrReqId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveCreatedDate(): Retrieving WSDR created date for->" + wsdrReqId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_WSDR_CREATED_DATE);
	  	pst.setLong(1, wsdrReqId);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				Timestamp ts = rs.getTimestamp("created_date");
				return ts;
			}
			return null;
		} catch (SQLException e) {
			logger.error("retrieveCreatedDate(): Error occurred while retrieving " +
					"created date for->" + wsdrReqId, e);
			throw new VisionDlaPersistenceException("Failed to get WSDR created date", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}			
	}

}
