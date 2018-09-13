
package gov.gsa.fas.AutoChoice.service;

import gov.gsa.fas.AutoChoice.DAO.ConflictDAO;
import gov.gsa.fas.AutoChoice.DAO.OrderDAO;
import gov.gsa.fas.AutoChoice.DAO.UserAccessDAO;
import gov.gsa.fas.AutoChoice.DTO.ConflictRequireCombineDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptCheckDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsTableDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.ConflictBean;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.beans.UserAccessBean;
import gov.gsa.fas.AutoChoice.util.EncryptSHA1;
import gov.gsa.fas.AutoChoice.util.UserException;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("request") 
public class ConflictService {


	Logger logger = Logger.getLogger(ConflictService.class.toString());
	
	@Autowired
	private ConflictDAO conflictDAO = null;
	@Autowired
	private OrderDAO orderDAO = null;
	
    private  List<ContrLineOptCheckDTO> conflictContainerCompleteList = new ArrayList<ContrLineOptCheckDTO>();


    // web services will call this	
	public void checkForOptionConflicts(String param) {
		
	   //parse here coming from  web services parameters			
	} 
	
//	// this most likely will be called by price comparison
//	public List<ContrLineOptCheckDTO> checkForOptionConflicts(OrderBean orderBean,List<ContrLineOptCheckDTO> optionsInputList, int vehicleQtyInput ) {
//	    // optionsInputList will be the input either coming form webservice or option selection screen of AutoChoice
//		
//		//int i= 0;
//	    //String optionList ="";
//	    List<String> optionList = new ArrayList<String>();
//
//		for (ContrLineOptCheckDTO inputList: optionsInputList) {
//			
//			optionList.add(inputList.getOption_Code());
////			if (i > 0) {
////				optionList. = optionList + ",";
////			}
////			optionList = optionList + "'" + inputList.getOption_Code()+"'";
////            i++;
//		}
//        List<ContrLineOptionDTO>  contrlineOptionAvailableList = null;  // contract line option contains the actual data from the database 
//        List<ContrLineOptCheckDTO> conflictContainerList = new ArrayList<ContrLineOptCheckDTO>();  //this will be the container of the collission/conflict
//        Map<String,List<ContrLineOptCheckDTO>> optionTemplateMap = new HashMap<String, List<ContrLineOptCheckDTO>>();  // template place holder     
//        
//        // initialized/create the  optionTemplateMap using Option_Code as a key
//        for (ContrLineOptCheckDTO optCheckerInput: optionsInputList){
//        	String key = optCheckerInput.getOption_Code();
//        	if(optionTemplateMap.get(key)== null){
//        		optionTemplateMap.put(key,new ArrayList<ContrLineOptCheckDTO>());
//        	}
//        }
//        
//		List<String> contract = new ArrayList<String>();
//		List<String> schLine = new ArrayList<String>();
//		
//		for (ContrLineDTO tmpOrder : orderBean.getContrLineAvailableList()) {
//			contract.add(tmpOrder.getContract());
//			schLine.add(tmpOrder.getSch_Line());
//		}
//        
//        contrlineOptionAvailableList=orderDAO.getContrLineOptionList( contract,schLine,"1",optionList);	 
//        conflictContainerList =conflictsProcess(contract,schLine,contrlineOptionAvailableList,optionsInputList,vehicleQtyInput );
//        
//		return conflictContainerList;		
//}
//



	// this most likely will be called by price comparison
	public List<ContrLineOptCheckDTO> checkForOptionConflicts(OrderBean orderBean,List<ContrLineOptCheckDTO> optionsInputList, int vehicleQtyInput ) {
	    // optionsInputList will be the input either coming form webservice or option selection screen of AutoChoice
		
		//int i= 0;
	    //String optionList ="";
	    List<String> optionList = new ArrayList<String>();

		for (ContrLineOptCheckDTO inputList: optionsInputList) {
			optionList.add(inputList.getOption_Code());
		}
        List<ContrLineOptionDTO>  contrlineOptionAvailableList = null;  // contract line option contains the actual data from the database 
        List<ContrLineOptCheckDTO> conflictContainerList = new ArrayList<ContrLineOptCheckDTO>();  //this will be the container of the collission/conflict	
        Map<String,List<ContrLineOptCheckDTO>> optionTemplateMap = new HashMap<String, List<ContrLineOptCheckDTO>>();  // template place holder     
        
        // initialized/create the  optionTemplateMap using Option_Code as a key
        for (ContrLineOptCheckDTO optCheckerInput: optionsInputList){
        	String key = optCheckerInput.getOption_Code();
        	if(optionTemplateMap.get(key)== null){
        		optionTemplateMap.put(key,new ArrayList<ContrLineOptCheckDTO>());
        	}
        }
        
		List<String> contract = new ArrayList<String>();
		List<String> schLine = new ArrayList<String>();
		
		for (ContrLineDTO tmpOrder : orderBean.getContrLineAvailableList()) {
			contract.add(tmpOrder.getContract());
			schLine.add(tmpOrder.getSch_Line());
		}
        
        contrlineOptionAvailableList=conflictDAO.getContrLineOptionList( contract,schLine,"1",optionList);	 
        conflictContainerList =conflictsProcess(contract,schLine,contrlineOptionAvailableList,optionsInputList,vehicleQtyInput );
        
		return conflictContainerList;		
}


	
	// this most likely will be called by price comparison
	public List<ContrLineOptCheckDTO> checkForOptionConflicts(String contract,String schLine,List<ContrLineOptCheckDTO> optionsInputList, int vehicleQtyInput ) {
	    // optionsInputList will be the input either coming form webservice or option selection screen of AutoChoice
		
	    List<String> optionList = new ArrayList<String>();

		for (ContrLineOptCheckDTO inputList: optionsInputList) {
			
			optionList.add(inputList.getOption_Code());
		}
        List<ContrLineOptionDTO>  contrlineOptionAvailableList = null;  // contract line option contains the actual data from the database 
        List<ContrLineOptCheckDTO> conflictContainerList = new ArrayList<ContrLineOptCheckDTO>();  //this will be the container of the collission/conflict

        Map<String,List<ContrLineOptCheckDTO>> optionTemplateMap = new HashMap<String, List<ContrLineOptCheckDTO>>();  // template place holder     
        
        // initialized/create the  optionTemplateMap using Option_Code as a key
        for (ContrLineOptCheckDTO optCheckerInput: optionsInputList){
        	String key = optCheckerInput.getOption_Code();
        	if(optionTemplateMap.get(key)== null){
        		optionTemplateMap.put(key,new ArrayList<ContrLineOptCheckDTO>());
        	}
        }
        
		List<String> contractList = new ArrayList<String>();
		List<String> schLineList = new ArrayList<String>();
		
		contractList.add(contract);
		schLineList.add(schLine);
        
        contrlineOptionAvailableList=conflictDAO.getContrLineOptionList( contractList,schLineList,"1",optionList);	 
        // this will be holding data for display
        conflictContainerList =conflictsProcess(contractList,schLineList,contrlineOptionAvailableList,optionsInputList,vehicleQtyInput );
 
        // this will be holding data for processing and will be session. during recalculate this will be session to massage and transfer to 
        conflictContainerCompleteList = conflictContainerList;
  
       // conflictsProcessDependents(conflictContainerList);
        
        
        
	return conflictContainerList;		
}

	
	
	
	



public List<ContrLineOptCheckDTO> conflictsProcess(List<String> contract,List<String> schLine,List<ContrLineOptionDTO> contrlineOptionAvailableList,List<ContrLineOptCheckDTO> optionsInputList, int vehicleQtyInput ) {
    // optionsInputList will be the input either coming form webservice or option selection screen of AutoChoice
	
    List<ContrLineOptCheckDTO> conflictContainerList = new ArrayList<ContrLineOptCheckDTO>();  //this will be the container of the collission/conflict

     
    for (ContrLineOptCheckDTO optCheckerInput: optionsInputList){ // input will search through the result query

    	// will create the inital list of the option  for N/A, Pricing and setting other values.
		// boolean found = false;
		 double optPrice =0;
		 // this are list of found options in each contract
		 for (ContrLineOptionDTO contrLineOpt: contrlineOptionAvailableList){   
			 if (contrLineOpt.getOption_Code().equals(optCheckerInput.getOption_Code())){  //cheking option found for NA,else populate 
				 ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
				 //set the value here , contrLineOptCheckerDTO is initially populated from above.
				 optPrice = 0;
				 if (contrLineOpt.getCurrUnitPrice() > 0 ) {
					 if (contrLineOpt.getValidQty().equals("O")){   // order by vehicle needs to divide the optins/vehicle qty the price
			             optPrice = (contrLineOpt.getCurrUnitPrice() * optCheckerInput.getQuantity())/vehicleQtyInput;
					 }
					 else {
			             optPrice = (contrLineOpt.getCurrUnitPrice() * optCheckerInput.getQuantity());
					 }
				 }
				 contrLineOptCheckerDTO.setContract(contrLineOpt.getContract()); // given contract from contract available list or input coming from WS
				 contrLineOptCheckerDTO.setSch_Line(contrLineOpt.getSch_Line()); // given schLine  from contract available list or input coming from WS
				 contrLineOptCheckerDTO.setChecker_Type("");
				 contrLineOptCheckerDTO.setSequence(0);        // assign  sequence for original options      
				 contrLineOptCheckerDTO.setOptOrigin("R");  //original 
				 contrLineOptCheckerDTO.setOption_Code(optCheckerInput.getOption_Code());
				 contrLineOptCheckerDTO.setOption_Checked(optCheckerInput.getOption_Code());  // user selected option, option_checked would be equal since this is the original option
				 contrLineOptCheckerDTO.setUnitPrice(optPrice);
				 contrLineOptCheckerDTO.setValidQty(contrLineOpt.getValidQty());    // setting the type of options either O or V or blank.
				 contrLineOptCheckerDTO.setQuantity(optCheckerInput.getQuantity());
				 contrLineOptCheckerDTO.setMessage("");
				 contrLineOptCheckerDTO.setStatus("");
				 contrLineOptCheckerDTO.setOptSource(optCheckerInput.getOption_Code());
				 contrLineOptCheckerDTO.setDescription(optCheckerInput.getDescription());
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 
				 contrLineOptCheckerDTO.setMpgB(contrLineOpt.getMpgB());
				 contrLineOptCheckerDTO.setMpgC(contrLineOpt.getMpgC());
				 contrLineOptCheckerDTO.setMpgH(contrLineOpt.getMpgH());
				 contrLineOptCheckerDTO.setMpgFlag(contrLineOpt.getMpgFlag());
				 contrLineOptCheckerDTO.setGramsPerMile(contrLineOpt.getGramsPerMile());
				 
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 contrLineOptCheckerDTO.setAddShipDays(contrLineOpt.getAddShipDays());
				 
				 
				 // add to list 
				 conflictContainerList.add(contrLineOptCheckerDTO);		// this will run wont have the N/A		
			 }
		 }	

    }		 
	    // add the N/A here
		 
	 for (int i =0 ; i < contract.size();i++) {
	      for (ContrLineOptCheckDTO optCheckerInput: optionsInputList){ // input will search through the result query
	    	  boolean found = false;
	    	  for ( ContrLineOptCheckDTO optionNA :  conflictContainerList){
	    		   if (contract.get(i).equals(optionNA.getContract()) && schLine.get(i).equals(optionNA.getSch_Line()) && optCheckerInput.getOption_Code().equals(optionNA.getOption_Code())){
	    			  found = true;
	    		   }  
	    	  }
	    	  if (!found){
	    		  	ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
 		    	 contrLineOptCheckerDTO.setContract(contract.get(i)); // given contract from contract available list or input coming from WS
				 contrLineOptCheckerDTO.setSch_Line(schLine.get(i)); // given schLine  from contract available list or input coming from WS
			     contrLineOptCheckerDTO.setMessage("Opt is not valid under Contr.Line "+ contrLineOptCheckerDTO.getContract() +" "+contrLineOptCheckerDTO.getSch_Line());
			     contrLineOptCheckerDTO.setOemptionType("N/A");
			     contrLineOptCheckerDTO.setChecker_Type("");
				 contrLineOptCheckerDTO.setSequence(0);        // assign  sequence for original options      
				 contrLineOptCheckerDTO.setOptOrigin("R");  //original 
				 contrLineOptCheckerDTO.setOption_Code(optCheckerInput.getOption_Code());
				 contrLineOptCheckerDTO.setOption_Checked(optCheckerInput.getOption_Code());  // user selected option, option_checked would be equal since this is the original option
				 contrLineOptCheckerDTO.setUnitPrice(0);
			//	 contrLineOptCheckerDTO.setOptSource(optCheckerInput.getOption_Code());
				 contrLineOptCheckerDTO.setStatus("3");  // for error notification
				 contrLineOptCheckerDTO.setDescription(optCheckerInput.getDescription());
				 contrLineOptCheckerDTO.setValidQty(optCheckerInput.getValidQty());
				 conflictContainerList.add(contrLineOptCheckerDTO);
						    		  
	    	  }
	    	  
	      }
	 }
		 

	return conflictContainerList;		

   }	


   // get the include  here 
   public List<ContrLineOptCheckDTO> conflictsProcessInclude(List<ContrLineOptCheckDTO> conflictContainerList ) {
	   //conflictContainerList will be the original input with their amount, N/A value etc..
       List <ContrLineOptCheckDTO> contrLineOptCheckList = new ArrayList<ContrLineOptCheckDTO>();
       String contract ="";
       String schLine  ="";
       String checkerType = "";
       String sqlFlag="";
  
 	   List<String> optionCheckedList = new ArrayList<String>();
 	    
       for (ContrLineOptCheckDTO optChecker: conflictContainerList){ // will search excluding the N/A
     	   if (!optChecker.getOemptionType().equals("N/A")){
 	    	    optionCheckedList.add(optChecker.getOption_Code());	
 	    	    contract = optChecker.getContract();  // contract and schline value  will loop with the same value
 	    	    schLine  = optChecker.getSch_Line();
            }
       }
       
   	    sqlFlag ="0";
 	    checkerType ="I";
      
        contrLineOptCheckList = conflictDAO.getContrOptionCheckerList(contract, schLine, optionCheckedList, checkerType, sqlFlag);   	
    	     
	    for (ContrLineOptCheckDTO optCheckerInclude : contrLineOptCheckList) {
					  	 ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
				    	 contrLineOptCheckerDTO.setContract(optCheckerInclude.getContract()); // given contract from contract available list or input coming from WS
						 contrLineOptCheckerDTO.setSch_Line(optCheckerInclude.getSch_Line()); // given schLine  from contract available list or input coming from WS
						 contrLineOptCheckerDTO.setOptOrigin("R");
						 contrLineOptCheckerDTO.setChecker_Type("I");
						 contrLineOptCheckerDTO.setSequence(1);      
						 contrLineOptCheckerDTO.setOption_Code(optCheckerInclude.getOption_Code());
						 contrLineOptCheckerDTO.setOption_Checked(optCheckerInclude.getOption_Checked());  // user selected option, option_checked would be equal since this is the original option
						 contrLineOptCheckerDTO.setUnitPrice(0);
						 contrLineOptCheckerDTO.setValidQty("");
						 contrLineOptCheckerDTO.setOptSource(optCheckerInclude.getOption_Code());
						 contrLineOptCheckerDTO.setQuantity(0);
						 contrLineOptCheckerDTO.setMessage("");
						 contrLineOptCheckerDTO.setOemptionType("");
						 contrLineOptCheckerDTO.setStatus(""); 
						 //add to container working area for storing collisions
					    conflictContainerCompleteList.add(contrLineOptCheckerDTO);
	     }	
	        
    	    
       	   
	return conflictContainerCompleteList;		
   }	


// get the require here 
   public List<ContrLineOptCheckDTO> conflictsProcessRequire(List<ContrLineOptCheckDTO> conflictContainerList ) {
	   //conflictContainerList will be the original input with their amount, N/A value etc..
       List <ContrLineOptCheckDTO> contrLineOptCheckRequireList = new ArrayList<ContrLineOptCheckDTO>();
       String contract ="";
       String schLine  ="";
       String checkerType = "";
       String sqlFlag="";
  
 	   List<String> optionCheckedList = new ArrayList<String>();
 	   
	  //  <!---- require----> 
	  //<!--- added the sequence to get only the Original OPTIONS selected. For getting the required ,Included doesn't need to be included 	 --->

 	    
       for (ContrLineOptCheckDTO optChecker: conflictContainerList){ // will search excluding the N/A
     	   if ((!optChecker.getOemptionType().equals("N/A")) &&  (optChecker.getSequence() == 0)) {
 	    	    optionCheckedList.add(optChecker.getOption_Code());	
 	    	    contract = optChecker.getContract();  // contract and schline value  will loop with the same value
 	    	    schLine  = optChecker.getSch_Line();
            }
       }
       
   	    sqlFlag ="0";
 	    checkerType ="R";
      
 	    //contain require list only  
        contrLineOptCheckRequireList = conflictDAO.getContrOptionCheckerList(contract, schLine, optionCheckedList, checkerType, sqlFlag);   	
    	
        List<ConflictRequireCombineDTO> requireList = new ArrayList<ConflictRequireCombineDTO>();
        ConflictRequireCombineDTO requireDTO = new ConflictRequireCombineDTO();
        
        String oldOptionCode ="";
        int oldSequence =0;
        int row = 0;   //row here is for skipping for the first record/row control
	    for (ContrLineOptCheckDTO optChecker : contrLineOptCheckRequireList) {
	          
	    	if ((!optChecker.getOption_Code().equals(oldOptionCode) || (optChecker.getSequence() != oldSequence) && row > 0 )) {
	    		requireList.add(requireDTO);
	    	} 
	    	requireDTO.setOptionCode(optChecker.getOption_Code());
	    	//requireDTO.setOptionChecked(optChecker.getOption_Checked());
	    	requireDTO.getOptionsCheckedList().add(optChecker.getOption_Checked());
	    	requireDTO.getSequenceList().add(optChecker.getSequence());
	    	requireDTO.getUnitPriceList().add(optChecker.getUnitPrice());
	    	requireDTO.setSequence(optChecker.getSequence());
	    	requireDTO.setContract(optChecker.getContract());
	    	requireDTO.setSchLine(optChecker.getContract());
	    	oldOptionCode=optChecker.getOption_Code();
	    	oldSequence=optChecker.getSequence();
	    	
    	    row++;   
	     }	
	        
	    // create a tag for those option required to be inserted. this is to consider the  OR set of require options    
	    
	    for (ConflictRequireCombineDTO reqDTO : requireList) {
	       for (String optionChecked :reqDTO.getOptionsCheckedList()) {
	    	   boolean found = false;
	    	   for (ContrLineOptCheckDTO optChecker :conflictContainerCompleteList ) {
	    		   if ((!optChecker.getOemptionType().equals("N/A")) &&  (optChecker.getSequence() == 0)) {
	    			   if (optChecker.getOption_Checked().equals(optionChecked)) {   
	    		          found = true;
	    	   		   }
	                }
	           }
	    	   if (found) {
	    		  reqDTO.getFoundList().add("Y");   // Y = found should NOT be inserted 
	    	   }
	    	   else {
	    		   reqDTO.getFoundList().add("N");  // N = for not found should be inserted
	    	   }
	        }
         }

	    int count =0; 
	    int startCounter =0;
	    int endCounter = 0;
	    row = 0;
	    oldOptionCode ="";
        
	    // loop around the sets
	    for (ConflictRequireCombineDTO reqDTO : requireList) {
	    	startCounter = count;
	      	endCounter  = 1 ;
	      	boolean isInsert = false;
	      	int nextSet = 0;
	    	if (( reqDTO.getFoundList().contains("N")) && (!reqDTO.getOptionCode().equals(oldOptionCode))){
	    	    if (count < requireList.size()){
	    	    	  nextSet = count + 1;
	    	    	  for (int count2 = 0 ; nextSet < requireList.size();count2++ ){
	    	    		  if (reqDTO.getOptionCode().equals(requireList.get(nextSet).getOptionCode())) {
	    	    			   if (requireList.get(nextSet).getFoundList().contains("N")) {
	    	    			        endCounter = count2; 
						            isInsert = true;
	    	    			   }
	    	    			   else {
	    	    				 //<!--- found in OR --->
						               count  = count2 ; 
						               endCounter = count2 -1; 
							           break;
	    	    			   }
	    	    			  
	    	    		   }
	    	    	  } 

	    	    	  String optionCode ="";
		              String  message =""; 

	    	    	  if (isInsert) {
			              if (endCounter ==  1) {
						       endCounter = startCounter; 
						  }
			              for ( int i = 0; startCounter  <=  endCounter; i++){
			            		  
					               row=0; 
					               optionCode =  requireList.get(i).getOptionCode(); 
					               boolean  found =false;

					        	   for (ContrLineOptCheckDTO optChecker :conflictContainerCompleteList ) {
						    		   if ((!optChecker.getOemptionType().equals("N/A")) &&  (optChecker.getChecker_Type() == "" && optChecker.getSequence()==0 &&
						    				      optChecker.getOptOrigin().equals("R") && optChecker.getOption_Code().equals(optionCode))) {
						    		          found = true;
						                }
						           }
					        	   
					        	   String origin = "I";				
								   if ( found) {
									   origin = "R";
								   }
									
						 	       for ( ConflictRequireCombineDTO  optChecker : requireList){  
						 	    	  ContrLineOptCheckDTO dto =  new  ContrLineOptCheckDTO();
						 	    	   for (String optionChecked : optChecker.getOptionsCheckedList()) {
						 	    		   found = false;
						 	    		   dto.setContract(optChecker.getContract());
						 	    		   dto.setContract(optChecker.getSchLine());
						 	    		   dto.setOption_Code(optChecker.getOptionCode());
						 	    		   dto.setChecker_Type("R");
						 	    		   dto.setOption_Checked(optionChecked);
						 	    		   dto.setOptOrigin(origin);
						 	    		   dto.setSequence(optChecker.getSequenceList().get(row));
						 	    		   dto.setUnitPrice(optChecker.getUnitPriceList().get(row));
						 	    		   dto.setValidQty("");
						 	    		   dto.setQuantity(0);
						 	    		   dto.setStatus("C");
						 	    		   dto.setMessage(message);
						 	    		   dto.setOemptionType("");
						 	    		   dto.setOptSource(optChecker.getOptionCode());
						 	    		   
						 	    		   // add to container /storage
						 	    		   conflictContainerCompleteList.add(dto);
						 	    		   row++;
							 	    	   	
						 	    	   }
						 	    	   
						 	       }
			              	}	
	    		
	    	            }
			 	       else  {
			 	    	   
                             if (endCounter == 1){
			 	    	          endCounter = startCounter;
                             }

   			                 for ( int i = 0; startCounter  <=  endCounter; i++){ 
					             //  int rowCount =0; 
					               optionCode =  requireList.get(i).getOptionCode(); 
					               boolean  found =false;
   			                	 
					        	   String origin = "I";				
									   if ( found) {
										   origin = "R";
									   }
							 	       for ( ConflictRequireCombineDTO  optChecker : requireList){  
								 	    	  ContrLineOptCheckDTO dto =  new  ContrLineOptCheckDTO();
								 	    	   for (String optionChecked : optChecker.getOptionsCheckedList()) {
								 	    		   found = false;
								 	    		   dto.setContract(optChecker.getContract());
								 	    		   dto.setContract(optChecker.getSchLine());
								 	    		   dto.setOption_Code(optChecker.getOptionCode());
								 	    		   dto.setChecker_Type("R");
								 	    		   dto.setOption_Checked(optionChecked);
								 	    		   dto.setOptOrigin(origin);
								 	    		   dto.setSequence(optChecker.getSequenceList().get(row));
								 	    		   dto.setUnitPrice(optChecker.getUnitPriceList().get(row));
								 	    		   dto.setValidQty("");
								 	    		   dto.setQuantity(0);
								 	    		   dto.setStatus("C");
								 	    		   dto.setMessage(message);
								 	    		   dto.setOemptionType("");
								 	    		   dto.setOptSource(optChecker.getOptionCode());
								 	    		   
								 	    		   // add to container /storage
								 	    		   conflictContainerCompleteList.add(dto);
								 	    		   row++;
									 	    	   	
								 	    	   }
								 	       }
				              	}	
		    		
			 	         }
	    	    	  
			 	   }
	    	       oldOptionCode = reqDTO.getOptionCode(); 
	        }
	    	else {
	    		  oldOptionCode = reqDTO.getOptionCode(); 
	    	}
	    
	   }	    
	 return conflictContainerCompleteList;		
   }	

   
   
// get the require also can Include another options so this would extract those options. 
   public List<ContrLineOptCheckDTO> conflictsProcessRequireIncluded() {
   
      //conflictContainerList will be the original input with their amount, N/A value etc..
       List <ContrLineOptCheckDTO> contrLineOptCheckList = new ArrayList<ContrLineOptCheckDTO>();
       String contract ="";
       String schLine  ="";
       String checkerType = "";
       String sqlFlag="";
      // String optionCode ="";
 	   List<String> optionCheckedList = new ArrayList<String>();
 	   boolean isFound =false;
 	   
 	   
       for (ContrLineOptCheckDTO optChecker: conflictContainerCompleteList){ // will search excluding the N/A
     	   if ((!optChecker.getOemptionType().equals("N/A")) &&  (optChecker.getOption_Checked().equals("R"))) {
 	    	    optionCheckedList.add(optChecker.getOption_Checked());	
 	    	    contract = optChecker.getContract();  // contract and schline value  will loop with the same value
 	    	    schLine  = optChecker.getSch_Line();
 	    	    sqlFlag ="0";
 	    	    checkerType ="I";
 	    	    
 	    	    // retrieving this needs to be per options since we need to save the optionSource - where it came from originally. Because of this  you cannot use the method of include above.
 	    	    // get included of require list only  
 	    	    contrLineOptCheckList = conflictDAO.getContrOptionCheckerList(contract, schLine, optionCheckedList, checkerType, sqlFlag);   	
	
 	    	    for (ContrLineOptCheckDTO optCheckerInclude : contrLineOptCheckList) {
 	    	    	  isFound = false;
 	    	    	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
			    		   if ((!dto.getOemptionType().equals("N/A")) &&  (dto.getChecker_Type() == "I"  && dto.getOptOrigin().equals("R") 
			    				   && dto.getOption_Code().equals(optCheckerInclude.getOption_Code()) &&  dto.getOption_Checked().equals(optCheckerInclude.getOption_Checked()) )) {
			    		          isFound = true;
			                }
			          }
 	    	    	
 	            
	 	     	     if (isFound){
					  	 ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
				    	 contrLineOptCheckerDTO.setContract(optCheckerInclude.getContract()); // given contract from contract available list or input coming from WS
						 contrLineOptCheckerDTO.setSch_Line(optCheckerInclude.getSch_Line()); // given schLine  from contract available list or input coming from WS
						 contrLineOptCheckerDTO.setOptOrigin("R");
						 contrLineOptCheckerDTO.setChecker_Type("I");
						 contrLineOptCheckerDTO.setSequence(1);      
						 contrLineOptCheckerDTO.setOption_Code(optCheckerInclude.getOption_Code());
						 contrLineOptCheckerDTO.setOption_Checked(optCheckerInclude.getOption_Checked());  
						 contrLineOptCheckerDTO.setUnitPrice(0);
						 contrLineOptCheckerDTO.setValidQty("");
						 contrLineOptCheckerDTO.setOptSource(optChecker.getOption_Code());
						 contrLineOptCheckerDTO.setQuantity(0);
						 contrLineOptCheckerDTO.setMessage("");
						 contrLineOptCheckerDTO.setOemptionType("");
						 contrLineOptCheckerDTO.setStatus(""); 
						 //add to container working area for storing collisions
					     conflictContainerCompleteList.add(contrLineOptCheckerDTO);
	 	             }  
     	         } 
            }  
   
       }
  	 return conflictContainerCompleteList;		

   }
   
// get the exclude -- should be executed last after all the include and require...
   public boolean conflictsProcessExclue(List<ContrLineOptCheckDTO> conflictContainerList ) {


	   
	   List <ContrLineOptCheckDTO> contrLineOptCheckList = new ArrayList<ContrLineOptCheckDTO>();
     //  List<ConflictRequireCombineDTO> requireList = new ArrayList<ConflictRequireCombineDTO>();
     //  ConflictRequireCombineDTO requireDTO = new ConflictRequireCombineDTO();

	   String contract ="";
       String schLine  ="";
       String checkerType = "";
       String sqlFlag="";
  
 	   List<String> optionCheckedList = new ArrayList<String>();
 	    
       for (ContrLineOptCheckDTO optChecker: conflictContainerList){ // will search excluding the N/A
     	   if (!optChecker.getOemptionType().equals("N/A")){
 	    	    optionCheckedList.add(optChecker.getOption_Checked());	
 	    	    contract = optChecker.getContract();  // contract and schline value  will loop with the same value
 	    	    schLine  = optChecker.getSch_Line();
            }
       }
	   
       sqlFlag ="1";
	   checkerType ="E";
     
	    //contain require list only  
       contrLineOptCheckList = conflictDAO.getContrOptionCheckerList(contract, schLine, optionCheckedList, checkerType, sqlFlag);   	
   	
       
       boolean isFound = false;
       boolean isBuildable = true;
       String message ="";
       String status  = "";
	   for (ContrLineOptCheckDTO optChecker : contrLineOptCheckList) {
	    	  isFound = false;
	    	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
	    		   if ((!dto.getOemptionType().equals("N/A")) &&  (dto.getChecker_Type() == "I"  || dto.getChecker_Type() == "R" || dto.getChecker_Type() == "" )  
	    				   &&  dto.getOption_Checked().equals(optChecker.getOption_Checked()) ) {
	    		          isFound = true;
	                }
	          }
	 	     if (isFound){
	 	    	 isBuildable = false;
	 	    	 message = optChecker.getOption_Code() + " cannot be order with " + optChecker.getOption_Checked();
	 	    	 status  = ""; 
			  	 ContrLineOptCheckDTO contrLineOptCheckerDTO = new ContrLineOptCheckDTO();
		    	 contrLineOptCheckerDTO.setContract(optChecker.getContract()); // given contract from contract available list or input coming from WS
				 contrLineOptCheckerDTO.setSch_Line(optChecker.getSch_Line()); // given schLine  from contract available list or input coming from WS
				 contrLineOptCheckerDTO.setOptOrigin("R");
				 contrLineOptCheckerDTO.setChecker_Type("E");
				 contrLineOptCheckerDTO.setSequence(1);      
				 contrLineOptCheckerDTO.setOption_Code(optChecker.getOption_Code());
				 contrLineOptCheckerDTO.setOption_Checked(optChecker.getOption_Checked());  
				 contrLineOptCheckerDTO.setUnitPrice(0);
				 contrLineOptCheckerDTO.setValidQty("");
				 contrLineOptCheckerDTO.setOptSource(optChecker.getOption_Code());
				 contrLineOptCheckerDTO.setQuantity(0);
				 contrLineOptCheckerDTO.setMessage(message);
				 contrLineOptCheckerDTO.setOemptionType("");
				 contrLineOptCheckerDTO.setStatus(status); 
				 //add to container working area for storing collisions
			     conflictContainerCompleteList.add(contrLineOptCheckerDTO);
            }  
        } 

    return isBuildable;   
   }    

   
   public  void  CheckerBuildabilityExt ( ContrLineOptCheckDTO selectedOption ){
	   
	   //delete the dependent options of option_checked using OPTSOURCE which got inserted either require and excluded  ---->
	  	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
			   if (!dto.getOemptionType().equals("N/A") &&  dto.getChecker_Type().equals("R")  && !dto.getAction().equals("Excluded")
					   && !dto.getAction().equals("Deleted") && dto.getContract().equals(selectedOption.getContract()) 
					   && dto.getSch_Line().equals(selectedOption.getSch_Line()) && dto.getOption_Code().equals(selectedOption.getOption_Checked()) 
					   && dto.getOptSource().equals(selectedOption.getOption_Code()) && dto.getSequence() != 0 ) {
				    dto.setAction("Deleted");
			   }
	       }
   }
   
     
   // forOptionActionList would be the list of option selected for Recalculate either removing Excluded, Require or Include .Will be coming from display of price comparison.
   public void recalCulate(List<ContrLineOptCheckDTO> conflictContainerCompleteList,List<ContrLineOptCheckDTO> forOptionActionList , String contract, String schLine ) {

 	  //boolean isFound = false;  
      List <String> requireTempList = new ArrayList<String>();
      // REQUIRE
 	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
		  for (ContrLineOptCheckDTO selectedOption :forOptionActionList ) {
			 // isFound = false;
			  // begin if 1
			  if (!dto.getOemptionType().equals("N/A") &&  dto.getChecker_Type().equals("R")  && !dto.getAction().equals("Deleted") && dto.getContract().equals(contract)  &&  dto.getSch_Line().equals(schLine)) { 
				  // begin if 2 
				  if ( dto.getSequence() != selectedOption.getSequence()) {
				       dto.setAction("Deleted");
			           // delete those child using optionSource column
                       CheckerBuildabilityExt(selectedOption); 
                       // require reverse dependencies..
                       for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
             			  if ((!dto1.getOemptionType().equals("N/A")) &&  (dto1.getChecker_Type().equals("R")  && dto1.getContract().equals(contract)  &&
           					   dto1.getSch_Line().equals(schLine) &&  !dto1.getOption_Code().equals(dto.getOption_Code())  && dto1.getOption_Checked().equals(dto.getOption_Checked()) &&
           					   dto1.getAction().equals("")) ) { 

             				  // set the value to deleted
             				  dto1.setAction("Deleted");
             				  
             			  }
                    	   
                       }
                       

                       // exlcude dependencies..
                       for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
             			  if ((!dto1.getOemptionType().equals("N/A")) &&  (dto1.getChecker_Type().equals("E")   && dto1.getContract().equals(contract)  &&
           					   dto1.getSch_Line().equals(schLine) &&  !dto1.getOption_Code().equals(dto.getOption_Code())  && dto1.getOption_Checked().equals(dto.getOption_Checked()) &&
           					   dto1.getAction().equals("")) ) {

             				  // set the value to deleted
             				  dto1.setAction("Deleted");
             				  
             			  }
                    	   
                       }

                       
                       //  delete other options that related to  it , such as 'E' type. Reverse the condition  of Option_code and Option_checked above--->

                       for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) { 
             			  if ((!dto3.getOemptionType().equals("N/A")) &&  (dto3.getChecker_Type().equals("E")  && dto3.getContract().equals(contract)  &&
           					   dto3.getSch_Line().equals(schLine) &&  dto3.getOption_Code().equals(dto.getOption_Checked())  && dto3.getOption_Checked().equals(dto.getOption_Code()) &&
           					 dto3.getAction().equals("")))  {
                              // set the value to deleted
             				  dto3.setAction("Deleted");
             				  
             			  }
                    	   
                       }
				   }      
				  
                   // begin else 2    
				   else {
					   dto.setAction("Selected");
					   dto.setStatus("");
					   requireTempList.add(dto.getOption_Checked());

			 			   //- this is for situation when user  didnt select exclude on the selections, but required options only. eg SRO exl RS, SRO require SRG. RS excl SRO,
			 			   // ONLY SRG was selected
			 			   // 	assumption : since this is recalculate and  you choose an action from this OPTION either exclude, require (when or set is given),
			 			   //				 that means you like to keep this option over the other. let say you select from SRO even just require, that means you dont like RS then 
			 			//	 But the above code deleted all the exclude  so will only  marked the sequence 0 which is the base/input ---->
			             
					   
					   String optionExcluded =dto.getOption_Code();
					   
					   //begin for 1
					   
					   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
           			       if ((!dto1.getOemptionType().equals("N/A")) &&  (dto1.getChecker_Type().equals("E")  && dto1.getContract().equals(contract)  &&
          					   dto1.getSch_Line().equals(schLine) &&  dto1.getOption_Code().equals(optionExcluded)  && !dto1.getOption_Checked().equals(optionExcluded))) {
           			    	   
           			    	   optionExcluded =dto1.getOption_Code(); 	   
        					   for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) {
                   			       if (!dto2.getOemptionType().equals("N/A")   && dto2.getContract().equals(contract)  &&
                      					   dto2.getSch_Line().equals(schLine) &&  dto2.getOption_Code().equals(optionExcluded)  && dto2.getOption_Checked().equals(optionExcluded) &&
                      					   dto2.getSequence() == 0  && dto2.getAction().equals("")) {
                   			    	 
                   			    	   dto2.setAction("Excluded");
                   			    	 
                   			    	  // delete all other that has the same option_checked and checker_type ='E' --->

               					      for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) {
                       			         if ((!dto3.getOemptionType().equals("N/A")) &&  dto3.getChecker_Type().equals("E")  && dto3.getContract().equals(contract)  &&
                          					   dto3.getSch_Line().equals(schLine) &&  !dto3.getOption_Code().equals(optionExcluded)  && dto3.getOption_Checked().equals(optionExcluded) &&
                          					   dto3.getSequence() == 0  && dto3.getAction().equals("")) {
                         			    	   dto3.setAction("Excluded");
                   			    	  
                       			         }
                       			         
               					      }
               	 					  // delete other options that related to  it , such as 'E' type. Reverse the condition  of Option_code and Option_checked above--->
               					      
               					      for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) {
                        			         if (!dto3.getOemptionType().equals("N/A") &&  dto3.getChecker_Type().equals("E")  && dto3.getContract().equals(contract)  &&
                           					   dto3.getSch_Line().equals(schLine) &&  dto3.getOption_Code().equals(optionExcluded)  && !dto3.getOption_Checked().equals(optionExcluded) &&
                           					   dto3.getSequence() == 0  && dto3.getAction().equals("")) {
                          			    	   dto3.setAction("Excluded");
                    			    	  
                        			         }
                        			         
                					   }
		   						    }  // end if
        					     }  //end for
           			       } //end if
           			   } // end for 1
				   } //end else 1
			  }
	       }
  	  
	 }

 	 // remove those "required options" that same as from selection  Req_'Contract'_'Option_Code'
 	  
     for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
		  for (String optionChecked :requireTempList) {
			  // begin if 1
			  if (!dto.getOemptionType().equals("N/A") &&  dto.getChecker_Type().equals("R")  && !dto.getAction().equals("Excluded") && !dto.getAction().equals("Selected") && 
				  dto.getContract().equals(contract)  &&  dto.getSch_Line().equals(schLine) && dto.getOption_Checked().equals(optionChecked) ) {
				 dto.setAction("Deleted");
			  }
		  }	  
   	   
	   }


    //EXCLUDE 

     String optionTemp ="";
     
     for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {
    	  for (ContrLineOptCheckDTO selectedOption :forOptionActionList ) {
    		  optionTemp ="";
    		  if (!dto.getOemptionType().equals("N/A") &&  dto.getChecker_Type().equals("E")  && !dto.getAction().equals("Excluded") && !dto.getAction().equals("Selected") && 
	    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line())){
	    			 
	    		     if (dto.getOption_Code().equals(selectedOption.getOption_Code()) || (dto.getOption_Checked().equals(selectedOption.getOption_Checked())))  {
	    		    	 if (dto.getOption_Code().equals(selectedOption.getOption_Code())) {
	    		    		 optionTemp =dto.getOption_Code();
	    		    		 
	    		    	 }
	    		    	 else {
	    		    		 optionTemp =dto.getOption_Checked();
	    		    	 }
	    		    	 
	    		     }
	    		     
   	                // checked whether this exclude is required by other options_code before setting to EXLCUDED
	    		    String optionCode = dto.getOption_Code();
	    		    String optionChecked = dto.getOption_Checked();
	    		    boolean found = false;
	    		    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
	    		    	  if (!dto1.getOemptionType().equals("N/A") &&  (dto1.getChecker_Type().equals("R") || dto1.getChecker_Type().equals("I")) && (dto1.getAction().equals("Included") || dto1.getAction().equals("Selected")) && 
	    		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && dto1.getOption_Checked().equals(optionTemp)){
	    		    		 found = true; 
	    		    		  
	    		    	  }
	    		    }
	    		    
	    		    if (!found) {
	    		          //  if not exist allow to be EXLCUDED 
	    		          
	    		    	dto.setAction("Excluded");

	    		       // exlcuded the counterpart set of exclude e.g.  first set e3 exc e4   sencond set is e4 exl e3
	    	         
		    		    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
		    		    	  if (!dto1.getOemptionType().equals("N/A") &&  dto1.getChecker_Type().equals("E")  && 
		    		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line())
		    		    			  && dto1.getOption_Code().equals(optionChecked) &&  dto1.getOption_Checked().equals(optionCode)){
		    		    		  // should be found only 1 record here.
		    		    		  dto.setAction("Excluded");
	
		    		    	  }
		    		    }
		    		    
		                // exclude other options_checked that is equal to the options being excluded            
	
		    		    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
		    		    	  if (!dto1.getOemptionType().equals("N/A") &&  dto1.getContract().equals(selectedOption.getContract())  &&
		    		    			  dto1.getSch_Line().equals(selectedOption.getSch_Line())  && dto1.getOption_Code().equals(optionTemp) && 
		    		    			  dto1.getAction().equals("")){
		    		    		  // should be found only 1 record here.
		    		    		  dto.setAction("Excluded");
	
		    		    	  }
		    		    }

	    		    } // end !found	    		    
	    	  }  //end first if
 		  }  //end for	 
     }  // end for
     
   }	         

   

	
	public  void  CheckerBuildability ( ContrLineOptCheckDTO selectedOption ){ 

		
//  selectedOption  ---- just to pass the contract and sch line 
		
//		------process one  sequence here is 0 ---->
//		<!--- 
//		     APM - 02/03/2010   Removing Required when it is given from the base option or user input
//		  
//		scenario: user select option AUXL =$220 AND CPR1 =$1338
//		problem:  double pricing happened . system should not show the  Required since requirement was satisfied already 
//		           for having CPR1 as user entry    
//		collission has this data :
//		AUXL  require  CPR OR  CPR1
//		behavior :  Require option should not be displayed since  on leg/set was satisfied already
//
//		this line is similar to the next block <!---process two ----> except this one use only the SEQUENCE 0 which is the 
//		user input option.
//		---->

	  
	  boolean flagSequence = false; 
	  int seqCtrOption = 0 ; 
	  int oldSeqCtrOption=0;
	  int sequence = 0; 
	  int oldSequence =0;
	  int oldSequenceRow =0; 
	  int rowCount = 0;
	  boolean proceedToDelete = false;
	  boolean found = false;
	  boolean flagOK = true;
	    

	  

	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {

		  if (!dto.getOemptionType().equals("N/A") &&  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line()) && 
    			  dto.getSequence()==0 ){
		      
			  flagSequence = false; 
			  seqCtrOption = 0 ; 
			  oldSeqCtrOption=0;
			  sequence = 0; 
			  oldSequence =0; 
			  proceedToDelete = false;
	          for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) {
	              
			  	  if (!dto1.getOemptionType().equals("N/A") && !dto1.getAction().equals("Included") && !dto1.getAction().equals("Excluded") &&  !dto1.getAction().equals("Deleted") &&
		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && 
		    			  dto1.getOption_Code().equals(dto.getOption_Code()) && !dto1.getOption_Checked().equals(dto.getOption_Code()) &&  dto1.getChecker_Type().equals("R") ){
	
			  		  flagOK = true;
					  seqCtrOption = 0;
								
			  		  
					  //look for Included whether  Required is exist. If true then that means displaying it doesnt need. ---> 
	                  // this assumes the order on the list will be order by sequence, which during insertion to list the sql is sorted by option code + sequence
                      
			  		  //loop here by sequence
					  sequence = dto1.getSequence();
			          for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) {
					  	  if (!dto2.getOemptionType().equals("N/A") && !dto2.getAction().equals("Included") && !dto2.getAction().equals("Excluded") &&  !dto2.getAction().equals("Deleted") &&
				    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line()) && 
				    			  dto2.getOption_Code().equals(dto.getOption_Code()) && !dto2.getOption_Checked().equals(dto.getOption_Code()) &&  dto2.getChecker_Type().equals("R") &&
				    			  dto2.getSequence()==sequence){
			  				      
					  		      found = false;
			                      String optionCheked1 = dto2.getOption_Checked();
								  for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) {
									  if (!dto3.getOemptionType().equals("N/A") &&  
							    			  !dto3.getAction().equals("Excluded") &&  !dto3.getAction().equals("Deleted") &&
							    			  dto3.getContract().equals(selectedOption.getContract())  &&  dto3.getSch_Line().equals(selectedOption.getSch_Line()) && 
							    			   !dto3.getOption_Checked().equals(optionCheked1) && dto3.getSequence()==0){
			                                 found = true;
									  }
								  }	 
								  
								  if (found =false) {
							  	 	  flagOK = false;  
								  }
								  else {
									  dto2.setAction("Deleted");
										// in case mulitiple sequence the highest count options within the set would be the remaining require options the rest would be deleted on that sequence
									  seqCtrOption++;
									  sequence = dto2.getSequence();
								  }
					  	  }  // end if			  
					  }  // end for
			  
			          if (seqCtrOption > oldSeqCtrOption) {
				        	 oldSeqCtrOption = seqCtrOption;
				             oldSequence     = sequence;
				             proceedToDelete = true;
				          }
				      else
				          {
				       	    if (seqCtrOption > 0 && seqCtrOption == oldSeqCtrOption){
				        		  proceedToDelete = false;  
				            }
				       }
				       if (flagOK){
				        	  flagSequence = true;
				       }
				           
				  }  //end if 
	
			  }	 // end for
	          
	          if (flagSequence){
	        	  //if one leg/set where found that means requirements were satisfy. all the OR set for this options will be deleted 
	
	        	   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) {
	 	              
	 				  if (!dto1.getOemptionType().equals("N/A") &&  dto1.getChecker_Type().equals("R") && 
	 		    			  !dto1.getAction().equals("Included") && !dto1.getAction().equals("Excluded") &&  !dto1.getAction().equals("Deleted") &&
	 		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && 
	 		    			  dto1.getOption_Code().equals(dto.getOption_Code()) && !dto1.getOption_Checked().equals(dto.getOption_Code()) ){
	 				         
	 					      dto1.setAction("Deleted");	
	 					      selectedOption.setOption_Code(dto1.getOption_Code());
	 					      selectedOption.setOption_Checked(dto1.getOption_Checked());
	 					      CheckerBuildabilityExt(selectedOption); 
	 				  }
	        	   }
	          }	   
	 		  else {
	 				  if (proceedToDelete){
 			        	   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) {
  			 				   if (!dto1.getOemptionType().equals("N/A") &&  dto1.getChecker_Type().equals("R") && 
	 			 		    			  !dto1.getAction().equals("Included") && !dto1.getAction().equals("Excluded") &&  !dto1.getAction().equals("Deleted") &&
	 			 		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && 
	 			 		    			  dto1.getOption_Code().equals(dto.getOption_Code()) && !dto1.getOption_Checked().equals(dto.getOption_Code()) ){
	 			 				         
  			 					       if (oldSequence != dto1.getSequence()){
	 			 					      dto1.setAction("Deleted");	
	 			 					      selectedOption.setOption_Code(dto1.getOption_Code());
	 			 					      selectedOption.setOption_Checked(dto1.getOption_Checked());
	 			 					      CheckerBuildabilityExt(selectedOption);
  			 					       }   
	 			 				}

 			        	    }  // end for 
	 				  
	 				  
	 				   } // end  if 
	 		  } // end else
		 }  // end first if	          
          
	  }	// end loop
	  
	
	
	
	  // ------------- process  two
	
	  

		//<!-- Mark all the child of Included, if the parents were marked as Included, those child that REQUIRE needs to validate ---> 
		//<!-- The OR situation needs to be considered, and if  "OR sequence" has found "true" all the child needs to be marked as Deleted ---> 
		//<!--- 
		//1.  RKE  requires (PWL & E3)  or (PWL & E4)  - 
		//  	        *When E3 is selected/given the or set 2 (PWL and E4) will be deleted plus the E3
		//          *When PWL is selected/given the E3 and E4 will be remain only PWL will be deleted.
		//		  * When one set is satisfy all the  require will be deleted. That means Require has satisfied by other options.
		//			
		//2.  PWL requires E3 or E4.
		//         * There only one selection should be keep for display purposes regarles of Checker Type. Since in RKE
		//		 E3 and E4 are included this need to be deleted.
		//
		// ---> 

	  
	  
	  
	  

	  for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) {

		  if (!dto.getOemptionType().equals("N/A") &&  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line()) && 
    			  dto.getSequence()==0 ){
		      
			  flagSequence = false; 
			  seqCtrOption = 0 ; 
			  oldSeqCtrOption=0;
			  sequence = 0; 
			  oldSequence =0; 
			  proceedToDelete = false;
	          for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) {
	              String optionCode = dto.getOption_Code();
			  	  if (!dto1.getOemptionType().equals("N/A") && !dto1.getAction().equals("Included") && !dto1.getAction().equals("Excluded") &&  !dto1.getAction().equals("Deleted") &&
		    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && 
		    			  dto1.getOption_Code().equals(optionCode) && !dto1.getOption_Checked().equals(optionCode) &&  dto1.getChecker_Type().equals("R") ){
	
			  		  flagOK = true;
					  seqCtrOption = 0;
								
					  String optionChecked1 ="";
					  //look for Included whether  Required is exist. If true then that means displaying it doesnt need. ---> 
	                  // this assumes the order on the list will be order by sequence, which during insertion to list the sql is sorted by option code + sequence
                      
			  		  //loop here by sequence
					  sequence = dto1.getSequence();
			          for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) {
					  	  if (!dto2.getOemptionType().equals("N/A") && !dto2.getAction().equals("Included") && !dto2.getAction().equals("Excluded") &&  !dto2.getAction().equals("Deleted") &&
				    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line()) && 
				    			  dto2.getOption_Code().equals(optionCode) && !dto2.getOption_Checked().equals(optionCode) &&  dto2.getChecker_Type().equals("R") &&
				    			  dto2.getSequence()==sequence){
			  				      
					  		      found = false;
			                      optionChecked1 = dto2.getOption_Checked();
								  for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) {
									  if (!dto3.getOemptionType().equals("N/A") &&  
							    			  !dto3.getAction().equals("Excluded") &&  !dto3.getAction().equals("Deleted") &&
							    			  dto3.getContract().equals(selectedOption.getContract())  &&  dto3.getSch_Line().equals(selectedOption.getSch_Line()) && 
							    			  dto3.getChecker_Type().equals("I") &&  !dto3.getOption_Code().equals(optionCode) && dto3.getOption_Checked().equals(optionChecked1)){
			                                
										   found = true;
									  }
								  }	 
								  
								  if (found =false) {
							  	 	  flagOK = false;  
								  }
								  else {
									  
							      	 //  <!---look for included source, before deleting Required because IF included exist you have to make sure that INCLUDED  is 
									 // not becauase of REQUIRED.   eg t6a required e4 or t6a required e3 or t6a required e85 then the  require e4 include e85 and
									 //  require e85 include e4 . Because of this current collision delete  all these required since it will be satisfied by 
									 //  included option eventhough those include came from itself. t6a
									 //  eg.  ls_option_code  = T6A , ls_option_code1 ='E85' ,ls_option_checked1 = 'E4' 
									   
									  // --->
							          // <!---  isRequiredOkToDelete  02/09/10  make sure the include not came from the base options  ----->
                                       
									  boolean isFoundFromItself = false;
									  String optionCode1 = "";
									  for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) {
										  if (!dto3.getOemptionType().equals("N/A") &&  
								    			  !dto3.getAction().equals("Excluded") &&  !dto3.getAction().equals("Deleted") &&
								    			  dto3.getContract().equals(selectedOption.getContract())  &&  dto3.getSch_Line().equals(selectedOption.getSch_Line()) && 
								    			  dto3.getChecker_Type().equals("I") &&  !dto3.getOption_Code().equals(optionCode) && dto3.getOption_Checked().equals(optionChecked1)){
                                              
											  optionCode1 = dto3.getOption_Code();
											  isFoundFromItself = false;
											  for (ContrLineOptCheckDTO dto4 :conflictContainerCompleteList ) {
											  	  if (!dto4.getOemptionType().equals("N/A") &&  !dto4.getAction().equals("Excluded") &&  !dto4.getAction().equals("Deleted") &&
										    			  dto4.getContract().equals(selectedOption.getContract())  &&  dto4.getSch_Line().equals(selectedOption.getSch_Line()) && 
										    			  dto4.getOption_Code().equals(optionCode) && !dto4.getOption_Checked().equals(optionCode1) &&  dto2.getChecker_Type().equals("R") &&
										    			  dto2.getSequence()==sequence){
											  		    
											  		  isFoundFromItself = true;
											  	  }
											  	  }
									          }
                                              						
							                 boolean isAllowDeleteRequire  = true;
							                 
							                 if (isFoundFromItself){
												  for (ContrLineOptCheckDTO dto4 :conflictContainerCompleteList ) {
												  	  if (!dto4.getOemptionType().equals("N/A") && !dto4.getAction().equals("Included") && !dto4.getAction().equals("Excluded") &&  !dto4.getAction().equals("Deleted") &&
											    			  dto4.getContract().equals(selectedOption.getContract())  &&  dto4.getSch_Line().equals(selectedOption.getSch_Line()) && 
											    			  !dto4.getOption_Code().equals(optionCode) && !dto4.getOption_Code().equals(optionCode1) && !dto4.getOption_Checked().equals(optionChecked1) &&  dto2.getChecker_Type().equals("I") ){
												  		 isAllowDeleteRequire  = false;
												  	  }
												  }	  
							                 }	  
							                 
							                 if (isAllowDeleteRequire) {
							                	 dto3.setAction("Deleted");
							                	 // <!--- in case mulitiple sequence the highest count would be the remaining require options the rest would be deleted on that sequence      
						                          seqCtrOption =  seqCtrOption + 1 ; 
						                          sequence  = dto3.getSequence();
							                 }

											  
										// in case mulitiple sequence the highest count options within the set would be the remaining require options the rest would be deleted on that sequence
									  seqCtrOption++;
									  sequence = dto2.getSequence();
								  }  //end 
					  	  }  // end if			  
					  }  // end for
			  
			          if (seqCtrOption > oldSeqCtrOption) {
				        	 oldSeqCtrOption = seqCtrOption;
				             oldSequence     = sequence;
				             proceedToDelete = true;
				          }
				      else
				          {
				       	    if (seqCtrOption > 0 && seqCtrOption == oldSeqCtrOption){
				        		  proceedToDelete = false;  
				            }
				       }
				       if (flagOK){
				        	  flagSequence = true;
				       }
				           
				  }  //end if 
	
			  }	 // end for
	          
	          if (flagSequence){
	        	   
	        	   // equivalent query to dto1
	        	   for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) {
	 	              
	 				  
	 				  if (!dto2.getOemptionType().equals("N/A") && !dto2.getAction().equals("Included") && !dto2.getAction().equals("Excluded") &&  !dto2.getAction().equals("Deleted") &&
	 			    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line()) && 
	 			    			  dto2.getOption_Code().equals(optionCode) && !dto2.getOption_Checked().equals(optionCode) &&  dto2.getChecker_Type().equals("R") ){
	 		
	 					     //if one leg/set where found that means requirements were satisfy. all the OR set for this options will be deleted 
	 					      dto2.setAction("Deleted");	
//	 					      selectedOption.setOption_Code(dto2.getOption_Code());
//	 					      selectedOption.setOption_Checked(dto2.getOption_Checked());
//	 					      CheckerBuildabilityExt(selectedOption); 
	 				  }
	        	   }
	          }	   
	 		  else {
	 				  if (proceedToDelete){
 			        	   for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) {
  			 				   if (!dto2.getOemptionType().equals("N/A") && !dto2.getAction().equals("Included") && !dto2.getAction().equals("Excluded") &&  !dto2.getAction().equals("Deleted") &&
	 			 		    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line()) && 
	 			 		    			  dto2.getOption_Code().equals(optionCode) && !dto2.getOption_Checked().equals(optionCode) &&  dto2.getChecker_Type().equals("R") ){
	 			 				         
  			 					       if (oldSequence != dto1.getSequence()){
  			 					    	  // delete those sequence that has lowest count and retain the highest count found sequence            
	 			 					      dto2.setAction("Deleted");	
//	 			 					      selectedOption.setOption_Code(dto2.getOption_Code());
//	 			 					      selectedOption.setOption_Checked(dto2.getOption_Checked());
//	 			 					      CheckerBuildabilityExt(selectedOption);
  			 					       }   
	 			 				}

 			        	    }  // end for 
	 				  
	 				  
	 				   } // end  if 
	 		  } // end else
		 }  // end first if	          
          
	  }	// end loop
	  
	 } 
	
	 //for those Options Selected (Sequence=0) that previously marked as Included by another options (AO), and suddenly AO become excluded.
	 //  Dependency of the Included option need be removed   
	 
	  
	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
		   if (!dto.getOemptionType().equals("N/A") && dto.getAction().equals("Excluded") &&
	    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto.getChecker_Type().equals("I") ){

			   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				   if (!dto1.getOemptionType().equals("N/A") && dto1.getAction().equals("Included") &&
			    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto1.getSequence() ==0  &&
			    			  dto1.getOption_Code().equals(dto.getOption_Checked())){
					   // put it back into blank if the Actions ="Included" when parent became Excluded  
					   dto1.setAction(""); 
				   }
				   
			   }
		   }
		   
	   }		
	  
	  
	   
//	   
//	   <!--- deleting  require when  it is only one sequence  and it is already included - meaning no OR set.
//	      But this would work also  in recalculate, because recalculate would  marked deleted for the those OR set that 
//	      are not needed. 
//		  
//		  03/12/2013 apm -  changes from  09/12/2012  when exclude  e.g. (Stdtem 17F) PUFR req PEPP excl PUR2 , PUR2 req PEPP excl PUFR to allow muliple view for require when checker type is 'E'
//		  
//		  Because of this changes other require that needs to be deleted remains undeleted  but whait it needs is to check whether the base options has Excludes, and if it does you cannot delete it. Since the user needs to select either PUFR or PUF2 ,both req PEPP. Current code right now is deleting one of this PEPP, and it would cause a error if the options which got delted is selected. The PEPP is marked deleted already . ---> 

	   
	
        //check if the base option of the require options has exclude. because if does do not remove the requre. see message above  for 03/12/13
	   
	   //get the Checker_Type ='E'  regardless of  Action =Excluded . This will prevent deleting of Require if base option has Exclude on it.
	   // Because  Action = "Excluded"  will always happen at user Selection. But other require will be deleted here as long the base options doesnt have Exclude ----->
	
	
	   
	   
	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
		   if (!dto.getOemptionType().equals("N/A") &&
	    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto.getChecker_Type().equals("R") 
	    			  && (dto.getAction().equals("") || dto.getAction().equals("Selected") || dto.getAction().equals("Included"))  ){ 
		
			    int seqCounter = dto.getSequence(); 
			    String optionCode =dto.getOption_Code();
			    String optionChecked = dto.getOption_Checked();
			    String optionList =""; 
               // group by option code to count the sequence

			   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				    if (!dto1.getOemptionType().equals("N/A") &&
				    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto1.getChecker_Type().equals("R") 
				    			  && (dto1.getAction().equals("") || dto1.getAction().equals("Selected") || dto1.getAction().equals("Included")) &&  dto1.getOption_Code().equals(optionCode)  ){
					   if (dto1.getSequence() > seqCounter) {
						   seqCounter++;
						   
					   }
				   
			        }
			   }
			    
			   if (seqCounter < 1) {
				   
				   for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
					    if (!dto1.getOemptionType().equals("N/A") &&
					    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto1.getChecker_Type().equals("R") 
					    			  && (dto1.getAction().equals("") || dto1.getAction().equals("Selected") || dto1.getAction().equals("Included")) &&  dto1.getOption_Code().equals(optionCode)  ){
                                
					    	   boolean foundBaseExclude = false;
							   for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) { 
					                //all type are okay except E 
								    if (!dto2.getOemptionType().equals("N/A") &&
							    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line())  &&  !dto2.getChecker_Type().equals("E") 
							    			  && !dto2.getAction().equals("Deleted") && !dto2.getAction().equals("Excluded")  &&  !dto2.getOption_Code().equals(dto1.getOption_Code()) && dto2.getOption_Checked().equals(dto1.getOption_Checked())  ){
								    	      
								    	 

										   for (ContrLineOptCheckDTO dto3 :conflictContainerCompleteList ) { 

											    if (!dto3.getOemptionType().equals("N/A") &&
										    			  dto3.getContract().equals(selectedOption.getContract())  &&  dto3.getSch_Line().equals(selectedOption.getSch_Line()) 
										    			  &&  !dto3.getChecker_Type().equals("E") ) {
											       if (dto3.getOption_Checked().equals(dto2.getOption_Code())){
											    	   foundBaseExclude = true; // found base option exclude
											       }
											    	
											    }
										   }	    
											    	
								    	   if (foundBaseExclude){
								    		   
								    		   dto1.setAction("Deleted");
								    	   }
								    }
								    
								    
							   }	    
 					      }		   
				   }
			   }
		   }
	    }

	   
	   //
	   
	   // used to  be in CollisionCheckerPricing.cfm   11/14/07--> 
	   // Marking all included item with "Included" and pick the higher amount for the package ---> 
	   
	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
		    if (!dto.getOemptionType().equals("N/A") &&
		    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto.getChecker_Type().equals("") 
	 	    			  && dto.getSequence() == 0  && dto.getAction().equals("")){
		    	
	  	    	String optionCode = dto.getOption_Code();
		        double unitPrice = 0;
		    	boolean foundInclude = false;

		 	    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				    if (!dto1.getOemptionType().equals("N/A") &&
				    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto1.getChecker_Type().equals("I") 
			 	    			  && dto1.getSequence() != 0  && dto1.getAction().equals("") && dto1.getOption_Checked().equals(optionCode)){
				    	foundInclude = true;
				    	 
				    }
				    
				    if (foundInclude){
				 	    for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) { 
				    	
						    if (!dto2.getOemptionType().equals("N/A") &&
					    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line())  &&  dto2.getChecker_Type().equals("") 
				 	    			  && dto2.getSequence() ==	 0  && dto1.getAction().equals("") && dto2.getOption_Code().equals(dto1.getOption_Code())){
						    	if(unitPrice < dto2.getUnitPrice()){
						    		dto.setAction("Included");
						    	}
						    }
				 	    }
				    }
				    
		 	    }   
		    }   
	   }	    
	   

	   
	  // (reset the Child of the Included optoin into Deleted status) - this help to solved when recalculated--> 
	  //  added 10/23/06  e.g.  RHM require E3 or E4, includes PLAB; PLAB requires E3 or E4  when both selected after 
	  //       recalculating let say E3 was selected the E4 of PLAB  was added. Originally PLAB was marked as INCLUDED  but after
	  //       recalculate E4 show.---> 
	  // <!--- <cfif isdefined("RECALCULATE")> ---> 
	   
	   

	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
		    if (!dto.getOemptionType().equals("N/A") &&
		    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line()) 
	 	    			  && dto.getSequence() == 0  && dto.getAction().equals("Included")){ 
		
		    	boolean foundInclude = false;

		 	    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				    if (!dto1.getOemptionType().equals("N/A") &&
				    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) 
			 	    			  && dto1.getSequence() > 0   && dto1.getOption_Code().equals(dto.getOption_Code())){
				    	foundInclude = true;
				    	 
				    }
				    if (foundInclude){
				    	dto1.setAction("Deleted");
				    }
		 	    }   

		    	
		    }
	   }
		    	


	   
	   
	  // <!---Using all included of Required in marking   as included ---> 
	   

	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
	       // return Includes of Require 
		   if (!dto.getOemptionType().equals("N/A") &&
		    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line()) && dto.getChecker_Type().equals("R") 
	 	    			  && dto.getAction().equals("")){ 
			
		 	    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				    if (!dto1.getOemptionType().equals("N/A") &&
				    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && dto1.getChecker_Type().equals("I") 
			 	    			  && dto.getAction().equals("") && dto1.getOption_Code().equals(dto.getOption_Checked())){
				    	

				 	    for (ContrLineOptCheckDTO dto2 :conflictContainerCompleteList ) { 
						    if (!dto2.getOemptionType().equals("N/A") &&
						    			  dto2.getContract().equals(selectedOption.getContract())  &&  dto2.getSch_Line().equals(selectedOption.getSch_Line()) && dto2.getChecker_Type().equals("") 
					      	    			  && dto2.getSequence() == 0 && dto2.getAction().equals("") && dto2.getOption_Code().equals(dto1.getOption_Checked())){
						    	dto2.setAction("Included");  
						    }
				 	    }    
				    }
		 	    }		
		    }
	   }    


	   

		//<!---- 02/10/10  apm Deleting EXCLUDE which ACTION still empty but  all the reference of it for EXCLUTION was deleted already.  
		//problem : REQUIRE that has more than one leg/or set, caused a problem when it has excluded. Excluded were left even the option caused it to be inserted where  now have an ACTION =deleted.
		
		//eg  RH4 Require  E3 OR E4 
		//    T6A Require E4
		//    E4 excl E3 
		//   E3 excl E4 
		//	E3 excl T6A
		//	T6A excl E3
				
		//customer select E4,T6A	
		
	   for (ContrLineOptCheckDTO dto :conflictContainerCompleteList ) { 
	       // return Includes of Require 
		   if (!dto.getOemptionType().equals("N/A") &&
		    			  dto.getContract().equals(selectedOption.getContract())  &&  dto.getSch_Line().equals(selectedOption.getSch_Line()) && dto.getChecker_Type().equals("E") 
	 	    			  && dto.getAction().equals("")){ 
			   
		        boolean allowDeleteExclude = false;
			    // check option_code  - either option code or option checked was not found, it will be consider for deletion 
			
		 	    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
				    if (!dto1.getOemptionType().equals("N/A") &&
				    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && !dto1.getChecker_Type().equals("E") 
			 	    			  && dto.getAction().equals("") && ( dto1.getOption_Code().equals(dto.getOption_Code()) || dto1.getOption_Checked().equals(dto.getOption_Code()))){
				    	allowDeleteExclude = true;
				    }		   
		 	    }
		 	    
		 	    if (allowDeleteExclude){
			 	    for (ContrLineOptCheckDTO dto1 :conflictContainerCompleteList ) { 
					    if (!dto1.getOemptionType().equals("N/A") &&
					    			  dto1.getContract().equals(selectedOption.getContract())  &&  dto1.getSch_Line().equals(selectedOption.getSch_Line()) && !dto1.getChecker_Type().equals("E") 
				 	    			  && dto.getAction().equals("") && ( dto1.getOption_Code().equals(dto.getOption_Code()) || dto1.getOption_Checked().equals(dto.getOption_Code()))){
		 	            }
			 	    } 
		 	    }
		   }
	   }    //no done the  above from E4
		 	    	
//		<cfquery name="OptionsQuery_Exclude" dbtype="query">
//		 Select distinct Option_Code,Option_Checked, Rowno from myQuery Where ( Contract = '#as_parm[2]#') and ( Sch_Line = '#as_parm[3]#') and (     Checker_Type ='E') and ( Actions='')
//		</cfquery> 
//		 
//		
//		 <cfloop query="OptionsQuery_Exclude">
//		     <cfset ls_option_code = Option_Code>
//			 <cfset ls_option_checked = Option_Checked>
//		     <cfset allowDeleteExclude = false>
//		     <!---- check option_code  - either option code or option checked was not found, it will be consider for deletion ---->
//		     <cfquery name="OptionsQuery_Exclude1" dbtype="query">
//		            Select distinct Option_Code,Option_Checked, Rowno from myQuery Where ( Contract = '#as_parm[2]#') and ( Sch_Line = '#as_parm[3]#')        and (Checker_Type <> 'E') and ( Actions='' ) and (Option_Code= '#ls_option_code#' or  Option_Checked= '#ls_option_code#')
//		     </cfquery> 
//		     
//		
//		     
//		     <cfif OptionsQuery_Exclude1.RecordCount is 0>
//		            <cfset allowDeleteExclude = true>
//		     </cfif>       
//		                 
//		     <cfif allowDeleteExclude is false>
//		       <cfquery name="OptionsQuery_Exclude1" dbtype="query">
//		            Select distinct Option_Code,Option_Checked, Rowno from myQuery Where ( Contract = '#as_parm[2]#') and ( Sch_Line = '#as_parm[3]#')        and (Checker_Type <> 'E') and ( Actions='' ) and (Option_Code= '#ls_option_checked #' or   Option_Checked =  '#ls_option_checked #')
//		      </cfquery> 
//			 
//		       <cfif OptionsQuery_Exclude1.RecordCount is 0>
//		            <cfset allowDeleteExclude = true>
//		      </cfif>       
//		    </cfif>  
//		    
//		    <cfif allowDeleteExclude >
//		         <cfset MyQuery.Actions[Rowno] = "Deleted"> 
//		    </cfif>     
//		  </cfloop> 
//		      
//	   
//

	   
	   
	   
	   	
	  
   }
	
	
   
	public List<OptionsTableDTO> geOptionList(List<String> optionList ) {
	  return conflictDAO.geOptionList(optionList);
	}  




		

}






						 


 