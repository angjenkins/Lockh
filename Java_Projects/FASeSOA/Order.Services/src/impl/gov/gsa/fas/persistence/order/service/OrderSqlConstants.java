/*
 * @(#)OrderSqlConstants.java			Mar 1, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.order.service;

/**
 * <code>OrderSqlConstants</code> defines Order related
 * SQL queries.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface OrderSqlConstants {
	
	String RETRIEVE_ORDER_SESSION = "{?=call up_ncsc_search_newsession_op (?)}";

	String ORDER_HISTORY =
			"SELECT HIST_BY_ORD_NR.HIST_STORE," +
			" HIST_BY_ORD_NR.HIST_ORDER_NR," +
			"HIST_BY_ORD_NR.HIST_NIIN," +
			"HIST_BY_ORD_NR.HIST_QTY," +
			"HIST_BY_ORD_NR.HIST_UI," +
			"HIST_BY_ORD_NR.HIST_DESC," +
			"HIST_BY_ORD_NR.HIST_SELL_PRICE," +
			"HIST_BY_ORD_NR.HIST_BACKORDER," +
			"HIST_BY_ORD_NR.HIST_EDD_ID_PRFX," +
			"HIST_BY_ORD_NR.HIST_MFR_PART_NO," +
			"HIST_BY_ORD_NR.HIST_CONTROL_NR," +
			"HIST_BY_ORD_NR.HIST_DOC_NO," +
			"HIST_BY_ORD_NR.HIST_REST_DOC_SUFF," +
			"HIST_BY_ORD_NR.HIST_WEB_ORDER_NR," +
			"HIST_BY_ORD_NR.HIST_COST_PRICE ," +
			"HIST_BY_ORD_NR.HIST_MANIFEST_NUM ," +
			"HIST_BY_ORD_NR.HIST_DEPOT ," +
			"HIST_BY_ORD_NR.HIST_WGHT ," +
			"HIST_BY_ORD_NR.HIST_RCPT_DATE_ORD ," +
			"HIST_BY_ORD_NR.HIST_RCPT_DATE_RCD ," +
			"HIST_BY_ORD_NR.HIST_SALE_AAC ," +
			"HIST_BY_ORD_NR.HIST_SALE_ACCESS ," +
			"HIST_BY_ORD_NR.HIST_SALE_PICKUP ," +
			"HIST_BY_ORD_NR.HIST_CARRIER ," +
			"HIST_BY_ORD_NR.HIST_GBL ," +
			"HIST_BY_ORD_NR.HIST_SHIP_MODE ," +
			"HIST_BY_ORD_NR.HIST_TCN ," +
			"HIST_BY_ORD_NR.HIST_TRACKING_NR ," +
			"HIST_BY_ORD_NR.HIST_SHIP_DATE ," +
			"HIST_BY_ORD_NR.HIST_APPROP_NO ," +
			"HIST_BY_ORD_NR.HIST_PROJ_CODE ," +
			"HIST_BY_ORD_NR.HIST_PRIO_CODE " +
			"FROM HIST_BY_ORD_NR " +
			"WHERE ( HIST_BY_ORD_NR.HIST_ORDER_NR = ? ) AND " +
			"(( HIST_BY_ORD_NR.HIST_EDD_ID_PRFX <> '' ) OR " +
			"( HIST_BY_ORD_NR.HIST_STORE in ('FV','FW','PG','BN','CI','SC','FT','AW','LP','PL')) )";
	
	String ORDER_SHIP_ADDRESS = 
		"SELECT  SHPTO_BY_ORDER_NR.SHPTO_STORE , " +
		"SHPTO_BY_ORDER_NR.SHPTO_TICKET ," +
		" SHPTO_BY_ORDER_NR.SHPTO_ORDER_NR ," +
		" SHPTO_BY_ORDER_NR.SHPTO_TEXT_1 ," +
		" SHPTO_BY_ORDER_NR.SHPTO_TEXT_2 , " +
		"SHPTO_BY_ORDER_NR.SHPTO_TEXT_3 , " +
		"SHPTO_BY_ORDER_NR.SHPTO_TEXT_4 , " +
		"SHPTO_BY_ORDER_NR.SHPTO_TEXT_5 ," +
		"SHPTO_BY_ORDER_NR.SHPTO_CITY_NAME , " +
		"SHPTO_BY_ORDER_NR.SHPTO_STATE_ABV , " +
		"SHPTO_BY_ORDER_NR.SHPTO_ZIP , " +
		"SHPTO_BY_ORDER_NR.SHPTO_COUNTRY , " +
		"SHPTO_BY_ORDER_NR.SHPTO_ZIP_PLUS4  " +
		"FROM SALE_BY_ORD_NR , SHPTO_BY_ORDER_NR " +
		"WHERE ( SALE_BY_ORD_NR.SALE_ORDER_NR = SHPTO_BY_ORDER_NR.SHPTO_ORDER_NR ) and " +
		"( SALE_BY_ORD_NR.SALE_STORE = SHPTO_BY_ORDER_NR.SHPTO_STORE ) and " +
		"( ( SALE_BY_ORD_NR.SALE_BACKORDER <> 'Y' ) And  " +
		"( SALE_BY_ORD_NR.SALE_ORDER_NR = ? ) )  ";
	
	String ORDER_SALE = 
		"SELECT SALE_BY_ORD_NR.SALE_STORE," + 
		"SALE_BY_ORD_NR.SALE_DATE," +
		"SALE_BY_ORD_NR.SALE_GREG_DATE," +
		"SALE_BY_ORD_NR.SALE_TICKET," +
		"SALE_BY_ORD_NR.SALE_ORDER_NR," +
		"SALE_BY_ORD_NR.SALE_TELEPHONE," +
		"SALE_BY_ORD_NR.SALE_FAX_NR," +
		"SALE_BY_ORD_NR.SALE_TL_SELL," +
		"SALE_BY_ORD_NR.SALE_TL_LINES,"+
		"SALE_BY_ORD_NR.SALE_TL_EDD_LINES," +
		"SALE_BY_ORD_NR.SALE_AAC,"+
		"SALE_BY_ORD_NR.SALE_ACCESS,"+
		"SALE_BY_ORD_NR.SALE_ATTENTION,"+
		"SALE_BY_ORD_NR.SALE_EMAIL,"+
		"SALE_BY_ORD_NR.SALE_INTNL_TEL,"+
		"SALE_BY_ORD_NR.SALE_NAME," +
		"SALE_BY_ORD_NR.SALE_LIID," +
		"SALE_WEB_ORDER_NR FROM SALE_BY_ORD_NR " +
		"WHERE SALE_BY_ORD_NR.SALE_ORDER_NR = ? and SALE_BACKORDER <> 'Y'";
	
	String GGS_ORDER_SALE =
		"SELECT SALE_BY_WEB_OR_NR.SALE_ORDER_NR, " +   
		"SALE_BY_WEB_OR_NR.SALE_WEB_ORDER_NR, " +   
		"SALE_BY_WEB_OR_NR.SALE_WEB_ORD_DATE, " +  
		"SALE_BY_WEB_OR_NR.SALE_AAC, " +  
		"SALE_BY_WEB_OR_NR.SALE_ACCESS, " +
		"SALE_BY_WEB_OR_NR.SALE_LIID " + 
		"FROM SALE_BY_WEB_OR_NR " + 
		"WHERE ( SALE_BY_WEB_OR_NR.SALE_BACKORDER <> 'Y' ) AND " + 
		"(SALE_BY_WEB_OR_NR.SALE_WEB_ORDER_NR = ? ) " + 
		"and SALE_BY_WEB_OR_NR.SALE_INPUT_SOURCE in('SUP','ADV','MCS')";  


	String GECO_ORDER_SALE=
		"SELECT SALE_BY_POS_OR_NR.SALE_STORE, " +
		"SALE_BY_POS_OR_NR.SALE_GREG_DATE, " +
		"SALE_BY_POS_OR_NR.SALE_TICKET, " +
		"SALE_BY_POS_OR_NR.SALE_ORDER_NR, " +
		"SALE_BY_POS_OR_NR.SALE_POS_ORDER_NR, " +
		"SALE_BY_POS_OR_NR.SALE_POS_ORD_DATE, " +
		"SALE_BY_POS_OR_NR.SALE_AAC, " + 
		"SALE_BY_POS_OR_NR.SALE_ACCESS, " + 
		"SALE_BY_POS_OR_NR.SALE_LIID " +
		"FROM SALE_BY_POS_OR_NR " + 
		"WHERE ( SALE_BY_POS_OR_NR.SALE_BACKORDER <> 'Y' ) AND " + 
		"(SALE_BY_POS_OR_NR.SALE_POS_ORDER_NR = ?) " + 
		"and SALE_BY_POS_OR_NR.SALE_INPUT_SOURCE in ('POS')";
	
//	String VDR_CONTRACT_BY_PO = 
//		"SELECT  d451_cont_no, d451_f_o_cont_no FROM D40051M1 " +   
//		"WHERE d451_po_no = ?";
//	
//	String VDR_FAX_BY_CONTRACT = 
//		"SELECT D402_FAX1,D402_FAX2 FROM D40005M1  where D402_CONT_NO  = ?";
	
	String VDR_CONTRACT_FAX_BY_PO = 
		"select distinct d451m1.d451_po_no, d451m1.d451_cont_no, d451m1.d451_f_o_cont_no, "+   
		"d45m1.D402_FAX1, d45m1.D402_FAX2 from D40005M1 d45m1, D40051M1 d451m1 " + 
		"where d45m1.D402_CONT_NO=d451m1.D451_CONT_NO and d451m1.d451_po_no=?";
	
	String PO_BY_WEB_ORDER_NO = 
		"SELECT stif_po_no FROM stif_by_web_part WHERE " +
		"stif_web_ord_nr= ? and stif_mfr_part_no= ? and stif_edd_id_prfx= ?";
	
	String CANCEL_ORDER = "INSERT INTO ac1 (ac1_key,ac1_dic,ac1_ric_to,ac1_nsn,ac1_unt,ac1_qty,ac1_rod_req,ac1_rod_sfx,ac1_supp_adr,ac1_dist_cde,ac1_prj_cde,ac1_pri,ac1_prep_dte) " +  
		"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
}
