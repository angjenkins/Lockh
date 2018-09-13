/*
 * @(#)ContactTransformation.java			Mar 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.customer.v1;

import gov.gsa.fas.customer.v1.Contact;
import gov.gsa.fas.global.v1.Address;
import gov.gsa.fas.global.v1.Phone;
import gov.gsa.fas.global.v1.PhoneNumberType;
import gov.gsa.fas.persistence.contact.model.CustomerContact;
import gov.gsa.fas.services.messages.v1.ContactList;

import java.util.List;

/**
 * <code>ContactTransformation</code> provides methods for transforming
 * Contact meta data to canonical model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ContactTransformation {

	/**
	 * Transforms list of <code>CustomerContact</code> objects to
	 * <code>ContactList</code> object.
	 * 
	 * @param 	CustomerContactList
	 * @return	<code>ContactList</code> object
	 */
	public static ContactList transformCustomerContactList(List<CustomerContact> customerContactList){
		if(customerContactList == null){
			return null;
		}
		ContactList contactListObj = new ContactList();
		for(CustomerContact customerContact:customerContactList){
			Contact contact = transformContact(customerContact);
			contactListObj.getContact().add(contact);
		}
		return contactListObj;
	}
	

//	/**
//	 * Transforms list of <code>AdbContact</code> objects to
//	 * <code>ContactList</code> object.
//	 * 
//	 * @param 	adbContactList
//	 * @return	<code>ContactList</code> object
//	 */
//	public static ContactList transformAdbContactList(List<AdbContact> adbContactList){
//		if(adbContactList == null){
//			return null;
//		}
//		ContactList contactListObj = new ContactList();
//		for(AdbContact CustomerContact:adbContactList){
//			Contact contact = transformContact(CustomerContact);
//			contactListObj.getContact().add(contact);
//		}
//		return contactListObj;		
//	}
	
	/**
	 * Transforms persistence model <code>CustomerContact</code> object to <code>Contact</code>
	 * object.
	 * 
	 * @param 	pContact
	 * @return	returns Contact object
	 */
	private static Contact transformContact(CustomerContact pContact) {
		if(pContact == null){
			return null;
		}
		Contact contact = new Contact();
		contact.setFirstName(pContact.getFirstName());
		contact.setLastName(pContact.getLastName());
		contact.setAac(pContact.getShipAac());
		contact.setAgency(pContact.getAgencyName());
		contact.setBureau(pContact.getBureauDescription());
		Phone phone =  new Phone();
		phone.setPhone(pContact.getPhone());
		if(pContact.getPhone() != null && pContact.getPhone().trim().length() > 0){
			if(pContact.getPhone().trim().startsWith("011")){
				phone.setPhoneNumberType(PhoneNumberType.INTERNATIONAL);
			}else{
				phone.setPhoneNumberType(PhoneNumberType.DOMESTIC);
			}
			phone.setPhoneExt(pContact.getPhoneExt());
		}
		contact.getPhone().add(phone);
		contact.getFax().add(pContact.getFax());
		contact.getEmail().add(pContact.getEmail());
		Address shipAddr = new Address(); 
		shipAddr.setAddress1(pContact.getShipToAddress1());
		shipAddr.setAddress2(pContact.getShipToAddress2());
		shipAddr.setAddress3(pContact.getShipToAddress3());
		shipAddr.setCity(pContact.getShipToCity());
		shipAddr.setState(pContact.getShipToState());
		shipAddr.setCountry(pContact.getShipToCountry());
		shipAddr.setZip(pContact.getShipToZip());
		shipAddr.setZip4(pContact.getShipToZip4());
		shipAddr.setPhone(pContact.getShipToPhone());
		contact.getAddress().add(shipAddr);
		return contact;
	}	
}
