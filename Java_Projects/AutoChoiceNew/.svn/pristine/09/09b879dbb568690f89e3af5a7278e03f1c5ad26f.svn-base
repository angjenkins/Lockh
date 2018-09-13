package gov.gsa.fas.AutoChoice.beans;


import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.DTO.ControlDTO;
import gov.gsa.fas.AutoChoice.DAO.UserAccessDAO;

@Component
@Scope("session")
public class OtherfeaturesBean {
	
	

	protected String std_Item = "";
	protected String option_Code = "";
	protected String description = "";
	protected String categoryCode = "";
	protected String categoryName = "";
	protected String fedValueNext = "";
	protected List<OtherfeaturesValueBean>  stdOptions;
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		OtherfeaturesBean other = ( OtherfeaturesBean )obj;
		if( other.categoryCode.equals(categoryCode) )
			flag = true;
		return flag;
	}
	
	public int hashCode() { return categoryCode.hashCode(); }
	
	public String getStd_Item() {
		return std_Item;
	}
	public void setStd_Item(String std_Item) {
		this.std_Item = std_Item;
	}
	public String getOption_Code() {
		return option_Code;
	}
	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getFedValueNext() {
		return fedValueNext;
	}
	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}
	public List<OtherfeaturesValueBean> getStdOptions() {
		return stdOptions;
	}
	public void setStdOptions(List<OtherfeaturesValueBean> stdOptions) {
		this.stdOptions = stdOptions;
	}

}
