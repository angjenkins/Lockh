/*
 * @(#)DlaSftpTest.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sftp;

import static org.junit.Assert.fail;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>DlaSftpTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class DlaSftpTest {

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
	public void testGetFiles() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetFile() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testMoveFile() {
		String srcDir = VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_XML_DIR);
		String targetDir = VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_XML_ARCH_DIR);
		String fileName = "GSA_O21132251322123499.xml";
		try {
			ChannelSftp sftpChannel = SftpUtil.getSftpChannel();
			SftpUtil.moveFile(sftpChannel,srcDir, fileName, targetDir);
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SftpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	@Test
	public void testSendResponseXmlFile(){
		String respFileName="Test1.xml";
		boolean isSent=false;
		try {
			isSent = DlaSftpAdapter.sendResponseXmlFile(respFileName);
		} catch (VisionDlaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isSent){
			boolean isDeleted = DlaSftpAdapter.deleteStagingFile(VisionDlaConfig.getPropertyValue(ConfigConstants.RESPONSE_XML_STAGING_DIR), respFileName);
			System.out.println("Is Deleted->" + isDeleted);
		}
		System.out.println("Is sent->" + isSent);
	}

}
