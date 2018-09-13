/*
 * @(#)WsdrRequestDaoTest.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;

/**
 * <code>WsdrRequestDaoTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrRequestDaoTest {
	private String reqXmlStagingDir = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}
	
	@Before
	public void setUp() throws Exception{
		reqXmlStagingDir = VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_XML_STAGING_DIR);
	}	

	@Test
	public void testWsdrRequestCreate() {
		String reqFileName = "GSA_O21132251322123476.xml";
		WsdrRequestDao reqDao = new WsdrRequestDao();
		try {
			reqDao.creteWsdrRequest(reqFileName, reqXmlStagingDir);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetWsdrRequestXML(){
		long wsdrReqId = 1011;
		WsdrRequestDao reqDao = new WsdrRequestDao();
		try {
			String reqXml = null;
			WsdrRequestData wsdrReqData =  reqDao.retrieveRequestXml(wsdrReqId);
			if(wsdrReqData != null){reqXml = wsdrReqData.getRequestXml();}
			System.out.println("Request XML ->" + reqXml);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetWsdrRequestId(){
		String reqXmlFileName = "GSA_O21132251322123476.xml";
		WsdrRequestDao reqDao = new WsdrRequestDao();
		try {
			long reqId=  reqDao.retrieveWsdrRequestId(reqXmlFileName);
			System.out.println("Request XML ->" + reqId);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}		
	}

	@Test
	public void testGetWsdrRequestIds(){
		String status = "C";
		WsdrRequestDao reqDao = new WsdrRequestDao();
		try {
			List<Long> reqIds=  reqDao.retreieveWsdrReqIdsByStatus(status);
			for(Long reqId : reqIds){
				System.out.println("Request Id->" + reqId);
			}
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testGetReceievedAttachements(){
		WsdrRequestDao reqDao = new WsdrRequestDao();
		try {
			List<String> attNames=  reqDao.retrieveReceivedAttachments(1014);
			for(String attName : attNames){
				System.out.println("Attachment Name->" + attName);
			}
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}		
	}	
}
