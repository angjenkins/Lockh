package gov.gsa.fas.AutoChoice.service;

import java.util.ArrayList;
import java.util.List;

import gov.gsa.fas.AutoChoice.DAO.AdminDAO;
import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DAO.PendingOrderDAO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.AdminBean;
import gov.gsa.fas.AutoChoice.beans.PendingOrderBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("request")
public class PendingOrderService {

	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private PendingOrderDAO pendingOrderDAO;
	
	@Autowired
	private AdminBean adminBean;
	
	@Autowired
	private PendingOrderBean PendingOrderBean;
	
	
	public void getNewRequisitions(CommonBean commonBean) {
		List<UserGroupDTO> groupCodeList=new ArrayList<UserGroupDTO>();
		List<RequisitionsCartDTO> requisitionsCartList=new ArrayList<RequisitionsCartDTO>();
		List<RequisitionsCartDTO> masRequisitionsCartList=new ArrayList<RequisitionsCartDTO>();
		String groupCode;
		
		try{
			groupCodeList= adminDAO.getGroupCodeList(commonBean.getUserAccount());
		}
		catch(Exception ex){
			adminBean.setReturnMessage("Retrieving admin group list failed: " + ex.getMessage());
		}	
		
		groupCode=groupCodeList.get(0).getGroup_Code();
		
		requisitionsCartList = pendingOrderDAO.getRequisitionsCart(commonBean.getUserAccount(), "00001");
		masRequisitionsCartList = pendingOrderDAO.getMasRequisitionsCart(commonBean.getUserAccount(), "00001");
		
		PendingOrderBean.setGroupCode(groupCode);
		PendingOrderBean.setGroupCodeList(groupCodeList);
		PendingOrderBean.setRequisitionsCartList(requisitionsCartList);
		PendingOrderBean.setMasRequisitionsCartList(masRequisitionsCartList);
	
	}
}
