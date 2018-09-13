/*
 * @(#)CafPortProgram.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mf;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>CafPortProgram</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class CafPortProgram {
	private static String PORT_PROGRAM_IP = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.FSS19_PROGRAM_HOST);
	private static int PORT_PROGRAM_PORT =
			VisionDlaConfig.getPropertyNumericValue(ConfigConstants.FSS19_PROGRAM_PORT);
	
	private static Logger logger = Logger.getLogger(CafPortProgram.class);
	
	
	/**
	 * 
	 * @param aac
	 * @return
	 */
	public boolean isValidAac(String aac) {
		logger.info("isValidAac(): Checking whether AAC->" + aac + " is valid");
		PortProgramService portProgram = new PortProgramService(PORT_PROGRAM_IP, PORT_PROGRAM_PORT);
		String dataBack = portProgram.getRecord("CAF", aac);
		dataBack = dataBack.trim();
		logger.info("isValidAac():Port program CAF returned->"+dataBack + 
				" and length->" + dataBack.length());
		return (dataBack.length()>6);
	}

	/**
	 * 
	 * @param dodAac
	 * @return
	 */
	public CafAddress getAddressForAac(String dodAac) {
		logger.info("getAddressForAac():Getting CAF address for AAC->" + dodAac);
		CafAddress cafAdr = new CafAddress();
		PortProgramService portProgram = new PortProgramService(PORT_PROGRAM_IP, PORT_PROGRAM_PORT);
		String dataBack = portProgram.getRecord("CAF", dodAac);
		if(dataBack == null || dataBack.trim().isEmpty() ){
			logger.warn("getAddressForAac():CAF Returned no data for AAC {"+dodAac+"}");
			return null;
		}
		if (dataBack.contains("MISING")){
			logger.warn("getAddressForAac():CAF Returned MISSING for AAC { {"+dodAac+"}");
			return null;
		}
		
		cafAdr.setAcc(dodAac);
		
		cafAdr.setAgencyName(dataBack.substring(173, 208).trim());
		cafAdr.setAddressLine1(dataBack.substring(208,243).trim());
		cafAdr.setAddressLine2(dataBack.substring(243,277).trim());
		cafAdr.setAddressLine3(dataBack.substring(278,313).trim());
		
		if(cafAdr.getAddressLine3()== null || cafAdr.getAddressLine3().trim().length() == 0){
			cafAdr.setAddressLine3(cafAdr.getAddressLine2());
			cafAdr.setAddressLine2(cafAdr.getAddressLine1());
			cafAdr.setAddressLine1(cafAdr.getAgencyName());
		} else {
			cafAdr.setZipCode( 
					cafAdr.getAddressLine3().substring(cafAdr.getAddressLine3().lastIndexOf(" ")+1).trim() );
		}
		cafAdr.setStateCode( dataBack.substring(25,27));
		cafAdr.setPhone(dataBack.substring(105,125));
		cafAdr.setDsnPhone(dataBack.substring(122,128));
		cafAdr.setCommPhone(dataBack.substring(105,115));
		cafAdr.setAgencyCode(dataBack.substring(21,23));

		return cafAdr;
	}
}
