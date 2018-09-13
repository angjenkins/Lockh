/*
 * @(#)DateUtility.java			Jun 4, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <code>DateUtility</code> provides common utility methods for
 * all services.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class DateUtility {
	
	/**
	 * Converts the date string to <code>java.util.Date</code>
	 * object
	 * 
	 * @param 	dateStr
	 * @param 	pattern
	 * @return	<code>java.util.Date</code> object
	 * @throws 	ParseException, if parsing failed
	 */
	public static java.util.Date dateStringToUtilDate(String dateStr, String pattern) 
																		throws ParseException{
		if(dateStr == null || dateStr.isEmpty() || 
				pattern == null || pattern.isEmpty()){
			return null;
		}
		DateFormat formatter = new SimpleDateFormat(pattern);  
		java.util.Date utilDate = (java.util.Date)formatter.parse(dateStr);
		return utilDate;
	}
	
	/**
	 * Converts <code>java.sql.Timestamp</code> to <code>XMLGregorianCalendar</code> 
	 * object.
	 * 
	 * @param 	timestamp
	 * @return	
	 */
	public static XMLGregorianCalendar timestampToXMLGregCalendar(java.sql.Timestamp timestamp) {
		if(timestamp == null){
			return null;
		}
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		gregCal.setTimeInMillis(timestamp.getTime());
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;
	}
	
	/**
	 * Parses date string to <code>java.util.Date</code> applying pattern and converts 
	 * it to <code>javax.xml.datatype.XMLGregorianCalendar</code> object.
	 * 
	 * @param 	dateStr
	 * @param 	pattern
	 * @return	<code>javax.xml.datatype.XMLGregorianCalendar</code> object
	 */
	public static XMLGregorianCalendar dateStringToXMLGregCalendar(String dateStr, String pattern) 
																													throws ParseException{
		if(dateStr == null || dateStr.isEmpty() || 
				pattern == null || pattern.isEmpty()){
			return null;
		}
		DateFormat formatter = new SimpleDateFormat(pattern);  
		java.util.Date utilDate = (java.util.Date)formatter.parse(dateStr);
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		gregCal.setTime(utilDate);
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;
	}

	/**
	 * Converts Julian Date to <code>javax.xml.datatype.XMLGregorianCalendar</code> object.
	 * 
	 * @param 	julianDate
	 * @return	<code>javax.xml.datatype.XMLGregorianCalendar</code> object
	 * @throws 	ParseException
	 */
	public static XMLGregorianCalendar julianToXMLGregCalendar(Long julianDate) throws ParseException{
		if(julianDate == null || julianDate.longValue() == 0){
			return null;
		}
		DateFormat formatter = new SimpleDateFormat("yyyyD");  
		java.util.Date utilDate = (java.util.Date)formatter.parse(julianDate.toString());
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		gregCal.setTime(utilDate);
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;		
	}
	
	/**
	 * Converts Gregorian Date to <code>javax.xml.datatype.XMLGregorianCalendar</code> object.
	 * 
	 * @param 	gregDate
	 * @return	<code>javax.xml.datatype.XMLGregorianCalendar</code> object
	 * @throws 	ParseException
	 */
	public static XMLGregorianCalendar gregorianToXMLGregCalendar(Long gregDate) throws ParseException{
		if(gregDate == null || gregDate.longValue() == 0){
			return null;
		}
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");  
		java.util.Date utilDate = (java.util.Date)formatter.parse(gregDate.toString());
		java.util.GregorianCalendar gregCal = new java.util.GregorianCalendar();
		gregCal.setTime(utilDate);
		XMLGregorianCalendar xmlGregCal=null;
		try {
			xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlGregCal;		
	}	
	
	/**
	 * Returns the current <code>java.sql.Timestamp</code> object.
	 * 
	 * @return
	 */
	public static java.sql.Timestamp getCurrentTimestamp(){
		Calendar calendar = Calendar.getInstance();
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	/**
	 * Converts <code>XMLGregorianCalendar</code> to <code>java.sql.Timestamp</code>
	 * object.
	 * 
	 * @param 	xmlGregCal
	 * @return	<code>java.sql.Timestamp</code> object
	 */
	public static java.sql.Timestamp xmlGregCalendarToTimestamp(XMLGregorianCalendar xmlGregCal){
		if(xmlGregCal == null){
			return null;
		}
		return new java.sql.Timestamp(xmlGregCal.toGregorianCalendar().getTimeInMillis());
	}	
	
	/**
	 * Returns the current time string, based on the format provided.
	 * 
	 * @return
	 */
	public static String getCurrentTimeString(String timeFormat){
		Calendar calendar = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat(timeFormat);
		return dateFormat.format(calendar.getTime());
	}	
	
	/**
	 * Returns the current time string, based on the format provided.
	 * 
	 * @return
	 */	
	public static String getCurrentDateString(String dateFormat){
		Calendar calendar = Calendar.getInstance();
		DateFormat dateFormatter = new SimpleDateFormat(dateFormat);
		return dateFormatter.format(calendar.getTime());
	}
	
	/**
	 * Converts <code>XMLGregorianCalendar</code> to date <code>java.lang.String</code>
	 * based on the format provided.
	 * 
	 * @param 	xmlGregCal
	 * @param 	dateFormat
	 * @return	<code>java.sql.Timestamp</code> object
	 */
	public static String xmlGregCalendarToDateString(XMLGregorianCalendar xmlGregCal,
			String dateFormat){
		if(xmlGregCal == null || dateFormat == null){
			return null;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(xmlGregCal.toGregorianCalendar().getTime());
	}
}
