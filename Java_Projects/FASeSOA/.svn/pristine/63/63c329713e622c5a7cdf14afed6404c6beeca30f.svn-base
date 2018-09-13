/*
 * @(#)CustomerContactImpl.java			Mar 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.customer.v1;

import gov.gsa.fas.persistence.contact.service.ContactPersistence;
import gov.gsa.fas.persistence.contact.service.ContactPersistenceException;
import gov.gsa.fas.services.messages.v1.ContactList;
import gov.gsa.fas.services.messages.v1.CustomerSearchCriteria;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

/**
 * <code>CustomerContactImpl</code>
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     
 */

@WebContext(contextRoot = "/customer.services", urlPattern = "/CustomerContactService")
@WebService(endpointInterface = "gov.gsa.fas.services.customer.v1.CustomerContact", portName = "CustomerContact", targetNamespace = "http://fas.gsa.gov/services/Customer/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(CustomerContact.class)
@Stateless

public class CustomerContactImpl implements 
						gov.gsa.fas.services.customer.v1.CustomerContact {

	private static final Logger logger = Logger.getLogger(CustomerContactImpl.class.getName());
	private InitialContext ctx;
	/**
	 * Searches contacts by provided input search criteria.
	 * 
	 * @param 	getContactRequest
	 * @return	<code>ContactList</code> object
	 * @throws 	ServiceFault if any error occurs
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public ContactList getContactDetails(CustomerSearchCriteria getContactRequest)
			throws ServiceFault {
		validateContactSearchRequest(getContactRequest);
		ContactList contactList = new ContactList();
		if(getContactRequest.getAac() != null && 
				getContactRequest.getAac().trim().length() > 0){
			contactList = getContactDetailsByAac(getContactRequest.getAac().trim());
		}else if(getContactRequest.getFullName() != null &&
				getContactRequest.getFullName().getLastName() != null &&
				getContactRequest.getFullName().getLastName().trim().length() >0){
			String firstName = getContactRequest.getFullName().getFirstName();
			if(firstName == null){
				firstName = "";
			}
			contactList = getContactDetailsByName(getContactRequest.getFullName().getLastName().trim(),
					firstName.trim());
		}else if(getContactRequest.getEmail() != null &&
				getContactRequest.getEmail().trim().length() > 0){
			contactList = getContactDetailsByEmail(getContactRequest.getEmail().trim());
		}
		return contactList;
	}
	
	/**
	 * Searches Contact database by Activity Address Code. If any contacts found, return them.
	 * If no contacts found, throws <code>ServiceFault</code> with detailed fault message.
	 * 
	 * @param aac
	 * @return
	 * @throws ServiceFault
	 */

	private ContactList getContactDetailsByAac(String aac) throws ServiceFault{
		logger.info("getContactDetailsByAac(): Searching Contacts By Aac->" + aac);	
		ContactPersistence contactPers = getContactPersistenceLocal();
		List<gov.gsa.fas.persistence.contact.model.CustomerContact> customerContactList = null;
		try {
			customerContactList = contactPers.retrieveContactByAAC(aac);
		} catch (ContactPersistenceException ope) {
			logger.error("getContactDetailsByAac(): System Failure:Failed to get contact details by AAC->" + aac);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Customer Contact details-" + ope.getMessage()));				
		}
		ContactList contactList = ContactTransformation.transformCustomerContactList(customerContactList);
		if(contactList != null && contactList.getContact() != null && 
				contactList.getContact().size() > 0){
			logger.info("getContactDetailsByAac(): Number Of Contacts Found->" + contactList.getContact().size());
		}else{
			logger.error("getContactDetailsByAac(): No Contacts found matching AAC->" + aac);
			throw new ServiceFault("", createFault("W", "No Contacts found matching AAC"));
		}
		return contactList;
	}
	
	/**
	 * Searches Contact database by last name and first name. If any contacts found, return them.
	 * If no contacts found, throws <code>ServiceFault</code> with detailed fault message.
	 * 
	 * @param 	lastName
	 * @param 	firstName
	 * @return	<code>ContactList</code> object
	 * @throws 	ServiceFault, if any error occurs
	 */
	private ContactList getContactDetailsByName(String lastName, String firstName) throws ServiceFault{
		logger.info("getContactDetailsByName(): Searching Contacts By Last Name->" + lastName + 
				", First Name->" + firstName);
		ContactPersistence contactPers = getContactPersistenceLocal();
		List<gov.gsa.fas.persistence.contact.model.CustomerContact> customerContactList = null;
		try {
			customerContactList = contactPers.retrieveContactByName(lastName, firstName);
		} catch (ContactPersistenceException ope) {
			logger.error("getContactDetailsByName(): System Failure:Failed to get contact details by last name->" + lastName + 
					", First Name->" + firstName);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Customer Contact details-" + ope.getMessage()));			
		}
		ContactList contactList = ContactTransformation.transformCustomerContactList(customerContactList);
		if(contactList != null && contactList.getContact() != null && 
				contactList.getContact().size() > 0){
			logger.info("getContactDetailsByName(): Number Of Contacts Found->" + contactList.getContact().size());
		}else{
			logger.error("getContactDetailsByName(): No Contacts found matching Last Name->" + lastName + 
					", First Name->" + firstName);
			throw new ServiceFault("", createFault("W", "No Contacts found matching Last name and First name"));
		}
		return contactList;		
	}	
	
	/**
	 * Searches Contact database by Email. If any contacts found, return them.
	 * If no contacts found, throws <code>ServiceFault</code> with detailed fault message.
	 * 
	 * @param 	email
	 * @return	<code>ContactList</code> object
	 * @throws 	ServiceFault
	 */
	private ContactList getContactDetailsByEmail(String email) throws ServiceFault{
		logger.info("getContactDetailsByEmail(): Searching Contacts By Email->" + email);
		logger.info("getContactDetailsByEmail(): Searching Contacts By Email->" + email);	
		ContactPersistence contactPers = getContactPersistenceLocal();
		List<gov.gsa.fas.persistence.contact.model.CustomerContact> customerContactList = null;
		try {
			customerContactList = contactPers.retrieveContactByEmail(email);
		} catch (ContactPersistenceException ope) {
			logger.error("getContactDetailsByEmail(): System Failure:Failed to get contact details by Email->" + email);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Customer Contact details-" + ope.getMessage()));				
		}
		ContactList contactList = ContactTransformation.transformCustomerContactList(customerContactList);
		if(contactList != null && contactList.getContact() != null && 
				contactList.getContact().size() > 0){
			logger.info("getContactDetailsByEmail(): Number Of Contacts Found->" + contactList.getContact().size());
		}else{
			logger.error("getContactDetailsByEmail(): No Contacts found matching Email->" + email);
			throw new ServiceFault("", createFault("W", "No Contacts found matching Email"));
		}
		return contactList;		
	}	

	/**
	 * Validates the Contact search criteria request object. If not valid
	 * raises ServiceFault with error message.
	 * 
	 * @param getContactRequest
	 * @throws ServiceFault
	 */
	private void validateContactSearchRequest(
			CustomerSearchCriteria getContactRequest) throws ServiceFault{
		if(getContactRequest == null){
			logger.error("validateContactSearchRequest(): Contact search criteria input is null");
			throw new ServiceFault("", createFault("E", "Contact search criteria input is empty"));			
		}
		boolean isAac = false;
		boolean isName= false;
		boolean isEmail = false;
		if(getContactRequest.getAac() != null && 
				getContactRequest.getAac().trim().length() > 0){
			isAac = true;
		}else if(getContactRequest.getFullName() != null && 
				getContactRequest.getFullName().getLastName() != null &&
				getContactRequest.getFullName().getLastName().trim().length() > 0){
			isName = true;
		}else if(getContactRequest.getEmail() != null &&
				getContactRequest.getEmail().trim().length() > 0){
			isEmail = true;
		}
		if(!(isAac || isName || isEmail)){
			logger.error("validateContactSearchRequest(): Contact search criteria input is empty");
			throw new ServiceFault("", createFault("E", "Contact search criteria input is empty"));
		}
	}
	
	/**
	 * Get the local EJB of <code>ContactPersistence</code> object.
	 * 
	 * @return
	 * @throws NamingException
	 */
	private ContactPersistence getContactPersistenceLocal() throws ServiceFault{
		String orderPersistenceJNDI = "enterprise.services/ContactPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( orderPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getContactPersistenceLocal(): System Failure:Failed to get ContactPersistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getOrderPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (ContactPersistence)robj;		
	}
	
	/**
	 * Creates and returns the <code>gov.gsa.fas.faults.v1.ServiceFault</code> detailed fault
	 * element. 
	 * 
	 * @param 	code
	 * @param 	msg
	 * @return
	 */
	private gov.gsa.fas.faults.v1.ServiceFault createFault(String code, String msg){
		gov.gsa.fas.faults.v1.ServiceFault sFault = new gov.gsa.fas.faults.v1.ServiceFault();
		sFault.setCode(code);
		sFault.setMessage(msg);
		return sFault;
	}	

}
