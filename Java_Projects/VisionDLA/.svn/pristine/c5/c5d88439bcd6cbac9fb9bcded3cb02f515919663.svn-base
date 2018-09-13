/*
 * @(#)T842Processor.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import gov.gsa.fas.vision.dla.request.beans.C_C040;
import gov.gsa.fas.vision.dla.request.beans.L_HL;
import gov.gsa.fas.vision.dla.request.beans.L_LM;
import gov.gsa.fas.vision.dla.request.beans.L_LM_1;
import gov.gsa.fas.vision.dla.request.beans.L_N1;
import gov.gsa.fas.vision.dla.request.beans.L_N1_1;
import gov.gsa.fas.vision.dla.request.beans.L_NCD;
import gov.gsa.fas.vision.dla.request.beans.S_AMT;
import gov.gsa.fas.vision.dla.request.beans.S_LIN;
import gov.gsa.fas.vision.dla.request.beans.S_LQ;
import gov.gsa.fas.vision.dla.request.beans.S_LQ_1;
import gov.gsa.fas.vision.dla.request.beans.S_N1_1;
import gov.gsa.fas.vision.dla.request.beans.S_NTE;
import gov.gsa.fas.vision.dla.request.beans.S_PER;
import gov.gsa.fas.vision.dla.request.beans.S_PER_1;
import gov.gsa.fas.vision.dla.request.beans.S_PWK;
import gov.gsa.fas.vision.dla.request.beans.S_QTY;
import gov.gsa.fas.vision.dla.request.beans.S_REF;
import gov.gsa.fas.vision.dla.request.beans.S_REF_1;
import gov.gsa.fas.vision.dla.request.beans.T_842;
import gov.gsa.fas.vision.dla.request.model.AdministrativeContact;
import gov.gsa.fas.vision.dla.request.model.IndustryCode;
import gov.gsa.fas.vision.dla.request.model.InstructionNote;
import gov.gsa.fas.vision.dla.request.model.ItemIdentification;
import gov.gsa.fas.vision.dla.request.model.MonetaryAmount;
import gov.gsa.fas.vision.dla.request.model.OrganizationInfo;
import gov.gsa.fas.vision.dla.request.model.Quantity;
import gov.gsa.fas.vision.dla.request.model.ReferenceIdentification;

/**
 * <code>T842Processor</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class T842Processor {

	static List<ReferenceIdentification> getReferenceIdentification(T_842 t842){
		List<ReferenceIdentification> listRefId = new ArrayList <ReferenceIdentification>();
		for(L_HL lhl : t842.getL_Hierarchical_Level()){
			for (S_REF sref : lhl.getS_Reference_Identification()) {
				ReferenceIdentification refId = new ReferenceIdentification();
				refId.setQualifier(sref.getE_Reference_Identification_Qualifier().getValue());
				refId.setIdentification(sref.getE_Reference_Identification().getValue());
				if(sref.getE_Description() != null && sref.getE_Description().getValue() != null){
					refId.setDescription(sref.getE_Description().getValue().getValue());
				}
				listRefId.add(refId);
			}
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				for (S_REF_1 sref : lncd.getS_Reference_Identification()) {
					ReferenceIdentification refId = new ReferenceIdentification();
					refId.setQualifier(sref.getE_Reference_Identification_Qualifier().getValue());
					refId.setIdentification(sref.getE_Reference_Identification().getValue().getValue());
					if(sref.getE_Description() != null && sref.getE_Description().getValue() != null){
						refId.setDescription(sref.getE_Description().getValue().getValue());
					}
					listRefId.add(refId);
				}
				
			}
			
		}
		return listRefId;
	}
	
	// retrieve document number suffix if available
	static String getDocumentPrefix(T_842 t842) {
		String docPrefix = null;
		
		for(L_HL lhl : t842.getL_Hierarchical_Level()){
			for (S_REF sref : lhl.getS_Reference_Identification()) {
				if (sref.getC_Reference_Identifier() != null && sref.getC_Reference_Identifier().getValue() != null) {
					C_C040 cref = sref.getC_Reference_Identifier().getValue();
					if ("W8".equals(cref.getE_Reference_Identification_Qualifier().getValue())) {
						docPrefix = cref.getE_Reference_Identification().getValue();
						break;
					}
				}
			}
		}
		
		return docPrefix;
	}
	
	static List<OrganizationInfo> getOrganizationInfo(T_842 t842){
		List<OrganizationInfo> orgInfoList = new ArrayList<OrganizationInfo>();
		List<L_N1> ln1List =t842.getL_Name();
		List<L_HL> lhlList = t842.getL_Hierarchical_Level();
		for (L_N1 ln1 : ln1List) {
			if (ln1.getS_Name() != null && ln1.getS_Name().getE_Entity_Identifier_Code() != null
					&& ln1.getS_Name().getE_Entity_Identifier_Code().getValue() != null
					&& ln1.getS_Name().getE_Identification_Code_Qualifier() != null
					&& ln1.getS_Name().getE_Identification_Code_Qualifier().getValue() != null 
					&& ln1.getS_Name().getE_Identification_Code_Qualifier().getValue().getValue() != null) {
				OrganizationInfo organizationInfo = new OrganizationInfo();
				organizationInfo.setEntitiyIdCode(ln1.getS_Name().getE_Entity_Identifier_Code().getValue());
				organizationInfo.setIdCdQualifier(ln1.getS_Name().getE_Identification_Code_Qualifier().getValue().getValue());
				if(ln1.getS_Name().getE_Identification_Code() != null &&
						ln1.getS_Name().getE_Identification_Code().getValue() != null){
					organizationInfo.setIdentificationCode(ln1.getS_Name().getE_Identification_Code().getValue().getValue());
				}
				if(ln1.getS_Name().getE_Name() != null &&
						ln1.getS_Name().getE_Name().getValue() != null){
					organizationInfo.setName(ln1.getS_Name().getE_Name().getValue().getValue());
				}
				orgInfoList.add(organizationInfo);
			}
		}
		for (L_HL lhl : lhlList) {
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				for (L_N1_1 ln11 : lncd.getL_Name()) {
					S_N1_1 sn11 = ln11.getS_Name();
					if (ln11.getS_Name() != null
							&& sn11.getE_Entity_Identifier_Code() != null
							&& sn11.getE_Entity_Identifier_Code().getValue() != null
							&& sn11.getE_Identification_Code_Qualifier() != null
							&& sn11.getE_Identification_Code_Qualifier().getValue() != null) {
						OrganizationInfo organizationInfo = new OrganizationInfo();
						organizationInfo.setEntitiyIdCode(sn11.getE_Entity_Identifier_Code().getValue());
						organizationInfo.setIdCdQualifier(sn11.getE_Identification_Code_Qualifier().getValue().getValue());
						organizationInfo.setIdentificationCode(sn11.getE_Identification_Code().getValue().getValue());
						if(sn11.getE_Name() != null && sn11.getE_Name().getValue() != null){
							organizationInfo.setName(sn11.getE_Name().getValue().getValue());
						}
						orgInfoList.add(organizationInfo);
					}
				}
			}
		}	
		return orgInfoList;
	}
	
	static List<Quantity> getQuantity(T_842 t842){
		List<Quantity> quantityList = new ArrayList<Quantity>();
		List<L_HL> listLhl = t842.getL_Hierarchical_Level();
		for (L_HL lhl : listLhl) {
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				List<S_QTY> sqtyList = lncd.getS_Quantity();
				for (S_QTY sqty : sqtyList) {
					Quantity quantity = new Quantity();
					quantity.setQualifier(sqty.getE_Quantity_Qualifier().getValue());
					quantity.setQuantity(sqty.getE_Quantity().getValue().intValue());
					if (sqty.getC_Composite_Unit_Of_Measure()!= null 
							&& sqty.getC_Composite_Unit_Of_Measure().getValue() != null
							&& sqty.getC_Composite_Unit_Of_Measure().getValue().
							getE_Unit_Or_Basis_For_Measurement_Code() != null){
						quantity.setUnitCode(sqty.getC_Composite_Unit_Of_Measure().getValue().
							getE_Unit_Or_Basis_For_Measurement_Code().getValue());
					}
					quantityList.add(quantity);
				}
			}
		}		
		return quantityList;
	}
	
	static List<ItemIdentification> getIdentification(T_842 t842){
		List<ItemIdentification> itemIdList = new ArrayList<ItemIdentification>();
		
		List<L_HL> lhlList = t842.getL_Hierarchical_Level();
		L_HL lhl = null;
		if (lhlList != null && !lhlList.isEmpty()) {
			lhl = lhlList.get(0);
		}
		if(lhl == null){return itemIdList;}
		
		JAXBElement<S_LIN> slin_jbe = lhl.getS_Item_Identification();
		S_LIN slin = null;
		if (slin_jbe != null && slin_jbe.getValue() != null){
			slin = slin_jbe.getValue() ;
		}
		if(slin == null) {return itemIdList;}

		ItemIdentification itemId = null; 
		if(slin.getE_Product_Service_ID_Qualifier() != null) {
			itemId = new ItemIdentification();
			itemId.setQualifier(slin.getE_Product_Service_ID_Qualifier().getValue());
		}
		if(slin.getE_Product_Service_ID() != null){
			itemId.setIdentification(slin.getE_Product_Service_ID().getValue());
		}
		if(itemId !=null) itemIdList.add(itemId);
		
		ItemIdentification itemId1 = null;
		if(slin.getE_Product_Service_ID_Qualifier_1() != null &&
				slin.getE_Product_Service_ID_Qualifier_1().getValue() != null) {
			itemId1 = new ItemIdentification();
			itemId1.setQualifier(slin.getE_Product_Service_ID_Qualifier_1().getValue().getValue());
		}
		if(slin.getE_Product_Service_ID_1() != null &&
				slin.getE_Product_Service_ID_1().getValue() != null){
			itemId1.setIdentification(slin.getE_Product_Service_ID_1().getValue().getValue());
		}
		if(itemId1 !=null) itemIdList.add(itemId1);

		ItemIdentification itemId2 = null;
		if(slin.getE_Product_Service_ID_Qualifier_2() != null &&
				slin.getE_Product_Service_ID_Qualifier_2().getValue() != null) {
			itemId2 = new ItemIdentification();
			itemId2.setQualifier(slin.getE_Product_Service_ID_Qualifier_2().getValue().getValue());
		}
		if(slin.getE_Product_Service_ID_2() != null &&
				slin.getE_Product_Service_ID_2().getValue() != null){
			itemId2.setIdentification(slin.getE_Product_Service_ID_2().getValue().getValue());
		}
		if(itemId2 !=null) itemIdList.add(itemId2);

		ItemIdentification itemId3 = null;
		if(slin.getE_Product_Service_ID_Qualifier_3() != null &&
				slin.getE_Product_Service_ID_Qualifier_3().getValue() != null) {
			itemId3 = new ItemIdentification();
			itemId3.setQualifier(slin.getE_Product_Service_ID_Qualifier_3().getValue().getValue());
		}
		if(slin.getE_Product_Service_ID_3() != null &&
				slin.getE_Product_Service_ID_3().getValue() != null){
			itemId3.setIdentification(slin.getE_Product_Service_ID_3().getValue().getValue());
		}
		if(itemId3 !=null) itemIdList.add(itemId3);
		return itemIdList;
	}	
	
	static List<MonetaryAmount> getMonetaryAmount(T_842 t842){
		List<MonetaryAmount> monAmtList = new ArrayList<MonetaryAmount>();
		List<L_HL> lhlList = t842.getL_Hierarchical_Level();
		for (L_HL lhl : lhlList) {
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				List<S_AMT> samtList = lncd.getS_Monetary_Amount();
				for (S_AMT samt : samtList) {
					if (samt.getE_Monetary_Amount() != null
							&& samt.getE_Monetary_Amount().getValue() != null
							&& samt.getE_Amount_Qualifier_Code() != null
							&& samt.getE_Amount_Qualifier_Code().getValue() != null) {
						MonetaryAmount monetaryAmount = new MonetaryAmount();
						monetaryAmount.setAmount(samt.getE_Monetary_Amount().getValue());
						monetaryAmount.setQualifier(samt.getE_Amount_Qualifier_Code().getValue());
						monAmtList.add(monetaryAmount);
					}
				}
			}
		}
		return monAmtList;		
	}
	
	static List<IndustryCode> getIndustryCode(T_842 t842){
		List<IndustryCode> icList = new ArrayList<IndustryCode>();
		List<L_HL> lhlList = t842.getL_Hierarchical_Level();
		for (L_HL lhl : lhlList) {
			for (L_LM llm : lhl.getL_Code_Source_Information()) {
				for (S_LQ slq : llm.getS_Industry_Code()) {
					if (slq.getE_Code_List_Qualifier_Code() != null
							&& slq.getE_Code_List_Qualifier_Code().getValue() != null
							&& slq.getE_Industry_Code() != null
							&& slq.getE_Industry_Code().getValue() != null) {
						IndustryCode industryCode = new IndustryCode();
						industryCode.setQualifier(slq.getE_Code_List_Qualifier_Code().getValue());
						industryCode.setIndustryCode(slq.getE_Industry_Code().getValue());
						icList.add(industryCode);
					}
				}
			}
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				for (L_LM_1 llm1 : lncd.getL_Code_Source_Information()) {
					for (S_LQ_1 slq1 : llm1.getS_Industry_Code()) {
						if (slq1.getE_Code_List_Qualifier_Code() != null
								&& slq1.getE_Code_List_Qualifier_Code().getValue() != null
								&& slq1.getE_Industry_Code() != null
								&& slq1.getE_Industry_Code().getValue() != null) {
							IndustryCode industryCode = new IndustryCode();
							industryCode.setQualifier(slq1.getE_Code_List_Qualifier_Code().getValue());
							industryCode.setIndustryCode(slq1.getE_Industry_Code().getValue());
							icList.add(industryCode);
						}
					}
				}
			}
		}
		return icList;		
	}
	
	static List<AdministrativeContact> getAdministrativeContact(T_842 t842){
		List<AdministrativeContact> contactList = new ArrayList<AdministrativeContact>();
		List<L_N1> ln1List = t842.getL_Name();
		for (L_N1 ln1 : ln1List) {
			for (S_PER sper : ln1.getS_Administrative_Communications_Contact()) {
				if(sper == null){
					continue;
				}
				AdministrativeContact adminContact = new AdministrativeContact();
				if(sper.getE_Contact_Function_Code() != null && 
						sper.getE_Contact_Function_Code().getValue() != null){
					adminContact.setFunctionCode(sper.getE_Contact_Function_Code().getValue());
				}
				if(sper.getE_Name() != null 
						&& sper.getE_Name().getValue() != null
						&& sper.getE_Name().getValue().getValue() != null){
					adminContact.setContactName(sper.getE_Name().getValue().getValue());
				}
				if(sper.getE_Communication_Number_Qualifier() != null
						&& sper.getE_Communication_Number_Qualifier().getValue() != null
						&& sper.getE_Communication_Number_Qualifier().getValue().getValue() != null){
					adminContact.setQualifier(sper.getE_Communication_Number_Qualifier().getValue().getValue());
				}
				if(sper.getE_Communication_Number() != null
						&& sper.getE_Communication_Number().getValue() != null
						&& sper.getE_Communication_Number().getValue().getValue() != null){
					adminContact.setContact(sper.getE_Communication_Number().getValue().getValue());
				}
				if(sper.getE_Communication_Number_Qualifier_1() != null
						&& sper.getE_Communication_Number_Qualifier_1().getValue() != null
						&& sper.getE_Communication_Number_Qualifier_1().getValue().getValue() != null){
					adminContact.setQualifier1(sper.getE_Communication_Number_Qualifier_1().getValue().getValue());
				}
				if(sper.getE_Communication_Number_1() != null
						&& sper.getE_Communication_Number_1().getValue() != null
						&& sper.getE_Communication_Number_1().getValue().getValue() != null){
					adminContact.setContact1(sper.getE_Communication_Number_1().getValue().getValue());
				}	
				if(sper.getE_Communication_Number_Qualifier_2() != null
						&& sper.getE_Communication_Number_Qualifier_2().getValue() != null
						&& sper.getE_Communication_Number_Qualifier_2().getValue().getValue() != null){
					adminContact.setQualifier2(sper.getE_Communication_Number_Qualifier_2().getValue().getValue());
				}
				if(sper.getE_Communication_Number_2() != null
						&& sper.getE_Communication_Number_2().getValue() != null
						&& sper.getE_Communication_Number_2().getValue().getValue() != null){
					adminContact.setContact2(sper.getE_Communication_Number_2().getValue().getValue());
				}
				contactList.add(adminContact);
			}
		}
		
		List<L_HL> listLhl = t842.getL_Hierarchical_Level();
		for (L_HL lhl : listLhl) {
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				for (L_N1_1 ln11 : lncd.getL_Name()) {
					for (S_PER_1 sper1 : ln11.getS_Administrative_Communications_Contact()) {
						if(sper1 == null){continue;}
						AdministrativeContact contact = new AdministrativeContact();
						contact.setNonConformance(true);
						if(sper1.getE_Contact_Function_Code() != null &&
								sper1.getE_Contact_Function_Code().getValue() != null){
							contact.setFunctionCode(sper1.getE_Contact_Function_Code().getValue());
						}
						if(sper1.getE_Name() != null && sper1.getE_Name().getValue() != null &&
								sper1.getE_Name().getValue().getValue() != null){
							contact.setContactName(sper1.getE_Name().getValue().getValue());
						}
						if(sper1.getE_Communication_Number_Qualifier() != null
								&& sper1.getE_Communication_Number_Qualifier().getValue() != null
								&& sper1.getE_Communication_Number_Qualifier().getValue().getValue() != null){
							contact.setQualifier(sper1.getE_Communication_Number_Qualifier().getValue().getValue());
						}
						if(sper1.getE_Communication_Number() != null
								&& sper1.getE_Communication_Number().getValue() != null
								&& sper1.getE_Communication_Number().getValue().getValue() != null){
							contact.setContact(sper1.getE_Communication_Number().getValue().getValue());
						}
						if(sper1.getE_Communication_Number_Qualifier_1() != null
								&& sper1.getE_Communication_Number_Qualifier_1().getValue() != null
								&& sper1.getE_Communication_Number_Qualifier_1().getValue().getValue() != null){
							contact.setQualifier1(sper1.getE_Communication_Number_Qualifier_1().getValue().getValue());
						}
						if(sper1.getE_Communication_Number_1() != null
								&& sper1.getE_Communication_Number_1().getValue() != null
								&& sper1.getE_Communication_Number_1().getValue().getValue() != null){
							contact.setContact1(sper1.getE_Communication_Number_1().getValue().getValue());
						}	
						if(sper1.getE_Communication_Number_Qualifier_2() != null
								&& sper1.getE_Communication_Number_Qualifier_2().getValue() != null
								&& sper1.getE_Communication_Number_Qualifier_2().getValue().getValue() != null){
							contact.setQualifier2(sper1.getE_Communication_Number_Qualifier_2().getValue().getValue());
						}
						if(sper1.getE_Communication_Number_2() != null
								&& sper1.getE_Communication_Number_2().getValue() != null
								&& sper1.getE_Communication_Number_2().getValue().getValue() != null){
							contact.setContact2(sper1.getE_Communication_Number_2().getValue().getValue());
						}
						contactList.add(contact);						
					}
				}
			}
		}
		return contactList;
	}
	
	static List<InstructionNote> getInstructionNote(T_842 t842) {
		List<InstructionNote> listNotes = new ArrayList<InstructionNote>();
		List<L_HL> listLhl = t842.getL_Hierarchical_Level();
		for (L_HL lhl : listLhl) {
			for (L_NCD lncd : lhl.getL_Nonconformance_Description()) {
				List<S_NTE> snteList = lncd.getS_Note_Special_Instruction();
				for (S_NTE snte : snteList) {
					InstructionNote instructionNote = new InstructionNote();
					if (snte.getE_Note_Reference_Code() != null && 
							snte.getE_Note_Reference_Code().getValue() != null &&
							snte.getE_Description() != null) {
						instructionNote.setReferenceCode(snte.getE_Note_Reference_Code().getValue());
						instructionNote.setDescription(snte.getE_Description().getValue());
					}
					listNotes.add(instructionNote);
				}
			}
		}
		return listNotes;
	}
	
	static List<String> getPaperwork(T_842 t842){
		List<String> pwList = new ArrayList<String>();
		List<L_HL> listLhl=t842.getL_Hierarchical_Level();
		for (L_HL lhl : listLhl) {
			for (S_PWK spwk : lhl.getS_Paperwork()) {
				if (spwk != null && spwk.getE_Report_Type_Code() != null
						&& spwk.getE_Report_Transmission_Code() != null
						&& spwk.getE_Report_Transmission_Code().getValue() != null
						&& spwk.getE_Description() != null
						&& spwk.getE_Description().getValue() != null) {
					pwList.add(spwk.getE_Description().getValue().getValue());
				}
			}
		}		
		return pwList;
	}
}

