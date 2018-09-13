package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class  AvReportBuilderDTO {
	
     protected List<ReportBuilder> requisitionsList = new ArrayList<ReportBuilder>();
//     protected List<ReportBuilder> requisitionsList2 = new ArrayList<ReportBuilder>();
//     protected List<ReportBuilder> contractCaseList = new ArrayList<ReportBuilder>();
//     protected List<ReportBuilder> orderStatusList = new ArrayList<ReportBuilder>();
//     protected List<ReportBuilder> vehicleDataList = new ArrayList<ReportBuilder>(); 
//     protected List<ReportBuilder> buyerList = new ArrayList<ReportBuilder>();
      
//     protected ReportBuilder rptDTO = new ReportBuilder() ;

     
     
     private String formField ="";
	 private String formDisplay="";
	 private String columnNameOut="";
	 private String dbField ="";
	 private String dbSize ="";
	 private String category ="";  
       
   public List<ReportBuilder> getAvReportBuilderDTO() {
	 
     formField       = "Requisitions_Agency_Code";     // 1. form fields use
     formDisplay     = "Agency Code";                  // 2. display     
     columnNameOut   = "Agency_Code";                  //  3 column name for cfoutput   
     dbField         = "Requisitions.Agency_Code";     //  4. Database fields.
     dbSize          = "2";                            //  5. Database size.  
     category        = "FinancialData" ;            //  6. Category    
     
     ReportBuilder rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);
	 

     formField       = "Requisitions_Bureau_Code";    
     formDisplay     = "Bureau Code";                 
     columnNameOut   = "Bureau Code";                    
     dbField         = "Requisitions.Bureau_Code";    
     dbSize          = "2";          
     category        = "FinancialData" ;
     
     rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 
	 requisitionsList.add(rptDTO);


	 formField       = "Requisitions_Agency_Order_No";
	 formDisplay     = "Agency Order Number";
	 columnNameOut   = "Agency_Order_No";
	 dbField         = "concat(Requisitions.Agency_Order_No) as Agency_Order_No "; 
	 dbSize          = "20";
	 category        = "FinancialData" ;

	 rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);

	 

	 formField      = "Requisition_Number";
	 formDisplay    = "Requisition Number";
	 columnNameOut  = "Requisition_Number";
     dbField        = "concat(Requisitions.Fed_Mil_Req_No_1 ,space(6-length(Requisitions.Fed_Mil_Req_No_1)), Requisitions.Fed_Mil_Req_No_2 ,space(5-length(Requisitions.Fed_Mil_Req_No_2)), Requisitions.Fed_Mil_Req_No_3,space(5-length(Requisitions.Fed_Mil_Req_No_3))) as Requisition_Number"; 
     dbSize         = "16";
     category        = "FinancialData" ;

     rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);
	 
	 
	  formField    = "Requisitions_CaseNo";
	  formDisplay       = "Case Number";
	  columnNameOut     = "CaseNo";
	  dbField     = "Requisitions.CaseNo";
	  dbSize    = "6";
	  category        = "FinancialData" ;
	 
	 rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);

	  formField = "Requisitions_Fed_Mil_Signal";
 	  formDisplay    = "Signal Code";
 	  columnNameOut  = "Fed_Mil_Signal";
 	  dbField  = "Requisitions.Fed_Mil_Signal";
 	  dbSize    = "1";
 	  category        = "FinancialData" ;

 	 rptDTO = new ReportBuilder() ;
 	 rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);
 

     formField = "Requisitions_Fed_Mil_Fund";
     formDisplay    = "Fund Code";
	 columnNameOut  = "Fed_Mil_Fund";
	 dbField  = "Requisitions.Fed_Mil_Fund";
     dbSize    = "2";
     category        = "FinancialData" ;

     rptDTO = new ReportBuilder() ;
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);

	  formField = "Requisitions_Fed_Mil_Sup_Add";
	  formDisplay    = "Supplemental Address";
	  columnNameOut  = "Fed_Mil_Sup_Add";
	  dbField  = "Requisitions.Fed_Mil_Sup_Add";
	  dbSize    = "6";
	  category        = "FinancialData" ;
	  
	 rptDTO = new ReportBuilder() ; 
     rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);
	 
	 formField = "Requisitions_Date_Received";
	 formDisplay    = "Date Received";
	 columnNameOut  = "Date_Received";
	 dbField  = "Date_Format(Requisitions.Date_Received,'%Y-%m-%d') as Date_Received";
	 dbSize    = "20";
	 category        = "FinancialData" ;  

	 rptDTO = new ReportBuilder() ;
	 rptDTO.setFormField(formField);
	 rptDTO.setFormDisplay(formDisplay);
     rptDTO.setColumnNameOut(columnNameOut);
	 rptDTO.setDbField(dbField);
	 rptDTO.setDbSize(dbSize);
	 rptDTO.setCategory(category);
	 
	 requisitionsList.add(rptDTO);
 

	  formField = "Requisitions_Date_Canceled";
	  formDisplay    = "Date Canceled";
	  columnNameOut  = "Date_Canceled";
	  dbField  = "Date_Format(Requisitions.Date_Canceled,'%Y-%m-%d') as Date_Canceled";
	  dbSize    = "20";
	  category        = "FinancialData" ;

	  rptDTO = new ReportBuilder() ;
      rptDTO.setFormField(formField);
	  rptDTO.setFormDisplay(formDisplay);
      rptDTO.setColumnNameOut(columnNameOut);
	  rptDTO.setDbField(dbField);
	  rptDTO.setDbSize(dbSize);
 	  rptDTO.setCategory(category);
	 
	   requisitionsList.add(rptDTO);

//	   formField= "Requisitions_Cart.Remarks";
// 	   formDisplay   = "Agency Financial Data";
// 	   columnNameOut = "Remarks";
// 	   dbField = "(if(Requisitions.Remarks is null,Requisitions_Cart.Remarks,(if(Requisitions.Remarks ='',Requisitions_Cart.Remarks,Requisitions.Remarks)))) as Remarks";
//       dbSize    = "80";
//       category        = "FinancialData" ;
//       
//       rptDTO = new ReportBuilder() ; 
//       rptDTO.setFormField(formField);
//  	   rptDTO.setFormDisplay(formDisplay);
//       rptDTO.setColumnNameOut(columnNameOut);
//	   rptDTO.setDbField(dbField);
//	   rptDTO.setDbSize(dbSize);
//  	   rptDTO.setCategory(category);
//
//	   requisitionsList.add(rptDTO);

	   
	   //requisition list 2
 	 
	   formField  = "Req_Add_Line";
 	   formDisplay  = "Requisitioner Address";
 	   columnNameOut  = "Req_Add_Line";
 	   dbField = "concat(Requisitions.Req_Add_Line1,space(35-length(Requisitions.Req_Add_Line1)),Requisitions.Req_Add_Line2,space(35-length(Requisitions.Req_Add_Line2)),Requisitions.Req_Add_Line3,space(35-length(Requisitions.Req_Add_Line3)),Requisitions.Req_Add_Line4,space(35-length(Requisitions.Req_Add_Line4)),Requisitions.Req_Add_City,space(20-length(Requisitions.Req_Add_City)),Requisitions.Req_Add_State,space(2-length(Requisitions.Req_Add_State)),Requisitions.Req_Add_Zip,space(5-length(Requisitions.Req_Add_Zip)),Requisitions.Req_Add_Zip_SFX,space(4-length(Requisitions.Req_Add_Zip_SFX)),Requisitions.Req_Add_Country,space(15-length(Requisitions.Req_Add_Country)),Requisitions.Req_Email_Address,space(50-length(Requisitions.Req_Email_Address))) as Req_Add_Line";
 	   dbSize   = "236";
 	   category        = "ContactInfo" ;

       rptDTO = new ReportBuilder() ; 
       rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
  	   rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);

 	   
 	   formField  = "Mail_Add_Line";
	   formDisplay  = "Mailing Address";
	   columnNameOut  = "Mail_Add_Line";
	   dbField = "concat(Requisitions.Mail_Add_Line1,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line1)))),Requisitions.Mail_Add_Line2,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line2)))),Requisitions.Mail_Add_Line3,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line3)))),  Requisitions.Mail_Add_Line4,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line4)))),Requisitions.Mail_Add_City,SPACE(20-(LENGTH(trim(Requisitions.Mail_Add_City)))),Requisitions.Mail_Add_State,SPACE(2-(LENGTH(trim(Requisitions.Mail_Add_State)))), Requisitions.Mail_Add_ZIP,SPACE(5-(LENGTH(trim(Requisitions.Mail_Add_ZIP)))),  Requisitions.Mail_Add_Country,SPACE(15-(LENGTH(trim(Requisitions.Mail_Add_Country))))) as Mail_Add_Line";
	   dbSize   = "236";
 	   category        = "ContactInfo" ;
	 
       rptDTO = new ReportBuilder() ; 
	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
  	   rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);

 	   
 	   formField  = "Con_Add_Line"; 
       formDisplay  = "Consignee Address";
 	   columnNameOut  = "Con_Add_Line";
 	   dbField = "concat(Requisitions.Con_Add_Line1,space(35-length(Requisitions.Con_Add_Line1)),Requisitions.Con_Add_Line2,space(35-length(Requisitions.Con_Add_Line2)),Requisitions.Con_Add_Line3,space(35-length(Requisitions.Con_Add_Line3)),Requisitions.Con_Add_Line4,space(35-length(Requisitions.Con_Add_Line4)),Requisitions.Con_Add_City,space(20-length(Requisitions.Con_Add_City)),Requisitions.Con_Add_State,space(2-length(Requisitions.Con_Add_State)),Requisitions.Con_Add_Zip,space(5-length(Requisitions.Con_Add_Zip)),Requisitions.Con_Add_Zip_SFX,space(4-length(Requisitions.Con_Add_Zip_SFX)),Requisitions.Con_Add_Country,space(15-length(Requisitions.Con_Add_Country)),Requisitions.Con_Email_Address,space(50-length(Requisitions.Con_Email_Address))) as Con_Add_Line";
 	   dbSize   = "236";
 	   category        = "ContactInfo" ;
 	   
       rptDTO = new ReportBuilder() ; 
       rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
       rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);
 	   
 	   formField  = "Requisitions_Con_Fax_Number";
       formDisplay  = "Consignee Fax";
 	   columnNameOut  = "Con_Fax_Number";
 	   dbField = "Requisitions.Con_Fax_Number";
 	   dbSize   = "20";
 	   category        = "ContactInfo" ;

       rptDTO = new ReportBuilder() ; 
       rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
 	   requisitionsList.add(rptDTO);

 	   
 	   formField  = "Message_Line";
       formDisplay  = "Message Line";
 	   columnNameOut  = "Message_Line";
 	   dbField = "concat(Requisitions.Message_Line1,space(35-length(Requisitions.Message_Line1)),Requisitions.Message_Line2,space(35-length(Requisitions.Message_Line2)),Requisitions.Message_Line3,space(35-length(Requisitions.Message_Line3))) as Message_Line ";
 	   dbSize   = "105";
 	   category        = "ContactInfo" ;

       rptDTO = new ReportBuilder() ; 
       rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);

 	   formField  = "Point_of_Contact";
 	   formDisplay  = "Point of Contact";
 	   columnNameOut  = "Point_of_Contact";
 	   dbField = "Requisitions.Message_Line4 as Point_of_Contact";
 	   dbSize   = "35";
 	   category        = "ContactInfo" ;
 	   
       rptDTO = new ReportBuilder() ; 
       rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);

 	   formField  = "Phone";
 	   formDisplay  = "Agency Bureau Phone";
 	   columnNameOut  = "Agency_Bureau_Phone";
 	   dbField = "Requisitions.Message_Line5 as Agency_Bureau_Phone";
 	   dbSize   = "35";
 	   category        = "ContactInfo" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
 	   requisitionsList.add(rptDTO);
 	   	
// contract data
 	   
	   formField       = "Contr_Case_Contract";
 	   formDisplay     = "Contract";
 	   columnNameOut      = "Contract";
 	   dbField       = "Contr_Case.Contract"; 
 	   dbSize      = "5"; 
 	   category        = "ContactData" ;

 	   rptDTO = new ReportBuilder() ; 
	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);
 	   

 	   formField       = "ContrDUNS_Contr_Abbrv_Name";
 	   formDisplay      = "Contractor Name";
 	   columnNameOut      = "Contr_Abbrv_Name";
 	   dbField       = "ContrDUNS.Contr_Abbrv_Name";
 	   dbSize      = "20"; 
 	   category        = "ContactData" ;
	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField       = "Contr_Case_Mod";
 	   formDisplay      = "Mod Number";
 	   columnNameOut      = "Modification";
 	   dbField       = "Contr_Case.Mod as Modification";
 	   dbSize      = "3"; 
 	   category        = "ContactData" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);
	   
 	   formField       = "Est_Unit_Price";
 	   formDisplay      = "Estimated Unit Price";
 	   columnNameOut      = "Est_Unit_Price";
 	   dbField       = "TRUNCATE(Requisitions.Est_Unit_Price,2) as Est_Unit_Price";
 	   dbSize      = "25"; 
 	   category        = "ContactData" ;

       rptDTO = new ReportBuilder() ; 
	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 

 	   formField       = "Est_Unit_Price1";     //for some reason if you change the name into order date it wont be save in the query
 	   formDisplay      = "Order Date";
 	   columnNameOut      = "Order_Date";
 	   dbField       = "Date_Format(Contr_Case.Order_Date,'%Y-%m-%d') as Order_Date";
 	   dbSize      = "20"; 
 	   category        = "ContactData" ;
	   
       rptDTO = new ReportBuilder() ; 
	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	
	   formField       = "Contr_Case_Quantity";
 	   formDisplay      = "Quantity";
 	   columnNameOut      = "Quantity";
 	   dbField       = "Contr_Case.Quantity - Contr_Case.Prev_Units as Quantity"; 
 	   dbSize      = "10"; 
 	   category        = "ContactData" ;

 	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField       = "Actual_Unit_Price";
 	   formDisplay      = "Actual Unit Price";
 	   columnNameOut      = "Actual_Unit_Price";
 	   dbField       = "(Contr_Case.Unit_Price) - (Contr_Case.Prev_Unit_Price) as  Actual_Unit_Price ";
 	   dbSize      = "25"; 
 	   category        = "ContactData" ;

 	   
 	   rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

	// status info 
	   
//	     order_status.Delivery_date 
//	   	 order_status.Date_Ag_Recieved 
//	   	 order_status.User_Ag_updated
//	   	 order_status.Weight_Rating 
//	   	 order_status.Fuel_Type
//	   	 order_status.GPM 
//	   	 order_status.MPG_B 
//	   	 order_status.MPG_c 
//	   	 order_status.MPG_H
//	   	 order_status.Flex_GPM 
//	   	 order_status.Flex_Fuel_MPG_B
//	   	 order_status.Flex_Fuel_MPG_c 
//	   	 order_status.Flex_Fuel_MPG_H 
//	   	 order_status.Veh_Color 
//	   	 order_status.Veh_Trim 

		 
		 
 	   formField ="Order_Status_Veh_Order_No";
 	   formDisplay ="Vehicle Order Number";
 	   columnNameOut ="Veh_Order_No";
 	   dbField ="Order_Status.Veh_Order_No";
 	   dbSize  ="8";
 	   category        = "OrderStatus" ;
 	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField ="Order_Status_VIN";
 	   formDisplay ="VIN";
 	   columnNameOut ="VIN";
 	   dbField ="Order_Status.VIN";
 	   dbSize  ="17";
 	   category        = "OrderStatus" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

	   
 	   formField ="Order_Status_Status";
 	   formDisplay ="Status";
 	   columnNameOut ="Status";
 	   dbField ="Order_Status.Status";
 	   dbSize  ="2";
 	   category        = "OrderStatus" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField ="Order_Status_VIN1";
 	   formDisplay ="Shipment Date";
 	   columnNameOut ="Shipment_Date";
 	   dbField ="Date_Format(Contr_Case.Shipment_Date,'%Y-%m-%d') as Shipment_Date";
 	   dbSize  ="20";
 	   category        = "OrderStatus" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);
	   
		 
	
	 	   formField ="Date_Status";
	 	   formDisplay ="Status Date";
	 	   columnNameOut ="Status_Date";
	 	   dbField ="Date_Format(Order_Status.Status_Date,'%Y-%m-%d') as Status_Date ";
	 	   dbSize  ="20";
	 	   category        = "OrderStatus" ;

	       rptDTO = new ReportBuilder() ; 
	 	   rptDTO.setFormField(formField);
		   rptDTO.setFormDisplay(formDisplay);
	       rptDTO.setColumnNameOut(columnNameOut);
		   rptDTO.setDbField(dbField);
		   rptDTO.setDbSize(dbSize);
		   rptDTO.setCategory(category);
		 
			 requisitionsList.add(rptDTO);
		   
		 
		 
	   formField ="Order_Status_Name";
 	   formDisplay ="Deliver To";
 	   columnNameOut ="Name";
 	   dbField ="Order_Status.Name";
 	   dbSize  ="35";
 	   category        = "OrderStatus" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField ="Delivery_Address";
 	   formDisplay ="Delivery Address";
 	   columnNameOut ="Delivery_Address";
 	   dbField ="concat(Order_Status.Address,space(35-length(Order_Status.Address)),Order_Status.City,space(20-length(Order_Status.City)),Order_Status.State,space(2-length(Order_Status.State)),Order_Status.Zip,space(5-length(Order_Status.Zip))) as Delivery_Address";
 	   dbSize  ="236";
 	   category        = "OrderStatus" ;
	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

	 	   formField ="Order_Status_Contact_Name";
	 	   formDisplay ="Contact Name";
	 	   columnNameOut ="Contact_Name";
	 	   dbField ="Order_Status.Contact_Name";
	 	   dbSize  ="35";
	 	   category        = "OrderStatus" ;
		   
	       rptDTO = new ReportBuilder() ; 
	 	   rptDTO.setFormField(formField);
		   rptDTO.setFormDisplay(formDisplay);
	       rptDTO.setColumnNameOut(columnNameOut);
		   rptDTO.setDbField(dbField);
		   rptDTO.setDbSize(dbSize);
		   rptDTO.setCategory(category);
		 
			 requisitionsList.add(rptDTO);

		   
		   
// Vehicle data

 	   formField ="Requisitions_Veh_Type";
 	   formDisplay ="Veh_Type";
 	   columnNameOut ="Veh_Type";
 	   dbField ="Std_Items.Veh_Type";
 	   dbSize  ="2";
 	   category        = "VehicleData" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

 	   formField ="Requisitions_Std_Item";
 	   formDisplay ="Standard Item";
 	    columnNameOut ="Std_Item";
 	   dbField ="Requisitions.Std_Item";
 	   dbSize  ="4";
 	   category        = "VehicleData" ;
	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
		 requisitionsList.add(rptDTO);

	   
 	   formField ="Std_Items_Description";
 	   formDisplay ="Standard Item Description";
 	    columnNameOut ="Description";
 	   dbField ="Std_Items.Description";
 	   dbSize  ="60";
 	   category        = "VehicleData" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	  
	   requisitionsList.add(rptDTO);

 	   
 	   formField ="Requisitions_Model";
 	   formDisplay ="Model";
       columnNameOut ="Model";
 	   dbField ="Requisitions.Model";
 	   dbSize  ="10";
 	   category        = "VehicleData" ;

       rptDTO = new ReportBuilder() ; 
	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
       requisitionsList.add(rptDTO);

 	   formField ="Requisitions_Veh_Color";
 	   formDisplay ="Color";
       columnNameOut ="Veh_Color";
 	   dbField ="Requisitions.Veh_Color";
 	   dbSize  ="60";
 	   category        = "VehicleData" ;
 	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
  	   requisitionsList.add(rptDTO);


 	   formField ="Option_File_Option_Code";
 	   formDisplay ="Option Code";
 	    columnNameOut ="Option_Code";
 	   dbField ="Option_File.Option_Code";
 	   dbSize  ="4";
 	   category        = "VehicleData" ;

       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	   requisitionsList.add(rptDTO);

//BUYER 
	   
	   formField ="Buyer_Name";
	   formDisplay ="Buyer Name";
	   columnNameOut ="Buyer_Name";
	   dbField ="concat(Buyer_Table.First_Name,space(15-length(Buyer_Table.First_Name)),Buyer_Table.Last_Name,space(15-length(Buyer_Table.Last_Name))) as buyer_name";
	   dbSize ="30";
 	   category        = "BuyerData" ;
 	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
	   requisitionsList.add(rptDTO);

	   formField ="Buyer_Table_Phone";
	   formDisplay ="Buyer Phone";
	   columnNameOut ="Buyer_Phone";
	   dbField  ="Buyer_Table.Phone as Buyer_Phone";
	   dbSize ="12";
 	   category        = "BuyerData" ;
	   
       rptDTO = new ReportBuilder() ; 
 	   rptDTO.setFormField(formField);
	   rptDTO.setFormDisplay(formDisplay);
       rptDTO.setColumnNameOut(columnNameOut);
	   rptDTO.setDbField(dbField);
	   rptDTO.setDbSize(dbSize);
	   rptDTO.setCategory(category);
	 
	   requisitionsList.add(rptDTO);

 return requisitionsList;
 	   
   }


public List<ReportBuilder> getRequisitionsList() {
	return requisitionsList;
}


public void setRequisitionsList(List<ReportBuilder> requisitionsList) {
	this.requisitionsList = requisitionsList;
}







public String getFormField() {
	return formField;
}


public void setFormField(String formField) {
	this.formField = formField;
}


public String getFormDisplay() {
	return formDisplay;
}


public void setFormDisplay(String formDisplay) {
	this.formDisplay = formDisplay;
}


public String getColumnNameOut() {
	return columnNameOut;
}


public void setColumnNameOut(String columnNameOut) {
	this.columnNameOut = columnNameOut;
}


public String getDbField() {
	return dbField;
}


public void setDbField(String dbField) {
	this.dbField = dbField;
}


public String getDbSize() {
	return dbSize;
}


public void setDbSize(String dbSize) {
	this.dbSize = dbSize;
}      
       
 		
 	
}
