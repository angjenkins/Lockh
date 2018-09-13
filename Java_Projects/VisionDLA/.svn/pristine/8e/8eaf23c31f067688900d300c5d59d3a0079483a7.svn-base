/*
 * @(#)SalesForceIntegrationTest.java			Aug 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.mf.CafAddress;
import gov.gsa.fas.vision.dla.mf.CafPortProgram;
import gov.gsa.fas.vision.dla.request.RequestXmlDataProcessor;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.request.WsdrRequestValidator;
import gov.gsa.fas.vision.dla.sf.caserequest.DLAResponse;

/**
 * <code>SalesForceIntegrationTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class SalesForceIntegrationTest {
	
	static WsdrRequestData wsdrReqData;
	String xmlFile;
	
	
	@BeforeClass 
	public static void setUpLog4j() {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}
	
	@Test
	public void getRequestXml(){
//		long reqId = 1001;
//		VisionDlaPersistenceImpl visionDlaPers = new VisionDlaPersistenceImpl();
//		String reqXml = null;
//		try {
//			reqXml = visionDlaPers.getWsdrRequestXml(reqId);
//		} catch (VisionDlaPersistenceException e1) {
//			e1.printStackTrace();
//		}
//		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(reqXml);
//		List<WsdrRequestData> wsdrList = null;
//		try {
//			wsdrList = reqXmlProcessor.processRequestXml();
//		} catch (VisionDlaException e) {
//			e.printStackTrace();
//		}
		xmlFile = "GSA_O21140450107120616_With_WRONG_Items.xml";
		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(xmlFile, true);
		List<WsdrRequestData> wsdrList = null;
		try {
			wsdrList = reqXmlProcessor.processRequestXml();
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull("Failed to process request XML file", wsdrList != null);
		Assert.assertTrue("Failed to process request XML file", wsdrList.size() > 0);
		if(wsdrList.size() > 0){wsdrReqData = wsdrList.get(0);}		
		Assert.assertNotNull("Failed to process request XML file",  wsdrList != null && wsdrList.size() > 0);	
		if(wsdrList == null || wsdrList.size() == 0) {return;};
		wsdrReqData = wsdrList.get(0);
		debugWsdrRequestData(wsdrReqData);
		/*		
		WsdrRequestValidator validator = new WsdrRequestValidator();
		if(wsdrReqData != null){
			boolean isValid = false;
			try {
				isValid = validator.validateRequestData(wsdrReqData);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Is request Data valid->" + isValid);
		}
		if(wsdrReqData.isDodAacValid()){
			CafPortProgram cafpgm = new CafPortProgram();
			CafAddress cafAddress = cafpgm.getAddressForAac(wsdrReqData.getSubmitterDodAAC());
			if(cafAddress != null){
				wsdrReqData.setCafAddress(cafAddress);
				debugCafAddress(cafAddress);
			}
		}*/
	}
	
	@Test
	public void testLogin() {
		VisionDlaRequestClient client = new VisionDlaRequestClient();
		try {
			client.login();
			String sessonId = client.getSfSessionId();
			Assert.assertNotNull("Failed to get Session Id", sessonId);
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testProcessRequest() {
		VisionDlaRequestClient client = new VisionDlaRequestClient();
		try {
			client.login();
			String sessonId = client.getSfSessionId();
			Assert.assertNotNull("Failed to get Session Id", sessonId);
			wsdrReqData.setVisionDlaId(999999931);
			DLAResponse dlaResp = client.postRequestDetails(wsdrReqData);
			DLAResponse dlaResp1 = client.postRequestAttachment(wsdrReqData, xmlFile, getXMLContent(xmlFile));
			debugDLAResponse(dlaResp);
			debugDLAResponse(dlaResp1);
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param xmlFile2
	 * @return
	 */
	private byte[] getXMLContent(String xmlFile2) {
		String fileStagingdir = VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_XML_STAGING_DIR);
		File xmlFile = new File(fileStagingdir + File.separator + xmlFile2);
    byte[] attContent = new byte[(int) xmlFile.length()];
    FileInputStream fileInputStream = null;
    try {
    	fileInputStream = new FileInputStream(xmlFile);
    	fileInputStream.read(attContent);
    } catch (FileNotFoundException e) {
    	System.out.println("File Not Found.");
    	e.printStackTrace();
    }catch (IOException e1) {
    	System.out.println("Error Reading The File.");
    	e1.printStackTrace();
    }finally{
    	try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
		return attContent;
	}

	private void debugDLAResponse(DLAResponse dlaResp){
		if(dlaResp == null){
			System.out.println("DLA Resposne is null");
		}
		System.out.println("Vision DLA Key->" +dlaResp.getVisionDLAKey());
	}
	
	private void debugWsdrRequestData(WsdrRequestData wsdrReqData){
		System.out.println("Document Number->" + wsdrReqData.getDocumentNumber());
		System.out.println("Document Number Suffix->" + wsdrReqData.getDocNumberSuffix());
		System.out.println("WebSDR Number->" + wsdrReqData.getWebsdrNumber());
		System.out.println("SDR Type->" + wsdrReqData.getSdrType());
		System.out.println("Transet Purpose Code->" + wsdrReqData.getTransactionPurposeCode());
		System.out.println("Submitter DOD AAC ->" + wsdrReqData.getSubmitterDodAAC());
		System.out.println("Quantity Shipped->" + wsdrReqData.getShippedQuantity());
		System.out.println("Quantity Received->" + wsdrReqData.getReceivedQuantity());
		System.out.println("Quantity Discrepant->" + wsdrReqData.getDiscrepancyQuantity());
		System.out.println("Unit of Measure->" + wsdrReqData.getUnitOfIssue());
		System.out.println("Unit Price->" + wsdrReqData.getUnitPrice());
		System.out.println("Monetary Amount->" + wsdrReqData.getTotalCost());
		System.out.println("NSN->" + wsdrReqData.getNSN());
		System.out.println("NSN Description->" + wsdrReqData.getNsnDescription());
		System.out.println("Action Code->" + wsdrReqData.getActionCode());
		List<String> discrepancyCodes = wsdrReqData.getDiscrepancyCodeList();
		if(discrepancyCodes != null){
			System.out.println("Discrepancy Code->" + Arrays.toString(discrepancyCodes.toArray(new String[0])));
		}
		System.out.println("Contact phone->" + wsdrReqData.getContactPhone());
		System.out.println("Contact phone Ext->" + wsdrReqData.getContactPhoneExt());
		System.out.println("Contact Email->" + wsdrReqData.getContactEmail());
		System.out.println("Contact Name->"  +wsdrReqData.getContactName());
		System.out.println("Document Type->" + wsdrReqData.getDocumentType());
		List<String> remarks = wsdrReqData.getRemarks();
		if(remarks != null){
			System.out.println("Remarks->" + Arrays.toString(remarks.toArray(new String[0])));
		}
		List<String> attNames = wsdrReqData.getAttachmentNames();
		if(attNames == null){
			System.out.println("No Attachments");
		}else{
			System.out.println("Attachments->" + Arrays.toString(attNames.toArray(new String[0])));
		}
		System.out.println("WrongItemCAGECode->" + wsdrReqData.getWrongItemCAGECode());
		System.out.println("WrongItemDescription->" + wsdrReqData.getWrongItemDescription());
		System.out.println("WrongItemManufacturerName->" + wsdrReqData.getWrongItemManufacturerName());
		System.out.println("WrongItemNSN->" + wsdrReqData.getWrongItemNSN());
		System.out.println("WrongItemPartNumber->" + wsdrReqData.getWrongItemPartNumber());
		System.out.println("WrongItemQuantityReceived->" + wsdrReqData.getWrongItemQuantityReceived());
		System.out.println("WrongItemUI->" + wsdrReqData.getWrongItemUI());
	}	
	
	private void debugCafAddress(CafAddress cafAddr){
		System.out.println("Caf Agency Code->" + cafAddr.getAgencyCode());
		System.out.println("Caf Agency Name->" + cafAddr.getAgencyName());
		System.out.println("Caf Address1->" + cafAddr.getAddressLine1());
		System.out.println("Caf Address2->" + cafAddr.getAddressLine2());
		System.out.println("Caf Address3->" + cafAddr.getAddressLine3());
		System.out.println("Caf City->" + cafAddr.getCity());
		System.out.println("Caf State->" + cafAddr.getStateCode());
		System.out.println("Caf Zip->" + cafAddr.getZipCode());
		System.out.println("Caf Phone->" + cafAddr.getCommPhone());
		System.out.println("Caf Const Code->" + cafAddr.getConstCode());
		System.out.println("Caf Dsn Phone->" + cafAddr.getDsnPhone());
	}	

}
