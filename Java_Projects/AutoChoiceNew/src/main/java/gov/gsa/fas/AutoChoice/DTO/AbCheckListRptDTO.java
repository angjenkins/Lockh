
package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

public class AbCheckListRptDTO{
	protected String Veh_Type="";   
	protected String Description="";   
	protected String Std_Item="";   
	protected String Model=""; 
	protected String ModelYYYY="";  
	protected String Model_Desc=null;   
	protected String Status="";   
	protected String Flag_Next_Year="";   
	protected double Extended_Total_Price;   
	protected String Sol_No_1="";   
	protected String Sol_No_2="";   
	protected String Sol_No_3="";   
	protected String Contract="";   
	protected String Sch_Line="";  
	protected Timestamp Date_Updated=null;
	protected Timestamp Dt_Bid=null; 
	protected String Contr_Full_Name  ="";
	protected String Contr_DUNS ="";
	
	public String getVeh_Type() {
		return Veh_Type;
	}
	public void setVeh_Type(String veh_Type) {
		Veh_Type = veh_Type;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStd_Item() {
		return Std_Item;
	}
	public void setStd_Item(String std_Item) {
		Std_Item = std_Item;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getModelYYYY() {
		return ModelYYYY;
	}
	public void setModelYYYY(String modelYYYY) {
		ModelYYYY = modelYYYY;
	}
	public String getModel_Desc() {
		return Model_Desc;
	}
	public void setModel_Desc(String model_Desc) {
		Model_Desc = model_Desc;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getFlag_Next_Year() {
		return Flag_Next_Year;
	}
	public void setFlag_Next_Year(String flag_Next_Year) {
		Flag_Next_Year = flag_Next_Year;
	}
	public double getExtended_Total_Price() {
		return Extended_Total_Price;
	}
	public void setExtended_Total_Price(double extended_Total_Price) {
		Extended_Total_Price = extended_Total_Price;
	}
	public String getSol_No_1() {
		return Sol_No_1;
	}
	public void setSol_No_1(String sol_No_1) {
		Sol_No_1 = sol_No_1;
	}
	public String getSol_No_2() {
		return Sol_No_2;
	}
	public void setSol_No_2(String sol_No_2) {
		Sol_No_2 = sol_No_2;
	}
	public String getSol_No_3() {
		return Sol_No_3;
	}
	public void setSol_No_3(String sol_No_3) {
		Sol_No_3 = sol_No_3;
	}
	public String getContract() {
		return Contract;
	}
	public void setContract(String contract) {
		Contract = contract;
	}
	public String getSch_Line() {
		return Sch_Line;
	}
	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}
	public Timestamp getDate_Updated() {
		return Date_Updated;
	}
	public void setDate_Updated(Timestamp date_Updated) {
		Date_Updated = date_Updated;
	}
	public Timestamp getDt_Bid() {
		return Dt_Bid;
	}
	public void setDt_Bid(Timestamp dt_Bid) {
		Dt_Bid = dt_Bid;
	}
	public String getContr_Full_Name() {
		return Contr_Full_Name;
	}
	public void setContr_Full_Name(String contr_Full_Name) {
		Contr_Full_Name = contr_Full_Name;
	}
	public String getContr_DUNS() {
		return Contr_DUNS;
	}
	public void setContr_DUNS(String contr_DUNS) {
		Contr_DUNS = contr_DUNS;
	}
}