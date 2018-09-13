
package gov.gsa.fas.AutoChoice.beans;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.BatchControlDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountGroupDUNSDTO;
import gov.gsa.fas.AutoChoice.DTO.VehTypeDTO;
import gov.gsa.fas.AutoChoice.DTO.GroupDunsBaseDTO;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

@Component
@Scope("session")
public class CommonBean {
	
	Logger logger = Logger.getLogger(CommonBean.class.toString());
	
	@Autowired
	private CommonDAO commonDAO = null;
	
	
	
	private Map<String,List <VehTypeDTO>> autoChoiceVehTypeMap = null;  //for autoChoice menu
	private String loggedinUser ="";

	private UserAccountDTO userAccount = null;  // this will be the session for keeping AutoChoice session variables
	private List<StdItemDTO> stdItemQuickSelectionList = null;
	private StdItemDTO stdItemDTO = null; 
	
	private String stdItem ="";
	private String stdItemDescription ="";
	private int batchControlFYear = 0;
	
	//List to store all the model details
	private List<ModelBean> modelList=null;
	
	//List to store all the states details
	private List<StatesDTO> statesList = null;
	
	public Map<String,List <VehTypeDTO>> getAutoChoiceVehTypeMap() {
		return autoChoiceVehTypeMap;
	}


	public void setAutoChoiceVehTypeMap(Map<String,List <VehTypeDTO>>  autoChoiceVehTypeMap) {
		this.autoChoiceVehTypeMap = autoChoiceVehTypeMap;
	}

	
	public String getLoggedinUser() {
		return loggedinUser;
	}

	public void setLoggedinUser(String loggedinUser) {
		this.loggedinUser = loggedinUser;
	}


	public UserAccountDTO getUserAccount() {
		return userAccount;
	}


	public void setUserAccount(UserAccountDTO userAccount) {
		this.userAccount = userAccount;
	}


	public List<StdItemDTO> getStdItemQuickSelectionList() {
		return stdItemQuickSelectionList;
	}


	public void setStdItemQuickSelectionList(
			List<StdItemDTO> stdItemQuickSelectionList) {
		this.stdItemQuickSelectionList = stdItemQuickSelectionList;
	}


	public String getStdItem() {
		return stdItem;
	}


	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}


	public String getStdItemDescription() {
		return stdItemDescription;
	}


	public void setStdItemDescription(String stdItemDescription) {
		this.stdItemDescription = stdItemDescription;
	}

	public int getBatchControlFYear() {
		return batchControlFYear;
	}


	public void setBatchControlFYear(int batchControlFYear) {
		this.batchControlFYear = batchControlFYear;
	}


	public List<ModelBean> getModelList() {
		return modelList;
	}


	public void setModelList(List<ModelBean> modelList) {
		this.modelList = modelList;
	}	

	public List<StatesDTO> getStatesList() {
		return statesList;
	}

	public void setStatesList(List<StatesDTO> statesList) {
		this.statesList = statesList;
	}
	
}
