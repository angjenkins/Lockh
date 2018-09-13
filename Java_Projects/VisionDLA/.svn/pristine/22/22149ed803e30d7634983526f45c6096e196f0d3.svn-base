-- remove_wsdr.sql
--
--    NAME
--      remove_wsdr.sql - Remove WSDR data from Database more than 3 years old
--
--    POST CONDITIONS 
-- WSDR response records that have a status of “S” with a created date timestamp older than three years and whose corresponding case must not be in an open status have been removed from the system.
-- The XML file that corresponds to the WSDR response record has also been removed from the system.
-- The WSDR request records that are associated to the VISION record from which the WSDR response record was generated have also been removed from the system. 
-- The XML file that corresponds to each WSDR request record has also been removed from the system.
--
--    CREATED by Prasad Nerayanuru - 09/23/2013
--
--    MODIFIED   (MM/DD/YY)		NAME
--
--
-- ********************************************************************

delete from wsdr_request wreq where exists (
select wsdr_req_id from wsdr_response wr, vision_dla vd 
where (wreq.wsdr_request_id = vd.wsdr_req_id and 
wr.vision_dla_id=vd.vision_dla_id and wr.response_status='S' and
vd.dla_status_id=9 and wr.created_date < add_months(sysdate, -36)));

commit;


