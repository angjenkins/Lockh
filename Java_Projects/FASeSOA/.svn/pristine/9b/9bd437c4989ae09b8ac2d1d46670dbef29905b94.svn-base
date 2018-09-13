/*
 * @(#)OrderComplaintImpl.java			Aug 3, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.ordercomplaint.v1;

import java.util.ArrayList;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

import gov.gsa.fas.ordercomplaint.v1.Complaint;
import gov.gsa.fas.ordercomplaint.v1.InvestigationDetails;
import gov.gsa.fas.persistence.order.complaint.model.OrderInvestigation;
import gov.gsa.fas.persistence.order.complaint.service.ComplaintPersistence;
import gov.gsa.fas.persistence.order.complaint.service.ComplaintPersistenceException;
import gov.gsa.fas.services.messages.v1.ModifyComplaint;

/**
 * <code>OrderComplaintImpl</code> provides service implementation for
 * OrderComplaint Service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see  		gov.gsa.fas.services.ordercomplaint.v1.OrderComplaint   
 */

@WebContext(contextRoot = "/order.services", urlPattern = "/OrderComplaint")
@WebService(endpointInterface = "gov.gsa.fas.services.ordercomplaint.v1.OrderComplaint", portName = "OrderComplaint", targetNamespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(OrderComplaint.class)
@Stateless

public class OrderComplaintImpl implements OrderComplaint {

	private static final Logger logger = Logger.getLogger(OrderComplaintImpl.class.getName());
	private InitialContext ctx;
	
	/**
	 * Creates order quality complaint in the OCMS systems.
	 * 
	 * @param 	complaint	<code>Complaint</code> object
	 * @return	complaint key
	 * @throws 	ServiceFault
	 */
	public long createComplaint(Complaint complaint)
														throws ServiceFault {
		ArrayList<String> valMsgs = OrderComplaintValidator.validateOrderComplaint(complaint);
		if(valMsgs != null && valMsgs.size() > 0){
			StringBuffer valMsgBuf = new StringBuffer();
			for(String msg : valMsgs){
				valMsgBuf.append(msg + ";");
			}
			logger.error("createComplaint(): Validations falied for Complaint data" + "\n" +
					valMsgs.toString());
			throw new ServiceFault("", createFault("E", "Validations Failed: " + valMsgs.toString()));
		}
		logger.info("createComplaint(): Creating Order complaint for Item->" + complaint.getItem().getNsn() + 
				"-" + complaint.getItem().getName());
		gov.gsa.fas.persistence.order.complaint.model.OrderComplaint ordCmplnt =
			OrderComplaintTransformation.transformComplaint(complaint);
		ordCmplnt.setModifyAction("INSERT");
		logger.info("createComplaint(): Order Complaint transformation completed for for Item->" + complaint.getItem().getNsn() + 
				"-" + complaint.getItem().getName());
		long complaintKey = -1;
		try {
			complaintKey = getComplaintPersistenceLocal().createComplaint(ordCmplnt);
		} catch (ComplaintPersistenceException e) {
			logger.error("createComplaint(): System Failure: Failed to persist Order Complaint Data", e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to persist Order Complaint Data-" + 
					e.getMessage()));
		}
		return complaintKey;
	}

	/**
	 * Modifies the order quality complaint for the corresponding 
	 * complaint key. 
	 * 
	 * @param 	modifyComplaintRequest
	 * @return	true, if successful
	 * @throws 	ServiceFault
	 */
	public boolean modifyComplaint(ModifyComplaint modifyComplaintRequest)
			throws ServiceFault {
		ArrayList<String> valMsgs = OrderComplaintValidator.validateModifyComplaint(modifyComplaintRequest);
		if(valMsgs != null && valMsgs.size() > 0){
			StringBuffer valMsgBuf = new StringBuffer();
			for(String msg : valMsgs){
				valMsgBuf.append(msg + ";");
			}
			logger.error("modifyComplaint(): Validations falied for Complaint data" + "\n" +
					valMsgs.toString());
			throw new ServiceFault("", createFault("E", "Validations Failed: " + valMsgs.toString()));
		}
		long complaintKey = modifyComplaintRequest.getComplaintKey();
		logger.info("modifyComplaint(): Modfying Order complaint for Complaint Key->" + complaintKey);
		gov.gsa.fas.persistence.order.complaint.model.OrderComplaint ordCmplnt =
			OrderComplaintTransformation.transformComplaint(modifyComplaintRequest);
		ordCmplnt.setModifyAction("UPDATE");
		logger.info("modifyComplaint(): Modify Complaint transformation completed for Complaint Key->" + 
				complaintKey);
		boolean isModSuccess = false;
		try {
			gov.gsa.fas.persistence.order.complaint.model.OrderComplaint existComplaint = 
				getComplaintPersistenceLocal().retrieveComplaint(ordCmplnt.getComplaintKey());
			if(existComplaint == null){
				logger.error("modifyComplaint(): Order Complaint doesn't exist for complaint key->" + 
						ordCmplnt.getComplaintKey());
				throw new ServiceFault("", createFault("E", "Order Complaint doesn't exist for the complaint key"));
			}
			isModSuccess = getComplaintPersistenceLocal().updateComplaint(ordCmplnt, existComplaint);
		} catch (ComplaintPersistenceException e) {
			logger.error("createComplaint(): System Failure: Failed to update Order Complaint Data for  Complaint Key->" + 
				complaintKey, e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to update Order Complaint Data-" + 
					e.getMessage()));
		}
		return isModSuccess;
	}

	/**
	 * Cancels the existing order quality complaint by setting status to closed.
	 * 
	 * @param complaintKey
	 * @return
	 * @throws ServiceFault
	 */
	public boolean cancelComplaint(long complaintKey) throws ServiceFault {
		logger.info("cancelComplaint(): Cancelling Order complaint for Complaint Key->" + complaintKey);
		boolean isCancelSuccess = false;
		try {
			isCancelSuccess = getComplaintPersistenceLocal().cancelComplaint(complaintKey);
		} catch (ComplaintPersistenceException e) {
			logger.error("cancelComplaint(): System Failure: Failed to cancel Order Complaint Data for  Complaint Key->" + 
				complaintKey, e);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to cancel Order Complaint-" + 
					e.getMessage()));
		}
		return isCancelSuccess;
	}

	/**
	 * Get the investigation details for the corresponding complaint key.
	 * 
	 * @param 	complaintKey
	 * @return
	 * @throws ServiceFault
	 */
	public InvestigationDetails getInvestigation(long complaintKey)
			throws ServiceFault {
		logger.info("getInvestigation(): Getting investigation details for Complaint Key->" + complaintKey);
		OrderInvestigation ordInvestigation = null;
		try {
			ordInvestigation = getComplaintPersistenceLocal().retrieveInvestigation(complaintKey);
		} catch (ComplaintPersistenceException e) {
			logger.error("getInvestigation(): System Failure: Failed to get investigation details for  Complaint Key->" + 
					complaintKey, e);
				throw new ServiceFault("", createFault("E", "System Failure: Failed to get Investigation details-" + 
						e.getMessage()));
		}
		if(ordInvestigation == null){
			return new InvestigationDetails();
		}
		InvestigationDetails investigationDetails = OrderComplaintTransformation.transformInvestigation(
				ordInvestigation);
		return investigationDetails;
	}
	
	/**
	 * Get the local EJB of <code>ComplaintPersistence</code> object.
	 * 
	 * @return	<code>ComplaintPersistence</code> local object
	 * @throws 	NamingException, if lookup fails
	 */
	private ComplaintPersistence getComplaintPersistenceLocal() throws ServiceFault{
		String complaintPersistenceJNDI = "enterprise.services/ComplaintPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( complaintPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getComplaintPersistenceLocal(): System Failure: Failed to get ComplaintPersistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getComplaintPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (ComplaintPersistence)robj;		
	}		

	/**
	 * Creates and returns the <code>gov.gsa.fas.faults.v1.ServiceFault</code> detailed fault
	 * element. 
	 * 
	 * @param 	code
	 * @param 	msg
	 * @return	<code>gov.gsa.fas.faults.v1.ServiceFault</code> object
	 */
	private gov.gsa.fas.faults.v1.ServiceFault createFault(String code, String msg){
		gov.gsa.fas.faults.v1.ServiceFault sFault = new gov.gsa.fas.faults.v1.ServiceFault();
		sFault.setCode(code);
		sFault.setMessage(msg);
		return sFault;
	}	
}
