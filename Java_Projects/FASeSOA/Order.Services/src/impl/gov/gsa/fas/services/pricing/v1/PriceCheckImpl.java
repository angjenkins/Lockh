/*
 * @(#)PriceCheckImpl.java			May 11, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.pricing.v1;

import gov.gsa.fas.persistence.pricing.model.EddItemPrice;
import gov.gsa.fas.persistence.pricing.model.NiinItemPrice;
import gov.gsa.fas.persistence.pricing.service.PriceCheckPersistence;
import gov.gsa.fas.persistence.pricing.service.PricePersistenceException;
import gov.gsa.fas.pricing.v1.EDDItem;
import gov.gsa.fas.pricing.v1.EDDItemPrice;
import gov.gsa.fas.pricing.v1.NIINItem;
import gov.gsa.fas.pricing.v1.NIINItemPrice;
import gov.gsa.fas.services.messages.v1.EDDItemPriceList;
import gov.gsa.fas.services.messages.v1.NIINItemPriceRequest;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.wsf.spi.annotation.WebContext;

/**
 * <code>PriceCheckImpl</code> provides implementation for PriceCheck service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see    	gov.gsa.fas.services.pricing.v1.PriceCheck 
 */

@WebContext(contextRoot = "/order.services", urlPattern = "/PriceCheck")
@WebService(endpointInterface = "gov.gsa.fas.services.pricing.v1.PriceCheck", portName = "PriceCheck", targetNamespace = "http://fas.gsa.gov/services/Pricing/v1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(PriceCheck.class)
@Stateless

public class PriceCheckImpl implements PriceCheck {

	private static final Logger logger = Logger.getLogger(PriceCheckImpl.class.getName());
	private InitialContext ctx;
	
	@Override
	public EDDItemPriceList getEddItemPrice(EDDItem getEddPriceRequest)
			throws ServiceFault {
		if(getEddPriceRequest == null || getEddPriceRequest.getPrefix() == null ||
				getEddPriceRequest.getPrefix().isEmpty() || getEddPriceRequest.getManufacturerPartNumber()==null ||
				getEddPriceRequest.getManufacturerPartNumber().isEmpty()){
			logger.error("getEddItemPrice(): EDD Prefix or Manufacture part number is null or empty");
			throw new ServiceFault("", createFault("E", "EDD Prefix and Manufacture part number required"));
		}
		String eddPrefix = getEddPriceRequest.getPrefix().trim();
		String mfrPartNumber = getEddPriceRequest.getManufacturerPartNumber().trim();
		logger.info("getEddItemPrice(): Getting EDD Price items for prefix->" + eddPrefix + 
				", and Manufacture Part number->" + mfrPartNumber);
		EDDItemPriceList eddItemListResp = new EDDItemPriceList();
		try {
			PriceCheckPersistence priceCheckPersistence = getPriceCheckPersistenceLocal();
			List<EddItemPrice> eddItemPriceList = priceCheckPersistence.retrieveEddItemPrice(
					eddPrefix, mfrPartNumber);
			if(eddItemPriceList == null){ //Throw Service Fault if no records found
				logger.error("getEddItemPrice(): No matching records found");
				throw new ServiceFault("", createFault("E", "No matching records found"));
			}
			eddItemListResp =  CscPriceTransformation.transformEddItemList(eddItemPriceList);
		}catch(PricePersistenceException ppe){
			logger.error("getEddItemPrice(): System Failure: Failed to get EDD price items for Prefix->" + eddPrefix +
					", and Manufacture Part number->" + mfrPartNumber);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get EDD price items-" + ppe.getMessage()));			
		}
		return eddItemListResp;		
	}

	@Override
	public NIINItemPrice getNiinItemPrice(NIINItemPriceRequest getNiinPriceRequest)
			throws ServiceFault {
		if(getNiinPriceRequest == null || getNiinPriceRequest.getNiin7() == null ||
				getNiinPriceRequest.getNiin7().isEmpty() || getNiinPriceRequest.getStore() == null ||
				getNiinPriceRequest.getStore().isEmpty()) {
			logger.error("getNiinItemPrice(): NIIN7 or Store is null or empty");
			throw new ServiceFault("", createFault("E", "NIIN7 and Store values required"));
		}
		String niin7 = getNiinPriceRequest.getNiin7().trim();
		String store = getNiinPriceRequest.getStore().trim();
		logger.info("getNiinItemPrice(): Getting NIIN Price items for NIIN7->" + niin7 + 
				", and Store->" + store);
		NIINItemPrice niinPriceItem = new NIINItemPrice();
		try {
			PriceCheckPersistence priceCheckPersistence = getPriceCheckPersistenceLocal();
			NiinItemPrice niinItemPers = priceCheckPersistence.retrieveNiinItemPrice(niin7, store);
			if(niinItemPers == null){ //Throw Service Fault if no records found 
				logger.error("getNiinItemPrice(): No matching records found");
				throw new ServiceFault("", createFault("E", "No matching records found"));
			}
			niinPriceItem =  CscPriceTransformation.transformNiinItem(niinItemPers);
		}catch(PricePersistenceException ppe){
			logger.error("getNiinItemPrice(): System Failure: Failed to get NIIN price items for Niin7->" + niin7 +
					", and Store->" + store);
			throw new ServiceFault("", createFault("E", "System Failure: Failed to get NIIN/NSN price items-" + ppe.getMessage()));			
		}
		return niinPriceItem;
	}
	
	/**
	 * Get the local EJB of <code>PriceCheckPersistence</code> object.
	 * 
	 * @return	
	 * @throws 	NamingException
	 */
	private PriceCheckPersistence getPriceCheckPersistenceLocal() throws ServiceFault{
		String priceCheckPersistenceJNDI = "enterprise.services/PriceCheckPersistenceImpl/local";
  	Object robj = null;
  	try {
			if( ctx == null ){
			  ctx=new InitialContext();
			}
			robj = ctx.lookup( priceCheckPersistenceJNDI);
		} catch (NamingException e) {
			logger.error("getPriceChekPersistenceLocal(): System Failure: Failed to get PriceCheckPersistence local EJB", e);
			ServiceFault srvcFault = new ServiceFault("System Failure: Enterprise Service error-NamingException", null);
			throw srvcFault;
		} 
  	logger.info("getPriceChekPersistenceLocal(): Class name->" + robj.getClass().getName());
  	return (PriceCheckPersistence)robj;		
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
	
	////////////////////////////////////////////////////////////////////
	//////////// Test Service //////////////////////////////////////////
	
//	private EDDItemPriceList createEDDItemPriceList(){
//		EDDItemPriceList eddPriceListObj = new EDDItemPriceList();
//		List<EDDItemPrice> itemList = eddPriceListObj.getEddItemPrice();
//		EDDItemPrice item1 = new EDDItemPrice();
//		item1.setEddItem(createEDDItem("SATA2.5-160", "CP1A"));
//		item1.setCostPrice("62.56");
//		item1.setSellPrice("68.82");
//		item1.setZoneNumber(0);
//		item1.setMinQuantity(101);
//		itemList.add(item1);
//		EDDItemPrice item2 = new EDDItemPrice();
//		item2.setEddItem(createEDDItem("SATA2.5-160", "CP1A"));
//		item2.setCostPrice("63.22");
//		item2.setSellPrice("69.54");
//		item2.setZoneNumber(0);
//		item2.setMinQuantity(1);
//		itemList.add(item2);
//		return eddPriceListObj;
//	}
//	
//	private EDDItem createEDDItem(String partNo, String prefix){
//		EDDItem eddItem = new EDDItem();
//		eddItem.setManufacturerPartNumber(partNo);
//		eddItem.setPrefix(prefix);
//		return eddItem;
//	}
//
//	private NIINItemPrice createNiinItemPrice(){
//		NIINItemPrice niinItemPrc = new NIINItemPrice();
//		niinItemPrc.setNiinItem(createNiinItem(8415, "01", "4920179", ""));
//		niinItemPrc.setStore("SC");
//		niinItemPrc.setSellPrice("11.49");
//		niinItemPrc.setCostPrice("8.09");
//		niinItemPrc.setDescription("DISPOSABLE NITRILE GLOVES" + ", SIZE MEDIUM 100/BX");
//		niinItemPrc.setUnitOfIssue("BX");
//		niinItemPrc.setUnitWeight("2");
//		niinItemPrc.setQuantityOnHand(2975);
//		niinItemPrc.setStandardPack(20);
//		niinItemPrc.setShelfLife("0");
//		niinItemPrc.setSubNiin("");
//		return niinItemPrc;
//	}
//	
//	private NIINItem createNiinItem(int class1, String nato, String niin7, String suffix){
//		NIINItem niinItem = new NIINItem();
//		niinItem.setClazz(class1);
//		niinItem.setNato(nato);
//		niinItem.setNiin7(niin7);
//		niinItem.setSuffix(suffix);
//		return niinItem;
//	}
}
