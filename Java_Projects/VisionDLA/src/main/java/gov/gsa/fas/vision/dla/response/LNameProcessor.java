/*
 * @(#)LNameProcessor.java			Sep 3, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.model.OrganizationInfo;
import gov.gsa.fas.vision.dla.response.beans.E_364;
import gov.gsa.fas.vision.dla.response.beans.E_365;
import gov.gsa.fas.vision.dla.response.beans.E_366;
import gov.gsa.fas.vision.dla.response.beans.E_66;
import gov.gsa.fas.vision.dla.response.beans.E_67;
import gov.gsa.fas.vision.dla.response.beans.E_93;
import gov.gsa.fas.vision.dla.response.beans.E_98;
import gov.gsa.fas.vision.dla.response.beans.E_98_1;
import gov.gsa.fas.vision.dla.response.beans.L_N1;
import gov.gsa.fas.vision.dla.response.beans.ObjectFactory;
import gov.gsa.fas.vision.dla.response.beans.S_N1;
import gov.gsa.fas.vision.dla.response.beans.S_PER;
import gov.gsa.fas.vision.dla.response.beans.T_842;

/**
 * <code>LNameProcessor</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class LNameProcessor {
	
	private static final Logger logger = Logger.getLogger(LNameProcessor.class.getName());
	private ObjectFactory objectFactory = new ObjectFactory();
	private T_842 t842;
	private WsdrRequestData wsdrReqData;
	private CaseOutcomeData caseData;
	private SegmentCount segCnt;
	
	LNameProcessor(T_842 t842, WsdrRequestData wsdrReqData, 
			CaseOutcomeData caseData, SegmentCount segCnt){
		this.t842 = t842;
		this.wsdrReqData = wsdrReqData;
		this.caseData = caseData;
		this.segCnt = segCnt;
	}		
	
	void setLName(){
		logger.info("setLName():Setting L_Name for VisionDLAKey->" + caseData.getVisionDlaKey());
		List<L_N1> ln1List = t842.getL_Name();
		ln1List.add(createLn1ZD());
		ln1List.add(createLn191());
	}
	
	private L_N1 createLn1ZD(){
		L_N1 ln1ZD = new L_N1();
		String entityIdCode = "ZD";
		if(wsdrReqData.isDodAacValid()){
			// check 41 or Z6 and identification code qualifier = 10
			OrganizationInfo orgInfo = ResponseXmlHelper.getOrganizationInfo(wsdrReqData, "41", "10");//ResponseXmlHelper.getOrganiztionInfo(wsdrReqData, "ZD");
			if (orgInfo == null) {
				orgInfo = ResponseXmlHelper.getOrganizationInfo(wsdrReqData, "Z6", "10");
			}
			
			// if we did not find the submitter dodaac, then use DLA
			if (orgInfo == null) {
				setSName(ln1ZD, entityIdCode, "DLA", "M4", "SMS", "TO");
			} else {
				setSName(ln1ZD, entityIdCode, orgInfo.getName(),
						orgInfo.getIdCdQualifier(), orgInfo.getIdentificationCode(), "TO");
			}
		}else{
			setSName(ln1ZD, entityIdCode, "DLA", "M4", "SMS", "TO");
		}
		return ln1ZD;
	}
	
	private L_N1 createLn191(){
		L_N1 ln191 = new L_N1();
		setSName(ln191,"91", "General Services Administration", 
				"M4", "GSA", "FR");
		setAdministrativeCommunicationsContact(ln191, "RZ", "General Services Administration", 
				"EM", "NCSCcustomer.service@gsa.gov", "TE", "1-800-488-3111");
		return ln191;
	}	
	
	private void setSName(L_N1 ln1, String entityIdCode, String name, 
			String idCodeQualifier, String idCode, String idCode1){
		S_N1 sn1 = new S_N1();
		E_98 e98 = new E_98();
		e98.setValue(entityIdCode);
		if(name != null){
			E_93 e93 = new E_93();
			e93.setValue(name);
			JAXBElement<E_93> e93Jaxb = objectFactory.createS_N1E_Name(e93);
			sn1.setE_Name(e93Jaxb);
		}
		E_66 e66 = new E_66();
		e66.setValue(idCodeQualifier);
		JAXBElement<E_66> e66Jaxb = objectFactory.createS_N1E_Identification_Code_Qualifier(e66);
		E_67 e67 = new E_67();
		e67.setValue(idCode);
		JAXBElement<E_67> e67Jaxb = objectFactory.createS_N1E_Identification_Code(e67);
		E_98_1 e981 = new E_98_1();
		e981.setValue(idCode1);
		JAXBElement<E_98_1> e981Jaxb = objectFactory.createS_N1E_Entity_Identifier_Code_1(e981);
		sn1.setE_Entity_Identifier_Code(e98);
		sn1.setE_Identification_Code_Qualifier(e66Jaxb);
		sn1.setE_Identification_Code(e67Jaxb);
		sn1.setE_Entity_Identifier_Code_1(e981Jaxb);
		ln1.setS_Name(sn1);
		segCnt.addSegmentCount();
	}
	
	private void setAdministrativeCommunicationsContact(L_N1 ln1, String functionCode, String name, 
			String commNumberQualifier, String commNumber, String commNumberQualifier1, String commNumber1){
		 S_PER sper = new S_PER();
		 E_366 e366 = new E_366();
		 e366.setValue(functionCode);
		 E_93 e93 = new E_93();
		 e93.setValue(name);
		 JAXBElement<E_93> e93Jaxb = objectFactory.createS_PERE_Name(e93);
		 E_365 e365 = new E_365();
		 e365.setValue(commNumberQualifier);
		 JAXBElement<E_365> e365Jaxb = objectFactory.createS_PERE_Communication_Number_Qualifier(e365);
		 E_364 e364 = new E_364();
		 e364.setValue(commNumber);
		 JAXBElement<E_364> e364Jaxb = objectFactory.createS_PERE_Communication_Number(e364);
		 E_365 e3651 = new E_365();
		 e3651.setValue(commNumberQualifier1);
		 JAXBElement<E_365> e365Jaxb1 = objectFactory.createS_PERE_Communication_Number_Qualifier_1(e3651);
		 E_364 e3641 = new E_364();
		 e3641.setValue(commNumber1);
		 JAXBElement<E_364> e364Jaxb1 = objectFactory.createS_PERE_Communication_Number_1(e3641);		 
		 sper.setE_Contact_Function_Code(e366);
		 sper.setE_Name(e93Jaxb);
		 sper.setE_Communication_Number_Qualifier(e365Jaxb);
		 sper.setE_Communication_Number(e364Jaxb);
		 sper.setE_Communication_Number_Qualifier_1(e365Jaxb1);
		 sper.setE_Communication_Number_1(e364Jaxb1);
		 ln1.getS_Administrative_Communications_Contact().add(sper);
		 segCnt.addSegmentCount();
	}	
}
