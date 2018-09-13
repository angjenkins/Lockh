package gov.gsa.fas.AutoChoice.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.FSRBean;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.service.CommonService;
import gov.gsa.fas.AutoChoice.service.FSRService;
import gov.gsa.fas.AutoChoice.service.LoginService;

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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("request")
public class FSRController {

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
	private FSRService fsrService = new FSRService();	
	
	@Autowired
	private FSRBean fsrBean = null;
	
	@RequestMapping(value = "/FSRList/{region}", method = RequestMethod.GET)
	public String fsrProgram(@PathVariable String region, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		
		String dateFrom = "";
		String dateTo = "";
		this.fsrBean.setReturnMessage("");
		this.fsrBean.setDateType("order");
		this.fsrBean.setFsrCombined(this.fsrService.getFSRList(dateFrom, dateTo, fsrBean));
		this.fsrBean.setFsrCombinedDisplay(this.fsrService.loadCombinedDisplay(region, this.fsrBean.getFsrCombined()));
		this.fsrBean.setRegionList(this.fsrService.getRegionList(this.fsrBean));
		this.fsrBean.setRegion(this.fsrService.setRegion(this.fsrBean.getRegionList(), region));
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);		

		return "fsrProgram";
	}
	
	@RequestMapping(value = "/FSRformat", method = RequestMethod.GET)
	public String fsrFormat(Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);		

		return "fsrFormat";
	}
	
	
	@RequestMapping(value = "/FSRListExecute", method = RequestMethod.POST)
	public String fsrProgramExecute(Model model, HttpServletRequest request, HttpServletResponse response, @ModelAttribute("fsrBean") FSRBean fsrBeanParam) {
		setHeaders(response);
		
		String region = this.fsrBean.getRegion().getRegion_Code();
		String dateFrom = fsrBeanParam.getDateFrom();
		String dateTo = fsrBeanParam.getDateTo();
		this.fsrBean.setReturnMessage("");
		this.fsrBean.setDateType(fsrBeanParam.getDateType());
		this.fsrBean.getFsrCombinedDisplay().clear();
		this.fsrBean.setFsrCombined(this.fsrService.getFSRList(dateFrom, dateTo, this.fsrBean));
		this.fsrBean.setFsrCombinedDisplay(this.fsrService.loadCombinedDisplay(region, this.fsrBean.getFsrCombined()));
		//this.fsrBean.setRegionList(fsrService.getRegionList());
		this.fsrBean.setRegion(this.fsrService.setRegion(this.fsrBean.getRegionList(), region));
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);		

		return "fsrProgram";
	}
	
	@RequestMapping(value = "/FSRListExecute/{region}", method = RequestMethod.GET)
	public String fsrProgramRedisplay(@PathVariable String region, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);			
		this.fsrBean.setReturnMessage("");
		this.fsrBean.getFsrCombinedDisplay().clear();
		this.fsrBean.setFsrCombinedDisplay(this.fsrService.loadCombinedDisplay(region, this.fsrBean.getFsrCombined()));
		this.fsrBean.setRegion(this.fsrService.setRegion(this.fsrBean.getRegionList(), region));
		
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);	
		return "fsrProgram";
	}
	
	@RequestMapping(value = "/FSRRemarks/{caseNumber}/{key}/{action}", method = RequestMethod.GET)
	public String fsrRemarks(@PathVariable String caseNumber,@PathVariable String key, @PathVariable String action, Model model, HttpServletRequest request, HttpServletResponse response) {
		setHeaders(response);
		
		this.fsrBean.setReturnMessage("");
		this.fsrBean.setCaseNo(caseNumber);
		this.fsrBean.setRemarksAction(action);
		this.fsrBean.setRemarksKey(key);
		
		if(action.equalsIgnoreCase("delete")){
			this.fsrService.removeReqFSR(this.fsrBean);
		}
		
		this.fsrBean.setReqFSRList(this.fsrService.getRequisitionsFSR(this.fsrBean, caseNumber));
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);		

		return "fsrRemarks";
	}

	@RequestMapping(value = "/FSRRemarks", method = RequestMethod.POST)
	public String fsrRemarksExecute( Model model, HttpServletRequest request, HttpServletResponse response, @RequestParam String action, @RequestParam String remarksText) {
		setHeaders(response);
		
		this.fsrBean.setReturnMessage("");
		this.fsrBean.setRemarksAction(action);
		if(action.equalsIgnoreCase("add")){
			//set new key
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMddmmss");
			String date = sdf.format(new Date()); 
			this.fsrBean.setRemarksKey(date.toString());
		}
		this.fsrService.addUpdateReqFSR(this.fsrBean, remarksText, getCommonBean().getUserAccount().getUserID() );
		this.fsrBean.setRemarksAction("");
		this.fsrBean.setReqFSRList(this.fsrService.getRequisitionsFSR(this.fsrBean, this.fsrBean.getCaseNo()));
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("fsrBean", this.fsrBean);		

		return "fsrRemarks";
	}
	
	
	@RequestMapping(value = "/FSRReportBuilder", method = RequestMethod.GET)
	public String setReportBuilder(
			HttpServletResponse response,
			Model model,
			@ModelAttribute("fsrBean") @Valid FSRBean fsrBeanParam,
			BindingResult result) {
		setHeaders(response);

		/*
		if (!this.fsrBean.getAction().equals("Save")) {
			//initialized error message
			this.fsrBean.setErrMessage("");
		}
		*/
		this.fsrBean.setReturnMessage("");
		this.fsrBean.setBuilderAction("");
		if(this.fsrBean.getRegionList().size() < 1){
			this.fsrBean.setRegionList(this.fsrService.getRegionList(this.fsrBean));
			this.fsrBean.setRegion(this.fsrService.setRegion(this.fsrBean.getRegionList(), "1"));
		}				
		if(this.fsrBean.getDateFrom().trim().length() < 1){
			Calendar calFrom = Calendar.getInstance();
			Calendar calTo = Calendar.getInstance();
			calFrom.add(Calendar.DAY_OF_MONTH, -5);	
			StringBuffer buffFrom = new StringBuffer();
			StringBuffer buffTo = new StringBuffer();
			buffFrom.append(String.valueOf(calFrom.get(Calendar.MONTH) + 1));
			buffFrom.append("/");
			buffFrom.append(String.valueOf(calFrom.get(Calendar.DAY_OF_MONTH)));
			buffFrom.append("/");
			buffFrom.append(String.valueOf(calFrom.get(Calendar.YEAR)));		
			fsrBean.setDateFrom(buffFrom.toString());
			buffTo.append(String.valueOf(calTo.get(Calendar.MONTH) + 1));
			buffTo.append("/");
			buffTo.append(String.valueOf(calTo.get(Calendar.DAY_OF_MONTH)));
			buffTo.append("/");
			buffTo.append(String.valueOf(calTo.get(Calendar.YEAR)));		
			fsrBean.setDateTo(buffTo.toString());
		}
		this.fsrBean.setReportBuilderList(this.fsrService.setReportBuilder());
		this.fsrBean.setFsrSavedReportList(this.fsrService.getFSRSavedReport(this.fsrBean, getLoginBean().getCurrentUser()));
		model.addAttribute("commonBean", getCommonBean()); // contains the menu
		model.addAttribute("fsrBean", this.fsrBean);
		return "fsrReportBuilder";
	}
	
	@RequestMapping(value = "/FSRReportBuilder", method = RequestMethod.POST)
	public String getReportBuilder(
			HttpServletResponse response,
			HttpServletRequest request,
			Model model,
			@ModelAttribute("fsrBean") @Valid FSRBean fsrBeanParam,
			BindingResult result,
			@RequestParam String action) throws Exception, SQLException, Exception{
	
		setHeaders(response);
		// validate request  
	 	//String error = getCommonBean().validateRequestObject(request);
		this.fsrBean.setReturnMessage("");
		String pageAction="fsrReportBuilder"; //default
		this.fsrBean.setReportBuilderList(fsrBeanParam.getReportBuilderList());
		if (action.equals("Process")) {

				this.fsrBean.setDateFrom(fsrBeanParam.getDateFrom());
				this.fsrBean.setDateTo(fsrBeanParam.getDateTo());
				this.fsrBean.setDateType(fsrBeanParam.getDateType());
				this.fsrBean.setCaseFrom(fsrBeanParam.getCaseFrom());
				this.fsrBean.setCaseTo(fsrBeanParam.getCaseTo());
				this.fsrBean.setFileType(fsrBeanParam.getFileType());
				this.fsrBean.setBuilderRegionList(fsrBeanParam.getBuilderRegionList());
				String sql="";
				Map<String,String> buildQryMap=new HashMap<String, String>();
				buildQryMap = this.fsrService.getReportBuilderSql(this.fsrBean);
				this.fsrBean.setReportBuilderResult(this.fsrService.getReportBuilder(this.fsrBean, buildQryMap));

				if (this.fsrBean.getFileType().equals("application/msexcel")){
					response.setContentType("application/vnd.ms-excel");
				    response.addHeader("Content-Disposition", "attachment;filename=myexcel.xls");
				    pageAction="fsrReportBuilderResultExcel";
				}
		
				else if (this.fsrBean.getFileType().equals("application/msword")){
					response.setContentType("application/msword");
				    response.addHeader("Content-Disposition", "attachment; filename=myword.doc");
				    pageAction="fsrReportBuilderResultWord";
					
				}
				
				else if (this.fsrBean.getFileType().equals("text/html")){
					 response.setContentType("text/html");
				   // response.addHeader("Content-Disposition", "attachment; filename=myword.doc");
				    pageAction="fsrReportBuilderResult";
					
				}
		
				else if (this.fsrBean.getFileType().equals("text/plain")){
					String rptString = "";
					response.setContentType( "plain/text");
				    response.setHeader("Content-Disposition","attachment;filename=myFile.txt");
				    ServletOutputStream out = response.getOutputStream();
				    
		
					for(Map.Entry<String, Object> entry : this.fsrBean.getReportBuilderResult().get(0).entrySet())
					{
						rptString += entry.getKey() + "\t";
					}
					out.println(rptString);
					rptString="";
					
					for(Map<String, Object> row : this.fsrBean.getReportBuilderResult())
					{
						for(Map.Entry<String, Object> colValue : row.entrySet())
						{
							rptString += colValue.getValue() + "\t";
						}
						out.println(rptString);
						rptString="";
					}
					
					
				    out.flush();
				    out.close();
				}		
	    }
		else if (action.equals("Insert")){
			this.fsrService.saveBuildReportQuery(this.fsrBean,request.getParameter("x_querytitle"),getLoginBean().getCurrentUser());
			this.fsrBean.setFsrSavedReportList(this.fsrService.getFSRSavedReport(this.fsrBean, getLoginBean().getCurrentUser()));
			this.fsrBean.setBuilderAction("Save");
			
			//pageAction="redirect:FSRReportBuilder";
		}
			
		model.addAttribute("commonBean", getCommonBean()); // contains the menu
		model.addAttribute("fsrBean", this.fsrBean);
		return pageAction;
	}
	
	@RequestMapping(value = "/FSRReportBuilderAdmin", method = RequestMethod.GET)
	public String reportBuilderAdmin(
			HttpServletResponse response,
			Model model,
			@ModelAttribute("fsrBean") @Valid FSRBean fsrBean,
			BindingResult result) {
		setHeaders(response);

		if (!this.fsrBean.getBuilderAction().equals("Save")) {
			//initialized error message
			this.fsrBean.setReturnMessage("");
		}
		this.fsrBean.setBuilderAction("");		
		
		this.fsrBean.setFsrSavedReportList(this.fsrService.getFSRSavedReport(this.fsrBean, getLoginBean().getCurrentUser()));
		model.addAttribute("commonBean", getCommonBean()); // contains the menu
		model.addAttribute("fsrBean", this.fsrBean);
		return "fsrReportBuilderAdmin";
	}

	@RequestMapping(value = "/FSRReportBuilderAdmin", method = RequestMethod.POST)
	public String onreportBuilderAdmin(
			HttpServletResponse response,
			HttpServletRequest request,
			Model model,
			@ModelAttribute("fsrBean") @Valid FSRBean fsrBean,
			BindingResult result,
			@RequestParam String action) {

		setHeaders(response);
		
		// validate request  
	 	/*String error = getCommonBean().validateRequestObject(request);
		if (!error.equals("")) { 
			  return error;
		}
		*/
		
		String pageAction="fsrReportBuilderAdmin";
		if (action.equals("Save")){
			this.fsrBean.setFsrSavedReportList(fsrBean.getFsrSavedReportList());	
		    this.fsrService.saveBuildReportAdmin(this.fsrBean, fsrBean.getFsrSavedReportList(),getLoginBean().getCurrentUser().getUserID());

			// for messaging
			this.fsrBean.setReturnMessage("Records successfully updated!");
			this.fsrBean.setBuilderAction("Save");
		}		
		else if (action.equals("Ignore Changes")){
			
		}
		else if (action.equals("Back to Report Builder")){
			pageAction = "redirect:FSRReportBuilder";
		}		
		this.fsrBean.setFsrSavedReportList(this.fsrService.getFSRSavedReport(this.fsrBean, getLoginBean().getCurrentUser()));
		model.addAttribute("commonBean", getCommonBean()); // contains the menu
		model.addAttribute("fsrBean", this.fsrBean);
		return pageAction;
	}

	@RequestMapping(value = "/FSRReportExcel", method = RequestMethod.GET)
	public String reportExcelExport(
			HttpServletResponse response,
			Model model,
			@ModelAttribute("fsrBean") @Valid FSRBean fsrBean,
			BindingResult result) {
		setHeaders(response);

		response.setContentType("application/vnd.ms-excel");
	    response.addHeader("Content-Disposition", "attachment;filename=myexcel.xls");
	    
		model.addAttribute("commonBean", getCommonBean()); // contains the menu
		model.addAttribute("fsrBean", this.fsrBean);
		return "fsrReportExcel";
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

	public static Log getLogger() {
		return logger;
	}
}
