/*
 * @(#)RequisitionPortProgram.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mf;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>RequisitionPortProgram</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class Fss19PortProgram {

	private static String PORT_PROGRAM_IP = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.FSS19_PROGRAM_HOST);
	private static int PORT_PROGRAM_PORT =
			VisionDlaConfig.getPropertyNumericValue(ConfigConstants.FSS19_PROGRAM_PORT);
	
	private static Logger logger = Logger.getLogger(Fss19PortProgram.class);
	
	public boolean isValidRequisitionNumber(String reqNum) {
		logger.info("isValidRequisitionNumber(): Checking whether Requisition Number is valid->" + reqNum);
		if(reqNum == null || reqNum.trim().isEmpty()){
			logger.info("isValidRequisitionNumber():Invalid Requisition Number: Requisition Number is empty");
			return false;
		}
		reqNum = reqNum.trim();
		if (reqNum.length() != 14) {
			logger.info("isValidRequisitionNumber():Invalid Requisition Number: length not 14->"+reqNum);
			return false;
		}
		PortProgramService portProgram = new PortProgramService(PORT_PROGRAM_IP, PORT_PROGRAM_PORT);
		String dataBack = portProgram.getRecord("DOC", reqNum);
		if( dataBack==null ){
			logger.info("isValidRequisitionNumber():Invalid Requisition Number: No data returned by FSS19->"+reqNum);
			return false;
		}
		dataBack = dataBack.trim().toUpperCase();
		if (dataBack.contains("MISING") || dataBack.contains("MISSING")){
			logger.info("isValidRequisitionNumber():Invalid Requisition Number: FSS19 returned missing->"+reqNum);
			return false;
		}
		
		if( dataBack.contains("ERROR") ){
			if(dataBack.contains("CONNECTION")) {
				throw new RuntimeException("Connection to FSS-19 port program failed for Requisition Number->" + reqNum);
			}
			return false;
		}
		return true;		
	}	
}
