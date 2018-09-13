/*
 * @(#)SftpXmlPullJob.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.job;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistence;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;
import gov.gsa.fas.vision.dla.sftp.DlaSftpAdapter;

/**
 * <code>SftpXmlPullJob</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class SftpXmlPullJob implements Job {
	
	private static final Logger logger = Logger.getLogger(SftpXmlPullJob.class.getName());

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info("execute(): Start--SftpXmlPullJob");
		if(!isRunJob()){
			logger.info("execute():Flag set to N, skipping job");
			return;
		}		
		try {
			List<String> xmlFilesList = pullRequestXMLFiles();
			saveStagingRequestXmlFiles(xmlFilesList);
		} catch (Exception e) {
			logger.error("execute(): Failed--SftpXmlPullJob", e);
		}
		logger.info("execute(): Completed--SftpXmlPullJob");
	}
	
	private List<String> pullRequestXMLFiles(){
		logger.info("pullRequestXMLFiles(): Start - Pulling XML files from SFTP server");
		List<String> reqXmlFiles = null;
		try {
			reqXmlFiles = DlaSftpAdapter.getRequestXMLFiles();
			logger.info("pullRequestXMLFiles(): Request XML files count->" + 
					reqXmlFiles.size());			
		} catch (VisionDlaException e) {
			logger.error("pullRequestXMLFiles(): Sftp task failed, but continue " + 
							e.getMessage(),e);
			//Don't Stop the job
		}	
		logger.info("pullRequestXMLFiles(): Complete - Pulling XML files from SFTP server");
		return reqXmlFiles;
	}
	
	private void saveStagingRequestXmlFiles(List<String> xmlFilesList){
		logger.info("saveRequestXmlFiles(): Start - Saving Request XML files in Database");
		if(xmlFilesList == null || xmlFilesList.size() == 0){
			logger.info("saveRequestXmlFiles(): No XMLfiles to persist");
			return;
		}
		String stagingDir = VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_XML_STAGING_DIR);
		for(String xmlFile:xmlFilesList){
			VisionDlaPersistence dlaPersistence=null;
			try {
				dlaPersistence = Utility.getVisionDlaPersistenceLocal();
			} catch (VisionDlaException e1) {
				logger.error("saveStagingRequestXmlFiles(): JNDI Lookup VisionDlaPersistence failed", e1);
				return;
			}
			if(dlaPersistence == null){
				logger.error("saveStagingRequestXmlFiles(): VisionDlaPersistence object is null");
				return;
			}
			boolean isSaveSuccessful=false;
			try {
				isSaveSuccessful = dlaPersistence.saveRequestXml(stagingDir, xmlFile);
			} catch (VisionDlaPersistenceException e) {
				logger.error("saveStagingRequestXmlFiles(): Saving request XML failed->" + xmlFile);
				//Don't stop the job
			}
			if(!isSaveSuccessful){
				logger.warn("saveStagingRequestXmlFiles(): Skipping archiving request XML file->" + xmlFile);
				continue;
			}
			boolean isArchiveSuccessful=false ;
			try {
				isArchiveSuccessful = DlaSftpAdapter.archiveRequestXMLFile(xmlFile);
			} catch (VisionDlaException e) {
				logger.error("saveStagingRequestXmlFiles(): Archiving request XML file failed->" + xmlFile, e);
				//TODO .. How to find, not to save next time to avoid duplicates
				//Don't stop the job
			}
			if(isArchiveSuccessful){
				logger.info("saveStagingRequestXmlFiles(): Xml file successfully archived->" + xmlFile);
				boolean isDeleted =DlaSftpAdapter.deleteStagingFile(stagingDir, xmlFile);
				if(isDeleted){
					logger.info("saveStagingRequestXmlFiles(): Stating Xml file successfully deleted->" + xmlFile);
				}
			}else{
				logger.error("saveStagingRequestXmlFiles(): Archiving request XML file failed->" + xmlFile);
				//TODO .. If archiving failed, not to save next time to avoid duplicates
			}
		}
		logger.info("pullRequestXMLFiles(): Complete - Saving Request XML files in Database");
	}
	
	private boolean isRunJob(){
		String runFlag = VisionDlaConfig.getPropertyValue(ConfigConstants.JOB_SFTP_REQ_XML);
		if(runFlag != null && runFlag.equalsIgnoreCase("N")){
			return false;
		}
		return true;
	}	
}
