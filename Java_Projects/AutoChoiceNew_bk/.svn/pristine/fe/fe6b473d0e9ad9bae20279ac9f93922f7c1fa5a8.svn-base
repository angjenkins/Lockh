
package gov.gsa.fas.AutoChoice.beans;

import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class AdminBean {
	
	Logger logger = Logger.getLogger(CommonBean.class.toString());
		
	private List<UserGroupDTO> groupCodeList = null;	
	private String groupCode = "";
	private String groupCodeDesc = "";
	private String returnMessage = "";
	private String userID = "";
	private List<UserCombinedDTO> userDetailsList = null;
	private List<UserGroupDTO> groupAssignmentList = null;
	private UserCombinedDTO userCombinedDTO = null;
	private String actionType = "";
	private int userIndex = 0;
	Map<String, String> privilegeMap = null;
	private List<UserCombinedDTO> usersToAddInGroup = null;
	private boolean userSelected = false;
	
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public List<UserGroupDTO> getGroupCodeList() {
		return groupCodeList;
	}

	public void setGroupCodeList(List<UserGroupDTO> groupCodeList) {
		this.groupCodeList = groupCodeList;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupCodeDesc() {
		return groupCodeDesc;
	}

	public void setGroupCodeDesc(String groupCodeDesc) {
		this.groupCodeDesc = groupCodeDesc;
	}			
	
	public List<UserCombinedDTO> getUserDetailsList() {
		return userDetailsList;
	}

	public void setUserDetailsList(List<UserCombinedDTO> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}
	
	public List<UserGroupDTO> getGroupAssignmentList() {
		return groupAssignmentList;
	}

	public void setGroupAssignmentList(List<UserGroupDTO> groupAssignmentList) {
		this.groupAssignmentList = groupAssignmentList;
	}
	
	public UserCombinedDTO getUserCombinedDTO() {
		return userCombinedDTO;
	}

	public void setUserCombinedDTO(UserCombinedDTO userCombinedDTO) {
		this.userCombinedDTO = userCombinedDTO;
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public int getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(int userIndex) {
		this.userIndex = userIndex;
	}

	public Map<String, String> getPrivilegeMap() {
		
		privilegeMap = new HashMap<String, String>();
		privilegeMap.put("1", "User 1 - Compare Price Only");
		privilegeMap.put("2", "User 2 - Up to Garage");
		privilegeMap.put("3", "User 3 - Up to Order Final");
		privilegeMap.put("S", "User S - Supervisor");
		
		return privilegeMap;
	}

	public void setPrivilegeMap(Map<String, String> privilegeMap) {
		this.privilegeMap = privilegeMap;
	}
	
	public List<UserCombinedDTO> getUsersToAddInGroup() {
		return usersToAddInGroup;
	}

	public void setUsersToAddInGroup(List<UserCombinedDTO> usersToAddInGroup) {
		this.usersToAddInGroup = usersToAddInGroup;
	}

	public boolean isUserSelected() {
		return userSelected;
	}

	public void setUserSelected(boolean userSelected) {
		this.userSelected = userSelected;
	}

	public void resetValues(){
		this.groupCode = "";
		this.groupCodeDesc = "";
		this.returnMessage = "";
		this.groupCodeList.clear();
		this.userDetailsList.clear();
		this.groupAssignmentList.clear();
		this.userID = "";
		this.userIndex = 0;
		this.actionType = "";
		this.usersToAddInGroup.clear();
	}
	
}
