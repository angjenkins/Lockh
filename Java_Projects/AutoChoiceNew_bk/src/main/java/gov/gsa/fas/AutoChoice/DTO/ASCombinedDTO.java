package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;


public class ASCombinedDTO {
	
	protected boolean editRow = false;
	
	protected String stdItm_stdItem = "";	
	protected String stdItm_fedStdCode = "";
	protected String stdItm_vehType = "";
	protected String stdItm_description = "";
	protected String stdItm_status = "";
	protected String stdItm_userUpdated = "";
	protected String stdItm_section = "";
	protected String stdItm_mpgFlag = "";
	protected String stdItm_desc1 = "";
	protected String stdItm_desc2 = "";
	protected String stdItm_desc3 = "";
	protected String stdItm_desc4 = "";
	protected String stdItm_desc5 = "";
	protected double stdItm_lastUnitPrice;
	protected String stdItm_lastCase = "";
	protected Timestamp stdItm_lastDate;
	protected String stdItm_stdItemBase = "";
	protected String stdItm_stdItemBaseNext = "";
	
	protected String stdItemOpt_stdItem = "";
	protected String stdItemOpt_optionCode = "";
	protected String stdItemOpt_flagStd = "";
	protected String stdItemOpt_userUpdated = "";
	protected String stdItemOpt_fedValueCurrent = "";
	protected String stdItemOpt_fedFlagCurrent = "";
	protected String stdItemOpt_fedValueNext = "";
	protected String stdItemOpt_fedFlagNext = "";
	protected Timestamp stdItemOpt_dateUpdated;
	protected String stdItemOpt_flagStdNext = "";
	
	protected String option_optionCode = "";
  	protected String option_description = "";
  	protected String option_milFlag = "";
  	protected String option_userUpdated = "";
  	protected String option_validFlag = "";
  	protected String option_validQty = "";
  	protected String option_categoryCode = "";
	protected String option_proprietary = "";
	protected Integer option_sequence;
	protected String option_flagBodyTruck = "";
	protected String option_bodyTruckNext = "";
	protected String option_flgAddText = "";
	protected String option_flgAddTextNext = "";
	protected String option_mpgFlagNext = "";
	
	protected String optCat_categoryCode = "";
	protected String optCat_categoryName = "";
	protected Timestamp optCat_dateCreated;
	protected String optCat_createdBy = "";
	protected Timestamp optCat_dateLastUpdated;
	protected String optCat_userUpdated;
	protected String optCat_selectionType;
	protected Integer optCat_sequence;
	
	protected String vehType_vehType = "";
	protected String vehType_description = "";
	protected String vehType_status = "";
	protected String vehType_division = "";
	protected String vehType_openForInternet = "";
	protected String vehType_groupVehType = "";
	protected String vehType_groupDescription = "";
	protected String vehType_dealerFlg = "";
	
	protected String model_model = "";
	protected String model_stdItem = "";
	protected String model_description = "";
	protected String model_createdBy = "";
	protected Timestamp model_dateCreated ;
	protected String model_url = "";
	protected String model_flagNextYear = "";
		
  	protected String modelGroupDUNS_model = "";
	protected String modelGroupDUNS_description = "";
	protected String modelGroupDUNS_createdBy = "";
	protected Timestamp modelGroupDUNS_dateCreated ;
	protected int modelGroupDUNS_groupDUNS = 0;
	protected String modelGroupDUNS_franCode = "";
	
	protected int stdItemFed_groupDUNS = 0;
	protected String stdItemFed_stdItem = "";
	protected String stdItemFed_optCode = "";
	protected String stdItemFed_model = "";
	protected String stdItemFed_fedValueCurrent = "";
	protected String stdItemFed_fedValueNext = "";
	protected Timestamp stdItemFed_dateLastUpdated = null;
	protected String stdItemFed_userUpdated = "";
	protected String stdItemFed_oemFlagStdCurrent = "";
	protected String stdItemFed_oemFlagStdNext;
	protected String stdItemFed_status = "";
	protected String stdItemFed_otherSpecs = "";
	protected String stdItemFed_isParentOption = "";
	
	protected Timestamp groupDUNS_dateReOpenAutoS = null;
	protected String groupDUNS_flagAutoStd = "";
	
	protected boolean copy = false;
	protected String status = "";
	protected String stringTimestamp = "";
	
	
	public String getStdItemOpt_stdItem() {
		return stdItemOpt_stdItem;
	}
	public void setStdItemOpt_stdItem(String stdItemOpt_stdItem) {
		this.stdItemOpt_stdItem = stdItemOpt_stdItem;
	}
	public String getStdItemOpt_optionCode() {
		return stdItemOpt_optionCode;
	}
	public void setStdItemOpt_optionCode(String stdItemOpt_optionCode) {
		this.stdItemOpt_optionCode = stdItemOpt_optionCode;
	}
	public String getStdItemOpt_flagStd() {
		return stdItemOpt_flagStd;
	}
	public void setStdItemOpt_flagStd(String stdItemOpt_flagStd) {
		this.stdItemOpt_flagStd = stdItemOpt_flagStd;
	}
	public String getStdItemOpt_userUpdated() {
		return stdItemOpt_userUpdated;
	}
	public void setStdItemOpt_userUpdated(String stdItemOpt_userUpdated) {
		this.stdItemOpt_userUpdated = stdItemOpt_userUpdated;
	}
	public String getStdItemOpt_fedValueCurrent() {
		return stdItemOpt_fedValueCurrent;
	}
	public void setStdItemOpt_fedValueCurrent(String stdItemOpt_fedValueCurrent) {
		this.stdItemOpt_fedValueCurrent = stdItemOpt_fedValueCurrent;
	}
	public String getStdItemOpt_fedFlagCurrent() {
		return stdItemOpt_fedFlagCurrent;
	}
	public void setStdItemOpt_fedFlagCurrent(String stdItemOpt_fedFlagCurrent) {
		this.stdItemOpt_fedFlagCurrent = stdItemOpt_fedFlagCurrent;
	}
	public String getStdItemOpt_fedValueNext() {
		return stdItemOpt_fedValueNext;
	}
	public void setStdItemOpt_fedValueNext(String stdItemOpt_fedValueNext) {
		this.stdItemOpt_fedValueNext = stdItemOpt_fedValueNext;
	}
	public String getStdItemOpt_fedFlagNext() {
		return stdItemOpt_fedFlagNext;
	}
	public void setStdItemOpt_fedFlagNext(String stdItemOpt_fedFlagNext) {
		this.stdItemOpt_fedFlagNext = stdItemOpt_fedFlagNext;
	}
	public Timestamp getStdItemOpt_dateUpdated() {
		return stdItemOpt_dateUpdated;
	}
	public void setStdItemOpt_dateUpdated(Timestamp stdItemOpt_dateUpdated) {
		this.stdItemOpt_dateUpdated = stdItemOpt_dateUpdated;
	}
	public String getStdItemOpt_flagStdNext() {
		return stdItemOpt_flagStdNext;
	}
	public void setStdItemOpt_flagStdNext(String stdItemOpt_flagStdNext) {
		this.stdItemOpt_flagStdNext = stdItemOpt_flagStdNext;
	}
	public String getOption_optionCode() {
		return option_optionCode;
	}
	public void setOption_optionCode(String option_optionCode) {
		this.option_optionCode = option_optionCode;
	}
	public String getOption_description() {
		return option_description;
	}
	public void setOption_description(String option_description) {
		this.option_description = option_description;
	}
	public String getOption_milFlag() {
		return option_milFlag;
	}
	public void setOption_milFlag(String option_milFlag) {
		this.option_milFlag = option_milFlag;
	}
	public String getOption_userUpdated() {
		return option_userUpdated;
	}
	public void setOption_userUpdated(String option_userUpdated) {
		this.option_userUpdated = option_userUpdated;
	}
	public String getOption_validFlag() {
		return option_validFlag;
	}
	public void setOption_validFlag(String option_validFlag) {
		this.option_validFlag = option_validFlag;
	}
	public String getOption_validQty() {
		return option_validQty;
	}
	public void setOption_validQty(String option_validQty) {
		this.option_validQty = option_validQty;
	}
	public String getOption_categoryCode() {
		return option_categoryCode;
	}
	public void setOption_categoryCode(String option_categoryCode) {
		this.option_categoryCode = option_categoryCode;
	}
	public String getOption_proprietary() {
		return option_proprietary;
	}
	public void setOption_proprietary(String option_proprietary) {
		this.option_proprietary = option_proprietary;
	}
	public Integer getOption_sequence() {
		return option_sequence;
	}
	public void setOption_sequence(Integer option_sequence) {
		this.option_sequence = option_sequence;
	}
	public String getOption_flagBodyTruck() {
		return option_flagBodyTruck;
	}
	public void setOption_flagBodyTruck(String option_flagBodyTruck) {
		this.option_flagBodyTruck = option_flagBodyTruck;
	}
	public String getOption_bodyTruckNext() {
		return option_bodyTruckNext;
	}
	public void setOption_bodyTruckNext(String option_bodyTruckNext) {
		this.option_bodyTruckNext = option_bodyTruckNext;
	}
	public String getOption_flgAddText() {
		return option_flgAddText;
	}
	public void setOption_flgAddText(String option_flgAddText) {
		this.option_flgAddText = option_flgAddText;
	}
	public String getOption_flgAddTextNext() {
		return option_flgAddTextNext;
	}
	public void setOption_flgAddTextNext(String option_flgAddTextNext) {
		this.option_flgAddTextNext = option_flgAddTextNext;
	}
	public String getOption_mpgFlagNext() {
		return option_mpgFlagNext;
	}
	public void setOption_mpgFlagNext(String option_mpgFlagNext) {
		this.option_mpgFlagNext = option_mpgFlagNext;
	}
	public String getOptCat_categoryCode() {
		return optCat_categoryCode;
	}
	public void setOptCat_categoryCode(String optCat_categoryCode) {
		this.optCat_categoryCode = optCat_categoryCode;
	}
	public String getOptCat_categoryName() {
		return optCat_categoryName;
	}
	public void setOptCat_categoryName(String optCat_categoryName) {
		this.optCat_categoryName = optCat_categoryName;
	}
	public Timestamp getOptCat_dateCreated() {
		return optCat_dateCreated;
	}
	public void setOptCat_dateCreated(Timestamp optCat_dateCreated) {
		this.optCat_dateCreated = optCat_dateCreated;
	}
	public String getOptCat_createdBy() {
		return optCat_createdBy;
	}
	public void setOptCat_createdBy(String optCat_createdBy) {
		this.optCat_createdBy = optCat_createdBy;
	}
	public Timestamp getOptCat_dateLastUpdated() {
		return optCat_dateLastUpdated;
	}
	public void setOptCat_dateLastUpdated(Timestamp optCat_dateLastUpdated) {
		this.optCat_dateLastUpdated = optCat_dateLastUpdated;
	}
	public String getOptCat_userUpdated() {
		return optCat_userUpdated;
	}
	public void setOptCat_userUpdated(String optCat_userUpdated) {
		this.optCat_userUpdated = optCat_userUpdated;
	}
	public String getOptCat_selectionType() {
		return optCat_selectionType;
	}
	public void setOptCat_selectionType(String optCat_selectionType) {
		this.optCat_selectionType = optCat_selectionType;
	}
	public Integer getOptCat_sequence() {
		return optCat_sequence;
	}
	public void setOptCat_sequence(Integer optCat_sequence) {
		this.optCat_sequence = optCat_sequence;
	}
	public String getStdItm_fedStdCode() {
		return stdItm_fedStdCode;
	}
	public void setStdItm_fedStdCode(String stdItm_fedStdCode) {
		this.stdItm_fedStdCode = stdItm_fedStdCode;
	}
	public String getStdItm_vehType() {
		return stdItm_vehType;
	}
	public void setStdItm_vehType(String stdItm_vehType) {
		this.stdItm_vehType = stdItm_vehType;
	}
	public String getStdItm_description() {
		return stdItm_description;
	}
	public void setStdItm_description(String stdItm_description) {
		this.stdItm_description = stdItm_description;
	}
	public String getStdItm_status() {
		return stdItm_status;
	}
	public void setStdItm_status(String stdItm_status) {
		this.stdItm_status = stdItm_status;
	}
	public String getStdItm_userUpdated() {
		return stdItm_userUpdated;
	}
	public void setStdItm_userUpdated(String stdItm_userUpdated) {
		this.stdItm_userUpdated = stdItm_userUpdated;
	}
	public String getStdItm_section() {
		return stdItm_section;
	}
	public void setStdItm_section(String stdItm_section) {
		this.stdItm_section = stdItm_section;
	}
	public String getStdItm_mpgFlag() {
		return stdItm_mpgFlag;
	}
	public void setStdItm_mpgFlag(String stdItm_mpgFlag) {
		this.stdItm_mpgFlag = stdItm_mpgFlag;
	}
	public String getStdItm_desc1() {
		return stdItm_desc1;
	}
	public void setStdItm_desc1(String stdItm_desc1) {
		this.stdItm_desc1 = stdItm_desc1;
	}
	public String getStdItm_desc2() {
		return stdItm_desc2;
	}
	public void setStdItm_desc2(String stdItm_desc2) {
		this.stdItm_desc2 = stdItm_desc2;
	}
	public String getStdItm_desc3() {
		return stdItm_desc3;
	}
	public void setStdItm_desc3(String stdItm_desc3) {
		this.stdItm_desc3 = stdItm_desc3;
	}
	public String getStdItm_desc4() {
		return stdItm_desc4;
	}
	public void setStdItm_desc4(String stdItm_desc4) {
		this.stdItm_desc4 = stdItm_desc4;
	}
	public String getStdItm_desc5() {
		return stdItm_desc5;
	}
	public void setStdItm_desc5(String stdItm_desc5) {
		this.stdItm_desc5 = stdItm_desc5;
	}
	public double getStdItm_lastUnitPrice() {
		return stdItm_lastUnitPrice;
	}
	public void setStdItm_lastUnitPrice(double stdItm_lastUnitPrice) {
		this.stdItm_lastUnitPrice = stdItm_lastUnitPrice;
	}
	public String getStdItm_lastCase() {
		return stdItm_lastCase;
	}
	public void setStdItm_lastCase(String stdItm_lastCase) {
		this.stdItm_lastCase = stdItm_lastCase;
	}
	public Timestamp getStdItm_lastDate() {
		return stdItm_lastDate;
	}
	public void setStdItm_lastDate(Timestamp stdItm_lastDate) {
		this.stdItm_lastDate = stdItm_lastDate;
	}
	public String getStdItm_stdItemBase() {
		return stdItm_stdItemBase;
	}
	public void setStdItm_stdItemBase(String stdItm_stdItemBase) {
		this.stdItm_stdItemBase = stdItm_stdItemBase;
	}
	public String getStdItm_stdItemBaseNext() {
		return stdItm_stdItemBaseNext;
	}
	public void setStdItm_stdItemBaseNext(String stdItm_stdItemBaseNext) {
		this.stdItm_stdItemBaseNext = stdItm_stdItemBaseNext;
	}
	public String getVehType_vehType() {
		return vehType_vehType;
	}
	public void setVehType_vehType(String vehType_vehType) {
		this.vehType_vehType = vehType_vehType;
	}
	public String getVehType_description() {
		return vehType_description;
	}
	public void setVehType_description(String vehType_description) {
		this.vehType_description = vehType_description;
	}
	public String getVehType_status() {
		return vehType_status;
	}
	public void setVehType_status(String vehType_status) {
		this.vehType_status = vehType_status;
	}
	public String getVehType_division() {
		return vehType_division;
	}
	public void setVehType_division(String vehType_division) {
		this.vehType_division = vehType_division;
	}
	public String getVehType_openForInternet() {
		return vehType_openForInternet;
	}
	public void setVehType_openForInternet(String vehType_openForInternet) {
		this.vehType_openForInternet = vehType_openForInternet;
	}
	public String getVehType_groupVehType() {
		return vehType_groupVehType;
	}
	public void setVehType_groupVehType(String vehType_groupVehType) {
		this.vehType_groupVehType = vehType_groupVehType;
	}
	public String getVehType_groupDescription() {
		return vehType_groupDescription;
	}
	public void setVehType_groupDescription(String vehType_groupDescription) {
		this.vehType_groupDescription = vehType_groupDescription;
	}
	public String getVehType_dealerFlg() {
		return vehType_dealerFlg;
	}
	public void setVehType_dealerFlg(String vehType_dealerFlg) {
		this.vehType_dealerFlg = vehType_dealerFlg;
	}
	public String getStdItm_stdItem() {
		return stdItm_stdItem;
	}
	public void setStdItm_stdItem(String stdItm_stdItem) {
		this.stdItm_stdItem = stdItm_stdItem;
	}
	public String getModel_model() {
		return model_model;
	}
	public void setModel_model(String model_model) {
		this.model_model = model_model;
	}
	public String getModel_stdItem() {
		return model_stdItem;
	}
	public void setModel_stdItem(String model_stdItem) {
		this.model_stdItem = model_stdItem;
	}
	public String getModel_description() {
		return model_description;
	}
	public void setModel_description(String model_description) {
		this.model_description = model_description;
	}
	public String getModel_createdBy() {
		return model_createdBy;
	}
	public void setModel_createdBy(String model_createdBy) {
		this.model_createdBy = model_createdBy;
	}
	public Timestamp getModel_dateCreated() {
		return model_dateCreated;
	}
	public void setModel_dateCreated(Timestamp model_dateCreated) {
		this.model_dateCreated = model_dateCreated;
	}
	public String getModel_url() {
		return model_url;
	}
	public void setModel_url(String model_url) {
		this.model_url = model_url;
	}
	public String getModel_flagNextYear() {
		return model_flagNextYear;
	}
	public void setModel_flagNextYear(String model_flagNextYear) {
		this.model_flagNextYear = model_flagNextYear;
	}
	public String getModelGroupDUNS_model() {
		return modelGroupDUNS_model;
	}
	public void setModelGroupDUNS_model(String modelGroupDUNS_model) {
		this.modelGroupDUNS_model = modelGroupDUNS_model;
	}
	public String getModelGroupDUNS_description() {
		return modelGroupDUNS_description;
	}
	public void setModelGroupDUNS_description(String modelGroupDUNS_description) {
		this.modelGroupDUNS_description = modelGroupDUNS_description;
	}
	public String getModelGroupDUNS_createdBy() {
		return modelGroupDUNS_createdBy;
	}
	public void setModelGroupDUNS_createdBy(String modelGroupDUNS_createdBy) {
		this.modelGroupDUNS_createdBy = modelGroupDUNS_createdBy;
	}
	public Timestamp getModelGroupDUNS_dateCreated() {
		return modelGroupDUNS_dateCreated;
	}
	public void setModelGroupDUNS_dateCreated(Timestamp modelGroupDUNS_dateCreated) {
		this.modelGroupDUNS_dateCreated = modelGroupDUNS_dateCreated;
	}
	public int getModelGroupDUNS_groupDUNS() {
		return modelGroupDUNS_groupDUNS;
	}
	public void setModelGroupDUNS_groupDUNS(int modelGroupDUNS_groupDUNS) {
		this.modelGroupDUNS_groupDUNS = modelGroupDUNS_groupDUNS;
	}
	public String getModelGroupDUNS_franCode() {
		return modelGroupDUNS_franCode;
	}
	public void setModelGroupDUNS_franCode(String modelGroupDUNS_franCode) {
		this.modelGroupDUNS_franCode = modelGroupDUNS_franCode;
	}
	public int getStdItemFed_groupDUNS() {
		return stdItemFed_groupDUNS;
	}
	public void setStdItemFed_groupDUNS(int stdItemFed_groupDUNS) {
		this.stdItemFed_groupDUNS = stdItemFed_groupDUNS;
	}
	public String getStdItemFed_stdItem() {
		return stdItemFed_stdItem;
	}
	public void setStdItemFed_stdItem(String stdItemFed_stdItem) {
		this.stdItemFed_stdItem = stdItemFed_stdItem;
	}
	public String getStdItemFed_optCode() {
		return stdItemFed_optCode;
	}
	public void setStdItemFed_optCode(String stdItemFed_optCode) {
		this.stdItemFed_optCode = stdItemFed_optCode;
	}
	public String getStdItemFed_model() {
		return stdItemFed_model;
	}
	public void setStdItemFed_model(String stdItemFed_model) {
		this.stdItemFed_model = stdItemFed_model;
	}
	public String getStdItemFed_fedValueCurrent() {
		return stdItemFed_fedValueCurrent;
	}
	public void setStdItemFed_fedValueCurrent(String stdItemFed_fedValueCurrent) {
		this.stdItemFed_fedValueCurrent = stdItemFed_fedValueCurrent;
	}
	public String getStdItemFed_fedValueNext() {
		return stdItemFed_fedValueNext;
	}
	public void setStdItemFed_fedValueNext(String stdItemFed_fedValueNext) {
		this.stdItemFed_fedValueNext = stdItemFed_fedValueNext;
	}
	public Timestamp getStdItemFed_dateLastUpdated() {
		return stdItemFed_dateLastUpdated;
	}
	public void setStdItemFed_dateLastUpdated(Timestamp stdItemFed_dateLastUpdated) {
		this.stdItemFed_dateLastUpdated = stdItemFed_dateLastUpdated;
	}
	public String getStdItemFed_userUpdated() {
		return stdItemFed_userUpdated;
	}
	public void setStdItemFed_userUpdated(String stdItemFed_userUpdated) {
		this.stdItemFed_userUpdated = stdItemFed_userUpdated;
	}
	public String getStdItemFed_oemFlagStdCurrent() {
		return stdItemFed_oemFlagStdCurrent;
	}
	public void setStdItemFed_oemFlagStdCurrent(String stdItemFed_oemFlagStdCurrent) {
		this.stdItemFed_oemFlagStdCurrent = stdItemFed_oemFlagStdCurrent;
	}
	public String getStdItemFed_oemFlagStdNext() {
		return stdItemFed_oemFlagStdNext;
	}
	public void setStdItemFed_oemFlagStdNext(String stdItemFed_oemFlagStdNext) {
		this.stdItemFed_oemFlagStdNext = stdItemFed_oemFlagStdNext;
	}
	public String getStdItemFed_status() {
		return stdItemFed_status;
	}
	public void setStdItemFed_status(String stdItemFed_status) {
		this.stdItemFed_status = stdItemFed_status;
	}
	public String getStdItemFed_otherSpecs() {
		return stdItemFed_otherSpecs;
	}
	public void setStdItemFed_otherSpecs(String stdItemFed_otherSpecs) {
		this.stdItemFed_otherSpecs = stdItemFed_otherSpecs;
	}
	public boolean isEditRow() {
		return editRow;
	}
	public void setEditRow(boolean editRow) {
		this.editRow = editRow;
	}
	public String getStdItemFed_isParentOption() {
		return stdItemFed_isParentOption;
	}
	public void setStdItemFed_isParentOption(String stdItemFed_isParentOption) {
		this.stdItemFed_isParentOption = stdItemFed_isParentOption;
	}
	public boolean isCopy() {
		return copy;
	}
	public void setCopy(boolean copy) {
		this.copy = copy;
	}
	public Timestamp getGroupDUNS_dateReOpenAutoS() {
		return groupDUNS_dateReOpenAutoS;
	}
	public void setGroupDUNS_dateReOpenAutoS(Timestamp groupDUNS_dateReOpenAutoS) {
		this.groupDUNS_dateReOpenAutoS = groupDUNS_dateReOpenAutoS;
	}
	public String getGroupDUNS_flagAutoStd() {
		return groupDUNS_flagAutoStd;
	}
	public void setGroupDUNS_flagAutoStd(String groupDUNS_flagAutoStd) {
		this.groupDUNS_flagAutoStd = groupDUNS_flagAutoStd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStringTimestamp() {
		return stringTimestamp;
	}
	public void setStringTimestamp(String stringTimestamp) {
		this.stringTimestamp = stringTimestamp;
	}
	
}
