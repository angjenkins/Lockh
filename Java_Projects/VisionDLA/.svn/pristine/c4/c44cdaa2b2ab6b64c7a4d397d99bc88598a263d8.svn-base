/*
 * @(#)DlaSftpAdapter.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sftp;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>DlaSftpAdapter</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class DlaSftpAdapter {

	private static final Logger logger = Logger.getLogger(DlaSftpAdapter.class.getName());
	
	private static String REQUEST_XML_DIR = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_XML_DIR);
	private static String REQUEST_ATTACHMENT_DIR =
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_ATT_DIR);
	private static String RESPONSE_XML_DIR = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_RESPONSE_XML_DIR);
	private static String RESPONSE_ATTACHMENT_DIR =
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_RESPONSE_ATT_DIR);
	private static String REQUEST_XML_ARCH_DIR =
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_XML_ARCH_DIR);
	private static String REQUEST_ATT_ARCH_DIR =
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_ATT_ARCH_DIR);
	
	private static String REQUEST_XML_STAGING_DIR =
			VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_XML_STAGING_DIR);
	private static String REQUEST_ATT_STAGING_DIR=
			VisionDlaConfig.getPropertyValue(ConfigConstants.REQUEST_ATT_STAGING_DIR);
	private static String RESPONSE_XML_STAGING_DIR = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.RESPONSE_XML_STAGING_DIR);
	private static String RESPONSE_ATT_STAGING_DIR=
			VisionDlaConfig.getPropertyValue(ConfigConstants.RESPONSE_ATT_STAGING_DIR);	
	/**
	 * 
	 * @return
	 * @throws VisionDlaException
	 */
	public static List<String> getRequestXMLFiles() throws VisionDlaException{
		logger.info("getRequestXMLFiles(): Getting request XML files to Staging");
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			List<String> files =  SftpUtil.getFiles(sftpChannel, REQUEST_XML_DIR, REQUEST_XML_STAGING_DIR);
			SftpUtil.closeChannel(sftpChannel);
			return files;
		} catch (JSchException e) {
			logger.error("getRequestXMLFiles():Failed to get Request XML file Names", e);
			throw new VisionDlaException("Failed to get Request XML file Names", e);
		} catch (SftpException e) {
			logger.error("getRequestXMLFiles():Failed to get Request XML file Names", e);
			throw new VisionDlaException("Failed to get Request XML file Names", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("getRequestXMLFiles(): Failed to close SFTP channel", e);
			}
		}
	}
	
	public static List<String> getRequestAttFileNames() throws VisionDlaException{
		logger.info("getRequestAttFiles(): Getting request Attachment file names");
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			List<String> files =  SftpUtil.getFileNames(sftpChannel, REQUEST_ATTACHMENT_DIR);
			SftpUtil.closeChannel(sftpChannel);
			return files;
		} catch (JSchException e) {
			logger.error("getRequestAttFiles():Failed to get Request Attachment file Names", e);
			throw new VisionDlaException("Failed to get Request Attachment file Names", e);
		} catch (SftpException e) {
			logger.error("getRequestAttFiles():Failed to get Request Attachment file Names", e);
			throw new VisionDlaException("Failed to get Request Attachment file Names", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("getRequestAttFiles(): Failed to close SFTP channel", e);
			}
		}
	}
	
	public static boolean getRequestAttFiles(List<String> attNames) throws VisionDlaException{
		logger.info("getRequestAttFiles(): Getting request Attachment files to Staging");
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			for(String attName : attNames){
				SftpUtil.getFile(sftpChannel, REQUEST_ATTACHMENT_DIR, 
						attName, REQUEST_ATT_STAGING_DIR);
			}
			SftpUtil.closeChannel(sftpChannel);
			return true;
		} catch (JSchException e) {
			logger.error("getRequestAttFiles():Failed to get Request Attachment file Names", e);
			throw new VisionDlaException("Failed to get Request Attachment file Names", e);
		} catch (SftpException e) {
			logger.error("getRequestAttFiles():Failed to get Request Attachment file Names", e);
			throw new VisionDlaException("Failed to get Request Attachment file Names", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("getRequestAttFiles(): Failed to close SFTP channel", e);
			}
		}
	}	
	
	public static boolean archiveRequestXMLFile(String xmlFileName) throws VisionDlaException{
		logger.info("archiveRequestXMLFile(): Archiving Request XML file->" + xmlFileName);
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			SftpUtil.checkExistsAndRename(sftpChannel, REQUEST_XML_ARCH_DIR, xmlFileName);
			SftpUtil.moveFile(sftpChannel, REQUEST_XML_DIR, xmlFileName, REQUEST_XML_ARCH_DIR);
			return true;
		} catch (JSchException e) {
			logger.error("archiveRequestXMLFile():Failed to archive Request XML file", e);
			throw new VisionDlaException("Failed to archive Request XML file", e);
		} catch (SftpException e) {
			logger.error("archiveRequestXMLFile():Failed to archive Request XML file", e);
			throw new VisionDlaException("Failed to archive Request XML file", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("archiveRequestXMLFile(): Failed to close SFTP channel", e);
			}
		}
	}
	
	public static boolean archiveRequestAttachmentFile(String attFileName) throws VisionDlaException{
		logger.info("archiveRequestAttachmentFile(): Archiving Request Attachment file->" + attFileName);
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			SftpUtil.checkExistsAndRename(sftpChannel, REQUEST_ATT_ARCH_DIR, attFileName);
			SftpUtil.moveFile(sftpChannel, REQUEST_ATTACHMENT_DIR, attFileName, REQUEST_ATT_ARCH_DIR);
			return true;
		} catch (JSchException e) {
			logger.error("archiveRequestAttachmentFile():Failed to archive Request Attachment file", e);
			throw new VisionDlaException("Failed to archive Request Attachment file", e);
		} catch (SftpException e) {
			logger.error("archiveRequestAttachmentFile():Failed to archive Request Attachment file", e);
			throw new VisionDlaException("Failed to archive Request Attachment file", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("archiveRequestXMLFile(): Failed to close SFTP channel", e);
			}
		}
	}	
	
	public static boolean deleteStagingFile(String stagingDir, String file){
		File stagingFile = new File(stagingDir  + File.separator + file);
		boolean isDeleted = false;
		if(stagingFile != null && stagingFile.exists()){
			isDeleted = stagingFile.delete();
		}
		return isDeleted;
	}
	
	public static boolean sendResponseXmlFile(String fileName)
			throws VisionDlaException{
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
//			SftpUtil.checkExistsAndRename(sftpChannel, RESPONSE_XML_DIR, fileName);
			SftpUtil.putFile(sftpChannel, RESPONSE_XML_STAGING_DIR, RESPONSE_XML_DIR, fileName);
			return true;
		} catch (JSchException e) {
			logger.error("sendResponseXmlFile():Failed to send Respone XML file->" + fileName, e);
			throw new VisionDlaException("Failed to send Response XML file", e);
		} catch (SftpException e) {
			logger.error("sendResponseXmlFile():Failed to send Respone XML file->" + fileName, e);
			throw new VisionDlaException("Failed to send Response XML file", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("sendResponseXmlFile(): Failed to close SFTP channel", e);
			}
		}		
	}
	
	public static boolean sendResponseAttFile(String fileName)
			throws VisionDlaException{
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
//			SftpUtil.checkExistsAndRename(sftpChannel, RESPONSE_ATTACHMENT_DIR, fileName);
			SftpUtil.putFile(sftpChannel, RESPONSE_ATT_STAGING_DIR, RESPONSE_ATTACHMENT_DIR, fileName);
			return true;
		} catch (JSchException e) {
			logger.error("sendResponseAttFile():Failed to send Respone Attachment file->" + fileName, e);
			throw new VisionDlaException("Failed to send Response Attachment file", e);
		} catch (SftpException e) {
			logger.error("sendResponseAttFile():Failed to send Respone Attachment file->" + fileName, e);
			throw new VisionDlaException("Failed to send Response Attachment file", e);
		}finally{
			try {
				if(sftpChannel != null)
				SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error("sendResponseAttFile(): Failed to close SFTP channel", e);
			}
		}		
	}	
}
