/*
 * @(#)WsdrSalesforceTransformation.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sf;

import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.mf.CafAddress;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.sf.caserequest.AttachmentItem;
import gov.gsa.fas.vision.dla.sf.caserequest.AttachmentItemList;
import gov.gsa.fas.vision.dla.sf.caserequest.AttachmentNameList;
import gov.gsa.fas.vision.dla.sf.caserequest.ContactInformation;
import gov.gsa.fas.vision.dla.sf.caserequest.ContactPhone;
import gov.gsa.fas.vision.dla.sf.caserequest.ContactPhoneList;
import gov.gsa.fas.vision.dla.sf.caserequest.DLAAttachment;
import gov.gsa.fas.vision.dla.sf.caserequest.DLARequest;
import gov.gsa.fas.vision.dla.sf.caserequest.DiscrepancyItem;
import gov.gsa.fas.vision.dla.sf.caserequest.DiscrepancyItemList;
import gov.gsa.fas.vision.dla.sf.caserequest.SubmitterInformation;
import gov.gsa.fas.vision.dla.sf.caserequest.WrongItemInformation;

/**
 * <code>WsdrSalesforceTransformation</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class WsdrSalesforceTransformation {
	
	private static final Logger logger = Logger.getLogger(WsdrSalesforceTransformation.class.getName());
	
	static DLARequest transformRequestData(WsdrRequestData wsdrData){
		if(wsdrData == null){
			logger.error("transformRequestData(): WsdrRequest Data from XML is null");
			return null;
		}
		logger.info("transformRequestData(): Transforming Wsdr Data to Salesforce-" +
				"VisionDlaKey->" + wsdrData.getVisionDlaId());
		DLARequest dlaReq = new DLARequest();
		dlaReq.setVisionDLAKey(String.valueOf(wsdrData.getVisionDlaId()));
		dlaReq.setActionCode(wsdrData.getActionCode());
		transformAttachements(wsdrData, dlaReq);
		transformContactDetails(wsdrData, dlaReq);
		transformDiscrepancyList(wsdrData, dlaReq);
		transformWrongItemInformation(wsdrData,dlaReq);
		if(wsdrData.getDiscrepancyQuantity() != null){
			dlaReq.setDiscrepancyQuantity(wsdrData.getDiscrepancyQuantity().toString());
		}
		if(wsdrData.getDocumentNumber() != null){
			dlaReq.setDocumentNumber(wsdrData.getDocumentNumber());
		}
		if(wsdrData.getDocNumberSuffix() != null){
			dlaReq.setDocumentNumberSuffix(wsdrData.getDocNumberSuffix());
		}		
		if(wsdrData.getDocumentType() != null){
			dlaReq.setDocumentType(wsdrData.getDocumentType());
		}
		if(wsdrData.getWebsdrNumber() != null){
			dlaReq.setDoDWebSDR(wsdrData.getWebsdrNumber());
		}
		dlaReq.setIsDocumentNumberValid(wsdrData.isDocumentNumberValid());
		dlaReq.setIsDocumentSuffixValid(true);// TODO .. Find out how to valid Suffix
		dlaReq.setIsSubmitterDoDAACValid(wsdrData.isDodAacValid());
		if(wsdrData.getNsnDescription() != null){
			dlaReq.setNomenclature(wsdrData.getNsnDescription());
		}
		if(wsdrData.getNSN() != null){
			dlaReq.setNSN(wsdrData.getNSN());
		}
		if(wsdrData.getReceivedQuantity() != null){
			dlaReq.setQuantityReceived(wsdrData.getReceivedQuantity().toString());
		}
		if(wsdrData.getShippedQuantity() != null){
			dlaReq.setQuantityShipped(wsdrData.getShippedQuantity().toString());
		}
		transformRemarks(wsdrData, dlaReq);
		if(wsdrData.getSdrType() != null){
			dlaReq.setSDRType(wsdrData.getSdrType());
		}
		transformSubmitterDetails(wsdrData, dlaReq);
		if(wsdrData.getTotalCost() != null){
			dlaReq.setTotalCost(wsdrData.getTotalCost().toString());
		}
		if(wsdrData.getTransactionPurposeCode() != null){
			dlaReq.setTransactionPurposeCode(wsdrData.getTransactionPurposeCode());
		}
		if(wsdrData.getUnitOfIssue() != null){
			dlaReq.setUnitOfIssue(wsdrData.getUnitOfIssue());
		}
		if(wsdrData.getUnitPrice() != null){
			dlaReq.setUnitPrice(wsdrData.getUnitPrice().toString());
		}
		return dlaReq;
	}
	
	private static void transformWrongItemInformation(WsdrRequestData wsdrData,
			DLARequest dlaReq) {
				dlaReq.setWrongItemInfo(new WrongItemInformation());
				dlaReq.getWrongItemInfo().setWrongItemUI(wsdrData.getWrongItemUI());
				dlaReq.getWrongItemInfo().setWrongItemCAGECode(wsdrData.getWrongItemCAGECode());
				dlaReq.getWrongItemInfo().setWrongItemDescription(wsdrData.getWrongItemDescription());
				dlaReq.getWrongItemInfo().setWrongItemManufacturerName(wsdrData.getWrongItemManufacturerName());
				dlaReq.getWrongItemInfo().setWrongItemNSN(wsdrData.getWrongItemNSN());
				dlaReq.getWrongItemInfo().setWrongItemPartNumber(wsdrData.getWrongItemPartNumber());
				dlaReq.getWrongItemInfo().setWrongItemQuantityReceived(wsdrData.getWrongItemQuantityReceived());
	
	}

	private static void transformAttachements(WsdrRequestData wsdrData, DLARequest dlaReq){
		if(wsdrData.getAttachmentNames() == null || 
				wsdrData.getAttachmentNames().size() == 0){
			dlaReq.setHasAttachment(false);
		}else{
			List<String> attNames = wsdrData.getAttachmentNames();
			AttachmentNameList attNameList = new AttachmentNameList();
			for(String attName:attNames){
				attNameList.getAttachmentName().add(attName);
			}
			dlaReq.setAttachmentNameList(attNameList);
		}		
	}
	
	private static void transformContactDetails(WsdrRequestData wsdrData, DLARequest dlaReq){
		if(wsdrData.getContactName() != null || wsdrData.getContactEmail() != null ||
				wsdrData.getContactPhone() != null){
			ContactInformation contactInfo = new ContactInformation();
			if(wsdrData.getContactName() != null){
				contactInfo.setFullName(wsdrData.getContactName());
			}
			if(wsdrData.getContactEmail() != null){
				contactInfo.setEmail(wsdrData.getContactEmail());
			}
			if(wsdrData.getContactPhone() != null){
				ContactPhoneList phList = new ContactPhoneList();
				ContactPhone ph = new ContactPhone();
				ph.setPhoneNumber(wsdrData.getContactPhone());
				phList.getPhone().add(ph);
				contactInfo.setPhoneList(phList);
			}
			dlaReq.setContactDetail(contactInfo);
		}
	}
	
	private static void transformDiscrepancyList(WsdrRequestData wsdrData, DLARequest dlaReq){
		List<String> dicrepancyCodeList = wsdrData.getDiscrepancyCodeList();
		if(dicrepancyCodeList == null || dicrepancyCodeList.size() == 0){
			return;
		}
		DiscrepancyItemList discItemList = new DiscrepancyItemList();
		List<DiscrepancyItem> listDisc = discItemList.getDiscrepancy();
		for(String discrepancyCode : dicrepancyCodeList){
			if(discrepancyCode != null){
				DiscrepancyItem di = new DiscrepancyItem();
				di.setDiscrepancyCode(discrepancyCode);
				listDisc.add(di);
			}
		}
		dlaReq.setDiscrepancyList(discItemList);
	}
	
	private static void transformRemarks(WsdrRequestData wsdrData, DLARequest dlaReq) {
		if(wsdrData.getRemarks() == null || 
				wsdrData.getRemarks().size()==0){
			return;
		}
		StringBuffer remarksBuf = new StringBuffer();
		for(int i=0; i < wsdrData.getRemarks().size(); i++){
			remarksBuf.append(wsdrData.getRemarks().get(i));
			if(i != wsdrData.getRemarks().size()-1){
				remarksBuf.append("");
			}
		}
		// added to trim the remarks/comments to 512 chars
		String rc = remarksBuf.toString();
		if (rc.length() > 512) {
			rc = rc.substring(0, 509) + "...";
		}
		dlaReq.setRemarksComments(rc);
	}	

	private static void transformSubmitterDetails(WsdrRequestData wsdrData,
			DLARequest dlaReq) {
		if(wsdrData.getCafAddress() == null){
			return;
		}
		SubmitterInformation submitterInfo = new SubmitterInformation();
		CafAddress cafAddr = wsdrData.getCafAddress();
		if(cafAddr.getAgencyCode() != null){
			submitterInfo.setBureau(cafAddr.getAgencyCode());
		}
		if(cafAddr.getCity() != null){
			submitterInfo.setCity(cafAddr.getCity());
		}
//		if(cafAddr.getAcc() != null){
//			submitterInfo.setCountry(cafAddr.getAcc());
//		}
//		if(cafAddr.getAcc()) != null){
//			submitterInfo.setDoDAAC(cafAddr.getAcc());
//		}
		if(wsdrData.getSubmitterDodAAC() != null){
			submitterInfo.setDoDAAC(wsdrData.getSubmitterDodAAC());
		}
		if(cafAddr.getAgencyName() != null){
			submitterInfo.setFullName(cafAddr.getAgencyName());
		}
		if(cafAddr.getStateCode() != null){
			submitterInfo.setState(cafAddr.getStateCode());
		}	
		if(cafAddr.getAddressLine1() != null || cafAddr.getAddressLine2() != null &&
				cafAddr.getAddressLine3() != null){
			String street = "";
			if(cafAddr.getAddressLine1() != null) street += cafAddr.getAddressLine1();
			if(cafAddr.getAddressLine2() != null) street += " " + cafAddr.getAddressLine2();
			if(cafAddr.getAddressLine3() != null) street += " " + cafAddr.getAddressLine3();
			submitterInfo.setStreet(street);
		}
		if(cafAddr.getZipCode() != null){
			submitterInfo.setZipCode(cafAddr.getZipCode());
		}
		dlaReq.setSubmitterDetail(submitterInfo);
	}

	static DLAAttachment trasformRequestAttachment(WsdrRequestData wsdrData, String fileName,
			byte[] attContent) {
		logger.info("transformRequestData(): Transforming Attachment to Salesforce-" +
				"VisionDlaKey->" + wsdrData.getVisionDlaId() + ", File name->" + fileName); 
		if(fileName == null || attContent == null){
			return null;
		}
		DLAAttachment dlaAtt = new DLAAttachment();
		dlaAtt.setVisionDLAKey(String.valueOf(wsdrData.getVisionDlaId()));
		if(wsdrData.getWebsdrNumber() != null){
			dlaAtt.setDoDWebSDR(wsdrData.getWebsdrNumber());
		}
		AttachmentItemList attItemList = new AttachmentItemList();
		AttachmentItem attItem = transformAttachmentItem(fileName, attContent, null);
		attItemList.getAttachment().add(attItem);
		dlaAtt.setAttachmentList(attItemList);
		return dlaAtt;
	}	
	
	private static AttachmentItem transformAttachmentItem(String fileName, byte[] attContent, Date fileDate){
		if(fileName == null || attContent == null){
			return null;
		}
		AttachmentItem attItem = new AttachmentItem();
		attItem.setFileName(fileName);
		attItem.setFileSize(new Integer(attContent.length));
		if(fileDate != null){
			attItem.setFileDate(Utility.dateToXMLGregCalendar(fileDate));
		}else{
			attItem.setFileDate(Utility.getCurrentXMLGregCalendar());
		}
	  if(fileName.contains(".")){
	  	String fileType = fileName.substring(fileName.lastIndexOf('.') + 1,fileName.length());
	  	if(fileType != null){
	  		fileType = fileType.toUpperCase();
	  	}
	  	logger.info("transformAttachmentItem(): File type->" + fileType);
	  	attItem.setFileType(fileType);
	  }
		attItem.setContent(Base64.encodeBase64(attContent));
		return attItem;
	}
}
