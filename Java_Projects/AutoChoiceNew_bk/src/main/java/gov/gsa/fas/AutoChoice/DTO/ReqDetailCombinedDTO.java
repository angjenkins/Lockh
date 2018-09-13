package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

public class ReqDetailCombinedDTO implements Serializable, JSONAware{
	
	private static final long serialVersionUID = 1L;
	
	protected String sch_line = "";
	protected String std_item = "";
	protected String std_item_description = "";
	protected String std_item_section = "";
	protected String buyer_code = "";
	protected String contract = "";
	protected String contr_full_name = "";
	protected Double contr_line_curr_unit_price;
	protected String contract_sc = "";
	protected String model_description = "";
	protected String model = "";
	protected Integer model_groupduns_groupduns;
	protected String veh_type_veh_type = "";
	protected String veh_type_dealer_flag = "";
	protected String contr_line_allow_ordering = "";
	protected String groupduns_dealer_loc_dealer_code = "";
	protected String groupduns_dealer_loc_dealer_name = "";
	protected String groupduns_dealer_loc_dealer_street = "";
	protected String groupduns_dealer_loc_dealer_city = "";
	protected String groupduns_dealer_loc_dealer_state = "";
	protected String groupduns_dealer_loc_dealer_zip = "";
	protected String groupduns_dealer_loc_dealer_country = "";
	protected String groupduns_dealer_loc_dealer_telephone = "";
	protected String groupduns_dealer_loc_dealer_statename = "";
	
	public String getSch_line() {
		return sch_line;
	}
	public void setSch_line(String sch_line) {
		this.sch_line = sch_line;
	}
	public String getStd_item() {
		return std_item;
	}
	public void setStd_item(String std_item) {
		this.std_item = std_item;
	}
	public String getStd_item_description() {
		return std_item_description;
	}
	public void setStd_item_description(String std_item_description) {
		this.std_item_description = std_item_description;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getContr_full_name() {
		return contr_full_name;
	}
	public void setContr_full_name(String contr_full_name) {
		this.contr_full_name = contr_full_name;
	}
	public Double getContr_line_curr_unit_price() {
		return contr_line_curr_unit_price;
	}
	public void setContr_line_curr_unit_price(Double contr_line_curr_unit_price) {
		this.contr_line_curr_unit_price = contr_line_curr_unit_price;
	}
	public String getContract_sc() {
		return contract_sc;
	}
	public void setContract_sc(String contract_sc) {
		this.contract_sc = contract_sc;
	}
	public String getModel_description() {
		return model_description;
	}
	public void setModel_description(String model_description) {
		this.model_description = model_description;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVeh_type_veh_type() {
		return veh_type_veh_type;
	}
	public void setVeh_type_veh_type(String veh_type_veh_type) {
		this.veh_type_veh_type = veh_type_veh_type;
	}
	public String getVeh_type_dealer_flag() {
		return veh_type_dealer_flag;
	}
	public void setVeh_type_dealer_flag(String veh_type_dealer_flag) {
		this.veh_type_dealer_flag = veh_type_dealer_flag;
	}
	public String getContr_line_allow_ordering() {
		return contr_line_allow_ordering;
	}
	public void setContr_line_allow_ordering(String contr_line_allow_ordering) {
		this.contr_line_allow_ordering = contr_line_allow_ordering;
	}
	public Integer getModel_groupduns_groupduns() {
		return model_groupduns_groupduns;
	}
	public void setModel_groupduns_groupduns(Integer model_groupduns_groupduns) {
		this.model_groupduns_groupduns = model_groupduns_groupduns;
	}
	public String getGroupduns_dealer_loc_dealer_code() {
		return groupduns_dealer_loc_dealer_code;
	}
	public void setGroupduns_dealer_loc_dealer_code(
			String groupduns_dealer_loc_dealer_code) {
		this.groupduns_dealer_loc_dealer_code = groupduns_dealer_loc_dealer_code;
	}
	public String getGroupduns_dealer_loc_dealer_name() {
		return groupduns_dealer_loc_dealer_name;
	}
	public void setGroupduns_dealer_loc_dealer_name(
			String groupduns_dealer_loc_dealer_name) {
		this.groupduns_dealer_loc_dealer_name = groupduns_dealer_loc_dealer_name;
	}
	public String getGroupduns_dealer_loc_dealer_street() {
		return groupduns_dealer_loc_dealer_street;
	}
	public void setGroupduns_dealer_loc_dealer_street(
			String groupduns_dealer_loc_dealer_street) {
		this.groupduns_dealer_loc_dealer_street = groupduns_dealer_loc_dealer_street;
	}
	public String getGroupduns_dealer_loc_dealer_city() {
		return groupduns_dealer_loc_dealer_city;
	}
	public void setGroupduns_dealer_loc_dealer_city(
			String groupduns_dealer_loc_dealer_city) {
		this.groupduns_dealer_loc_dealer_city = groupduns_dealer_loc_dealer_city;
	}
	public String getGroupduns_dealer_loc_dealer_state() {
		return groupduns_dealer_loc_dealer_state;
	}
	public void setGroupduns_dealer_loc_dealer_state(
			String groupduns_dealer_loc_dealer_state) {
		this.groupduns_dealer_loc_dealer_state = groupduns_dealer_loc_dealer_state;
	}
	public String getGroupduns_dealer_loc_dealer_zip() {
		return groupduns_dealer_loc_dealer_zip;
	}
	public void setGroupduns_dealer_loc_dealer_zip(
			String groupduns_dealer_loc_dealer_zip) {
		this.groupduns_dealer_loc_dealer_zip = groupduns_dealer_loc_dealer_zip;
	}
	public String getGroupduns_dealer_loc_dealer_country() {
		return groupduns_dealer_loc_dealer_country;
	}
	public void setGroupduns_dealer_loc_dealer_country(
			String groupduns_dealer_loc_dealer_country) {
		this.groupduns_dealer_loc_dealer_country = groupduns_dealer_loc_dealer_country;
	}
	public String getGroupduns_dealer_loc_dealer_telephone() {
		return groupduns_dealer_loc_dealer_telephone;
	}
	public void setGroupduns_dealer_loc_dealer_telephone(
			String groupduns_dealer_loc_dealer_telephone) {
		this.groupduns_dealer_loc_dealer_telephone = groupduns_dealer_loc_dealer_telephone;
	}
	public String getGroupduns_dealer_loc_dealer_statename() {
		return groupduns_dealer_loc_dealer_statename;
	}
	public void setGroupduns_dealer_loc_dealer_statename(
			String groupduns_dealer_loc_dealer_statename) {
		this.groupduns_dealer_loc_dealer_statename = groupduns_dealer_loc_dealer_statename;
	}
	
	public String toJSONString() {		 
        StringBuffer sb = new StringBuffer();
        
        sb.append("{");

        sb.append(JSONObject.escape("code"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_code) + "\"");

        sb.append(",");

        sb.append(JSONObject.escape("name"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_name) + "\"");

        sb.append(",");

        sb.append(JSONObject.escape("street"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_street) + "\"");
        
        sb.append(",");        

        sb.append(JSONObject.escape("city"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_city) + "\"");

        sb.append(",");

        sb.append(JSONObject.escape("state"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_state) + "\"");

        sb.append(",");

        sb.append(JSONObject.escape("zip"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_zip) + "\"");

        sb.append(",");

        sb.append(JSONObject.escape("country"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_country) + "\"");
        
        sb.append(",");

        sb.append(JSONObject.escape("telephone"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_telephone) + "\"");
        
        sb.append(",");

        sb.append(JSONObject.escape("stateName"));
        sb.append(":");
        sb.append("\"" + JSONObject.escape(this.groupduns_dealer_loc_dealer_statename) + "\"");
        sb.append("}");

        return sb.toString();
	}
	public String getStd_item_section() {
		return std_item_section;
	}
	public void setStd_item_section(String std_item_section) {
		this.std_item_section = std_item_section;
	}
	public String getBuyer_code() {
		return buyer_code;
	}
	public void setBuyer_code(String buyer_code) {
		this.buyer_code = buyer_code;
	}
	
}
