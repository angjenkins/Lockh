package gov.gsa.fas.AutoChoice.service;

import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DAO.OrderDAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.BidLinePictureDTO;
import gov.gsa.fas.AutoChoice.DTO.CompareBean;
import gov.gsa.fas.AutoChoice.DTO.ContrDeviationDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptCheckDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.ModelColorDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionFileCartDTO;
import gov.gsa.fas.AutoChoice.DTO.GroupDunsDealerLocDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsCategoryDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsTableDTO;
import gov.gsa.fas.AutoChoice.DTO.ReqDetailCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartColorDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsJustDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesZipDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.CommonBean;
import gov.gsa.fas.AutoChoice.beans.ConflictBean;
import gov.gsa.fas.AutoChoice.beans.MinimumBean;
import gov.gsa.fas.AutoChoice.beans.ModelBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.beans.OtherfeaturesBean;
import gov.gsa.fas.AutoChoice.beans.OtherfeaturesValueBean;
import gov.gsa.fas.AutoChoice.util.PortFile;
import gov.gsa.fas.AutoChoice.util.UtilsLib;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class OrderService {

	Logger logger = Logger.getLogger(OrderService.class.toString());

	@Autowired
	private OrderDAO orderDAO = null;
	@Autowired
	private OrderBean orderBean = null;
	@Autowired
	private ConflictService conflictService = null;
	@Autowired
	private ConflictBean conflictBean = null;

	@Autowired
	private MinimumBean minimumBean = null;

	public void getStdItemList(String flag1122, String vehType) {
		try {

			List<StdItemDTO> stdItemList = null;
			stdItemList = orderDAO.getStdItemList(flag1122, vehType);
			if (stdItemList.size() != 0) {
				orderBean.setVehType(stdItemList.get(0).getVehType());
				orderBean.setVehDescription(stdItemList.get(0)
						.getVehDescription());
			}
			orderBean.setStdItemList(stdItemList);
		} catch (Exception e) {
			logger.info("Exception while retrieving Std Item at service: "
					+ e.getMessage());

		}

	}

	public void getOptionsList(String stdItem, UserAccountDTO dto) {
		try {
			List<StdItemOptionDTO> stdItemOptionList = null;
			List<ContrLineDTO> contracAvailablelist = null;
			List<ContrLineDTO> contracAvailablelist2 = null;

			// String proprietaryContract = "";

			// if in edit mode and Caseno is available proprietaryContract needs
			// to be initialized

			stdItemOptionList = orderDAO.getOptionsList(stdItem,
					dto.getProprietary());
			orderBean.setStdItemOptionList(stdItemOptionList);
			orderBean.setStdItemDTO(orderDAO.getStdItemDTO(stdItem));
			// populate the contract list to ready for deviation,emissions and
			// comparison
			contracAvailablelist = orderDAO.getContractLineList(stdItem,
					dto.getProprietary(), dto.getFlg1122());
			// populate contract line bean
            orderBean.setContrLineAvailableList(contracAvailablelist);
			
          
			

		} catch (Exception e) {
			logger.info("Exception while retrieving Std Item at service: "
					+ e.getMessage());

		}

	}

	public void setStdItemSelected(List<StdItemDTO> stdItemList, String stdItem) {
		for (StdItemDTO dto : stdItemList) {
			if (dto.getStdItem().trim().equals(stdItem.trim())) {
				orderBean.getStdItemDTO().setStdItem(dto.getStdItem());
				orderBean.getStdItemDTO().setDescription(dto.getDescription());
			}

		}
	}

	public void getClarificationEmissionList(CommonBean commonBean,
			OrderBean orderbean, String cOre) {

		// call order DAO() for the contract and schedule line\
		//for (ModelBean mb : commonBean.getModelList()) {
			// System.out.println(mb.getContract());
			// System.out.println(mb.getSchLine());
		//}
		List<ContrDeviationDTO> contrDeviationDTOList = orderDAO
				.getClarificationEmissionList(commonBean.getModelList(), cOre);

		// for(ContrDeviationDTO contr:contrDeviationDTOList){
		// System.out.println(contr.getContract());
		// System.out.println(contr.getSch_Line());
		// System.out.println(contr.getLine_Number());
		// System.out.println(contr.getDesc());
		// System.out.println(contr.getContract());
		// System.out.println("==================================");
		// }
		//
		Map<ModelBean, List<ContrDeviationDTO>> tmpClarificationEmissionList = new HashMap<ModelBean, List<ContrDeviationDTO>>();

		for (ModelBean mb : commonBean.getModelList()) {
			List<ContrDeviationDTO> tmpContr = new ArrayList<ContrDeviationDTO>();
			for (ContrDeviationDTO contr : contrDeviationDTOList) {
				if (mb.getContract().trim().equals(contr.getContract().trim())
						&& mb.getSchLine().trim()
								.equals(contr.getSch_Line().trim())) {
					tmpContr.add(contr);
				}
			}
			tmpClarificationEmissionList.put(mb, tmpContr);

		}

		/*for (Map.Entry<ModelBean, List<ContrDeviationDTO>> entry : tmpClarificationEmissionList
				.entrySet()) {
			// System.out.println(entry.getKey().getManufacturerName() + "--" +
			// entry.getKey().getModelGroupDUNSDescription() + "---" +
			// entry.getKey().getContrLineDescription() );
			// System.out.println("-----------------------------------------------------");
			//
			// for(ContrDeviationDTO contr:entry.getValue()){
			// System.out.println(contr.getDesc());
			// }
			// System.out.println("===========================================================");
		}*/

		orderbean.setClarificationEmissionList(tmpClarificationEmissionList);

		// return list of contrDeviation
		// for commonbean.modelList
		// sublist=contrDeviation.find(commonbean.modelList)
		// map. add<commonbean.modelList,sublist>

	}

	public void getOemClarificationList(OrderBean orderbean) {

		List<ContrDeviationDTO> contrDeviationDTOList = orderDAO
				.getOemClarificationList(orderbean);
		orderbean.setOemClarificationList(contrDeviationDTOList);

	}

	public void getAvailableContract(String stdItem, UserAccountDTO dto,
			int fiscalYear, OrderBean orderBean) {				
		try {
			List<ContrLineDTO> list = null;
			List<ContrLineOptCheckDTO> contrLineOptCheckerInputList = new ArrayList<ContrLineOptCheckDTO>();
			List<ContrLineOptCheckDTO> contrLineOptCheckerList = new ArrayList<ContrLineOptCheckDTO>();
		    List<CompareBean> compareBeanList = new ArrayList<CompareBean>();
			String inputOptionandQty = orderBean.getInputOptionsAndQty();
			;

			
			// if there is an options selected
			
			
			String delims = "[,]";
			String[] optionsArray = inputOptionandQty.split(delims);

			if (!optionsArray[0].equals("")) {
				// split the qty and option
				String optionList = "";
				delims = "[=]";
				String[] optionQtyArray = { "", "" };
				for (int i = 0; i < optionsArray.length; i++) {
					if (i > 0) {
						optionList = optionList + ",";
					}
					ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
					optionQtyArray = optionsArray[i].split(delims);
					contrLineOptCheckerDTO.setOption_Code(optionQtyArray[0]);
					contrLineOptCheckerDTO.setQuantity(Integer
							.parseInt(optionQtyArray[1]));
					contrLineOptCheckerInputList.add(contrLineOptCheckerDTO);
					optionList = optionList + "'" + optionQtyArray[0] + "'";
					
	
				}
				
				
	
				//GET the valid qty flag here pass  contrLineOptCheckerInputList and update its validQty
	            
				List<String> optionStringList =new ArrayList<String>();
				
				for (ContrLineOptCheckDTO option :contrLineOptCheckerInputList){
					optionStringList.add(option.getOption_Code());
				}
				
				
				
				List <OptionsTableDTO> optionsDTOList = null;    
				
	            optionsDTOList = conflictService.geOptionList(optionStringList);
				
	            for (OptionsTableDTO optionsTable : optionsDTOList ){
	    			for (ContrLineOptCheckDTO optionCheck :contrLineOptCheckerInputList){
	            	  if (optionsTable.getOptionCode().equals(optionCheck.getOption_Code())){
	            		  optionCheck.setValidQty(optionsTable.getValidQty());
	            		  optionCheck.setDescription(optionsTable.getDescription());
	            	  }
	    			}            	
	            }
	            
			}  // end of options
			
			
			// if in edit mode and Caseno is available proprietaryContract needs to be initialized
		    		
			list = orderBean.getContrLineAvailableList();

			// get picture of vehicle

			
			
			
			BidLinePictureDTO pictureDTO = null;
			
			//  creating the bean for display
			
			for (ContrLineDTO contrLineDTO : list) {
			
				double subTotUnitPrice = 0;
				double subTotalBeforeOrderOption =0;
				double totalOrderOptionsPrice = 0;
				double totalPriceBeforeSC = 0;
				double totalSellingPrice =0;
				double totVehicleOptionPrice = 0;
				double totAdditionalReqPrice = 0;
				double unitSellingPRice = 0;
				int vehQty =0;
				double basePrice =0;
				double surcharge =0;
				double totsurcharge =0;
				
			    CompareBean compareBean = new CompareBean();

				pictureDTO = orderDAO.getPictureOfContractAvailable(contrLineDTO.getContract(), contrLineDTO.getSch_Line(),	contrLineDTO.getModelCode(), fiscalYear);
				contrLineDTO.setFileNamePicture(pictureDTO.getFileName());

				
				contrLineDTO.setRecordCount(list.size());  // for display to get the number of column for model 
				compareBean.setContrLineDTO(contrLineDTO);
                //
                //collision should be added inside the compareBean as well...
                // code here later..
                
                // do the computation 

				// Shipping days including options days
				
				int shipDays = 0;
				shipDays = contrLineDTO.getShipDays();
                for (ContrLineOptCheckDTO contrCheckerDTO : contrLineOptCheckerList) {
                   if (contrCheckerDTO.getAddShipDays() > 0) {
                	   shipDays = shipDays + contrCheckerDTO.getAddShipDays();
                   } 
                }				
                
                compareBean.setTotShipDays(shipDays);

                //Base Price $ (A)
			    basePrice = contrLineDTO.getCurrUnitPrice();

			    
				if (!optionsArray[0].equals("")) {      
					contrLineOptCheckerList =conflictService.checkForOptionConflicts(contrLineDTO.getContract(),contrLineDTO.getSch_Line(),contrLineOptCheckerInputList, orderBean.getInputVehicleQuantity());  
	                compareBean.setContrLineOptCheckDTOList(contrLineOptCheckerList);
					
	         
	                for (ContrLineOptCheckDTO contrCheckerDTO : contrLineOptCheckerList) {
	               	 
	                	if (contrCheckerDTO.getUnitPrice() > 0 ) {
							 if (contrCheckerDTO.getValidQty().equals("O")){   // order by vehicle needs to divide the optins/vehicle qty the price
								 
								 //Total Order Options(E)$
								 totalOrderOptionsPrice =  totalOrderOptionsPrice + (contrCheckerDTO.getUnitPrice() * contrCheckerDTO.getQuantity())/orderBean.getInputVehicleQuantity();
							 }
							 else {
								 //Total Vehicle Options (C) 
								 totVehicleOptionPrice =totVehicleOptionPrice + contrCheckerDTO.getUnitPrice();
										 // donot multiply yet - * contrCheckerDTO.getQuantity());
							 }
	                	}
                	
	                }
				}
                
                //Quantity (D)
                vehQty = orderBean.getInputVehicleQuantity() ;
                compareBean.setVehQty(vehQty);
                
                
                //Addtl Required Vehicle Options(B)
                totAdditionalReqPrice  =  0;  // get this value from collision  
                compareBean.setTotAdditionalReqPrice(totAdditionalReqPrice);

                // tot vehicle option
                
                compareBean.setTotVehicleOptionPrice(totVehicleOptionPrice);
                
                //Subtotal Unit Price (A+B+C)
                subTotUnitPrice  = basePrice  + totVehicleOptionPrice + totAdditionalReqPrice ;
                compareBean.setSubTotUnitPrice(subTotUnitPrice);

                
                //= Sub-Total$ (A+B+C)*D 
                subTotalBeforeOrderOption = subTotUnitPrice  * orderBean.getInputVehicleQuantity(); 
                compareBean.setSubTotalBeforeOrderOption(subTotalBeforeOrderOption);

              
                //Total Price $((A+B+C)*D)+E)
                totalPriceBeforeSC  = subTotalBeforeOrderOption + totalOrderOptionsPrice  ;
                compareBean.setTotalPriceBeforeSC(totalPriceBeforeSC);
                
			   // + GSA Surcharge 
                surcharge = Double.parseDouble(contrLineDTO.getContractSc());
                totsurcharge = (totalPriceBeforeSC * surcharge)/100;
                compareBean.setTotsurcharge(totsurcharge);

            
                
               //Total Selling Price (F) = Total Price $((A+B+C)*D)+E) + surcharge
                totalSellingPrice = totalPriceBeforeSC + totsurcharge;
                compareBean.setTotalSellingPrice(totalSellingPrice);
               
                // =Unit Selling Price $) (F/C) = Total Selling Price (F) / Quantity
                unitSellingPRice  = totalSellingPrice / vehQty;
                compareBean.setUnitSellingPrice(unitSellingPRice);
                  
//                if (sortingContract.length > 0){
//                    sortingContract[row] = contrLineDTO.getContract()+contrLineDTO.getSch_Line();
//                }
//                else {
//                	if (previousUnitPrice) 
//                	
//                }
//                previousUnitPrice =	unitSellingPRice;
                compareBeanList.add(compareBean);				
				
			}
			
		    
			//sorting from lowest price to highest
			
		    
		    for ( int i=0; i < compareBeanList.size();i++){
		    	for (int j = i+1; j < compareBeanList.size();j++){
				   if (compareBeanList.get(i).getUnitSellingPRice() >  compareBeanList.get(j).getUnitSellingPRice()) {
					   CompareBean compareBeanTempHolder = new CompareBean(); 
					   compareBeanTempHolder =  compareBeanList.get(i); 
					   compareBeanList.set(i,compareBeanList.get(j));
					   compareBeanList.set(j,compareBeanTempHolder);
				   }
				} 	
			}
			
           // populate contract line bean
			
		    orderBean.setContrLineAvailableList(list);
			orderBean.setCollisionOptionInputList(contrLineOptCheckerInputList); // original input will be use as reference during looping in the display jsp
            orderBean.setCompareBeanList(compareBeanList);
			
	
		} catch (Exception e) {
			logger.info("Exception while retrieving Contract available at service: "
					+ e.getMessage());

		}

	}

	public void getModelColorList(OrderBean orderbBean)   { 
	  List<ModelColorDTO> modelColorList = null;
	  modelColorList = orderDAO.getModelColorList(orderbBean.getContrLineDTO());
	  orderBean.setModelColorList(modelColorList);
	  
		
	}
		
	
	// populate all the DTO's needed for insert or update in pending order
	public void setPendingOrderValues(OrderBean orderBean) {
        List <OptionFileCartDTO>   optionCartList = new ArrayList<OptionFileCartDTO>();
		for (CompareBean compareBean: orderBean.getCompareBeanList()){
			if (compareBean.getContrLineDTO().getContract().equals(orderBean.getContrLineDTO().getContract()) && compareBean.getContrLineDTO().getSch_Line().equals(orderBean.getContrLineDTO().getSch_Line())){
				orderBean.setContrLineDTO(compareBean.getContrLineDTO());	
				orderBean.getContrLineDTO().setTotalUnitPrice(compareBean.getUnitSellingPRice());
				orderBean.getContrLineDTO().setVehicleQty(compareBean.getVehQty());
			    for (ContrLineOptCheckDTO checkerDTO: compareBean.getContrLineOptCheckDTOList()){
			        OptionFileCartDTO optionCart = new OptionFileCartDTO(); 
			    	if (checkerDTO.getAction().equals("")){
			    		optionCart.setOption_Code(checkerDTO.getOption_Checked());
			    		optionCart.setQty(checkerDTO.getQuantity());
			    		optionCart.setFlag(checkerDTO.getValidQty());
			    		//optionsCart
			    		optionCartList.add(optionCart);
			    	}
			    	
			    }   
			    // now update here the collisionOptionInputList  --- require will have to added here since this will be the final options for insert 
			    //  and will be use to update the cart.
			    orderBean.setOptFileCartList(optionCartList);
			    orderBean.setCompareBeanTemp(compareBean);
			}
		}
		
		//requisitionsCartD
		RequisitionsCartDTO reqCart = new RequisitionsCartDTO();
		reqCart.setContract(orderBean.getCompareBeanTemp().getContrLineDTO().getContract());
		reqCart.setSchLine((orderBean.getCompareBeanTemp().getContrLineDTO().getSch_Line()));
		reqCart.setStdItem(orderBean.getCompareBeanTemp().getContrLineDTO().getStdItem());
		reqCart.setModel(orderBean.getCompareBeanTemp().getContrLineDTO().getModel());
		reqCart.setQuantity(orderBean.getCompareBeanTemp().getContrLineDTO().getVehicleQty());
		reqCart.setEstUnitPrice(orderBean.getCompareBeanTemp().getContrLineDTO().getTotalUnitPrice());
		reqCart.setFairOpp("FAIR");  // right now CF autochoice always insert this default value.  
//		List <RequisitionsCartColorDTO> requisitionColorList = new ArrayList<RequisitionsCartColorDTO>();
//		for (ModelColorDTO modelColor: orderBean.getModelColor()){ 
//			RequisitionsCartColorDTO reqColor  = new RequisitionsCartColorDTO();  
//			if (modelColor.getQuantity() > 0){
//				reqColor.setColor_Code(modelColor.getColor_Code());
//				reqColor.setQuantity(modelColor.getQuantity());
//				requisitionColorList.add(reqColor);
//			}
//		}
		orderBean.setReqCart(reqCart);
//		orderBean.setReqCartColor(requisitionColorList);
		
	}

	
	// populate all the DTO's needed for insert or update in pending order
	public void setPendingOrderValuesColor(OrderBean orderBean) {
		List <RequisitionsCartColorDTO> requisitionColorList = new ArrayList<RequisitionsCartColorDTO>();
		for (ModelColorDTO modelColor: orderBean.getModelColorList()){ 
			RequisitionsCartColorDTO reqColor  = new RequisitionsCartColorDTO();  
			if (modelColor.getQuantity() > 0){
				reqColor.setColor_Code(modelColor.getColor_Code());
				reqColor.setQuantity(modelColor.getQuantity());
				requisitionColorList.add(reqColor);
			}
		}
		orderBean.setReqCartColorList(requisitionColorList);
		
	}


    public String getSelectionBy(String orderType){
        String selectionType ="";	
        if (orderType.equals("ByType")) {
     	   selectionType ="By Type";
        }
        else if (orderType.equals("Proprietary")) {
     	   selectionType ="Proprietary";
        }

        else if (orderType.equals("ExpressDesk")) {
     	   selectionType ="Express Desk";
        }

        else if (orderType.equals("Multiple")) {
     	   selectionType ="Multiple Award (23V MAS)";
        }

        else if (orderType.equals("NonStandard")) {
     	   selectionType ="Non-Standard Vehicles";
        }
        
        orderBean.setSelectionBy(selectionType);
        return selectionType;
     }
 	

	
	
	public void getOtherFeatures(OrderBean orderbBean) {
		List<OtherfeaturesBean> otherfeaturesBeanList = orderDAO
				.getOtherfeaturesdesc(orderbBean);
		Map<OtherfeaturesBean, List<OtherfeaturesBean>> otherfeaturesBeanMap = new HashMap<OtherfeaturesBean, List<OtherfeaturesBean>>();
		List<OtherfeaturesValueBean> otherfeaturesValueBeanList = new ArrayList<OtherfeaturesValueBean>();

		for (OtherfeaturesBean tmpOtherfeaturesBean : otherfeaturesBeanList) {
			OtherfeaturesBean key = tmpOtherfeaturesBean;

			if (otherfeaturesBeanMap.get(key) == null) {
				otherfeaturesBeanMap.put(key,
						new ArrayList<OtherfeaturesBean>());
			}

			List<OtherfeaturesValueBean> otherfeaturesValueBeanlist = orderDAO
					.getOtherfeaturesval(orderbBean, key.getDescription());
			
			for(OtherfeaturesValueBean ov:otherfeaturesValueBeanlist){
				if(!(otherfeaturesValueBeanList.contains(ov))){
					otherfeaturesValueBeanList.add(ov);
				}
			}

			tmpOtherfeaturesBean.setStdOptions(otherfeaturesValueBeanlist);

			otherfeaturesBeanMap.get(key).add(tmpOtherfeaturesBean);

		}

		/*for (Map.Entry<OtherfeaturesBean, List<OtherfeaturesBean>> entry : otherfeaturesBeanMap	
				.entrySet()) {
			System.out.println("Category Code"
					+ entry.getKey().getCategoryName());
			System.out
					.println("-----------------------------------------------------");

			for (OtherfeaturesBean contr : entry.getValue()) {
				System.out.println(contr.getDescription());
					for (OtherfeaturesValueBean ov :contr.getStdOptions()) {
						System.out.println(ov.getContract());
						System.out.println(ov.getSch_Line());
						System.out.println(ov.getFedValueNext());
						
						System.out.println(ov.getModel());
						System.out.println(ov.getModelCode());
						System.out.println(ov.getManufacturerName());
						System.out.println(ov.getManufacturerName());
						
					}
				
			}
			System.out
					.println("======================================================");
		}
		
		System.out
		.println("##########################################");
		
		for (OtherfeaturesValueBean ov :otherfeaturesValueBeanList) {
			System.out.println(ov.getModel());
			System.out.println(ov.getModelCode());
			System.out.println(ov.getManufacturerName());
			System.out.println(ov.getManufacturerName());
			
		}
*/
		orderbBean.setOtherfeatureslist(otherfeaturesBeanMap);
		orderbBean.setOtherfeaturesValueBean(otherfeaturesValueBeanList);;

		// getOtherFeaturesValue

	}
	
	
	public void getReqDetail(OrderBean orderBean, UserAccountDTO user, String action){
		try{
			
			String stdItem = "";
			String buyerCode = "";
			String section = "";
			List<RequisitionsCartDTO> reqCartTempList = new ArrayList<RequisitionsCartDTO>();
			List<String> optList = new ArrayList<String>();
			orderBean.setAction(action);
			
			//get all states
			if(orderBean.getStateList() == null || orderBean.getStateList().size() < 1){
				orderBean.setStateList(orderDAO.fetchStates());
			}
			
			//contr_line/model
			List<ReqDetailCombinedDTO> contrLineModelList = new ArrayList<ReqDetailCombinedDTO>();
			contrLineModelList = orderDAO.fetchContrLineModel(orderBean.getReqCart());
			if(contrLineModelList != null && contrLineModelList.size() > 0){
				orderBean.setModel(contrLineModelList.get(0).getModel());
				orderBean.setGroupDUNS(contrLineModelList.get(0).getModel_groupduns_groupduns());
				orderBean.setDealerFlag(contrLineModelList.get(0).getVeh_type_dealer_flag());
				orderBean.setAllowOrdering(contrLineModelList.get(0).getContr_line_allow_ordering());		
				buyerCode = contrLineModelList.get(0).getBuyer_code();
				section = contrLineModelList.get(0).getStd_item_section();
			}
			
			if(action.equalsIgnoreCase("Add")){	
				stdItem = orderBean.getReqCart().getStdItem();
				orderBean.getReqCart().setGroupCode("00001");
				orderBean.getReqCart().setSection(section);
				orderBean.getReqCart().setSequence(0.0);
				
				//get veh_color
				orderBean.getReqCart().setVehColor(vehicleColorString(orderBean.getReqCartColorList(), orderBean.getModelColorList()));
				
				//populate message line and split
				setMessageLine(orderBean);
				
				//get and load std item description into non_std_desc
				List<StdItemDTO> stdItemDTO = orderDAO.fetchStdItem(stdItem);
				if(stdItemDTO != null && stdItemDTO.size() > 0){
					orderBean.getReqCart().setNonStdDesc(stdItemDTO.get(0).getDescription());
				}
				
				//get Julian date
				Calendar calInstance = Calendar.getInstance();
				Integer year = calInstance.get(Calendar.YEAR);
				String yearString = year.toString();
				Integer dayOfYear = calInstance.get(Calendar.DAY_OF_YEAR);
				String dayOfYearString = dayOfYear.toString();
				if(dayOfYearString.length() == 1){
					dayOfYearString = "00" + dayOfYearString;
				}
				else if(dayOfYearString.length() == 2){
					dayOfYearString = "0" + dayOfYearString;
				}
				String julianNow = yearString.substring(3) + dayOfYear.toString();
				orderBean.getReqCart().setFedMilReq2(julianNow);
				
				orderBean.getReqCart().setBillAddLine1("GSA,Accounts Payable (BCEB)");
				orderBean.getReqCart().setBillAddLine2("1500 Bannister Rd.");
				orderBean.getReqCart().setBillAddLine3("PO Box 419018");
				orderBean.getReqCart().setBillAddLine4("");
				orderBean.getReqCart().setBillAddCountry("USA");
				orderBean.getReqCart().setBillAddCity("Kansas City");
				orderBean.getReqCart().setBillAddState("MO");
				orderBean.getReqCart().setBillAddZip("64141");
				orderBean.getReqCart().setBillAddZipSfx("");
								
				//load req cart
				reqCartTempList = orderDAO.fetchReqCart(user.getAgencyCode(), user.getBureauCode(), user.getUserID(), 0, action);				
				if(reqCartTempList != null && reqCartTempList.size() > 0){
					RequisitionsCartDTO reqCartTemp = reqCartTempList.get(0);
					orderBean.getReqCart().setReqAddLine1(reqCartTemp.getReqAddLine1());
					orderBean.getReqCart().setReqAddLine2(reqCartTemp.getReqAddLine2());
					orderBean.getReqCart().setReqAddLine3(reqCartTemp.getReqAddLine3());
					orderBean.getReqCart().setReqAddLine4(reqCartTemp.getReqAddLine4());
					orderBean.getReqCart().setReqAddCountry(reqCartTemp.getReqAddCountry());
					orderBean.getReqCart().setReqAddCity(reqCartTemp.getReqAddCity());
					orderBean.getReqCart().setReqAddState(reqCartTemp.getReqAddState());
					orderBean.getReqCart().setReqAddZip(reqCartTemp.getReqAddZip());
					orderBean.getReqCart().setReqAddZipSfx(reqCartTemp.getReqAddZipSfx());
					orderBean.getReqCart().setConAddLine1(reqCartTemp.getConAddLine1());
					orderBean.getReqCart().setConAddLine2(reqCartTemp.getConAddLine2());
					orderBean.getReqCart().setConAddLine3(reqCartTemp.getConAddLine3());
					orderBean.getReqCart().setConAddLine4(reqCartTemp.getConAddLine4());
					orderBean.getReqCart().setConAddCountry(reqCartTemp.getConAddCountry());
					orderBean.getReqCart().setConAddCity(reqCartTemp.getConAddCity());
					orderBean.getReqCart().setConAddState(reqCartTemp.getConAddState());
					orderBean.getReqCart().setConAddZip(reqCartTemp.getConAddZip());
					orderBean.getReqCart().setConAddZipSfx(reqCartTemp.getConAddZipSfx());
					orderBean.getReqCart().setMailAddLine1(reqCartTemp.getMailAddLine1());
					orderBean.getReqCart().setMailAddLine2(reqCartTemp.getMailAddLine2());
					orderBean.getReqCart().setMailAddLine3(reqCartTemp.getMailAddLine3());
					orderBean.getReqCart().setMailAddLine4(reqCartTemp.getMailAddLine4());
					orderBean.getReqCart().setMailAddCountry(reqCartTemp.getMailAddCountry());
					orderBean.getReqCart().setMailAddCity(reqCartTemp.getMailAddCity());
					orderBean.getReqCart().setMailAddState(reqCartTemp.getMailAddState());
					orderBean.getReqCart().setMailAddZip(reqCartTemp.getMailAddZip());
					orderBean.getReqCart().setMailAddZipSfx(reqCartTemp.getMailAddZipSfx());
					orderBean.getReqCart().setPriority(reqCartTemp.getPriority());
					orderBean.getReqCart().setConEmailAdd(reqCartTemp.getConEmailAdd());
					orderBean.getReqCart().setConFaxIntl(reqCartTemp.getConFaxIntl());
					orderBean.getReqCart().setConFaxNum(reqCartTemp.getConFaxNum());
					orderBean.getReqCart().setReqEmailAdd(reqCartTemp.getReqEmailAdd());
					orderBean.getReqCart().setReqFaxIntl(reqCartTemp.getReqFaxIntl());
					orderBean.getReqCart().setReqFaxNum(reqCartTemp.getReqFaxNum());         
					orderBean.getReqCart().setRemarks(reqCartTemp.getRemarks()); 
					orderBean.getReqCart().setAgencyOnBehalf(reqCartTemp.getAgencyOnBehalf()); 
					orderBean.getReqCart().setBureauOnBehalf(reqCartTemp.getBureauOnBehalf()); 
					orderBean.getReqCart().setTas(reqCartTemp.getTas()); 					 
				}
				
			}
			else if(action.equalsIgnoreCase("Edit")){
				reqCartTempList = orderDAO.fetchReqCart(user.getAgencyCode(), user.getBureauCode(), user.getUserID(), 0, action);	
				if(reqCartTempList != null && reqCartTempList.size() > 0){
					orderBean.setReqCart(reqCartTempList.get(0));
				}
				
				if(orderBean.getAllowOrdering().equals("N") && orderBean.isCnsFound()){
					List<GroupDunsDealerLocDTO> dealerInfo = orderDAO.fetchDealerInfo(orderBean.getModel(), orderBean.getGroupDUNS(), orderBean.getReqCart().getDealerCode());
					if(dealerInfo != null && dealerInfo.size() > 0){
						orderBean.setDealerInfo(dealerInfo.get(0));
					}
				}
				
				//load option file cart		
				orderBean.setOptFileCartList(orderDAO.fetchOptFileCartTable(orderBean.getReqCart().getCaseNumber()));
				
				//load req cart color
				//orderBean.setReqCartColorList(orderDAO.fetchReqCartColorTable(orderBean.getReqCart().getCaseNumber()));
				
				//load req just
				/*
				List<RequisitionsJustDTO> tempReqJust = orderDAO.fetchReqJustTable(orderBean.getReqCart().getCaseNumber());
				if(tempReqJust != null && tempReqJust.size() > 0){
					orderBean.setReqJust(tempReqJust.get(0));
				}
				*/
			}
			
			if(!action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setAgencyCode(user.getAgencyCode()); 
				orderBean.getReqCart().setBureauCode(user.getBureauCode());
			}
			
			orderBean.getReqCart().setBuyerCode(buyerCode);
			
			//load Opt File cart String list and check for CNS
			for(OptionFileCartDTO optCodeDTO : orderBean.getOptFileCartList()){
				optList.add(optCodeDTO.getOption_Code());
				if(optCodeDTO.getOption_Code().equals("CNS")){
					orderBean.setCnsFound(true);
				}
			}
			
			//export code
			List<OptionsCategoryDTO> optCatList = orderDAO.fetchOptCatExDelDDR(optList);
			if(optCatList != null && optCatList.size() > 0){
				for(OptionsCategoryDTO optCat : optCatList){
					if(optCat.getCategoryCode().equalsIgnoreCase("ExDel")){
						orderBean.setExDelFound(true);
						orderBean.getReqCart().setExportCode("F");//really just for Add only but will get overwritten for Edit anyway
					}
					else if(optCat.getCategoryCode().equalsIgnoreCase("DDR")){
						orderBean.setDdrFound(true);
						orderBean.getReqCart().setExportCode("N");
					}
				}
			}
						
			//agbu on behalf and dod
			List<AgBuTableDTO> agBuList = orderDAO.fetchAgBuTable(user.getAgencyCode(), user.getBureauCode());
			if(agBuList != null && agBuList.size() > 0){
				orderBean.setAgBu(agBuList.get(0));
				if(orderBean.getAgBu().getAgbuOnBehalf().trim().length() > 0){
					StringTokenizer st = new StringTokenizer(orderBean.getAgBu().getAgbuOnBehalf().trim(), ",");
					String tempString = "";
					List<String> agBuOnBehalfList = new ArrayList<String>();
					while (st.hasMoreElements()) {
						tempString = (String)st.nextElement();
						agBuOnBehalfList.add(tempString.trim());
					}
					List<AgBuTableDTO> onBehalfList = orderDAO.fetchAgBuOnBehalf(agBuOnBehalfList);
					if(onBehalfList != null && onBehalfList.size() > 0){
						AgBuTableDTO tempAgBu = new AgBuTableDTO();
						tempAgBu.setCombinedCode(" ");
						tempAgBu.setCodeNameDisplay(" ");
						onBehalfList.add(0,tempAgBu);
						orderBean.setAgBuOnBehalfList(onBehalfList);
					}
				}
				if(orderBean.getAgBu().getDod().equals("Y")){
					orderBean.setDod(true);
				}
				else{
					orderBean.setDod(false);
				}
			}
			
			//dealer location list
			if(!orderBean.getDealerFlag().equals("N") || !orderBean.isCnsFound()){
				List<ReqDetailCombinedDTO> dealerLocTemp = getDealerLocationList(orderBean);
				if(dealerLocTemp != null && dealerLocTemp.size() > 0){
					
					//create JSON object for Dealer Info
					StringBuffer sb = new StringBuffer();
					sb.append("{\"bindings\": ");
					sb.append(JSONValue.toJSONString(dealerLocTemp));
					sb.append("}");
					orderBean.setDealerInfoJSON(sb.toString());
					
					//set dealer info
					if(action.equalsIgnoreCase("Edit") && orderBean.getReqCart().getDealerCode() != null && orderBean.getReqCart().getDealerCode().length() > 0){
						for(ReqDetailCombinedDTO dto : dealerLocTemp){
							if(dto.getGroupduns_dealer_loc_dealer_code().equals(orderBean.getReqCart().getDealerCode())){
								orderBean.getDealerInfo().setDealerName(dto.getGroupduns_dealer_loc_dealer_name());
								orderBean.getDealerInfo().setStreet(dto.getGroupduns_dealer_loc_dealer_street());
								orderBean.getDealerInfo().setCity(dto.getGroupduns_dealer_loc_dealer_city());
								orderBean.getDealerInfo().setState(dto.getGroupduns_dealer_loc_dealer_state());
								orderBean.getDealerInfo().setZipCode(dto.getGroupduns_dealer_loc_dealer_zip());
								orderBean.getDealerInfo().setTelephone(dto.getGroupduns_dealer_loc_dealer_telephone());
								break;
							}
						}
					}
				}
			}
			
			//signal code list - A,B,C,J,K,L
			orderBean.getSignalCodeList().add("A");
			orderBean.getSignalCodeList().add("B");
			orderBean.getSignalCodeList().add("C");
			orderBean.getSignalCodeList().add("J");
			orderBean.getSignalCodeList().add("K");
			orderBean.getSignalCodeList().add("L");
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Retrieve Requisition Detail failed: " + ex.getMessage());
		}
	}
	
	public void setMessageLine(OrderBean orderBean){
		StringBuffer msgLine1 = new StringBuffer();
		StringBuffer msgLine2 = new StringBuffer();
		StringBuffer tempOpt = new StringBuffer();
		int msgSwitch = 1;
		boolean first = true;
		try{
			first = true;
			for(OptionFileCartDTO optCodeDTO : orderBean.getOptFileCartList()){
				if(optCodeDTO.getValidQty().equals("O") || optCodeDTO.getValidQty().equals("V")){
					tempOpt.setLength(0);
					if(first){
						first = false;
					}
					else{
						tempOpt.append(",");
					}						
					tempOpt.append(optCodeDTO.getOption_Code().trim());
					tempOpt.append("(");
					tempOpt.append(Integer.toString(optCodeDTO.getQty()));
					tempOpt.append(")");
					if(msgSwitch != 0){
						if(msgSwitch == 1){
							if((msgLine1.length() + tempOpt.length()) < 35){
								msgLine1.append(tempOpt);
							}
							else{
								msgSwitch = 2;
								first = false;
							}
						}
						if(msgSwitch == 2){
							if((msgLine2.length() + tempOpt.length()) < 35){
								msgLine2.append(tempOpt);
							}
							else{
								msgSwitch = 0;
							}
						}
					}
					else{
						break;
					}
				}					
			}
			if(orderBean.getOptFileCartList().size() > 18){
				int optCount = 1;
				for(OptionFileCartDTO optCodeDTO : orderBean.getOptFileCartList()){
					if(!optCodeDTO.getValidQty().equals("O") && !optCodeDTO.getValidQty().equals("V")){
						if(optCount > 18){
							tempOpt.setLength(0);
							if(first){
								first = false;
							}
							else{
								tempOpt.append(",");
							}						
							tempOpt.append(optCodeDTO.getOption_Code().trim());
							if(msgSwitch != 0){
								if(msgSwitch == 1){
									if((msgLine1.length() + tempOpt.length()) < 35){
										msgLine1.append(tempOpt);
									}
									else{
										msgSwitch = 2;
										first = false;
									}
								}
								if(msgSwitch == 2){
									if((msgLine2.length() + tempOpt.length()) < 35){
										msgLine2.append(tempOpt);
									}
									else{
										msgSwitch = 0;
									}
								}
							}
							else{
								break;
							}
						}
						optCount++;
					}
					
				}
			}
			if(msgLine1.length() > 0){
				orderBean.getReqCart().setMessageLine1(msgLine1.toString());
			}
			if(msgLine2.length() > 0){
				orderBean.getReqCart().setMessageLine2(msgLine2.toString());
			}
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Set Requisition Detail Message Lines failed: " + ex.getMessage());
		}
	}


	// list of federal minimum option list 
	public void getStdItemVerbiage(String stdItem) {
			
			{ 
			    // retrieving std item verbiage will done once only until new std item has selected
			    minimumBean.setStdItemVerbiageList(orderDAO.getStdItemVerbiageRecordsList(stdItem));
	            //replace the ascii code 13 with break <br> for displaying properly
			 	for (StdItemVerbiageDTO dto :minimumBean.getStdItemVerbiageList()){
			 		String row =""; 
			 		for ( int i = 0; i < dto.getDescription().length(); ++i ){
			 		  char c =  dto.getDescription().charAt(i);
			 		  int j = (int) c;
			 		  if (j == 13) { 
			 		     row = row + "<BR>"; 
			 		  }
			 		  else {
			  		     row = row + c;
			 		  }
			 		}	
			 	    dto.setDescription(row);
			 	}
				
			}
	}
	
	public Integer getMaxCaseNumber(OrderBean orderBean) throws Exception{
		Integer returnValue = 0;
		try{			
			returnValue = orderDAO.fetchReqCartMaxCase().get(0).getCaseNumber();			
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error retrieving max case number: " + ex.getMessage());
			throw ex;
		}
		return returnValue;
	}
	
	public void setReqCart(OrderBean orderBean) throws Exception{
		try{			
			orderDAO.saveReqCart(orderBean.getReqCart());			
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error updating Requsitions Cart: " + ex.getMessage());			
		}
	}
	
	public void setNewOrderDetails(OrderBean orderBean, UserAccountDTO user) throws Exception{
		try{
			orderDAO.saveNewOrderDetails(orderBean, user);
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error saving new requisition: " + ex.getMessage());
			throw ex;
		}
	}

	
	public String validateReq(OrderBean orderBean, String action, UserAccountDTO user){
		CommonDAO commonDAO = new CommonDAO();
		List<String> states = new ArrayList<String>();
		StringBuffer errorBuff = new StringBuffer();
		try{
			//State Zip validation
			RequisitionsCartDTO reqCartDTO = orderBean.getReqCart();
			if(reqCartDTO.getMailAddState().trim().length() > 0 && !reqCartDTO.getMailAddState().trim().equals("XX")){
				states.add(reqCartDTO.getMailAddState().trim());
			}
			if(reqCartDTO.getReqAddState().trim().length() > 0 && !reqCartDTO.getReqAddState().trim().equals("XX")){
				states.add(reqCartDTO.getReqAddState().trim());
			}
			if(reqCartDTO.getConAddState().trim().length() > 0 && !reqCartDTO.getConAddState().trim().equals("XX")){
				states.add(reqCartDTO.getConAddState().trim());
			}
			if(states.size() > 0){				
				List<StatesZipDTO> stateZip = commonDAO.fetchStateZipList(states);
				if(stateZip != null && stateZip.size() > 0){
					boolean stateFound = false;
					if(reqCartDTO.getMailAddState().trim().length() > 0 && !reqCartDTO.getMailAddState().trim().equals("XX")){
						for(StatesZipDTO stateDTO : stateZip){
							if(stateDTO.getState().equals(reqCartDTO.getMailAddState().trim()) && 
									stateDTO.getZip().equals(reqCartDTO.getMailAddZip())){
								stateFound = true;
								break;
							}
						}
						if(!stateFound){
							errorBuff.append("<br>Mailing Address Zip Code is invalid");
						}
					}
					stateFound = false;
					if(reqCartDTO.getReqAddState().trim().length() > 0 && !reqCartDTO.getReqAddState().trim().equals("XX")){
						for(StatesZipDTO stateDTO : stateZip){
							if(stateDTO.getState().equals(reqCartDTO.getReqAddState().trim()) && 
									stateDTO.getZip().equals(reqCartDTO.getReqAddZip())){
								stateFound = true;
								break;
							}
						}
						if(!stateFound){
							errorBuff.append("<br>Requisition Address Zip Code is invalid");
						}
					}
					stateFound = false;
					if(reqCartDTO.getConAddState().trim().length() > 0 && !reqCartDTO.getConAddState().trim().equals("XX")){
						for(StatesZipDTO stateDTO : stateZip){
							if(stateDTO.getState().equals(reqCartDTO.getConAddState().trim()) && 
									stateDTO.getZip().equals(reqCartDTO.getConAddZip())){
								stateFound = true;
								break;
							}
						}
						if(!stateFound){
							errorBuff.append("<br>Consignee Address Zip Code is invalid");
						}
					}
				}
			}
			
			//check Req Cart for previous record
			List<RequisitionsCartDTO> reqCart = orderDAO.fetchReqCartReqNumber(orderBean.getReqCart());
			if(reqCart != null && reqCart.size() > 0){
				if(action.equalsIgnoreCase("Add")){
					errorBuff.append("<br>Requisition Number has already been placed for order");
				}
				else if(action.equalsIgnoreCase("Edit")){
					if(!reqCart.get(0).getCaseNumber().equals(orderBean.getReqCart().getCaseNumber())){
						errorBuff.append("<br>Requisition Number has already been assigned to a previous order");
					}					
				}
			}			
			
			//check Requisitions table for previous record
			List<RequisitionsDTO> req = orderDAO.fetchReqReqNumber(orderBean.getReqCart());
			if(req != null && req.size() > 0){
				errorBuff.append("<br>Requisition Number has already been placed for order");
			}
			
			//check BOAC
			checkBOAC(orderBean.getReqCart(), errorBuff, user);
			
			//check delivery
			String usaCont = "";
			for(StatesDTO state : orderBean.getStateList()){
				if(state.getState().equals(orderBean.getReqCart().getConAddState())){
					usaCont = state.getUsaCont();
					break;
				}
			}
			if(orderBean.isExDelFound() && (!usaCont.equals("N") || !orderBean.getReqCart().getExportCode().equals("F"))){
				errorBuff.append("<br>Export Deliver option requires delivery outside the continental U.S.");
			}
			if(orderBean.isDdrFound() && (!usaCont.equals("N") || !orderBean.getReqCart().getExportCode().equals("N"))){
				errorBuff.append("<br>Dealer Delivery option requires delivery outside the continental U.S.");
			}
			if(!orderBean.isExDelFound() && !orderBean.isDdrFound() && usaCont.equals("N")){
				errorBuff.append("<br>Delivery outside the Continental US requires the selection of an option under 'Export Delivery' or 'Dealer Delivery' (for example, 1611 or DDRH).");
			}			
			
		}
		catch(Exception ex) {
			errorBuff.append("<br>Validation error: ");
			errorBuff.append(ex.toString());
		}
		return errorBuff.toString();
	}
	
	public String vehicleColorString(List<RequisitionsCartColorDTO> reqCartColorList, List<ModelColorDTO> modelColorList){
		StringBuffer withDesc = new StringBuffer();
		StringBuffer withoutDesc = new StringBuffer();
		String returnValue = "";
		boolean first = true;
		try{
			for(RequisitionsCartColorDTO cartColor : reqCartColorList){
				if(first){
					first = false;
				}
				else{
					withDesc.append(",");
					withoutDesc.append(",");
				}				
				for(ModelColorDTO modelColor : modelColorList){
					if(modelColor.getColor_Code().equals(cartColor.getColor_Code())){
						withDesc.append(String.valueOf(cartColor.getQuantity()));
						withDesc.append("=");
						withDesc.append(modelColor.getColor_Code());
						withDesc.append("=");
						withDesc.append(modelColor.getDescription());
						withoutDesc.append(String.valueOf(cartColor.getQuantity()));
						withoutDesc.append("=");
						withoutDesc.append(modelColor.getColor_Code());
						break;
					}
				}
			}
			if(withDesc.length() > 60){
				returnValue = withDesc.toString();
			}
			else{
				if(withoutDesc.length() > 60){
					returnValue = withoutDesc.toString().substring(0,60);
				}
				else{
					returnValue = withoutDesc.toString();
				}				
			}
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error setting vehicle color: " + ex.getMessage());			
		}
		return returnValue; 
			
	}
	
	public List<ReqDetailCombinedDTO> getDealerLocationList(OrderBean orderBean){
		List<ReqDetailCombinedDTO> dealerLocList = new ArrayList<ReqDetailCombinedDTO>();
		try{			
			dealerLocList = orderDAO.fetchGroupDUNSDealerLocation(orderBean.getGroupDUNS(), orderBean.getModel());
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error getting Dealer Location Lists: " + ex.getMessage());			
		}
		return dealerLocList;
	}
	
	public void setReqDetail(OrderBean orderBean, OrderBean orderRequest, CommonBean commonBean, String action){
		
		try{
			boolean passValidation = false;
			Integer caseNumInt = 0;
			RequisitionsCartDTO formReq = orderRequest.getReqCart();
			
			//load form fields
			orderBean.getReqCart().setUserUpdated(commonBean.getUserAccount().getUserID());
			orderBean.getReqCart().setLastUpdatedDate(UtilsLib.getCurrentTS());			
			orderBean.getReqCart().setAgencyOrderNo(formReq.getAgencyOrderNo().toUpperCase());
			orderBean.getReqCart().setFedMilReq1(formReq.getFedMilReq1());
			orderBean.getReqCart().setFedMilReq2(formReq.getFedMilReq2());
			orderBean.getReqCart().setFedMilReq3(formReq.getFedMilReq3());
			if(orderBean.getAgBuOnBehalfList() != null && 
					orderBean.getAgBuOnBehalfList().size() > 0 && 
					formReq.getAgBuOnBehalf().length() == 4){
				orderBean.getReqCart().setAgencyOnBehalf(formReq.getAgBuOnBehalf().substring(0,2));
				orderBean.getReqCart().setBureauOnBehalf(formReq.getAgBuOnBehalf().substring(2,4));
			}
			orderBean.getReqCart().setFedMilSignal(formReq.getFedMilSignal());
			orderBean.getReqCart().setFedMilSupAdd(formReq.getFedMilSupAdd());
			orderBean.getReqCart().setServiceCode(formReq.getServiceCode());
			orderBean.getReqCart().setFedMilFund(formReq.getFedMilFund());
			orderBean.getReqCart().setFundAg(formReq.getFundAg());
			orderBean.getReqCart().setFundOff(formReq.getFundOff());
			orderBean.getReqCart().setAddFund(formReq.getAddFund());
			orderBean.getReqCart().setEstUnitPrice(formReq.getEstUnitPrice());
			if(!action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setTotUnitPrice(formReq.getEstUnitPrice());
			}
			orderBean.getReqCart().setExportCode(formReq.getExportCode());				
			if(commonBean.getUserAccount().getAgencyCode().equals("17") ||
					commonBean.getUserAccount().getAgencyCode().equals("21") ||
					commonBean.getUserAccount().getAgencyCode().equals("57")){
				orderBean.getReqCart().setNsn(formReq.getNsn());
				orderBean.getReqCart().setRegistrationNum(formReq.getRegistrationNum());
				orderBean.getReqCart().setMarkFor(formReq.getMarkFor());
				orderBean.getReqCart().setAcrn(formReq.getAcrn());
			}
			if(commonBean.getUserAccount().getAgencyCode().equals("17")){
				orderBean.getReqCart().setTcn(formReq.getTcn());
			}
			orderBean.getReqCart().setMessageLine4(formReq.getMessageLine4());
			orderBean.getReqCart().setMessageLine5(formReq.getMessageLine5());
			orderBean.getReqCart().setPriority(formReq.getPriority());
			if(!commonBean.getUserAccount().getFlg1122().equals("Y")){
				orderBean.getReqCart().setTas(formReq.getTas().toUpperCase());
			}
			orderBean.getReqCart().setRemarks(formReq.getRemarks());
			orderBean.getReqCart().setDealerCode(formReq.getDealerCode());				   
			orderBean.getReqCart().setReqAddLine1(formReq.getReqAddLine1());
			orderBean.getReqCart().setReqAddLine2(formReq.getReqAddLine2());
			orderBean.getReqCart().setReqAddLine3(formReq.getReqAddLine3());
			orderBean.getReqCart().setReqAddLine4(formReq.getReqAddLine4());
			orderBean.getReqCart().setReqAddCity(formReq.getReqAddCity());
			orderBean.getReqCart().setReqAddState(formReq.getReqAddState());
			orderBean.getReqCart().setReqAddZip(formReq.getReqAddZip());
			orderBean.getReqCart().setReqAddZipSfx(formReq.getReqAddZipSfx());
			orderBean.getReqCart().setReqAddCountry(formReq.getReqAddCountry());
			orderBean.getReqCart().setReqEmailAdd(formReq.getReqEmailAdd().trim());
			orderBean.getReqCart().setReqFaxIntl(formReq.getReqFaxIntl());						   
			orderBean.getReqCart().setReqFaxNum(formReq.getReqFaxNum().trim());
			orderBean.getReqCart().setMailAddLine1(formReq.getMailAddLine1());
			orderBean.getReqCart().setMailAddLine2(formReq.getMailAddLine2());
			orderBean.getReqCart().setMailAddLine3(formReq.getMailAddLine3());
			orderBean.getReqCart().setMailAddLine4(formReq.getMailAddLine4());
			orderBean.getReqCart().setMailAddCity(formReq.getMailAddCity());
			orderBean.getReqCart().setMailAddState(formReq.getMailAddState());
			orderBean.getReqCart().setMailAddZip(formReq.getMailAddZip());
			orderBean.getReqCart().setMailAddZipSfx(formReq.getMailAddZipSfx());
			orderBean.getReqCart().setMailAddCountry(formReq.getMailAddCountry());
			orderBean.getReqCart().setConAddLine1(formReq.getConAddLine1());
			orderBean.getReqCart().setConAddLine2(formReq.getConAddLine2());
			orderBean.getReqCart().setConAddLine3(formReq.getConAddLine3());
			orderBean.getReqCart().setConAddLine4(formReq.getConAddLine4());
			orderBean.getReqCart().setConAddCity(formReq.getConAddCity());
			orderBean.getReqCart().setConAddState(formReq.getConAddState());
			orderBean.getReqCart().setConAddZip(formReq.getConAddZip());
			orderBean.getReqCart().setConAddZipSfx(formReq.getConAddZipSfx());
			orderBean.getReqCart().setConAddCountry(formReq.getConAddCountry());
			orderBean.getReqCart().setConEmailAdd(formReq.getConEmailAdd().trim());
			orderBean.getReqCart().setConFaxIntl(formReq.getConFaxIntl());
			orderBean.getReqCart().setConFaxNum(formReq.getConFaxNum().trim());		
			orderBean.getReqCart().setBillAddLine1("GSA,Accounts Payable (BCEB)");
			orderBean.getReqCart().setBillAddLine2("1500 Bannister Rd.");
			orderBean.getReqCart().setBillAddLine3("PO Box 419018");
			orderBean.getReqCart().setBillAddLine4("");
			orderBean.getReqCart().setBillAddCountry("USA");
			orderBean.getReqCart().setBillAddCity("Kansas City");
			orderBean.getReqCart().setBillAddState("MO");
			orderBean.getReqCart().setBillAddZip("64141");
			orderBean.getReqCart().setBillAddZipSfx("");
			orderBean.getReqCart().setBoac(formReq.getBoac());	
			
			if(action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setRecalcFlag("");
			}
			else{
				orderBean.getReqCart().setReceivedDate(UtilsLib.getCurrentTS());
				orderBean.getReqCart().setPurchDesNo(" ");
				orderBean.getReqCart().setCreatedBy(commonBean.getUserAccount().getUserID());
			}
			
			//set allow ordering
			orderBean.getReqCart().setAllowOrdering(orderBean.getContrLineDTO().getAllowOrder());
			
			//status check
			if(action.equals("Incomplete")){
				orderBean.getReqCart().setStatus("3");
			}
			else if(action.equals("Add")){
				orderBean.getReqCart().setStatus("0");
			}
			
			if(!action.equalsIgnoreCase("Edit")){
				//get new case number
				caseNumInt = (getMaxCaseNumber(orderBean) + 1);
				orderBean.getReqCart().setCaseNumber(caseNumInt);
			}
			
			if(!action.equalsIgnoreCase("Incomplete")){		
				//validation
				String validationReturn = validateReq(orderBean, action, commonBean.getUserAccount());
				if(validationReturn.length() < 1){
					passValidation = true;
				}
				else{
					orderBean.setReturnMessage(validationReturn);
				}
			}
			
			if(action.equalsIgnoreCase("Incomplete") || 
					(!action.equalsIgnoreCase("Incomplete") && passValidation)){
				if(!action.equalsIgnoreCase("Edit")){	
					//opt file cart, req cart color, req just, req cart -- all in one block to roll back if necessary
					setNewOrderDetails(orderBean, commonBean.getUserAccount());
				}
				else{//is Edit
					//update req cart
					setExistingOrderDetails(orderBean, commonBean.getUserAccount());
				}
				
				if(orderBean.getReturnMessage().trim().length() < 1){
					orderBean.setReturnMessage("Pending Order entered/updated successfully");
				}
				getReqDetail(orderBean, commonBean.getUserAccount(), "Edit");
			}
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error setting Req Detail: " + ex.getMessage());			
		}
	}
	
	public String getPortFileValue(String table, String key){
		String returnValue = "";
		try{
			PortFile port = new PortFile();
			returnValue = port.getRecord(table,key);
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error Port File Value: " + ex.getMessage());			
		}
		return returnValue;
	}
	
	public void checkBOAC(RequisitionsCartDTO reqCart, StringBuffer errorBuff, UserAccountDTO user){
		String customers = "";
		String process = "";
		String agency = "";
		try{
			if(reqCart.getFedMilReq1().length() == 6){
				customers = getPortFileValue("CAF", reqCart.getFedMilReq1());
				if(customers.length() == 6){
					//invalid BOAC
					errorBuff.append("<br>First block of Requisition Number must be a valid BOAC number");
				}
				else{
					if(customers.length() > 45){
						process = customers.substring(44,45);
						agency = customers.substring(21,23);
						if(!process.equals("Y")){
							errorBuff.append("<br>" + reqCart.getFedMilReq1() + " - is an inactive BOAC number");
						}
						
						if(!agency.equals(user.getAgencyCode())){
							errorBuff.append("<br>First block of Requisition Number doesn't belong to your agency");
						}
					}
					else{
						errorBuff.append("<br>" + "Invalid Port File return value: " + customers);
					}
				}
			}
			else{
				//invalid fed mil req 1
				errorBuff.append("<br>First block of Requisition Number must be six characters long");
			}
			
			if(reqCart.getFedMilSignal().equals("B") || reqCart.getFedMilSignal().equals("K") || 
					reqCart.getFedMilSupAdd().length() > 0){
				if(reqCart.getFedMilSupAdd().length() == 6){
					customers = getPortFileValue("CAF", reqCart.getFedMilSupAdd());
					if(customers.length() == 6){
						//invalid BOAC
						errorBuff.append("<br>Supplementary Address must be a valid BOAC number");
					}
					else{
						process = customers.substring(44,45);
						agency = customers.substring(21,23);
						if(!process.equals("Y")){
							errorBuff.append("<br>" + reqCart.getFedMilSupAdd() + " - is an inactive BOAC number");
						}
						
						if(!agency.equals(user.getAgencyCode())){
							errorBuff.append("<br>Supplementary Address doesn't belong to your agency");
						}
					}					
				}
				else{
					errorBuff.append("<br>Supplementary Address must six characters long");
				}				
			}			
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error Port File Value: " + ex.getMessage());			
		}
	}
	
	public void setExistingOrderDetails(OrderBean orderBean, UserAccountDTO user) throws Exception{
		try{
			orderDAO.saveExistingOrderDetails(orderBean, user);
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error saving existing requisition: " + ex.getMessage());
			throw ex;
		}
	}
	
	public void getReqDetailMIPR(OrderBean orderBean, UserAccountDTO user, String action){
		try{			
			String stdItem = "";
			String buyerCode = "";
			String section = "";
			List<RequisitionsCartDTO> reqCartTempList = new ArrayList<RequisitionsCartDTO>();
			List<String> optList = new ArrayList<String>();
			orderBean.setAction(action);
			
			//contr_line/model
			List<ReqDetailCombinedDTO> contrLineModelList = new ArrayList<ReqDetailCombinedDTO>();
			contrLineModelList = orderDAO.fetchContrLineModel(orderBean.getReqCart());
			if(contrLineModelList != null && contrLineModelList.size() > 0){
				orderBean.setModel(contrLineModelList.get(0).getModel());
				orderBean.setGroupDUNS(contrLineModelList.get(0).getModel_groupduns_groupduns());
				orderBean.setDealerFlag(contrLineModelList.get(0).getVeh_type_dealer_flag());
				orderBean.setAllowOrdering(contrLineModelList.get(0).getContr_line_allow_ordering());		
				buyerCode = contrLineModelList.get(0).getBuyer_code();
				section = contrLineModelList.get(0).getStd_item_section();
			}
			
			if(action.equalsIgnoreCase("Add")){	
				stdItem = orderBean.getReqCart().getStdItem();
				orderBean.getReqCart().setGroupCode("00001");
				orderBean.getReqCart().setSection(section);
				orderBean.getReqCart().setSequence(0.0);
				
				//get veh_color
				orderBean.getReqCart().setVehColor(vehicleColorString(orderBean.getReqCartColorList(), orderBean.getModelColorList()));
				
				//populate message line and split
				setMessageLine(orderBean);
				
				//get and load std item description into non_std_desc
				List<StdItemDTO> stdItemDTO = orderDAO.fetchStdItem(stdItem);
				if(stdItemDTO != null && stdItemDTO.size() > 0){
					orderBean.getReqCart().setNonStdDesc(stdItemDTO.get(0).getDescription());
				}
			}
			else if(action.equalsIgnoreCase("Edit")){
				reqCartTempList = orderDAO.fetchReqCart(user.getAgencyCode(), user.getBureauCode(), user.getUserID(), 0, action);	
				if(reqCartTempList != null && reqCartTempList.size() > 0){
					orderBean.setReqCart(reqCartTempList.get(0));
				}
				
				if(orderBean.getAllowOrdering().equals("N") && orderBean.isCnsFound()){
					List<GroupDunsDealerLocDTO> dealerInfo = orderDAO.fetchDealerInfo(orderBean.getModel(), orderBean.getGroupDUNS(), orderBean.getReqCart().getDealerCode());
					if(dealerInfo != null && dealerInfo.size() > 0){
						orderBean.setDealerInfo(dealerInfo.get(0));
					}
				}
				
				//load option file cart		
				orderBean.setOptFileCartList(orderDAO.fetchOptFileCartTable(orderBean.getReqCart().getCaseNumber()));
			}
			
			if(!action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setAgencyCode(user.getAgencyCode()); 
				orderBean.getReqCart().setBureauCode(user.getBureauCode());
			}
			
			orderBean.getReqCart().setBuyerCode(buyerCode);
			
			//load Opt File cart String list and check for CNS
			for(OptionFileCartDTO optCodeDTO : orderBean.getOptFileCartList()){
				optList.add(optCodeDTO.getOption_Code());
				if(optCodeDTO.getOption_Code().equals("CNS")){
					orderBean.setCnsFound(true);
				}
			}
			
			//export code
			List<OptionsCategoryDTO> optCatList = orderDAO.fetchOptCatExDelDDR(optList);
			if(optCatList != null && optCatList.size() > 0){
				for(OptionsCategoryDTO optCat : optCatList){
					if(optCat.getCategoryCode().equalsIgnoreCase("ExDel")){
						orderBean.setExDelFound(true);
						orderBean.getReqCart().setExportCode("F");//really just for Add only but will get overwritten for Edit anyway
					}
					else if(optCat.getCategoryCode().equalsIgnoreCase("DDR")){
						orderBean.setDdrFound(true);
						orderBean.getReqCart().setExportCode("N");
					}
				}
			}
						
			//agbu on behalf and dod
			List<AgBuTableDTO> agBuList = orderDAO.fetchAgBuTable(user.getAgencyCode(), user.getBureauCode());
			if(agBuList != null && agBuList.size() > 0){
				orderBean.setAgBu(agBuList.get(0));
				if(orderBean.getAgBu().getAgbuOnBehalf().trim().length() > 0){
					StringTokenizer st = new StringTokenizer(orderBean.getAgBu().getAgbuOnBehalf().trim(), ",");
					String tempString = "";
					List<String> agBuOnBehalfList = new ArrayList<String>();
					while (st.hasMoreElements()) {
						tempString = (String)st.nextElement();
						agBuOnBehalfList.add(tempString.trim());
					}
					List<AgBuTableDTO> onBehalfList = orderDAO.fetchAgBuOnBehalf(agBuOnBehalfList);
					if(onBehalfList != null && onBehalfList.size() > 0){
						AgBuTableDTO tempAgBu = new AgBuTableDTO();
						tempAgBu.setCombinedCode(" ");
						tempAgBu.setCodeNameDisplay(" ");
						onBehalfList.add(0,tempAgBu);
						orderBean.setAgBuOnBehalfList(onBehalfList);
					}
				}
				if(orderBean.getAgBu().getDod().equals("Y")){
					orderBean.setDod(true);
				}
				else{
					orderBean.setDod(false);
				}
			}
			
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Retrieve Requisition Detail MIPR failed: " + ex.getMessage());
		}
	}
	
	public String validateReqMIPR(OrderBean orderBean, String action, UserAccountDTO user){
		CommonDAO commonDAO = new CommonDAO();
		List<String> states = new ArrayList<String>();
		StringBuffer errorBuff = new StringBuffer();
		String statusTemp = "";
		try{
			
			//agency order number/line item check
			List<RequisitionsCartDTO> reqCart = orderDAO.fetchReqCartMIPR(orderBean.getReqCart() );			
			if(reqCart != null && reqCart.size() > 0){
				if(action.equalsIgnoreCase("Add")){
					errorBuff.append("<br>Agency Order Number and Line Item have already been placed in Pending Orders");
				}
				else if(action.equalsIgnoreCase("Edit")){
					if(!reqCart.get(0).getCaseNumber().equals(orderBean.getReqCart().getCaseNumber())){
						errorBuff.append("<br>Agency Order Number and Line Item have already been assigned to a different Pending Order");
					}					
				}
			}
			
			//check Requisitions table for previous record
			List<RequisitionsDTO> req = orderDAO.fetchReqMIPR(orderBean.getReqCart());
			if(req != null && req.size() > 0){
				errorBuff.append("<br>Agency Order Number and Line Item have already been placed for order");
			}		
		}
		catch(Exception ex) {
			errorBuff.append("<br>Validation error: ");
			errorBuff.append(ex.toString());
		}
		return errorBuff.toString();
	}
	
public void setReqDetailMIPR(OrderBean orderBean, OrderBean orderRequest, CommonBean commonBean, String action){
		
		try{
			boolean passValidation = false;
			Integer caseNumInt = 0;
			RequisitionsCartDTO formReq = orderRequest.getReqCart();
			
			//load form fields
			orderBean.getReqCart().setUserUpdated(commonBean.getUserAccount().getUserID());
			orderBean.getReqCart().setLastUpdatedDate(UtilsLib.getCurrentTS());			
			orderBean.getReqCart().setAgencyOrderNo(formReq.getAgencyOrderNo().toUpperCase());
			orderBean.getReqCart().setLineItem(formReq.getLineItem().toUpperCase());
			if(orderBean.getAgBuOnBehalfList() != null && 
					orderBean.getAgBuOnBehalfList().size() > 0 && 
					formReq.getAgBuOnBehalf().length() == 4){
				orderBean.getReqCart().setAgencyOnBehalf(formReq.getAgBuOnBehalf().substring(0,2));
				orderBean.getReqCart().setBureauOnBehalf(formReq.getAgBuOnBehalf().substring(2,4));
			}			
			orderBean.getReqCart().setAddFund(formReq.getAddFund());
			orderBean.getReqCart().setEstUnitPrice(formReq.getEstUnitPrice());
			if(!action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setTotUnitPrice(formReq.getEstUnitPrice());
			}				
			orderBean.getReqCart().setAcrn(formReq.getAcrn());
			if(commonBean.getUserAccount().getAgencyCode().equals("17")){
				orderBean.getReqCart().setTcn(formReq.getTcn());
			}
			if(!commonBean.getUserAccount().getFlg1122().equals("Y")){
				orderBean.getReqCart().setTas(formReq.getTas().toUpperCase());
			}		
			
			if(action.equalsIgnoreCase("Edit")){
				orderBean.getReqCart().setRecalcFlag("");
			}
			else{
				orderBean.getReqCart().setReceivedDate(UtilsLib.getCurrentTS());
				orderBean.getReqCart().setPurchDesNo(" ");
				orderBean.getReqCart().setCreatedBy(commonBean.getUserAccount().getUserID());
			}
			
			//set allow ordering
			orderBean.getReqCart().setAllowOrdering(orderBean.getContrLineDTO().getAllowOrder());
			
			//status check
			if(action.equals("Incomplete")){
				orderBean.getReqCart().setStatus("3");
			}
			else if(action.equals("Add")){
				orderBean.getReqCart().setStatus("0");
			}
			
			if(!action.equalsIgnoreCase("Edit")){
				//get new case number
				caseNumInt = (getMaxCaseNumber(orderBean) + 1);
				orderBean.getReqCart().setCaseNumber(caseNumInt);
			}
			
			if(!action.equalsIgnoreCase("Incomplete")){		
				//validation
				String validationReturn = validateReqMIPR(orderBean, action, commonBean.getUserAccount());
				if(validationReturn.length() < 1){
					passValidation = true;
				}
				else{
					orderBean.setReturnMessage(validationReturn);
				}
			}
			
			if(action.equalsIgnoreCase("Incomplete") || 
					(!action.equalsIgnoreCase("Incomplete") && passValidation)){
				if(!action.equalsIgnoreCase("Edit")){	
					//opt file cart, req cart color, req just, req cart -- all in one block to roll back if necessary
					setNewOrderDetails(orderBean, commonBean.getUserAccount());
				}
				else{//is Edit
					//update req cart
					setExistingOrderDetails(orderBean, commonBean.getUserAccount());
				}
				
				if(orderBean.getReturnMessage().trim().length() < 1){
					orderBean.setReturnMessage("Pending Order entered/updated successfully");
				}
				getReqDetail(orderBean, commonBean.getUserAccount(), "Edit");
			}
		}
		catch(Exception ex){
			orderBean.setReturnMessage("Error setting Req Detail: " + ex.getMessage());			
		}
	}

	public void importMIPRExcel(OrderBean orderBean, StringBuffer errorBuff) throws Exception{
		List<RequisitionsCartDTO> reqList = new ArrayList<RequisitionsCartDTO>();
	    ByteArrayInputStream bis = new ByteArrayInputStream(orderBean.getUploadFile().getBytes());
	    Workbook workbook;
	    Sheet sheet1;
	    int columnCount = 1;
	    int rowCount = 1;
	    final int TOTAL_COLUMN = 63;
	    List<String> errorList = new ArrayList<String>();
	    
	    boolean first = true;
	    try {
	        if (orderBean.getUploadFile().getOriginalFilename().endsWith("xls")) {
	            workbook = new HSSFWorkbook(bis);
	        } else if (orderBean.getUploadFile().getOriginalFilename().endsWith("xlsx")) {
	            workbook = new XSSFWorkbook(bis);            
	        } else {
	            throw new IllegalArgumentException("Received file does not have a standard excel extension.");
	        }
	        sheet1 = workbook.getSheetAt(0);
	        if(sheet1.getPhysicalNumberOfRows() < 1){
	        	errorBuff.append("<br>The loaded file does not contain any rows");
	        }
	        else{
	        	if(sheet1.getRow(0).getLastCellNum() != TOTAL_COLUMN){
	        		errorBuff.append("<br>The loaded file does not have the proper number of data columns (");
	        		errorBuff.append(String.valueOf(TOTAL_COLUMN));
	        		errorBuff.append(")");
	        	}
	        }
	        if(errorBuff.length() < 1){
		        for (Row row : sheet1) {
		        	if (row.getRowNum() != 0 && row.getRowNum() != 1) {
		        		Iterator<Cell> cellIterator = row.cellIterator();
		        		columnCount = 1;
		        		RequisitionsCartDTO reqDet = new RequisitionsCartDTO();
		        		errorList.clear();
		        		while(cellIterator.hasNext()) {
		        			Cell cell = cellIterator.next();
		        			setMIPRReqCartColumnXL(reqDet, cell, columnCount, errorList, errorBuff);		                  
		        			
		        			switch(cell.getCellType()) {
			        	        case Cell.CELL_TYPE_BOOLEAN:
			        	            System.out.print(cell.getBooleanCellValue() + "\t\t");
			        	            break;
			        	        case Cell.CELL_TYPE_NUMERIC:
			        	            System.out.print(cell.getNumericCellValue() + "\t\t");
			        	            break;
			        	        case Cell.CELL_TYPE_STRING:
			        	            System.out.print(cell.getStringCellValue() + "\t\t");
			        	            break;
		        			}
		        			columnCount++;
		        		}
		        		if(errorList != null && errorList.size() > 0){
		        			errorBuff.append("<br>Row " + String.valueOf(rowCount) + " size constraint violations with columns: ");
		        			first = true;
		        			for(String colTemp : errorList){
		        				if(first){
		        					first = false;
		        				}
		        				else{
		        					errorBuff.append(",");
		        				}
		        				errorBuff.append(colTemp);
		        			}
		        		}
		        	}
		        	rowCount++;
		        }
	        }
	
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public String setMIPRReqCartColumnXL(RequisitionsCartDTO reqDetail, Cell cell, int count, List<String> errorList, StringBuffer errorBuff){
		String temp = "";
		
		try{
			switch(count) {
		        case 1:
		        	//agency bureau
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() != 4){
		        		errorList.add("AgencyBureau");
		        	}
		        	else{
		        		reqDetail.setAgencyCode(temp.substring(0,2));
		        		reqDetail.setBureauCode(temp.substring(2,4));
		        	}
		            break;
		        case 2:
		        	//agency order number
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.length() > 20){
		        		errorList.add("AgencyOrder");
		        	}
		        	else{
		        		reqDetail.setAgencyOrderNo(temp);
		        	}
		            break;
		        case 3:
		        	//req number
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() != 14){
		        		errorList.add("ReqNumber");
		        	}
		        	else{
			        	reqDetail.setFedMilReq1(temp.substring(0,6));
			        	reqDetail.setFedMilReq2(temp.substring(6,9));
			        	reqDetail.setFedMilReq3(temp.substring(9,12));
		        	}
		            break;
		        case 4:
		        	//line item
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.length() > 6){
		        		errorList.add("LineItem");
		        	}
		        	else{
		        		reqDetail.setLineItem(temp);
		        	}
		        	break;
		        case 5:
		        	//sequence
		        	if(cell.getNumericCellValue() == 0){
		        		errorList.add("Sequence");
		        	}
		        	else{
		        		reqDetail.setSequence(cell.getNumericCellValue());
		        	}
		        	break;
		        case 6:
		        	//supp address
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() > 6){
		        		errorList.add("SuppAddress");
		        	}
		        	else{
		        		reqDetail.setFedMilSupAdd(temp);
		        	}		        	
		        	break;
		        case 7:
		        	//signal code
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.length() > 1){
		        		errorList.add("SignalCode");
		        	}
		        	else{
		        		reqDetail.setFedMilSignal(temp);
		        	}		        	
		        	break;
		        case 8:
		        	//fund code
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.length() > 2){
		        		errorList.add("FundCode");
		        	}
		        	else{
		        		reqDetail.setFedMilFund(temp);
		        	}
		        	break;
		        case 9:
		        	//Funding
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() > 1 || (!temp.equals("Y") && !temp.equalsIgnoreCase("N"))){
		        		errorList.add("Funded");
		        	}
		        	else{
		        		reqDetail.setFedMilFund(temp);
		        	}
		        	break;
		        case 10:
		        	//Funding Date
		        	break;
		        case 11:
		        	//Quantity
		        	if(cell.getNumericCellValue() < 1){
		        		errorList.add("Quantity");
		        	}
		        	else{
			        	Double qtyDouble =  cell.getNumericCellValue();
			        	Integer qty = qtyDouble.intValue();
			        	reqDetail.setQuantity(qty);
		        	}
		        	break;
		        case 12:
		        	//req name (req add line 4?)
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || (!temp.equals("Y") && !temp.equalsIgnoreCase("N"))){
		        		errorList.add("ReqAddName");
		        	}
		        	else{
		        		//reqDetail.setFedMilFund(temp);
		        	}
		        	break;
		        case 13:
		        	//req add1
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("ReqAdd1");
		        	}
		        	else{
		        		reqDetail.setReqAddLine1(temp);
		        	}
		        	break;
		        case 14:
		        	//req add2
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("ReqAdd2");
		        	}
		        	else{
		        		reqDetail.setReqAddLine2(temp);
		        	}
		        	break;
		        case 15:
		        	//req add3
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("ReqAdd3");
		        	}
		        	else{
		        		reqDetail.setReqAddLine3(temp);
		        	}
		        	break;
		        case 16:
		        	//req add city
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 20){
		        		errorList.add("ReqAddCity");
		        	}
		        	else{
		        		reqDetail.setReqAddCity(temp);
		        	}
		        	break;
		        case 17:
		        	//req add state
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.trim().length() > 2){
		        		errorList.add("ReqAddState");
		        	}
		        	else{
		        		reqDetail.setReqAddState(temp);
		        	}
		        	break;
		        case 18:
		        	//req add zip
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 5){
		        		errorList.add("ReqAddZip");
		        	}
		        	else{
		        		reqDetail.setReqAddZip(temp);
		        	}
		        	break;
		        case 19:
		        	//req add zip ext
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 4){
		        		errorList.add("ReqAddZipExt");
		        	}
		        	else{
		        		reqDetail.setReqAddZipSfx(temp);
		        	}
		        	break;
		        case 20:
		        	//req add country
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 15){
		        		errorList.add("ReqAddZipExt");
		        	}
		        	else{
		        		reqDetail.setReqAddCountry(temp);
		        	}
		        	break;
		        case 21:
		        	//req email
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.trim().length() > 50){
		        		errorList.add("ReqAddEmail");
		        	}
		        	else{
		        		reqDetail.setReqEmailAdd(temp);
		        	}
		        	break;
		        case 22:
		        	//req int fax
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 1){
		        		errorList.add("ReqIntFax");
		        	}
		        	else{
		        		reqDetail.setReqFaxIntl(temp);
		        	}
		        	break;
		        case 23:
		        	//req fax
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 20){
		        		errorList.add("ReqFax");
		        	}
		        	else{
		        		reqDetail.setReqFaxNum(temp);
		        	}
		        	break;
		        case 24:
		        	//mail add name
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("MailAddName");
		        	}
		        	else{
		        		reqDetail.setMailAddLine1(temp);
		        	}
		        	break;
		        case 25:
		        	//mail add1
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("MailAdd1");
		        	}
		        	else{
		        		reqDetail.setMailAddLine2(temp);
		        	}
		        	break;
		        case 26:
		        	//mail add2
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("MailAdd2");
		        	}
		        	else{
		        		reqDetail.setMailAddLine3(temp);
		        	}
		        	break;
		        case 27:
		        	//mail add3
		        	temp = cell.getStringCellValue().trim();
		        	if( temp.trim().length() > 35){
		        		errorList.add("MailAdd3");
		        	}
		        	else{
		        		reqDetail.setMailAddLine4(temp);
		        	}
		        	break;
		        case 28:
		        	//mail add city
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("MailAdd3");
		        	}
		        	else{
		        		reqDetail.setMailAddLine4(temp);
		        	}
		        	break;
		        case 29:
		        	//mail add state
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.trim().length() > 2){
		        		errorList.add("MailAddState");
		        	}
		        	else{
		        		reqDetail.setMailAddState(temp);
		        	}
		        	break;
		        case 30:
		        	//mail add zip
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 5){
		        		errorList.add("MailAddZip");
		        	}
		        	else{
		        		reqDetail.setMailAddZip(temp);
		        	}
		        	break;
		        case 31:
		        	//mail add zip ext
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 4){
		        		errorList.add("MailAddZipExt");
		        	}
		        	else{
		        		reqDetail.setMailAddZipSfx(temp);
		        	}
		        	break;
		        case 32:
		        	//mail add country
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 15){
		        		errorList.add("MailAddCountry");
		        	}
		        	else{
		        		reqDetail.setMailAddCountry(temp);
		        	}
		        	break;
		        case 33:
		        	//con add name
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("ConAddName");
		        	}
		        	else{
		        		reqDetail.setConAddLine1(temp);
		        	}
		        	break;
		        case 34:
		        	//con add1 
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 35){
		        		errorList.add("ConAdd1");
		        	}
		        	else{
		        		reqDetail.setConAddLine2(temp);
		        	}
		        	break;
		        case 35:
		        	//con add2
		        	temp = cell.getStringCellValue().trim();
		        	if( temp.trim().length() > 35){
		        		errorList.add("ConAdd2");
		        	}
		        	else{
		        		reqDetail.setConAddLine3(temp);
		        	}
		        	break;
		        case 36:
		        	//con add3
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("ConAdd3");
		        	}
		        	else{
		        		reqDetail.setConAddLine4(temp);
		        	}
		        	break;
		        case 37:
		        	//con add city
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 20){
		        		errorList.add("ConAddCity");
		        	}
		        	else{
		        		reqDetail.setConAddCity(temp);
		        	}
		        	break;
		        case 38:
		        	//con add state
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() < 1 || temp.trim().length() > 2){
		        		errorList.add("ConAddState");
		        	}
		        	else{
		        		reqDetail.setConAddState(temp);
		        	}
		        	break;
		        case 39:
		        	//con add zip
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 5){
		        		errorList.add("ConAddZip");
		        	}
		        	else{
		        		reqDetail.setConAddZip(temp);
		        	}
		        	break;
		        case 40:
		        	//con add zip ext
		        	cell.setCellType(Cell.CELL_TYPE_STRING);
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 4){
		        		errorList.add("ConAddZipExt");
		        	}
		        	else{
		        		reqDetail.setConAddZipSfx(temp);
		        	}
		        	break;
		        case 41:
		        	//con add country
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.length() < 1 || temp.trim().length() > 15){
		        		errorList.add("ConAddCountry");
		        	}
		        	else{
		        		reqDetail.setConAddCountry(temp);
		        	}
		        	break;
		        case 42:
		        	//con add email
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.trim().length() > 50){
		        		errorList.add("ConAddEmail");
		        	}
		        	else{
		        		reqDetail.setConEmailAdd(temp);
		        	}
		        	break;
		        case 43:
		        	//con add fax int
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 1){
		        		errorList.add("ConIntFax");
		        	}
		        	else{
		        		reqDetail.setConFaxIntl(temp);
		        	}
		        	break;
		        case 44:
		        	//con add fax
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 20){
		        		errorList.add("ConFax");
		        	}
		        	else{
		        		reqDetail.setConFaxNum(temp);
		        	}
		        	break;
		        case 45:
		        	//bill add name
		        	break;
		        case 46:
		        	//bill add1
		        	break;
		        case 47:
		        	//bill add2
		        	break;
		        case 48:
		        	//bill add3
		        	break;
		        case 49:
		        	//bill add city
		        	break;
		        case 50:
		        	//bill add state
		        	break;
		        case 51:
		        	//bill add zip
		        	break;
		        case 52:
		        	//bill add zip ext
		        	break;
		        case 53:
		        	//bill add country
		        	break;
		        case 54:
		        	//fair opportunity (upper)
		        	break;
		        case 55:
		        	//Express Desk (upper)
		        	break;
		        case 56:
		        	//Export Code
		        	temp = cell.getStringCellValue().trim().toUpperCase();
		        	if(temp.length() != 1 || (!temp.trim().equals("F") && !temp.trim().equals("N"))){
		        		errorList.add("ExportCode");
		        	}
		        	else{
		        		reqDetail.setExportCode(temp);
		        	}
		        	break;
		        case 57:
		        	//TCN
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 30){
		        		errorList.add("TCN");
		        	}
		        	else{
		        		reqDetail.setTcn(temp);
		        	}
		        	break;
		        case 58:
		        	//Mark For
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 30){
		        		errorList.add("MarkFor");
		        	}
		        	else{
		        		reqDetail.setMarkFor(temp);
		        	}
		        	break;
		        case 59:
		        	//Message Line 3
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("MessageLine3");
		        	}
		        	else{
		        		reqDetail.setMessageLine3(temp);
		        	}
		        	break;
		        case 60:
		        	//Message Line 4
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("MessageLine4");
		        	}
		        	else{
		        		reqDetail.setMessageLine4(temp);
		        	}
		        	break;
		        case 61:
		        	//Message Line 5
		        	temp = cell.getStringCellValue().trim();
		        	if(temp.trim().length() > 35){
		        		errorList.add("MessageLine5");
		        	}
		        	else{
		        		reqDetail.setMessageLine5(temp);
		        	}
		        	break;
		        case 62:
		        	//ACRN
		        	break;
		        case 63:
		        	//Filler
		        	break;		       
		        
			}
		}
		catch(Exception ex){
			errorBuff.append("<br>Error extracting cell data: " + ex.getMessage());
		}
		return "";		
	}
	
	public String processMIPRUploadFile(OrderBean orderBean){
		StringBuffer errorBuff = new StringBuffer();
	    try{
			if (orderBean.getUploadFile().getOriginalFilename().endsWith("xls") || orderBean.getUploadFile().getOriginalFilename().endsWith("xlsx")) {
				importMIPRExcel(orderBean, errorBuff);
	        } else if (orderBean.getUploadFile().getOriginalFilename().endsWith("txt")) {
	        	importMIPRText(orderBean, errorBuff);         
	        }
		
			//validate req cart row
			//populate hard coded fields
			//add to Req Cart List
			
			//get previously stored data for each Agency Order Number/Line Item combo (req cart, options, req just) and populate
	        //insert new record into req cart table
	        //change status on previous req cart records
	    }
	    catch(Exception ex){
	    	
	    }
	    return errorBuff.toString();
		
	}
	
	public void importMIPRText(OrderBean orderBean, StringBuffer errorBuff) throws Exception{
		
		//check valid file and import
		//loop through rows
		//break single row into req cart components
		//importMIPRTextControlCard(orderBean, )
		
	}
	
	public void importMIPRTextControlCard(OrderBean orderBean, String record){
		
	}
}




