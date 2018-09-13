package gov.gsa.fas.AutoChoice.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
*/
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

import java.util.*;
/*
import java.io.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.persistence.EntityManager;
import javax.activation.*;
*/
public class SendMail {
	public void sendEmail(String sender, String recipient, String ccRecipient, String subject,String body, String attachmentPath) {

        // SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!

        String from = sender;
        // SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!!!
        String host = "smtp.gsa.gov";

        // Create properties for the Session
        Properties props = new Properties();

        // If using static Transport.send(),
        // need to specify the mail server here
        props.put("mail.smtp.host", host);
        // To see what is going on behind the scene
        //props.put("mail.debug", "true");

        // Get a session
        Session session = Session.getInstance(props);

      
        try {
            // Get a Transport object to send e-mail
            Transport bus = session.getTransport("smtp");

            // Connect only once here
            // Transport.send() disconnects after each send
            // Usually, no username and password is required for SMTP
            bus.connect();
            //bus.connect("smtpserver.yourisp.net", "username", "password");

            // Instantiate a message
            Message msg = new MimeMessage(session);
//          // extracts the senders and adds them to the message.
//          // Sender is a comma-separated list of e-mail addresses as per RFC822.
          InternetAddress[] theAddresses = InternetAddress.parse(sender);
          msg.addFrom(theAddresses);
          msg.setFrom(new InternetAddress(from));
          // Extract the recipients and assign them to the message.
          theAddresses = InternetAddress.parse(recipient);
//          msg.addRecipients(Message.RecipientType.TO,theAddresses);
          //must be removed before go to production 
//          theAddresses = InternetAddress.parse(sender);
          msg.addRecipients(Message.RecipientType.TO, theAddresses);
//          msg.setRecipients(Message.RecipientType.TO, theAddresses);
          
          // Extract the Cc-recipients and assign them to the message;
          // CcRecipient is a comma-separated list of e-mail addresses as per RFC822
          if (null != ccRecipient) {
             theAddresses = InternetAddress.parse(ccRecipient);
//             msg.addRecipients(Message.RecipientType.CC,theAddresses);
             //must be removed before go to production 
//             theAddresses = InternetAddress.parse(recipient);
             msg.addRecipients(Message.RecipientType.CC, theAddresses);
//             msg.setRecipients(Message.RecipientType.CC,theAddresses);                     
          }
            // Set message attributes
            
//            InternetAddress[] address = {new InternetAddress(to)};
//            msg.setRecipients(Message.RecipientType.TO, address);
            // Parse a comma-separated list of email addresses. Be strict.
//            msg.setRecipients(Message.RecipientType.CC,
//                                InternetAddress.parse(to, true));
            // Parse comma/space-separated list. Cut some slack.
//            msg.setRecipients(Message.RecipientType.BCC,
//                                InternetAddress.parse(to, false));

            msg.setSubject(subject);
            msg.setDescription(body);
            msg.setSentDate(new Date());

//            // Set message content and send
//            setTextContent(msg);
//            msg.saveChanges();
//            bus.sendMessage(msg, address);

//            setMultipartContent(msg);
//            msg.saveChanges();
//            bus.sendMessage(msg, address);
            if(attachmentPath != null && !attachmentPath.equalsIgnoreCase("")){
	            setFileAsAttachment(msg, attachmentPath);
	            msg.saveChanges();
	            bus.send(msg);
            }
            else{
            	setHTMLContent(msg);
	            msg.saveChanges();
	            bus.send(msg);
            }

	            

            bus.close();

        }
        catch (MessagingException mex) {
            // Prints all nested (chained) exceptions as well
            mex.printStackTrace();
            // How to access nested exceptions
            while (mex.getNextException() != null) {
                // Get next exception in chain
                Exception ex = mex.getNextException();
                ex.printStackTrace();
                if (!(ex instanceof MessagingException)) break;
                else mex = (MessagingException)ex;
            }
        }
    }



    // A simple, single-part text/plain e-mail.
    public static void setTextContent(Message msg) throws MessagingException {
            // Set message content
            String mytxt = "This is a test of sending a " +
                            "plain text e-mail through Java.\n" +
                            "Here is line 2.";
            msg.setText(mytxt);

            // Alternate form
            msg.setContent(mytxt, "text/plain");

    }



    // A simple multipart/mixed e-mail. Both body parts are text/plain.
    public static void setMultipartContent(Message msg) throws MessagingException {
        // Create and fill first part
        MimeBodyPart p1 = new MimeBodyPart();
        p1.setText("This is part one of a test multipart e-mail.");

        // Create and fill second part
        MimeBodyPart p2 = new MimeBodyPart();
        // Here is how to set a charset on textual content
        p2.setText("This is the second part", "us-ascii");

        // Create the Multipart.  Add BodyParts to it.
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(p1);
        mp.addBodyPart(p2);

        // Set Multipart as the message's content
        msg.setContent(mp);
    }



    // Set a file as an attachment.  Uses JAF FileDataSource.
    public static void setFileAsAttachment(Message msg, String filename)
             throws MessagingException {

        // Create and fill first part
        MimeBodyPart p1 = new MimeBodyPart();
        p1.setDataHandler(new DataHandler(new HTMLDataSource(msg.getDescription())));
//        p1.setText(msg.getDescription());       
        // Create second part
        MimeBodyPart p2 = new MimeBodyPart();

        // Put a file in the second part
        FileDataSource fds = new FileDataSource(filename);
        p2.setDataHandler(new DataHandler(fds));
        p2.setFileName(fds.getName());

        // Create the Multipart.  Add BodyParts to it.
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(p1);
        mp.addBodyPart(p2);

        // Set Multipart as the message's content
        msg.setContent(mp);
    }



    // Set a single part html content.
    // Sending data of any type is similar.
    public static void setHTMLContent(Message msg) throws MessagingException {

        String html = msg.getDescription();

        // HTMLDataSource is an inner class
        msg.setDataHandler(new DataHandler(new HTMLDataSource(html)));
    }



    /*
     * Inner class to act as a JAF datasource to send HTML e-mail content
     */
    static class HTMLDataSource implements DataSource {
        private String html;

        public HTMLDataSource(String htmlString) {
            html = htmlString;
        }

        // Return html string in an InputStream.
        // A new stream must be returned each time.
        public InputStream getInputStream() throws IOException {
            if (html == null) throw new IOException("Null HTML");
            return new ByteArrayInputStream(html.getBytes());
        }

        public OutputStream getOutputStream() throws IOException {
            throw new IOException("This DataHandler cannot write HTML");
        }

        public String getContentType() {
            return "text/html";
        }

        public String getName() {
            return "JAF text/html dataSource to send e-mail only";
        }
    }

 /*   public String sendAllEmails(EntityManager em) {
    	SendMail sm = new SendMail();
    	try
    	{
    		List<Masteremaillist> m = sm.getEmailList(em);
    		String subject = "Auto Auctions User Reregistration";
    		StringBuffer bodyStr = new StringBuffer();
    		bodyStr.append("<html><head><meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'></head>");
    		bodyStr.append("<body><table width='100%' border='0'><tr><td>&nbsp;</td></tr>");
    		bodyStr.append("<tr><td><strong>Dear GSA Fleet customers:</strong></td></tr>");
    		bodyStr.append("<tr><td>&nbsp;</td></tr>");
    		bodyStr.append("<tr><td>On November 7, 2009 we have launched our refreshed website. Several enhancements </td></tr>");
    		bodyStr.append("<tr><td>have been made to make our website more user-friendly, to better inform you of </td></tr>");
    		bodyStr.append("<tr><td>upcoming sales and to make your search for a vehicle, simpler.  If you are currently</tr></td>");
    		bodyStr.append("<tr><td>registered to receive notification emails through www.autoauctions.gsa.gov, you</td></tr>");
    		bodyStr.append("<tr><td>will need to re-register to continue to receive notifications. We apologize</tr></td>");
    		bodyStr.append("<tr><td>for any inconvenience that this may have created. If you have already</td></tr>");
    		bodyStr.append("<tr><td>registered, please ignore this email</td></tr>");
    		bodyStr.append("<tr><td>&nbsp;</td></tr>");
    		bodyStr.append("<tr><td>&nbsp;</td></tr>");
    		bodyStr.append("<tr><td><strong>GSA Fleet Vehicle Sales www.autoauctions.gsa.gov</strong></td></tr>"); */
/*    		String body= "Dear GSA Fleet customers: <br/>" +
    		"On October 17, 2009 we will launch our refreshed website. Several enhancements have been made to make our website more " +
    		"user-friendly, to better inform you of upcoming sales and to make your search for a vehicle simpler. If you are currently registered " +
    		"to receive notification emails through www.autoauctions.gsa.gov, you will need to re-register to continue to receive notifications. " +
    		"On the date of the launch of the new website, you will receive an email requesting that you re-register." +
    		"We apologize for any inconvenience that this may have created. GSA Fleet Vehicle Sales www.autoauctions.gsa.gov"; */
 //   		for (Masteremaillist me : m)
 //   		{
/*    			if (me.getEmail().equals("pramod.nair@gsa.gov") 
   					|| me.getEmail().equals("ramachandra.nagarajan@gsa.gov")
    				|| me.getEmail().equals("chaitanya.kakarla@gsa.gov")    				
    				|| me.getEmail().equals("ali.talib@gsa.gov")
    				|| me.getEmail().equals("dhirendra.shah@gsa.gov"))
    			{*/
 /*   			try{
    				System.out.println(me.getEmail());
    				sm.sendEmail("autoauctions@gsa.gov", me.getEmail(), "", subject, bodyStr.toString(), null);
    			}
    			catch (Exception e)
    			{
    				System.out.println(e.getMessage());
    				
    			}
 //   			}
    		}
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	return "send";
    }*/
    
/*    public List<EmailMasterDTO> getEmailList(EntityManager em) throws Exception 
	{
    	List<Masteremaillist> usrEmailList = null;
		StringBuffer query = new StringBuffer();
		try 
		{
			query.append("select m from Masteremaillist m");
			usrEmailList = em.createQuery(query.toString()).getResultList();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		return usrEmailList;
	}*/

}

