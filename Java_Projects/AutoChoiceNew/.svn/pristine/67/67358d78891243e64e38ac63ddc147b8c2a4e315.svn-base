package gov.gsa.fas.AutoChoice.controller;

import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.beans.AdminBean;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.service.AdminService;
import gov.gsa.fas.AutoChoice.service.CommonService;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("request")
public class AdminGroupController {
	
	private static final Log logger = LogFactory.getLog(AdminGroupController.class);

	@Autowired
	private LoginBean loginBean = null;
	
	@Autowired
	private CommonBean commonBean = null;		
	
	@Autowired
	private CommonService commonService = null;		

	@Autowired
	private AdminService adminService = null;	
	
	@Autowired
	private AdminBean adminBean = null;
		
	@RequestMapping(value = "/Admin", method = RequestMethod.GET)
	public String getManageUserAcct(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, BindingResult result) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		getAdminBean().setGroupCodeList(adminService.getGroupCodeList(getAdminBean(),getLoginBean().getCurrentUser()));
		//When the page loads and groupCode is empty or null, assign the first value in the list.
		if(null==  adminBeanParam.getGroupCode() || adminBeanParam.getGroupCode().equalsIgnoreCase("")){
			getAdminBean().setGroupCode(((UserGroupDTO)adminBean.getGroupCodeList().get(0)).getGroup_Code());
			getAdminBean().setGroupCodeDesc(((UserGroupDTO)adminBean.getGroupCodeList().get(0)).getDescription());
		}
		getAdminBean().setUserDetailsList(adminService.getUserDetails(getAdminBean(),getLoginBean().getCurrentUser()));
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "admin";		
	}
	
	@RequestMapping(value = "/AdminGroupAssign", method = RequestMethod.GET)
	public String getAdminGroupAssignment(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, 
			BindingResult result) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		
		getAdminBean().setGroupAssignmentList(adminService.getGroupAssignmentList(getAdminBean(),getLoginBean().getCurrentUser()));
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "adminGroupAssign";		
	}	
	

	@RequestMapping(value = "/AdminGroupAssign/{index}/{action}", method = RequestMethod.GET)
	public String deleteAdminGroup(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam,
			BindingResult result,@PathVariable String action,@PathVariable Integer index) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		
		if(action.equals("Delete")){			
			this.adminService.deleteGroup(getAdminBean(), index, getLoginBean().getCurrentUser());
		}
		
		getAdminBean().setGroupAssignmentList(adminService.getGroupAssignmentList(getAdminBean(),getLoginBean().getCurrentUser()));

		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "adminGroupAssign";		
	}
	
	@RequestMapping(value = "/UserDetails/{groupCode}", method = RequestMethod.GET)
	public String getUserDetails(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam,
			BindingResult result,@PathVariable String groupCode) {
		
		getAdminBean().setGroupCode(groupCode);
		getAdminBean().setUserDetailsList(adminService.getUserDetails(getAdminBean(),getLoginBean().getCurrentUser()));
		
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "admin";	
	}
	
	
	@RequestMapping(value = "/AdminAddNewGroup/{index}/{action}", method = RequestMethod.GET)
	public String getAdminAddNewGroup(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, 
			BindingResult result, @PathVariable String action, @PathVariable String index) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		
		if(action.equals("Edit")){			
			UserGroupDTO userGroup = getAdminBean().getGroupAssignmentList().get(Integer.parseInt(index));
			getAdminBean().setGroupCode(userGroup.getGroup_Code());
			
			getAdminBean().setGroupCodeDesc(userGroup.getDescription());
			
		}else if(action.equals("Add")){
			getAdminBean().setGroupCode("");
			getAdminBean().setGroupCodeDesc("");
		}
		
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "adminAddNewGroup";		
	}	
		
	@RequestMapping(value = "/AdminAddNewGroup", method = RequestMethod.POST)
	public String adminAddNewGroup(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, 
			BindingResult result, @RequestParam String action) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		String pageAction = "adminAddNewGroup";
		if(action.equals("Save")){

			getAdminBean().setGroupCode(adminBeanParam.getGroupCode());
			getAdminBean().setGroupCodeDesc(adminBeanParam.getGroupCodeDesc());				
			this.adminService.addUpdateNewGroup(getAdminBean(),getLoginBean().getCurrentUser());
			
			if(getAdminBean().getReturnMessage().equals("Updated the admin group successfully")
					|| getAdminBean().getReturnMessage().equals("Added new group successfully")){
			
				pageAction = "redirect:/AdminGroupAssign";
			}
		}
		
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return pageAction;		
	}
	
	
	@RequestMapping(value = "/AdminUserProfile/{index}/{action}", method = RequestMethod.GET)
	public String getAdminUserProfileActions(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, 
			BindingResult result, @PathVariable String action, @PathVariable int index) {	
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		String pageAction = "";
		if(action.equals("Edit")){			
			UserCombinedDTO userDetails = getAdminBean().getUserDetailsList().get(index);
			getAdminBean().setGroupCode(userDetails.getGroupCode());
			getAdminBean().setUserCombinedDTO(adminService.getUserProfile(getAdminBean(),userDetails));
			getAdminBean().setActionType(action);
			getAdminBean().setUserIndex(index);
			pageAction = "adminUserEditProfile";
			
		}else if(action.equals("Add")){			
			getAdminBean().setUsersToAddInGroup(adminService.getUsersToAddInGroup(getAdminBean(),getLoginBean().getCurrentUser()));
			
			/*looping the list to get the Description based on group code. Avoiding db call*/
			for (UserGroupDTO group : getAdminBean().getGroupCodeList()) {
				if(group.getGroup_Code().equals(getAdminBean().getGroupCode())){
					getAdminBean().setGroupCodeDesc(group.getDescription());
				}
			}
			
			pageAction = "adminAddUserToGroup";
			
		}else if(action.equals("View") || action.equals("Delete")){
			UserCombinedDTO userDetails = getAdminBean().getUserDetailsList().get(index);
			getAdminBean().setUserCombinedDTO(adminService.getUserProfile(getAdminBean(),userDetails));
			
			getAdminBean().setActionType(action);
			getAdminBean().setUserIndex(index);
			pageAction = "adminUserViewProfile";
		}
		
		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return pageAction;		
	}	
	
	@RequestMapping(value = "/AdminUserProfile", method = RequestMethod.POST)
	public String adminUserProfileActions(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam, 
			BindingResult result, @RequestParam String action) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
		String pageAction = "admin";
		
		if(action.equals("Save")){		
			adminBeanParam.getUserCombinedDTO().setStateList(getAdminBean().getUserCombinedDTO().getStateList());
			getAdminBean().setUserCombinedDTO(adminBeanParam.getUserCombinedDTO());
			
			this.adminService.updateUser(getAdminBean(),getLoginBean().getCurrentUser());
			
			if(!getAdminBean().getReturnMessage().equals("User profile updated successfully")){
				pageAction = "adminUserEditProfile";
			}
		}else if(action.equals("Add to "+getAdminBean().getGroupCodeDesc())){
			
			int index = 0;
			for(UserCombinedDTO userDetails: adminBeanParam.getUsersToAddInGroup()){				
				if(userDetails.getUserID().equals(getAdminBean().getUsersToAddInGroup().get(index).getUserID())){
					getAdminBean().getUsersToAddInGroup().get(index).setUserSelected(userDetails.isUserSelected());
				}				
				index++;
			}
			
			adminService.addNewUser(getAdminBean(), getLoginBean().getCurrentUser());
			
			if(!getAdminBean().getReturnMessage().equals("New User added to Group successfully")){
				pageAction = "adminAddUserToGroup";
			}
		}
		
		getAdminBean().setUserDetailsList(adminService.getUserDetails(getAdminBean(),getLoginBean().getCurrentUser()));

		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return pageAction;		
	}
	
	@RequestMapping(value = "/Admin/{index}/{action}", method = RequestMethod.GET)
	public String deleteUser(HttpServletResponse response, Model model, @ModelAttribute("adminBean") AdminBean adminBeanParam,
			BindingResult result,@PathVariable String action,@PathVariable Integer index) {
		setHeaders(response);
		getAdminBean().setReturnMessage("");
				
		if(action.equals("Delete")){	
			System.out.println(index);
			UserCombinedDTO userDetails = getAdminBean().getUserDetailsList().get(index);
			this.adminService.deleteUser(getAdminBean(), userDetails);
		}
		
		getAdminBean().setUserDetailsList(adminService.getUserDetails(getAdminBean(),getLoginBean().getCurrentUser()));

		model.addAttribute("adminBean", getAdminBean());
		model.addAttribute("commonBean", getCommonBean());
		
		return "admin";		
	}
	private void setHeaders(HttpServletResponse response) {
		// Set the compatibility mode to IE8 so that we won't have problems with other version of IE.
		response.addHeader("X-UA-Compatible", "IE=8");
	}

	/*Setting a limit for spring autogrow Collection to 2000. The default is 256*/
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.setAutoGrowCollectionLimit(2000);
	}
	
	public CommonBean getCommonBean() {
		return commonBean;
	}

	public void setCommonBean(CommonBean commonBean) {
		this.commonBean = commonBean;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public AdminBean getAdminBean() {
		return adminBean;
	}

	public void setAdminBean(AdminBean adminBean) {
		this.adminBean = adminBean;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
}
