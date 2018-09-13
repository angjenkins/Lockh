/*
 * @(#)VendorSqlConstants.java			Aug 20, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.vendor.service;

/**
 * <code>VendorSqlConstants</code> defines vendor related SQL
 * queries.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface VendorSqlConstants {

	String VDR_ADDRESS_BY_DUNS = "select D410_ADRS1,D410_ADRS2,D410_ADRS3," + 
		"D410_CITY_NAME,D410_ZIP,D410_ST,D410_CNTRY_CD,D410_EMAIL_ADRS,D410_INET_ADRS," + 
		"D410_NAME_AS,D410_PHONE_NO,D410_STATUS,D410_CEC from D405M5S1 where D410_CEC=?";
		
	String VDR_INVOICE_BY_PO = "SELECT D459_INVOICE_NO, D459_PAID_QTY," +      
      "D459_PAID_AMT,D459_PO_NO FROM D40051M9 WHERE D459_PO_NO = ?";
	
	String VDR_CONTRACT_FAX_BY_PO = 
		"select distinct d451m1.d451_po_no, d451m1.d451_cont_no, d451m1.d451_f_o_cont_no, "+   
		"d45m1.D402_FAX1, d45m1.D402_FAX2 from D40005M1 d45m1, D40051M1 d451m1 " + 
		"where d45m1.D402_CONT_NO=d451m1.D451_CONT_NO and d451m1.d451_po_no=?";
}
