package gov.gsa.fas.AutoChoice.DTO;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;


public class CompareBean {

	ContrLineDTO  contrLineDTO = new ContrLineDTO();
	List<ContrLineOptCheckDTO> contrLineOptCheckDTOList = new ArrayList<ContrLineOptCheckDTO>();  // contains the selected options
	Map<String,List<ContrLineOptCheckDTO>>  includeMap = new HashMap<String,List<ContrLineOptCheckDTO>>();
	Map<String,List<ContrLineOptCheckDTO>>  requireMap = new HashMap<String,List<ContrLineOptCheckDTO>>();
	Map<String,List<ContrLineOptCheckDTO>>  excludeMap = new HashMap<String,List<ContrLineOptCheckDTO>>();
	
	
	double subTotUnitPrice = 0;
	double subTotalBeforeOrderOption =0;
	double totalOrderOptionsPrice = 0;
	double totalPriceBeforeSC = 0;
	double totalSellingPrice =0;
	double totVehicleOptionPrice = 0;
	double totAdditionalReqPrice = 0;
	double unitSellingPrice = 0;
	double totsurcharge = 0;
	int vehQty =0;
	int totShipDays =0;
	

	
	
	public ContrLineDTO getContrLineDTO() {
		return contrLineDTO;
	}
	public void setContrLineDTO(ContrLineDTO contrLineDTO) {
		this.contrLineDTO = contrLineDTO;
	}
	
	
	public List<ContrLineOptCheckDTO> getContrLineOptCheckDTOList() {
		return contrLineOptCheckDTOList;
	}
	public void setContrLineOptCheckDTOList(
			List<ContrLineOptCheckDTO> contrLineOptCheckDTOList) {
		this.contrLineOptCheckDTOList = contrLineOptCheckDTOList;
	}
	public Map<String, List<ContrLineOptCheckDTO>> getIncludeMap() {
		return includeMap;
	}
	public void setIncludeMap(Map<String, List<ContrLineOptCheckDTO>> includeMap) {
		this.includeMap = includeMap;
	}
	public Map<String, List<ContrLineOptCheckDTO>> getRequireMap() {
		return requireMap;
	}
	public void setRequireMap(Map<String, List<ContrLineOptCheckDTO>> requireMap) {
		this.requireMap = requireMap;
	}
	public Map<String, List<ContrLineOptCheckDTO>> getExcludeMap() {
		return excludeMap;
	}
	public void setExcludeMap(Map<String, List<ContrLineOptCheckDTO>> excludeMap) {
		this.excludeMap = excludeMap;
	}
	public double getSubTotUnitPrice() {
		return subTotUnitPrice;
	}
	public void setSubTotUnitPrice(double subTotUnitPrice) {
		this.subTotUnitPrice = subTotUnitPrice;
	}
	public double getSubTotalBeforeOrderOption() {
		return subTotalBeforeOrderOption;
	}
	public void setSubTotalBeforeOrderOption(double subTotalBeforeOrderOption) {
		this.subTotalBeforeOrderOption = subTotalBeforeOrderOption;
	}
	public double getTotalOrderOptionsPrice() {
		return totalOrderOptionsPrice;
	}
	public void setTotalOrderOptionsPrice(double totalOrderOptionsPrice) {
		this.totalOrderOptionsPrice = totalOrderOptionsPrice;
	}
	public double getTotalPriceBeforeSC() {
		return totalPriceBeforeSC;
	}
	public void setTotalPriceBeforeSC(double totalPriceBeforeSC) {
		this.totalPriceBeforeSC = totalPriceBeforeSC;
	}
	public double getTotalSellingPrice() {
		return totalSellingPrice;
	}
	public void setTotalSellingPrice(double totalSellingPrice) {
		this.totalSellingPrice = totalSellingPrice;
	}
	public double getTotVehicleOptionPrice() {
		return totVehicleOptionPrice;
	}
	public void setTotVehicleOptionPrice(double totVehicleOptionPrice) {
		this.totVehicleOptionPrice = totVehicleOptionPrice;
	}
	public double getTotAdditionalReqPrice() {
		return totAdditionalReqPrice;
	}
	public void setTotAdditionalReqPrice(double totAdditionalReqPrice) {
		this.totAdditionalReqPrice = totAdditionalReqPrice;
	}
	public double getUnitSellingPRice() {
		return unitSellingPrice;
	}
	public void setUnitSellingPrice(double unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}
	public int getVehQty() {
		return vehQty;
	}
	public void setVehQty(int vehQty) {
		this.vehQty = vehQty;
	}
	public double getTotsurcharge() {
		return totsurcharge;
	}
	public void setTotsurcharge(double totsurcharge) {
		this.totsurcharge = totsurcharge;
	}
	public int getTotShipDays() {
		return totShipDays;
	}
	public void setTotShipDays(int totShipDays) {
		this.totShipDays = totShipDays;
	}
	public double getUnitSellingPrice() {
		return unitSellingPrice;
	}

	
//	

}


