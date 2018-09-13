package gov.gsa.fas.AutoChoice.beans;

import gov.gsa.fas.AutoChoice.DTO.ModelColorDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionFileCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartColorDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsJustDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class PendingOrderBean {
	private RequisitionsCartDTO reqCart;
    private List<OptionFileCartDTO> optFileCart;
    private List<RequisitionsCartColorDTO> reqCartColor;
    private RequisitionsJustDTO reqJust;
    private List<ModelColorDTO> modelColor;
    private List<UserGroupDTO> userGroup;
    private String caseNumber = "";
    private boolean cnsFound;
    private boolean exDelFound;
    private boolean ddrFound;
    private String returnMessage = "";
    
    private String groupCode;
    private List<UserGroupDTO> groupCodeList;
    private List<RequisitionsCartDTO> requisitionsCartList;
    private List<RequisitionsCartDTO> masRequisitionsCartList;
    
	public RequisitionsCartDTO getReqCart() {
		return reqCart;
	}
	public void setReqCart(RequisitionsCartDTO reqCart) {
		this.reqCart = reqCart;
	}
	public List<OptionFileCartDTO> getOptFileCart() {
		return optFileCart;
	}
	public void setOptFileCart(List<OptionFileCartDTO> optFileCart) {
		this.optFileCart = optFileCart;
	}
	public List<RequisitionsCartColorDTO> getReqCartColor() {
		return reqCartColor;
	}
	public void setReqCartColor(List<RequisitionsCartColorDTO> reqCartColor) {
		this.reqCartColor = reqCartColor;
	}
	public RequisitionsJustDTO getReqJust() {
		return reqJust;
	}
	public void setReqJust(RequisitionsJustDTO reqJust) {
		this.reqJust = reqJust;
	}
	public List<ModelColorDTO> getModelColor() {
		return modelColor;
	}
	public void setModelColor(List<ModelColorDTO> modelColor) {
		this.modelColor = modelColor;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public boolean isCnsFound() {
		return cnsFound;
	}
	public void setCnsFound(boolean cnsFound) {
		this.cnsFound = cnsFound;
	}
	public List<UserGroupDTO> getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(List<UserGroupDTO> userGroup) {
		this.userGroup = userGroup;
	}
	public boolean isExDelFound() {
		return exDelFound;
	}
	public void setExDelFound(boolean exDelFound) {
		this.exDelFound = exDelFound;
	}
	public boolean isDdrFound() {
		return ddrFound;
	}
	public void setDdrFound(boolean ddrFound) {
		this.ddrFound = ddrFound;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public List<UserGroupDTO> getGroupCodeList() {
		return groupCodeList;
	}
	public void setGroupCodeList(List<UserGroupDTO> groupCodeList) {
		this.groupCodeList = groupCodeList;
	}
	public List<RequisitionsCartDTO> getRequisitionsCartList() {
		return requisitionsCartList;
	}
	public void setRequisitionsCartList(
			List<RequisitionsCartDTO> requisitionsCartList) {
		this.requisitionsCartList = requisitionsCartList;
	}
	public List<RequisitionsCartDTO> getMasRequisitionsCartList() {
		return masRequisitionsCartList;
	}
	public void setMasRequisitionsCartList(
			List<RequisitionsCartDTO> masRequisitionsCartList) {
		this.masRequisitionsCartList = masRequisitionsCartList;
	}

}
