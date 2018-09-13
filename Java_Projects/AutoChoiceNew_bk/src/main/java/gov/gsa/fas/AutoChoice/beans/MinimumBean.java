package gov.gsa.fas.AutoChoice.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

@Component
@Scope("session")
public class MinimumBean {
	
	Logger logger = Logger.getLogger(CommonBean.class.toString());
	
	private Map<String, Map<String, String>>  stdOptions;
	private Map<String, Map<String, String>>  stdOptionsValues;
	private List<String> model;
	private List <StdItemVerbiageDTO> stdItemVerbiageList = null;

	
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	public Map<String, Map<String, String>> getStdOptions() {
		return stdOptions;
	}
	public void setStdOptions(Map<String, Map<String, String>> stdOptions) {
		this.stdOptions = stdOptions;
	}
	public Map<String, Map<String, String>> getStdOptionsValues() {
		return stdOptionsValues;
	}
	public void setStdOptionsValues(
			Map<String, Map<String, String>> stdOptionsValues) {
		this.stdOptionsValues = stdOptionsValues;
	}
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public List<StdItemVerbiageDTO> getStdItemVerbiageList() {
		return stdItemVerbiageList;
	}
	public void setStdItemVerbiageList(List<StdItemVerbiageDTO> stdItemVerbiageList) {
		this.stdItemVerbiageList = stdItemVerbiageList;
	}
			
}
