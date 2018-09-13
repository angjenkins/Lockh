package gov.gsa.fas.AutoChoice.beans;


import java.util.ArrayList;
import java.util.List;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.CompareBean;
import gov.gsa.fas.AutoChoice.DTO.ContrDeviationDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptCheckDTO;
import gov.gsa.fas.AutoChoice.DTO.GroupDunsDealerLocDTO;
import gov.gsa.fas.AutoChoice.DTO.ModelColorDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionFileCartDTO;
import gov.gsa.fas.AutoChoice.DTO.ReqDetailCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartColorDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsJustDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;		
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;

@Component
@Scope("session")
public class OrderBean {
	
	private String message = "";
	private String vehType ="";
	private String vehDescription = "";
	private String selectionBy ="";

	
	@Autowired
 	private StdItemDTO stdItemDTO = null;
	@Autowired
	private RequisitionsJustDTO reqJust = new RequisitionsJustDTO();
	private List<StdItemDTO> stdItemList = null;
	private List<StdItemOptionDTO> stdItemOptionList = null;
	
	private Map<ModelBean,List<ContrDeviationDTO>> clarificationEmissionList=null;
	private List<ContrDeviationDTO> oemClarificationList = null;  //contains available list of contract base on std item
    private List<ContrLineDTO> contrLineAvailableList = null;  //contains available list of contract base on std item
	private List<ContrLineOptCheckDTO> collisionOptionInputList= null; // will contain the option input selected by the user, including additional options from collision.Will be use for inserting records.
	//private Map<String, Map<String,List<ContrLineOptCheckDTO>>> collisionContainerMap = new HashMap<String, Map<String,List<ContrLineOptCheckDTO>>>(); // will contain the collision
    private List<CompareBean> compareBeanList = new ArrayList<CompareBean>();  // will contain the template and value for price comparison display
    private CompareBean compareBeanTemp = null;  // will contain the seleted model from the comparison  display
	
    private RequisitionsCartDTO reqCart = new  RequisitionsCartDTO();
    private List<OptionFileCartDTO> optFileCartList = new ArrayList<OptionFileCartDTO>();
    private List<RequisitionsCartColorDTO> reqCartColorList = new ArrayList<RequisitionsCartColorDTO>();
    
    private List<ModelColorDTO> modelColorList = new ArrayList<ModelColorDTO>();
    private List<UserGroupDTO> userGroupList = new ArrayList<UserGroupDTO>();
    private String caseNumber = "";
    private boolean cnsFound;
    private boolean exDelFound;
    private boolean ddrFound;
    private String returnMessage = "";
    private Double totalPrice;
    private String allowOrdering = "";
    private String dealerFlag = "";
    private Integer groupDUNS;
    private String model = "";
    private GroupDunsDealerLocDTO dealerInfo = new GroupDunsDealerLocDTO();
    private AgBuTableDTO agBu;
    private List<AgBuTableDTO> agBuOnBehalfList;
    private String agBuOnBehalf = "";
    private List<String> signalCodeList = new ArrayList<String>();
    private List<StatesDTO> stateList;
    private boolean dod;
    private List<ReqDetailCombinedDTO> dealerInfoList;
    private String action = "";
    private MultipartFile miprFile;
    private CommonsMultipartFile uploadFile;
    private String fileType = "";
    
    private String dealerInfoJSON = "";
	
	
	@Value("${THUMBNAILS}")
    private String thumbNails;
	
	@Value("${MAINPICS}")
    private String mainPics;
		
	private int inputVehicleQuantity = 1 ; // user entered vehicle quantity, 1 is the default
	private String inputOptionsAndQty = ""; // user selected options and entered qty per options. 
    private ContrLineDTO contrLineDTO = null;  // will contain the selected model from price comparison
	
    private Map<OtherfeaturesBean,List<OtherfeaturesBean>> otherfeatureslist=null; 
    private List<OtherfeaturesValueBean> otherfeaturesValueBean=null;
    
    
	public List<StdItemDTO> getStdItemList() {
		return stdItemList;
	}

	public void setStdItemList(List<StdItemDTO> stdItemList) {
		this.stdItemList = stdItemList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	public String getVehDescription() {
		return vehDescription;
	}

	public void setVehDescription(String vehDescription) {
		this.vehDescription = vehDescription;
	}

	public List<StdItemOptionDTO> getStdItemOptionList() {
		return stdItemOptionList;
	}

	public void setStdItemOptionList(List<StdItemOptionDTO> stdItemOptionList) {
		this.stdItemOptionList = stdItemOptionList;
	}

	public StdItemDTO getStdItemDTO() {
		return stdItemDTO;
	}

	public void setStdItemDTO(StdItemDTO stdItemDTO) {
		this.stdItemDTO = stdItemDTO;
	}
	public List<ContrLineDTO> getContrLineAvailableList() {
		return contrLineAvailableList;
	}

	public void setContrLineAvailableList(List<ContrLineDTO> contrLineAvailableList) {
		this.contrLineAvailableList = contrLineAvailableList;
	}

	public String getThumbNails() {
		return thumbNails;
	}

	public void setThumbNails(String thumbNails) {
		this.thumbNails = thumbNails;
	}

	public String getMainPics() {
		return mainPics;
	}

	public void setMainPics(String mainPics) {
		this.mainPics = mainPics;
	}


	public Map<ModelBean, List<ContrDeviationDTO>> getClarificationEmissionList() {
		return clarificationEmissionList;
	}

	public void setClarificationEmissionList(
			Map<ModelBean, List<ContrDeviationDTO>> clarificationEmissionList) {
		this.clarificationEmissionList = clarificationEmissionList;
	}

	
	public int getInputVehicleQuantity() {
		return inputVehicleQuantity;
	}

	public void setInputVehicleQuantity(int inputVehicleQuantity) {
		this.inputVehicleQuantity = inputVehicleQuantity;
	}

	public String getInputOptionsAndQty() {
		return inputOptionsAndQty;
	}

	public void setInputOptionsAndQty(String inputOptionsAndQty) {
		this.inputOptionsAndQty = inputOptionsAndQty;
	}

	public ContrLineDTO getContrLineDTO() {
		return contrLineDTO;
	}

	public void setContrLineDTO(ContrLineDTO contrLineDTO) {
		this.contrLineDTO = contrLineDTO;
	}

	public List<ContrDeviationDTO> getOemClarificationList() {
		return oemClarificationList;
	}

	public void setOemClarificationList(List<ContrDeviationDTO> oemClarificationList) {
		this.oemClarificationList = oemClarificationList;
	}

	public Map<OtherfeaturesBean,List<OtherfeaturesBean>> getOtherfeatureslist() {
		return otherfeatureslist;
	}

	public void setOtherfeatureslist(Map<OtherfeaturesBean,List<OtherfeaturesBean>> otherfeatureslist) {
		this.otherfeatureslist = otherfeatureslist;
	}

	public List<OtherfeaturesValueBean> getOtherfeaturesValueBean() {
		return otherfeaturesValueBean;
	}

	public void setOtherfeaturesValueBean(
			List<OtherfeaturesValueBean> otherfeaturesValueBean) {
		this.otherfeaturesValueBean = otherfeaturesValueBean;
	}

	public List<ContrLineOptCheckDTO> getCollisionOptionInputList() {
		return collisionOptionInputList;
	}

	public void setCollisionOptionInputList(
			List<ContrLineOptCheckDTO> collisionOptionInputList) {
		this.collisionOptionInputList = collisionOptionInputList;
	}


	public List<CompareBean> getCompareBeanList() {
		return compareBeanList;
	}

	public void setCompareBeanList(List<CompareBean> compareBeanList) {
		this.compareBeanList = compareBeanList;
	}

	public RequisitionsCartDTO getReqCart() {
		return reqCart;
	}

	public void setReqCart(RequisitionsCartDTO reqCart) {
		this.reqCart = reqCart;
	}

	

	public RequisitionsJustDTO getReqJust() {
		return reqJust;
	}

	public void setReqJust(RequisitionsJustDTO reqJust) {
		this.reqJust = reqJust;
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

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getAllowOrdering() {
		return allowOrdering;
	}

	public void setAllowOrdering(String allowOrdering) {
		this.allowOrdering = allowOrdering;
	}

	public String getDealerFlag() {
		return dealerFlag;
	}

	public void setDealerFlag(String dealerFlag) {
		this.dealerFlag = dealerFlag;
	}

	public Integer getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(Integer groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public GroupDunsDealerLocDTO getDealerInfo() {
		return dealerInfo;
	}

	public void setDealerInfo(GroupDunsDealerLocDTO dealerInfo) {
		this.dealerInfo = dealerInfo;
	}

	public AgBuTableDTO getAgBu() {
		return agBu;
	}

	public void setAgBu(AgBuTableDTO agBu) {
		this.agBu = agBu;
	}

	public List<AgBuTableDTO> getAgBuOnBehalfList() {
		return agBuOnBehalfList;
	}

	public void setAgBuOnBehalfList(List<AgBuTableDTO> agBuOnBehalfList) {
		this.agBuOnBehalfList = agBuOnBehalfList;
	}

	public String getAgBuOnBehalf() {
		return agBuOnBehalf;
	}

	public void setAgBuOnBehalf(String agBuOnBehalf) {
		this.agBuOnBehalf = agBuOnBehalf;
	}

	public List<String> getSignalCodeList() {
		return signalCodeList;
	}

	public void setSignalCodeList(List<String> signalCodeList) {
		this.signalCodeList = signalCodeList;
	}

	public CompareBean getCompareBeanTemp() {
		return compareBeanTemp;
	}
	public void setCompareBeanTemp(CompareBean compareBeanTemp) {
		this.compareBeanTemp = compareBeanTemp;
	}

	public List<StatesDTO> getStateList() {
		return stateList;
	}

   public void setStateList(List<StatesDTO> stateList) {
		this.stateList = stateList;
	}
	public boolean isDod() {
		return dod;
	}

	public void setDod(boolean dod) {
		this.dod = dod;
	}

	public List<OptionFileCartDTO> getOptFileCartList() {
		return optFileCartList;
	}

	public void setOptFileCartList(List<OptionFileCartDTO> optFileCartList) {
		this.optFileCartList = optFileCartList;
	}

	public List<RequisitionsCartColorDTO> getReqCartColorList() {
		return reqCartColorList;
	}

	public void setReqCartColorList(List<RequisitionsCartColorDTO> reqCartColorList) {
		this.reqCartColorList = reqCartColorList;
	}

	public List<ModelColorDTO> getModelColorList() {
		return modelColorList;
	}

	public void setModelColorList(List<ModelColorDTO> modelColorList) {
		this.modelColorList = modelColorList;
	}

	public List<UserGroupDTO> getUserGroupList() {
		return userGroupList;
	}

	public void setUserGroupList(List<UserGroupDTO> userGroupList) {
		this.userGroupList = userGroupList;
	}

	public String getSelectionBy() {
		return selectionBy;
	}

	public void setSelectionBy(String selectionBy) {
		this.selectionBy = selectionBy;
	}

	public List<ReqDetailCombinedDTO> getDealerInfoList() {
		return dealerInfoList;
	}

	public void setDealerInfoList(List<ReqDetailCombinedDTO> dealerInfoList) {
		this.dealerInfoList = dealerInfoList;
	}

	public String getDealerInfoJSON() {
		return dealerInfoJSON;
	}

	public void setDealerInfoJSON(String dealerInfoJSON) {
		this.dealerInfoJSON = dealerInfoJSON;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public MultipartFile getMiprFile() {
		return miprFile;
	}

	public void setMiprFile(MultipartFile miprFile) {
		this.miprFile = miprFile;
	}

	public CommonsMultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(CommonsMultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

   
	
}
