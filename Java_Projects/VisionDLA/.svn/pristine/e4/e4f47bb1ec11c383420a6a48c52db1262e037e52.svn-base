/*
 * @(#)VisionDlaSqlConstants.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

/**
 * <code>VisionDlaSqlConstants</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public interface VisionDlaSqlConstants {
	
	String INSERT_VISIONDLA = "insert into vision_dla (vision_dla_id, document_number, document_nbr_sfx, websdr_number, transet_purpose_code, wsdr_req_id, dla_status_id, created_date) " +
			"values (seq_vision_dla.nextval, ?, ?, ?, ?, ?, ?, ?)";
	String UPDATE_VISIONDLA_STATUS_BY_DLAID = "update vision_dla set dla_status_id=?, updated_date=? where vision_dla_id=?";
	String RETRIEVE_VISIONDLA_ID_BY_STATUS = "select vision_dla_id from vision_dla where wsdr_req_id=? and websdr_number=? and dla_status_id=?";
	String RETRIEVE_VISIONDLA_ID_BY_ID = "select vision_dla_id, wsdr_req_id from vision_dla where vision_dla_id=?";
	String UPDATE_VISIONDLA_VALIDATION_STATUSES = "update vision_dla set document_number_valid=?, dod_aac_valid=?, updated_date=? where vision_dla_id=?";
	String UPDATE_VISIONDLA_SF_TRANSMIT = "update vision_dla set sf_staging_id=?, dla_status_id=?, updated_date=? where vision_dla_id=?";
	String UPDATE_VISIONDLA_CASE_STATUS = "update vision_dla set case_status=?, dla_status_id=?, updated_date=? where vision_dla_id=?";
	String RETRIEVE_AAC_VALID_STATUS = "select dod_aac_valid from vision_dla where vision_dla_id=?";
	
	String INSERT_WSDR_REQ ="insert into wsdr_request (wsdr_request_id, request_xml, xml_filename, created_date) " +
			"values (seq_wsdr_request.nextval, ?, ?, ?)";
	String UPDATE_WSDR_REQ_STATUS="update wsdr_request set request_status=?, updated_date=? " +
			"where wsdr_request_id=?";
	String RETRIEVE_WSDR_REQ_XML = "select request_xml, xml_filename from wsdr_request where wsdr_request_id=?";
	String RETRIEVE_WSDR_REQ_ID = "select wsdr_request_id from wsdr_request where xml_filename=? order by created_date desc";
	String RETRIEVE_WSDR_REQ_IDS_BY_STATUS = "select wsdr_request_id from wsdr_request where request_status=? order by created_date asc";
	String RETRIEVE_WSDR_CREATED_DATE = "select created_date from wsdr_request where wsdr_request_id=?";
	String INSERT_WSDR_ATT_REQUEST ="insert into request_attachment (request_attachment_id, attachment_filename, wsdr_request_id, attachment_status, created_date) " +
			"values (seq_request_attachment.nextval, ?, ?, ?, ?)";
	String RETRIEVE_ATT_WAITING = "select attachment_filename from request_attachment where wsdr_request_id=? and attachment_status='C'";
	String RETRIEVE_ATT_RECEIVED = "select attachment_filename from request_attachment where wsdr_request_id=? and attachment_status='R'";
	String UPDATE_WSDR_REQ_ATT_STATUS = "update request_attachment set attachment_status=?, updated_date = ? where wsdr_request_id=? and attachment_filename=?";
	
	String INSERT_CASE_OUTCOME= "insert into case_outcome (case_outcome_id,vision_dla_id,websdr_number, transet_purpose_code,adj_quantity,adj_unit_code,adj_unit_price,discrepancy_code,disposition_code,action_code,comments,attachment_count,created_date) " +
			"values (seq_case_outcome.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	String INSERT_WSDR_RESP ="insert into wsdr_response (wsdr_response_id, response_xml, xml_filename, vision_dla_id, created_date) " +
			"values (seq_wsdr_response.nextval, ?, ?, ?, ?)";	
	String RETRIEVE_RESP_ID_BY_DLA_ID = "select wsdr_response_id from wsdr_response where vision_dla_id=? order by wsdr_response_id desc";
	String RETRIEVE_WSDR_RESP_XML_BY_DLA_ID = "select response_xml, xml_filename from wsdr_response where vision_dla_id=? order by created_date desc";
	String INSERT_WSDR_ATT_RESP ="insert into response_attachment (response_attachment_id, attachment_filename, wsdr_response_id, attachment_status, created_date) " +
			"values (seq_response_attachment.nextval, ?, ?, ?, ?)";
	String UPDATE_WSDR_RESP_STATUS = "update wsdr_response set response_status=?, updated_date = ? where vision_dla_id=?";	
	String UPDATE_WSDR_ATT_RESP_STATUS = "update response_attachment set attachment_status=?, updated_date = ? where wsdr_response_id=? and attachment_filename=?";
	String RETRIEVE_RESP_ATT_NOT_SENT = "select attachment_filename from response_attachment where wsdr_response_id=? and attachment_status<>'S'";
	
	String RETRIEVE_EMAIL_NOTIFICATION = "select email_notification_id, notification_type, to_address,cc_address,from_address,email_subject,email_content from email_notification where email_notification_id=?";
}
