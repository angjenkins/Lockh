/*
 * @(#)EmailNotificationManager.java			Sep 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mail;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistence;
import gov.gsa.fas.vision.dla.persistence.VisionDlaPersistenceException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.ws.core.soap.attachment.MimeConstants;

/**
 * <code>EmailNotificationManager</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailNotificationManager {
	
	private static final Logger logger = Logger.getLogger(EmailNotificationManager.class.getName());	
	private String documentNumber;
	private String webSdrNumber;
	private String errorMessage;
	private String fileName;
	private String xmlData;

	public String getXmlData() {
		return xmlData;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public boolean sendEmail(EmailNotificationEnum notificationEnum) throws VisionDlaException{
		logger.info("sendEmail(): Sending Email Notification for ->" + notificationEnum.notificationType());
		VisionDlaPersistence visionPers = Utility.getVisionDlaPersistenceLocal();
		EmailNotification emailNotification = null;
		try {
			emailNotification = visionPers.getEmailNotification(notificationEnum.notificationId());
		} catch (VisionDlaPersistenceException e) {
			logger.error("sendEmail(): Failed to get Email Notification details from Databasse->" + 
					notificationEnum.notificationId());
			throw new VisionDlaException("Failed to get Email Notification details");
		}
		Session mailSession = getSession();
		Message msg = getMailMessage(mailSession, emailNotification);
		
		try {
			attachXmlString(msg, getXmlData());
			Transport.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
			logger.error("sendEmail(); Failed to send Email->" + notificationEnum.notificationType(), e);
			throw new VisionDlaException("Failed to send Email");
		}
		logger.info("sendEmail(): Email Notification sent for ->" + notificationEnum.notificationType());
		return true;
	}
	
	private void attachXmlString(Message msg,String xmlData) throws MessagingException{
		
	try{
		logger.info("called attachXmlString()********************");
		if (getXmlData()!= null && !getXmlData().isEmpty()&& msg !=null){
			logger.info("attachXmlString(): Attaching xml to Email");
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			MimeBodyPart messageAttachmentPart = new MimeBodyPart();
			messageBodyPart.setContent(msg.getContent(),msg.getContentType());
	        Multipart multipart = new MimeMultipart();
	        DataSource source = new ByteArrayDataSource(getXmlData(),MimeConstants.TYPE_XML_UTF8);
	        messageAttachmentPart.setDataHandler(new DataHandler(source));
	        messageAttachmentPart.setFileName(getFileName());
	        multipart.addBodyPart(messageBodyPart);
	        multipart.addBodyPart(messageAttachmentPart);
	        msg.setContent(multipart);
		}  
		} catch (IOException e) {
			logger.error("attachXmlString(); Failed to attach xmlData to Email->" , e);
			throw new MessagingException(e.getMessage());
		} 
	
	}
	
	public boolean sendEmail(EmailNotification emailNotification) throws VisionDlaException{
		logger.info("sendEmail(): Sending Email Notification for ->" + emailNotification.getNotificationType());
		Session mailSession = getSession();
		Message msg = getMailMessage(mailSession, emailNotification);
		try {
			Transport.send(msg);
		} catch (MessagingException e) {
			logger.error("sendEmail(); Failed to send Email->" + emailNotification.getNotificationType(), e);
			throw new VisionDlaException("Failed to send Email");
		}
		logger.info("sendEmail(): Email Notification sent for ->" + emailNotification.getNotificationType());
		return true;
	}	
	
	private Message getMailMessage(Session session, EmailNotification emailNotification) 
			throws VisionDlaException{
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(emailNotification.getFromAddress()));
			Address[] toAddrs = getAddresses(emailNotification.getToAddress());
			Address[] ccAddrs = getAddresses(emailNotification.getCcAddress());
			if(toAddrs != null){
				message.setRecipients(Message.RecipientType.TO,toAddrs);
			}
			if(ccAddrs != null){
				message.setRecipients(Message.RecipientType.CC, ccAddrs);
			}
			String subject = getSubject(emailNotification.getSubject());
			String content = getContent(emailNotification.getContent());
			logger.info("getMailMessage(): Subject->" + subject);
			logger.info("getMailMessage(): Content->" + content);
			message.setSubject(subject, "UTF-8");
			message.setText(content);
			message.setHeader("Content-Type", "text/plain; charset=UTF-8");
		} catch (AddressException e) {
			logger.error("getMailMessage(): One of the Email Address is invalid", e);
			throw new VisionDlaException("Email address invalid");
		} catch (MessagingException e) {
			logger.error("getMailMessage(); Failed to create Message object", e);
			throw new VisionDlaException("Failed to send Email");
		}
		return message;
	}
	
	private String getSubject(String subject){
		String documentNumber = (getDocumentNumber() != null) ? getDocumentNumber():"";
		subject = subject.replaceAll("<Document_Number>", documentNumber);
		String webSdrNumber = (getWebSdrNumber() != null) ? getWebSdrNumber() : "";
		subject = subject.replaceAll("<WebSDR_Number>", webSdrNumber);
		return subject;
	}
	
	private String getContent(String content){
		String documentNumber = (getDocumentNumber() != null) ? "(" + getDocumentNumber() + ")":"";
		content = content.replaceAll("<Document_Number>",  documentNumber );
		String webSdrNumber = (getWebSdrNumber() != null) ? "(" + getWebSdrNumber() + ")" : "";
		content = content.replaceAll("<WebSDR_Number>", webSdrNumber);
		String fileName = (getFileName() != null) ? getFileName():"";
		content =  content.replaceAll("<file_name>",fileName);
		String errorMsg = (getErrorMessage() != null)? getErrorMessage():"";
		content = content.replaceAll("<error_message>", errorMsg);
		content = content.replaceAll("<line_seperator>", "\n");
		return content;
	}	
	
	private Address[] getAddresses(List<String> addrs) throws AddressException{
		if(addrs == null) {return null;}
		List<Address> addrList = new ArrayList<Address>();
		for(String addr : addrs){
			addrList.add(new InternetAddress(addr));
		}
		return addrList.toArray(new Address[0]);
	}
	
	private Session getSession() throws VisionDlaException{
		Properties props = new Properties();
		Session mailSession = null;
		String smtpHost=VisionDlaConfig.getPropertyValue(ConfigConstants.SMTP_HOST);
		props.put(ConfigConstants.SMTP_HOST, VisionDlaConfig.getPropertyValue(ConfigConstants.SMTP_HOST));
		props.put(ConfigConstants.SMTP_PORT, VisionDlaConfig.getPropertyValue(ConfigConstants.SMTP_PORT));
		if (smtpHost != null && smtpHost.equals("smtp.gsa.gov") )
				mailSession = Session.getInstance(props);	
		else{
			try {
				javax.naming.Context ictx = new javax.naming.InitialContext();
				mailSession = (Session) ictx.lookup("java:/Mail");
			} catch (NamingException e) {
				logger.error("getSession(): Failed to get Java Mail Session", e);
				throw new VisionDlaException("Failed to get Java Mail Session");
			}
		}

    return mailSession;
		
	}

	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the webSdrNumber
	 */
	public String getWebSdrNumber() {
		return webSdrNumber;
	}

	/**
	 * @param webSdrNumber the webSdrNumber to set
	 */
	public void setWebSdrNumber(String webSdrNumber) {
		this.webSdrNumber = webSdrNumber;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
