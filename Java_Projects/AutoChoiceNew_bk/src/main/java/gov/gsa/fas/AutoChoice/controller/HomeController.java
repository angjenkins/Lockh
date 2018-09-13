package gov.gsa.fas.AutoChoice.controller;

import java.util.ArrayList;
import java.util.List;

import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.beans.AdminBean;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.FSRBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.jboss.cache.interceptors.Interceptor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.service.CommonService;
import gov.gsa.fas.AutoChoice.service.LoginService;
import gov.gsa.fas.AutoChoice.util.UtilsLib;
//import gov.gsa.fas.AutoChoice.service.OrderService;
//import gov.gsa.fas.AutoChoice.beans.OrderBean;


/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("request")
public class HomeController  {
	
	//private static final Log logger = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private LoginBean loginBean = null;
	
	@Autowired
	private CommonBean commonBean = null;
		
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CommonService commonService = null;
	
	@Autowired
	private FSRBean fsrBean = null;
	
	@Autowired
	private OrderBean orderBean = null;
	
	
	private static final Log logger = LogFactory.getLog(HomeController.class);

	
	
//	@Autowired
//	private OrderService orderService = null;
//	
//	@Autowired
//	private OrderBean orderBean = null;
//	
//	private String vehType = "";
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		return "redirect:Home";
	}
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
	
		
		model.addAttribute("loginBean", getLoginBean());
		return "home";
	}
	
//	@RequestMapping(value = "/Sedans", method = RequestMethod.GET)
//	public String sedans(Model model, HttpServletRequest request, HttpServletResponse response) {
//		setHeaders(response);
//		model.addAttribute("commonBean", getCommonBean());
//		return "sedans";
//	}
//	
//	
//
//	
//	@RequestMapping(value = "/Minimumtest", method = RequestMethod.GET)
//	public String minimumtest(Model model, HttpServletRequest request, HttpServletResponse response) {
//		setHeaders(response);
//		model.addAttribute("commonBean", getCommonBean());
//
//		return "minimumtest";
//	}
//	
	
//	@RequestMapping(value = "/Colors", method = RequestMethod.GET)
//	public String colors(Model model, HttpServletRequest request, HttpServletResponse response) {
//		setHeaders(response);
//		model.addAttribute("commonBean", getCommonBean());
//
//		return "colors";
//	}
//	
//		
//	@RequestMapping(value = "/Notetoput", method = RequestMethod.GET)
//	public String notetoput(Model model, HttpServletRequest request, HttpServletResponse response) {
//		setHeaders(response);
//		model.addAttribute("commonBean", getCommonBean());
//
//		return "notetoput";
//	}
		
	
	@RequestMapping(value = "/Summary", method = RequestMethod.GET)
	public String summary(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "summary";
	}
	
		@RequestMapping(value = "/FormSubmit", method = RequestMethod.GET)
	public String formSubmit(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "formSubmit";
	}
	@RequestMapping(value = "/ListingAv", method = RequestMethod.GET)
	public String listingAv(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "listingAv";
	}
	
	@RequestMapping(value = "/MIPRAcceptance", method = RequestMethod.GET)
	public String miprAcceptance(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "MIPRAcceptance";
	}
	
	@RequestMapping(value = "/MIPRUpload", method = RequestMethod.GET)
	public String miprUpload(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "MIPRUpload";
	}
	
	@RequestMapping(value = "/Multiple", method = RequestMethod.GET)
	public String multiple(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "multiple";
	}
	
	@RequestMapping(value = "/Express", method = RequestMethod.GET)
	public String express(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "express";
	}
	
	@RequestMapping(value = "/MvdeliveryOrder", method = RequestMethod.GET)
	public String mvdeliveryOrder(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "mvdeliveryOrder";
	}
	
	@RequestMapping(value = "/OrderDeliveryProc", method = RequestMethod.GET)
	public String orderDeliveryProc(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "orderDeliveryProc";
	}
	
	@RequestMapping(value = "/NonStandard", method = RequestMethod.GET)
	public String nonStandard(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "nonStandard";
	}
	
	@RequestMapping(value = "/OrderStatus", method = RequestMethod.GET)
	public String orderStatus(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "orderStatus";
	}
	
	@RequestMapping(value = "/OrderStatusReceipt", method = RequestMethod.GET)
	public String orderStatusReceipt(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "orderStatusReceipt";
	}
	
	@RequestMapping(value = "/Pendingorders", method = RequestMethod.GET)
	public String pendingorders(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "pendingorders";
	}
	
	@RequestMapping(value = "/Blank", method = RequestMethod.GET)
	public String blank(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());

		return "blankTemplate";
	}
	
	
	
	
	@RequestMapping(value = "/Home", method = RequestMethod.POST)
	public String validate(HttpServletResponse response,HttpServletRequest request, @ModelAttribute("loginBean") @Valid LoginBean loginBean, BindingResult result, ModelMap model) {
		setHeaders(response);
		
		if(true == result.hasErrors()) {
			logger.info("There are errors in the login page");
			return "home";
			
		}
		
		String strInvlidString = UtilsLib.validateRequestObject(request);
		if (strInvlidString != null && !strInvlidString.trim().equals("")) {
			getLoginBean().setMessage("Invalid/Mailicious code in the data entry "
					+ strInvlidString);
			model.addAttribute("loginBean", getLoginBean());
			return "home";
		}
		
		if("Update".equals(loginBean.getPageAction()))
			loginService.changePassword(loginBean);
		else
			loginService.performTask(loginBean);
		
		
		if(getLoginBean().getNextpage()=="home")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		
		if(getLoginBean().getNextpage()=="changePassword")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		
		if(getLoginBean().getNextpage()=="forgotPassword")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		
		if(getLoginBean().getNextpage()=="suspended")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		if(getLoginBean().getNextpage()=="ErrMsg01")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		
		//default would be BY TYPE  
       /**
		 * get menu for AutoChoice here
		*/
		// get variable setting from agency table
		getCommonBean().setUserAccount(getLoginBean().getCurrentUser());	 
		getCommonService().getAgencyBureauAcces(getCommonBean().getUserAccount());
		//quick selection should be okay to access once only.
		getCommonService().getStdItemQuickSelection(getCommonBean().getUserAccount());
		
		String proprietaryFlag = "N";  // default when user login  listing of vehicle not proprietary,initial listing will be BY TYPE
		getCommonService().getAutoChoiceVehTypeRecordList(proprietaryFlag);
		
		getCommonBean().setLoggedinUser(getLoginBean().getCurrentUser().getUserID());
		//commonBean.getBatchControlRecord();
		
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("loginBean", getLoginBean());
		
		return "redirect:StdItem";
	}
	

	@RequestMapping(value = "/ChangePassword", method = RequestMethod.GET)
	public String getChangePw(HttpServletResponse response, Model model,@ModelAttribute("loginBean")  @Valid LoginBean loginBean, BindingResult result) {
		//logger.info("Going to Password Reset page!");
		setHeaders(response);
		if(result.hasErrors()) {
	//		logger.info("There are errors in the page");
			return "changePassword";
		}
		
		
		model.addAttribute("loginBean", getLoginBean());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		
		
		return "changePassword";
		
	}
	
	@RequestMapping(value = "/ChangePassword", method = RequestMethod.POST)
	public String changePw(HttpServletResponse response,HttpServletRequest request, @ModelAttribute("loginBean") @Valid LoginBean loginBean, BindingResult result, ModelMap model) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		
		if(true == result.hasErrors()) {
	//		logger.info("There are errors in the login page");
			return "home";
		}
		
		loginService.changePassword(loginBean);
		
		if(getLoginBean().getNextpage()=="home")
		{
			model.addAttribute("loginBean", getLoginBean());
			return getLoginBean().getNextpage();
		}
		
		if(getLoginBean().getNextpage()=="changePassword")
		{
			model.addAttribute("loginBean", getLoginBean());
			model.addAttribute("commonBean", getCommonBean());
			model.addAttribute("orderBean", getOrderBean());
			return getLoginBean().getNextpage();
		}
		
				
		return getLoginBean().getNextpage();
	}
	
	@RequestMapping(value = "/Land", method = RequestMethod.GET)
	public String land(HttpServletResponse response, Model model) {
		//logger.info("Going to landing page!");
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());
		return "land";
	}
	
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String logout(HttpServletResponse response, Model model, HttpServletRequest request) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		
		if( false == request.isRequestedSessionIdValid() ) {
			return "performLogout";
		}
		
		loginService.performLogout(request);
		
		model.addAttribute("loginBean", getLoginBean());
		return "performLogout"; 
	} 
	
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String registerUser(HttpServletResponse response, Model model, @ModelAttribute("loginBean") LoginBean loginBeanParam,
			BindingResult result) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		getLoginBean().getUserCombinedDTO().resetValues();
		getLoginBean().getUserCombinedDTO().setStateList(commonService.getStatesList());
		getLoginBean().setModalDialogFlag(true);
		getLoginBean().getModalDialogErrMsg().userExDetail = "";
		model.addAttribute("loginBean", getLoginBean());
		
		return "home"; 
	} 
	
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String registerUser(HttpServletResponse response, Model model, @ModelAttribute("loginBean") LoginBean loginBeanParam,
			BindingResult result, @RequestParam String action) {
		// Call this first thing in any request/response cycle.
		setHeaders(response);
		if(null != action){
			if (action.equalsIgnoreCase("Register")) {
				
				loginBeanParam.getUserCombinedDTO().setStateList(getLoginBean().getUserCombinedDTO().getStateList());
				getLoginBean().setUserCombinedDTO(loginBeanParam.getUserCombinedDTO());
				loginService.registerUser(getLoginBean());
					
			} else if (action.equalsIgnoreCase("Close") || action.equalsIgnoreCase("x")) {
				getLoginBean().setModalDialogFlag(false);
				getLoginBean().getModalDialogErrMsg().userExDetail = "";
			}
		}		
		model.addAttribute("loginBean", getLoginBean());
		return "redirect:/Home"; 
	}
	
	private void setHeaders(HttpServletResponse response) {
		// Set the compatibility mode to IE8 so that we won't have problems with other version of IE.
		response.addHeader("X-UA-Compatible", "IE=8");
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	public CommonBean getCommonBean() {
		return commonBean;
	}

	public void setCommonBean(CommonBean commonBean) {
		this.commonBean = commonBean;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public FSRBean getFsrBean() {
		return fsrBean;
	}

	public void setFsrBean(FSRBean fsrBean) {
		this.fsrBean = fsrBean;
	}

	public OrderBean getOrderBean() {
		return orderBean;
	}


	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}

	
}