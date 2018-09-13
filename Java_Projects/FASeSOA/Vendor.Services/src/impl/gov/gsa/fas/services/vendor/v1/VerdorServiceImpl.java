/*
 * @(#)VerdorServiceImpl.java			Aug 20, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.vendor.v1;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

import gov.gsa.fas.persistence.vendor.model.VendorContract;
import gov.gsa.fas.persistence.vendor.model.VendorInfo;
import gov.gsa.fas.persistence.vendor.model.VendorInvoice;
import gov.gsa.fas.persistence.vendor.service.VendorPersistence;
import gov.gsa.fas.persistence.vendor.service.VendorPersistenceException;
import gov.gsa.fas.services.messages.v1.VendorSearchRequest;
import gov.gsa.fas.vendor.v1.VendorDetails;

/**
 * <code>VerdorServiceImpl</code> provides service implementation for
 * VendorService.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see     gov.gsa.fas.services.vendor.v1.VendorService
 */

@WebContext(contextRoot = "/vendor.services", urlPattern = "/VendorService")
@WebService(endpointInterface = "gov.gsa.fas.services.vendor.v1.VendorService", portName = "VendorService", targetNamespace = "http://fas.gsa.gov/services/Vendor/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(VendorService.class)
@Stateless

public class VerdorServiceImpl implements VendorService {

	private static final Logger logger = 
		Logger.getLogger(VerdorServiceImpl.class.getName());
	private InitialContext ctx;
	
	/**
	 * Get the vendor details by Vendor Duns Number and PO
	 * Number.
	 * 
	 * @param 	vendorRequest
	 * @return	<code>VendorDetails</code> object
	 * @throws 	ServiceFault, if any system error occurs
	 */
	public VendorDetails getVendorDetails(VendorSearchRequest vendorRequest)
			throws ServiceFault {
		validateVendorSearchRequest(vendorRequest);
		String dunsNo = vendorRequest.getDunsNumber();
		String poNo = vendorRequest.getPoNumber();
		logger.info("getVendorDetails(): Getting Vendor details for Duns->" + dunsNo + 
				" and PO Number->" + poNo);
		VendorPersistence vdrPers = getVendorPersistenceLocal();
		VendorInfo vdrInfo = null;
		VendorInvoice vdrInv = null;
		VendorContract vdrContract = null;
		try {
			vdrInfo = vdrPers.retrieveVendorInfo(dunsNo.trim());
			if(poNo != null && !poNo.isEmpty()){
				vdrInv = vdrPers.retrieveVendorInvoice(poNo.trim());
				vdrContract = vdrPers.retrieveVendorContract(poNo.trim());
			}
		} catch (VendorPersistenceException vpe) {
			logger.error("getVendorDetails(): System Failure:Failed to get Vendor details by DUNS->" +  dunsNo + 
					" and PO Number->" + poNo);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get Vendor details-" + vpe.getMessage()));				
		}
		VendorDetails vdrDetails = VendorTransformation.transformVendorDetails(vdrInfo, vdrInv, vdrContract);
		if(vdrDetails == null){
			logger.error("getVendorDetails(): No Matching Records Found");
			throw new ServiceFault("", createFault("E", "No matching records found"));
		}
		return vdrDetails;
	}
	
	/**
	 * Validates the vendor search request. If invalid throws ServiceFault.
	 * 
	 * @param vendorRequest
	 * @throws ServiceFault
	 */
	private void validateVendorSearchRequest(VendorSearchRequest vendorRequest) 
					throws ServiceFault {
		if(vendorRequest == null || vendorRequest.getDunsNumber() == null ||
				vendorRequest.getDunsNumber().isEmpty()){
			logger.error("getVendorDetails(): DUNS number is null or empty");
			throw new ServiceFault("", createFault("E", "DUNS number is empty"));
		}
	}
	
	/**
	 * Get the local EJB of <code>VendorPersistence</code> object.
	 * 
	 * @return
	 * @throws NamingException
	 */
	private VendorPersistence getVendorPersistenceLocal() throws ServiceFault{
		String orderPersistenceJNDI = "enterprise.services/VendorPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( orderPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getVendorPersistenceLocal(): System Failure: Failed to get Vendor Persistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getVendorPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (VendorPersistence)robj;		
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
