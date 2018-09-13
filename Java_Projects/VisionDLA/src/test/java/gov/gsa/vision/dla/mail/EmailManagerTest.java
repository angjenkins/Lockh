/*
 * @(#)EmailManagerTest.java			Sep 18, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.vision.dla.mail;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.mail.EmailNotificationEnum;
import gov.gsa.fas.vision.dla.mail.EmailNotificationManager;

/**
 * <code>EmailManagerTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailManagerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEmailManager() {
		EmailNotificationManager emailMgr = new EmailNotificationManager();
		try {
			emailMgr.sendEmail(EmailNotificationEnum.REQUEST_XML_PROCESS_FAILED);
		} catch (VisionDlaException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEmailManagerDB(){
		Utility.notifyDatabaseError("Failed to connect to database");
	}

}
