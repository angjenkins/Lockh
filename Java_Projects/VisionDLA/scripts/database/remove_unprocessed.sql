-- remove_unprocessed.sql
--
--    NAME
--      remove_wsdr.sql - Remove WSDR data from Database more than 3 years old
--
--    POST CONDITIONS 
--	XML files that were not processed successfully with a date timestamp older than 3 months have been removed from the system.
-- WSDR request records with a status = “I” and their corresponding XML files will be removed after 3 months.
--
--    CREATED by Prasad Nerayanuru - 09/23/2013
--
--    MODIFIED   (MM/DD/YY)		NAME
--
--
-- ********************************************************************

-- Remove XML files that were not processed successfully with a date timestamp older than 3 months

delete from wsdr_request where request_status='E' and created_date < add_months(sysdate, -3);

-- WSDR request records with a status = “I” and their corresponding XML files will be removed after 3 months.

delete from wsdr_request wreq where exists (
select wsdr_req_id from vision_dla vd 
where (wreq.wsdr_request_id = vd.wsdr_req_id and vd.case_status='IGNORED' 
and vd.created_date < add_months(sysdate, -3)));

commit;