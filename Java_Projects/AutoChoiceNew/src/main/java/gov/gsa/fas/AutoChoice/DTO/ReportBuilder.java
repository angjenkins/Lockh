package gov.gsa.fas.AutoChoice.DTO;



public class ReportBuilder{	
protected String formField ="";
protected String formDisplay="";
protected String columnNameOut="";
protected String dbField="";
protected String dbSize="";
protected String editFlag="";
protected String sequence = "";
protected String category ="";

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
public String getEditFlag() {
	return editFlag;
}
public void setEditFlag(String editFlag) {
	this.editFlag = editFlag;
}
public String getCategory() {
	return category;
}
public String getSequence() {
	return sequence;
}
public void setSequence(String sequence) {
	this.sequence = sequence;
}
public void setCategory(String category) {
	this.category = category;
}



}
