/*
 * @(#)Utility.java			Aug 21, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.attachment.common;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import gov.gsa.fas.attachment.config.ConfigConstants;
import gov.gsa.fas.attachment.config.AttachmentConfig;


/**
 * <code>Utility</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class Utility {
	private static final Logger logger = Logger.getLogger(Utility.class.getName());
	private static InitialContext ctx;
	
	/**
	 * Returns the current <code>java.sql.Timestamp</code> object.
	 * 
	 * @return
	 */
	public static java.sql.Timestamp getCurrentTimestamp(){
		Calendar calendar = Calendar.getInstance();
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	public static String getNow(String dateFormat) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}
	

	public static XMLGregorianCalendar getCurrentXMLGregCalendar(){
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		gregCal.setTime(cal.getTime());
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;
	}	

	/**
		 * Get the local EJB of <code>VisionDlaPersistence</code> object.
		 * 
		 * @return	<code>VisionDlaPersistence</code> local object
		 * @throws 	NamingException, if lookup fails
		 */
	
	
	public static XMLGregorianCalendar dateToXMLGregCalendar(java.util.Date date){
		if(date == null){
			return null;
		}
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		gregCal.setTime(date);
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;
	}
	
	public static void notifyDatabaseError(String errorMessage) {
		logger.info("notifyDatabaseError(): Sending Email for Database notification failure->" + 
				errorMessage);
		/*EmailNotificationManager emailMgr = new EmailNotificationManager();
		EmailNotification emailNotification = new EmailNotification();
		emailNotification.setNotificationType("VISION_DATABASE_ERROR");
		emailNotification.setSubject("GSA-WebSDR: VISION Database Errors");
		emailNotification.setContent("This is a system-generated message from VISION-DLA. Do NOT reply to this email.<line_seperator>The system is unable to connect to the database for the following reason:<line_seperator><error_message><line_seperator> Please correct the problems immediately.<line_seperator>Thank you.<line_seperator>VISION-DLA");
		emailNotification.setFromAddress("donotreply@gsa.gov");
		String toAddr = VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_POC_EMAIL);
		emailNotification.setToAddress(getStringList(toAddr));
		emailMgr.setErrorMessage(errorMessage);
		try {
			emailMgr.sendEmail(emailNotification);
		} catch (VisionDlaException e) {
			logger.error("notifyDatabaseError(): Failed send Email Notification for Database failure", e);
		}*/
	}

	/**
	 * @param string
	 * @return
	 */
	public static List<String> getStringList(String str) {
		if(str == null){
			return null;
		}
		if(str.indexOf(",") == -1){
			return Arrays.asList(new String[]{str});
		}
		String delims = ",";
		String[] addrs = str.split(delims);
		return Arrays.asList(addrs);
	}
}
