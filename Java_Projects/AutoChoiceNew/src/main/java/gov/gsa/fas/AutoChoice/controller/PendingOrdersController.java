package gov.gsa.fas.AutoChoice.controller;

import javax.servlet.http.HttpServletResponse;

import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.beans.PendingOrderBean;
import gov.gsa.fas.AutoChoice.service.OrderService;
import gov.gsa.fas.AutoChoice.service.PendingOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope("request")
public class PendingOrdersController {
	
	@Autowired
	private PendingOrderService pendingOrderService = null;

	@Autowired
	private CommonBean commonBean = null;
	
	@Autowired
	private PendingOrderBean pendingOrderBean = null;
	
	
	@RequestMapping(value = "/PendingOrders", method = RequestMethod.GET)
	public String getStdItem(HttpServletResponse response, ModelMap model) {
		setHeaders(response);
		
		pendingOrderService.getNewRequisitions(commonBean);
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("pendingOrderBean", getPendingOrderBean ());
		
		return "pendingorders";
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
	
	public PendingOrderBean getPendingOrderBean() {
		return pendingOrderBean;
	}

	public void setPendingOrderBean(PendingOrderBean pendingOrderBean) {
		this.pendingOrderBean = pendingOrderBean;
	}
}
