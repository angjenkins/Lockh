package gov.gsa.fas.AutoChoice.service;

import gov.gsa.fas.AutoChoice.DAO.FSRDAO;
import gov.gsa.fas.AutoChoice.DAO.ReportBuilderDAO;
import gov.gsa.fas.AutoChoice.DTO.FSRCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.RegionTableDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsFSRDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAgBuReportDTO;
import gov.gsa.fas.AutoChoice.beans.FSRBean;
import gov.gsa.fas.AutoChoice.util.RegionTableDTOComparator;
import gov.gsa.fas.AutoChoice.util.ReportBuilder;
import gov.gsa.fas.AutoChoice.util.fsrReportBuilderFieldList;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

@Service
@Scope("request") 
public class FSRService {
	private FSRDAO fsrDAO = new FSRDAO();
	private ReportBuilderDAO reportBuilderDAO = new ReportBuilderDAO();
	
	public ArrayList<FSRCombinedDTO> getFSRList(String dateFrom, String dateTo, FSRBean fsrBean){
		//FSRBean fsrBeanReturn = new FSRBean();
		ArrayList<FSRCombinedDTO> returnArray = new ArrayList<FSRCombinedDTO>();
		try{			
			Calendar calFrom = Calendar.getInstance();
			Calendar calTo = Calendar.getInstance();
			
			if(dateFrom.trim().length() < 1 || dateTo.trim().length() < 1){
				calFrom.add(Calendar.DAY_OF_MONTH, -5);		
			}
			else{
				StringTokenizer st = new StringTokenizer(dateFrom,"/");
				int inx = 1;
				int fromYear = 0;
				int fromMonth = 0;
				int fromDay = 0;
				while (st.hasMoreElements()) {
					if (inx == 1){
						fromMonth = Integer.parseInt((String)st.nextElement());
						fromMonth--;
					}
					else if(inx == 2){
						fromDay = Integer.parseInt((String)st.nextElement());
					}
					else{
						fromYear = Integer.parseInt((String)st.nextElement());
					}
					inx++;
				}
				
				StringTokenizer st2 = new StringTokenizer(dateTo,"/");
				inx = 1;
				int toYear = 0;
				int toMonth = 0;
				int toDay = 0;
				while (st2.hasMoreElements()) {
					if (inx == 1){
						toMonth = Integer.parseInt((String)st2.nextElement());
						toMonth--;
					}
					else if(inx == 2){
						toDay = Integer.parseInt((String)st2.nextElement());
					}
					else{
						toYear = Integer.parseInt((String)st2.nextElement());
					}
					inx++;
				}
				
				calFrom.set(Calendar.YEAR, fromYear);
				calFrom.set(Calendar.MONTH, fromMonth);
				calFrom.set(Calendar.DAY_OF_MONTH, fromDay);
				calFrom.set(Calendar.HOUR_OF_DAY, 0);
				calFrom.set(Calendar.MINUTE, 0);
				calFrom.set(Calendar.SECOND, 0);		
				calTo.set(Calendar.YEAR, toYear);
				calTo.set(Calendar.MONTH, toMonth);
				calTo.set(Calendar.DAY_OF_MONTH, toDay);
				calTo.set(Calendar.HOUR_OF_DAY, 23);
				calTo.set(Calendar.MINUTE, 59);
				calTo.set(Calendar.SECOND, 59);
			}
			
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
			
			Timestamp dateFromTS = new Timestamp(calFrom.getTimeInMillis());
			Timestamp dateToTS = new Timestamp(calTo.getTimeInMillis());
		
			returnArray = fsrDAO.fetchFSRList(dateFromTS, dateToTS,fsrBean.getDateType() );
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR request failed: " + ex.getMessage());
		}
		
		return returnArray;
	}
	
	public ArrayList<RegionTableDTO> getRegionList(FSRBean fsrBean){
		//FSRBean fsrBeanReturn = new FSRBean();
		ArrayList<RegionTableDTO> returnArray = new ArrayList<RegionTableDTO>();
		try{
			returnArray = fsrDAO.fetchRegionList(); 	
			for(int inx = 0; inx < returnArray.size(); inx++){
				if(returnArray.get(inx).getRegion_Code().length() > 0){
					returnArray.get(inx).setRegionInt(Integer.parseInt(returnArray.get(inx).getRegion_Code()));
				}
			}
			Collections.sort(returnArray, new RegionTableDTOComparator());
			}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR request failed: " + ex.getMessage());
		}
		return returnArray;
	}
	
	public ArrayList<RequisitionsFSRDTO> getRequisitionsFSR(FSRBean fsrBean, String caseno){
		//FSRBean fsrBeanReturn = new FSRBean();
		ArrayList<RequisitionsFSRDTO> returnArray = new ArrayList<RequisitionsFSRDTO>();	
		try{
			returnArray = fsrDAO.fetchRequisitionsFSR(caseno);
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR request failed: " + ex.getMessage());
		}
		return returnArray;
	}
	
	public ArrayList<FSRCombinedDTO> loadCombinedDisplay(String region, ArrayList<FSRCombinedDTO> all){
		ArrayList<FSRCombinedDTO> newArrayList = new ArrayList<FSRCombinedDTO>();
		for(FSRCombinedDTO dto : all){
			if(dto.getStates_region().equals(region)){
				newArrayList.add(dto);
			}
		}
		
		return newArrayList;
	}
	
	public RegionTableDTO setRegion(ArrayList<RegionTableDTO> al, String region){
		RegionTableDTO returnDTO = new RegionTableDTO();;
		for(RegionTableDTO dto : al){
			if(dto.getRegion_Code().equals(region)){
				returnDTO = dto;
			}
		}
		return returnDTO; 
	}
	
	public void addUpdateReqFSR(FSRBean fsrBean, String remarks, String user){
		RequisitionsFSRDTO dto = new RequisitionsFSRDTO();
		try{
			Calendar nowCal = Calendar.getInstance();
			Timestamp currentDate = new Timestamp(nowCal.getTimeInMillis());
			dto.setCaseNo(fsrBean.getCaseNo());
			dto.setfSR_Key(Integer.parseInt(fsrBean.getRemarksKey()));
			dto.setRemarks(remarks);
			dto.setUserUpdated(user);
			dto.setUpdatedDate(currentDate);
			fsrDAO.setRequisitionsFSR(dto);
			fsrBean.setReturnMessage("FSR remarks updated successfully");
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR remarks save/add failed: " + ex.getMessage());
		}
		
	}
	
	public void removeReqFSR(FSRBean fsrBean){
		RequisitionsFSRDTO dto = new RequisitionsFSRDTO();
		try{
			dto.setCaseNo(fsrBean.getCaseNo());
			dto.setfSR_Key(Integer.parseInt(fsrBean.getRemarksKey()));
			fsrDAO.deleteRequisitionsFSR(dto);
			fsrBean.setReturnMessage("FSR remarks deleted successfully");
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR remarks delete failed: " + ex.getMessage());
		}
	}
	
	public ArrayList<ReportBuilder> setReportBuilder() {
		fsrReportBuilderFieldList rptDTO= new fsrReportBuilderFieldList();		
		return (rptDTO.getFSRReportFieldListDTO());
	}
	
	public Map getReportBuilderSql(FSRBean fsrBean) { 
		String fieldName ="";
		int ctr =0;
		String comma ="";
	
	    String dtFrom ="";
	    String dtTo="";
	    String caseFrom="";
	    String caseTo="";
	    StringBuffer regionBuff = new StringBuffer();
		
		try {
			dtFrom  = UtilsLib.convertStrToDate(fsrBean.getDateFrom(),"mm/dd/yyyy");
			dtTo    =UtilsLib.convertStrToDate(fsrBean.getDateTo(),"mm/dd/yyyy");
			dtFrom  = dtFrom.substring(0,10)+" 00:00:00";
			dtTo    = dtTo.substring(0,10)+" 23:59:59";
		    caseFrom =fsrBean.getCaseFrom();
		    caseTo   =fsrBean.getCaseTo();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<ReportBuilder> rptList = fsrBean.getReportBuilderList();
		
		// arrange the positions of the field dynamically assigned base field pos. But this would start from 1 not 0. Zero element would always be blank/null, 
		ctr = 0;
		
		String[] fieldPos = new String[100];
		for (int i = 0; i < fieldPos.length; i++){
		  fieldPos[i]="";
		}
		
		for (ReportBuilder fields :rptList){
			if (fields.getEditFlag().equals("true")){
			  fieldPos[Integer.parseInt(fields.getSequence())]= fields.getDbField();
			}
	
		}
		ctr=0;
	
		for (int i = 0; i < fieldPos.length; i++){

			if (ctr!=0){
				   comma=",";
				}
				
			if (!fieldPos[i].equals("")){
				ctr++;
				if (fieldPos[i].equals("Option_File.Option_Code")){
					fieldName = fieldName + comma + "(SELECT group_concat(Option_File.Option_Code) FROM option_file  WHERE Option_File.CaseNo = Requisitions.CaseNo) as 'Option Code'";
				}
				else {
				  fieldName = fieldName + comma + fieldPos[i];
				}
		    	
		    }
			
		}
		
		String sql ="";
		Map bldQryMap=new HashMap<String, String>();
		
		sql = sql +" Select " + fieldName;
		sql = sql + " FROM Requisitions,  Contr_Case LEFT join Order_Status on " +
				" ( Contr_Case.CaseNo = Order_Status.CaseNo ) ";
		if (fieldName.contains("requisitions_cart")) {
			sql = sql +"  LEFT JOIN Requisitions_Cart on (Contr_Case.CaseNo = Requisitions_Cart.CaseNo_Real) ";
		}
        if (fieldName.contains("requisitions_fsr")) {
			sql = sql +"  LEFT join Requisitions_Fsr on ( Contr_Case.CaseNo = Requisitions_Fsr.CaseNo ) ";
		}
		if (fieldName.contains("contract") || fieldName.contains("solicitations")  || fieldName.contains("contrduns")) {
			sql = sql +"  LEFT JOIN Contract ON (Contr_Case.Contract = Contract.Contract) ";
		}
		if ( fieldName.contains("solicitations") ) {
			sql = sql +"  LEFT JOIN Solicitation ON (Contract.Sol_No_1 = Solicitation.Sol_No_1 " + 
				" AND Contract.Sol_No_2 = Solicitation.Sol_No_2 AND " + 
                " Contract.Sol_No_3 = Solicitation.Sol_No_3) ";
		}
		if ( fieldName.contains("contrduns") ) {
			sql = sql +" LEFT JOIN ContrDUNS ON (Contract.Contr_DUNS = ContrDUNS.Contr_DUNS) ";
		}

		sql = sql + " , AgBu_Table, Contr_Line,  Std_items, States, Buyer_Table " + 
		 " WHERE ";
		if(fsrBean.getDateType().equalsIgnoreCase("shipment")){
			sql = sql + " Contr_Case.shipment_date between :dtFrom AND :dtTo ";
		}
		else{
			sql = sql + " Contr_Case.order_date between :dtFrom AND :dtTo ";
		}
		sql = sql + " AND Contr_Case.Mod in "+ 
	        "		(SELECT MAX(cc.Mod)  " +
	        "		FROM Contr_Case cc   " +
	        "   	WHERE cc.CaseNo = Contr_Case.CaseNo) " +
	        " AND Contr_Case.quantity <> 0 " +
	        " AND Requisitions.CaseNo = Contr_Case.CaseNo " +
	        " AND (concat(Requisitions.Agency_Code, Requisitions.Bureau_Code) <> '4709'   " +
	        " AND Requisitions.Agency_Code not in ('15','19','70') ) " +
	        " AND States.state = Requisitions.con_add_state ";
		if(fsrBean.getBuilderRegionList() != null && fsrBean.getBuilderRegionList().size() > 0){
			boolean firstRegion = true;			
			for(String regionCode : fsrBean.getBuilderRegionList()){
				if(firstRegion){
					firstRegion = false;
					//regionBuff.append("'");
				}
				else{
					regionBuff.append(",");
				}
				regionBuff.append(regionCode);
			}
			//regionBuff.append("'");
			sql = sql + " AND States.region in (:regionList) ";
		}
		sql = sql + " AND Contr_Line.Contract = Contr_Case.Contract " +
	        " AND Contr_Line.Sch_Line = Contr_Case.Sch_Line " +
	        " AND Agbu_Table.Agency_Code = Requisitions.Agency_Code " +
	        " AND Agbu_Table.Bureau_Code = Requisitions.Bureau_Code " +
	        " AND Requisitions.Std_Item = Std_items.Std_Item " +  
	        " AND AgBu_Table.Proprietary <>'Y' " +
	        " AND Requisitions.Buyer_Code = Buyer_Table.Buyer_Code";		
		if(caseFrom.trim().length() > 1 && caseTo.trim().length() > 1){
			sql = sql + " AND Requisitions.CaseNo >=  :caseFrom AND Requisitions.Caseno <= :caseTo ";
		}
		sql = sql + " ORDER BY Requisitions.con_add_state,   " +
		        " Requisitions.con_add_city,   " +
		        " Agbu_Table.agency,   " +
		        " Agbu_Table.bureau, " +
		        " Contr_Case.CaseNo, " +
		        " Order_Status.delivery_Date";
				
		 bldQryMap.put("sql",sql);		 
		 bldQryMap.put("dtFrom",dtFrom);
		 bldQryMap.put("dtTo",dtTo);
		 //bldQryMap.put("groupDuns",Integer.toString(groupDuns));
		 if(caseFrom.trim().length() > 1 && caseTo.trim().length() > 1){
				bldQryMap.put("caseFrom",caseFrom);
				bldQryMap.put("caseTo",caseTo);
			}
		 if(fsrBean.getBuilderRegionList() != null && fsrBean.getBuilderRegionList().size() > 0){
			 bldQryMap.put("regionList",fsrBean.getBuilderRegionList());
		 }
		 
		 return bldQryMap;
	}
	
	public ArrayList<Map<String, Object>> getReportBuilder(FSRBean fsrBean, Map<String, String> buildQryMap) throws Exception, SQLException, Exception {
		//setErrorMsg(null);
		ArrayList<Map<String, Object>> returnValue = new ArrayList<Map<String, Object>>();
		try{
			returnValue = reportBuilderDAO.getReportList(buildQryMap);
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR get report builder failed: " + ex.getMessage());
		}
		return returnValue;
	}
	
	public ArrayList<UserAgBuReportDTO> getFSRSavedReport(FSRBean fsrBean, UserAccountDTO user){
		ArrayList<UserAgBuReportDTO> returnValue = new ArrayList<UserAgBuReportDTO>();
		try{
			returnValue = fsrDAO.getSavedReportList(user);
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR get saved report list failed: " + ex.getMessage());
		}
		return returnValue;
       
	}
	
	public int saveBuildReportQuery(FSRBean fsrBean,String reportName, UserAccountDTO user){
		int returnValue = 0;
		ArrayList<ReportBuilder> rptList = fsrBean.getReportBuilderList();
		try{
			String[] fieldPos = new String[100];
			for (int i = 0; i < fieldPos.length; i++){
			  fieldPos[i]="";
			}
			// sort the field column here...
			for (ReportBuilder fields :rptList){
				if (fields.getEditFlag().equals("true")){
				  fieldPos[Integer.parseInt(fields.getSequence())]= fields.getFormField();
				}		
			}
			String fieldNames ="";
			for (int i =0; i < fieldPos.length;i++) {				
			    if ( !fieldPos[i].equals("")) {
					if (fieldNames.equals("")){
						fieldNames = fieldPos[i];	
					}
					else {
						fieldNames = fieldNames +"," +fieldPos[i];	
					}
			    }
			}
			
			if(fieldNames.length() <= 500){
				Calendar cal = Calendar.getInstance();
				Timestamp timeNow = new Timestamp(cal.getTimeInMillis());
		        
				UserAgBuReportDTO dto = new UserAgBuReportDTO();
				dto.setAgencyCode(user.getAgencyCode());
				dto.setBureauCode(user.getBureauCode());
				dto.setReportType("F");	
				dto.setReportNumber(reportName);
				dto.setPrivilege("P");
				dto.setFieldNames(fieldNames);
				dto.setUserID(user.getUserID());
				dto.setUserUpdated(user.getUserID());
				dto.setLastUpdateDate(timeNow);
				dto.setCreateDate(timeNow);
		        
				returnValue = fsrDAO.saveBuildReportQuery(dto);	   
				fsrBean.setReturnMessage("FSR report query saved successfully");
			}
			else{
				fsrBean.setReturnMessage("FSR save report query failed:  Field name over 500 characters.  Please select fewer columns.");
			}
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR save report query failed: " + ex.getMessage());
		}
		return returnValue;	
	}
	
	public int saveBuildReportAdmin(FSRBean fsrBean, ArrayList<UserAgBuReportDTO> fsrList,String userId){
		int returnValue = 0;
		try{
			for ( UserAgBuReportDTO dto : fsrList) {
			   if (dto.getEditFlag().equalsIgnoreCase("true")){
				  dto.setUserID(userId);
				  returnValue = fsrDAO.saveFSRReport(dto, "1");	   
			   }
			   else if (dto.getDelFlag().equalsIgnoreCase("true")) {
				   returnValue = fsrDAO.saveFSRReport(dto, "2"); 
			   }		  
			}	
			fsrBean.setReturnMessage("FSR report query admin saved successfully");
		}
		catch(Exception ex){
			fsrBean.setReturnMessage("FSR save report query admin failed: " + ex.getMessage());
		}
		return returnValue;
	}


}
