package gov.gsa.fas.AutoChoice.controller;

import gov.gsa.fas.AutoChoice.beans.OrderStatusBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvdoController {
	private static final Log logger = LogFactory.getLog(MvdoController.class);
	
	@Autowired
	private OrderStatusBean orderStatusBean = null;
	
	@RequestMapping(value = "/mvdoreport", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request, HttpServletResponse response) {
		model.addAttribute("orderStatusBean", this.orderStatusBean);
		return "mvdoreport";
	}
}
