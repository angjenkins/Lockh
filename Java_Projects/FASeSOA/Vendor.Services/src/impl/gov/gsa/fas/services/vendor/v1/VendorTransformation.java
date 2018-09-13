/*
 * @(#)VendorTransformation.java			Aug 21, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.vendor.v1;

import org.apache.log4j.Logger;

import gov.gsa.fas.global.v1.Address;
import gov.gsa.fas.persistence.vendor.model.VendorContract;
import gov.gsa.fas.persistence.vendor.model.VendorInfo;
import gov.gsa.fas.persistence.vendor.model.VendorInvoice;
import gov.gsa.fas.vendor.v1.CompanyInfo;
import gov.gsa.fas.vendor.v1.VendorDetails;

/**
 * <code>VendorTransformation</code> provides methods for transforming
 * Vendor persistence model to canonical model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class VendorTransformation {

	private static final Logger logger = 
		Logger.getLogger(VendorTransformation.class.getName());
	
	/**
	 * Transforms Vendor company information, invoice data and contract 
	 * persistence model to canonical model.
	 * 
	 * @param 	vdrInfo
	 * @param 	vdrInv
	 * @param 	vdrContract
	 * @return	<code>VendorDetails</code> object
	 */
	public static VendorDetails transformVendorDetails(VendorInfo vdrInfo,
			VendorInvoice vdrInv, VendorContract vdrContract){
		logger.info("transformVendorDetails(): Transforming Vendor Data");
		if(vdrInfo == null){
			logger.error("transformVendorDetails(): Vendor Company information is null");
			return null;
		}
		VendorDetails vdrDetails = new VendorDetails();
		if(vdrInfo != null){
			transformVendorInfo(vdrInfo, vdrDetails);
		}
		if(vdrInv != null){
			transformVendorInvoice(vdrInv, vdrDetails);
		}
		if(vdrContract != null){
			transformVendorContract(vdrContract, vdrDetails);
		}
		return vdrDetails;
	}

	/**
	 * Transforms Vendor Address information to canonical model.
	 * 
	 * @param vdrInfo
	 * @param vdrDetails
	 */
	private static void transformVendorInfo(VendorInfo vdrInfo,
			VendorDetails vdrDetails) {
		CompanyInfo companyInfo = new CompanyInfo();
		Address addr = new Address();
		companyInfo.setAddress(addr);
		vdrDetails.setVendorInfo(companyInfo);
		if(vdrInfo.getAddress1() != null){
			addr.setAddress1(vdrInfo.getAddress1().trim());
		}
		if(vdrInfo.getAddress1() != null){
			addr.setAddress1(vdrInfo.getAddress1().trim());
		}
		if(vdrInfo.getAddress2() != null){
			addr.setAddress2(vdrInfo.getAddress2().trim());
		}
		if(vdrInfo.getAddress3() != null){
			addr.setAddress3(vdrInfo.getAddress3().trim());
		}
		if(vdrInfo.getCity() != null){
			addr.setCity(vdrInfo.getCity().trim());
		}
		if(vdrInfo.getState() != null){
			addr.setState(vdrInfo.getState().trim());
		}
		if(vdrInfo.getCountryCode() != null){
			addr.setCountry(vdrInfo.getCountryCode().trim());
		}
		if(vdrInfo.getZip() != null){
			addr.setZip(vdrInfo.getZip().trim());
		}
		if(vdrInfo.getName() != null){
			addr.setName(vdrInfo.getName().trim());
		}
		if(vdrInfo.getDuns() != null){
			vdrDetails.setDunsNumber(vdrInfo.getDuns().trim());
		}
		if(vdrInfo.getPhone() != null){
			companyInfo.setPhone(vdrInfo.getPhone().trim());
		}
		if(vdrInfo.getWebAddress() != null){
			companyInfo.setWebSite(vdrInfo.getWebAddress().trim());
		}
		if(vdrInfo.getPhone() != null){
			companyInfo.setPhone(vdrInfo.getPhone().trim());
		}
		if(vdrInfo.getEmail() != null){
			companyInfo.setEmail(vdrInfo.getEmail().trim());
		}
	}
	
	/**
	 * Transforms Vendor Invoice persistence model to canonical
	 * model.
	 * 
	 * @param vdrInv
	 * @param vdrDetails
	 */
	private static void transformVendorInvoice(VendorInvoice vdrInv,
			VendorDetails vdrDetails) {
		if(vdrInv.getInvoiceNumber() != null){
			vdrDetails.setInvoiceNumber(vdrInv.getInvoiceNumber().trim());
		}
		if(vdrInv.getPoNumber() != null){
			vdrDetails.setPoNumber(vdrInv.getPoNumber().trim());
		}
		if(vdrInv.getAmount() != null){
			vdrDetails.setAmount(vdrInv.getAmount().toString());
		}
		if(vdrInv.getQuantity() != null){
			vdrDetails.setQuantity(vdrInv.getQuantity().toString());
		}
	}	
	
	/**
	 * Transforms <code>VendorContract</code> persistence model to 
	 * canonical model.
	 * 
	 * @param vdrContract
	 * @param vdrDetails
	 */
	private static void transformVendorContract(VendorContract vdrContract,
			VendorDetails vdrDetails) {
		if(vdrContract.getContractNumber() != null){
			vdrDetails.setContractNumber(vdrContract.getContractNumber().trim());
		}
		if(vdrContract.getFax1() != null && vdrDetails.getVendorInfo() != null){
			vdrDetails.getVendorInfo().setFax(vdrContract.getFax1());
		}
	}	
}
