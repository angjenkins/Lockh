/*
 * @(#)TransactionSqlConstants.java			Jun 14, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.orderdiscrepancy.service;

/**
 * <code>TransactionSqlConstants</code> defines the queries
 * related to Order discrepancy transactions persistence.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public interface TransactionSqlConstants {

	String ZKP_CREATE = 
		"INSERT INTO zkp (zkp_key,rod_key,zkp_pnd_flg,zkp_hdr,zkp_tch,zkp_req,zkp_sfx,zkp_rpt_typ,zkp_tim) " + 
			"VALUES (?,?,?,?,?,?,?,?,?)";
	
	String FINANCE305_CREATE = 
		"INSERT INTO fin_305 (fin_305_key,rod_key,fin_305_pnd_flg,fin_305_file_id,fin_305_record_id,fin_305_doc_id,fin_305_rtg_id,fin_305_com_ctr_cd,fin_305_nsn,fin_305_unt,fin_305_qty,fin_305_req,fin_305_sfx,fin_305_sup_add,fin_305_signal,fin_305_fund,fin_305_dist,fin_305_proj,fin_305_pri,fin_305_cycle_dte,fin_305_mode_of_ship,fin_305_ext_sell_val,fin_305_sell_price,fin_305_cost_price,fin_305_td_ser_8_ind,fin_305_agy_bur_cde,fin_305_state_cde,fin_305_city_cde,fin_305_exp_dom_ind,fin_305_t_d_cde,fin_305_manif_po_nbr,fin_305_boac,fin_305_region,fin_305_advice_code,fas_po_nbr) " + 
		"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String RESHIPMENT_CREATE =
		"INSERT INTO a15 (a15_key,rod_key,a15_pnd_flg,a15_doc_id,a15_doc_id_ext,a15_ric_to,a15_m_s,a15_nsn,a15_unt,a15_qty,a15_req,a15_sup_add,a15_signal,a15_fund,a15_dist,a15_proj,a15_pri,a15_rdd,a15_advice_cde,a15_td,a15_routing_cde_reg,a15_routing_cde,a15_routing_cde_inq) " + 
			"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String MATERIAL_RETURN_CREATE=
		"INSERT INTO zau (zau_key,rod_key,zau_pnd_flg,zau_doc_id,zau_nsn,zau_unt,zau_qty,zau_req,zau_sfx,zau_sup_add,zau_signal,zau_fund_cde,zau_ric_to,zau_extend_value,zau_inq_cde,zau_liability,zau_discrep_reg) " +
			"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String ZLA_CREATE = 
		"INSERT INTO zla (zla_key,rod_key,zla_pnd_flg,zla_doc_id,zla_ric,zla_excep_bill_to_ind,zla_nsn,zla_unt,zla_adj_qty,zla_req,zla_sfx,zla_sup_add,zla_signal,zla_fund_cde,zla_dist_cde,zla_project_cde,zla_sell_price,zla_chargeback_ind,zla_discrepancy_region,zla_original_td_cde,zla_imq,zla_item_mgr,zla_priority_cde,zla_no_of_cards,zla_card_no_1,zla_original_doc_id,zla_date_shipped,zla_cost_price,zla_st_cd,zla_city_cd,zla_agency_bureau_cd,zla_boac,zla_gbl_po_nr,zla_action_td_cd_1,zla_action_td_cd_2,zla_export_domestic_cd,zla_date_avail,zla_inquiry_cde,zla_advice_cde,zla_card_no_2) " +
			"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String ZSA_CREATE = 
		"INSERT INTO zsa (zsa_key,rod_key,zsa_pnd_flg,zsa_hdr,zsa_nsn,zsa_unt,zsa_adj_qty,zsa_req,zsa_sfx,zsa_dte_avail,zsa_cost_price,zsa_sell_price,zsa_chg_ind,zsa_dis_rgn,zsa_inq_cde,zsa_acn_cde,zsa_adv_cde) " +
			"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String VENDOR_OFFSET_CREATE = 
		"INSERT INTO vendor_offset (vendor_offset_key,rod_key,vendor_offset_po_nbr,vendor_offset_cont_nbr,vendor_offset_amount,vendor_offset_tech_cde,vendor_offset_aco_name,vendor_offset_prb_typ) " +
			"VALUES (?,?,?,?,?,?,?,?)";
	
	String ZKP_RETRIEVE = "SELECT zkp_key,rod_key,zkp_pnd_flg,zkp_hdr,zkp_tch,zkp_req,zkp_sfx,zkp_rpt_typ,zkp_tim FROM zkp where zkp_req=?";
	
	String FINANCE305_RETRIEVE = "SELECT fin_305_key,rod_key,fin_305_pnd_flg,fin_305_file_id,fin_305_record_id,fin_305_doc_id,fin_305_rtg_id,fin_305_com_ctr_cd,fin_305_nsn,fin_305_unt,fin_305_qty,fin_305_req,fin_305_sfx,fin_305_sup_add,fin_305_signal,fin_305_fund,fin_305_dist,fin_305_proj,fin_305_pri,fin_305_cycle_dte,fin_305_mode_of_ship,fin_305_ext_sell_val,fin_305_sell_price,fin_305_cost_price,fin_305_td_ser_8_ind,fin_305_agy_bur_cde,fin_305_state_cde,fin_305_city_cde,fin_305_exp_dom_ind,fin_305_t_d_cde,fin_305_manif_po_nbr,fin_305_boac,fin_305_region,fin_305_advice_code " +
			"FROM fin_305 where fin_305_req=?";
	
	String RESHIPMENT_RETRIEVE = "SELECT a15_key,rod_key,a15_pnd_flg,a15_doc_id,a15_doc_id_ext,a15_ric_to,a15_m_s,a15_nsn,a15_unt,a15_qty,a15_req,a15_sup_add,a15_signal,a15_fund,a15_dist,a15_proj,a15_pri,a15_rdd,a15_advice_cde,a15_td,a15_routing_cde_reg,a15_routing_cde,a15_routing_cde_inq " + 
						"FROM a15 WHERE a15_req=?";
	
	String MATERIAL_RETURN_RETRIEVE = "SELECT zau_key,rod_key,zau_pnd_flg,zau_doc_id,zau_nsn,zau_unt,zau_qty,zau_req,zau_sfx,zau_sup_add,zau_signal,zau_fund_cde,zau_ric_to,zau_extend_value,zau_inq_cde,zau_liability,zau_discrep_reg " + 
			"FROM zau where zau_req=?";
	
	String ZLA_RETRIEVE = "SELECT zla_key,rod_key,zla_pnd_flg,zla_doc_id,zla_ric,zla_excep_bill_to_ind,zla_nsn,zla_unt,zla_adj_qty,zla_req,zla_sfx,zla_sup_add,zla_signal,zla_fund_cde,zla_dist_cde,zla_project_cde,zla_sell_price,zla_chargeback_ind,zla_discrepancy_region,zla_original_td_cde,zla_imq,zla_item_mgr,zla_priority_cde,zla_no_of_cards,zla_card_no_1,zla_original_doc_id,zla_date_shipped,zla_cost_price,zla_st_cd,zla_city_cd,zla_agency_bureau_cd,zla_boac,zla_gbl_po_nr,zla_action_td_cd_1,zla_action_td_cd_2,zla_export_domestic_cd,zla_date_avail,zla_inquiry_cde,zla_advice_cde,zla_card_no_2 " +
			"FROM zla where zla_req=?";
	
	String ZSA_RETRIEVE = "SELECT zsa_key,rod_key,zsa_pnd_flg,zsa_hdr,zsa_nsn,zsa_unt,zsa_adj_qty,zsa_req,zsa_sfx,zsa_dte_avail,zsa_cost_price,zsa_sell_price,zsa_chg_ind,zsa_dis_rgn,zsa_inq_cde,zsa_acn_cde,zsa_adv_cde " +
			"FROM zsa where zsa_req=?";
	
	String VENDOR_OFFSET_RETRIEVE = "SELECT vendor_offset_key,rod_key,vendor_offset_po_nbr,vendor_offset_cont_nbr,vendor_offset_amount,vendor_offset_tech_cde,vendor_offset_aco_name,vendor_offset_prb_typ " + 
			"FROM vendor_offset where vendor_offset_po_nbr=?";
	
	String ZKP_DELETE = "delete from zkp";
}
