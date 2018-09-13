/*
 * @(#)PriceCheckPersistenceImpl.java			May 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.pricing.service;

import gov.gsa.fas.persistence.common.BaseDAO;
import gov.gsa.fas.persistence.pricing.model.EddItemPrice;
import gov.gsa.fas.persistence.pricing.model.NiinItemPrice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

/**
 * <code>PriceCheckPersistenceImpl</code> is the local EJB implementation for
 * PriceCheckPersistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

@Stateless
public class PriceCheckPersistenceImpl extends BaseDAO implements
		PriceCheckPersistence {
	
	private static final Logger logger = 
		Logger.getLogger(PriceCheckPersistenceImpl.class.getName());
	
	/**
	 * Retrieves the list of <code>EddItemPrice</code> objects for the corresponding
	 * EDD prefix and manufacture part number.
	 * 
	 * @param 	prefix
	 * @param 	mfrPartNo
	 * @return	list of <code>EddItemPrice</code> objects
	 * @throws 	PricePersistenceException
	 */	
	@Override
	public List<EddItemPrice> retrieveEddItemPrice(String prefix, String mfrPartNo)
			throws PricePersistenceException {
		if(prefix == null || prefix.isEmpty() || 
				mfrPartNo == null || mfrPartNo.isEmpty()){
			logger.error("retrieveEddItemPrice(): EDD Prefix or Manufacture part no is null");
			throw new PricePersistenceException("EDD Prefix and Manufacture part number required");
		}
		logger.info("retrieveEddItemPrice(): Retrieving EDD Price Item for Prefix->" +prefix +
				", Manufacture Part Number->" + mfrPartNo);
		List<EddItemPrice> eddItemList = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(PriceSqlConstants.EDD_PRICE_CHECK);
			pst.setString(1, prefix);
			pst.setString(2, mfrPartNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			eddItemList = new ArrayList<EddItemPrice>();
			while(rs.next()){
				EddItemPrice eddItemPrice = new EddItemPrice();	
				eddItemPrice.setPrefix(rs.getString("PRI_EDD_ID_PRFX"));
				eddItemPrice.setMfrPartNumber(rs.getString("PRI_MFR_PART_NO"));
				eddItemPrice.setZone(rs.getInt("PRI_ZONE"));
				eddItemPrice.setMinQuantity(rs.getInt("PRI_MN_PRI_BR_QTY"));
				eddItemPrice.setCostPrice(rs.getDouble("PRI_COST_PRICE"));
				eddItemPrice.setSellPrice(rs.getDouble("PRI_SELL_PRICE"));
				eddItemList.add(eddItemPrice);
			}
		} catch (SQLException e) {
			logger.error("retrieveEddItemPrice(): Error occurred while retrieving EDD price item Details", e);
			throw new PricePersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveEddItemPrice(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		int listSize = (eddItemList == null) ? 0: eddItemList.size();
		logger.info("retrieveEddItemPrice(): Retrieved EDD price item list size->" + listSize + 
				" for EDD prefix ->" +prefix + ", Manufacture part number->" + mfrPartNo);
		if(listSize == 0){
			return null;   //Return null so that service can throw fault
		}
		return eddItemList;
	}

	/**
	 * Retrieves the <code>NiinItemPrice</code> object for the corresponding NIIN7 and store.
	 * 
	 * @param 	niin7
	 * @param 	store
	 * @return	<code>NiinItemPrice</code> object
	 * @throws 	PricePersistenceException
	 */
	@Override
	public NiinItemPrice retrieveNiinItemPrice(String niin7, String store)
			throws PricePersistenceException {
		if(niin7 == null || niin7.isEmpty()|| 
				store == null || store.isEmpty()){
			logger.error("retrieveNiinItemPrice(): Niin7 or store is null");
			throw new PricePersistenceException("Niin7 and store required");
		}
		logger.info("retrieveNiinItemPrice(): Retrieving NIIN Item price for Niin7->" +niin7 +
				", Store->" + store);
		NiinItemPrice niinItem = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(PriceSqlConstants.NIIN_PRICE_CHECK);
			pst.setString(1, niin7);
			pst.setString(2, store);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			while(rs.next()){
				niinItem = new NiinItemPrice();
				niinItem.setStore(rs.getString("INV_STORE"));
				niinItem.setNato(rs.getString("INV_NATO"));
				niinItem.setClazz(rs.getInt("INV_CLASS"));
				niinItem.setFsc(rs.getString("INV_FSC"));
				niinItem.setNiin7(rs.getString("INV_NIIN_7"));
				niinItem.setSuffix(rs.getString("INV_SUFFIX"));
				niinItem.setUnitOfIssue(rs.getString("INV_UNIT_ISSUE"));
				niinItem.setDepot(rs.getString("INV_DEPOT"));
				niinItem.setDescription1(rs.getString("INV_DESC1"));
				niinItem.setDescription2(rs.getString("INV_DESC2"));
				niinItem.setShelfLife(rs.getString("INV_SHELF"));
				niinItem.setUnitWeight(rs.getDouble("INV_WGHT"));
				niinItem.setSellPrice(rs.getDouble("INV_SELL_PRICE"));
				niinItem.setQuantityOnHand(rs.getDouble("INV_QTY_ON_HAND"));
				niinItem.setQuantityOnOrder(rs.getInt("INV_QTY_ON_ORDER"));
				niinItem.setStandardPack(rs.getInt("INV_SP"));
				niinItem.setSubNiin(rs.getString("INV_SUB_NIIN"));
				niinItem.setCommCounter(rs.getString("INV_COMM_CTR"));
				niinItem.setCostPrice(rs.getDouble("INV_COST_PRICE"));
			}
		} catch (SQLException e) {
			logger.error("retrieveNiinItemPrice(): Error occurred while retrieving NIIN price item Details", e);
			throw new PricePersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveNiinItemPrice(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		logger.info("retrieveEddItemPrice(): Retrieved NIIN price item for NIIN7 ->" +niin7 + 
				", Store->" + store);			
		return niinItem;		
	}

}
