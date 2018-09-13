/*
 * @(#)OrderComplaintValidator.java			Aug 16, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.ordercomplaint.v1;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import gov.gsa.fas.ordercomplaint.v1.Complaint;
import gov.gsa.fas.ordercomplaint.v1.Item;
import gov.gsa.fas.ordercomplaint.v1.NCSCContact;
import gov.gsa.fas.ordercomplaint.v1.Originator;
import gov.gsa.fas.ordercomplaint.v1.PointOfContact;
import gov.gsa.fas.services.common.ValidationHelper;
import gov.gsa.fas.services.messages.v1.ModifyComplaint;

/**
 * <code>OrderComplaintValidator</code> validates order complaint
 * details.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderComplaintValidator {

	private static final Logger logger = Logger.getLogger(OrderComplaintValidator.class.getName());
	
	/**
	 * Validates <code>Complaint</code> object while creating or modifying Order
	 * Complaint input details.
	 * 
	 * @param 	cmplnt	<code>Complaint</code> object
	 * @return	list of messages
	 */
	static ArrayList<String> validateOrderComplaint(Complaint cmplnt){
		logger.info("validateOrderComplaint(): Validating Order Complaint Data");
		ArrayList<String> msgs = new ArrayList<String>();
		if(cmplnt == null){
			msgs.add("Complaint data is empty");
			return msgs;
		}
		//Item object
		Item item = cmplnt.getItem();
		if(item == null){
			msgs.add("NSN, Name and Category are required fields");
		}else{
			ValidationHelper.validateField(item.getNsn(), 15, true, "NSN", msgs);
			ValidationHelper.validateField(item.getName(), 35, false, "Item Name", msgs);
			ValidationHelper.validateField(item.getCategory(),new String[]{"1", "2", "3"}, 
					true, "Category", msgs);
		}
		Originator originator = cmplnt.getOriginator();
		if(originator != null){
			ValidationHelper.validateField(originator.getName(), 80, false, "Originator Name", msgs);
			ValidationHelper.validateField(originator.getAddress1(), 40, false, "Originator Address1", msgs);
			ValidationHelper.validateField(originator.getAddress2(), 40, false, "Originator Address2", msgs);
			ValidationHelper.validateField(originator.getCity(), 40, false, "Originator City", msgs);
			ValidationHelper.validateField(originator.getState(), 2, false, "Originator State", msgs);
			ValidationHelper.validateField(originator.getZip(), 10, false, "Originator Zip", msgs);
		}
		PointOfContact poc = cmplnt.getPoc();
		if(poc != null){
			ValidationHelper.validateField(poc.getName(), 80, false, "POC Name", msgs);
			ValidationHelper.validateField(poc.getPhone(), 25, false, "POC Phone", msgs);
		}
		ValidationHelper.validateField(cmplnt.getRequisitionNumber(), 25, false, "Requisition Number", msgs);
		ValidationHelper.validateField(cmplnt.getNotificationType(),new String[]{"C", "T", "E", "F"}, 
				true, "Notification Type", msgs);
		ValidationHelper.validateField(cmplnt.getNotificationDescription(), 80, false, "Notification Description", msgs);
		ValidationHelper.validateField(cmplnt.getPurchaseOrderNumber(), 15, false, "Purchase Order Number", msgs);
		ValidationHelper.validateField(cmplnt.getContractNumber(), 10, false, "Contract Number", msgs);
		ValidationHelper.validateField(cmplnt.getQuantityReceived(), 15, false, "Quantity Received", msgs);
		ValidationHelper.validateField(cmplnt.getQuantityRejected(), 15, false, "Quantity Rejected", msgs);
		ValidationHelper.validateField(cmplnt.getNatureOfComplaint(), 999, false, "Nature Of Complaint", msgs);
		ValidationHelper.validateField(cmplnt.getOperationCenter(),new String[]{"A", "B", "C", "S"}, 
				true, "Operation Center", msgs);
		NCSCContact ncscContact = cmplnt.getNcscContact();
		if(ncscContact != null){
			ValidationHelper.validateField(ncscContact.getFirstName(), 20, false, "NCSC First Name", msgs);
			ValidationHelper.validateField(ncscContact.getLastName(), 20, false, "NCSC Last Name", msgs);
			ValidationHelper.validateField(ncscContact.getEmail(), 80, false, "NCSC Email", msgs);
			ValidationHelper.validateField(ncscContact.getPhone(), 20, false, "NCSC Phone", msgs);
			ValidationHelper.validateField(ncscContact.getPhoneExtension(), 10, false, "NCSC Phone Extension", msgs);
		}
		return msgs;
	}
	
	/**
	 * Validates <code>ModifyComplaint</code> object for modifying complaint.
	 * 
	 * @param 	cmplnt	<code>Complaint</code> object
	 * @return	list of messages
	 */
	public static ArrayList<String> validateModifyComplaint(ModifyComplaint modifyComplaint){
		logger.info("validateModifyComplaint(): Validating Order Complaint Modification request");
		ArrayList<String> msgs = new ArrayList<String>();
		if(modifyComplaint == null){
			msgs.add("Complaint modification request is empty");
			return msgs;
		}
		if(modifyComplaint.getComplaintKey() <= 0){
			msgs.add("Complaint Key is required field for modifying complaint");
		}
		ArrayList<String> cmplntMsgs = validateOrderComplaint(modifyComplaint.getComplaint());
		msgs.addAll(cmplntMsgs);
		return  msgs;
	}
}
