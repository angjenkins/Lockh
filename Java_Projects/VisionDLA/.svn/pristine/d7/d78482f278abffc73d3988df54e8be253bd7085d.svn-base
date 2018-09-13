/*
 * @(#)VisionDlaPersistenceTest.java			Sep 24, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <code>VisionDlaPersistenceTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaPersistenceTest {

	private VisionDlaPersistence visionDlaPers = null;
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
		visionDlaPers = new VisionDlaPersistenceImpl();
	}


	@Test
	public void testGetWsdrCreatedDate() {
		Date creDate=null;
		try {
			creDate = visionDlaPers.getWsdrRequestCratedDate(1003);
		} catch (VisionDlaPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Created Date->" + creDate);
	}

}
