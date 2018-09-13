/*
 * @(#)CafPortProgramTest.java			Aug 23, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.vision.dla.mf;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.vision.dla.mf.CafAddress;
import gov.gsa.fas.vision.dla.mf.CafPortProgram;

/**
 * <code>CafPortProgramTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class CafPortProgramTest {

	@BeforeClass 
	public static void setUpLog4j() {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));
	}	
	
	@Test
	public void testCafAddress() {
		String docAac = "N61331";
		CafPortProgram cafpgm = new CafPortProgram();
		CafAddress cafAddress = cafpgm.getAddressForAac(docAac);
		debugCafAddress(cafAddress);
	}
	
	private void debugCafAddress(CafAddress cafAddr){
		System.out.println("Caf Agency Code->" + cafAddr.getAgencyCode());
		System.out.println("Caf Agency Name->" + cafAddr.getAgencyName());
		System.out.println("Caf Address1->" + cafAddr.getAddressLine1());
		System.out.println("Caf Address2->" + cafAddr.getAddressLine2());
		System.out.println("Caf Address3->" + cafAddr.getAddressLine3());
		System.out.println("Caf Address4->" + cafAddr.getCity());		
		System.out.println("Caf City->" + cafAddr.getCity());
		System.out.println("Caf State->" + cafAddr.getStateCode());
		System.out.println("Caf Zip->" + cafAddr.getZipCode());
		System.out.println("Caf Phone->" + cafAddr.getCommPhone());
		System.out.println("Caf Const Code->" + cafAddr.getConstCode());
		System.out.println("Caf Dsn Phone->" + cafAddr.getDsnPhone());
	}

}
