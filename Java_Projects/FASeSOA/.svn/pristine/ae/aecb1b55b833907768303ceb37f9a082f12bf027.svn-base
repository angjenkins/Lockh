/*
 * @(#)OrderPersistenceImpl.java			Feb 29, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.apache.log4j.Logger;

import gov.gsa.fas.persistence.common.BaseDAO;
import gov.gsa.fas.persistence.order.model.GecoOrderSale;
import gov.gsa.fas.persistence.order.model.GgsOrderSale;
import gov.gsa.fas.persistence.order.model.OrderCancel;
import gov.gsa.fas.persistence.order.model.OrderHistory;
import gov.gsa.fas.persistence.order.model.OrderSale;
import gov.gsa.fas.persistence.order.model.OrderSession;
import gov.gsa.fas.persistence.order.model.OrderShipAddress;

/**
 * <code>OrderPersistenceImpl</code> is the local EJB implementation for
 * OrderPersistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

@Stateless
public class OrderPersistenceImpl extends BaseDAO implements OrderPersistence {

	private static final Logger logger = 
		Logger.getLogger(OrderPersistenceImpl.class.getName());
	
	/**
	 * Retrieves list of <code>OrderSession</code> objects by searching 
	 * Advantage Database by session number.
	 * 
	 * @param 	sessionNo
	 * @return	list of <code>OrderSession</code> objects
	 * @throws 	OrderPersistenceException
	 */
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<OrderSession> retrieveOrderSession(int sessionNo)  throws OrderPersistenceException{
		logger.info("retrieveOrderSession(): Retrieving Order Session details->" +sessionNo);
		List<OrderSession> orderSessionList = null;
	  CallableStatement cst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getBVDBConnection();
			cst = conn.prepareCall(OrderSqlConstants.RETRIEVE_ORDER_SESSION);
			cst.setLong(2, sessionNo);
			rs = cst.executeQuery();
			if(rs == null){
				return null;
			}
			orderSessionList = new ArrayList<OrderSession>();
			while(rs.next()){
				OrderSession ordSession = new OrderSession();
				ordSession.setOrderNumber(rs.getString("ORDER_ITEM_NUM"));
				ordSession.setSessionNumber(rs.getLong("SESSION_NUM"));
				ordSession.setOrderDate(rs.getTimestamp("D_ORDER_DATE"));
				ordSession.setVendorName(rs.getString("VENDOR_NAME"));
				ordSession.setOrderStatus(rs.getString("LINE_ITEM_STATUS"));
				ordSession.setPartNumber(rs.getString("NSN"));
				ordSession.setProductName(rs.getString("COMMON_NAME"));
				ordSession.setQuantity(rs.getInt("QUANTITY"));
				ordSession.setUnitOfIssue(rs.getString("UNIT_OF_ISSUE"));
				ordSession.setPrice(rs.getBigDecimal("PRICE"));
				ordSession.setEstimatedShipDate(rs.getString("EST_SHIP_DATE"));
				ordSession.setShipDate(rs.getString("SHIP_DATE"));
				ordSession.setDocId(rs.getString("DOC_ID"));
				ordSession.setShipToSerialNumber(rs.getInt("SHIPTO_SERIAL"));
				orderSessionList.add(ordSession);
			}
		} catch (SQLException e) {
			logger.error("retrieveOrderSession(): Error occurred while retrieving Order Session details", e);
			throw new OrderPersistenceException("Advantage BVDB Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(cst != null){
					cst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveOrderSession(): Failed to close Resultset or CallableStatement", e);
			}
		}	  
		int listSize = (orderSessionList == null) ? 0: orderSessionList.size();
		logger.info("retrieveOrderSession(): Retrieved Order Session list size->" + listSize + 
				" for Session No->" +sessionNo);
		return orderSessionList;
	}

	
	/**
	 * Retrieves the list of <code>OrderHistory</code> item object for the corresponding 
	 * Order number from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	list of <code>OrderHistory</code> objects
	 * @throws 	OrderPersistenceException
	 */
	public List<OrderHistory> retrieveOrderHistory(long orderNo) throws OrderPersistenceException{
		logger.info("retrieveOrderHistory(): Retrieving Order History details->" +orderNo);
		List<OrderHistory> orderHistList = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.ORDER_HISTORY);
			pst.setLong(1, orderNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}
			orderHistList = new ArrayList<OrderHistory>();
			while(rs.next()){
				OrderHistory ordHist = new OrderHistory();
				ordHist.setStore(rs.getString("HIST_STORE"));
				ordHist.setOrderNumber(rs.getLong("HIST_ORDER_NR"));
//				ordHist.setTime(rs.getDouble("HIST_TIME"));
				ordHist.setWebOrderNumber(rs.getLong("HIST_WEB_ORDER_NR"));
				ordHist.setCostPrice(rs.getDouble("HIST_COST_PRICE"));
				ordHist.setNiin(rs.getString("HIST_NIIN"));
				ordHist.setQuantity(rs.getInt("HIST_QTY"));
				ordHist.setUi(rs.getString("HIST_UI"));
				ordHist.setDescription(rs.getString("HIST_DESC"));
				ordHist.setSellPrice(rs.getDouble("HIST_SELL_PRICE"));
				ordHist.setBackOrder(rs.getString("HIST_BACKORDER"));
				ordHist.setEddIdPrefix(rs.getString("HIST_EDD_ID_PRFX"));
				ordHist.setManufacturePartNo(rs.getString("HIST_MFR_PART_NO"));
				ordHist.setControlNumber(rs.getLong("HIST_CONTROL_NR"));
				ordHist.setDocNo(rs.getString("HIST_DOC_NO"));
				ordHist.setDocSuff(rs.getString("HIST_REST_DOC_SUFF"));
				ordHist.setManifestNumber(rs.getString("HIST_MANIFEST_NUM"));
				ordHist.setDepot(rs.getString("HIST_DEPOT"));
				ordHist.setWeight(rs.getDouble("HIST_WGHT"));
				ordHist.setReceiptDateOrd(rs.getLong("HIST_RCPT_DATE_ORD"));
				ordHist.setReceiptDateRcd(rs.getLong("HIST_RCPT_DATE_RCD"));
				ordHist.setSaleAAC(rs.getString("HIST_SALE_AAC"));
				ordHist.setSaleAccess(rs.getString("HIST_SALE_ACCESS"));
				ordHist.setSalePickup(rs.getString("HIST_SALE_PICKUP"));
				ordHist.setCarrier(rs.getString("HIST_CARRIER"));
				ordHist.setGbl(rs.getString("HIST_GBL"));
				ordHist.setShipMode(rs.getString("HIST_SHIP_MODE"));
				ordHist.setTcn(rs.getString("HIST_TCN"));
				ordHist.setTrackingNumber(rs.getString("HIST_TRACKING_NR"));
				ordHist.setShipDate(rs.getLong("HIST_SHIP_DATE"));
				ordHist.setAppropNo(rs.getString("HIST_APPROP_NO"));
				ordHist.setProjCode(rs.getString("HIST_PROJ_CODE"));
				ordHist.setPrioCode(rs.getInt("HIST_PRIO_CODE"));
				orderHistList.add(ordHist);
			}
		} catch (SQLException e) {
			logger.error("retrieveOrderHistory(): Error occurred while retrieving Order History details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveOrderHistory(): Failed to close Resultset or PreparedStatement", e);
			}
		}
		int listSize = (orderHistList == null) ? 0: orderHistList.size();
		logger.info("retrieveOrderHistory(): Retrieved Order history list size->" + listSize + 
				" for Order No->" +orderNo);		
		return orderHistList;
	}

	/**
	 * Retrieves the <code>OrderShipAddress</code> object for the corresponding
	 * order number from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>OrderShipAddress</code> object
	 * @throws 	OrderPersistenceException
	 */
	public OrderShipAddress retrieveOrderShippingAddress(long orderNo) throws OrderPersistenceException{
		logger.info("retrieveOrderShippingAddress(): Retrieving Shipping Address->" +orderNo);
		List<OrderShipAddress> orderShipAddrList = null;
		OrderShipAddress orderShipAddr = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.ORDER_SHIP_ADDRESS);
			pst.setLong(1, orderNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			orderShipAddrList = new ArrayList<OrderShipAddress>();
			while(rs.next()){
				OrderShipAddress ordShipAddr = new OrderShipAddress();	
				ordShipAddr.setStore(rs.getString("SHPTO_STORE"));
				ordShipAddr.setOrderNumber(rs.getLong("SHPTO_ORDER_NR"));
				ordShipAddr.setAddress1(rs.getString("SHPTO_TEXT_1"));
				ordShipAddr.setAddress2(rs.getString("SHPTO_TEXT_2"));
				ordShipAddr.setAddress3(rs.getString("SHPTO_TEXT_3"));
				ordShipAddr.setAddress4(rs.getString("SHPTO_TEXT_4"));
				ordShipAddr.setAddress5(rs.getString("SHPTO_TEXT_5"));
				ordShipAddr.setCity(rs.getString("SHPTO_CITY_NAME"));
				ordShipAddr.setState(rs.getString("SHPTO_STATE_ABV"));
				ordShipAddr.setZip(rs.getString("SHPTO_ZIP"));
				ordShipAddr.setZipPlus4(rs.getString("SHPTO_ZIP_PLUS4"));
				ordShipAddr.setCountry(rs.getString("SHPTO_COUNTRY"));
				orderShipAddrList.add(ordShipAddr);
			}
		} catch (SQLException e) {
			logger.error("retrieveOrderShippingAddress(): Error occurred while retrieving Order Shipping details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveOrderShippingAddress(): Failed to close Resultset or PreparedStatement", e);
			}
		}			
		int listSize = (orderShipAddrList == null) ? 0: orderShipAddrList.size();
		logger.info("retrieveOrderShippingAddress(): Retrieved Order Shipping address list size->" + listSize + 
				" for Order No->" +orderNo);		
		if(orderShipAddrList != null && orderShipAddrList.size() > 0){
			orderShipAddr = orderShipAddrList.get(0);
		}else{
			logger.error("retrieveOrderShippingAddress(): Order Shipping Address is null");
		}
		return orderShipAddr;
	}

	/**
	 * Retrieves the <code>OrderSale</code> object for the corresponding order number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>OrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */
	public OrderSale retrieveOrderSale(long orderNo) throws OrderPersistenceException{
		if(orderNo <= 0){
			return null;
		}
		logger.info("retrieveOrderSale(): Retrieving Order Sale for Order No->" +orderNo);
		List<OrderSale> orderSaleList = null;
		OrderSale ordSale = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.ORDER_SALE);
			pst.setLong(1, orderNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			orderSaleList = new ArrayList<OrderSale>();
			while(rs.next()){
				OrderSale orderSale = new OrderSale();	
				orderSale.setStore(rs.getString("SALE_STORE"));
				orderSale.setOrderNumber(rs.getLong("SALE_ORDER_NR"));
				orderSale.setSaleDate(rs.getLong("SALE_DATE"));
				orderSale.setSaleGregDate(rs.getLong("SALE_GREG_DATE"));
				orderSale.setAAC(rs.getString("SALE_AAC"));
				orderSale.setAccess(rs.getString("SALE_ACCESS"));
				orderSale.setLiidId(rs.getString("SALE_LIID"));
				orderSaleList.add(orderSale);
			}
		} catch (SQLException e) {
			logger.error("retrieveOrderSale(): Error occurred while retrieving Order Sale details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveOrderSale(): Failed to close Resultset or PreparedStatement", e);
			}
		}					
		int listSize = (orderSaleList == null) ? 0: orderSaleList.size();
		logger.info("retrieveOrderSale(): Retrieved Order Sale list size->" + listSize + 
				" for Order No->" +orderNo);				
		if(orderSaleList != null && orderSaleList.size() > 0){
			ordSale = orderSaleList.get(0);
		}else{
			logger.error("retrieveOrderSale(): Retrieved Order Sale list is null or empty");
		}
		return ordSale;
	}

	/**
	 * Retrieves the <code>GgsOrderSale</code> object for the corresponding session number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>GgsOrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */
	public GgsOrderSale retrieveOrderSessionSale(Long sessionNo) throws OrderPersistenceException{
		if(sessionNo == null || sessionNo ==0){
			return null;
		}
		logger.info("retrieveOrderSessionSale(): Retrieving Order Sale for session No->" +sessionNo);
		List<GgsOrderSale> orderSaleList = null;
		GgsOrderSale ordSale = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.GGS_ORDER_SALE);
			pst.setLong(1, sessionNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			orderSaleList = new ArrayList<GgsOrderSale>();
			while(rs.next()){
				GgsOrderSale ggsOrderSale = new GgsOrderSale();	
				ggsOrderSale.setOrderNumber(rs.getLong("SALE_ORDER_NR"));
				ggsOrderSale.setSaleWebOrdDate(rs.getLong("SALE_WEB_ORD_DATE"));
				ggsOrderSale.setWebOrderNumber(rs.getLong("SALE_WEB_ORDER_NR"));
				ggsOrderSale.setAAC(rs.getString("SALE_AAC"));
				ggsOrderSale.setAccess(rs.getString("SALE_ACCESS"));
				ggsOrderSale.setLiidId(rs.getString("SALE_LIID"));
				orderSaleList.add(ggsOrderSale);
			}
		} catch (SQLException e) {
			logger.error("retrieveOrderSessionSale(): Error occurred while retrieving GGS Order Sale details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveOrderSessionSale(): Failed to close Resultset or PreparedStatement", e);
			}
		}							
		int listSize = (orderSaleList == null) ? 0: orderSaleList.size();
		logger.info("retrieveOrderSessionSale(): Retrieved Order Sale list size->" + listSize + 
				" for Session No->" +sessionNo);				
		if(orderSaleList != null && orderSaleList.size() > 0){
			ordSale = orderSaleList.get(0);
		}else{
			logger.error("retrieveOrderSessionSale(): Retrieved Order Sale list is null or empty");
		}
		return ordSale;
	}

	/**
	 * Retrieves the <code>GecoOrderSale</code> object for the corresponding geco order number
	 * from CSC database.
	 * 
	 * @param 	orderNo
	 * @return	<code>GecoOrderSale</code> object
	 * @throws 	OrderPersistenceException
	 */	
	public GecoOrderSale retrieveGecoOrderSale(Long gecoOrderNo) throws OrderPersistenceException{
		if(gecoOrderNo == null || gecoOrderNo ==0){
			return null;
		}
		logger.info("retrieveGecoOrderSale(): Retrieving Order Sale for Geco No->" +gecoOrderNo);
		List<GecoOrderSale> gecoOrderSaleList = null;
		GecoOrderSale gecoOrdSale = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.GECO_ORDER_SALE);
			pst.setLong(1, gecoOrderNo);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			gecoOrderSaleList = new ArrayList<GecoOrderSale>();
			while(rs.next()){
				GecoOrderSale gecoOrderSale = new GecoOrderSale();	
				gecoOrderSale.setStore(rs.getString("SALE_STORE"));
				gecoOrderSale.setOrderNumber(rs.getLong("SALE_ORDER_NR"));
				gecoOrderSale.setSaleGregDate(rs.getLong("SALE_GREG_DATE"));
				gecoOrderSale.setGecoOrderDate(rs.getLong("SALE_POS_ORD_DATE"));
				gecoOrderSale.setGecoOrderNumber(rs.getLong("SALE_POS_ORDER_NR"));
				gecoOrderSale.setAAC(rs.getString("SALE_AAC"));
				gecoOrderSale.setAccess(rs.getString("SALE_ACCESS"));
				gecoOrderSale.setLiidId(rs.getString("SALE_LIID"));
				gecoOrderSaleList.add(gecoOrderSale);
			}
		} catch (SQLException e) {
			logger.error("retrieveGecoOrderSale(): Error occurred while retrieving GECO Order Sale details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrieveGecoOrderSale(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		int listSize = (gecoOrderSaleList == null) ? 0: gecoOrderSaleList.size();
		logger.info("retrieveGecoOrderSale(): Retrieved Geco Order Sale list size->" + listSize + 
				" for Geco No->" +gecoOrderNo);			
		if(gecoOrderSaleList != null && gecoOrderSaleList.size() >0){
			gecoOrdSale = gecoOrderSaleList.get(0);
		}else{
			logger.error("retrieveGecoOrderSale(): Retrieved Geco Order Sale list is null or empty");
		}
		return gecoOrdSale;
	}

	/**
	 * Retrieves PO related information like po no by web order number, manufacture part number
	 * and prefix.
	 * 
	 * @param 	ggsSessionNumber
	 * @param 	manufacturePartNumber
	 * @param 	prefix
	 * @return	poNumber string
	 */
	public String retrievePOData(long webOrderNo,String mfrPartNo, String prefix)	
														throws OrderPersistenceException{
		logger.info("retrievePOData(): Retrieving PO Data for web order No->" +webOrderNo + 
				", Mfr Part No->" + mfrPartNo + " and prefix->" + prefix);
		String poNumber = null;
	  PreparedStatement pst = null;  
	  ResultSet rs = null;
	  Connection conn = null;
	  try {
			conn = getCSCConnection();
			pst = conn.prepareStatement(OrderSqlConstants.PO_BY_WEB_ORDER_NO);
			pst.setLong(1, webOrderNo);
			pst.setString(2, mfrPartNo);
			pst.setString(3, prefix);
			rs = pst.executeQuery();
			if(rs == null){
				return null;
			}	
			if(rs.next()){
				poNumber = rs.getString("STIF_PO_NO");
			}
		} catch (SQLException e) {
			logger.error("retrievePOData(): Error occurred while retrieving PO details", e);
			throw new OrderPersistenceException("CSC Database Error-" + e.getMessage(), e);
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
				logger.error("retrievePOData(): Failed to close Resultset or PreparedStatement", e);
			}
		}									
		logger.info("retrievePOData(): Retrieved PO Number->" + poNumber);			
		return poNumber;		
	}

	/**
	 * Persists order cancel request in legacy VISS database.
	 * 
	 * @param 	ordCancel
	 * @return	true, if successful
	 * @throws 	OrderPersistenceException
	 */	
	public boolean cancelOrder(OrderCancel ordCancel) throws OrderPersistenceException {
		if(ordCancel == null){
			logger.error("cancelOrder(): Order Cancel request is null");
			throw new OrderPersistenceException("Cancel Order request object is null");			
		}
		logger.info("cancelOrder(): Persisting Cancel Order for Requisition Number->" +
				ordCancel.getRequisitionNumber());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVISSConnection();
			pst = conn.prepareStatement(OrderSqlConstants.CANCEL_ORDER);
			//Following 2 lines temporary
			long ac1Key = getNextSequenceValue(conn);
			pst.setLong(1, ac1Key);
			pst.setString(2, ordCancel.getDocumentIdentifierCode());
			pst.setString(3, ordCancel.getRoutingIdentifierCode());
			pst.setString(4, ordCancel.getNsn());
			pst.setString(5, ordCancel.getUnit());
			pst.setInt(6, ordCancel.getQuantity());
			pst.setString(7, ordCancel.getRequisitionNumber());
			pst.setString(8, ordCancel.getRequisitionSuffix());
			pst.setString(9, ordCancel.getSupplementAddrAAC());
			pst.setString(10, ordCancel.getDistributionCode());
			pst.setString(11, ordCancel.getProjectCode());
			pst.setInt(12, ordCancel.getPriorityCode());
			pst.setString(13, ordCancel.getCreatedDate());
			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				return true;
			}
		} catch (SQLException e) {
			logger.error("cancelOrder(): Error occurred while inserting AC1 order cancel", e);
			throw new OrderPersistenceException("VISS Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(pst != null){
					pst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("cancelOrder(): Failed to close Connection or PreparedStatement", e);
			}
		}											
		return true;
	}

	/**
	 * Getting the next sequence value for ac1 table.
	 * 
	 * @param 	conn
	 * @return	value of Order Cancel key
	 * @throws 	OrderPersistenceException
	 */
	private Long getNextSequenceValue(Connection conn) 
																		throws OrderPersistenceException{
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
			String maxSql = "select MAX(ac1_key) MAX_VAL from ac1";
			logger.info("getNextSequenceValue(): Max Sequence ->" + maxSql);
			pst = conn.prepareStatement(maxSql);
			rs = pst.executeQuery();
			if(rs == null){
				throw new OrderPersistenceException("Failed to get next sequence value for AC1 Key");
			}	
			if(rs.next()){
				return rs.getLong("MAX_VAL") + 1;
			}
		}catch (SQLException e) {
			logger.error("getNextSequenceValue(): Error occurred while getting next sequence value for AC1 "+ 
					" and Column ac1_key", e);
			throw new OrderPersistenceException("VISS Database Error-" + e.getMessage(), e);
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
}
