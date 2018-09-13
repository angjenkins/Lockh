/*
 * @(#)AcisOrderSessionTransformation.java			Jun 1, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1;

import gov.gsa.fas.order.v1.ItemNumber;
import gov.gsa.fas.order.v1.ItemQuantity;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.ordersession.v1.LineItemListing;
import gov.gsa.fas.ordersession.v1.OrderSession.LineItemList;
import gov.gsa.fas.persistence.order.model.OrderSession;
import gov.gsa.fas.services.common.DateUtility;

import java.text.ParseException;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * <code>AcisOrderSessionTransformation</code> transforms order session
 * persistence model to Canonical model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class AcisOrderSessionTransformation {
	
	private static final Logger logger = Logger.getLogger(AcisOrderSessionTransformation.class.getName());

	/**
	 * Transforms list of <code>OrderSession</code> objects to 
	 * <code>GetOrderSessionResponse</code> object.
	 * 
	 * @param 	ordSessionList
	 * @return	<code>GetOrderSessionResponse</code>
	 */
	public static GetOrderSessionResponse transformOrderSession(List<OrderSession> ordSessionList){
		GetOrderSessionResponse ordSessionResp = new GetOrderSessionResponse();
		if(ordSessionList != null){
			gov.gsa.fas.ordersession.v1.OrderSession ordSession = 
				new gov.gsa.fas.ordersession.v1.OrderSession();
			LineItemList lineItemList = new LineItemList();
			ordSession.setLineItemList(lineItemList);
			List<LineItemListing> listLi = ordSession.getLineItemList().getLineItemListing();
			for(OrderSession pOrdSession:ordSessionList){
				LineItemListing li = new LineItemListing();
				//Req or Order Number
				OrderNumber ordNumber = new OrderNumber();
				ordNumber.setValue(pOrdSession.getOrderNumber());
				li.setOrderNumber(ordNumber);
				//NSN or Mfr Part No
				ItemNumber itemNum  = new ItemNumber();
				itemNum.setValue(pOrdSession.getPartNumber());
				li.setItemNumber(itemNum);
				//Price
				li.setPrice(pOrdSession.getPrice().toPlainString());
				//Quantity
				ItemQuantity itemQty = new ItemQuantity();
				itemQty.setValue(pOrdSession.getQuantity());
				if(pOrdSession.getUnitOfIssue() != null){
					itemQty.setUnitCode(pOrdSession.getUnitOfIssue().trim());
				}
				li.setQuantity(itemQty);
				//Vendor Name
				li.setVendorName(pOrdSession.getVendorName());
				//Product Name
				li.setProductName(pOrdSession.getProductName());
				//Status
				li.setStatus(pOrdSession.getOrderStatus());
				//Order Date
				if(pOrdSession.getOrderDate() != null){
					li.setOrderDate(DateUtility.timestampToXMLGregCalendar(pOrdSession.getOrderDate()));
				}
				//Ship Date
				if(pOrdSession.getShipDate() != null && 
						!pOrdSession.getShipDate().isEmpty()){
					try {
						li.setShipDate(DateUtility.dateStringToXMLGregCalendar(
								pOrdSession.getShipDate(), "MMM dd yyyy"));
					} catch (ParseException e) {
						logger.warn("transformOrderSession(): Failed to convert Ship Date String->" + 
								pOrdSession.getShipDate());
					}
				}
				//Est. Ship Date
				if(pOrdSession.getEstimatedShipDate() != null && 
						!pOrdSession.getEstimatedShipDate().isEmpty()){
					try {
						li.setShipDate(DateUtility.dateStringToXMLGregCalendar(
								pOrdSession.getEstimatedShipDate(), "MMM dd yyyy"));
					} catch (ParseException e) {
						logger.warn("transformOrderSession(): Failed to convert Est. Ship Date String->" + 
								pOrdSession.getEstimatedShipDate());
					}
				}
				listLi.add(li);
			}
			ordSessionResp.setOrderSession(ordSession);
		}
		return ordSessionResp;
	}
	
	
}
