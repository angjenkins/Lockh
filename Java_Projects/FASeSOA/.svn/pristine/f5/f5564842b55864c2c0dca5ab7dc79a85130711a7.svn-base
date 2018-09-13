/*
 * @(#)OrderDetailsValidator.java			Aug 27, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1;

import java.util.ArrayList;

import gov.gsa.fas.order.v1.OrderItem;
import gov.gsa.fas.services.common.ValidationHelper;
import gov.gsa.fas.services.messages.v1.CancelOrderRequest;

/**
 * <code>OrderDetailsValidator</code> provides validation for
 * all <code>OrderDetails</code> service operations.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderDetailsValidator {
	
	/**
	 * Validates Order cancel request object.
	 * 
	 * @param 	cancelReq <code>CancelOrderRequest</code> object
	 * @return	list of validation messages
	 */
	public static ArrayList<String> validateCancelOrder(CancelOrderRequest cancelReq){
		ArrayList<String> msgs = new ArrayList<String>();
		if(cancelReq == null){
			msgs.add("Cancel Order Request data is empty");
			return msgs;
		}
		OrderItem orderItem = cancelReq.getOrderItem();
		if(orderItem == null){
			msgs.add("Requisition Number and NSN are required fields");
		}else{
			ValidationHelper.validateField(orderItem.getNsn(), 15, true, "NSN", msgs);
			ValidationHelper.validateField(orderItem.getRequisitionNumber(), 14, true, "Requisition Number", msgs);
			ValidationHelper.validateField(orderItem.getRequisitionSuffix(), 1, false, "Requisition Suffix", msgs);
			ValidationHelper.validateField(orderItem.getUnitCode(), 2, false, "Unit Code", msgs);
			ValidationHelper.validateField(orderItem.getQuantity(), 99999, false, "Quantity", msgs);
		}
		ValidationHelper.validateField(cancelReq.getSupplementAddrAAC(), 6, false, "Supplement Address AAC", msgs);
		ValidationHelper.validateField(cancelReq.getDistributionCode(), 3, false, "Distribution Code", msgs);
		ValidationHelper.validateField(cancelReq.getProjectCode(), 3, false, "Project Code", msgs);
		ValidationHelper.validateField(cancelReq.getPriorityCode(), 99, false, "Priority Code", msgs);
		return msgs;
	}
}
