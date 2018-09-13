/*
 * @(#)VendorPersistenceImpl.java			Aug 21, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gov.gsa.fas.persistence.common.BaseDAO;
import gov.gsa.fas.persistence.vendor.model.VendorContract;
import gov.gsa.fas.persistence.vendor.model.VendorInfo;
import gov.gsa.fas.persistence.vendor.model.VendorInvoice;

/**
 * <code>VendorPersistenceImpl</code> is the local EJB implementation for
 * VendorPersistence service. 
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see   	gov.gsa.fas.persistence.vendor.service.VendorPersistence  
 */

@Stateless
public class VendorPersistenceImpl extends BaseDAO 
												implements VendorPersistence {

	private static final Logger logger = 
		Logger.getLogger(VendorPersistenceImpl.class.getName());
	
	/**
	 * Retrieves Vendor company information by DUNS Number.
	 * 
	 * @param 	dunsNo
	 * @return	<code>VendorInfo</code> vendor company information
	 * @throws 	VendorPersistenceException
	 */
	public VendorInfo retrieveVendorInfo(String dunsNo)
			throws VendorPersistenceException {
		logger.info("retrieveVendorInfo(): Retrieving Vendor Information by DUNS No->" +dunsNo);
		if(dunsNo == null || dunsNo.isEmpty()){
			logger.info("retrieveVendorInfo(): DUNS Number is null or empty");
			return null;
		}
		List<VendorInfo> vdrInfoList = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(VendorSqlConstants.VDR_ADDRESS_BY_DUNS);
			pst.setString(1, dunsNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			vdrInfoList = new ArrayList<VendorInfo>();
			while(rs.next()){
				VendorInfo vdrInfo = new VendorInfo();	
				vdrInfo.setAddress1(rs.getString("D410_ADRS1"));
				vdrInfo.setAddress2(rs.getString("D410_ADRS2"));
				vdrInfo.setAddress3(rs.getString("D410_ADRS3"));
				vdrInfo.setCity(rs.getString("D410_CITY_NAME"));
				vdrInfo.setZip(rs.getString("D410_ZIP"));
				vdrInfo.setState(rs.getString("D410_ST"));
				vdrInfo.setCountryCode(rs.getString("D410_CNTRY_CD"));
				vdrInfo.setEmail(rs.getString("D410_EMAIL_ADRS"));
				vdrInfo.setWebAddress(rs.getString("D410_INET_ADRS"));
				vdrInfo.setName(rs.getString("D410_NAME_AS"));
				vdrInfo.setPhone(rs.getString("D410_PHONE_NO"));
				vdrInfo.setStatus(rs.getString("D410_STATUS"));
				vdrInfo.setDuns(rs.getString("D410_CEC"));				
				vdrInfoList.add(vdrInfo);
			}
		} catch (SQLException e) {
			logger.error("retrieveVendorInfo(): Error occurred while retrieving Vendor Address Details", e);
			throw new VendorPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveVendorInfo(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		int listSize = (vdrInfoList == null) ? 0: vdrInfoList.size();
		logger.info("retrieveVendorInfo(): Retrieved Vendor Address list size->" + listSize + 
				" for DUnS ->" +dunsNo);
		if(listSize == 0){
			return null;   //Return null so that service can throw fault
		}
		return vdrInfoList.get(0);		
	}

	/**
	 * Retrieves Vendor invoice related information by PO
	 * number.
	 * 
	 * @param 	poNumber
	 * @return	<code>VendorInvoice</code> vendor invoice information
	 * @throws 	VendorPersistenceException
	 */
	public VendorInvoice retrieveVendorInvoice(String poNumber)
			throws VendorPersistenceException {
		logger.info("retrieveVendorInvoice(): Retrieving Vendor Information by PO No->" +poNumber);
		if(poNumber == null || poNumber.isEmpty()){
			logger.info("retrieveVendorInvoice(): PO Number is null or empty");
			return null;
		}
		List<VendorInvoice> vdrInvList = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(VendorSqlConstants.VDR_INVOICE_BY_PO);
			pst.setString(1, poNumber);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			vdrInvList = new ArrayList<VendorInvoice>();
			while(rs.next()){
				VendorInvoice vdrInv = new VendorInvoice();	
				vdrInv.setInvoiceNumber(rs.getString("D459_INVOICE_NO"));
				vdrInv.setQuantity(rs.getInt("D459_PAID_QTY"));
				vdrInv.setAmount(rs.getDouble("D459_PAID_AMT"));
				vdrInv.setPoNumber(rs.getString("D459_PO_NO"));
				vdrInvList.add(vdrInv);
			}
		} catch (SQLException e) {
			logger.error("retrieveVendorInvoice(): Error occurred while retrieving Vendor Invoice Details", e);
			throw new VendorPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveVendorInvoice(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		int listSize = (vdrInvList == null) ? 0: vdrInvList.size();
		logger.info("retrieveVendorInvoice(): Retrieved Vendor Invoice list size->" + listSize + 
				" for PO Number ->" +poNumber);
		if(listSize == 0){
			return null;   //Return null so that service can throw fault
		}
		return vdrInvList.get(0);		
	}

	/**
	 * Retrieves Vendor Contract and Fax information by PO number.
	 * 
	 * @param 	poNumber
	 * @return	<code>VendorContract</code> vendor contract information
	 * @throws 	VendorPersistenceException
	 */
	public VendorContract retrieveVendorContract(String poNumber)
			throws VendorPersistenceException {
		if(poNumber == null || poNumber.isEmpty()){
			logger.error("retrieveVendorContract(): PO Number is null or empty");
			return null;
		}
		logger.info("retrieveOrderInvoiceData(): Retrieving Contract data for PO No->" +poNumber);
		List<VendorContract> vdrContractList = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(VendorSqlConstants.VDR_CONTRACT_FAX_BY_PO);
			pst.setString(1, poNumber);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			vdrContractList = new ArrayList<VendorContract>();
			while(rs.next()){
				VendorContract vdrContractData = new VendorContract();	
				vdrContractData.setContractNumber(rs.getString("D451_CONT_NO"));
				vdrContractData.setFullContractNumber(rs.getString("D451_F_O_CONT_NO"));
				vdrContractData.setFax1(rs.getString("D402_FAX1"));
				vdrContractData.setFax2(rs.getString("D402_FAX2"));
				vdrContractList.add(vdrContractData);
			}
		} catch (SQLException e) {
			logger.error("retrieveVendorContract(): Error occurred while retrieving Order Invoice Details", e);
			throw new VendorPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveVendorContract(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		int listSize = (vdrContractList == null) ? 0: vdrContractList.size();
		if(listSize == 0){
			return null;   //Return null so that service can throw fault
		}
		logger.info("retrieveVendorContract(): Retrieved order invoice data list size->" + listSize + 
				" for PO No->" +poNumber);			
		return vdrContractList.get(0);
	}
}
