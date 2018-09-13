package gov.gsa.fas.AutoChoice.controller;

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.FSRBean;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.beans.OrderStatusBean;
import gov.gsa.fas.AutoChoice.service.CommonService;
import gov.gsa.fas.AutoChoice.service.LoginService;
import gov.gsa.fas.AutoChoice.service.OrderStatusService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("request")
public class OrderStatusController {
	
	private static final Log logger = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private LoginBean loginBean = null;
	
	@Autowired
	private CommonBean commonBean = null;
		
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CommonService commonService = null;
	
	@Autowired
	private OrderStatusBean orderStatusBean = null;
	
	OrderStatusService orderStatusService = new OrderStatusService();
	
	@RequestMapping(value = "/OrderStatusVehReceiptForm", method = RequestMethod.GET)
	public String orderStatusVehReceipt(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		this.orderStatusBean.setOrderAction("vehReceipt");
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusVehReceiptForm";
	}
	
	@RequestMapping(value = "/OrderStatusMain/{searchTypeParam}/{searchKey1}/{searchKey2}/{searchKey3}", method = RequestMethod.GET)
	public String orderStatusMain(@PathVariable String searchTypeParam, @PathVariable String searchKey1,@PathVariable String searchKey2, @PathVariable String searchKey3, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		this.orderStatusBean.setOrderAction("main");
		this.orderStatusBean.setSource("main");
		this.orderStatusBean.setSearchType(searchTypeParam);
		this.orderStatusBean.setSearchKey1(searchKey1);
		if(searchKey2.equals("ZZ")){
			this.orderStatusBean.setSearchKey2("");
		}
		else{
			this.orderStatusBean.setSearchKey2(searchKey2);
		}
		if(searchKey3.equals("ZZ")){
			this.orderStatusBean.setSearchKey3("");
		}
		else{
			this.orderStatusBean.setSearchKey3(searchKey3);
		}
		
		this.orderStatusService.loadOrderStatusMain(this.orderStatusBean, getLoginBean());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusMain";
	}
	
	@RequestMapping(value = "/OrderStatusContract/{searchTypeParam}/{searchKey1}/{searchKey2}/{searchKey3}", method = RequestMethod.GET)
	public String orderStatusContract(@PathVariable String searchTypeParam, @PathVariable String searchKey1,@PathVariable String searchKey2, @PathVariable String searchKey3, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		boolean matches = false;
		this.orderStatusBean.setOrderAction("main");
		this.orderStatusBean.setSearchType(searchTypeParam);
		this.orderStatusBean.setSearchKey1(searchKey1);
		if(searchKey2.equals("ZZ")){
			this.orderStatusBean.setSearchKey2("");
		}
		else{
			this.orderStatusBean.setSearchKey2(searchKey2);
		}
		if(searchKey3.equals("ZZ")){
			this.orderStatusBean.setSearchKey3("");
		}
		else{
			this.orderStatusBean.setSearchKey3(searchKey3);
		}
		
		if(this.orderStatusBean.getOrderStatusList() != null && 
				this.orderStatusBean.getOrderStatusList().size() > 0){
			//re load req list if it's empty or isn't the correct list
			if(searchTypeParam.equalsIgnoreCase("Case") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getCase_number())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("AgencyOrderNumber") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_agency_order_number())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("VIN") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getOrder_status_vin())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("Requisition") && 
					searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_1()) && 
					searchKey2.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_2()) &&
					searchKey3.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_3())){
				matches = true;
			}
			if(!matches){
				this.orderStatusBean.setOrderStatusList(this.orderStatusService.getOrderStatusReqList(orderStatusBean));
				this.orderStatusBean.setCaseNumber(this.orderStatusBean.getOrderStatusList().get(0).getCase_number());
			}
		}
		else{
			this.orderStatusBean.setOrderStatusList(this.orderStatusService.getOrderStatusReqList(orderStatusBean));
			this.orderStatusBean.setCaseNumber(this.orderStatusBean.getOrderStatusList().get(0).getCase_number());
		}
		
		this.orderStatusService.checkCase(this.orderStatusBean, getLoginBean().getCurrentUser());
		if(this.orderStatusBean.getReturnMessage().equalsIgnoreCase("This case does not belong to your agency/bureau")){
			//wrong agency/bureau
			this.orderStatusBean.getOrderStatusList().clear();
		}
		else{		
			this.orderStatusBean.setContrCaseList(this.orderStatusService.getContrCaseList(this.orderStatusBean));
			if(this.orderStatusBean.getContrCaseList() != null && this.orderStatusBean.getContrCaseList().size() > 0){
				this.orderStatusBean.setContractLineOptionList(this.orderStatusService.getContractLineOptionList(this.orderStatusBean));
			}
		}
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusContract";
	}
	
	@RequestMapping(value = "/OrderStatusAddress/{searchTypeParam}/{searchKey1}/{searchKey2}/{searchKey3}", method = RequestMethod.GET)
	public String orderStatusAddress(@PathVariable String searchTypeParam, @PathVariable String searchKey1,@PathVariable String searchKey2, @PathVariable String searchKey3, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		boolean matches = false;
		this.orderStatusBean.setOrderAction("main");
		this.orderStatusBean.setSearchType(searchTypeParam);
		this.orderStatusBean.setSearchKey1(searchKey1);
		if(searchKey2.equals("ZZ")){
			this.orderStatusBean.setSearchKey2("");
		}
		else{
			this.orderStatusBean.setSearchKey2(searchKey2);
		}
		if(searchKey3.equals("ZZ")){
			this.orderStatusBean.setSearchKey3("");
		}
		else{
			this.orderStatusBean.setSearchKey3(searchKey3);
		}
		
		if(this.orderStatusBean.getOrderStatusList() != null && 
				this.orderStatusBean.getOrderStatusList().size() > 0){
			//re load req list if it's empty or isn't the correct list
			if(searchTypeParam.equalsIgnoreCase("Case") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getCase_number())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("AgencyOrderNumber") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_agency_order_number())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("VIN") && searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getOrder_status_vin())){
				matches = true;
			}
			else if(searchTypeParam.equalsIgnoreCase("Requisition") && 
					searchKey1.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_1()) && 
					searchKey2.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_2()) &&
					searchKey3.equalsIgnoreCase(this.orderStatusBean.getOrderStatusList().get(0).getReq_fed_mil_req_3())){
				matches = true;
			}
			if(!matches){
				this.orderStatusBean.setOrderStatusList(this.orderStatusService.getOrderStatusReqList(orderStatusBean));
				this.orderStatusBean.setCaseNumber(this.orderStatusBean.getOrderStatusList().get(0).getCase_number());
			}
		}
		else{
			this.orderStatusBean.setOrderStatusList(this.orderStatusService.getOrderStatusReqList(orderStatusBean));
			this.orderStatusBean.setCaseNumber(this.orderStatusBean.getOrderStatusList().get(0).getCase_number());
		}
		
		this.orderStatusService.checkCase(this.orderStatusBean, getLoginBean().getCurrentUser());
		if(this.orderStatusBean.getReturnMessage().equalsIgnoreCase("This case does not belong to your agency/bureau")){
			//wrong agency/bureau
			this.orderStatusBean.getOrderStatusList().clear();
		}
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusAddress";
	}
	
	@RequestMapping(value = "/OrderStatusMain", method = RequestMethod.POST)
	public String orderStatusMainPost(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean) {
		final int VINLENGTH = 17;
		setHeaders(response);
		String destination = "orderStatusMain";
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setSource("main");
		this.orderStatusBean.setOrderAction(orderStatusBean.getOrderAction());
		boolean everythingFine = false;
		this.orderStatusBean.setSearchType(orderStatusBean.getSearchType());
		if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
			String str = orderStatusBean.getSearchFrom();
			StringTokenizer st = new StringTokenizer(str);	
			int counter = 1;
			while (st.hasMoreElements()) {
				if(counter == 1){
					this.orderStatusBean.setSearchKey1((String)st.nextElement());
				}
				else if(counter == 2){
					this.orderStatusBean.setSearchKey2((String)st.nextElement());
				} 
				else if(counter == 3){
					this.orderStatusBean.setSearchKey3((String)st.nextElement());
				}
			}
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
			this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom());
			this.orderStatusBean.setSource("choose");
			if(orderStatusBean.getSearchFrom().trim().length() < VINLENGTH){
				//get partial match list
				this.orderStatusBean.setOrderStatusVehReceiptList(this.orderStatusService.getOrderStatusPartialVINList(this.orderStatusBean, getLoginBean().getCurrentUser()));
				if(this.orderStatusBean.getReturnMessage().trim().length() > 0){
					//there was an exception when retrieving req list
					destination = "orderStatusMainForm";
				}
				if(this.orderStatusBean.getOrderStatusVehReceiptList() == null || this.orderStatusBean.getOrderStatusVehReceiptList().size() < 1){
					this.orderStatusBean.setReturnMessage("There were no requisitions matching that VIN pattern");
					destination = "orderStatusMainForm";
				}
				else{
					destination = "orderStatusChooseCase";
				}				
			}
			else{
				everythingFine = true;
				destination = "orderStatusMain";
			}
		}	
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
			this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom());				
			this.orderStatusBean.setReqList(this.orderStatusService.getOrderStatusReqAgOrdNoList(this.orderStatusBean));
			if(this.orderStatusBean.getReturnMessage().trim().length() > 0){
				//there was an exception when retrieving req list
				destination = "orderStatusMainForm";
			}
			else{
				if(this.orderStatusBean.getReqList() == null || this.orderStatusBean.getReqList().size() < 1 ){	
					this.orderStatusBean.setReturnMessage("There were no requisitions for that number");
					destination = "orderStatusMainForm";
				}
				else if(this.orderStatusBean.getReqList().size() == 1){
					everythingFine = true;
					destination = "orderStatusMain";
				}
				else{
					this.orderStatusBean.setSource("choose");
					destination = "orderStatusChooseCase";
				}
			}
		}
		else{//casenumber
			if(orderStatusBean.getSearchFrom().trim().length() == 5){
				this.orderStatusBean.setSearchKey1("0" + orderStatusBean.getSearchFrom().trim());
			}
			else{
				this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom().trim());
			}
			everythingFine = true;
			destination = "orderStatusMain";
		}		
		
		//this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		if(everythingFine){			
			this.orderStatusService.loadOrderStatusMain(this.orderStatusBean, getLoginBean());
		}
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return destination;
	}
	
	@RequestMapping(value = "/OrderStatusVehReceipt", method = RequestMethod.POST)
	public String orderStatusVehReceiptExecute(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean) {
		setHeaders(response);
		String searchFrom = "";
		String searchTo = "";
		String destination = "orderStatusVehReceipt";
		//validate dates
		this.orderStatusBean.setOrderAction(orderStatusBean.getOrderAction());
		this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		this.orderStatusBean.setSearchType(orderStatusBean.getSearchType());
		this.orderStatusBean.setSearchFrom(orderStatusBean.getSearchFrom());
		this.orderStatusBean.setSearchTo(orderStatusBean.getSearchTo());
		this.orderStatusBean.setDateFrom(orderStatusBean.getDateFrom());
		this.orderStatusBean.setDateTo(orderStatusBean.getDateTo());
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setSource("vehReceipt");
		
		//validate case numbers
		if(orderStatusBean.getSearchType().equalsIgnoreCase("Case")){
			if(orderStatusBean.getSearchFrom().trim().length() == 5){
				this.orderStatusBean.setSearchFrom("0" + orderStatusBean.getSearchFrom().trim());
			}
			if(orderStatusBean.getSearchTo().trim().length() == 5){
				this.orderStatusBean.setSearchTo("0" + orderStatusBean.getSearchTo().trim());
			}
		}
		this.orderStatusBean.setOrderStatusVehReceiptList(this.orderStatusService.getOrderStatusVehReceiptList(this.orderStatusBean, getLoginBean().getCurrentUser()));
		if(this.orderStatusBean.getOrderStatusVehReceiptList().size() > 500){
			this.orderStatusBean.setReturnMessage("Result list has more than 500 rows.  Please restrict your query and try again.");
			destination = "orderStatusVehReceiptForm";
		}

		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		
		
		return destination;
	}
	
	@RequestMapping(value = "/OrderStatusUpdate", method = RequestMethod.POST)
	public String orderStatusUpdate(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean) {
		setHeaders(response);
		String destination = "";
		this.orderStatusBean.setOrderAction(orderStatusBean.getOrderAction());
		if(this.orderStatusBean.getSource().equalsIgnoreCase("vehReceipt")){
			destination = "orderStatusVehReceipt";
		}
		else if(this.orderStatusBean.getSource().equalsIgnoreCase("main")){
			destination = "orderStatusMain";
		}
		else{
			destination = "orderStatusChooseCase";
		}
		
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setReturnMessage(this.orderStatusService.setDateAgReceived(orderStatusBean, this.orderStatusBean, getLoginBean().getCurrentUser()));
		if(this.orderStatusBean.getSource().equalsIgnoreCase("vehReceipt")){
			this.orderStatusBean.setOrderStatusVehReceiptList(this.orderStatusService.getOrderStatusVehReceiptList(this.orderStatusBean, getLoginBean().getCurrentUser()));
		}
		else if(this.orderStatusBean.getSource().equalsIgnoreCase("main")){
			this.orderStatusService.loadOrderStatusMain(this.orderStatusBean, getLoginBean());
		}
		else{
			this.orderStatusBean.setOrderStatusVehReceiptList(this.orderStatusService.getOrderStatusPartialVINList(this.orderStatusBean, getLoginBean().getCurrentUser()));
		}
		
		if(this.orderStatusBean.getOrderStatusVehReceiptList().size() > 500){
			this.orderStatusBean.setReturnMessage("Result list has more than 500 rows.  Please restrict your query and try again.");
			if(this.orderStatusBean.getSource().equalsIgnoreCase("vehReceipt")){
				destination = "orderStatusVehReceiptFrom";
			}
			else if(this.orderStatusBean.getSource().equalsIgnoreCase("main")){
				destination = "orderStatusMainForm";
			}
			else{
				destination = "orderStatusChooseCase";
			}
		}

		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		
		
		return destination;
	}
	
	@RequestMapping(value = "/OrderStatusMainForm", method = RequestMethod.GET)
	public String orderStatusMain(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusMainForm";
	}
	
	@RequestMapping(value = "/OrderStatusDeliveryProc", method = RequestMethod.GET)
	public String orderStatusDeliveryProc(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusDeliveryProc";
	}
	
	@RequestMapping(value = "/OrderStatusCOV", method = RequestMethod.POST)
	public String orderStatusCOV(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean) {
		final int VINLENGTH = 17;
		setHeaders(response);
		String destination = "orderStatusCOV";
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setSource("main");
		this.orderStatusBean.setOrderAction("COV");
		boolean everythingFine = false;
		this.orderStatusBean.setSearchType(orderStatusBean.getSearchType());
		if(orderStatusBean.getSearchType().equalsIgnoreCase("Requisition")){
			String str = orderStatusBean.getSearchFrom();
			StringTokenizer st = new StringTokenizer(str);	
			int counter = 1;
			while (st.hasMoreElements()) {
				if(counter == 1){
					this.orderStatusBean.setSearchKey1((String)st.nextElement());
				}
				else if(counter == 2){
					this.orderStatusBean.setSearchKey2((String)st.nextElement());
				} 
				else if(counter == 3){
					this.orderStatusBean.setSearchKey3((String)st.nextElement());
				}
			}
		}
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("VIN")){
			this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom());
			this.orderStatusBean.setSource("choose");
			if(orderStatusBean.getSearchFrom().trim().length() < VINLENGTH){
				//get partial match list
				this.orderStatusBean.setOrderStatusVehReceiptList(this.orderStatusService.getOrderStatusPartialVINList(this.orderStatusBean, getLoginBean().getCurrentUser()));
				if(this.orderStatusBean.getReturnMessage().trim().length() > 0){
					//there was an exception when retrieving req list
					destination = "orderStatusMainForm";
				}
				if(this.orderStatusBean.getOrderStatusVehReceiptList() == null || this.orderStatusBean.getOrderStatusVehReceiptList().size() < 1){
					this.orderStatusBean.setReturnMessage("There were no requisitions matching that VIN pattern");
					destination = "orderStatusMainForm";
				}
				else{
					destination = "orderStatusChooseCase";
				}				
			}
			else{
				everythingFine = true;
				destination = "orderStatusCOV";
			}
		}	
		else if(orderStatusBean.getSearchType().equalsIgnoreCase("AgencyOrderNumber")){
			this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom());				
			this.orderStatusBean.setReqList(this.orderStatusService.getOrderStatusReqAgOrdNoList(this.orderStatusBean));
			if(this.orderStatusBean.getReturnMessage().trim().length() > 0){
				//there was an exception when retrieving req list
				destination = "orderStatusMainForm";
			}
			else{
				if(this.orderStatusBean.getReqList() == null || this.orderStatusBean.getReqList().size() < 1 ){	
					this.orderStatusBean.setReturnMessage("There were no requisitions for that number");
					destination = "orderStatusMainForm";
				}
				else if(this.orderStatusBean.getReqList().size() == 1){
					everythingFine = true;
					destination = "orderStatusCOV";
				}
				else{
					this.orderStatusBean.setSource("choose");
					destination = "orderStatusChooseCase";
				}
			}
		}
		else{//casenumber
			if(orderStatusBean.getSearchFrom().trim().length() == 5){
				this.orderStatusBean.setSearchKey1("0" + orderStatusBean.getSearchFrom().trim());
			}
			else{
				this.orderStatusBean.setSearchKey1(orderStatusBean.getSearchFrom().trim());
			}
			everythingFine = true;
			destination = "orderStatusCOV";
		}		
		
		//this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		if(everythingFine){			
			this.orderStatusService.loadCOV(this.orderStatusBean, getLoginBean().getCurrentUser());
		}
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return destination;
	}
	
	@RequestMapping(value = "/OrderStatusCOV/{searchTypeParam}/{searchKey1}/{searchKey2}/{searchKey3}", method = RequestMethod.GET)
	public String orderStatusCOV(@PathVariable String searchTypeParam, @PathVariable String searchKey1,@PathVariable String searchKey2, @PathVariable String searchKey3, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		this.orderStatusBean.setOrderAction("COV");
		this.orderStatusBean.setSearchType(searchTypeParam);
		this.orderStatusBean.setSearchKey1(searchKey1);
		if(searchKey2.equals("ZZ")){
			this.orderStatusBean.setSearchKey2("");
		}
		else{
			this.orderStatusBean.setSearchKey2(searchKey2);
		}
		if(searchKey3.equals("ZZ")){
			this.orderStatusBean.setSearchKey3("");
		}
		else{
			this.orderStatusBean.setSearchKey3(searchKey3);
		}

		//get records
		this.orderStatusService.loadCOV(this.orderStatusBean, getLoginBean().getCurrentUser());
				
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);		

		return "orderStatusCOV";
	}
	
	@RequestMapping(value = "/OrderStatusCOVEmail", method = RequestMethod.POST)
	public String orderStatusCOVEmail(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean) {
		setHeaders(response);
		
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setOrderAction("COV");
		this.orderStatusBean.setVinSelected(orderStatusBean.getVinSelected());
		this.orderStatusBean.setReason(orderStatusBean.getReason());
		this.orderStatusBean.setSearchFrom(orderStatusBean.getSearchFrom());
		this.orderStatusService.setCCEmails(this.orderStatusBean);
		this.orderStatusService.sendCOVEmail(this.orderStatusBean);
		if(this.orderStatusBean.getReturnMessage().trim().length() < 1){
			this.orderStatusBean.setReturnMessage("Email sent successfully");
		}
		//get records
		this.orderStatusService.loadCOV(this.orderStatusBean, getLoginBean().getCurrentUser());
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);	
		return "orderStatusCOV";
	}
	
	@RequestMapping(value = "/OrderStatusExcel/{source}", method = RequestMethod.GET)
	public String reportExcelExport(@PathVariable String source,
			HttpServletResponse response,
			Model model,
			@ModelAttribute("orderStatusBean") OrderStatusBean orderStatusBean,
			BindingResult result) {
		setHeaders(response);
		response.setContentType("application/vnd.ms-excel");
	    response.addHeader("Content-Disposition", "attachment;filename=myexcel.xls");
	    
	    String destination = "";
	    
	    if(source.equalsIgnoreCase("Main")){
	    	destination = "orderStatusMainExcel";
	    }
	    else if(source.equalsIgnoreCase("Contract")){
	    	destination = "orderStatusContractExcel";
	    }
	    else if(source.equalsIgnoreCase("Address")){
	    	destination = "orderStatusAddressExcel";
	    }
	    else{
	    	destination = "orderStatusDeliveryProcExcel";
	    }
	    
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);
		return destination;
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

	public OrderStatusBean getOrderStatusBean() {
		return orderStatusBean;
	}

	public void setOrderStatusBean(OrderStatusBean orderStatusBean) {
		this.orderStatusBean = orderStatusBean;
	}

	public static Log getLogger() {
		return logger;
	}

}
