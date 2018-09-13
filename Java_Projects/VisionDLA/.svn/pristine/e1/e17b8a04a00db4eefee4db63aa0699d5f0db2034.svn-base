/*
 * @(#)WsdrRequestValidator.java			Jul 26, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.request;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.mf.CafPortProgram;
import gov.gsa.fas.vision.dla.mf.Fss19PortProgram;

/**
 * <code>WsdrRequestValidator</code> validates request XML data.
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class WsdrRequestValidator {
	
	private static Logger logger = Logger.getLogger(RequestXmlDataProcessor.class);
	
	public boolean validateRequestData(WsdrRequestData wsdrReqData) throws VisionDlaException{
		logger.info("validateRequestData(): Validating Request Data for Requisition Number->" + 
				wsdrReqData.getDocumentNumber() + ", DodAac->" + wsdrReqData.getSubmitterDodAAC());
		CafPortProgram cafPortPgm = new CafPortProgram();
		boolean isAacValid = false;
		boolean isReqValid = false;
		try {
			isAacValid = cafPortPgm.isValidAac(wsdrReqData.getSubmitterDodAAC());
			logger.info("validateRequestData(): AAC->" + 
							wsdrReqData.getSubmitterDodAAC() + " Valid->" + isAacValid);
			wsdrReqData.setDodAacValid(isAacValid);
			Fss19PortProgram fss19PortPgm = new Fss19PortProgram();
			isReqValid = fss19PortPgm.isValidRequisitionNumber(wsdrReqData.getDocumentNumber());
			logger.info("validateRequestData(): Requisition Number->" + 
					wsdrReqData.getDocumentNumber() + " Valid->" + isReqValid);
			wsdrReqData.setDocumentNumberValid(isReqValid);
		} catch (Exception e) {
			logger.error("validateRequestData(): Failed to validate Wsdr request Data", e);
			throw new VisionDlaException("Failed to validate Wsdr request Data", e);
		}
		return isAacValid & isReqValid;
	}
}
