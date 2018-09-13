-- visiondla_dataload.sql
--
--    NAME
--      visiondla_dataload.sql - Populates VISION DLA static data.
--
--    DESCRIPTION
--      This script populates static data. 
--
--    CREATED by Prasad Nerayanuru - 08/18/2013
--
--    MODIFIED   (MM/DD/YY)		NAME
--
--
-- ********************************************************************

-- Populates the VISION_DLA_STATUS table
INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (1,'REQUEST_RECEIVED','Request XML Received','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (2,'REQUEST_SCHEMA_VALIDATION_FAILED','Request XML Schema Validation Failed','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (3,'REQUEST_READY_TO_SEND','Request Data Ready To Send Salesforce','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (4,'RQUEST_SENT_SF','Request Data Transmitted To Salesforce','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (5,'REQUEST_SEND_SF_FAILED','Request Data Transmission To Salesforce Failed','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (6,'RESPONSE_RECEIVED','Response Data Received From Salesforce','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (7,'RESPONSE_RECEIVE_FAILED','Response Data Receive Failed','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (8,'RESPONSE_XML_GEN_FAILED','Response XML Generation Failed','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (9,'RESPONSE_SENT_DLA','Response XML Transmitted To DLA','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (10,'RESPONSE_SEND_DLA_FAILED','Response Data Transmission To DLA Failed','Y');

INSERT INTO VISION_DLA_STATUS (DLA_STATUS_ID,DLA_STATUS,DLA_STATUS_DESC,ACTIVE_STATUS) 
VALUES (15,'SYSTEM_ERROR','System Error','Y');


INSERT INTO EMAIL_NOTIFICATION (EMAIL_NOTIFICATION_ID, NOTIFICATION_TYPE, TO_ADDRESS,CC_ADDRESS,FROM_ADDRESS,EMAIL_SUBJECT,EMAIL_CONTENT) 
VALUES (1,'REQUEST_XML_PROCESS_FAILED', 'prasad.nerayanuru@gsa.gov',NULL,'donotreply@gsa.gov',
'GSA-DLA: XML File Errors <Document_Number> <WebSDR_Number>',
'This is a system-generated message from GSA. Do NOT reply to this email.<line_seperator>GSA was not able to process the XML file, <file_name>, for the following reason:<error_message>.<line_seperator>Please correct the problems and resubmit.<line_seperator>Thank you.<line_seperator> GSA');

INSERT INTO EMAIL_NOTIFICATION (EMAIL_NOTIFICATION_ID, NOTIFICATION_TYPE, TO_ADDRESS,CC_ADDRESS,FROM_ADDRESS,EMAIL_SUBJECT,EMAIL_CONTENT) 
VALUES (2,'VISION_DATABASE_ERROR', 'prasad.nerayanuru@gsa.gov',NULL,'donotreply@gsa.gov',
'GSA-WebSDR: VISION Database Errors',
'This is a system-generated message from VISION-DLA. Do NOT reply to this email.<line_seperator>The system is unable to connect to the database for the following reason:<line_seperator><error_message><line_seperator> Please correct the problems immediately.<line_seperator>Thank you.<line_seperator>VISION-DLA');

INSERT INTO EMAIL_NOTIFICATION (EMAIL_NOTIFICATION_ID, NOTIFICATION_TYPE, TO_ADDRESS,CC_ADDRESS,FROM_ADDRESS,EMAIL_SUBJECT,EMAIL_CONTENT) 
VALUES (3,'RESPONSE_GENERATION_ERROR', 'prasad.nerayanuru@gsa.gov',NULL,'donotreply@gsa.gov',
'WebSDR XML Creation Error <Document_Number>',
'This is a system-generated message from VISION-DLA. Do NOT reply to this email.<line_seperator>The system is unable to generate the XML response record for Document Number <Document_Number> for the following reason.<line_seperator><error_message>.<line_seperator>Please correct the problems immediately.<line_seperator>Thank you.');

INSERT INTO EMAIL_NOTIFICATION (EMAIL_NOTIFICATION_ID, NOTIFICATION_TYPE, TO_ADDRESS,CC_ADDRESS,FROM_ADDRESS,EMAIL_SUBJECT,EMAIL_CONTENT) 
VALUES (4,'RESPONSE_FTP_ERROR', 'prasad.nerayanuru@gsa.gov',NULL,'donotreply@gsa.gov',
'GSA-WebSDR: FTP Server Errors',
'This is a system-generated message from VISION. Do NOT reply to this email.<line_seperator>The system is unable to connect to the GSA FTP Server for the following reason:<line_seperator><error_message>.<line_seperator>Please correct the problems immediately.<line_seperator>Thank you.<line_seperator>VISION-DLA');

COMMIT;