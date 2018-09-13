/*
 * @(#)VisiondlaDaoTest.java			Aug 24, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.request.RequestXmlDataProcessor;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>VisiondlaDaoTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisiondlaDaoTest {
	
	WsdrRequestData wsdrReqData;

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
	public void getWsdrRequestData(){
		long reqId = 1001;
		VisionDlaPersistenceImpl visionDlaPers = new VisionDlaPersistenceImpl();
		String reqXml = null;
		try {
			WsdrRequestData wsdrReqData = visionDlaPers.getWsdrRequestXml(reqId);
			if(wsdrReqData != null){reqXml = wsdrReqData.getRequestXml();}
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
		if(wsdrList == null || wsdrList.size() == 0) {return;};
		wsdrReqData = wsdrList.get(0);
		wsdrReqData.setWsdrRequestId(reqId);
	}

	@Test
	public void testInsertVisionDla() {
		VisionDlaDao test = new VisionDlaDao();
		try {
			test.createVisionDla(wsdrReqData);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRetreiveAACValidStatus(){
		VisionDlaDao test = new VisionDlaDao();
		try {
			String aacStatus = test.retrieveAACValidStatus(10001);
			System.out.println("AAC valid status->" + aacStatus);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}

}
