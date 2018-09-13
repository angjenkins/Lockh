package gov.gsa.fas.AutoChoice.DAO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.FSRCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusDTO;
import gov.gsa.fas.AutoChoice.DTO.ReportEmailDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsFSRDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.OrderStatusBean;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

@Repository
public class OrderStatusDAO {
	
	private SessionFactory sessionFactory = null;

	public OrderStatusDAO() {
		super();
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	}
	
	public ArrayList<OrderStatusCombinedDTO> fetchVehReceiptList(OrderStatusBean orderStatusBean, UserAccountDTO user) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();		
		StringBuffer sqlBuff = new StringBuffer(); 
    
		sqlBuff.append("SELECT  distinct Requisitions.Caseno as case_number,");		
		sqlBuff.append("Requisitions.Std_Item as req_std_item,");
		sqlBuff.append("Requisitions.Model as req_model,");
		sqlBuff.append("Requisitions.Agency_Code as req_agency_code ,");
		sqlBuff.append("Requisitions.Bureau_Code as req_bureau_code,");
		sqlBuff.append("Requisitions.Agency_Order_No as req_agency_order_number,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_1 as req_fed_mil_req_1,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_2 as req_fed_mil_req_2,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_3 as req_fed_mil_req_3,");
		sqlBuff.append("Order_Status.VIN as order_status_vin,");
		sqlBuff.append("Order_Status.Veh_Order_No as order_status_von,");
		sqlBuff.append("Order_Status.Status as order_status_status,");
		sqlBuff.append("Order_Status.Name as order_status_name,");
		sqlBuff.append("Order_Status.Address as order_status_address,");
		sqlBuff.append("Order_Status.City as order_status_city,");
		sqlBuff.append("Order_Status.State as order_status_state ,");
		sqlBuff.append("Order_Status.Zip as order_status_zip,");
		sqlBuff.append("Order_Status.Sfx as order_status_sfx,");
		sqlBuff.append("Order_Status.Status_Date as order_status_status_date,");
		sqlBuff.append("Order_Status.Contact_Name as order_status_contact_name,");
		sqlBuff.append("Order_Status.Contact_Telno as order_status_contact_telnum ,");
		sqlBuff.append("Order_Status.Delivery_Date as order_status_delivery_date ,");
		sqlBuff.append("Order_Status.Date_Ag_Received as order_status_date_ag_received,");
		sqlBuff.append("Order_Status.User_Ag_Updated as order_status_user_ag_updated,");
		sqlBuff.append("Order_Status.Date_Ag_Updated as order_status_date_ag_updated,");		
		sqlBuff.append("Order_Status.caseno as case_number,");		
		sqlBuff.append("Order_Status.contract as order_status_contract,");
		sqlBuff.append("Order_Status.date_updated as order_status_date_updated,");
		sqlBuff.append("Order_Status.orig_status_date as order_status_orig_status_date,");
		sqlBuff.append("Order_Status.shipment_date as order_status_shipment_date,");		
		sqlBuff.append("Order_Status.weight_rating as order_status_weight_rating,");
		sqlBuff.append("Order_Status.fuel_type as order_status_fuel_type,");
		sqlBuff.append("Order_Status.gpm as order_status_gpm,");
		sqlBuff.append("Order_Status.mpg_b as order_status_mpg_b,");
		sqlBuff.append("Order_Status.mpg_c as order_status_mpg_c,");
		sqlBuff.append("Order_Status.mpg_h as order_status_mpg_h ,");
		sqlBuff.append("Order_Status.flex_gpm as order_status_flex_gpm,");
		sqlBuff.append("Order_Status.flex_fuel_mpg_b as order_status_flex_fuel_mpg_b,");
		sqlBuff.append("Order_Status.flex_fuel_mpg_c as order_status_flex_fuel_mpg_c,");
		sqlBuff.append("Order_Status.flex_fuel_mpg_h as order_status_flex_fuel_mpg_h,");
		sqlBuff.append("Order_Status.veh_color as order_status_veh_color ,");
		sqlBuff.append("Order_Status.veh_trim as order_status_veh_trim ,");		
		sqlBuff.append("Contr_Case.Shipment_Date as contr_case_shipment_date,");
		sqlBuff.append("Contr_Case.Order_Date as contr_case_order_date ");
		sqlBuff.append(" FROM Requisitions  LEFT join Order_Status on ");
		sqlBuff.append(" (Requisitions.CaseNo = Order_Status.CaseNo), ");
		sqlBuff.append(" Contr_Case ");
		sqlBuff.append(" WHERE ");
		sqlBuff.append(" Requisitions.Caseno = Contr_Case.CaseNo  and ");
		sqlBuff.append(" Contr_Case.Mod in (SELECT MAX(cc.Mod) ");
			sqlBuff.append(" FROM Contr_Case cc ");
			sqlBuff.append(" WHERE cc.CaseNo = Contr_Case.CaseNo) and ");
		if(orderStatusBean.getSearchType().equalsIgnoreCase("Case")){
			sqlBuff.append(" Requisitions.Caseno >= upper(:searchFrom) and ");
	     	sqlBuff.append(" Requisitions.Caseno <= upper(:searchTo) ");
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
			sqlBuff.append(" Requisitions.Agency_Order_No >= :searchFrom and");
			sqlBuff.append(" Requisitions.Agency_Order_No <= :searchTo");
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
			sqlBuff.append(" concat(Requisitions.Fed_Mil_Req_No_1,'-', Requisitions.Fed_Mil_Req_No_2,'-', Requisitions.Fed_Mil_Req_No_3) >= :searchFrom and ");	
			sqlBuff.append(" concat(Requisitions.Fed_Mil_Req_No_1,'-', Requisitions.Fed_Mil_Req_No_2,'-', Requisitions.Fed_Mil_Req_No_3) <= :searchTo");
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("ShipDateRange")){
			sqlBuff.append(" Contr_Case.shipment_date >= :dateFrom and ");
			sqlBuff.append(" Contr_Case.shipment_date <= :dateTo ");
		}
		if(!user.getPrivilege().equals("6") ){
			sqlBuff.append(" and Requisitions.Agency_Code = :agencyCode ");
			if(!user.getPrivilege().equals("4") ){
				sqlBuff.append(" and Bureau_Code in (:bureauCodeList) ");
			}
			else{
				sqlBuff.append("and Bureau_Code  =  :bureauCode ");
			}
		}
		sqlBuff.append(" ORDER BY Requisitions.Caseno");
	    
		try{     		
	    	Query query =  session.createSQLQuery(sqlBuff.toString())
	            .addScalar("case_number",Hibernate.STRING)	            
	            .addScalar("req_std_item",Hibernate.STRING)
	            .addScalar("req_model",Hibernate.STRING)
	            .addScalar("req_agency_code",Hibernate.STRING)
	            .addScalar("req_bureau_code",Hibernate.STRING)
	            .addScalar("req_agency_order_number",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_1",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_2",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_3",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_3",Hibernate.STRING)
	            .addScalar("order_status_vin",Hibernate.STRING)
	            .addScalar("order_status_von",Hibernate.STRING)
	            .addScalar("order_status_status",Hibernate.STRING)
	            .addScalar("order_status_name",Hibernate.STRING)
	            .addScalar("order_status_address",Hibernate.STRING)
	            .addScalar("order_status_city",Hibernate.STRING)
	            .addScalar("order_status_state",Hibernate.STRING)
	            .addScalar("order_status_zip",Hibernate.STRING)
	            .addScalar("order_status_sfx",Hibernate.STRING)
	            .addScalar("order_status_status_date",Hibernate.TIMESTAMP)
	            .addScalar("order_status_contact_name",Hibernate.STRING)
	            .addScalar("order_status_contact_telnum",Hibernate.STRING)
	            .addScalar("order_status_delivery_date",Hibernate.TIMESTAMP)
	            .addScalar("order_status_date_ag_received",Hibernate.TIMESTAMP)
	            .addScalar("order_status_user_ag_updated",Hibernate.STRING)
	            .addScalar("order_status_date_ag_updated",Hibernate.TIMESTAMP)
	            .addScalar("contr_case_shipment_date",Hibernate.TIMESTAMP)
	            .addScalar("contr_case_order_date",Hibernate.TIMESTAMP)		
				.addScalar("case_number",Hibernate.STRING)
			    .addScalar("order_status_contract",Hibernate.STRING)
			    .addScalar("order_status_date_updated",Hibernate.TIMESTAMP)
			    .addScalar("order_status_orig_status_date",Hibernate.TIMESTAMP)
			    .addScalar("order_status_shipment_date",Hibernate.TIMESTAMP)
			    .addScalar("order_status_weight_rating",Hibernate.STRING)
			    .addScalar("order_status_fuel_type",Hibernate.STRING)
			    .addScalar("order_status_gpm",Hibernate.STRING)
			    .addScalar("order_status_mpg_b",Hibernate.STRING)
			    .addScalar("order_status_mpg_c",Hibernate.STRING)
			    .addScalar("order_status_mpg_h",Hibernate.STRING)
			    .addScalar("order_status_flex_gpm",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_b",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_c",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_h",Hibernate.STRING)
			    .addScalar("order_status_veh_color",Hibernate.STRING)
			    .addScalar("order_status_veh_trim",Hibernate.STRING)        
	            .setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
	            if(orderStatusBean.getSearchType().equalsIgnoreCase("Case") || 
	            		orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber") ||
	            		orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
	            	query.setParameter("searchFrom",orderStatusBean.getSearchFrom());
	            	query.setParameter("searchTo",orderStatusBean.getSearchTo());
	    		}
	    		else if(orderStatusBean.getSearchType().equalsIgnoreCase("ShipDateRange")){
	    			Timestamp dateFromTS = UtilsLib.formatStringToTimestamp(orderStatusBean.getDateFrom());	    			
	    			Timestamp dateToTS = UtilsLib.formatStringToTimestamp(orderStatusBean.getDateTo());
	    			Calendar calTo = Calendar.getInstance();
	    			calTo.setTimeInMillis(dateToTS.getTime());
	    			calTo.set(Calendar.HOUR_OF_DAY, 23);
					calTo.set(Calendar.MINUTE, 59);
					calTo.set(Calendar.SECOND, 59);
					dateToTS = new Timestamp(calTo.getTimeInMillis());
	    			query.setParameter("dateFrom",dateFromTS);
	            	query.setParameter("dateTo",dateToTS);
	    		}
	    		if(!user.getPrivilege().equals("6") ){
	    			query.setParameter("agencyCode",user.getAgencyCode());
	    			if(!user.getPrivilege().equals("4") ){
	    				if(user.getBureauCodeList() != null && user.getBureauCodeList().length() > 0){
		    				ArrayList<String> items = (ArrayList<String>) Arrays.asList(user.getBureauCodeList().split("\\s*,\\s*"));
		    				items.add(user.getBureauCode());
		    				query.setParameterList("bureauCodeList",items);
	    				}
	    				else{
	    					query.setParameter("bureauCodeList",user.getBureauCode());
	    				}
	    			}
	    			else{
	    				query.setParameter("bureauCodeList",user.getBureauCode());
	    			}
	    		}
	            result = (ArrayList<OrderStatusCombinedDTO>) query.list();
	            transaction.commit();
     	}                     
     	catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Order Status Vehicle Receipt List failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public ArrayList<OrderStatusCombinedDTO> fetchOrderStatusReqList(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();		
		StringBuffer sqlBuff = new StringBuffer(); 
    
		sqlBuff.append("SELECT  distinct Requisitions.Caseno as case_number,");		
		sqlBuff.append("Requisitions.Std_Item as req_std_item,");
		sqlBuff.append("Requisitions.Model as req_model,");
		sqlBuff.append("Requisitions.Agency_Code as req_agency_code ,");
		sqlBuff.append("Requisitions.Bureau_Code as req_bureau_code,");
		sqlBuff.append("Requisitions.Agency_Order_No as req_agency_order_number,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_1 as req_fed_mil_req_1,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_2 as req_fed_mil_req_2,");
		sqlBuff.append("Requisitions.Fed_Mil_Req_No_3 as req_fed_mil_req_3,");		
		sqlBuff.append("Requisitions.Funded as req_Funded,");
		sqlBuff.append("Requisitions.Date_Received as req_Date_Received,");
		sqlBuff.append("Requisitions.Fed_Mil_Sup_Add as req_Fed_Mil_Sup_Add,");
		sqlBuff.append("Requisitions.Fed_Mil_Signal as req_Fed_Mil_Signal,");
		sqlBuff.append("Requisitions.Fed_Mil_Fund as req_Fed_Mil_Fund,");
		sqlBuff.append("Requisitions.Quantity as req_Quantity,");
		sqlBuff.append("Requisitions.Est_Unit_Price as req_Est_Unit_Price,");
		sqlBuff.append("Requisitions.Export_Code as req_Export_Code,");
		sqlBuff.append("Requisitions.Veh_Color as req_Veh_Color,");
		sqlBuff.append("Requisitions.Non_Std_Desc as req_Non_Std_Desc,");
		sqlBuff.append("Requisitions.Date_Canceled as req_Date_Canceled,");
		sqlBuff.append("Requisitions.Message_Line1 as req_Message_Line1,");
		sqlBuff.append("Requisitions.Message_Line2 as req_Message_Line2,");
		sqlBuff.append("Requisitions.Message_Line3 as req_Message_Line3,");
		sqlBuff.append("Requisitions.Message_Line4 as req_Message_Line4,");
		sqlBuff.append("Requisitions.Message_Line5 as req_Message_Line5,");
		sqlBuff.append("Requisitions.Mark_For as req_Mark_For,");
		sqlBuff.append("Requisitions.TCN as req_TCN,");
		sqlBuff.append("Requisitions.ACRN as req_ACRN,");
		sqlBuff.append("Requisitions.Date_Funded as req_Date_Funded,");
		sqlBuff.append("Requisitions.Buyer_Code as req_Buyer_Code,");
		sqlBuff.append("Requisitions.Req_Add_Line1 as req_Req_Add_Line1,");
		sqlBuff.append("Requisitions.Req_Add_Line2 as req_Req_Add_Line2,");
		sqlBuff.append("Requisitions.Req_Add_Line3 as req_Req_Add_Line3,");
		sqlBuff.append("Requisitions.Req_Add_Line4 as req_Req_Add_Line4,");
		sqlBuff.append("Requisitions.Req_Add_Country as req_Req_Add_Country,");
		sqlBuff.append("Requisitions.Req_Add_City as req_Req_Add_City,");
		sqlBuff.append("Requisitions.Req_Add_State as req_Req_Add_State,");
		sqlBuff.append("Requisitions.Req_Add_Zip as req_Req_Add_Zip,");
		sqlBuff.append("Requisitions.Req_Add_Zip_Sfx as req_Req_Add_Zip_Sfx,");
		sqlBuff.append("Requisitions.Mail_Add_Line1 as req_Mail_Add_Line1,");
		sqlBuff.append("Requisitions.Mail_Add_Line2 as req_Mail_Add_Line2,");
		sqlBuff.append("Requisitions.Mail_Add_Line3 as req_Mail_Add_Line3,");
		sqlBuff.append("Requisitions.Mail_Add_Line4 as req_Mail_Add_Line4,");
		sqlBuff.append("Requisitions.Mail_Add_Country as req_Mail_Add_Country,");
		sqlBuff.append("Requisitions.Mail_Add_City as req_Mail_Add_City,");
		sqlBuff.append("Requisitions.Mail_Add_State as req_Mail_Add_State,");
		sqlBuff.append("Requisitions.Mail_Add_Zip as req_Mail_Add_Zip,");
		sqlBuff.append("Requisitions.Mail_Add_Zip_Sfx as req_Mail_Add_Zip_Sfx,");
		sqlBuff.append("Requisitions.Con_Add_Line1 as req_Con_Add_Line1,");
		sqlBuff.append("Requisitions.Con_Add_Line2 as req_Con_Add_Line2,");
		sqlBuff.append("Requisitions.Con_Add_Line3 as req_Con_Add_Line3,");
		sqlBuff.append("Requisitions.Con_Add_Line4 as req_Con_Add_Line4,");
		sqlBuff.append("Requisitions.Con_Add_Country as req_Con_Add_Country,");
		sqlBuff.append("Requisitions.Con_Add_City as req_Con_Add_City,");
		sqlBuff.append("Requisitions.Con_Add_State as req_Con_Add_State,");
		sqlBuff.append("Requisitions.Con_Add_Zip as req_Con_Add_Zip,");
		sqlBuff.append("Requisitions.Con_Add_Zip_Sfx as req_Con_Add_Zip_Sfx,");
		sqlBuff.append("Requisitions.Bill_Add_Line1 as req_Bill_Add_Line1,");
		sqlBuff.append("Requisitions.Bill_Add_Line2 as req_Bill_Add_Line2,");
		sqlBuff.append("Requisitions.Bill_Add_Line3 as req_Bill_Add_Line3,");
		sqlBuff.append("Requisitions.Bill_Add_Line4 as req_Bill_Add_Line4,");
		sqlBuff.append("Requisitions.Bill_Add_Country as req_Bill_Add_Country,");
		sqlBuff.append("Requisitions.Bill_Add_City as req_Bill_Add_City,");
		sqlBuff.append("Requisitions.Bill_Add_State as req_Bill_Add_State,");
		sqlBuff.append("Requisitions.Bill_Add_Zip as req_Bill_Add_Zip,");
		sqlBuff.append("Requisitions.Bill_Add_Zip_Sfx as req_Bill_Add_Zip_Sfx,");
		sqlBuff.append("Requisitions.NSN as req_NSN,");
		sqlBuff.append("Requisitions.Registration_No as req_Registration_No,");
		sqlBuff.append("Requisitions.Con_Email_Address as req_Con_Email_Address,");
		sqlBuff.append("Requisitions.Con_Fax_Number as req_Con_Fax_Number,");
		sqlBuff.append("Requisitions.Req_Email_Address as req_Req_Email_Address,");
		sqlBuff.append("Requisitions.Req_Fax_Number as req_Req_Fax_Number,");
		sqlBuff.append("Requisitions.Source as req_Source,");
		sqlBuff.append("Requisitions.Agency_OnBehalf as req_Agency_OnBehalf,");
		sqlBuff.append("Requisitions.Bureau_OnBehalf as req_Bureau_OnBehalf,");
		sqlBuff.append("Buyer_Table.First_Name as buyer_First_Name,");
		sqlBuff.append("Buyer_Table.Last_Name as buyer_Last_Name,");
		sqlBuff.append("Buyer_Table.Phone as buyer_Phone,");
		sqlBuff.append("Std_items.Description as std_items_description,");
		sqlBuff.append("AgBu_Table.Agency as agbu_Agency,");
		sqlBuff.append("AgBu_Table.Bureau as agbu_Bureau,");
		sqlBuff.append("Contract.Contract_Sc as contract_Contract_Sc,");
		sqlBuff.append("Contract.Sol_No_1 as contract_Sol_No_1,");
		sqlBuff.append("Contract.Sol_No_2 as contract_Sol_No_2,");
		sqlBuff.append("Contract.Sol_No_3 as contract_Sol_No_3,");
		sqlBuff.append("Contr_Case.Sch_Line as contr_case_Sch_Line,");
		sqlBuff.append("Contr_Case.Order_Date as contr_case_order_date,");
		sqlBuff.append("concat(Solicitation.Sol_No_1,'-',Solicitation.Sol_No_2,'-', Solicitation.Sol_No_3) as solicitation_sol_no ");
		sqlBuff.append(" FROM Requisitions LEFT OUTER JOIN Contr_Case ");
		sqlBuff.append(" ON Requisitions.CaseNo = Contr_Case.CaseNo ");
		sqlBuff.append(" LEFT OUTER JOIN Contract ");
		sqlBuff.append(" ON Contr_Case.Contract = Contract.Contract ");
		sqlBuff.append(" LEFT OUTER JOIN Solicitation ");
		sqlBuff.append(" ON Solicitation.Sol_No_1 = Contract.Sol_No_1 ");
		sqlBuff.append(" AND Solicitation.Sol_No_2 = Contract.Sol_No_2 ");
		sqlBuff.append(" AND Solicitation.Sol_No_3 = Contract.Sol_No_3 ");
		sqlBuff.append(" LEFT OUTER JOIN Buyer_Table ");
		sqlBuff.append(" ON  Requisitions.Buyer_Code = Buyer_Table.Buyer_Code ");
		if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
			sqlBuff.append(" JOIN Order_Status ON Requisitions.CaseNo = Order_Status.CaseNo ");
		}
		sqlBuff.append(", AgBu_Table ");
		sqlBuff.append(", Std_items ");
		sqlBuff.append(" WHERE  ");
		if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
			sqlBuff.append(" Requisitions.Fed_Mil_Req_No_1 = :req1 and ");
			sqlBuff.append(" Requisitions.Fed_Mil_Req_No_2 = :req2 and ");
			sqlBuff.append(" Requisitions.Fed_Mil_Req_No_3 = :req3 and ");
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
			sqlBuff.append(" Order_Status.VIN = :vin and ");
		}
		else{
			sqlBuff.append(" Requisitions.CaseNo = :caseNumber  and ");
		}		 		 
		sqlBuff.append(" Requisitions.Agency_Code = AgBu_Table.Agency_Code and   ");
		sqlBuff.append(" Requisitions.Bureau_Code = AgBu_Table.Bureau_Code and   ");
		sqlBuff.append(" Requisitions.Std_Item = Std_items.Std_Item  and ");
		sqlBuff.append(" Contr_Case.Mod in (SELECT MAX(cc.Mod)  ");
		sqlBuff.append(" FROM Contr_Case cc   ");
		sqlBuff.append(" WHERE cc.CaseNo = Contr_Case.CaseNo) ");	
	    
		try{     		
	    	Query query =  session.createSQLQuery(sqlBuff.toString())
	            .addScalar("case_number",Hibernate.STRING)	            
	            .addScalar("req_std_item",Hibernate.STRING)
	            .addScalar("req_model",Hibernate.STRING)
	            .addScalar("req_agency_code",Hibernate.STRING)
	            .addScalar("req_bureau_code",Hibernate.STRING)
	            .addScalar("req_agency_order_number",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_1",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_2",Hibernate.STRING)
	            .addScalar("req_fed_mil_req_3",Hibernate.STRING)
	            .addScalar("req_Funded",Hibernate.STRING)
	            .addScalar("req_Date_Received",Hibernate.TIMESTAMP)
	            .addScalar("req_Fed_Mil_Sup_Add",Hibernate.STRING)
	            .addScalar("req_Fed_Mil_Signal",Hibernate.STRING)
	            .addScalar("req_Fed_Mil_Fund",Hibernate.STRING)
	            .addScalar("req_Quantity",Hibernate.INTEGER)
	            .addScalar("req_Est_Unit_Price",Hibernate.DOUBLE)
	            .addScalar("req_Export_Code",Hibernate.STRING)
	            .addScalar("req_Veh_Color",Hibernate.STRING)
	            .addScalar("req_Non_Std_Desc",Hibernate.STRING)
	            .addScalar("req_Date_Canceled",Hibernate.TIMESTAMP)
	            .addScalar("req_Message_Line1",Hibernate.STRING)
	            .addScalar("req_Message_Line2",Hibernate.STRING)
	            .addScalar("req_Message_Line3",Hibernate.STRING)
	            .addScalar("req_Message_Line4",Hibernate.STRING)
	            .addScalar("req_Message_Line5",Hibernate.STRING)
	            .addScalar("req_TCN",Hibernate.STRING)
	            .addScalar("req_ACRN",Hibernate.STRING)		
				.addScalar("req_Date_Funded",Hibernate.TIMESTAMP)
			    .addScalar("req_Buyer_Code",Hibernate.STRING)
			    .addScalar("req_Req_Add_Line1",Hibernate.STRING)
			    .addScalar("req_Req_Add_Line2",Hibernate.STRING)
			    .addScalar("req_Req_Add_Line3",Hibernate.STRING)
			    .addScalar("req_Req_Add_Line4",Hibernate.STRING)
			    .addScalar("req_Req_Add_Country",Hibernate.STRING)
			    .addScalar("req_Req_Add_City",Hibernate.STRING)
			    .addScalar("req_Req_Add_State",Hibernate.STRING)
			    .addScalar("req_Req_Add_Zip",Hibernate.STRING)
			    .addScalar("req_Req_Add_Zip_Sfx",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Line1",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Line2",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Line3",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Line4",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Country",Hibernate.STRING)
			    .addScalar("req_Mail_Add_City",Hibernate.STRING)
			    .addScalar("req_Mail_Add_State",Hibernate.STRING)
			    .addScalar("req_Mail_Add_Zip",Hibernate.STRING) 
			    .addScalar("req_Mail_Add_Zip_Sfx",Hibernate.STRING)
			    .addScalar("req_Con_Add_Line1",Hibernate.STRING) 
			    .addScalar("req_Con_Add_Line2",Hibernate.STRING)
			    .addScalar("req_Con_Add_Line3",Hibernate.STRING) 
			    .addScalar("req_Con_Add_Line4",Hibernate.STRING)
			    .addScalar("req_Con_Add_Country",Hibernate.STRING) 
			    .addScalar("req_Con_Add_City",Hibernate.STRING)
			    .addScalar("req_Con_Add_State",Hibernate.STRING) 
			    .addScalar("req_Con_Add_Zip",Hibernate.STRING)
			    .addScalar("req_Con_Add_Zip_Sfx",Hibernate.STRING) 
			    .addScalar("req_Bill_Add_Line1",Hibernate.STRING)
			    .addScalar("req_Bill_Add_Line2",Hibernate.STRING) 
			    .addScalar("req_Bill_Add_Line3",Hibernate.STRING)
			    .addScalar("req_Bill_Add_Line4",Hibernate.STRING) 
			    .addScalar("req_Bill_Add_Country",Hibernate.STRING)
			    .addScalar("req_Bill_Add_City",Hibernate.STRING) 
			    .addScalar("req_Bill_Add_State",Hibernate.STRING)
			    .addScalar("req_Bill_Add_Zip",Hibernate.STRING) 
			    .addScalar("req_Bill_Add_Zip_Sfx",Hibernate.STRING)
			    .addScalar("req_NSN",Hibernate.STRING)   
			    .addScalar("req_Registration_No",Hibernate.STRING)
			    .addScalar("req_Con_Email_Address",Hibernate.STRING) 
			    .addScalar("req_Con_Fax_Number",Hibernate.STRING)
			    .addScalar("req_Req_Email_Address",Hibernate.STRING) 
			    .addScalar("req_Req_Fax_Number",Hibernate.STRING)
			    .addScalar("req_Source",Hibernate.STRING)  
			    .addScalar("req_Agency_OnBehalf",Hibernate.STRING)
			    .addScalar("req_Bureau_OnBehalf",Hibernate.STRING) 
			    .addScalar("buyer_First_Name",Hibernate.STRING)
			    .addScalar("buyer_Last_Name",Hibernate.STRING) 
			    .addScalar("buyer_Phone",Hibernate.STRING)
			    .addScalar("std_items_description",Hibernate.STRING)  
			    .addScalar("agbu_Agency",Hibernate.STRING)
			    .addScalar("agbu_Bureau",Hibernate.STRING) 
			    .addScalar("contract_Contract_Sc",Hibernate.STRING)
			    .addScalar("solicitation_sol_no",Hibernate.STRING) 
			    .addScalar("contract_Sol_No_1",Hibernate.STRING)
			    .addScalar("contract_Sol_No_2",Hibernate.STRING)  
			    .addScalar("contract_Sol_No_3",Hibernate.STRING)
			    .addScalar("contr_case_Sch_Line",Hibernate.STRING)  
			    .addScalar("contr_case_order_date",Hibernate.TIMESTAMP)  
	            .setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
		    	if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
					query.setParameter("req1",orderStatusBean.getSearchKey1());
					query.setParameter("req2",orderStatusBean.getSearchKey2());
					query.setParameter("req3",orderStatusBean.getSearchKey3());
				}
				else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
					query.setParameter("vin",orderStatusBean.getSearchKey1());
				}
				else{
					query.setParameter("caseNumber",orderStatusBean.getSearchKey1());
				}
	            result = (ArrayList<OrderStatusCombinedDTO>) query.list();
	            transaction.commit();
     	}                     
     	catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Order Status Main Report List failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public void setOrderStatus(OrderStatusDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.saveOrUpdate(dto);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Save OrderStatusDTO failed: "
						+ e.getMessage());
			}                
     		throw e;
        }
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<OrderStatusCombinedDTO> fetchOrderStatusList(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<OrderStatusCombinedDTO> queryresult = null;
		try {
			StringBuffer sqlBuff = new StringBuffer("SELECT ");
			sqlBuff.append("Order_Status.caseNo as case_number,");
			sqlBuff.append("Order_Status.VIN as order_status_vin,");
			sqlBuff.append("Order_Status.Veh_Order_No as order_status_von,");
			sqlBuff.append("Order_Status.Status as order_status_status,");
			sqlBuff.append("Order_Status.Name as order_status_name,");
			sqlBuff.append("Order_Status.Address as order_status_address,");
			sqlBuff.append("Order_Status.City as order_status_city,");
			sqlBuff.append("Order_Status.State as order_status_state ,");
			sqlBuff.append("Order_Status.Zip as order_status_zip,");
			sqlBuff.append("Order_Status.Sfx as order_status_sfx,");
			sqlBuff.append("Order_Status.Status_Date as order_status_status_date,");
			sqlBuff.append("Order_Status.Contact_Name as order_status_contact_name,");
			sqlBuff.append("Order_Status.Contact_Telno as order_status_contact_telnum ,");
			sqlBuff.append("Order_Status.Delivery_Date as order_status_delivery_date ,");
			sqlBuff.append("Order_Status.Date_Ag_Received as order_status_date_ag_received,");
			sqlBuff.append("Order_Status.User_Ag_Updated as order_status_user_ag_updated,");
			sqlBuff.append("Order_Status.Date_Ag_Updated as order_status_date_ag_updated,");		
			sqlBuff.append("Order_Status.caseno as case_number,");		
			sqlBuff.append("Order_Status.contract as order_status_contract,");
			sqlBuff.append("Order_Status.date_updated as order_status_date_updated,");
			sqlBuff.append("Order_Status.orig_status_date as order_status_orig_status_date,");
			sqlBuff.append("Order_Status.shipment_date as order_status_shipment_date,");		
			sqlBuff.append("Order_Status.weight_rating as order_status_weight_rating,");
			sqlBuff.append("Order_Status.fuel_type as order_status_fuel_type,");
			sqlBuff.append("Order_Status.gpm as order_status_gpm,");
			sqlBuff.append("Order_Status.mpg_b as order_status_mpg_b,");
			sqlBuff.append("Order_Status.mpg_c as order_status_mpg_c,");
			sqlBuff.append("Order_Status.mpg_h as order_status_mpg_h ,");
			sqlBuff.append("Order_Status.flex_gpm as order_status_flex_gpm,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_b as order_status_flex_fuel_mpg_b,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_c as order_status_flex_fuel_mpg_c,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_h as order_status_flex_fuel_mpg_h,");
			sqlBuff.append("Order_Status.veh_color as order_status_veh_color ,");
			sqlBuff.append("Order_Status.veh_trim as order_status_veh_trim ,");	
			sqlBuff.append("IF(Order_Status.Status IS NULL, IF(Order_Status.Status_Date IS NULL, IF(Order_Status.Delivery_Date IS NULL, IF(Order_Status.Shipment_Date IS NULL,");
			sqlBuff.append(" 'A','V'),'V'),'V'), IF(TRIM(Order_Status.Status) = '', IF(Order_Status.Status_Date IS NULL, IF(Order_Status.Delivery_Date IS NULL, IF(Order_Status.Shipment_Date IS NULL,");
			sqlBuff.append("'A','V'),'V'),'V'),'V')) as wk_flag");
			sqlBuff.append(" FROM Order_Status ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition") || orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(", Requisitions ");
			}
			sqlBuff.append(" WHERE  ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" Requisitions.CaseNo = Order_Status.CaseNo AND ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_1 = :searchKey1 AND ");
				sqlBuff.append( "Requisitions.Fed_Mil_Req_No_2 = :searchKey2 AND ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_3 = :searchKey3");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" Order_Status.VIN = :searchKey1");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(" Requisitions.Agency_Order_No = :searchKey1");
			}
			else{
				sqlBuff.append(" Order_Status.CaseNo = :searchKey1");
			}
			
			Query query = (session
					.createSQLQuery(sqlBuff.toString()))
			.addScalar("case_number",Hibernate.STRING)
			.addScalar("order_status_vin",Hibernate.STRING)
            .addScalar("order_status_von",Hibernate.STRING)
            .addScalar("order_status_status",Hibernate.STRING)
            .addScalar("order_status_name",Hibernate.STRING)
            .addScalar("order_status_address",Hibernate.STRING)
            .addScalar("order_status_city",Hibernate.STRING)
            .addScalar("order_status_state",Hibernate.STRING)
            .addScalar("order_status_zip",Hibernate.STRING)
            .addScalar("order_status_sfx",Hibernate.STRING)
            .addScalar("order_status_status_date",Hibernate.TIMESTAMP)
            .addScalar("order_status_contact_name",Hibernate.STRING)
            .addScalar("order_status_contact_telnum",Hibernate.STRING)
            .addScalar("order_status_delivery_date",Hibernate.TIMESTAMP)
            .addScalar("order_status_date_ag_received",Hibernate.TIMESTAMP)
            .addScalar("order_status_user_ag_updated",Hibernate.STRING)
            .addScalar("order_status_date_ag_updated",Hibernate.TIMESTAMP)	
			.addScalar("case_number",Hibernate.STRING)
		    .addScalar("order_status_contract",Hibernate.STRING)
		    .addScalar("order_status_date_updated",Hibernate.TIMESTAMP)
		    .addScalar("order_status_orig_status_date",Hibernate.TIMESTAMP)
		    .addScalar("order_status_shipment_date",Hibernate.TIMESTAMP)
		    .addScalar("order_status_weight_rating",Hibernate.STRING)
		    .addScalar("order_status_fuel_type",Hibernate.STRING)
		    .addScalar("order_status_gpm",Hibernate.STRING)
		    .addScalar("order_status_mpg_b",Hibernate.STRING)
		    .addScalar("order_status_mpg_c",Hibernate.STRING)
		    .addScalar("order_status_mpg_h",Hibernate.STRING)
		    .addScalar("order_status_flex_gpm",Hibernate.STRING)
		    .addScalar("order_status_flex_fuel_mpg_b",Hibernate.STRING)
		    .addScalar("order_status_flex_fuel_mpg_c",Hibernate.STRING)
		    .addScalar("order_status_flex_fuel_mpg_h",Hibernate.STRING)
		    .addScalar("order_status_veh_color",Hibernate.STRING)
		    .addScalar("order_status_veh_trim",Hibernate.STRING)    
		    .addScalar("wk_flag",Hibernate.STRING)
            .setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3());
			}
			else{
				query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
			}
			queryresult = (ArrayList<OrderStatusCombinedDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Order Status Main failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return queryresult;
	}
	
	public ArrayList<RequisitionsDTO> fetchRequisitionsAgOrdNo(String agOrdNo) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<RequisitionsDTO> result = new ArrayList<RequisitionsDTO>();
		
		try{
			Query query =  session.createQuery("FROM RequisitionsDTO WHERE agencyOrderNo = :agencyOrderNoParam");
			query.setParameter("agencyOrderNoParam", agOrdNo);
			result = (ArrayList<RequisitionsDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<OrderStatusCombinedDTO> fetchOrderStatusPartialVINList(OrderStatusBean orderStatusBean, UserAccountDTO user) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<OrderStatusCombinedDTO> queryresult = null;
		try {           
			StringBuffer sqlBuff = new StringBuffer("SELECT DISTINCT ");
			sqlBuff.append("Order_Status.caseNo as case_number,");
			sqlBuff.append("Order_Status.VIN as order_status_vin,");
			sqlBuff.append("Order_Status.Veh_Order_No as order_status_von,");
			sqlBuff.append("Order_Status.Status as order_status_status,");
			sqlBuff.append("Order_Status.Name as order_status_name,");
			sqlBuff.append("Order_Status.Address as order_status_address,");
			sqlBuff.append("Order_Status.City as order_status_city,");
			sqlBuff.append("Order_Status.State as order_status_state ,");
			sqlBuff.append("Order_Status.Zip as order_status_zip,");
			sqlBuff.append("Order_Status.Sfx as order_status_sfx,");
			sqlBuff.append("Order_Status.Status_Date as order_status_status_date,");
			sqlBuff.append("Order_Status.Contact_Name as order_status_contact_name,");
			sqlBuff.append("Order_Status.Contact_Telno as order_status_contact_telnum ,");
			sqlBuff.append("Order_Status.Delivery_Date as order_status_delivery_date ,");
			sqlBuff.append("Order_Status.Date_Ag_Received as order_status_date_ag_received,");
			sqlBuff.append("Order_Status.User_Ag_Updated as order_status_user_ag_updated,");
			sqlBuff.append("Order_Status.Date_Ag_Updated as order_status_date_ag_updated,");		
			sqlBuff.append("Order_Status.caseno as case_number,");		
			sqlBuff.append("Order_Status.contract as order_status_contract,");
			sqlBuff.append("Order_Status.date_updated as order_status_date_updated,");
			sqlBuff.append("Order_Status.orig_status_date as order_status_orig_status_date,");
			sqlBuff.append("Order_Status.shipment_date as order_status_shipment_date,");		
			sqlBuff.append("Order_Status.weight_rating as order_status_weight_rating,");
			sqlBuff.append("Order_Status.fuel_type as order_status_fuel_type,");
			sqlBuff.append("Order_Status.gpm as order_status_gpm,");
			sqlBuff.append("Order_Status.mpg_b as order_status_mpg_b,");
			sqlBuff.append("Order_Status.mpg_c as order_status_mpg_c,");
			sqlBuff.append("Order_Status.mpg_h as order_status_mpg_h ,");
			sqlBuff.append("Order_Status.flex_gpm as order_status_flex_gpm,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_b as order_status_flex_fuel_mpg_b,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_c as order_status_flex_fuel_mpg_c,");
			sqlBuff.append("Order_Status.flex_fuel_mpg_h as order_status_flex_fuel_mpg_h,");
			sqlBuff.append("Order_Status.veh_color as order_status_veh_color ,");
			sqlBuff.append("Order_Status.veh_trim as order_status_veh_trim ,");	
			sqlBuff.append("Requisitions.Std_Item as req_std_item,");
			sqlBuff.append("Requisitions.Model as req_model,");
			sqlBuff.append("Requisitions.Agency_Code as req_agency_code ,");
			sqlBuff.append("Requisitions.Bureau_Code as req_bureau_code, ");
			sqlBuff.append("contr_case.order_date as contr_case_order_date ");
			sqlBuff.append(" FROM Order_Status, Requisitions ");
			if(orderStatusBean.getOrderAction().equalsIgnoreCase("COV")){				 
				sqlBuff.append(" , Contr_Case ");
			}
			else{
				sqlBuff.append(" LEFT JOIN Contr_Case ON Requisitions.CaseNo = Contr_Case.CaseNo ");
			}
			sqlBuff.append(" WHERE  ");
			sqlBuff.append(" Requisitions.CaseNo = Order_Status.CaseNo ");			
			sqlBuff.append(" AND Order_Status.VIN LIKE :partialVIN ");
			if(!user.getPrivilege().equals("6")){
				sqlBuff.append(" AND Requisitions.agency_code = :agencyCode ");
				if(user.getPrivilege().equals("4")){
					 sqlBuff.append(" AND Bureau_Code in (:bureauCodeList) ");
				}
				else{
					 sqlBuff.append(" AND Requisitions.bureau_code = :bureauCode ");
				}				
			}
			if(orderStatusBean.getOrderAction().equalsIgnoreCase("COV")){
				sqlBuff.append(" AND Requisitions.CaseNo = Contr_Case.CaseNo ");
				sqlBuff.append(" AND DateDiff(Now(), contr_case.shipment_date ) > 30 ");
			}
			sqlBuff.append(" ORDER BY Order_Status.VIN ");
			
			Query query = (session.createSQLQuery(sqlBuff.toString()))
				.addScalar("case_number",Hibernate.STRING)
				.addScalar("order_status_vin",Hibernate.STRING)
	            .addScalar("order_status_von",Hibernate.STRING)
	            .addScalar("order_status_status",Hibernate.STRING)
	            .addScalar("order_status_name",Hibernate.STRING)
	            .addScalar("order_status_address",Hibernate.STRING)
	            .addScalar("order_status_city",Hibernate.STRING)
	            .addScalar("order_status_state",Hibernate.STRING)
	            .addScalar("order_status_zip",Hibernate.STRING)
	            .addScalar("order_status_sfx",Hibernate.STRING)
	            .addScalar("order_status_status_date",Hibernate.TIMESTAMP)
	            .addScalar("order_status_contact_name",Hibernate.STRING)
	            .addScalar("order_status_contact_telnum",Hibernate.STRING)
	            .addScalar("order_status_delivery_date",Hibernate.TIMESTAMP)
	            .addScalar("order_status_date_ag_received",Hibernate.TIMESTAMP)
	            .addScalar("order_status_user_ag_updated",Hibernate.STRING)
	            .addScalar("order_status_date_ag_updated",Hibernate.TIMESTAMP)	
				.addScalar("case_number",Hibernate.STRING)
			    .addScalar("order_status_contract",Hibernate.STRING)
			    .addScalar("order_status_date_updated",Hibernate.TIMESTAMP)
			    .addScalar("order_status_orig_status_date",Hibernate.TIMESTAMP)
			    .addScalar("order_status_shipment_date",Hibernate.TIMESTAMP)
			    .addScalar("order_status_weight_rating",Hibernate.STRING)
			    .addScalar("order_status_fuel_type",Hibernate.STRING)
			    .addScalar("order_status_gpm",Hibernate.STRING)
			    .addScalar("order_status_mpg_b",Hibernate.STRING)
			    .addScalar("order_status_mpg_c",Hibernate.STRING)
			    .addScalar("order_status_mpg_h",Hibernate.STRING)
			    .addScalar("order_status_flex_gpm",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_b",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_c",Hibernate.STRING)
			    .addScalar("order_status_flex_fuel_mpg_h",Hibernate.STRING)
			    .addScalar("order_status_veh_color",Hibernate.STRING)
			    .addScalar("order_status_veh_trim",Hibernate.STRING)    
	            .addScalar("contr_case_order_date",Hibernate.TIMESTAMP)
				.addScalar("req_std_item",Hibernate.STRING)
	            .addScalar("req_model",Hibernate.STRING)
	            .addScalar("req_agency_code",Hibernate.STRING)
	            .addScalar("req_bureau_code",Hibernate.STRING)
	            .addScalar("contr_case_order_date",Hibernate.TIMESTAMP)
	            .setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			query.setParameter("partialVIN", '%' + orderStatusBean.getSearchKey1().trim() + '%');
			if(!user.getPrivilege().equals("6")){
				query.setParameter("agencyCode", user.getAgencyCode());
				if(user.getPrivilege().equals("4")){
					 if(user.getBureauCodeList() != null && user.getBureauCodeList().length() > 0){
						 ArrayList<String> items = (ArrayList<String>) Arrays.asList(user.getBureauCodeList().split("\\s*,\\s*"));
						 items.add(user.getBureauCode());
						 query.setParameterList("bureauCodeList",items);
					 }
					 else{
						 query.setParameter("bureauCodeList",user.getBureauCode());
					 }
				}
				else{
					 query.setParameter("bureauCode",user.getBureauCode());
				}
			}	
			queryresult = (ArrayList<OrderStatusCombinedDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Order Status Partial VIN List Failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return queryresult;
	}
	
	public String fetchRequisitionsCartStatus(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();
		String resultString = "";
		
		try{
			StringBuffer sqlBuff = new StringBuffer(" SELECT Requisitions_Cart.Status as  req_cart_status ");
			sqlBuff.append(" FROM Requisitions_Cart ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" , Order_Status ");
			}
			sqlBuff.append(" WHERE ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" Requisitions_Cart.Fed_Mil_Req_No_1 = :searchKey1 AND ");
				sqlBuff.append(" Requisitions_Cart.Fed_Mil_Req_No_2 = :searchKey2 AND ");
				sqlBuff.append(" Requisitions_Cart.Fed_Mil_Req_No_3 = :searchKey3");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" Order_Status.CaseNo = Requisitions_Cart.CaseNo_Real AND ");
				sqlBuff.append(" Order_Status.VIN = :searchKey1");
			}
			else{
				sqlBuff.append(" Requisitions_Cart.CaseNo_Real = :searchKey1");
			}
			Query query =  session.createSQLQuery(sqlBuff.toString())
					.addScalar("req_cart_status",Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				query.setParameter("searchKey1", orderStatusBean.getSearchKey1().toUpperCase().trim());
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2().toUpperCase().trim());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3().toUpperCase().trim());
			}
			else{
				query.setParameter("searchKey1", orderStatusBean.getSearchKey1().toUpperCase().trim());
			}
			result = (ArrayList<OrderStatusCombinedDTO>) query.list();
			if(result.size() > 0){
				resultString = result.get(0).getCase_number();
			}
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Requisitions Cart status failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return resultString;
	}
	
	public String fetchRequisitionsCartRemarks(String caseNo) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();
		String resultString = "";
		
		try{
			StringBuffer sqlBuff = new StringBuffer(" SELECT Requisitions_Cart.Remarks as  req_cart_remarks ");
			sqlBuff.append(" FROM Requisitions_Cart ");
			sqlBuff.append(" WHERE Requisitions_Cart.CaseNo_Real = :caseNoParam");
			Query query =  session.createSQLQuery(sqlBuff.toString())
					.addScalar("req_cart_remarks",Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			query.setParameter("caseNoParam", caseNo);
			
			result = (ArrayList<OrderStatusCombinedDTO>) query.list();
			if(result.size() > 0){
				resultString = result.get(0).getReq_cart_remarks();
			}
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Requisitions Cart remarks failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return resultString;
	}
	
	public ArrayList<AgBuTableDTO> fetchAgBuTable(String agencyCode, String bureauCode) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<AgBuTableDTO> result = new ArrayList<AgBuTableDTO>();
		
		try{
			Query query =  session.createQuery("FROM AgBuTableDTO WHERE agencyCode = :agencyCodeParam AND bureauCode = :bureauCodeParam");
			query.setParameter("agencyCodeParam", agencyCode);
			query.setParameter("bureauCodeParam", bureauCode);
			result = (ArrayList<AgBuTableDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select AgBuTableDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}
	
	public ArrayList<OrderStatusCombinedDTO> fetchContrCase(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();
		StringBuffer sqlBuff = new StringBuffer();
		
		try{
			sqlBuff.append(" SELECT Contr_Case.Contract as contr_case_contract,");   
			sqlBuff.append(" Contr_Case.Mod as contr_case_mod,");   
			sqlBuff.append(" Contr_Case.Sch_Line as contr_case_Sch_Line,");
			sqlBuff.append(" Contr_Case.Order_Date as contr_case_order_date,");   
			sqlBuff.append(" Contr_Case.Shipment_Date as contr_case_shipment_date,");
			sqlBuff.append(" Contr_Case.Quantity as contr_case_quantity,");
			sqlBuff.append(" Contr_Case.Unit_Price as contr_case_unit_price ,");
			sqlBuff.append(" Contr_Case.Sc as contr_case_sc ,");
			sqlBuff.append(" Contr_Case.CaseNo as case_number, ");
			sqlBuff.append(" ContrDUNS.Contr_Full_Name as contrduns_contract_full_name ");   
			sqlBuff.append(" FROM Requisitions, Contr_Case, ContrDUNS, Contract ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" , Order_Status ");
			}
			sqlBuff.append(" WHERE "); 
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_1 = :searchKey1 and ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_2 = :searchKey2 and ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_3 = :searchKey3 and ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" Order_Status.CaseNo = Requisitions.CaseNo and ");
				sqlBuff.append(" Order_Status.VIN = :searchKey1 and ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(" Requisitions.Agency_Order_No = :searchKey1 and ");
			}
			else{
				sqlBuff.append(" Requisitions.caseno = :searchKey1 and ");
			}	 		 
			sqlBuff.append(" Requisitions.CaseNo = Contr_Case.CaseNo  and ");
			sqlBuff.append(" Contract.Contract = Contr_Case.Contract  and ");
			sqlBuff.append(" ContrDUNS.contr_DUNS = Contract.contr_DUNS  ");
			 
			Query query =  session.createSQLQuery(sqlBuff.toString())
					.addScalar("contr_case_contract",Hibernate.STRING)
					.addScalar("contr_case_mod",Hibernate.STRING)
					.addScalar("contr_case_Sch_Line",Hibernate.STRING)
					.addScalar("contr_case_order_date",Hibernate.TIMESTAMP)
					.addScalar("contr_case_shipment_date",Hibernate.TIMESTAMP)
					.addScalar("contr_case_quantity",Hibernate.INTEGER)
					.addScalar("contr_case_unit_price",Hibernate.DOUBLE)
					.addScalar("contr_case_sc",Hibernate.STRING)
					.addScalar("case_number",Hibernate.STRING)
					.addScalar("contrduns_contract_full_name",Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){				
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3());
			}
						
			result = (ArrayList<OrderStatusCombinedDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Contract Case failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}
	
	public ArrayList<OrderStatusCombinedDTO> fetchContrLineOption(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();
		StringBuffer sqlBuff = new StringBuffer();		
		try{
			sqlBuff.append(" SELECT distinct Contr_line_Option.Option_Code as option_code,");
			sqlBuff.append(" Contr_line_Option.Current_Unit_Price as contr_line_opt_curr_unit_price,");
			sqlBuff.append(" Options_Table.Valid_Qty as options_table_valid_qty,");
			sqlBuff.append(" Option_File.Qty as option_file_qty,");
			sqlBuff.append(" Options_Table.Description as options_table_desc,");
			sqlBuff.append(" Options_Table.Category_Code as options_table_category_code,");	  
			sqlBuff.append(" Requisitions.CaseNo as case_number ");
			sqlBuff.append(" FROM  Requisitions,");
			sqlBuff.append(" Contr_Case,");
			sqlBuff.append(" Contr_line_Option,");    
			sqlBuff.append(" Option_File,");
			sqlBuff.append(" Options_Table ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" , Order_Status ");
			}
			sqlBuff.append(" WHERE ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_1 = :searchKey1 and ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_2 = :searchKey2 and ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_3 = :searchKey3 and ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" Order_Status.CaseNo = Requisitions.CaseNo and ");
				sqlBuff.append(" Order_Status.VIN = :searchKey1 and ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(" Requisitions.Agency_Order_No = :searchKey1 and ");
			}
			else{
				sqlBuff.append(" Requisitions.caseno = :searchKey1 and ");
			}		 		 
			sqlBuff.append(" ( Requisitions.CaseNo = Contr_Case.CaseNo ) and ");
			sqlBuff.append(" ( Requisitions.CaseNo = Option_File.CaseNo) and ");
			sqlBuff.append(" ( Contr_Case.Contract = Contr_line_Option.Contract) and "); 
			sqlBuff.append(" ( Contr_Case.Sch_Line = Contr_line_Option.Sch_Line) and ");
			sqlBuff.append(" ( Option_File.Option_Code = Options_Table.Option_Code ) and ");
			sqlBuff.append(" ( Option_File.Option_Code = Contr_line_Option.Option_Code) ");			
			 
			Query query =  session.createSQLQuery(sqlBuff.toString())
					.addScalar("option_code",Hibernate.STRING)
					.addScalar("contr_line_opt_curr_unit_price",Hibernate.DOUBLE)
					.addScalar("options_table_valid_qty",Hibernate.STRING)
					.addScalar("option_file_qty",Hibernate.INTEGER)
					.addScalar("options_table_desc",Hibernate.STRING)
					.addScalar("options_table_category_code",Hibernate.STRING)
					.addScalar("case_number",Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){				
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3());
			}
						
			result = (ArrayList<OrderStatusCombinedDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Contract Line Option failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}
	
	public ArrayList<OrderStatusCombinedDTO> fetchCOVReq(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<OrderStatusCombinedDTO> result = new ArrayList<OrderStatusCombinedDTO>();
		StringBuffer sqlBuff = new StringBuffer();		
		try{
			sqlBuff.append(" SELECT Distinct  Requisitions.Caseno as case_number, ");
			sqlBuff.append("  Requisitions.Fed_Mil_Req_No_1 as req_fed_mil_req_1, ");   
			sqlBuff.append("  Requisitions.Fed_Mil_Req_No_2 as req_fed_mil_req_2, ");   
			sqlBuff.append("  Requisitions.Fed_Mil_Req_No_3 as req_fed_mil_req_3, ");   
			sqlBuff.append("  Requisitions.Fed_Mil_Sup_Add as req_Fed_Mil_Sup_Add, ");   
			sqlBuff.append("  Requisitions.Std_Item as req_std_item, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Line1 as req_Mail_Add_Line1, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Line2 as req_Mail_Add_Line2, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Line3 as req_Mail_Add_Line3, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Line4 as req_Mail_Add_Line4, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Country as req_Mail_Add_Country, ");   
			sqlBuff.append("  Requisitions.Mail_Add_City as req_Mail_Add_City, ");   
			sqlBuff.append("  Requisitions.Mail_Add_State as req_Mail_Add_State, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Zip as req_Mail_Add_Zip, ");   
			sqlBuff.append("  Requisitions.Mail_Add_Zip_Sfx as req_Mail_Add_Zip_Sfx, "); 
			sqlBuff.append("  Requisitions.Agency_Code as req_agency_code, "); 
			sqlBuff.append("  Requisitions.Bureau_Code as req_bureau_code, "); 
			sqlBuff.append("  Requisitions.Date_Canceled as req_Date_Canceled, ");   
			sqlBuff.append("  Requisitions.Con_Email_Address as req_Con_Email_Address, ");
			sqlBuff.append("  Requisitions.Req_Email_Address as req_Req_Email_Address, ");
			sqlBuff.append("  Requisitions.Source as req_Source, ");
			sqlBuff.append("  Contract.Contract as contr_case_contract, ");
			sqlBuff.append("  Contract.Contr_DUNS as contract_contr_duns, ");
			sqlBuff.append("  Contract.Contract_Sc as contract_Contract_Sc, ");
			sqlBuff.append("  Contract.Sol_No_1 as contract_Sol_No_1, ");   
			sqlBuff.append("  Contract.Sol_No_2 as contract_Sol_No_2, ");   
			sqlBuff.append("  Contract.Sol_No_3 as contract_Sol_No_3 , ");   
			sqlBuff.append("  Contr_Case.Sch_Line as contr_case_Sch_Line, "); 
			sqlBuff.append("  Contr_Case.Order_Date as contr_case_order_date, ");
			sqlBuff.append("  Requisitions.Model as req_model, ");
			sqlBuff.append("  DATEDIFF(NOW(),contr_case.shipment_date) as daysCOV, ");
			sqlBuff.append("  Contr_Case.Shipment_Date as contr_case_shipment_date, ");
			sqlBuff.append("  ContrDUNS.Group_DUNS as contrduns_group_duns ");
			sqlBuff.append(" FROM Requisitions ");
			sqlBuff.append("  LEFT OUTER JOIN Order_Status  ");
			sqlBuff.append("  ON Requisitions.Caseno = Order_Status.Caseno, ");
			sqlBuff.append("  Contr_Case, ");
			sqlBuff.append("  Contract, ");
			sqlBuff.append("  ContrDUNS ");
			sqlBuff.append(" WHERE  ");
			sqlBuff.append(" Requisitions.Status in ('2', '4') ");
			sqlBuff.append(" AND Requisitions.CaseNo = Contr_Case.CaseNo ");
			sqlBuff.append(" AND Contr_Case.MOD in (SELECT MAX(cc.MOD) FROM Contr_Case cc WHERE cc.CaseNo = Contr_Case.CaseNo) ");
			sqlBuff.append(" AND Contr_Case.Contract = Contract.Contract ");
			sqlBuff.append(" AND Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" AND Requisitions.Fed_Mil_Req_No_1 = :searchKey1  ");
				sqlBuff.append(" AND Requisitions.Fed_Mil_Req_No_2 = :searchKey2  ");
				sqlBuff.append(" AND Requisitions.Fed_Mil_Req_No_3 = :searchKey3 ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
				sqlBuff.append(" AND Order_Status.VIN = :searchKey1 ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(" AND Requisitions.Agency_Order_No = :searchKey1 ");
			}
			else{
				sqlBuff.append(" AND Requisitions.caseno = :searchKey1 ");
			}	 
			 
			Query query =  session.createSQLQuery(sqlBuff.toString())					
					.addScalar("case_number",Hibernate.STRING)
					.addScalar("req_fed_mil_req_1",Hibernate.STRING)
					.addScalar("req_fed_mil_req_2",Hibernate.STRING)
					.addScalar("req_fed_mil_req_3",Hibernate.STRING)
					.addScalar("req_Fed_Mil_Sup_Add",Hibernate.STRING)
					.addScalar("req_std_item",Hibernate.STRING)
					.addScalar("req_Mail_Add_Line1",Hibernate.STRING)
					.addScalar("req_Mail_Add_Line2",Hibernate.STRING)
					.addScalar("req_Mail_Add_Line3",Hibernate.STRING)
					.addScalar("req_Mail_Add_Line4",Hibernate.STRING)
					.addScalar("req_Mail_Add_Country",Hibernate.STRING)
					.addScalar("req_Mail_Add_City",Hibernate.STRING)
					.addScalar("req_Mail_Add_State",Hibernate.STRING)
					.addScalar("req_Mail_Add_Zip",Hibernate.STRING)
					.addScalar("req_Mail_Add_Zip_Sfx",Hibernate.STRING)
					.addScalar("req_agency_code",Hibernate.STRING)
					.addScalar("req_bureau_code",Hibernate.STRING)
					.addScalar("req_Date_Canceled",Hibernate.STRING)
					.addScalar("req_Con_Email_Address",Hibernate.STRING)
					.addScalar("req_Req_Email_Address",Hibernate.STRING)
					.addScalar("contr_case_contract",Hibernate.STRING)
					.addScalar("contract_contr_duns",Hibernate.STRING)
					.addScalar("contract_Contract_Sc",Hibernate.STRING)
					.addScalar("contract_Sol_No_1",Hibernate.STRING)
					.addScalar("contract_Sol_No_2",Hibernate.STRING)
					.addScalar("contract_Sol_No_3",Hibernate.STRING)
					.addScalar("contr_case_Sch_Line",Hibernate.STRING)
					.addScalar("contr_case_order_date",Hibernate.TIMESTAMP)
					.addScalar("req_model",Hibernate.STRING)
					.addScalar("daysCOV",Hibernate.INTEGER)
					.addScalar("contrduns_group_duns",Hibernate.STRING)
					.addScalar("contr_case_shipment_date",Hibernate.TIMESTAMP)
					.setResultTransformer(Transformers.aliasToBean(OrderStatusCombinedDTO.class));
			query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){				
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3());
			}
						
			result = (ArrayList<OrderStatusCombinedDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select COV failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}
	
	public ArrayList<ReportEmailDTO> fetchReportEmailTable(String groupDUNS) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<ReportEmailDTO> result = new ArrayList<ReportEmailDTO>();
		
		try{
			Query query =  session.createQuery("FROM ReportEmailDTO WHERE report_Code = 'COV' AND selection_Code = :groupDUNS");
			query.setParameter("groupDUNS", groupDUNS);
			result = (ArrayList<ReportEmailDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select ReportEmailDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}
	
	public ArrayList<String> fetchVINList(OrderStatusBean orderStatusBean) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<String> result = new ArrayList<String>();
		StringBuffer sqlBuff = new StringBuffer();
		
		try{
			sqlBuff.append(" SELECT distinct Order_Status.VIN"); 
			sqlBuff.append(" FROM Requisitions, Order_Status "); 
			sqlBuff.append(" WHERE "); 
			sqlBuff.append(" Order_Status.CaseNo = Requisitions.CaseNo and ");
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_1 = :searchKey1  ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_2 = :searchKey2  ");
				sqlBuff.append(" Requisitions.Fed_Mil_Req_No_3 = :searchKey3  ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){				
				sqlBuff.append(" Order_Status.VIN = :searchKey1  ");
			}
			else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
				sqlBuff.append(" Requisitions.Agency_Order_No = :searchKey1  ");
			}
			else{
				sqlBuff.append(" Requisitions.caseno = :searchKey1  ");
			}	 		 
			sqlBuff.append(" ORDER BY Order_Status.VIN"); 
			 
			Query query =  session.createSQLQuery(sqlBuff.toString());
			query.setParameter("searchKey1", orderStatusBean.getSearchKey1());
			if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){				
				query.setParameter("searchKey2", orderStatusBean.getSearchKey2());
				query.setParameter("searchKey3", orderStatusBean.getSearchKey3());
			}
						
			result = (ArrayList<String>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select VIN List failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
		return result;
	}

}
