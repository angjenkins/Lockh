/*
 * @(#)LHierarchicalLevelProcessor.java			Sep 3, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.model.IndustryCode;
import gov.gsa.fas.vision.dla.request.model.ItemIdentification;
import gov.gsa.fas.vision.dla.request.model.ReferenceIdentification;
import gov.gsa.fas.vision.dla.response.beans.E_127;
import gov.gsa.fas.vision.dla.response.beans.E_1270;
import gov.gsa.fas.vision.dla.response.beans.E_1271;
import gov.gsa.fas.vision.dla.response.beans.E_128;
import gov.gsa.fas.vision.dla.response.beans.E_234;
import gov.gsa.fas.vision.dla.response.beans.E_235;
import gov.gsa.fas.vision.dla.response.beans.E_352;
import gov.gsa.fas.vision.dla.response.beans.E_373;
import gov.gsa.fas.vision.dla.response.beans.E_374;
import gov.gsa.fas.vision.dla.response.beans.E_559;
import gov.gsa.fas.vision.dla.response.beans.E_628;
import gov.gsa.fas.vision.dla.response.beans.E_735;
import gov.gsa.fas.vision.dla.response.beans.E_755;
import gov.gsa.fas.vision.dla.response.beans.E_756;
import gov.gsa.fas.vision.dla.response.beans.L_HL;
import gov.gsa.fas.vision.dla.response.beans.L_LM;
import gov.gsa.fas.vision.dla.response.beans.ObjectFactory;
import gov.gsa.fas.vision.dla.response.beans.S_DTM;
import gov.gsa.fas.vision.dla.response.beans.S_HL;
import gov.gsa.fas.vision.dla.response.beans.S_LIN;
import gov.gsa.fas.vision.dla.response.beans.S_LM;
import gov.gsa.fas.vision.dla.response.beans.S_LQ;
import gov.gsa.fas.vision.dla.response.beans.S_PWK;
import gov.gsa.fas.vision.dla.response.beans.S_REF;
import gov.gsa.fas.vision.dla.response.beans.T_842;

/**
 * <code>LHierarchicalLevelProcessor</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class LHierarchicalLevelProcessor {
	private static final Logger logger = Logger.getLogger(LHierarchicalLevelProcessor.class.getName());
	private ObjectFactory objectFactory = new ObjectFactory();
	private T_842 t842;
	private WsdrRequestData wsdrReqData;
	private CaseOutcomeData caseData;
	private SegmentCount segCnt;
	
	LHierarchicalLevelProcessor(T_842 t842, WsdrRequestData wsdrReqData, 
			CaseOutcomeData caseData, SegmentCount segCnt){
		this.t842 = t842;
		this.wsdrReqData = wsdrReqData;
		this.caseData = caseData;
		this.segCnt = segCnt;
	}	
	
	void setLHierarchicalLevel(){
		logger.info("setLHierarchicalLevel():Setting L_Hierarchical_Level for VisionDLAKey->" + 
										caseData.getVisionDlaKey());
		List<L_HL> lhlList = t842.getL_Hierarchical_Level();
		L_HL lhl = new L_HL();
		setSHierarchicalLevel(lhl,"1","RB");
		List<ItemIdentification> itemIdList = ResponseXmlHelper.getItemIdentification(wsdrReqData);
		if(itemIdList != null){
			for(ItemIdentification itemId:itemIdList){
				if(itemId.getQualifier().equalsIgnoreCase("FS") ||
						itemId.getQualifier().equalsIgnoreCase("MG")){
					setSItemIdentification(lhl, itemId.getQualifier(), itemId.getIdentification());
				}
			}
		}
		setSDateTimeReference(lhl, "975", Utility.getNow("yyyyMMdd"));
		setSReferenceIdentification(lhl, "NN", wsdrReqData.getWebsdrNumber(),"WEBSDR");
		setSReferenceIdentification(lhl, "NN", String.valueOf(caseData.getVisionDlaKey()),"GSA");
		ReferenceIdentification riTN = ResponseXmlHelper.getReferenceIdentification(wsdrReqData, "TN");
		if(riTN != null){
			setSReferenceIdentification(lhl, riTN.getQualifier(), riTN.getIdentification(), riTN.getDescription());
		}
		ReferenceIdentification riW8 = ResponseXmlHelper.getReferenceIdentification(wsdrReqData, "W8");
		if(riW8 != null){
			setSReferenceIdentification(lhl, riW8.getQualifier(), riW8.getIdentification(), riW8.getDescription());
		}
		setLCodeSourceInformation(lhl);
		setSPaperWork(lhl);
		LNonConformanceProcessor lncdProcessor = new LNonConformanceProcessor(lhl, wsdrReqData, 
				caseData, segCnt);
		lncdProcessor.setLNonConformanceData();
		lhlList.add(lhl);
	}
	
	private void setSHierarchicalLevel(L_HL lhl, String idNumber, String levelCode){
		S_HL shl = new S_HL();
		E_628 e628 = new E_628();
		e628.setValue(idNumber);
		shl.setE_Hierarchical_ID_Number(e628);
		E_735 e735 = new E_735();
		e735.setValue(levelCode);
		shl.setE_Hierarchical_Level_Code(e735);
		lhl.setS_Hierarchical_Level(shl);
		segCnt.addSegmentCount();
	}
	
	private void setSItemIdentification(L_HL lhl, String idQualifier, String prodSrvcId){
		S_LIN slin = new S_LIN();
		E_235 e235 = new E_235();
		e235.setValue(idQualifier);
		E_234 e234 = new E_234();
		e234.setValue(prodSrvcId);
		slin.setE_Product_Service_ID_Qualifier(e235);
		slin.setE_Product_Service_ID(e234);
		JAXBElement<S_LIN> slinJaxb = objectFactory.createL_HLS_Item_Identification(slin);
		lhl.setS_Item_Identification(slinJaxb);
		segCnt.addSegmentCount();
	}
	
	private void setSDateTimeReference(L_HL lhl, String qualifier, String currentDate){
		List<S_DTM> sdtmList = lhl.getS_Date_Time_Reference();
		S_DTM sdtm = new S_DTM();
		E_374 e374 = new E_374();
		e374.setValue(qualifier);
		E_373 e373 = new E_373();
		e373.setValue(currentDate);
		sdtm.setE_Date_Time_Qualifier(e374);
		sdtm.setE_Date(e373);
		sdtmList.add(sdtm);
		segCnt.addSegmentCount();
	}
	
	private void setSReferenceIdentification(L_HL lhl, String riQualifier, 
			String refIdentification, String riDescription){
		List<S_REF> srefList = lhl.getS_Reference_Identification();
		S_REF sref = new S_REF();
		E_128 e128 = new E_128();
		e128.setValue(riQualifier);
		E_127 e127 = new E_127();
		e127.setValue(refIdentification);
		if(riDescription != null){
			E_352 e352 = new E_352();
			e352.setValue(riDescription);
			JAXBElement<E_352> e352Jaxb = objectFactory.createS_REFE_Description(e352);
			sref.setE_Description(e352Jaxb);
		}
		sref.setE_Reference_Identification_Qualifier(e128);
		sref.setE_Reference_Identification(e127);
		srefList.add(sref);
		segCnt.addSegmentCount();
	}
	
	private void setLCodeSourceInformation(L_HL lhl){
		List<L_LM> llmList = lhl.getL_Code_Source_Information();
		L_LM llm = new L_LM();
		setSCodeSourceInformation(llm, "DF");//TODO .. check how to get value or no value
		List<IndustryCode> icList = ResponseXmlHelper.getIndustryCode(wsdrReqData);
		if(icList != null){
			for(IndustryCode ic:icList){
				if(ResponseXmlHelper.isValidIndustryCode(ic.getQualifier())){
					setSIndustryCode(llm,ic.getQualifier(), ic.getIndustryCode());
				}
			}
		}
		llmList.add(llm);
	}
	
	private void setSCodeSourceInformation(L_LM llm, String agencyQualifierCode){
		S_LM slm = new S_LM();
		E_559 e559 = new E_559();
		e559.setValue(agencyQualifierCode);
		slm.setE_Agency_Qualifier_Code(e559);
		llm.setS_Code_Source_Information(slm);
		segCnt.addSegmentCount();
	}
	
	private void setSIndustryCode(L_LM llm, String qualifierCode, String industryCode){
		List<S_LQ> slqList = llm.getS_Industry_Code();
		S_LQ slq = new S_LQ();
		E_1270 e1270 = new E_1270();
		e1270.setValue(qualifierCode);
		E_1271 e2271 = new E_1271();
		e2271.setValue(industryCode);
		slq.setE_Code_List_Qualifier_Code(e1270);
		slq.setE_Industry_Code(e2271);
		slqList.add(slq);
		segCnt.addSegmentCount();
	}
	
	private void setSPaperWork(L_HL lhl){
		if(caseData.getAttachmentCount() == 0){
			return;
		}
		logger.info("setSPaperWork():" + caseData.getAttachmentNameList().size());
		for(String attName : caseData.getAttachmentNameList()){
			S_PWK spwk = new S_PWK();
			E_755 e755 = new E_755();
			e755.setValue("AE");
			spwk.setE_Report_Type_Code(e755);
			E_756 e756 = new E_756();
			e756.setValue("FT");
			spwk.setE_Report_Transmission_Code(objectFactory.
					createS_PWKE_Report_Transmission_Code(e756));
			E_352 e352 = new E_352();
			e352.setValue(attName);
			spwk.setE_Description(objectFactory.
					createS_NCAE_Description(e352));
			lhl.getS_Paperwork().add(spwk);	
		}
	}
}
