package gov.gsa.fas.AutoChoice.service;



import gov.gsa.fas.AutoChoice.DAO.AdminDAO;
import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupAccessDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.beans.AdminBean;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.util.UserException;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class AdminService {

	@Autowired
	private CommonBean commonBean;

	@Autowired
	private CommonDAO commonDAO;
	
	private AdminDAO adminDAO = new AdminDAO();

	public List<UserGroupDTO> getGroupCodeList(AdminBean adminBean,UserAccountDTO user) {		
		
		ArrayList<UserGroupDTO> returnValue = new ArrayList<UserGroupDTO>();
		try{
			returnValue = adminDAO.getGroupCodeList(user);
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to retrieve admin group list");
		}		
		return returnValue;
	}

	/*Get user details based on the group code desc selected*/

	public List<UserCombinedDTO> getUserDetails(AdminBean adminBean, UserAccountDTO currentUser) {
		
		ArrayList<UserCombinedDTO> returnValue = new ArrayList<UserCombinedDTO>();
		try{
			returnValue = adminDAO.getUserDetails(adminBean.getGroupCode(), currentUser);
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to retrieve admin User Details list");
		}		
		return returnValue;
	}

	public List<UserGroupDTO> getGroupAssignmentList(AdminBean adminBean,UserAccountDTO user) {
		
		ArrayList<UserGroupDTO> returnValue = new ArrayList<UserGroupDTO>();
		try{
			returnValue = adminDAO.getGroupAssignmentList(user);
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to retrieve admin group assignment list");
		}		
		return returnValue;

	}
	
	/*Adding a new Group or Updating an existing one*/

	public void addUpdateNewGroup(AdminBean adminBean,UserAccountDTO user){

		Calendar nowCal = Calendar.getInstance();
		Timestamp currentDate = new Timestamp(nowCal.getTimeInMillis());

		if ("".equals(adminBean.getGroupCode())) {
			
			adminBean.setReturnMessage("Group Code is required.  Please try again.");
			return;
			
		} else if ("".equals(adminBean.getGroupCodeDesc())) {
			
			adminBean.setReturnMessage("Group Description is required.  Please try again.");
			return;
		}
		try {
			UserGroupDTO userGroup = adminDAO.getGroupDetails(adminBean.getGroupCode(), user.getAgencyCode(),
					user.getBureauCode());

			/*
			 * check if user group for the groupcode passed exists. If exists,
			 * update the record.
*			 */
			if (null != userGroup) {

				userGroup.setGroup_Code(adminBean.getGroupCode());
				userGroup.setDescription(adminBean.getGroupCodeDesc());
				userGroup.setUserUpdated(user.getUserID());
				userGroup.setDateLastUpdated(currentDate);
				adminDAO.addUpdateNewGroup(userGroup);

				adminBean.setReturnMessage("Updated the admin group successfully");
			} else {

				/* If no user group, add a new one. */
				userGroup = new UserGroupDTO();
				userGroup.setAgency_Code(user.getAgencyCode());
				userGroup.setBureau_Code(user.getBureauCode());
				userGroup.setGroup_Code(adminBean.getGroupCode());
				userGroup.setDescription(adminBean.getGroupCodeDesc());
				userGroup.setDateCreated(currentDate);
				userGroup.setCreatedBy(user.getUserID());
				userGroup.setUserUpdated(user.getUserID());
				userGroup.setDateLastUpdated(currentDate);
				adminDAO.addUpdateNewGroup(userGroup);

				adminBean.setReturnMessage("Added new group successfully");
			}
		}catch(Exception ex){
			adminBean.setReturnMessage("Failed to add/update a new group");
		}		

	}

	/*Delete user selected Group.*/
	public void deleteGroup(AdminBean adminBean, int index,
			UserAccountDTO currentUser) {
		
		UserGroupDTO dto = new UserGroupDTO();
		try{
			adminBean.getGroupAssignmentList().get(index);
			dto.setGroup_Code(((UserGroupDTO)adminBean.getGroupAssignmentList().get(index)).getGroup_Code());
			dto.setAgency_Code(currentUser.getAgencyCode());
			dto.setBureau_Code(currentUser.getBureauCode());
			adminDAO.deleteGroup(dto);
			adminBean.setReturnMessage("Admin Group deleted successfully");
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to delete admin group");
		}
	}

	public UserCombinedDTO getUserProfile(AdminBean adminBean,UserCombinedDTO userDetails) {
		
		UserCombinedDTO returnValue = new UserCombinedDTO();
		try{
			returnValue = adminDAO.getUserProfile(userDetails);
			returnValue.setGroupCode(userDetails.getGroupCode());
			returnValue.setStateList(commonDAO.getStateList("USA"));
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to retrieve user profile");
		}		
		return returnValue;
	}

	public void deleteUser(AdminBean adminBean, UserCombinedDTO userDetails) {
		UserGroupAccessDTO dto = new UserGroupAccessDTO();
		try{
			
			dto.setUser_Id(userDetails.getUserID());
			dto.setGroup_Code(userDetails.getGroupCode());
			dto.setAgency_Code(userDetails.getAgencyCode());
			dto.setBureau_Code(userDetails.getBureauCode());
			adminDAO.deleteUser(dto);
			adminBean.setReturnMessage("User deleted successfully");
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to delete user");
		}		
	}

	public void updateUser(AdminBean adminBean, UserAccountDTO currentUser) {
		
		UserCombinedDTO userDTO = adminBean.getUserCombinedDTO();

		try {

			if (null != userDTO) {
				if ("".equals(userDTO.getEmail().trim())) {
					adminBean
							.setReturnMessage("Email is required.  Please try again.");
					return;
				} else if ("".equals(userDTO.getFirstName())) {
					adminBean
							.setReturnMessage("First Name is required.  Please try again.");
					return;
				} else if ("".equals(userDTO.getLastName())) {
					adminBean
							.setReturnMessage("Last Name is required.  Please try again.");
					return;
				} else if ("".equals(userDTO.getTelephone())) {
					adminBean
							.setReturnMessage("Telephone is required.  Please try again.");
					return;
				} else if ("".equals(userDTO.getCity())) {
					adminBean
							.setReturnMessage("City is required.  Please try again.");
					return;
				} else if ("".equals(userDTO.getCountry())) {
					adminBean
							.setReturnMessage("Country is required. Please try again.");
					return;
				} else if (!UtilsLib.isNumeric(
						String.valueOf(userDTO.getZipcode()), "INT")) {
					adminBean
							.setReturnMessage("Zipcode must be numeric.  Please try again.");
					return;
				} else if (!(String.valueOf(userDTO.getZipcode()).length() == 5)) {
					adminBean
							.setReturnMessage("Zipcode must of length 5.  Please try again.");
					return;
				} else if (!validateEmail(userDTO.getEmail())) {
					adminBean
							.setReturnMessage("Email is not in valid format.  Please try again.");
					return;
				}
			}
			
			adminDAO.updateUser(adminBean.getUserCombinedDTO(), currentUser);
			adminBean.setReturnMessage("User profile updated successfully");
			
		} catch (Exception ex) {
			adminBean.setReturnMessage("Failed to update user profile");
		}
	}
	
	public ArrayList<UserCombinedDTO> getUsersToAddInGroup(AdminBean adminBean, UserAccountDTO currentUser){
		ArrayList<UserCombinedDTO> returnValue = new ArrayList<UserCombinedDTO>();
		try{
			returnValue = adminDAO.getUsersToAddInGroup(adminBean.getGroupCode(), currentUser);
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Failed to retrieve User Details list");
		}		
		return returnValue;
	}

	public void addNewUser(AdminBean adminBean, UserAccountDTO currentUser) {

		List<UserCombinedDTO> usersToBeAddedList = adminBean.getUsersToAddInGroup();
		List<UserGroupAccessDTO> userDTOList = new ArrayList<UserGroupAccessDTO>();
		UserGroupAccessDTO userGrpAccessDTO = null;
		Calendar nowCal = Calendar.getInstance();
		Timestamp currentDate = new Timestamp(nowCal.getTimeInMillis());
		
		try {
			for(UserCombinedDTO userDTO: usersToBeAddedList){			
				if(userDTO.isUserSelected()){
					userGrpAccessDTO = new UserGroupAccessDTO();
					
					userGrpAccessDTO.setUser_Id(userDTO.getUserID());
					userGrpAccessDTO.setAgency_Code(currentUser.getAgencyCode());
					userGrpAccessDTO.setBureau_Code(currentUser.getBureauCode());
					userGrpAccessDTO.setGroup_Code(adminBean.getGroupCode());
					userGrpAccessDTO.setPrivilege("2");
					userGrpAccessDTO.setUserLastUpdated(currentUser.getUserID());
					userGrpAccessDTO.setDateUpdated(currentDate);
					
					userDTOList.add(userGrpAccessDTO);
				}
			}
			
			adminDAO.addNewUser(userDTOList);
			adminBean.setReturnMessage("New User added to Group successfully");
		} catch (Exception e) {
			adminBean.setReturnMessage("Failed to add new user to Group");

		}
		
	}
	
	public boolean validateEmail(String email) {

		boolean result = false;
		// If field has valid chars check format
		if (email.length() > 1) {
			if ((email.indexOf("@") > 0) || (email.indexOf(".") > 0)) {
				result = true;
			}
		}
		return result;
	}
}

