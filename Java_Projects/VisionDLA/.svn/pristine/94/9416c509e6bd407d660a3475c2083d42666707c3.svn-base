-- visiondla_create.sql
--
--    NAME
--      visiondla_create.sql - Create tables for VISION DLA application.
--
--    DESCRIPTION
--      This script creates tables, associated constraints and indexes for 
--		Vision DLA project.
--
--    CREATED by Prasad Nerayanuru - 08/18/2013
--
--    MODIFIED   (MM/DD/YY)		NAME
--
--
-- ********************************************************************

-- Create the VISION_DLA_STATUS table
-- VISION_DLA table has a foreign key to this table.
-- This is static look up table for vision dla processing status types

CREATE TABLE VISION_DLA_STATUS
    ( dla_status_id	NUMBER (2) 
       			CONSTRAINT  dla_status_id_nn NOT NULL 
    , dla_status   	VARCHAR2 (48)
    			CONSTRAINT  dla_status_nn NOT NULL
    , dla_status_desc	VARCHAR2 (128) 
    , active_status		CHAR (1) DEFAULT 'Y'

    );
    
CREATE UNIQUE INDEX dla_status_id_pk_idx
ON vision_dla_status (dla_status_id);

CREATE UNIQUE INDEX dla_status_uq_idx
ON vision_dla_status (dla_status);

ALTER TABLE vision_dla_status
ADD ( CONSTRAINT dla_status_id_pk
       		 PRIMARY KEY (dla_status_id)
		, CONSTRAINT dla_status_uq UNIQUE(dla_status)
    , CONSTRAINT dla_status_active_ck
    		CHECK (active_status IN ('Y', 'N'))
    		
    ) ;

-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the WSDR_REQUEST table
-- REQUEST_ATTACHMENT, VISION_DLA tables have a foreign key to this table.
-- This table holds vision dla request XML data for each vision dla request

CREATE TABLE WSDR_REQUEST
    ( wsdr_request_id	NUMBER (10) 
       			CONSTRAINT wsdr_request_id_nn NOT NULL
    , request_xml	CLOB 
    				CONSTRAINT request_xml_nn NOT NULL
    , xml_filename	VARCHAR2(128) 
    				CONSTRAINT req_xml_filename_nn NOT NULL    				 
    , request_status CHAR (1) DEFAULT 'C'
    				CONSTRAINT request_status_nn NOT NULL
    , created_date	DATE	     
    			CONSTRAINT   request_created_date_nn NOT NULL     
    , updated_date	DATE
    
    );

CREATE UNIQUE INDEX wsdr_req_id_pk_idx
ON WSDR_REQUEST (wsdr_request_id);

ALTER TABLE WSDR_REQUEST
ADD ( CONSTRAINT wsdr_req_id_pk
       		 PRIMARY KEY (wsdr_request_id)
    , CONSTRAINT request_status_ck
    		CHECK (request_status IN ('C', 'R', 'S', 'E'))        	         		 
    ) ;
    
CREATE SEQUENCE seq_wsdr_request
 START WITH     1001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the VISION_DLA table
-- Refers VISION_DLA_STATUS.DLA_STATUS_ID, WSDR_REQUEST.WSDR_REQUET_ID, CASE_OUTCOME.CASE_OUTCOME_ID
-- WSDR_RESPONSE, CASE_OUTCOME tables have a foreign keys to this table.
-- This table holds vision dla data for each vision dla request

CREATE TABLE VISION_DLA
    ( vision_dla_id	NUMBER (10) 
       			CONSTRAINT vision_dla_id_nn NOT NULL
    , document_number	VARCHAR2(14) 
    , document_nbr_sfx VARCHAR2(2) 
    , websdr_number	VARCHAR2 (12)  
    , transet_purpose_code	VARCHAR2 (2) 
    , wsdr_req_id NUMBER(10) 
    				CONSTRAINT wsdr_req_id_dla_nn NOT NULL    
    , dla_status_id	NUMBER (2) 
    			CONSTRAINT dla_status_id_fk_nn NOT NULL
    , document_number_valid CHAR(1)
    , dod_aac_valid CHAR(1)
    , sf_staging_id VARCHAR2(32)
    , case_status	VARCHAR2(64)
    , created_date	DATE	     
    			CONSTRAINT   vision_dla_created_date_nn NOT NULL     
    , updated_date	DATE
    
    );

CREATE UNIQUE INDEX vision_dla_id_pk_idx
ON VISION_DLA (vision_dla_id);

ALTER TABLE VISION_DLA
ADD ( CONSTRAINT vision_dla_id_pk
       		 PRIMARY KEY (vision_dla_id)
    , CONSTRAINT dla_status_id_fk
            	 FOREIGN KEY (dla_status_id)
          	  REFERENCES vision_dla_status(dla_status_id)
          	  ON DELETE SET NULL 
    , CONSTRAINT wsdr_req_id_fk
            	 FOREIGN KEY (wsdr_req_id)
          	  REFERENCES wsdr_request(wsdr_request_id)
          	  ON DELETE CASCADE
		,CONSTRAINT document_number_valid_ck
    		CHECK (document_number_valid IN ('Y', 'N'))
		,CONSTRAINT dod_aac_valid_ck
    		CHECK (dod_aac_valid IN ('Y', 'N'))     		          	             	         		 
    ) ;
    
CREATE SEQUENCE seq_vision_dla
 START WITH     10001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO


-- ********************************************************************
-- Create the REQUEST_ATTACHMENT table
-- Refers WSDR_REQUEST.WSDR_REQUEST_ID
-- This table holds vision dla request attachments information

CREATE TABLE REQUEST_ATTACHMENT
    ( request_attachment_id	NUMBER (10) 
       			CONSTRAINT request_att_id_nn NOT NULL
    , attachment_filename	VARCHAR2(128) 
    				CONSTRAINT req_att_filename_nn NOT NULL    				 
    , wsdr_request_id NUMBER(10) 
    				CONSTRAINT wsdr_request_id_att_nn NOT NULL
    , attachment_status CHAR (1) DEFAULT 'C'
    				CONSTRAINT req_attachment_status_nn NOT NULL
    , created_date	DATE	     
    			CONSTRAINT   req_att_created_date_nn NOT NULL     
    , updated_date	DATE
    
    );

CREATE UNIQUE INDEX request_attachment_id_pk_idx
ON REQUEST_ATTACHMENT (request_attachment_id);

ALTER TABLE REQUEST_ATTACHMENT
ADD ( CONSTRAINT request_attachment_id_pk
       		 PRIMARY KEY (request_attachment_id)
    , CONSTRAINT wsdr_request_id_att_fk
            	 FOREIGN KEY (wsdr_request_id)
          	  REFERENCES wsdr_request(wsdr_request_id)
          	  ON DELETE CASCADE
    , CONSTRAINT req_att_status_ck
    		CHECK (attachment_status IN ('C', 'R', 'S', 'E'))        	         		 
    ) ;
    
CREATE SEQUENCE seq_request_attachment
 START WITH     1001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the WSDR_RESPONSE table
-- Refers VISION_DLA.VISION_DLA_ID
-- RESPONSE_ATTACHMENT table has a foreign key to this table.
-- This table holds vision dla response XML data for each vision dla response

CREATE TABLE WSDR_RESPONSE
    ( wsdr_response_id	NUMBER (10) 
       			CONSTRAINT wsdr_response_id_nn NOT NULL
    , response_xml	CLOB 
    				CONSTRAINT response_xml_nn NOT NULL
    , xml_filename	VARCHAR2(128) 
    				CONSTRAINT resp_xml_filename_nn NOT NULL    				 
    , vision_dla_id NUMBER(10) 
    				CONSTRAINT vision_dla_id_resp_nn NOT NULL
    , response_status CHAR (1) DEFAULT 'C'
    				CONSTRAINT response_status_nn NOT NULL
    , created_date	DATE	     
    			CONSTRAINT   resp_created_date_nn NOT NULL     
    , updated_date	DATE
    
    );

CREATE UNIQUE INDEX wsdr_resp_id_pk_idx
ON WSDR_RESPONSE (wsdr_response_id);

ALTER TABLE WSDR_RESPONSE
ADD ( CONSTRAINT wsdr_resp_id_pk
       		 PRIMARY KEY (wsdr_response_id)
    , CONSTRAINT vision_dla_id_resp_fk
            	 FOREIGN KEY (vision_dla_id)
          	  REFERENCES vision_dla(vision_dla_id)
          	  ON DELETE CASCADE
    , CONSTRAINT response_status_ck
    		CHECK (response_status IN ('C', 'R', 'S', 'E'))        	         		 
    ) ;
    
CREATE SEQUENCE seq_wsdr_response
 START WITH     1001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the CASE_OUTCOME table
-- VISION_DLA tables has a foreign key to this table.
-- This table holds case outcome data for each case resolution

CREATE TABLE CASE_OUTCOME
    ( case_outcome_id	NUMBER (10) 
       			CONSTRAINT case_outcome_id_nn NOT NULL
    , vision_dla_id NUMBER(10) 
    				CONSTRAINT vision_dla_id_case_nn NOT NULL
    , websdr_number VARCHAR2(12)       			
    , transet_purpose_code	VARCHAR2 (2) 
    , adj_quantity	NUMBER(10) 
    , adj_unit_code VARCHAR2(2)
    , adj_unit_price NUMBER(10,2)
    , discrepancy_code VARCHAR2(64)
    , disposition_code VARCHAR2(64)
    , action_code VARCHAR2(2)
    , comments VARCHAR2(512)
    , attachment_count NUMBER (2)
    , created_date	DATE	     
    			CONSTRAINT   caseoutcome_created_date_nn NOT NULL     
    
    );

CREATE UNIQUE INDEX case_outcome_id_pk_idx
ON CASE_OUTCOME (case_outcome_id);

ALTER TABLE CASE_OUTCOME
ADD ( CONSTRAINT case_outcome_id_pk
       		 PRIMARY KEY (case_outcome_id)
    , CONSTRAINT vision_dla_id_case_fk
            	 FOREIGN KEY (vision_dla_id)
          	  REFERENCES vision_dla(vision_dla_id)
          	  ON DELETE CASCADE           		 
    	         		 
    ) ;
    
CREATE SEQUENCE seq_case_outcome
 START WITH     1001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the RESPONSE_ATTACHMENT table
-- Refers WSDR_RESPONSE.WSDR_RESPONSE_ID
-- This table holds vision dla response attachments information

CREATE TABLE RESPONSE_ATTACHMENT
    ( response_attachment_id	NUMBER (10) 
       			CONSTRAINT response_att_id_nn NOT NULL
    , attachment_filename	VARCHAR2(128) 
    				CONSTRAINT resp_att_filename_nn NOT NULL    				 
    , wsdr_response_id NUMBER(10) 
    				CONSTRAINT wsdr_response_id_att_nn NOT NULL
    , attachment_status CHAR (1) DEFAULT 'C'
    				CONSTRAINT resp_attachment_status_nn NOT NULL
    , created_date	DATE	     
    			CONSTRAINT   resp_att_created_date_nn NOT NULL     
    , updated_date	DATE
    
    );

CREATE UNIQUE INDEX response_attachment_id_pk_idx
ON RESPONSE_ATTACHMENT (response_attachment_id);

ALTER TABLE RESPONSE_ATTACHMENT
ADD ( CONSTRAINT response_attachment_id_pk
       		 PRIMARY KEY (response_attachment_id)
    , CONSTRAINT wsdr_response_id_fk
            	 FOREIGN KEY (wsdr_response_id)
          	  REFERENCES wsdr_response(wsdr_response_id)
          	  ON DELETE CASCADE
    , CONSTRAINT resp_att_status_ck
    		CHECK (attachment_status IN ('C', 'R', 'S', 'E'))        	         		 
    ) ;
    
CREATE SEQUENCE seq_response_attachment
 START WITH     1001
 INCREMENT BY   1
 MAXVALUE       9999999999
 CACHE		    	20
 NOCYCLE;
 
-- Adding comments to the table and columns
-- TODO

-- ********************************************************************
-- Create the EMAIL_NOTIFICATION table
-- This table holds Vision DLA Email notifications

CREATE TABLE EMAIL_NOTIFICATION
    ( email_notification_id	NUMBER (2) 
       			CONSTRAINT email_notification_id_nn NOT NULL
    , notification_type	VARCHAR2(64) 
    				CONSTRAINT notification_type_nn NOT NULL
    , to_address	VARCHAR2(256) 
    				CONSTRAINT to_address_nn NOT NULL
    , cc_address	VARCHAR2 (256)    				 
    , from_address VARCHAR2(128) 
    				CONSTRAINT from_address_nn NOT NULL
    , email_subject VARCHAR2 (256) 
    				CONSTRAINT email_subject_nn NOT NULL
    , email_content	VARCHAR2 (1024)     
    				CONSTRAINT  email_content_nn NOT NULL
    , active_status		CHAR (1) DEFAULT 'Y'    
    
    );

CREATE UNIQUE INDEX email_notification_id_pk_idx
ON EMAIL_NOTIFICATION (email_notification_id);

ALTER TABLE EMAIL_NOTIFICATION
ADD ( CONSTRAINT email_notification_id_pk
       		 PRIMARY KEY (email_notification_id)
    , CONSTRAINT email_notification_status_ck
    		CHECK (active_status IN ('Y', 'N'))        	         		 
    ) ;
    
-- Adding comments to the table and columns
-- TODO