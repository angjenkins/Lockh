/*
 * @(#)ResponseXmlGeneratorTest.java			Aug 30, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.response;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.request.RequestXmlDataProcessor;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>ResponseXmlGeneratorTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class ResponseXmlProcessorTest {
	private WsdrRequestData wsdrReqData;
	private CaseOutcomeData caseData;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}
	
	@Before
	public void setUp() throws Exception{
		String xmlFile = "GSA_O21130602321070016.xml";
		RequestXmlDataProcessor reqXmlProcessor = new RequestXmlDataProcessor(xmlFile, true);
		reqXmlProcessor.setIncludeDataModel(true);
		List<WsdrRequestData> wsdrList = null;
		try {
			wsdrList = reqXmlProcessor.processRequestXml();
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull("Failed to process request XML file", wsdrList != null);
		Assert.assertTrue("Failed to process request XML file", wsdrList.size() > 0);
		if(wsdrList.size() > 0){wsdrReqData = wsdrList.get(0);}
		//Case Out come Data
		caseData = new CaseOutcomeData();
		caseData.setWebSdrNumber("PrasadWebSdr");
//		caseData.setAdjustedQuantity("999");
//		caseData.setAdjustedUnitCode("EA");
//		caseData.setAdjustedUnitPrice("9.8");
		caseData.setComments("Test comments Test comments Test comments");
//		List<String> attNames = Arrays.asList(new String[]{"Att1.pdf", "Att2.pdf"});
//		caseData.setAttachmentNameList(attNames);
		caseData.setAttachmentCount(0);
	}
	
	@Test
	public void testGenerateResponse(){
		String respXml=null;
		try {
			wsdrReqData.setDodAacValid(true);
			ResponseXmlProcessor respXmlProcessor = new ResponseXmlProcessor(wsdrReqData, caseData);
			respXml = respXmlProcessor.processResponseXml();
		} catch (VisionDlaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Response Xml->" + respXml);
	}
}
