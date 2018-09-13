/*
 * @(#)EmailTest.java			Sep 16, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.vision.dla.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * <code>EmailTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailTest {
	public static void main(String[] args) {
		 
//		final String username = "username@gmail.com";
//		final String password = "password";
 
		Properties props = new Properties();
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gsa.gov");
		props.put("mail.smtp.port", "25");
 
		Session session = Session.getInstance(props);//,
//		  new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(username, password);
//			}
//		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("do.not.reply@gsa.gov"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("prasad.nerayanuru@gsa.gov"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler\n No spam to my email, please!");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	
}
