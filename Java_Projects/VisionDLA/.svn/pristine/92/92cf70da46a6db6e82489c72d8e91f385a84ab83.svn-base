/*
 * @(#)EmailDaoTest.java			Sep 18, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.mail.EmailNotification;

/**
 * <code>EmailDaoTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailDaoTest {

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
	public void testEmailDao() {
		EmailNotificationDao emailDao = new EmailNotificationDao();
		EmailNotification emailNotification = null;
		try {
			emailNotification = emailDao.retrieveEmailNotification(1);
		} catch (VisionDlaPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Email Notification->" + 
				emailNotification.getNotificationType() + " " + 
				emailNotification.getSubject() + " " + 
				emailNotification.getContent() + " " + 
				emailNotification.getToAddress());
	}

}
