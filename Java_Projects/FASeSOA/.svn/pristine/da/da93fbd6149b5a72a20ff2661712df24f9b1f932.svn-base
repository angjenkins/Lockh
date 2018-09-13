/*
 * @(#)Utility.java			Jun 19, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.common;
import org.apache.commons.lang3.StringUtils;

/**
 * <code>Utility</code> provides common utility functions.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class Utility {

	/**
	 * Pads string right with spaces, to the specified length.
	 * If the string value is null, initiates empty string.
	 * If the string length more, it won't truncate.
	 * 
	 * @param 	s	String to format
	 * @param 	n	padded string length
	 * @return	returns padded string
	 */
	public static String padRight(String s, int n) {
		if(s == null) s="";
		return String.format("%1$-" + n + "s", s);
	}  
	
	/**
	 * Pads string left with spaces, to the specified length. 
	 * If the string value is null, initiates empty string.
	 * If the string length more, it won't truncate.
	 * 
	 * @param 	s	String to format
	 * @param 	n	padded string length
	 * @return	returns padded string
	 */
	public static String padLeft(String s, int n) {
		if(s == null) s="";
		//return String.format("%1$#" + n + "s", s);
		//The above statement does not work in jdk7
		return StringUtils.leftPad(s,n);
	}
	
	/**
	 * Pads string left with specified character, to the specified length. 
	 * If the string value is null, initiates empty string.
	 * If the string length more, it won't truncate.
	 * 
	 * @param 	s String to format
	 * @param 	n padded string length
	 * @param 	c character to be padded
	 * @return  returns padded string
	 */
	public static String padLeft(String s, int n, char c){
		return padLeft(s, n).replaceAll(" ", String.valueOf(c));
	}
	
	//Testing purpose only
	public static void main(String args[]){
		String str = "89";
		System.out.println("String length->" + str + str.length());
		String rightPaddedStr = padLeft(str, 10, '0');
		System.out.println("Padded string length->" + rightPaddedStr + rightPaddedStr.length());
	}
}
