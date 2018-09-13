package gov.gsa.fas.AutoChoice.controller;

import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.MyProfileBean;
import gov.gsa.fas.AutoChoice.service.CommonService;
import gov.gsa.fas.AutoChoice.service.MyProfileService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("request")
public class MyProfileController {
	
	private static final Log logger = LogFactory.getLog(MyProfileController.class);

	@Autowired
	private MyProfileBean myProfileBean = null;
	
	@Autowired
	private MyProfileService myProfileService = null;		
	
	@Autowired
	private CommonService commonService = null;
	
	@Autowired
	private CommonBean commonBean = null;
	
	@Autowired
	private UserAccountDTO userAccountDTO = null; 

	/**
	 * Used for redirecting the pages
	 */
	private boolean myProfredirect = false;
		
	@RequestMapping(value = "/MyProfile", method = RequestMethod.GET)
	public String editRegisteredUsersWithEmail(Model model,
			HttpServletRequest request, HttpServletResponse response) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		if(false == getMyProfileBean().isMyprofileRedirect()) {
			getMyProfileBean().setProfileResult("");
		} else {
			getMyProfileBean().setMyprofileRedirect(false);
		}
		getMyProfileService().populateProfileDetails(
				getCommonBean().getLoggedinUser());

		model.addAttribute("myProfileBean", getMyProfileBean());
		model.addAttribute("userAccountDTO", getMyProfileBean()
				.getUserAccountDTO());
		model.addAttribute("commonBean", getCommonBean());

		return "myProfile";

	}
	
	@RequestMapping(value = "/MyProfile", method = RequestMethod.POST)
	public String handlePostInEditRegisteredUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("myProfileBean") MyProfileBean myProfileBean,
			BindingResult result, @RequestParam String action, ModelMap model) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		getMyProfileBean().setProfileResult("");

		if (null != action) {
			if (action.equalsIgnoreCase("Save")) {
				getMyProfileService().save(myProfileBean,
						getCommonBean().getLoggedinUser());
			}
		}
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("myProfileBean", getMyProfileBean());
		model.addAttribute("userAccountDTO", getMyProfileBean()
				.getUserAccountDTO());
		return "redirect:/MyProfile";
	}

	
	private void setHeaders(HttpServletResponse response) {
		// Set the compatibility mode to IE8 so that we won't have problems with other version of IE.
		response.addHeader("X-UA-Compatible", "IE=8");
	}

	
	public MyProfileBean getMyProfileBean() {
		return myProfileBean;
	}

	public void setMyProfileBean(MyProfileBean myProfileBean) {
		this.myProfileBean = myProfileBean;
	}

	public MyProfileService getMyProfileService() {
		return myProfileService;
	}

	public void setMyProfileService(MyProfileService myProfileService) {
		this.myProfileService = myProfileService;
	}

	public boolean isMyProfredirect() {
		return myProfredirect;
	}

	public void setMyProfredirect(boolean myProfredirect) {
		this.myProfredirect = myProfredirect;
	}

	public UserAccountDTO getUserAccountDTO() {
		return userAccountDTO;
	}

	public void setUserAccountDTO(UserAccountDTO userAccountDTO) {
		this.userAccountDTO = userAccountDTO;
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
}
