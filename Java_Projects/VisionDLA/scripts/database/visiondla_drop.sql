-- visiondla_drop.sql
--
--    NAME
--      visiondla_create.sql - Drops tables, constraints and indexes for VISION DLA application.
--
--    DESCRIPTION
--      This script drops tables, associated constraints and indexes for 
--		Vision DLA project.
--
--    CREATED by Prasad Nerayanuru - 08/18/2013
--
--    MODIFIED   (MM/DD/YY)		NAME
--
--
-- ********************************************************************

-- Dropping tables

DROP TABLE vision_dla_status 			CASCADE CONSTRAINTS;
DROP TABLE vision_dla 						CASCADE CONSTRAINTS;
DROP TABLE wsdr_request 					CASCADE CONSTRAINTS;
DROP TABLE request_attachment			CASCADE CONSTRAINTS;
DROP TABLE wsdr_response 					CASCADE CONSTRAINTS;
DROP TABLE response_attachment		CASCADE CONSTRAINTS;
DROP TABLE case_outcome						CASCADE CONSTRAINTS;
DROP TABLE email_notification			CASCADE CONSTRAINTS;

-- Dropping Sequences

DROP SEQUENCE seq_vision_dla;
DROP SEQUENCE seq_wsdr_request;
DROP SEQUENCE seq_request_attachment;
DROP SEQUENCE seq_wsdr_response;
DROP SEQUENCE seq_response_attachment;
DROP SEQUENCE seq_case_outcome;


