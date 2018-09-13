/*
 * @(#)WsdrResponseDao.java			Aug 30, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;

/**
 * <code>WsdrResponseDao</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrResponseDao extends BaseDao{

	private static Logger logger = Logger.getLogger(WsdrResponseDao.class);
	
	int creteWsdrResponse(String respXml, long visionDlaId, String respFilename) 
			throws VisionDlaPersistenceException{
		logger.info("creteWsdrResponse(): Inserting Resposne XML for visiondlaId->" + visionDlaId);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  Clob respClob = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_WSDR_RESP);
			respClob = conn.createClob();
			Writer reqClobWriter = respClob.setCharacterStream(1);
			readResponseXml(respXml, reqClobWriter);
			logger.info("creteWsdrResponse(): Clob length->" + respClob.length());
			pst.setClob(1, respClob);
			pst.setString(2, respFilename);
			pst.setLong(3, visionDlaId);
			pst.setTimestamp(4, Utility.getCurrentTimestamp());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("creteWsdrResponse(): Wsdr response xml file inserted for visionDlaId->" +
						visionDlaId);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("creteWsdrResponse(): Error occurred while inserting response XML for VisionDlaId->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to create response xml in Database" + e.getMessage(), e);
		}finally{
			if(respClob != null){
				try{respClob.free();} catch(SQLException se){
					logger.error("Failed to free clob resources", se);
				};
			}
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}
	
	long retrieveResponseIdByDlaId(long visionDlaId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveResponseIdByDlaId(): Retrieving WSDR Response Id for Vision Dla Id->" + visionDlaId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_RESP_ID_BY_DLA_ID);
	  	pst.setLong(1, visionDlaId);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				return rs.getLong("wsdr_response_id");
			}
			return -1;
		} catch (SQLException e) {
			logger.error("retrieveResponseIdByDlaId(): Error occurred while retrieving response Id for " +
					"VisionDLA Id->" + visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to retrieve Wsdr Response Id", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}			
	}
	
	ResponseData retrieveResponseXml(long visionDlaId) throws VisionDlaPersistenceException{
		logger.info("retrieveResponseXml(): Retrieving response XML for vision Dla Id->" + visionDlaId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  Clob respXmlClob = null;
	  String respFileName = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_WSDR_RESP_XML_BY_DLA_ID);
	  	pst.setLong(1, visionDlaId);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				respXmlClob = rs.getClob("response_xml");
				respFileName = rs.getString("xml_filename");
			}
			if(respXmlClob != null){
				ResponseData respData = new ResponseData();
				respData.setResponseXml(respXmlClob.getSubString(1, (int)respXmlClob.length()));
				respData.setResponseFileName(respFileName);
				return respData;
			}
			return null;
		} catch (SQLException e) {
			logger.error("retrieveResponseXml(): Error occurred while retrieving Response XML->" + visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to get Response XML", e);
		}finally{
			if(respXmlClob != null){
				try{respXmlClob.free();} catch(SQLException se){
					logger.error("Failed to free clob resources", se);
				};
			}
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}				
	}	
	
	int createResponseAttachment(long wsdrRespId, String attName)	
			throws VisionDlaPersistenceException {
		logger.info("createResponseAttachment(): Creating Response Attachment entry for attName->" + attName);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_WSDR_ATT_RESP);
			pst.setString(1, attName);
			pst.setLong(2, wsdrRespId);
			pst.setString(3, "C");
			pst.setTimestamp(4, Utility.getCurrentTimestamp());

			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createResponseAttachment(): Response Attachment entry created for->" + attName);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("createResponseAttachment(): Error occurred while inserting Response Attachment record", e);
			throw new VisionDlaPersistenceException("Failed to insert response attachment entry" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}
	}
	  
	int updateRespAttStatusByRespId(long wsdrRespId, String fileName, String status) 
			throws VisionDlaPersistenceException{
		logger.info("updateRespAttStatusByRespId(): Updating Response Attachment Status for->" + wsdrRespId + 
				", File Name->" + fileName + ", Status->" + status);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_WSDR_ATT_RESP_STATUS);
			pst.setString(1, status);
			pst.setTimestamp(2, Utility.getCurrentTimestamp());
			pst.setLong(3, wsdrRespId);
			pst.setString(4,  fileName);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateRespAttStatusByRespId(): Response attachment status updated for response Id->" +
						wsdrRespId + ", file Name->" + fileName);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateRespAttStatusByRespId(): Error occurred while updating resp attachment status->" 
						+ wsdrRespId, e);
			throw new VisionDlaPersistenceException("Failed to update response attachment status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}											
	}	  
	
	private void readResponseXml(String responseXml,Writer clobWriter) 
			throws VisionDlaPersistenceException{
		try {
			StringReader xmlfileReader = new StringReader(responseXml);
			BufferedReader br = new BufferedReader(xmlfileReader);
			String nextLine = "";
			while ((nextLine = br.readLine()) != null) {
				clobWriter.write(nextLine);
			}
			clobWriter.flush();
			if(br != null){
				br.close();
			}
		} catch (IOException e) {
			logger.error("readResponseXml(): Failed to read Response XML file->" + responseXml);
			throw new VisionDlaPersistenceException("Failed to read Resposne XML file");
		}
	}

	public List<String> retrieveAttachmentsNotSent(long wsdrRespId) 
			throws VisionDlaPersistenceException{
		logger.info("retrieveAttachmentsNotSent(): Retrieving attachments not sent for Response Id->" + wsdrRespId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_RESP_ATT_NOT_SENT);
	  	pst.setLong(1, wsdrRespId);
	  	rs = pst.executeQuery();
	  	List<String> attNames = null;
			while(rs != null && rs.next()){
				if(attNames == null){attNames = new ArrayList<String>();}
				attNames.add("attachment_filename");
			}
			return attNames;
		} catch (SQLException e) {
			logger.error("retrieveAttachmentsNotSent(): Error occurred while retrieving attachment " +
					"names for response Id->" +wsdrRespId,e);
			throw new VisionDlaPersistenceException("Failed to retrieve attachment names for Response Id", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}
	}

	public int updateResponseStatusByDlaId(long visionDlaId, String status) 
			throws VisionDlaPersistenceException{
		logger.info("updateResponseStatusByDlaId(): Updating Response Status for->" + visionDlaId 
				+ ", Status->" + status);
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.UPDATE_WSDR_RESP_STATUS);
			pst.setString(1, status);
			pst.setTimestamp(2, Utility.getCurrentTimestamp());
			pst.setLong(3, visionDlaId);
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("updateResponseStatusByDlaId(): Response status updated for vision Dla Id->" +
						visionDlaId + ", status->" + status);
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("updateResponseStatusByDlaId(): Error occurred while updating resp status->" 
						+ visionDlaId, e);
			throw new VisionDlaPersistenceException("Failed to update response status" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}
		
	}
	
	
}
