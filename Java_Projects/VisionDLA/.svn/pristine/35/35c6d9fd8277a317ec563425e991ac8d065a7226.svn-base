/*
 * @(#)RequestXmlDataValidatorTest.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.VisionDlaException;

/**
 * <code>RequestXmlDataValidatorTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class RequestXmlDataValidatorTest {
	private WsdrRequestData wsdrReqData;

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
		String xmlFile = "GSA_O21132251322123476.xml";
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
	}
	
	@Test
	public void testRequestDataValid() {
		WsdrRequestValidator validator = new WsdrRequestValidator();
		if(wsdrReqData != null){
			boolean isValid= false;
			try {
				isValid = validator.validateRequestData(wsdrReqData);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Is request Data valid->" + isValid);
		}
	}

}
