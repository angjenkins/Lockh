/*
 * @(#)CscPriceTransformation.java			May 18, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.pricing.v1;

import gov.gsa.fas.persistence.pricing.model.EddItemPrice;
import gov.gsa.fas.persistence.pricing.model.NiinItemPrice;
import gov.gsa.fas.pricing.v1.EDDItem;
import gov.gsa.fas.pricing.v1.EDDItemPrice;
import gov.gsa.fas.pricing.v1.NIINItem;
import gov.gsa.fas.pricing.v1.NIINItemPrice;
import gov.gsa.fas.services.messages.v1.EDDItemPriceList;

import java.util.List;

/**
 * <code>CscPriceTransformation</code> transforms persistence model
 * to Service canonical model.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

class CscPriceTransformation {

	/**
	 * Transforms persistence model list of EDD price Items to 
	 * canonical model EDDPriceItems
	 * 
	 * @param 	eddItemPriceList
	 * @return	
	 */
	static EDDItemPriceList transformEddItemList(
			List<EddItemPrice> eddItemPriceList) {
		EDDItemPriceList eddItemPrcListResp = new EDDItemPriceList();
		if(eddItemPriceList == null || eddItemPriceList.size() ==0){
			return eddItemPrcListResp;
		}
		List<EDDItemPrice> eddItemList = eddItemPrcListResp.getEddItemPrice();
		for(EddItemPrice eddItemPers : eddItemPriceList){
			EDDItemPrice eddItemPrice = new EDDItemPrice();
			EDDItem eddItem = new EDDItem();
			eddItem.setManufacturerPartNumber(eddItemPers.getMfrPartNumber());
			eddItem.setPrefix(eddItemPers.getPrefix());
			eddItemPrice.setEddItem(eddItem);
			if(eddItemPers.getMinQuantity() != null){
				eddItemPrice.setMinQuantity(eddItemPers.getMinQuantity());
			}
			if(eddItemPers.getZone() != null){
				eddItemPrice.setZoneNumber(eddItemPers.getZone());
			}
			if(eddItemPers.getSellPrice() != null && 
					eddItemPers.getSellPrice() > 0){
				eddItemPrice.setSellPrice(String.valueOf(eddItemPers.getSellPrice()));
			}
			if(eddItemPers.getCostPrice() != null && 
					eddItemPers.getCostPrice() > 0){
				eddItemPrice.setCostPrice(String.valueOf(eddItemPers.getCostPrice()));
			}
			eddItemList.add(eddItemPrice);
		}
		return eddItemPrcListResp;
	}
	
	/**
	 * Transforms persistence model of NIIN price item to canonical model. 
	 * 
	 * @param niinItemPers
	 * @return
	 */
	static NIINItemPrice transformNiinItem(NiinItemPrice niinItemPers){
		NIINItemPrice niinItemPrice = new NIINItemPrice();
		if(niinItemPers == null){
			return niinItemPrice;
		}
		NIINItem niinItem = new NIINItem();
		if(niinItemPers.getClazz() != null){
			niinItem.setClazz(niinItemPers.getClazz());
		}
		niinItem.setNato(niinItemPers.getNato());
		niinItem.setNiin7(niinItemPers.getNiin7());
		niinItem.setSuffix(niinItemPers.getSuffix());
		niinItemPrice.setNiinItem(niinItem);
		niinItemPrice.setStore(niinItemPers.getStore());
		if(niinItemPers.getSellPrice() != null && 
				niinItemPers.getSellPrice() > 0){
			niinItemPrice.setSellPrice(String.valueOf(niinItemPers.getSellPrice()));
		}
		if(niinItemPers.getCostPrice() != null && 
				niinItemPers.getCostPrice() > 0){
			niinItemPrice.setCostPrice(String.valueOf(niinItemPers.getCostPrice()));
		}
		String description = "";
		if(niinItemPers.getDescription1() != null){
			description = niinItemPers.getDescription1() + " ";
		}
		if(niinItemPers.getDescription2() != null){
			description = description + niinItemPers.getDescription2();
		}
		niinItemPrice.setDescription(description);
		niinItemPrice.setUnitOfIssue(niinItemPers.getUnitOfIssue());
		if(niinItemPers.getUnitWeight() != null && 
				niinItemPers.getUnitWeight() > 0){
			niinItemPrice.setUnitWeight(String.valueOf(niinItemPers.getUnitWeight()));
		}
		if(niinItemPers.getQuantityOnHand() != null && 
				niinItemPers.getQuantityOnHand() != null){
			niinItemPrice.setQuantityOnHand(niinItemPers.getQuantityOnHand());
		}
		if(niinItemPers.getStandardPack() != null){
			niinItemPrice.setStandardPack(niinItemPers.getStandardPack());
		}
		niinItemPrice.setShelfLife(niinItemPers.getShelfLife());
		niinItemPrice.setSubNiin(niinItemPers.getSubNiin());
		return niinItemPrice;
	}
}
