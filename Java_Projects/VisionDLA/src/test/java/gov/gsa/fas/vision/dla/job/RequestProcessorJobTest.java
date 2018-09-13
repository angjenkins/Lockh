/*
 * @(#)RequestProcessorJobTest.java			Aug 24, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.job;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * <code>RequestProcessorJobTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class RequestProcessorJobTest {

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
	public void testExecute() {
		RequestProcessorJob reqProcJob = new RequestProcessorJob();
		JobExecutionContext context = null;
		try {
			reqProcJob.execute(context);
		} catch (JobExecutionException e) {
			e.printStackTrace();
		}
	}

}
