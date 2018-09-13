package gov.gsa.fas.AutoChoice.controller;


import gov.gsa.fas.AutoChoice.DTO.CompareBean;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptCheckDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;









//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
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

import gov.gsa.fas.AutoChoice.service.CommonService;
import gov.gsa.fas.AutoChoice.service.OrderService;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;

/**
 * Handles requests for the application home page.
 */
import gov.gsa.fas.AutoChoice.beans.MinimumBean;
import gov.gsa.fas.AutoChoice.service.MinimumService;
import gov.gsa.fas.AutoChoice.util.UtilsLib;


@Controller
@Scope("request")
public class ComparePricesController {
	
	// private static final Log logger = LogFactory.getLog(
	// ComparePricesController.class);

	@Autowired
	private CommonBean commonBean = null;
	@Autowired
	private CommonService commonService = null;

	@Autowired
	private OrderService orderService = null;

	@Autowired
	private OrderBean orderBean = null;

	@Autowired
	private MinimumService minimumService = null;

	@Autowired
	private MinimumBean minimumBean = null;


	@RequestMapping(value = "/VehicleSelection/{orderType}", method = RequestMethod.GET)
	public String getVehicleSelection(HttpServletResponse response, ModelMap model,	@PathVariable String orderType) {
		setHeaders(response);
        
		if (orderType.equals("ByType") ) {
			if (getOrderBean().getVehType().equals("")){
				getOrderBean().setVehType("01");  //default
			}
		}
		
 		orderService.getSelectionBy(orderType);
		
		orderService.getStdItemList(getCommonBean().getUserAccount()
				.getFlg1122(), getOrderBean().getVehType());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "stdItem";
	}

	//initial loading default content
	@RequestMapping(value = "/StdItem", method = RequestMethod.GET)
	public String getStdItem(HttpServletResponse response, ModelMap model) {
		setHeaders(response);
		
		if (getOrderBean().getVehType().equals("")){
			getOrderBean().setVehType("01");  //default
			orderService.getSelectionBy("ByType");
			 //default actual wordings not code for it ByType.
		}

		//orderService.getSelectionBy(getOrderBean().getSelectionBy()); // for bread crum get the wordings
		
		orderService.getStdItemList(getCommonBean().getUserAccount()
				.getFlg1122(), getOrderBean().getVehType());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "stdItem";
	}

	@RequestMapping(value = "/StdItem/{vehType}", method = RequestMethod.GET)
	public String getStdItem(HttpServletResponse response, Model model,
			@PathVariable String vehType) {
		setHeaders(response);
		orderService.getStdItemList(getCommonBean().getUserAccount()
				.getFlg1122(), vehType);
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "stdItem";
	}

	@RequestMapping(value = "/StdItem/{vehType}", method = RequestMethod.POST)
	public String getOptions(HttpServletResponse response, Model model,
			@PathVariable String vehType,
			@ModelAttribute("orderBean") @Valid OrderBean orderBean,
			BindingResult result) {
		setHeaders(response);

		getOrderBean().setInputVehicleQuantity(1); //set initial value	
		getOrderBean().setCompareBeanList(null);
		getOrderBean().setInputOptionsAndQty(null);
		getOrderBean().setCollisionOptionInputList((null));
		
		
		
		
		if (result.hasErrors()) {
			// logger.info("There are errors in the page");
			return "stdItem";
		}

		String action = "";
		// need to refresh in case coming from quick selection
		orderService.getStdItemList(getCommonBean().getUserAccount()
				.getFlg1122(), vehType);

		// populate stditem dto for display
		// orderService.setStdItemSelected(getOrderBean().getStdItemList(),orderBean.getStdItemDTO().getStdItem());
		orderService.getOptionsList(orderBean.getStdItemDTO().getStdItem(),
				getCommonBean().getUserAccount());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "minimum";
	}

	@RequestMapping(value = "/StdItem", method = RequestMethod.POST)
	public String getOptios(HttpServletResponse response, Model model,
			@ModelAttribute("orderBean") @Valid OrderBean orderBean,
			BindingResult result) {
		setHeaders(response);

		if (result.hasErrors()) {
			// logger.info("There are errors in the page");
			return "stdItem";
		}
		String action = "";
		// Loading the Model List
		commonService.getModelsList(orderBean.getStdItemDTO());

		// need to refresh in case coming from quick selection
		orderService.getOptionsList(orderBean.getStdItemDTO().getStdItem(),
				getCommonBean().getUserAccount());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		//return "redirect:Options";
		return "redirect:Minimum";
	}

	@RequestMapping(value = "/Options/{stdItem}", method = RequestMethod.GET)
	public String getOptions(HttpServletResponse response, Model model,
			@PathVariable String stdItem) {
		setHeaders(response);

		String action = "";
		// need to refresh in case coming from quick selection

		// populate stditem dto for display ,also to act as storing the value
		// orderService.setStdItemSelected(getOrderBean().getStdItemList(),stdItem);

		orderService.getOptionsList(stdItem, getCommonBean().getUserAccount());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
	
  	return "options";
	}

	@RequestMapping(value = "/Options/{stdItem}", method = RequestMethod.POST)
	public String onOptionsPost(HttpServletResponse response, Model model,
			@ModelAttribute("orderBean") @Valid OrderBean orderBean,
			BindingResult result, @RequestParam String optionsAndQty,
			@PathVariable String stdItem) {
		setHeaders(response);


		getOrderBean().setInputVehicleQuantity(orderBean.getInputVehicleQuantity());
		getOrderBean().setInputOptionsAndQty(optionsAndQty);

		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:/Compare";
	}

	@RequestMapping(value = "/Options", method = RequestMethod.GET)
	public String getOptions(HttpServletResponse response, Model model) {
		setHeaders(response);

		// need to refresh in case coming from quick selection
		// orderService.getOptionsList(getOrderBean().getStdItemDTO().getStdItem(),action);
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "options";
	}

	@RequestMapping(value = "/Options", method = RequestMethod.POST)
	public String onSubmitOptios(HttpServletResponse response, Model model,
			@ModelAttribute("orderBean") @Valid OrderBean orderBean,
			BindingResult result, @RequestParam String optionsAndQty) {
		setHeaders(response);

		// need to refresh in case coming from quick selection
		getOrderBean().setInputVehicleQuantity(	orderBean.getInputVehicleQuantity());
		getOrderBean().setInputOptionsAndQty(optionsAndQty);		

		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:Compare";
	}

	@RequestMapping(value = "/Minimum/{stdItem}", method = RequestMethod.GET)
	public String getMinimum(Model model, HttpServletRequest request,
			HttpServletResponse response,@PathVariable String stdItem ) {
		setHeaders(response);

		orderService.getOptionsList(stdItem, getCommonBean().getUserAccount());
		minimumService.getMinimumReqList(getOrderBean().getStdItemDTO());
		orderService.getStdItemVerbiage(getOrderBean().getStdItemDTO().getStdItem());
        
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		model.addAttribute("minimumBean", getMinimumBean());
		return "minimum";
	}

	
	@RequestMapping(value = "/Minimum", method = RequestMethod.GET)
	public String	 getMinimum(Model model, HttpServletRequest request,
			HttpServletResponse response ) {
		setHeaders(response);

		minimumService.getMinimumReqList(getOrderBean().getStdItemDTO());
		orderService.getStdItemVerbiage(getOrderBean().getStdItemDTO().getStdItem());
        
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("minimumBean", getMinimumBean());
		return "minimum";
	}

	
	@RequestMapping(value = "/Minimum/{stdItem}", method = RequestMethod.POST)
	public String onSubmitMinimum(HttpServletResponse response, Model model,
			@ModelAttribute("orderBean") @Valid OrderBean orderBean,
			BindingResult result, @PathVariable String stdItem) {
		
		//orderService.getOptionsList(stdItem, getCommonBean().getUserAccount());
		//setOrderBean(orderBean);
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:/Options";
	}

	
	
	@RequestMapping(value = "/Compare", method = RequestMethod.GET)
	public String compare(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);
		orderService.getAvailableContract(getOrderBean().getStdItemDTO()
				.getStdItem(), getCommonBean().getUserAccount(),
				getCommonBean().getBatchControlFYear(), getOrderBean());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "compare";
	}
	
	@RequestMapping(value = "/Compare", method = RequestMethod.POST)
	public String onSubmitCompare(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result )  {

		setHeaders(response);
        
    	String pageAction ="";

    	// setting ContrlineDTO values for the selected (vehicle) contract+schline to be use in the next pages.          
		for (CompareBean compareBean: getOrderBean().getCompareBeanList()){
			if (compareBean.getContrLineDTO().getContract().equals(orderBean.getContrLineDTO().getContract()) && compareBean.getContrLineDTO().getSch_Line().equals(orderBean.getContrLineDTO().getSch_Line())){
				getOrderBean().setContrLineDTO(compareBean.getContrLineDTO());	
			}
		}
       
		//orderService.getOemClarificationList(getOrderBean());
	   
		if (orderBean.getContrLineDTO().getCurrentRow()> 0) {   // 0 is the lowest price, 1 is the second, an so forth..
	    	// user selected not the lowest price
	    	pageAction = "redirect:reqJustification";
	    }
	    else {
	    	pageAction = "redirect:OemClarifications";

	    }
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
	
	    
		//return "compare";
		return pageAction;
	}
	
	

	@RequestMapping(value = "/reqJustification", method = RequestMethod.GET)
	public String justification(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);

		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqJustification";
	}

	@RequestMapping(value = "/reqJustification", method = RequestMethod.POST)
	public String onJustification(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result )  {

		setHeaders(response);
		getOrderBean().getReqJust().setJustification(orderBean.getReqJust().getJustification());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:OemClarifications";
	}

	
	@RequestMapping(value = "/OemClarifications", method = RequestMethod.GET)
	public String oemClarifications(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);
		orderService.getOemClarificationList(getOrderBean());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "oemClarifications";
	}


	
	
	@RequestMapping(value = "/OemClarifications", method = RequestMethod.POST)
	public String onOemClarifications(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result )  {

		setHeaders(response);
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:ReqColors";
	}

	
	
	@RequestMapping(value = "/ReqColors", method = RequestMethod.GET)
	public String colors(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);

		orderService.getModelColorList(getOrderBean());
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqColors";
	}

	@RequestMapping(value = "/ReqColors", method = RequestMethod.POST)
	public String onColors(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result )  {

		setHeaders(response);
		getOrderBean().setModelColorList(orderBean.getModelColorList());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "redirect:ReqOrderSummary";
	}

	@RequestMapping(value = "/ReqOrderSummary", method = RequestMethod.GET)
	public String reqOrderSummary(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);

		orderService.setPendingOrderValues(orderBean);
		orderService.setPendingOrderValuesColor(orderBean);
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqOrderSummary";
	}

	
	
	@RequestMapping(value = "/ReqOrderSummary", method = RequestMethod.POST)
	public String onReqOrderSummary(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result )  {
		setHeaders(response);

		// updating here all the DTO's that will be needed in inserting to Cart
		getOrderService().getReqDetail(this.orderBean, this.commonBean.getUserAccount(), "Add");
		
	//	orderService.setPendingOrderValuesColor(orderBean);
		model.addAttribute("commonBean", this.commonBean);
		model.addAttribute("orderBean", this.orderBean);
		return "reqDetail";
	}

	



	
	
	@RequestMapping(value = "/Clarifications", method = RequestMethod.GET)
	public String clarifications(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);
		orderService.getClarificationEmissionList(getCommonBean(),
				getOrderBean(), "C");
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "clarifications";
	}

	@RequestMapping(value = "/Emissions", method = RequestMethod.GET)
	public String emissions(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		setHeaders(response);
		orderService.getClarificationEmissionList(getCommonBean(),
				getOrderBean(), "E");
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "emissions";
	}
	
	@RequestMapping(value = "/OtherFeatures", method = RequestMethod.GET)
	public String otherFeatures(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		getOrderService().getOtherFeatures(getOrderBean());
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "otherFeatures";
	}
	
	@RequestMapping(value = "/ReqDetails", method = RequestMethod.POST)
	public String reqDetails(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		getOrderService().getReqDetail(this.orderBean, this.commonBean.getUserAccount(), "Add");
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetail";
	}
	
	
	
	@RequestMapping(value = "/ReqDetails/{caseNumber}", method = RequestMethod.GET)
	public String reqDetails(@PathVariable String caseNumber, HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		getOrderService().getReqDetail(this.orderBean, this.commonBean.getUserAccount(), "Edit");
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetail";
	}
	
	@RequestMapping(value = "/ReqDetailsUpdate/{action}", method = RequestMethod.POST)
	public String reqDetailsUpdate(@PathVariable String action, HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		this.orderService.setReqDetail(this.orderBean, orderBean, this.commonBean, action);
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetail";
	}
	
	@RequestMapping(value = "/ReqDetailsMIPR", method = RequestMethod.POST)
	public String reqDetailsMIPR(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		getOrderService().getReqDetailMIPR(this.orderBean, this.commonBean.getUserAccount(), "Add");
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetailMIPR";
	}
	
	@RequestMapping(value = "/ReqDetailsMIPR/{caseNumber}", method = RequestMethod.GET)
	public String reqDetailsMIPR(@PathVariable String caseNumber, HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		getOrderService().getReqDetailMIPR(this.orderBean, this.commonBean.getUserAccount(), "Edit");
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetailMIPR";
	}
	
	@RequestMapping(value = "/ReqDetailsMIPRUpdate/{action}", method = RequestMethod.POST)
	public String reqDetailsMIPRUpdate(@PathVariable String action, HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		this.orderService.setReqDetailMIPR(this.orderBean, orderBean, this.commonBean, action);
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "reqDetailMIPR";
	}
	
	@RequestMapping(value = "/MIPRUploadSelect", method = RequestMethod.GET)
	public String miprUploadSelect(HttpServletResponse response, Model model,  @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		
		this.orderBean.setReturnMessage("");
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", orderBean);
		return "MIPRUpload";
	}
	
	@RequestMapping(value = "/MIPRUploadSelect", method = RequestMethod.POST)
	public String miprUploadSelectExecute(HttpServletResponse response, Model model, @ModelAttribute("orderBean")  @Valid OrderBean orderBean, BindingResult result) {
		setHeaders(response);
		this.orderBean.setReturnMessage("");
		try{
			this.orderBean.setReturnMessage(orderService.processMIPRUploadFile(orderBean));
		}
		catch(Exception ex){
			this.orderBean.setReturnMessage("File error: " + ex.getMessage());
		}
			
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderBean", getOrderBean());
		return "MIPRUpload";
	}

	private void setHeaders(HttpServletResponse response) {
		// Set the compatibility mode to IE8 so that we won't have problems with
		// other version of IE.
		response.addHeader("X-UA-Compatible", "IE=8");
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

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public OrderBean getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}

	public MinimumService getMinimumService() {
		return minimumService;
	}

	public void setMinimumService(MinimumService minimumService) {
		this.minimumService = minimumService;
	}

	public MinimumBean getMinimumBean() {
		return minimumBean;
	}

	public void setMinimumBean(MinimumBean minimumBean) {
		this.minimumBean = minimumBean;
	}


}
