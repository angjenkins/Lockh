/*
 * @(#)ConfigConstants.java			Jul 29, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.config;

/**
 * <code>ConfigConstants</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public interface ConfigConstants {
	//Properties files names
	String APP_PROPERTIES_FILE  = "app.properties";
	String DLA_PROPERTIES_FILE 	= "vision.dla.file";
	
	//SFTP config
	String GSA_SFTP_HOST 				= "gsa.sftp.host";
	String GSA_SFTP_PORT 				= "gsa.sftp.port";
	String GSA_SFTP_USER 				= "gsa.sftp.user";
	String GSA_SFTP_PASSWORD 		= "gsa.sftp.password";
	String GSA_SFTP_REQUEST_XML_DIR = "gsa.sftp.request.xml.dir";
	String GSA_SFTP_REQUEST_ATT_DIR = "gsa.sftp.request.attachment.dir";
	String GSA_SFTP_REQUEST_XML_ARCH_DIR = "gsa.sftp.request.xml.archive.dir";
	String GSA_SFTP_REQUEST_ATT_ARCH_DIR = "gsa.sftp.request.attachment.archive.dir";
	String GSA_SFTP_RESPONSE_XML_DIR= "gsa.sftp.response.xml.dir";
	String GSA_SFTP_RESPONSE_ATT_DIR= "gsa.sftp.response.attachment.dir";
	
	//Local Staging directory
	String REQUEST_XML_STAGING_DIR = "request.xml.staging.dir";
	String REQUEST_ATT_STAGING_DIR = "request.att.staging.dir";
	String RESPONSE_XML_STAGING_DIR = "response.xml.staging.dir";
	String RESPONSE_ATT_STAGING_DIR = "response.att.staging.dir";
	
	//FSS19 Config
	String FSS19_PROGRAM_HOST 	= "fss19.program.host";
	String FSS19_PROGRAM_PORT 	= "fss19.program.port";
	
	//Salesforce integration
	String VISIONDLA_SF_USERNAME ="visiondla.salesforce.username";
	String VISIONDLA_SF_PASSWORD ="visiondla.salesforce.password";
	String VISIONDLA_SF_SECURITY_TOKEN="visiondla.salesforce.securityToken";
	String VISIONDLA_SF_PROVIDER_ENDPOINT = "visiondla.salesforce.provider.endpoint";
	String VISIONDLA_SF_DLASERVICE_ENDPOINT="visiondla.salesforce.dlaservice.endpoint";
	
	String JOB_SFTP_REQ_XML="job.sftp.request.xml";
	String JOB_REQUEST_PROCESS="job.request.process";	
	
	//Email
	String SMTP_HOST="mail.smtp.host";
	String SMTP_PORT="mail.smtp.port";
	
	//VISION DLA APP POC Email
	String VISIONDLA_POC_EMAIL="visiondla.poc.email";
	
	//Request Attachment wait minutes
	String REQUEST_ATT_WAIT_MINUTES="request.attachment.wait.minutes";
}
