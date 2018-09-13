/*
 * @(#)WsdrResponseDaoTest.java			Aug 30, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>WsdrResponseDaoTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrResponseDaoTest {
	String respXml;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}
	
	@Before
	public void setUp() throws Exception{
		respXml = "Test XML String";
	}	

	@Test
	public void testWsdrResponseCreate() {
		WsdrResponseDao reqDao = new WsdrResponseDao();
		try {
			reqDao.creteWsdrResponse(respXml, 10001, "Test_file");
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}

}
