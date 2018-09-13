/*
 * @(#)PriceSqlConstants.java			May 17, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.pricing.service;

/**
 * <code>PriceSqlConstants</code> defines Pricing related
 * SQL queries
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface PriceSqlConstants {
	
	String EDD_PRICE_CHECK = 
		"SELECT PRICE.PRI_EDD_ID_PRFX," +   
    "PRICE.PRI_MFR_PART_NO," +   
    "PRICE.PRI_ZONE," +    
    "PRICE.PRI_COST_PRICE," +    
    "PRICE.PRI_SELL_PRICE," +  
		"PRICE.PRI_MN_PRI_BR_QTY " + 
    "FROM PRICE  WHERE (PRICE.PRI_EDD_ID_PRFX = ?) AND " +  
    "(PRICE.PRI_MFR_PART_NO = ?) ";
	
	String NIIN_PRICE_CHECK=
		"SELECT INV_BY_NIIN_7.INV_STORE," +    
    "INV_BY_NIIN_7.INV_NATO," +    
    "INV_BY_NIIN_7.INV_CLASS," +    
    "INV_BY_NIIN_7.INV_FSC," +    
    "INV_BY_NIIN_7.INV_NIIN_7," +    
    "INV_BY_NIIN_7.INV_SUFFIX," +    
    "INV_BY_NIIN_7.INV_UNIT_ISSUE," +    
    "INV_BY_NIIN_7.INV_DEPOT," +    
    "INV_BY_NIIN_7.INV_DESC1," +    
    "INV_BY_NIIN_7.INV_DESC2," +   
    "INV_BY_NIIN_7.INV_SHELF," +    
    "INV_BY_NIIN_7.INV_WGHT," +   
    "INV_BY_NIIN_7.INV_SELL_PRICE," +    
    "INV_BY_NIIN_7.INV_QTY_ON_HAND," +    
    "INV_BY_NIIN_7.INV_QTY_ON_ORDER," +    
    "INV_BY_NIIN_7.INV_SP," +    
    "INV_BY_NIIN_7.INV_SUB_NIIN," +    
    "INV_BY_NIIN_7.INV_COMM_CTR," +    
    "INV_BY_NIIN_7.INV_COST_PRICE " +  
    "FROM INV_BY_NIIN_7  where INV_NIIN_7 = ? " + 
    "and INV_STORE =?";
}
