/*
 * @(#)OrderComplaintTransformation.java			Aug 16, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.ordercomplaint.v1;

import java.text.ParseException;

import org.apache.log4j.Logger;

import gov.gsa.fas.ordercomplaint.v1.Complaint;
import gov.gsa.fas.ordercomplaint.v1.InvestigationDetails;
import gov.gsa.fas.persistence.order.complaint.model.OrderInvestigation;
import gov.gsa.fas.services.common.DateUtility;
import gov.gsa.fas.services.messages.v1.ModifyComplaint;

/**
 * <code>OrderComplaintTransformation</code> transforms order complaint
 * Canonical model to persistence model vice versa.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class OrderComplaintTransformation {

	private static final Logger logger = Logger.getLogger(OrderComplaintTransformation.class.getName());
	
	/**
	 * Transforms canonical model <code>gov.gsa.fas.ordercomplaint.v1.Complaint</code> object to 
	 * persistence model <code>gov.gsa.fas.persistence.order.complaint.model.OrderComplaint</code>
	 * object.
	 * 
	 * @param 	cmplnt
	 * @return	<code>gov.gsa.fas.persistence.order.complaint.model.OrderComplaint</code> object
	 */
	static gov.gsa.fas.persistence.order.complaint.model.OrderComplaint transformComplaint (Complaint cmplnt){
		logger.info("transformComplaint(): Transforming Complaint canonical model to Order Complaint persistence model");
		if(cmplnt == null){
			return null;
		}
		gov.gsa.fas.persistence.order.complaint.model.OrderComplaint ordCmplnt = 
			new gov.gsa.fas.persistence.order.complaint.model.OrderComplaint();
		//Item
		if(cmplnt.getItem() != null){
			if(cmplnt.getItem().getNsn() != null){
				ordCmplnt.setNsn(cmplnt.getItem().getNsn().trim());
			}
			if(cmplnt.getItem().getName() != null){
				ordCmplnt.setItemName(cmplnt.getItem().getName().trim());
			}
			if(cmplnt.getItem().getCategory() != null){
				ordCmplnt.setCategory(cmplnt.getItem().getCategory().trim());
			}
		}
		//Complaint Date
		if(cmplnt.getComplaintDate() != null){
			String cmplntDateStr = DateUtility.xmlGregCalendarToDateString(
					cmplnt.getComplaintDate(), "yyyyMMdd");
			ordCmplnt.setComplaintDate(cmplntDateStr);
		}
		//Complaint Received Date
		if(cmplnt.getReceivedDate() != null){
			String receivedDateStr = DateUtility.xmlGregCalendarToDateString(
					cmplnt.getReceivedDate(), "yyyyMMdd");
			ordCmplnt.setReceivedDate(receivedDateStr);
		}		
		//Originator details
		if(cmplnt.getOriginator() != null){
			if(cmplnt.getOriginator().getName() != null){
				ordCmplnt.setOriginatorName(cmplnt.getOriginator().getName().trim());
			}
			if(cmplnt.getOriginator().getAddress1() != null){
				ordCmplnt.setOriginatorAddress1(cmplnt.getOriginator().getAddress1().trim());
			}
			if(cmplnt.getOriginator().getAddress2() != null){
				ordCmplnt.setOriginatorAddress2(cmplnt.getOriginator().getAddress2().trim());
			}
			if(cmplnt.getOriginator().getCity() != null){
				ordCmplnt.setOriginatorCity(cmplnt.getOriginator().getCity().trim());
			}
			if(cmplnt.getOriginator().getState() != null){
				ordCmplnt.setOriginatorState(cmplnt.getOriginator().getState().trim());
			}
			if(cmplnt.getOriginator().getZip() != null){
				ordCmplnt.setOriginatorZip(cmplnt.getOriginator().getZip().trim());
			}
		}
		//POC
		if(cmplnt.getPoc() != null){
			if(cmplnt.getPoc().getName() != null){
				ordCmplnt.setPocName(cmplnt.getPoc().getName().trim());
			}
			if(cmplnt.getPoc().getPhone() != null){
				ordCmplnt.setPocPhone(cmplnt.getPoc().getPhone().trim());
			}
		}
		//Requisition Number
		if(cmplnt.getRequisitionNumber() != null){
			ordCmplnt.setRequisitionNumber(cmplnt.getRequisitionNumber().trim());
		}
		//Notification Type
		if(cmplnt.getNotificationType() != null){
			ordCmplnt.setNotificationType(cmplnt.getNotificationType().trim());
		}
		//Notification Description
		if(cmplnt.getNotificationDescription() != null){
			ordCmplnt.setNotificationTypeText(cmplnt.getNotificationDescription().trim());
		}
		//Purchase Order Number
		if(cmplnt.getPurchaseOrderNumber() != null){
			ordCmplnt.setPurchaseOrderNumber(cmplnt.getPurchaseOrderNumber().trim());
		}
		//Contract Number
		if(cmplnt.getContractNumber() != null){
			ordCmplnt.setContractNumber(cmplnt.getContractNumber().trim());
		}
		//Quantity Received
		if(cmplnt.getQuantityReceived() != null){
			ordCmplnt.setQuantityReceived(cmplnt.getQuantityReceived().trim());
		}
		//Qauntity Rejected
		if(cmplnt.getQuantityRejected() != null){
			ordCmplnt.setQuantityRejected(cmplnt.getQuantityRejected().trim());
		}
		//Nature of Complaint
		if(cmplnt.getNatureOfComplaint() != null){
			ordCmplnt.setNatureOfComplaint(cmplnt.getNatureOfComplaint().trim());
		}
		//Operation Centre
		if(cmplnt.getOperationCenter() != null){
			ordCmplnt.setOperationCenter(cmplnt.getOperationCenter().trim());
		}
		//NCSC Contact
		if(cmplnt.getNcscContact() != null){
			if(cmplnt.getNcscContact().getFirstName() != null){
				ordCmplnt.setNcscFirstName(cmplnt.getNcscContact().getFirstName().trim());
			}
			if(cmplnt.getNcscContact().getLastName() != null){
				ordCmplnt.setNcscLastName(cmplnt.getNcscContact().getLastName().trim());
			}
			if(cmplnt.getNcscContact().getEmail() != null){
				ordCmplnt.setNcscEmail(cmplnt.getNcscContact().getEmail().trim());
			}
			if(cmplnt.getNcscContact().getPhone() != null){
				ordCmplnt.setNcscPhone(cmplnt.getNcscContact().getPhone().trim());
			}
			if(cmplnt.getNcscContact().getPhoneExtension() != null){
				ordCmplnt.setNcscPhoneExt(cmplnt.getNcscContact().getPhoneExtension().trim());
			}
		}
		//Complaint Closed, always "N"
		ordCmplnt.setComplaintClosed("N");
		ordCmplnt.setLastModifiedBy(1);
		ordCmplnt.setLastModifiedTime(DateUtility.getCurrentTimeString("HHmmss"));
		ordCmplnt.setLastModifiedDate(DateUtility.getCurrentDateString("yyyyMMdd"));
		return ordCmplnt;
	}
	
	/**
	 * Transforms canonical model <code>gov.gsa.fas.ordercomplaint.v1.Complaint</code> object to 
	 * persistence model <code>gov.gsa.fas.persistence.order.complaint.model.OrderComplaint</code>
	 * object.
	 * 
	 * @param 	cmplnt
	 * @return	<code>gov.gsa.fas.persistence.order.complaint.model.OrderComplaint</code> object
	 */
	static gov.gsa.fas.persistence.order.complaint.model.OrderComplaint transformComplaint (ModifyComplaint modCmplnt){
		logger.info("transformComplaint(): Transforming Modify Complaint canonical model to Order Complaint persistence model");
		gov.gsa.fas.persistence.order.complaint.model.OrderComplaint ordComplaint = transformComplaint(
				modCmplnt.getComplaint());
		ordComplaint.setComplaintKey(modCmplnt.getComplaintKey());
		return ordComplaint;
	}

	/**
	 * Transforms Order investigation persistence model to Canonical model
	 * 
	 * @param ordInvestigation
	 * @return
	 */
	public static InvestigationDetails transformInvestigation(OrderInvestigation ordInvestigation) {
		logger.info("transformInvestigation(): Transforming Investigation persistence model to canonical model");
		if(ordInvestigation == null){
			return null;
		}
		InvestigationDetails investigation = new InvestigationDetails();
		investigation.setControlNumber(ordInvestigation.getControlNumber());
		investigation.setStatus(ordInvestigation.getStatus());
		investigation.setAssignedTo(ordInvestigation.getFirstName());
		investigation.setPhone(ordInvestigation.getPhone());
		investigation.setFax(ordInvestigation.getFax());
		investigation.setEmail(ordInvestigation.getEmail());
		investigation.setOperationCenter(ordInvestigation.getOperationCenter());
		if(ordInvestigation.getLastModifiedDate() != null){
			try {
				investigation.setLastModified(DateUtility.dateStringToXMLGregCalendar(
						ordInvestigation.getLastModifiedDate(), "yyyyMMdd"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return investigation;
	}
}
