package gov.gsa.fas.AutoChoice.beans;


import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.gsa.fas.AutoChoice.DTO.ControlDTO;
import gov.gsa.fas.AutoChoice.DAO.UserAccessDAO;

@Component
@Scope("session")
public class UserAccessBean {
	private List<ControlDTO> controlList = null;
	private UserAccessDAO userAccessDAO = null;
	
	public void populateControl(){
		setControlList(userAccessDAO.getControl());
	}

	public List<ControlDTO> getControlList() {
		return controlList;
	}

	public void setControlList(List<ControlDTO> controlList) {
		this.controlList = controlList;
	}

	public UserAccessDAO getUserAccessDAO() {
		return userAccessDAO;
	}

	public void setUserAccessDAO(UserAccessDAO userAccessDAO) {
		this.userAccessDAO = userAccessDAO;
	}



}
