/*
 * @(#)CaseOutcomeDao.java			Aug 26, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.response.CaseOutcomeData;

/**
 * <code>CaseOutcomeDao</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class CaseOutcomeDao extends BaseDao{
	
	private static Logger logger = Logger.getLogger(CaseOutcomeDao.class);

	public int createCaseOutcome(CaseOutcomeData caseData) throws VisionDlaPersistenceException{
		logger.info("createCaseOutcome():Creating CaseOutcome entry for VisionDlaKey->" + 
				caseData.getVisionDlaKey());
	  PreparedStatement pst = null;  
	  Connection conn = null;
	  try {
			conn = getVisionDlaConnection();
			pst = conn.prepareStatement(VisionDlaSqlConstants.INSERT_CASE_OUTCOME);
			pst.setLong(1, caseData.getVisionDlaKey());
			pst.setString(2, caseData.getWebSdrNumber());
			pst.setString(3, caseData.getTransactionPurposeCode());
			if(caseData.getAdjustedQuantity() == null || 
					caseData.getAdjustedQuantity().trim().isEmpty()){
				pst.setNull(4, java.sql.Types.INTEGER);
			}else{
				pst.setLong(4, Long.parseLong(caseData.getAdjustedQuantity()));
			}
			pst.setString(5, caseData.getAdjustedUnitCode());
			if(caseData.getAdjustedUnitPrice() == null || 
					caseData.getAdjustedUnitPrice().trim().isEmpty()){
				pst.setNull(6, java.sql.Types.DOUBLE);
			}else{
				pst.setDouble(6, Double.parseDouble(caseData.getAdjustedUnitPrice()));
			}
			if(caseData.getDiscrepancyCodeList() != null){
				String discrCodes = "";
				for(int i=0; i < caseData.getDiscrepancyCodeList().size(); i++){
					String code = caseData.getDiscrepancyCodeList().get(i);
					discrCodes += code;
					if(i != caseData.getDiscrepancyCodeList().size() -1){
						discrCodes += "::";
					}
				}
				pst.setString(7, discrCodes);
			}else{
				pst.setString(7, null);
			}
			if(caseData.getDispositionCodeList() != null){
				String discpCodes = "";
				for(int i=0; i < caseData.getDispositionCodeList().size(); i++){
					String code = caseData.getDispositionCodeList().get(i);
					discpCodes +=code;
					if(i != caseData.getDispositionCodeList().size() -1){
						discpCodes += "::";
					}
				}
				pst.setString(8, discpCodes);
			}else{
				pst.setString(8, null);
			}			
			pst.setString(9, caseData.getActionCode());
			pst.setString(10, caseData.getComments());
			pst.setLong(11, caseData.getAttachmentCount());
			pst.setTimestamp(12, Utility.getCurrentTimestamp());

			int rowCnt = pst.executeUpdate();
			if(rowCnt > 0){
				logger.info("createCaseOutcome(): Case Outcome entry created");
			}
			return rowCnt;
		} catch (SQLException e) {
			logger.error("createCaseOutcome(): Error occurred while inserting Case Outcome record", e);
			throw new VisionDlaPersistenceException("Failed to insert Caseoutcome Entry" + e.getMessage(), e);
		}finally{
			closePreparedStatement(pst);
			closeConnection(conn);
		}													
	} 
}
