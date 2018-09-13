package gov.gsa.fas.AutoChoice.util;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class fsrReportBuilderFieldList {
	protected ArrayList<ReportBuilder> fsrReportFieldList = new ArrayList<ReportBuilder>();
	public ArrayList<ReportBuilder> getFSRReportFieldListDTO() {
		ReportBuilder rptDTO = new ReportBuilder() ;

		rptDTO.setFormField("requisitions_agency_order_no");
		rptDTO.setFormDisplay("Agency Order Number");
		rptDTO.setColumnNameOut("requisitions_agency_order_no");
		rptDTO.setDbField("concat(Requisitions.Agency_Order_No) as 'Agency Order Number' ");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_agency_code");
		rptDTO.setFormDisplay("Agency Code");
		rptDTO.setColumnNameOut("Agency Code");
		rptDTO.setDbField("requisitions.agency_code as 'Agency Code'" );
		rptDTO.setDbSize("2");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_bureau_code");
		rptDTO.setFormDisplay("Bureau Code");
		rptDTO.setColumnNameOut("Bureau Code");
		rptDTO.setDbField("requisitions.bureau_code as 'Bureau Code'");
		rptDTO.setDbSize("2");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_req_no");
		rptDTO.setFormDisplay("Requisition Number");
		rptDTO.setColumnNameOut("requisitions_req_no");
		rptDTO.setDbField("concat(Requisitions.Fed_Mil_Req_No_1 ,space(6-length(Requisitions.Fed_Mil_Req_No_1)), Requisitions.Fed_Mil_Req_No_2 ,space(5-length(Requisitions.Fed_Mil_Req_No_2)), Requisitions.Fed_Mil_Req_No_3,space(5-length(Requisitions.Fed_Mil_Req_No_3)))  as 'Req Number' ");
		rptDTO.setDbSize("16");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_caseNo");
		rptDTO.setFormDisplay("Case Number");
		rptDTO.setColumnNameOut("contr_case_caseNo");
		rptDTO.setDbField("requisitions.caseno as 'Case Number'");
		rptDTO.setDbSize("6");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_fed_mil_signal");
		rptDTO.setFormDisplay("Fed Mil Signal");
		rptDTO.setColumnNameOut("requisitions_fed_mil_signal");
		rptDTO.setDbField("requisitions.fed_mil_signal as 'Fed Mil Signal'");
		rptDTO.setDbSize("1");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_fed_mil_fund");
		rptDTO.setFormDisplay("Fund Code");
		rptDTO.setColumnNameOut("requisitions_fed_mil_fund");
		rptDTO.setDbField("requisitions.fed_mil_fund as 'Fund Code'");
		rptDTO.setDbSize("2");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_fed_mil_sup_add");
		rptDTO.setFormDisplay("Supplemental Address");
		rptDTO.setColumnNameOut("requisitions_fed_mil_sup_add");
		rptDTO.setDbField("requisitions.fed_mil_sup_add as 'Supplemental Address'");
		rptDTO.setDbSize("6");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_date_received");
		rptDTO.setFormDisplay("Date Received");
		rptDTO.setColumnNameOut("requisitions_date_received");
		rptDTO.setDbField("requisitions.date_received as 'Date Received'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_date_canceled");
		rptDTO.setFormDisplay("Date Canceled");
		rptDTO.setColumnNameOut("requisitions_date_canceled");
		rptDTO.setDbField("requisitions.date_canceled as 'Date Canceled'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_remarks");
		rptDTO.setFormDisplay("Agency Financial Data");
		rptDTO.setColumnNameOut("requisitions_remarks");
		rptDTO.setDbField("(if(Requisitions.Remarks is null,requisitions_cart.Remarks,(if(Requisitions.Remarks ='',requisitions_cart.Remarks,Requisitions.Remarks)))) as 'Agency Financial Data'");
		rptDTO.setDbSize("80");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_req_add_line");
		rptDTO.setFormDisplay("Requisitioner Address");
		rptDTO.setColumnNameOut("requisitions_req_add_line");
		rptDTO.setDbField("concat(requisitions.Req_Add_Line1,space(35-length(requisitions.Req_Add_Line1)),requisitions.Req_Add_Line2," + 
				"space(35-length(requisitions.Req_Add_Line2)),requisitions.Req_Add_Line3,space(35-length(requisitions.Req_Add_Line3))," + 
				"requisitions.Req_Add_Line4,space(35-length(requisitions.Req_Add_Line4)),requisitions.Req_Add_City,space(20-length(requisitions.Req_Add_City))," +
				"requisitions.Req_Add_State,space(2-length(requisitions.Req_Add_State)),requisitions.Req_Add_Zip,space(5-length(requisitions.Req_Add_Zip))," + 
				"requisitions.Req_Add_Zip_SFX,space(4-length(requisitions.Req_Add_Zip_SFX)),requisitions.Req_Add_Country," + 
				"space(15-length(requisitions.Req_Add_Country)),requisitions.Req_Email_Address,space(50-length(requisitions.Req_Email_Address))) as 'Requisitioner Address'");
		rptDTO.setDbSize("236");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_req_mail_line");
		rptDTO.setFormDisplay("Mailing Address");
		rptDTO.setColumnNameOut("requisitions_req_mail_line");
		rptDTO.setDbField("concat(requisitions.Mail_Add_Line1,SPACE(35-(LENGTH(trim(requisitions.Mail_Add_Line1)))),requisitions.Mail_Add_Line2," + 
				"SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line2)))),Requisitions.Mail_Add_Line3,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line3))))," + 
				"Requisitions.Mail_Add_Line4,SPACE(35-(LENGTH(trim(Requisitions.Mail_Add_Line4)))),Requisitions.Mail_Add_City," + 
				"SPACE(20-(LENGTH(trim(Requisitions.Mail_Add_City)))),Requisitions.Mail_Add_State,SPACE(2-(LENGTH(trim(Requisitions.Mail_Add_State))))," +
				"Requisitions.Mail_Add_ZIP,SPACE(5-(LENGTH(trim(Requisitions.Mail_Add_ZIP)))),  Requisitions.Mail_Add_Country," + 
				"SPACE(15-(LENGTH(trim(Requisitions.Mail_Add_Country))))) as 'Mailing Address'");
		rptDTO.setDbSize("236");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_con_add_line");
		rptDTO.setFormDisplay("Consignee Address");
		rptDTO.setColumnNameOut("requisitions_con_add_line");
		rptDTO.setDbField("concat(requisitions.Con_Add_Line1,space(35-length(requisitions.Con_Add_Line1)),requisitions.Con_Add_Line2," + 
				"space(35-length(Requisitions.Con_Add_Line2)),Requisitions.Con_Add_Line3,space(35-length(Requisitions.Con_Add_Line3))," + 
				"Requisitions.Con_Add_Line4,space(35-length(Requisitions.Con_Add_Line4)),Requisitions.Con_Add_City," + 
				"space(20-length(Requisitions.Con_Add_City)),Requisitions.Con_Add_State,space(2-length(Requisitions.Con_Add_State))," + 
				"Requisitions.Con_Add_Zip,space(5-length(Requisitions.Con_Add_Zip)),Requisitions.Con_Add_Zip_SFX," + 
				"space(4-length(Requisitions.Con_Add_Zip_SFX)),Requisitions.Con_Add_Country,space(15-length(Requisitions.Con_Add_Country))," + 
				"Requisitions.Con_Email_Address,space(50-length(Requisitions.Con_Email_Address))) as 'Consignee Address'");
		rptDTO.setDbSize("236");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_con_fax_number");
		rptDTO.setFormDisplay("Consignee Fax");
		rptDTO.setColumnNameOut("requisitions_con_fax_number");
		rptDTO.setDbField("requisitions.Con_Fax_Number as 'Consignee Fax'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_message_line");
		rptDTO.setFormDisplay("Message Line");
		rptDTO.setColumnNameOut("requisitions_message_line");
		rptDTO.setDbField("concat(requisitions.Message_Line1,space(35-length(requisitions.Message_Line1)),requisitions.Message_Line2," + 
				"space(35-length(requisitions.Message_Line2)),requisitions.Message_Line3,space(35-length(requisitions.Message_Line3))) as 'Message Line'");
		rptDTO.setDbSize("105");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_message_line4");
		rptDTO.setFormDisplay("Point of Contact");
		rptDTO.setColumnNameOut("requisitions_message_line4");
		rptDTO.setDbField("requisitions.Message_Line4 as 'Point of Contact'");
		rptDTO.setDbSize("35");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_message_line5");
		rptDTO.setFormDisplay("Agency Bureau Phone");
		rptDTO.setColumnNameOut("requisitions_message_line5");
		rptDTO.setDbField("requisitions.Message_Line5 as 'Agency Bureau Phone'");
		rptDTO.setDbSize("35");
		rptDTO.setCategory("Requisitions");	 
		fsrReportFieldList.add(rptDTO);		
		
		
		

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_contract");
		rptDTO.setFormDisplay("Contract");
		rptDTO.setColumnNameOut("contr_case_contract");
		rptDTO.setDbField("contr_case.Contract as 'Contract'");
		rptDTO.setDbSize("5");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contrduns_contr_abbrv_name");
		rptDTO.setFormDisplay("Contractor Name");
		rptDTO.setColumnNameOut("contrduns_contr_abbrv_name");
		rptDTO.setDbField("contrduns.Contr_Abbrv_Name as 'Contractor Name'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_mod");
		rptDTO.setFormDisplay("Mod Number");
		rptDTO.setColumnNameOut("contr_case_mod");
		rptDTO.setDbField("contrduns.Contr_Abbrv_Name as 'Mod Number'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_est_unit_price");
		rptDTO.setFormDisplay("Estimated Unit Price");
		rptDTO.setColumnNameOut("requisitions_est_unit_price");
		rptDTO.setDbField("TRUNCATE(requisitions.Est_Unit_Price,2) as 'Estimated Unit Price'");
		rptDTO.setDbSize("25");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_actual_unit_price");
		rptDTO.setFormDisplay("Actual Unit Price");
		rptDTO.setColumnNameOut("contr_case_actual_unit_price");
		rptDTO.setDbField("truncate(contr_case.unit_price * (1 + (contr_case.Sc / 100)),2) as  'Actual Unit Price'");
		rptDTO.setDbSize("25");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_order_date");
		rptDTO.setFormDisplay("Order Date");
		rptDTO.setColumnNameOut("contr_case_order_date");
		rptDTO.setDbField("contr_case.Order_Date as 'Order Date' ");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_quantity");
		rptDTO.setFormDisplay("Quantity");
		rptDTO.setColumnNameOut("contr_case_quantity");
		rptDTO.setDbField("contr_case.Quantity as 'Quantity' ");
		rptDTO.setDbSize("10");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_ship_date");
		rptDTO.setFormDisplay("Contract Shipment Date");
		rptDTO.setColumnNameOut("order_status_ship_date");
		rptDTO.setDbField("contr_case.Shipment_Date as 'Contract Shipment Date'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("Contrcase");	 
		fsrReportFieldList.add(rptDTO);
		
		

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("order_status_veh_order_no");
		rptDTO.setFormDisplay("Vehicle Order Number");
		rptDTO.setColumnNameOut("order_status_veh_order_no");
		rptDTO.setDbField("order_status.Veh_Order_No as 'Vehicle Order Number'");
		rptDTO.setDbSize("8");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("order_status_vin");
		rptDTO.setFormDisplay("VIN");
		rptDTO.setColumnNameOut("order_status_vin");
		rptDTO.setDbField("order_status.VIN as 'VIN'");
		rptDTO.setDbSize("17");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("order_status_status_date");
		rptDTO.setFormDisplay("Status");
		rptDTO.setColumnNameOut("order_status_status_date");
		rptDTO.setDbField("IF (order_status.Status in ('CC','DD','AN'),LEFT(Order_Status.status_date, 10), 'In Process') as 'Status'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("contr_case_shipment_date");
		rptDTO.setFormDisplay("Shipment Date");
		rptDTO.setColumnNameOut("contr_case_shipment_date");
		rptDTO.setDbField("Contr_Case.Shipment_Date as 'Shipment Date'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("order_status_deliverydt");
		rptDTO.setFormDisplay("Delivery Date");
		rptDTO.setColumnNameOut("order_status_deliverydt");
		rptDTO.setDbField("order_status.delivery_Date as 'Delivery Date'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Date_Status");
		rptDTO.setFormDisplay("Status Date");
		rptDTO.setColumnNameOut("Date_Status");
		rptDTO.setDbField("Order_Status.Status_Date as 'Status Date'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Order_Status_Name");
		rptDTO.setFormDisplay("Deliver To");
		rptDTO.setColumnNameOut("Order_Status_Name");
		rptDTO.setDbField("Order_Status.Name as 'Deliver To'");
		rptDTO.setDbSize("35");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Delivery_Address");
		rptDTO.setFormDisplay("Delivery Address");
		rptDTO.setColumnNameOut("Delivery_Address");
		rptDTO.setDbField("concat(Order_Status.Address,space(35-length(Order_Status.Address)),Order_Status.City,space(20-length(Order_Status.City)),Order_Status.State,space(2-length(Order_Status.State)),Order_Status.Zip,space(5-length(Order_Status.Zip))) as 'Delivery Address'");
		rptDTO.setDbSize("236");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Order_Status_Contact_Name");
		rptDTO.setFormDisplay("Contact Name");
		rptDTO.setColumnNameOut("Order_Status_Contact_Name");
		rptDTO.setDbField("Order_Status.Contact_Name as 'Contact Name'");
		rptDTO.setDbSize("35");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Order_Status_Contact_Telno");
		rptDTO.setFormDisplay("Manufacturer Phone");
		rptDTO.setColumnNameOut("Order_Status_Contact_Telno");
		rptDTO.setDbField("Order_Status.Contact_Telno as 'Manufacturer Phone'");
		rptDTO.setDbSize("21");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Order_Status_Date_Ag_Received");
		rptDTO.setFormDisplay("Agency Date Received");
		rptDTO.setColumnNameOut("Order_Status_Date_Ag_Received");
		rptDTO.setDbField("order_status.Date_Ag_Received as 'Agency Date Received'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("User_Ag_updated");
		rptDTO.setFormDisplay("User Agency Updated");
		rptDTO.setColumnNameOut("User_Ag_updated");
		rptDTO.setDbField("Order_Status.User_Ag_updated as 'User Agency Updated'");
		rptDTO.setDbSize("20");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Weight_Rating");
		rptDTO.setFormDisplay("Weight Rating");
		rptDTO.setColumnNameOut("Weight_Rating");
		rptDTO.setDbField("order_status.Weight_Rating as 'Weight Rating'");
		rptDTO.setDbSize("6");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Fuel_Type");
		rptDTO.setFormDisplay("Fuel Type");
		rptDTO.setColumnNameOut("Fuel_Type");
		rptDTO.setDbField("order_status.Fuel_Type as 'Fuel Type'");
		rptDTO.setDbSize("6");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("GPM");
		rptDTO.setFormDisplay("GPM");
		rptDTO.setColumnNameOut("GPM");
		rptDTO.setDbField("order_status.GPM as 'GPM'");
		rptDTO.setDbSize("4");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("MPG_C");
		rptDTO.setFormDisplay("MPG City");
		rptDTO.setColumnNameOut("MPG_C");
		rptDTO.setDbField("order_status.MPG_C as 'MPG City'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("MPG_H");
		rptDTO.setFormDisplay("MPG Highway");
		rptDTO.setColumnNameOut("MPG_H");
		rptDTO.setDbField("order_status.MPG_H as 'MPG Highway'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("MPG_B");
		rptDTO.setFormDisplay("MPG Combined");
		rptDTO.setColumnNameOut("MPG_B");
		rptDTO.setDbField("order_status.MPG_B as 'MPG Combined'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Flex_GPM");
		rptDTO.setFormDisplay("Flex GPM");
		rptDTO.setColumnNameOut("Flex_GPM");
		rptDTO.setDbField("order_status.Flex_GPM as 'Flex GPM'");
		rptDTO.setDbSize("4");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Flex_Fuel_MPG_C");
		rptDTO.setFormDisplay("Flex Fuel MPG City");
		rptDTO.setColumnNameOut("Flex_Fuel_MPG_C");
		rptDTO.setDbField("order_status.Flex_Fuel_MPG_C as 'Flex Fuel MPG City'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Flex_Fuel_MPG_H");
		rptDTO.setFormDisplay("Flex Fuel MPG Highway");
		rptDTO.setColumnNameOut("Flex_Fuel_MPG_H");
		rptDTO.setDbField("order_status.Flex_Fuel_MPG_H as 'Flex Fuel MPG Highway'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Flex_Fuel_MPG_B");
		rptDTO.setFormDisplay("Flex Fuel MPG Combined");
		rptDTO.setColumnNameOut("Flex_Fuel_MPG_B");
		rptDTO.setDbField("order_status.Flex_Fuel_MPG_B as 'Flex Fuel MPG Combined'");
		rptDTO.setDbSize("3");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Veh_Color");
		rptDTO.setFormDisplay("Color");
		rptDTO.setColumnNameOut("Veh_Color");
		rptDTO.setDbField("order_status.Veh_Color as 'Color'");
		rptDTO.setDbSize("60");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Veh_Trim");
		rptDTO.setFormDisplay("Vehicle Trim");
		rptDTO.setColumnNameOut("Veh_Trim");
		rptDTO.setDbField("order_status.Veh_Trim as 'Vehicle Trim'");
		rptDTO.setDbSize("60");
		rptDTO.setCategory("OrderStatus");	 
		fsrReportFieldList.add(rptDTO);

		
		

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Requisitions_Std_Item");
		rptDTO.setFormDisplay("Standard Item");
		rptDTO.setColumnNameOut("Requisitions_Std_Item");
		rptDTO.setDbField("Requisitions.Std_Item as 'Standard Item'");
		rptDTO.setDbSize("4");
		rptDTO.setCategory("VehicleData");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Std_Items_Description");
		rptDTO.setFormDisplay("Standard Item Description");
		rptDTO.setColumnNameOut("Std_Items_Description");
		rptDTO.setDbField("Std_Items.Description as 'Standard Item Description'");
		rptDTO.setDbSize("60");
		rptDTO.setCategory("VehicleData");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Requisitions_Model");
		rptDTO.setFormDisplay("Model");
		rptDTO.setColumnNameOut("Requisitions_Model");
		rptDTO.setDbField("Requisitions.Model as 'Model'");
		rptDTO.setDbSize("10");
		rptDTO.setCategory("VehicleData");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Requisitions_Veh_Color");
		rptDTO.setFormDisplay("Color");
		rptDTO.setColumnNameOut("Requisitions_Veh_Color");
		rptDTO.setDbField("Requisitions.Veh_Color as 'Color'");
		rptDTO.setDbSize("60");
		rptDTO.setCategory("VehicleData");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Option_File_Option_Code");
		rptDTO.setFormDisplay("Option Code");
		rptDTO.setColumnNameOut("Option_File_Option_Code");
		rptDTO.setDbField("Option_File.Option_Code");
		rptDTO.setDbSize("4");
		rptDTO.setCategory("VehicleData");	 
		fsrReportFieldList.add(rptDTO);
		
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Buyer_Table_Buyer_Name");
		rptDTO.setFormDisplay("Buyer Name");
		rptDTO.setColumnNameOut("Buyer_Table_Buyer_Name");
		rptDTO.setDbField("concat(Buyer_Table.First_Name,space(15-length(Buyer_Table.First_Name)),Buyer_Table.Last_Name,space(15-length(Buyer_Table.Last_Name))) as 'Buyer Name'");
		rptDTO.setDbSize("30");
		rptDTO.setCategory("Buyer");	 
		fsrReportFieldList.add(rptDTO);

		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("Buyer_Table_Phone");
		rptDTO.setFormDisplay("Buyer Phone");
		rptDTO.setColumnNameOut("Buyer_Table_Phone");
		rptDTO.setDbField("Buyer_Table.Phone as 'Buyer Phone'");
		rptDTO.setDbSize("12");
		rptDTO.setCategory("Buyer");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("requisitions_fsr_Remarks");
		rptDTO.setFormDisplay("FSR Remarks");
		rptDTO.setColumnNameOut("requisitions_fsr_Remarks");
		rptDTO.setDbField("requisitions_fsr.Remarks as  'FSR Remarks'");
		rptDTO.setDbSize("12");
		rptDTO.setCategory("RequisitionsFSR");	 
		fsrReportFieldList.add(rptDTO);
		
		rptDTO = new ReportBuilder() ;
		rptDTO.setFormField("States_Region");
		rptDTO.setFormDisplay("Region");
		rptDTO.setColumnNameOut("States_Region");
		rptDTO.setDbField("States.Region as 'Region'");
		rptDTO.setDbSize("1");
		rptDTO.setCategory("RequisitionsFSR");	 
		fsrReportFieldList.add(rptDTO);

		
		return fsrReportFieldList;
	 	   
	}
	public ArrayList<ReportBuilder> getFsrReportFieldList() {
		return fsrReportFieldList;
	}
	public void setFsrReportFieldList(ArrayList<ReportBuilder> fsrReportFieldList) {
		this.fsrReportFieldList = fsrReportFieldList;
	}

}
