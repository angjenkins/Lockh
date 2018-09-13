package gov.gsa.fas.AutoChoice.service;



import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.BatchControlDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.VehTypeDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.ModelBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class CommonService {

	@Autowired
	private CommonBean commonBean;

	@Autowired
	private CommonDAO commonDAO;

	Transaction transaction = null;
	
	private	UserAccountDTO user = null;
	
	//hold the initial  vehicle type
	private String vehType = "";
	private String vehDesc = "";
	

	

	    
	public void getAutoChoiceVehTypeRecordList(String flag) {
		try {
		 
			List<VehTypeDTO> vehtypeMenuList=commonDAO.getVehTypeAutoChoiceList(flag);
			Map<String,List<VehTypeDTO>> vehtypeMenuMap=new HashMap<String, List<VehTypeDTO>>();
			
			for(VehTypeDTO vehTypeDTO:vehtypeMenuList)
			{
				String key=vehTypeDTO.getGroupDescription();
				if(vehtypeMenuMap.get(key)==null)
				{
					vehtypeMenuMap.put(key, new ArrayList<VehTypeDTO>());
				}
				
				vehtypeMenuMap.get(key).add(vehTypeDTO);
				
			}
			
			
			commonBean.setAutoChoiceVehTypeMap(vehtypeMenuMap);
		} catch (Exception e) {
			String error = "Failed to retrieve the menu of AutoStandard..!";

		}
	}


    
	public void getAgencyBureauAcces(UserAccountDTO dto) {
		try {
			 
			AgBuTableDTO agencyDTO=commonDAO.getAgencyBureauAccess(dto);
	        BatchControlDTO batchControlDTO = commonDAO.getBatchControl("15"); // get fiscal year 
			dto.setMultiRecordFileFlag(agencyDTO.getMultiRecordFileFlag());
			if (dto.getMultiRecordFileFlag()==null){
				dto.setMultiRecordFileFlag("");
			}
			
			dto.setFlg1122(agencyDTO.getFlg1122());
            if(dto.getFlg1122() == null) {
            	dto.setFlg1122("")	;
            }
			dto.setProprietary(agencyDTO.getProprietary());
	        if (dto.getProprietary()== null) {
	          dto.setProprietary("");
	        }
			dto.setDecentralized(agencyDTO.getDecentralized());
            if (dto.getDecentralized()== null){
               dto.setDecentralized("");
            }
			//			dto.setAgencyCode(agencyDTO.getAgencyCode());  // already populated during user account retrieval
//			dto.setBureauCode(agencyDTO.getBureauCode());

			dto.setFsrFlag("N");
			if (dto.getAgencyCode().equals("47") && dto.getBureauCode().equals("09") && ((dto.getPrivilege().equals("S") || dto.getPrivilege().equals("A") ))){
			   dto.setFsrFlag("Y");
		    }
			
			
	
		 
			commonBean.setBatchControlFYear(batchControlDTO.getOrderNumber()); //fiscal year system 
			commonBean.setUserAccount(dto);
			
		} catch (Exception e) {
			String error = "Failed to retrieve Agency table!";
		}
	
	
	}	

	public void getStdItemQuickSelection(UserAccountDTO dto) {
		try {
			 
			List<StdItemDTO> stdItemQuickSelection = null;
			stdItemQuickSelection = commonDAO.getQuickStdItem(dto.getFlg1122());
			commonBean.setStdItemQuickSelectionList(stdItemQuickSelection);
		} catch (Exception e) {
			String error = "Failed to retrieve Std Item quick selection table!";

		}
	
	
	}

	public void getModelsList(StdItemDTO stdItem)
	{
		List<ModelBean> modelList = null;
		modelList = commonDAO.getModelList(stdItem);
		
		/*for(ModelBean mb:modelList)
		{
			System.out.println("Contract" + mb.getContract());
			System.out.println("Contract Line" + mb.getContrLineDescription());
			System.out.println("Manufature Name" + mb.getManufacturerName());
			System.out.println("Sch Line" + mb.getSchLine());
			System.out.println("Group Duns" + mb.getModelGroupDUNSDescription());
			System.out.println("=====================================");
		}*/
		commonBean.setModelList(modelList);
	}

	public List<StatesDTO> getStatesList() {
		List<StatesDTO> statesList = commonDAO.getStateList("USA");
		commonBean.setStatesList(statesList);
		
		return statesList;
	}	
	
	public String getVehType() {
		return vehType;
	}



	public void setVehType(String vehType) {
		this.vehType = vehType;
	}



	public String getVehDesc() {
		return vehDesc;
	}



	public void setVehDesc(String vehDesc) {
		this.vehDesc = vehDesc;
	}


	
}