package gov.gsa.fas.AutoChoice.beans;

import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.OrderStatusDTO;
import gov.gsa.fas.AutoChoice.DTO.ReportEmailDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsDTO;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class OrderStatusBean {
	
	private String searchType = "";
	private String searchFrom = "";
	private String searchTo = "";
	private String dateFrom = "";
	private String dateTo = "";
	private String returnMessage = "";
	private String returnMessage2 = "";
	private ArrayList<OrderStatusCombinedDTO> orderStatusVehReceiptList = null;
	private ArrayList<OrderStatusCombinedDTO> orderStatusList = null;
	private ArrayList<OrderStatusCombinedDTO> contrCaseList = null;
	private ArrayList<OrderStatusCombinedDTO> contractLineOptionList = null;
	private ArrayList<OrderStatusCombinedDTO> covList = null;
	private ArrayList<ReportEmailDTO> reportEmailList = null;
	private ArrayList<String> toEmailList;
	private ArrayList<String> ccEmailList;
	private String fromEmail = "";
	private ArrayList<String> vinList = null;
	private String privilege = "";
	private String searchKey1 = "";
	private String searchKey2 = "";
	private String searchKey3 = "";
	private Timestamp orderDate;
	private String orderAction = "";
	private ArrayList<RequisitionsDTO> reqList;
	private String caseNumber = "";
	private String source = "";
	private ArrayList<AgBuTableDTO> agBuTableList;
	private String vinSelected = "";
	private String reason = "";
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchFrom() {
		return searchFrom;
	}
	public void setSearchFrom(String searchFrom) {
		this.searchFrom = searchFrom;
	}
	public String getSearchTo() {
		return searchTo;
	}
	public void setSearchTo(String searchTo) {
		this.searchTo = searchTo;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusVehReceiptList() {
		return orderStatusVehReceiptList;
	}
	public void setOrderStatusVehReceiptList(
			ArrayList<OrderStatusCombinedDTO> orderStatusVehReceiptList) {
		this.orderStatusVehReceiptList = orderStatusVehReceiptList;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public String getSearchKey1() {
		return searchKey1;
	}
	public void setSearchKey1(String searchKey1) {
		this.searchKey1 = searchKey1;
	}
	public String getSearchKey2() {
		return searchKey2;
	}
	public void setSearchKey2(String searchKey2) {
		this.searchKey2 = searchKey2;
	}
	public String getSearchKey3() {
		return searchKey3;
	}
	public void setSearchKey3(String searchKey3) {
		this.searchKey3 = searchKey3;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public ArrayList<OrderStatusCombinedDTO> getOrderStatusList() {
		return orderStatusList;
	}
	public void setOrderStatusList(ArrayList<OrderStatusCombinedDTO> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}
	public String getOrderAction() {
		return orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}
	public ArrayList<RequisitionsDTO> getReqList() {
		return reqList;
	}
	public void setReqList(ArrayList<RequisitionsDTO> reqList) {
		this.reqList = reqList;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getReturnMessage2() {
		return returnMessage2;
	}
	public void setReturnMessage2(String returnMessage2) {
		this.returnMessage2 = returnMessage2;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public ArrayList<AgBuTableDTO> getAgBuTableList() {
		return agBuTableList;
	}
	public void setAgBuTableList(ArrayList<AgBuTableDTO> agBuTableList) {
		this.agBuTableList = agBuTableList;
	}
	public ArrayList<OrderStatusCombinedDTO> getContrCaseList() {
		return contrCaseList;
	}
	public void setContrCaseList(ArrayList<OrderStatusCombinedDTO> contrCaseList) {
		this.contrCaseList = contrCaseList;
	}
	public ArrayList<OrderStatusCombinedDTO> getContractLineOptionList() {
		return contractLineOptionList;
	}
	public void setContractLineOptionList(
			ArrayList<OrderStatusCombinedDTO> contractLineOptionList) {
		this.contractLineOptionList = contractLineOptionList;
	}
	public ArrayList<OrderStatusCombinedDTO> getCovList() {
		return covList;
	}
	public void setCovList(ArrayList<OrderStatusCombinedDTO> covList) {
		this.covList = covList;
	}
	public ArrayList<ReportEmailDTO> getReportEmailList() {
		return reportEmailList;
	}
	public void setReportEmailList(ArrayList<ReportEmailDTO> reportEmailList) {
		this.reportEmailList = reportEmailList;
	}
	public ArrayList<String> getToEmailList() {
		return toEmailList;
	}
	public void setToEmailList(ArrayList<String> toEmailList) {
		this.toEmailList = toEmailList;
	}
	public ArrayList<String> getCcEmailList() {
		return ccEmailList;
	}
	public void setCcEmailList(ArrayList<String> ccEmailList) {
		this.ccEmailList = ccEmailList;
	}
	public ArrayList<String> getVinList() {
		return vinList;
	}
	public void setVinList(ArrayList<String> vinList) {
		this.vinList = vinList;
	}
	public String getVinSelected() {
		return vinSelected;
	}
	public void setVinSelected(String vinSelected) {
		this.vinSelected = vinSelected;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	

}
