/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc;

import gov.gsa.fas.order.v1.ActivityAddressCode;
import gov.gsa.fas.order.v1.AssociatedAgencyCodes;
import gov.gsa.fas.order.v1.CarrierTrackingDetails;
import gov.gsa.fas.order.v1.ExportInfo;
import gov.gsa.fas.order.v1.ItemNumber;
import gov.gsa.fas.order.v1.ItemQuantity;
import gov.gsa.fas.order.v1.LineItem;
import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.order.v1.OrderNumber;
import gov.gsa.fas.order.v1.RequisitionPriority;
import gov.gsa.fas.order.v1.ShipmentInfo;
import gov.gsa.fas.order.v1.Transportation;
import gov.gsa.fas.order.v1.WdcConsignee;
import gov.gsa.fas.order.v1.WdcFullfilledItemDetails;
import gov.gsa.fas.order.v1.WdcOrderedItemDetails;
import gov.gsa.fas.order.v1.Order.LineItemList;
import gov.gsa.fas.order.v1.WdcProcessStageList;

/**
 * Utility Class with order manipulation operations
 * @author CourtAZabel
 */
public abstract class OrderUtils {

	
	/**
	 * Populate the child objects within the order
	 * @param order
	 */
	public static Order createOrder() {
		Order order  = new Order();
		order.setAac(new ActivityAddressCode());

		OrderNumber orderNumber = new OrderNumber();
		order.setOrderNumber(orderNumber);

		WdcConsignee consignee = new WdcConsignee();
		consignee.setAac(new ActivityAddressCode() );
		
		WdcOrderedItemDetails wdcOrderedItemDetails = new WdcOrderedItemDetails();
		wdcOrderedItemDetails.setAssociatedAgencyCodes( new AssociatedAgencyCodes() );
		wdcOrderedItemDetails.setConsignee( consignee );
		wdcOrderedItemDetails.setPriority( new RequisitionPriority() );
		wdcOrderedItemDetails.setQuantity( new ItemQuantity() );
		wdcOrderedItemDetails.setSupplementalAac( new ActivityAddressCode() );

		
		ShipmentInfo shipmentInfo = new ShipmentInfo();
		shipmentInfo.setCarrierTrackingDetails(new CarrierTrackingDetails());
		shipmentInfo.setExportInfo(new ExportInfo());
		shipmentInfo.setTransportation(new Transportation());

		WdcFullfilledItemDetails wdcFullfilledItemDetails = new WdcFullfilledItemDetails();
		wdcFullfilledItemDetails.setQuantity( new ItemQuantity() );
		wdcFullfilledItemDetails.setShippedQuantity( new ItemQuantity() );
		wdcFullfilledItemDetails.setShipmentInfo(shipmentInfo);

		WdcProcessStageList wdcProcessStageList = new WdcProcessStageList();
		
		LineItem lineItem = new LineItem();
		lineItem.setWdcOrderedItemDetails(wdcOrderedItemDetails);
		lineItem.setWdcFulfilledItemDetails(wdcFullfilledItemDetails);
		lineItem.setItemNumber( new ItemNumber() );
		lineItem.setQuantity( new ItemQuantity() );
		lineItem.setWdcProcessStages(wdcProcessStageList);
		
		LineItemList lineItemList = new LineItemList();
		lineItemList.getLineItem().add(lineItem);
		order.setLineItemList(lineItemList);
		
		

		return order;
	}
	

	/**
	 * Clean out any possible empty elements
	 * @param order
	 * @return
	 */
	public static Order cleanOrder(Order order) {
		cleanObject(order);
		return order;
	}


	private static void cleanObject(Object obj) {
		if (obj==null)
			return;
	}

}
