/*
 * @(#)LNonConformanceProcessor.java			Aug 29, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.model.IndustryCode;
import gov.gsa.fas.vision.dla.request.model.OrganizationInfo;
import gov.gsa.fas.vision.dla.response.beans.C_C001;
import gov.gsa.fas.vision.dla.response.beans.E_1270_2;
import gov.gsa.fas.vision.dla.response.beans.E_1271;
import gov.gsa.fas.vision.dla.response.beans.E_350_1;
import gov.gsa.fas.vision.dla.response.beans.E_352;
import gov.gsa.fas.vision.dla.response.beans.E_355_1;
import gov.gsa.fas.vision.dla.response.beans.E_363;
import gov.gsa.fas.vision.dla.response.beans.E_380;
import gov.gsa.fas.vision.dla.response.beans.E_522;
import gov.gsa.fas.vision.dla.response.beans.E_559;
import gov.gsa.fas.vision.dla.response.beans.E_66_3;
import gov.gsa.fas.vision.dla.response.beans.E_67;
import gov.gsa.fas.vision.dla.response.beans.E_673;
import gov.gsa.fas.vision.dla.response.beans.E_782_1;
import gov.gsa.fas.vision.dla.response.beans.E_887;
import gov.gsa.fas.vision.dla.response.beans.E_888;
import gov.gsa.fas.vision.dla.response.beans.E_93;
import gov.gsa.fas.vision.dla.response.beans.E_98_5;
import gov.gsa.fas.vision.dla.response.beans.L_HL;
import gov.gsa.fas.vision.dla.response.beans.L_LM_2;
import gov.gsa.fas.vision.dla.response.beans.L_N1_2;
import gov.gsa.fas.vision.dla.response.beans.L_NCA;
import gov.gsa.fas.vision.dla.response.beans.L_NCD;
import gov.gsa.fas.vision.dla.response.beans.ObjectFactory;
import gov.gsa.fas.vision.dla.response.beans.S_AMT;
import gov.gsa.fas.vision.dla.response.beans.S_LM;
import gov.gsa.fas.vision.dla.response.beans.S_LQ_2;
import gov.gsa.fas.vision.dla.response.beans.S_N1_2;
import gov.gsa.fas.vision.dla.response.beans.S_NCA;
import gov.gsa.fas.vision.dla.response.beans.S_NCD;
import gov.gsa.fas.vision.dla.response.beans.S_NTE;
import gov.gsa.fas.vision.dla.response.beans.S_QTY;

/**
 * <code>LNonConformanceProcessor</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class LNonConformanceProcessor {
	private static final Logger logger = Logger.getLogger(LNonConformanceProcessor.class.getName());
	private ObjectFactory objectFactory = new ObjectFactory();
	
	private WsdrRequestData wsdrReqData;
	private CaseOutcomeData caseData;
	private L_HL lhl;
	private SegmentCount segCnt;
	
	LNonConformanceProcessor(L_HL lhl, WsdrRequestData wsdrReqData, 
			CaseOutcomeData caseData, SegmentCount segCnt){
		this.wsdrReqData = wsdrReqData;
		this.caseData = caseData;
		this.lhl = lhl;
		this.segCnt = segCnt;
	}

	void setLNonConformanceData(){
		logger.info("setLName():Setting L_Nonconformance_Description for VisionDLAKey->" + caseData.getVisionDlaKey());
		L_NCD lncd = new L_NCD();
		setSNonconformanceDescription(lncd);
		setSQuantity(lncd);
		//setSQuantityShipped(lncd);
		//setSQuantityReceived(lncd);
		setSMonetaryAmount(lncd);
		setSMonetaryAmountTotal(lncd);
		setLNonconformanceAction(lncd);
		lhl.getL_Nonconformance_Description().add(lncd);
	}
	
	private void setSNonconformanceDescription(L_NCD lncd){
		S_NCD sncd = new S_NCD();
		E_888 e888 = new E_888();
		e888.setValue("5");
		E_350_1 e3501 = new E_350_1();
		e3501.setValue("1");
		sncd.setE_Nonconformance_Determination_Code(e888);
		sncd.setE_Assigned_Identification(e3501);
		lncd.setS_Nonconformance_Description(sncd);
		segCnt.addSegmentCount();
	}
	
	private void setSQuantity(L_NCD lncd){
		List<S_QTY> sqtyList = lncd.getS_Quantity();
		S_QTY sqty = new S_QTY();
		E_673 e673 = new E_673();
		e673.setValue("86");
		sqty.setE_Quantity_Qualifier(e673);
		String adjQuantity = "0";
		if(caseData.getAdjustedQuantity() != null && 
				!wsdrReqData.getActionCode().equalsIgnoreCase("PZ")){
			adjQuantity = caseData.getAdjustedQuantity();
		}else{
			adjQuantity = (wsdrReqData.getDiscrepancyQuantity() != null) ? 
					wsdrReqData.getDiscrepancyQuantity().toString():"0";
		}
		E_380 e380 = new E_380();
		e380.setValue(new BigDecimal(adjQuantity));
		sqty.setE_Quantity(e380);

		String adjUnitCode="";
		if(caseData.getAdjustedUnitCode() != null &&
				!wsdrReqData.getActionCode().equalsIgnoreCase("PZ")){
			adjUnitCode = caseData.getAdjustedUnitCode();
		}else{
			adjUnitCode = (wsdrReqData.getUnitOfIssue() != null) ? 
					wsdrReqData.getUnitOfIssue() : "";
		}		
		E_355_1 e3551 = new E_355_1();
		e3551.setValue(adjUnitCode);
		C_C001 cc001 = new C_C001();
		cc001.setE_Unit_Or_Basis_For_Measurement_Code(e3551);
		sqty.setC_Composite_Unit_Of_Measure(
				objectFactory.createS_QTYC_Composite_Unit_Of_Measure(cc001));

		sqtyList.add(sqty);
		segCnt.addSegmentCount();
	}
	
	/*
	// Senthil -- added quantity shipped
	private void setSQuantityShipped(L_NCD lncd){
		if (wsdrReqData.getShippedQuantity() != null) {
			List<S_QTY> sqtyList = lncd.getS_Quantity();
			S_QTY sqty = new S_QTY();
			E_673 e673 = new E_673();
			e673.setValue("39");
			sqty.setE_Quantity_Qualifier(e673);
			String shipQuantity = "0";
			if(wsdrReqData.getShippedQuantity() != null) {
				shipQuantity = String.valueOf(wsdrReqData.getShippedQuantity());
			}
			E_380 e380 = new E_380();
			e380.setValue(new BigDecimal(shipQuantity));
			sqty.setE_Quantity(e380);
			if (wsdrReqData.getUnitOfIssue() != null) {
				String unitOfIssue = wsdrReqData.getUnitOfIssue();				
				E_355_1 e3551 = new E_355_1();
				e3551.setValue(unitOfIssue);
				C_C001 cc001 = new C_C001();
				cc001.setE_Unit_Or_Basis_For_Measurement_Code(e3551);
				sqty.setC_Composite_Unit_Of_Measure(
						objectFactory.createS_QTYC_Composite_Unit_Of_Measure(cc001));
			}
			sqtyList.add(sqty);
			segCnt.addSegmentCount();
		}
	}
	
	// Senthil -- added quantity received
	private void setSQuantityReceived(L_NCD lncd){
		if (wsdrReqData.getReceivedQuantity() != null) {
			List<S_QTY> sqtyList = lncd.getS_Quantity();
			S_QTY sqty = new S_QTY();
			E_673 e673 = new E_673();
			e673.setValue("87");
			sqty.setE_Quantity_Qualifier(e673);
			String rcvdQuantity = "0";
			if(wsdrReqData.getReceivedQuantity() != null) {
				rcvdQuantity = String.valueOf(wsdrReqData.getReceivedQuantity());
			}
			E_380 e380 = new E_380();
			e380.setValue(new BigDecimal(rcvdQuantity));
			sqty.setE_Quantity(e380);
			if (wsdrReqData.getUnitOfIssue() != null) {
				String unitOfIssue = wsdrReqData.getUnitOfIssue();					
				E_355_1 e3551 = new E_355_1();
				e3551.setValue(unitOfIssue);
				C_C001 cc001 = new C_C001();
				cc001.setE_Unit_Or_Basis_For_Measurement_Code(e3551);
				sqty.setC_Composite_Unit_Of_Measure(
						objectFactory.createS_QTYC_Composite_Unit_Of_Measure(cc001));
			}
			sqtyList.add(sqty);
			segCnt.addSegmentCount();
		}
	}	
	*/
	
	private void setSMonetaryAmount(L_NCD lncd){
		List<S_AMT> samtList = lncd.getS_Monetary_Amount();
		S_AMT samt = new S_AMT();
		E_522 e522 = new E_522();
		e522.setValue("Z3");
		samt.setE_Amount_Qualifier_Code(e522);
		String adjUnitPrice = "0.0";
		if(caseData.getAdjustedUnitPrice() != null){
			adjUnitPrice=caseData.getAdjustedUnitPrice();
		}else{
			adjUnitPrice = (wsdrReqData.getUnitPrice() != null) ? 
					wsdrReqData.getUnitPrice().toString() : "0.0";
		}
		E_782_1 e7821 = new E_782_1();
		e7821.setValue(new BigDecimal(adjUnitPrice));
		samt.setE_Monetary_Amount(e7821);
		samtList.add(samt);
		segCnt.addSegmentCount();			
	}

	// Senthil 10/29
	private void setSMonetaryAmountTotal(L_NCD lncd){
		List<S_AMT> samtList = lncd.getS_Monetary_Amount();
		S_AMT samt = new S_AMT();
		E_522 e522 = new E_522();
		e522.setValue("10");
		samt.setE_Amount_Qualifier_Code(e522);
		BigDecimal totalAmt = new BigDecimal("0.0");
		if(caseData.getAdjustedUnitPrice() != null && caseData.getAdjustedQuantity() != null){
			totalAmt = new BigDecimal(caseData.getAdjustedUnitPrice()).multiply(new BigDecimal(caseData.getAdjustedQuantity()));
		} else if (wsdrReqData.getUnitPrice() != null && wsdrReqData.getUnitPrice() != null){
			totalAmt = wsdrReqData.getUnitPrice().multiply(new BigDecimal(wsdrReqData.getDiscrepancyQuantity()));
		} 
		E_782_1 e7821 = new E_782_1();
		e7821.setValue(totalAmt);
		samt.setE_Monetary_Amount(e7821);
		samtList.add(samt);
		segCnt.addSegmentCount();		
	}
	
	private void setLNonconformanceAction(L_NCD lncd){
		L_NCA lnca = new L_NCA();
		setSNonconformanceAction(lnca);
		setSNoteSpecialInstruction(lnca);
		setLName(lnca);
		setLCodeSourceInformation(lnca);
		lncd.getL_Nonconformance_Action().add(lnca);
	}
	
	private void setSNonconformanceAction(L_NCA lnca){
		S_NCA snca = new S_NCA();
		E_350_1 e3501 = new E_350_1();
		e3501.setValue("1");
		JAXBElement<E_350_1> e3501Jaxb = objectFactory.createS_NCAE_Assigned_Identification(e3501);
		snca.setE_Assigned_Identification(e3501Jaxb);
		E_887 e887 = new E_887();
		e887.setValue("RS");
		JAXBElement<E_887> e887Jaxb = objectFactory.createS_NCAE_Nonconformance_Resultant_Response_Code(e887);
		snca.setE_Nonconformance_Resultant_Response_Code(e887Jaxb);
		lnca.setS_Nonconformance_Action(snca);
		segCnt.addSegmentCount();
	}
	
	private void setSNoteSpecialInstruction(L_NCA lnca){
		if(caseData.getComments() == null || caseData.getComments().trim().length() == 0){
			return;
		}
		String comments = ResponseXmlHelper.replaceSpecialCharacters(caseData.getComments().trim());
		int noOfNteSegments = (int)Math.floor(comments.length()/80D + 0.999999D);
		logger.info("setSNoteSpecialInstruction(): Comments length->" + comments.length() +
				",Number of Comments ->" + noOfNteSegments);
		for(int i=0; i < noOfNteSegments; i++){
			String comment = (i != noOfNteSegments -1) ? comments.substring(i*80, i*80 + 80) :
				comments.substring(i*80);
			S_NTE snte = new S_NTE();
			E_363 e363 = new E_363();
			e363.setValue("AES");
			JAXBElement<E_363> e363Jaxb = objectFactory.createS_NTEE_Note_Reference_Code(e363);
			snte.setE_Note_Reference_Code(e363Jaxb);
			E_352 e352 = new E_352();
			e352.setValue(comment);
			snte.setE_Description(e352);
			lnca.getS_Note_Special_Instruction().add(snte);
			segCnt.addSegmentCount();			
		}
	}
	
	private void setLName(L_NCA lnca) {
		List<OrganizationInfo> orgInfoList = ResponseXmlHelper.getOrganiztionInfo(wsdrReqData);
		if(orgInfoList == null) return;
		List<L_N1_2> ln12List = lnca.getL_Name();
		boolean isSUSExists = false;
		for(OrganizationInfo orgInfo:orgInfoList){
			if(ResponseXmlHelper.isValidLncaOrganizationEntityCode(orgInfo.getEntitiyIdCode())){
				isSUSExists = true;
				L_N1_2 ln12 = new L_N1_2();
				if(orgInfo.getName() == null || orgInfo.getName().trim().isEmpty() ||
						orgInfo.getName().equals("GSA")){
					setSName(ln12, "SUS", "GSA", "M4","GSA");
				}else{
					setSName(ln12, orgInfo.getEntitiyIdCode(), orgInfo.getName(), orgInfo.getIdCdQualifier(),
							orgInfo.getIdentificationCode());
				}
				ln12List.add(ln12);
			}
		}
		if(!isSUSExists){
			L_N1_2 ln12 = new L_N1_2();
			setSName(ln12, "SUS", "GSA", "M4","GSA");
			ln12List.add(ln12);
		}
	}

	private void setSName(L_N1_2 ln12,String entityIdCode, String name, 
			String idCodeQualifier, String idCode){
		S_N1_2 sn12 = new S_N1_2();
		E_98_5 e985 = new E_98_5();
		e985.setValue(entityIdCode);
		E_93 e93 = new E_93();
		e93.setValue(name);
		JAXBElement<E_93> e93Jaxb = objectFactory.createS_N1E_Name(e93);
		E_66_3 e663 = new E_66_3();
		e663.setValue(idCodeQualifier);
		JAXBElement<E_66_3> e66Jaxb = objectFactory.createS_N1_2E_Identification_Code_Qualifier(e663);
		E_67 e67 = new E_67();
		e67.setValue(idCode);
		JAXBElement<E_67> e67Jaxb = objectFactory.createS_N1E_Identification_Code(e67);
			sn12.setE_Entity_Identifier_Code(e985);
		sn12.setE_Name(e93Jaxb);
		sn12.setE_Identification_Code_Qualifier(e66Jaxb);
		sn12.setE_Identification_Code(e67Jaxb);
		ln12.setS_Name(sn12);
		segCnt.addSegmentCount();
	}
	
	private void setLCodeSourceInformation(L_NCA lnca){
		List<L_LM_2> llmList = lnca.getL_Code_Source_Information();
		L_LM_2 llm2 = new L_LM_2();
		setSCodeSourceInformation(llm2, "DF");//TODO .. check how to get value or no value
		//Disposition Codes always from SF
		if(caseData.getDispositionCodeList() != null && 
				!caseData.getDispositionCodeList().isEmpty()){
			for(String dispCode:caseData.getDispositionCodeList()){
				if(dispCode != null && !dispCode.trim().isEmpty()){
					setSIndustryCode(llm2,"HD", dispCode);
				}
			}
		}
		if(caseData.getDiscrepancyCodeList() != null && 
				!caseData.getDiscrepancyCodeList().isEmpty()){
			for(String discrCode:caseData.getDiscrepancyCodeList()){
				if(discrCode != null && !discrCode.trim().isEmpty()){
					setSIndustryCode(llm2, "HA", discrCode);
				}
			}
		}else{
			//Discrepancy Code from Request
			List<IndustryCode> icList = ResponseXmlHelper.getIndustryCode(wsdrReqData);
			if(icList != null){
				for(IndustryCode ic:icList){
					if(ResponseXmlHelper.isValidLncaIndustryCode(ic.getQualifier())){
						if(ic.getIndustryCode() != null && !ic.getIndustryCode().trim().isEmpty()){
							setSIndustryCode(llm2,ic.getQualifier(), ic.getIndustryCode());
						}
					}
				}
			}
		}
		llmList.add(llm2);
	}
	
	private void setSCodeSourceInformation(L_LM_2 llm2, String agencyQualifierCode){
		S_LM slm = new S_LM();
		E_559 e559 = new E_559();
		e559.setValue(agencyQualifierCode);
		slm.setE_Agency_Qualifier_Code(e559);
		llm2.setS_Code_Source_Information(slm);
		segCnt.addSegmentCount();
	}
	
	private void setSIndustryCode(L_LM_2 llm2, String qualifierCode, String industryCode){
		List<S_LQ_2> slq2List = llm2.getS_Industry_Code();
		S_LQ_2 slq2 = new S_LQ_2();
		E_1270_2 e12702 = new E_1270_2();
		e12702.setValue(qualifierCode);
		E_1271 e2271 = new E_1271();
		e2271.setValue(industryCode);
		slq2.setE_Code_List_Qualifier_Code(e12702);
		slq2.setE_Industry_Code(e2271);
		slq2List.add(slq2);
		segCnt.addSegmentCount();
	}	
}
