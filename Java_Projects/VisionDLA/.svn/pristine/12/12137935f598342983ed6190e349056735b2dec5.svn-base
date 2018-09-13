/*
 * @(#)RequestXmlDataProcessorTest.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceImpl;

/**
 * <code>RequestXmlDataProcessorTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class RequestXmlDataProcessorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}

	@Test
	public void testProcessRequestXmlFromFile() {
		String xmlFile =  "VISION-3362.xml";
//		String xmlFile =  "GSA_O21130602321070020.xml";
		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(xmlFile, true);
		List<WsdrRequestData> wsdrList = null;
		try {
			wsdrList = reqXmlProcessor.processRequestXml();
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull("Failed to process request XML file", wsdrList != null && wsdrList.size() > 0);
		debugWsdrRequestData(wsdrList);
	}
	
	@Test
	public void testProcessRequestXmlFromDB() {
		long reqId = 1011;
		VisionDlaPersistenceImpl visionDlaPers = new VisionDlaPersistenceImpl();
		String reqXml = null;
		try {
			WsdrRequestData wsdrData = visionDlaPers.getWsdrRequestXml(reqId);
			if(wsdrData != null){reqXml = wsdrData.getRequestXml();}
		} catch (VisionDlaPersistenceException e1) {
			e1.printStackTrace();
		}
		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(reqXml);
		List<WsdrRequestData> wsdrList = null;
		try {
			wsdrList = reqXmlProcessor.processRequestXml();
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull("Failed to process request XML file",  wsdrList != null && wsdrList.size() > 0);
		debugWsdrRequestData(wsdrList);
	}	
	
	private void debugWsdrRequestData(List<WsdrRequestData> wsdrList){
		for(WsdrRequestData wsdrReqData : wsdrList){
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
		}		
	}

}
