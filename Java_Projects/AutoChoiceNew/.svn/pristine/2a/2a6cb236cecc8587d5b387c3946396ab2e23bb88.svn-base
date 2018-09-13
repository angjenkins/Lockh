package gov.gsa.fas.AutoChoice.beans;

import javax.persistence.Transient;

public class OtherfeaturesValueBean {
	protected String categoryCode = "";
	protected String Sch_Line = "";
	protected String Contract = "";
	protected String fedValueNext = "";
	protected String Option_Code = "";
	
	protected String manufacturerName ="";
	protected String modelDescripton="";
	protected String modelCode="";
	protected String model = "";
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		OtherfeaturesValueBean other = ( OtherfeaturesValueBean )obj;
		if( other.Sch_Line.equals(Sch_Line) && (other.Contract.equals(Contract)))
			flag = true;
		return flag;
	}
	
	public int hashCode() { return (Sch_Line.hashCode() + Contract.hashCode()); }
	
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getSch_Line() {
		return Sch_Line;
	}
	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}
	public String getContract() {
		return Contract;
	}
	public void setContract(String contract) {
		Contract = contract;
	}
	public String getFedValueNext() {
		return fedValueNext;
	}
	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}
	public String getOption_Code() {
		return Option_Code;
	}
	public void setOption_Code(String option_Code) {
		Option_Code = option_Code;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getModelDescripton() {
		return modelDescripton;
	}
	public void setModelDescripton(String modelDescripton) {
		this.modelDescripton = modelDescripton;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
