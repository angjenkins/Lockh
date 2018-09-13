/*
 * @(#)CscOrderTransformation.java			Mar 1, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1;

import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import gov.gsa.fas.global.v1.Address;
import gov.gsa.fas.order.v1.ActivityAddressCode;
import gov.gsa.fas.order.v1.CscItemDetails;
import gov.gsa.fas.order.v1.EddRequisitionNumber;
import gov.gsa.fas.order.v1.ItemNumber;
import gov.gsa.fas.order.v1.ItemNumberStandard;
import gov.gsa.fas.order.v1.ItemQuantity;
import gov.gsa.fas.order.v1.Liid;
import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderItem;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.order.v1.OrderOrigin;
import gov.gsa.fas.order.v1.ShipmentData;
import gov.gsa.fas.order.v1.Store;
import gov.gsa.fas.order.v1.Transportation;
import gov.gsa.fas.persistence.order.model.OrderCancel;
import gov.gsa.fas.persistence.order.model.OrderHistory;
import gov.gsa.fas.persistence.order.model.OrderShipAddress;
import gov.gsa.fas.services.common.DateUtility;
import gov.gsa.fas.services.messages.v1.CancelOrderRequest;

/**
 * <code>CscOrderTransformation</code> transforms order persistence model 
 * to Canonical model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class CscOrderTransformation {
	
	private static final Logger logger = Logger.getLogger(CscOrderTransformation.class.getName());

	/**
	 * Transforms persistence model <code>OrderHistory</code> list objects to 
	 * <code>GetOrderDetailsResponse</code> object.
	 * 
	 * @param 	ordHistList	list of <code>OrderHistory</code> objects
	 * @return	<code>GetOrderDetailsResponse</code> object
	 */
	public static GetOrderDetailsResponse transformOrderHistory(List<OrderHistory> ordHistList) {
		GetOrderDetailsResponse orderHistResp = new GetOrderDetailsResponse();
		if(ordHistList == null || ordHistList.size() == 0){
			return orderHistResp;
		}
		Order ord = new Order();
		OrderHistory ordHist1 = ordHistList.get(0);
		//Order Number
		ord.setOrderNumber(transformOrderNumber(ordHist1.getOrderNumber(), null, null));
		//Web Order Number
		if(ordHist1.getWebOrderNumber() != null && ordHist1.getWebOrderNumber() > 0){
			ord.setGgsSessionNumber(ordHist1.getWebOrderNumber().toString());
		}
		//Store
		ord.setStore(transformStore(ordHist1.getStore(), null, null));
		//Sale AAC and Access
		ord.setAac(transformAac(ordHist1.getSaleAAC(), ordHist1.getSaleAccess()));
		//Order origin
		if(ordHist1.getNiin() != null && ordHist1.getNiin().trim().length() > 0){
			ord.setType(OrderOrigin.CSC);
		}else if(ordHist1.getManufacturePartNo() != null && ordHist1.getManufacturePartNo().trim().length() >0){
			ord.setType(OrderOrigin.EDD);
		}
		//Line Items
		Order.LineItemList liList = new Order.LineItemList();
		ord.setLineItemList(liList);
		for(OrderHistory ordHist:ordHistList){
			gov.gsa.fas.order.v1.LineItem li = transformOrderLineItem(ordHist);
			liList.getLineItem().add(li);
		}
		//Order Address
		ord.setOrderAddress(new Address());
		orderHistResp.setOrder(ord);
		return orderHistResp;
	}	
	
	/**
	 * Transforms to canonical model <code>LineItem</code> object from
	 * <code>OrderHistory</code> object.
	 * 
	 * @param 	ordHist
	 * @return	returns <code>LineItem</code> object
	 */
	private static LineItem transformOrderLineItem(OrderHistory ordHist) {
		if(ordHist == null){
			return null;
		}
		LineItem liObj = new LineItem();
		ItemNumber itemNbrObj = transformItemNumber(ordHist);
		liObj.setItemNumber(itemNbrObj);
		ItemQuantity qtyObj = transformQuantity(ordHist.getQuantity(), ordHist.getUi());
		liObj.setQuantity(qtyObj);
		CscItemDetails cscItemObj = transformCscItemDetails(ordHist);
		liObj.setCscItemDetails(cscItemObj);
		return liObj;
	}

	
	/**
	 * Transforms to canonical model <code>OrderNumber</code> object from
	 * order number, suffix and scope.
	 * 
	 * @param 	orderNumber
	 * @param 	suffix
	 * @param 	scope
	 * @return	returns <code>OrderNumber</code> object
	 */
	private static OrderNumber transformOrderNumber(Long orderNumber, String suffix, String scope){
		OrderNumber ordNumberObj = null;
		if(orderNumber != null){
			ordNumberObj = new OrderNumber();
			ordNumberObj.setValue(orderNumber.toString());
		}
		return ordNumberObj;
	}
	
	/**
	 * Transforms to canonical model <code>Store</code> object from
	 * store number, location code and location description.
	 * 
	 * @param 	storeNbr
	 * @param 	locationCode
	 * @param 	locationDesc
	 * @return	
	 */
	private static Store transformStore(String storeNbr, String locationCode, String locationDesc){
		Store storeObj = null;
		if(storeNbr != null){
			storeObj = new Store();
			storeObj.setStoreNumber(storeNbr);
		}
		return storeObj;
	}
	
	static Liid transformLiid(String liidId){
		Liid liid = null;
		if(liidId != null){
			liid = new Liid();
			liid.setLiidId(liidId);
		}
		return liid;
	}
	
	/**
	 * Transforms to canonical model <code>Store</code> object from
	 * <code>OrderHistory</code> object
	 * 
	 * @param 	hist	<code>OrderHistory</code> object
	 * @return	returns <code>ItemNumber</code> object
	 */
	private static ItemNumber transformItemNumber(OrderHistory hist){
		if(hist == null){
			return null;
		}
		ItemNumber itemNbrObj = new ItemNumber();
		if(hist.getNiin() != null && hist.getNiin().trim().length() >0){
			itemNbrObj.setValue(hist.getNiin());
			itemNbrObj.setStandard(ItemNumberStandard.NIIN);
		}else if(hist.getManufacturePartNo() != null && hist.getManufacturePartNo().length() > 0){
			itemNbrObj.setValue(hist.getManufacturePartNo());
			itemNbrObj.setStandard(ItemNumberStandard.EDD);
			itemNbrObj.setPrefix(hist.getEddIdPrefix());
		}
		return itemNbrObj;
	}
	
	/**
	 * Transforms to canonical model <code>ItemQuantity</code> object from
	 * quantity and ui.
	 * 
	 * @param quantity
	 * @param ui
	 * @return
	 */
	private static ItemQuantity transformQuantity(Integer quantity, String ui) {
		ItemQuantity itemQtyObj = null;
		if(quantity != null || ui != null){
			itemQtyObj = new ItemQuantity();
			itemQtyObj.setValue(quantity);
			if(ui != null){
				itemQtyObj.setUnitCode(ui.trim());
			}
		}
		return itemQtyObj;
	}	
	
	/**
	 * Transforms to canonical model <code>CscItemDetails</code> object from
	 * <code>OrderHistory</code> object
	 * 
	 * @param ordHist
	 * @return
	 */
	private static CscItemDetails transformCscItemDetails(OrderHistory ordHist) {
		if(ordHist == null){
			return null;
		}
		CscItemDetails cscItemObj = new CscItemDetails();
		cscItemObj.setEddRequisitionNumber(transformEddRequisitionNumber(ordHist.getDocNo(), ordHist.getDocSuff()));
		cscItemObj.setStore(transformStore(ordHist.getStore(), null,null));
		//Sell price
		if(ordHist.getSellPrice() != null){
			cscItemObj.setSellPrice("" + ordHist.getSellPrice());
		}
		//Cost price
		if(ordHist.getCostPrice() != null){
			cscItemObj.setCostPrice(""+ordHist.getCostPrice());
		}
		//Back Order
		if(ordHist.getBackOrder() != null && ordHist.getBackOrder().trim().length() > 0){
			cscItemObj.setBackOrder(ordHist.getBackOrder().trim());
		}
		//Description
		if(ordHist.getDescription() != null && ordHist.getDescription().trim().length() > 0){
			cscItemObj.setDescription(ordHist.getDescription().trim());
		}
		//Shipment
		ShipmentData shipment = transformShipmentData(ordHist);
		if(shipment != null){
			cscItemObj.setShipment(shipment);
		}
		//Tcn
		if(ordHist.getTcn() != null && ordHist.getTcn().trim().length() > 0){
			cscItemObj.setTcn(ordHist.getTcn().trim());
		}
		//Weight
		if(ordHist.getWeight() != null && ordHist.getWeight() > 0){
			cscItemObj.setUnitWeight(ordHist.getWeight());
		}
		//Receipt Date ordered
		if(ordHist.getReceiptDateOrd() != null && ordHist.getReceiptDateOrd() > 0){
			try {
				XMLGregorianCalendar orderedXmlGregCal=DateUtility.julianToXMLGregCalendar(ordHist.getReceiptDateOrd());
				cscItemObj.setReceiptDateOrdered(orderedXmlGregCal);	
			} catch (ParseException e) {
				logger.warn("transformCscItemDetails():Failed to parse ordered Date->" + ordHist.getReceiptDateOrd());
			}			
		}
		//Receipt Date received
		if(ordHist.getReceiptDateRcd() != null && ordHist.getReceiptDateRcd() > 0){
			try {
				XMLGregorianCalendar receivedXmlGregCal=DateUtility.julianToXMLGregCalendar(ordHist.getReceiptDateRcd());
				cscItemObj.setReceiptDateReceived(receivedXmlGregCal);	
			} catch (ParseException e) {
				logger.warn("transformCscItemDetails():Failed to parse received Date->" + ordHist.getReceiptDateRcd());
			}			
		}	
		//Sale Pickup
		if(ordHist.getSalePickup() != null && ordHist.getSalePickup().trim().length() > 0){
			cscItemObj.setSalePickup(ordHist.getSalePickup().trim());
		}
		//Priority Code
		if(ordHist.getPrioCode() != null && ordHist.getPrioCode() > 0){
			cscItemObj.setPriorityCode(ordHist.getPrioCode().toString());
		}
		//Project Code
		if(ordHist.getProjCode() != null && ordHist.getProjCode().trim().length() > 0){
			cscItemObj.setProjectCode(ordHist.getProjCode().trim());
		}
		//Approp Number
		if(ordHist.getAppropNo() != null && ordHist.getAppropNo().trim().length() > 0){
			cscItemObj.setAppropNumber(ordHist.getAppropNo().trim());
		}
		//Depot
		if(ordHist.getDepot() != null && ordHist.getDepot().trim().length() > 0){
			cscItemObj.setDepot(ordHist.getDepot().trim());
		}
		return cscItemObj;
	}

	/**
	 * Transforms to canonical model <code>EddRequisitionNumber</code> object from
	 * Requisition number and suffix.
	 * 
	 * @param reqNo
	 * @param suffix
	 * @return
	 */
	private static EddRequisitionNumber transformEddRequisitionNumber(String reqNo, String suffix ) {
		EddRequisitionNumber eddReqNumber = null;

		if(reqNo!=null && reqNo.trim().length() > 0){
			eddReqNumber = new EddRequisitionNumber();
				eddReqNumber.setRequisitionNumber(reqNo.trim());
			if(suffix != null && suffix.trim().length() > 0){
				eddReqNumber.setSuffix(suffix.trim());
			}
		}
		return eddReqNumber;
	}	
	
	
	/**
	 * Transforms to canonical model <code>ActivityAddressCode</code> object from
	 * aac and access code.
	 * 
	 * @param aac
	 * @param accessCode
	 * @return
	 */
	private static ActivityAddressCode transformAac(String aac, String accessCode){
		ActivityAddressCode aacCode = null;
		if(aac != null){
			aacCode = new ActivityAddressCode();
			aacCode.setValue(aac);
			aacCode.setAccessCode(accessCode);
		}
		return aacCode;
	}
	
	/**
	 * Transforms to canonical model <code>ShipmentData</code> object from
	 * <code>OrderHistory</code> object.
	 * 
	 * @param 	ordHist
	 * @return	returns <code>ShipmentData</code> object
	 */
	private static ShipmentData transformShipmentData(OrderHistory ordHist){
		if(ordHist == null){
			return null;
		}
		ShipmentData shipmentData = new ShipmentData();
		//Manifest number
		if(ordHist.getManifestNumber() != null && 
				ordHist.getManifestNumber().trim().length() > 0){
			shipmentData.setManifestNumber(ordHist.getManifestNumber().trim());
		}
		//Shipdate
		if(ordHist.getShipDate() != null && ordHist.getShipDate() > 0){
			try {
				XMLGregorianCalendar shipXmlGregCal=DateUtility.julianToXMLGregCalendar(ordHist.getShipDate());
				shipmentData.setActualShipDate(shipXmlGregCal);	
			} catch (ParseException e) {
				logger.warn("transformShipmentData():Failed to parse shipping Date->" + ordHist.getShipDate());
			}
		}
		//Transportation object
		Transportation transportation = transformTransportation(ordHist);
		if(transportation != null){
			shipmentData.setTransportation(transportation);
		}
		//GovtBillOfLadingNumber
		if(ordHist.getGbl() != null && ordHist.getGbl().trim().length() > 0){
			shipmentData.setGovtBillOfLadingNumber(ordHist.getGbl().trim());
		}
		//Tracking Number
		if(ordHist.getTrackingNumber() != null && ordHist.getTrackingNumber().trim().length() > 0){
			shipmentData.setTrackingNumber(ordHist.getTrackingNumber().trim());
		}
		//Carrier Name
		if(ordHist.getCarrier() != null && ordHist.getCarrier().trim().length() > 0){
			shipmentData.setCarrierName(ordHist.getCarrier().trim());
		}
		return shipmentData;
	}
	
	/**
	 * Transforms to canonical model <code>Transportation</code> object from
	 * <code>OrderHistory</code> object.
	 * 
	 * @param ordHist
	 * @return
	 */
	private static Transportation transformTransportation(OrderHistory ordHist){
		Long controlNumber = ordHist.getControlNumber();
		String shipMode = ordHist.getShipMode();
		if(( controlNumber!= null && controlNumber > 0) ||
				(shipMode != null && shipMode.trim().length() > 0)){
			Transportation transportation = new Transportation();
			if(controlNumber != null && controlNumber > 0){
				transportation.setControlNumber(controlNumber.toString());
			}
			if(shipMode != null && shipMode.trim().length() > 0){
				transportation.setMode(shipMode.trim());
			}
			return transportation;
		}
		return null;
	}

	/**
	 * Transforms to canonical model <code>Address</code> object from
	 * <code>OrderShipAddress</code> object.
	 * 
	 * @param 	orderShipAddr	<code>OrderShipAddress</code> object
	 * @return	returns <code>OrderShipAddress</code> object
	 */
	public static Address transformShipAddress(OrderShipAddress orderShipAddr){
		if(orderShipAddr == null){
			return null;
		}
		Address address = new Address();
		address.setAddress1(orderShipAddr.getAddress1());
		address.setAddress2(orderShipAddr.getAddress2());
		address.setAddress3(orderShipAddr.getAddress3());
		address.setCity(orderShipAddr.getCity());
		address.setState(orderShipAddr.getState());
		address.setCountry(orderShipAddr.getCountry());
		address.setZip(orderShipAddr.getZip());
		address.setZip4(orderShipAddr.getZipPlus4());
		return address;
	}
	
	/**
	 * Transforms <code>CancelOrderRequest</code> canonical model to
	 * <code>OrderCancel</code> persistence model object.
	 * 
	 * @param 	cancelReq
	 * @return	
	 */
	public static OrderCancel transformOrderCancel(CancelOrderRequest cancelReq){
		if(cancelReq == null){
			return null;
		}
		OrderCancel ordCancel = new OrderCancel();
		if(cancelReq.getOrderItem() != null){
			OrderItem ordItem = cancelReq.getOrderItem();
			if(ordItem.getNsn() != null && 
					ordItem.getNsn().trim().length() > 0){
				ordCancel.setNsn(ordItem.getNsn().trim());
			}
			if(ordItem.getUnitCode() != null && ordItem.getUnitCode().trim().length() > 0){
				ordCancel.setUnit(ordItem.getUnitCode().trim());
			}
			if(ordItem.getQuantity() > 0){
				ordCancel.setQuantity(ordItem.getQuantity());
			}
			if(ordItem.getRequisitionNumber() != null && 
					ordItem.getRequisitionNumber().trim().length() > 0){
				ordCancel.setRequisitionNumber(ordItem.getRequisitionNumber().trim());
			}
			if(ordItem.getRequisitionSuffix() != null && 
					ordItem.getRequisitionSuffix().trim().length() > 0){
				ordCancel.setRequisitionSuffix(ordItem.getRequisitionSuffix().trim());
			}			
		}
		ordCancel.setDocumentIdentifierCode( "AC1");
		ordCancel.setRoutingIdentifierCode( "GSA");
		if(cancelReq.getSupplementAddrAAC() != null && 
				cancelReq.getSupplementAddrAAC().trim().length() > 0){
			ordCancel.setSupplementAddrAAC(cancelReq.getSupplementAddrAAC().trim());
		}
		if(cancelReq.getDistributionCode() != null && 
				cancelReq.getDistributionCode().trim().length() > 0){
			ordCancel.setDistributionCode(cancelReq.getDistributionCode().trim());
		}
		if(cancelReq.getProjectCode() != null && 
				cancelReq.getProjectCode().trim().length() > 0){
			ordCancel.setProjectCode(cancelReq.getProjectCode().trim());
		}
		if(cancelReq.getPriorityCode() != null && 
				cancelReq.getPriorityCode() > 0){
			ordCancel.setPriorityCode(cancelReq.getPriorityCode());
		}
		ordCancel.setCreatedDate(DateUtility.getCurrentDateString("DDD"));
		return ordCancel;
	}

}
