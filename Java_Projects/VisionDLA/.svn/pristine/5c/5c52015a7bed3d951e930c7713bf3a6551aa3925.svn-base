/*
 * @(#)VisionDlaPersistenceTest.java			Sep 8, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <code>VisionDlaPersistenceTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaPersistenceResponseTest {

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
	public void testcreateResponseAttNames() {
		List<String> names = Arrays.asList(new String[]{"Test1.pdf", "Invoice.pdf"});
		VisionDlaPersistenceImpl visPers = new VisionDlaPersistenceImpl();
		try {
			visPers.createResponseAttNames(names, 10001);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUpdateResponseStatus(){
		VisionDlaPersistenceImpl visPers = new VisionDlaPersistenceImpl();
		try {
			visPers.setResponseAttReceived(10001, "Test1.pdf");
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetResponseXml(){
		VisionDlaPersistenceImpl visPers = new VisionDlaPersistenceImpl();
		ResponseData respData = null;
		try {
			respData = visPers.getResponseXml(10001);
		} catch (VisionDlaPersistenceException e) {
			e.printStackTrace();
		}
		System.out.println("Response XmL ->" + respData.getResponseXml());
	}

}
