package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.FSRCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.RegionTableDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsFSRDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.VehTypeDTO;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.DTO.UserAccountGroupDUNSDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAgBuReportDTO;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FSRDAO {
	
	private SessionFactory sessionFactory = null;

	public FSRDAO() {
		super();
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	}
	
	public ArrayList<RegionTableDTO> fetchRegionList() throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<RegionTableDTO> result = new ArrayList<RegionTableDTO>();
		
		try{
			Query query =  session.createQuery("FROM RegionTableDTO ORDER BY region_Code");
			result = (ArrayList<RegionTableDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Region List failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public ArrayList<RequisitionsFSRDTO> fetchRequisitionsFSR(String caseno) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<RequisitionsFSRDTO> result = new ArrayList<RequisitionsFSRDTO>();
		
		try{
			Query query =  session.createQuery("FROM RequisitionsFSRDTO WHERE caseNo = :caseNoParam");
			query.setParameter("caseNoParam", caseno);
			result = (ArrayList<RequisitionsFSRDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsFSRDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public void setRequisitionsFSR(RequisitionsFSRDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.saveOrUpdate(dto);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Save RequisitionsFSRDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
	}
	
	public void deleteRequisitionsFSR(RequisitionsFSRDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.delete(dto);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Delete RequisitionsFSRDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
	}
	
	public ArrayList<FSRCombinedDTO> fetchFSRList(Timestamp dateFrom, Timestamp dateTo, String dateType) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<FSRCombinedDTO> result = new ArrayList<FSRCombinedDTO>();		
	    
		String sql = "SELECT distinct States.region as states_region, " + 
				" Requisitions.con_add_state as requisitions_con_add_state, " + 
				" Requisitions.con_add_city as requisitions_con_add_city, " + 
				" Agbu_Table.agency as agbu_table_agency, " + 
				" Agbu_Table.bureau as agbu_table_bureau, " + 
				" Contr_Case.CaseNo as contr_case_caseNo, " + 
				" Contr_Case.Quantity as contr_case_quantity, " + 
				" Contr_Line.model as contr_line_model, " + 
				" Contr_Line.Std_Item  as contr_line_std_item,  " +  
				" Contr_Case.Shipment_Date as contr_case_shipment_date, " + 
				" Order_Status.Veh_Order_No as order_status_veh_order_no, " + 
				" Order_Status.VIN as order_status_vin, " + 
				" IF (Order_Status.Status in ('CC','DD','AN'),LEFT(Order_Status.status_date, 10), 'In Process') as order_status_status_date, " + 
				" Order_Status.delivery_Date as order_status_deliverydt , " + 
				" Requisitions.message_line4 as requisitions_message_line4,  " + 
				" Requisitions.message_line5 as requisitions_message_line5,  " + 
				" Requisitions.Con_Email_Address as requisitions_con_email_address, " + 
				" Requisitions_Fsr.CaseNo as flagRemarks, " +
				" Contr_Case.order_date as contr_case_order_date " +
				" FROM (Contr_Case LEFT join Order_Status on " +
                " 		( Contr_Case.CaseNo = Order_Status.CaseNo ) " +
                " LEFT join Requisitions_Fsr on " +
                " 		( Contr_Case.CaseNo = Requisitions_Fsr.CaseNo ) ), " +
                " States, " +
                " Requisitions, " +
                " Agbu_Table, " +  
                " Contr_Line " +
                " WHERE ";
		if(dateType.equalsIgnoreCase("shipment")){
			sql = sql + " Contr_Case.shipment_date between :dateFromParam AND :dateToParam ";
		}
		else{
			sql = sql + " Contr_Case.order_date between :dateFromParam AND :dateToParam ";
		}
        
		sql = sql + " AND Contr_Case.Mod in "+ 
                "		(SELECT MAX(cc.Mod)  " +
                "		FROM Contr_Case cc   " +
                "   	WHERE cc.CaseNo = Contr_Case.CaseNo) " +
                " AND Contr_Case.quantity <> 0 " +
                " AND Requisitions.CaseNo = Contr_Case.CaseNo " +
                " AND (concat(Requisitions.Agency_Code, Requisitions.Bureau_Code) <> '4709'   " +
                " AND Requisitions.Agency_Code not in ('15','19','70') ) " +
                " AND States.state = Requisitions.con_add_state " +
                " AND Contr_Line.Contract = Contr_Case.Contract " +
                " AND Contr_Line.Sch_Line = Contr_Case.Sch_Line " +
                " AND Agbu_Table.Agency_Code = Requisitions.Agency_Code " +
                " AND Agbu_Table.Bureau_Code = Requisitions.Bureau_Code " +
                " AND AgBu_Table.Proprietary <>'Y' " +
                " ORDER BY Requisitions.con_add_state,   " +
                " Requisitions.con_add_city,   " +
                " Agbu_Table.agency,   " +
                " Agbu_Table.bureau, " +
                " Contr_Case.CaseNo, " +
                " Order_Status.delivery_Date";
		
		try{
     		
	    	Query query =  session.createSQLQuery(sql)	    		
	            .addScalar("states_region",Hibernate.STRING)
	            .addScalar("requisitions_con_add_state",Hibernate.STRING)
	            .addScalar("requisitions_con_add_city",Hibernate.STRING)
	            .addScalar("agbu_table_agency",Hibernate.STRING)
	            .addScalar("agbu_table_bureau",Hibernate.STRING)
	            .addScalar("contr_case_caseNo",Hibernate.STRING)
	            .addScalar("contr_case_quantity",Hibernate.INTEGER)
	            .addScalar("contr_line_model",Hibernate.STRING)
	            .addScalar("contr_line_std_item",Hibernate.STRING)
	            .addScalar("contr_case_shipment_date",Hibernate.TIMESTAMP)
	            .addScalar("order_status_veh_order_no",Hibernate.STRING)
	            .addScalar("order_status_vin",Hibernate.STRING)
	            .addScalar("order_status_status_date",Hibernate.STRING)
	            .addScalar("order_status_deliverydt",Hibernate.TIMESTAMP)
	            .addScalar("requisitions_message_line4",Hibernate.STRING)
	            .addScalar("requisitions_message_line5",Hibernate.STRING)
	            .addScalar("requisitions_con_email_address",Hibernate.STRING)
	            .addScalar("flagRemarks",Hibernate.STRING)
	            .addScalar("contr_case_order_date",Hibernate.TIMESTAMP)	           
	            .setResultTransformer(Transformers.aliasToBean(FSRCombinedDTO.class))
	            .setParameter("dateFromParam",dateFrom)
	    		.setParameter("dateToParam",dateTo);
	            result = (ArrayList<FSRCombinedDTO>) query.list();
	            transaction.commit();
     	}                     
     	catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select FSR List failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public int  saveBuildReportQuery(UserAgBuReportDTO dto) throws Exception {
		int rowCount = 0;
		Transaction transaction=null;
		/*String stringQuery = " Insert into  user_agbu_report ( " +
				" agency_code, " +
				" bureau_code, " +
				" User_ID, " +
				" Report_Name, " +
				" report_type, " + 
				" Privilege, " +
				" Field_Names, " +
				" User_Updated, " +
				" Date_Last_Updated, " +
				" Date_Created ) " +
				" values  ( " +
				" :agencyCode," +
				" :bureauCode," +
				" :userId, " +
				" :reportName," +
				" :reportType," +
				" :privilege," + 
				" :fieldNames," +
				" :userUpdated," +
				"  Now()," +
				"  Now() ) " ;
		*/
		
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();	       	 	
	        	transaction = session.beginTransaction();
	        	session.save(dto);
	        	/*
	        	Query query = session.createSQLQuery(stringQuery);
		        query.setParameter("agencyCode", dto.getAgencyCode());
		        query.setParameter("bureauCode", dto.getBureauCode());
		        query.setParameter("userId",dto.getUserID());
		        query.setParameter("reportName",dto.getReportNumber());
		        query.setParameter("reportType", dto.getReportType());
		        query.setParameter("privilege", dto.getPrivilege());
		        query.setParameter("fieldNames",dto.getFieldNames());
		        query.setParameter("userUpdated",dto.getUserUpdated());

		        rowCount = query.executeUpdate();
		        */
		        transaction.commit();
		           	
		     }
		     catch (Exception e) { 
		            if (transaction != null) {
		            	transaction.rollback();
		            	System.out.println("Inserting record to UserAgBuReportDTO failed: " + e.getMessage());            	
		            }
		            throw e;
		     }
		    return rowCount;   	
   }
   

   public ArrayList<UserAgBuReportDTO>  getSavedReportList(UserAccountDTO user) throws Exception{
		ArrayList<UserAgBuReportDTO> result = null; 
		Transaction transaction=null;
		StringBuffer buffQuery = new StringBuffer("SELECT Report_Name as reportNumber, Field_Names as fieldNames, id as id, Privilege as privilege");
        	buffQuery.append(" FROM  User_AgBu_Report "); 
        	buffQuery.append(" WHERE  Agency_Code = :agencyCode and"); 
        	buffQuery.append(" Bureau_Code = :bureauCode and"); 
        	buffQuery.append(" User_Id = :userId  and"); 
        	buffQuery.append(" Report_Type = 'F'"); 
        	buffQuery.append(" UNION "); 
        	buffQuery.append(" SELECT Report_Name as reportNumber, Field_Names as fieldNames, id as id, Privilege as privilege"); 
        	buffQuery.append(" FROM  User_AgBu_Report "); 
        	buffQuery.append(" WHERE  Agency_Code = :agencyCode and"); 
        	buffQuery.append(" Bureau_Code = :bureauCode and"); 
        	buffQuery.append(" Privilege  = 'S' and "); 
        	buffQuery.append(" Report_Type = 'F' "); 
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(buffQuery.toString())
					.addScalar("reportNumber", Hibernate.STRING)
					.addScalar("fieldNames", Hibernate.STRING)
					.addScalar("id", Hibernate.INTEGER)
					.addScalar("privilege", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(UserAgBuReportDTO.class));
			query.setParameter("userId", user.getUserID());
			query.setParameter("agencyCode", user.getAgencyCode());
			query.setParameter("bureauCode", user.getBureauCode());
			
			result = (ArrayList<UserAgBuReportDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Updating UserAgBuReportDTO failed: "
						+ e.getMessage());
			}
			throw e;
		}
		
	  return  result;	
	}
	public ArrayList<UserAgBuReportDTO>  deleteSavedReportList(UserAccountGroupDUNSDTO user) throws Exception{
		int rowCount = 0;
		ArrayList<UserAgBuReportDTO> result = null; 
		Transaction transaction=null;
		String stringQuery =" Delete  from  Vendor_Report "+
				         " Where  Group_DUNS =:groupDUNS and "+
						 " User_Id           =:userid and "+
            		     " Report_Name = '#mid(Report,4,len(Report))#' ";	
		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("report_Name", Hibernate.STRING)
					.addScalar("fieldNames", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(UserAgBuReportDTO.class));
			query.setParameter("userId", user.getUserID());
			query.setParameter("groupDuns1", user.getGroupDUNS());
			query.setParameter("groupDuns2", user.getGroupDUNS());
			
			result = (ArrayList<UserAgBuReportDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Updating Pictures  failed: "
						+ e.getMessage());
			}
			throw e;

		}
		
		return  result;	
	}

	 public int saveFSRReport(UserAgBuReportDTO dto, String flag) throws Exception{
		 int rowCount =0;
		 Transaction transaction =null;		       	
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();
	        	transaction = session.beginTransaction();
	        	if (flag.equals("1")){	        		
	        		String stringQuery =" Update user_agbu_report set "+
	        		         " Privilege = :privilege," +
	        		         " Date_Last_Updated = now() ," +
	        		         " User_Updated = :userId " +
					         " Where  ID = :id ";
	    			transaction = session.beginTransaction();
	    			Query query = session.createSQLQuery(stringQuery);
	    		          query.setParameter("privilege", dto.getPrivilege());
	    		          query.setParameter("userId",dto.getUserID());
	    		          query.setParameter("id",dto.getId());	    		          
	    			rowCount = query.executeUpdate();
	        	}
	        	else {
	        		session.delete(dto);
	        		rowCount =1;
	        	}
	           	transaction.commit();	           	
	       	}
	       	catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	            	System.out.println("Updating UserAgBuReportDTO failed: " + e.getMessage());            	
	            }
	            throw e;	                
	        }
	    return rowCount;   	
   }
	

}
