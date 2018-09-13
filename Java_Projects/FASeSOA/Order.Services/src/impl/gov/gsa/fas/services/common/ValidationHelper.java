/*
 * @(#)ValidationHelper.java			Aug 16, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <code>ValidationHelper</code> provides validation helper methods.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ValidationHelper {

	/**
	 * Checks if the field required or not, also checks length
	 * of the field. If the field validation failed returns 
	 * validation message.
	 * 
	 * @param field
	 * @param maxLen
	 * @param required
	 * @param fieldName
	 * @return
	 */
	public static String validateField(String field, int maxLen, 
											boolean required, String fieldName){
		String msg = null;
		if(required && (field == null || field.trim().isEmpty())){
			msg = fieldName + " is required field, can't be null or empty";
			return msg;
		}
		if(field != null && field.length() > maxLen){
			msg  = fieldName + " length exceeds maximum length " + maxLen;
			return msg;
		}
		return null;
	}
	
	/**
	 * Checks if the field required or not, also checks length
	 * of the field. If the field validation failed add it to the 
	 * messages.
	 * 
	 * @param fieldValue
	 * @param maxLen
	 * @param required
	 * @param fieldName
	 * @param msgs
	 */
	public static void validateField(String fieldValue, int maxLen, boolean required, 
			String fieldName, ArrayList<String> msgs){
		String msg = ValidationHelper.validateField(fieldValue, maxLen, required, 
					fieldName);
		if(msg != null && msg.trim().length() >0){
			msgs.add(msg);
		}
	}
	
	/**
	 * Validates numeric field value is <= 0, also if field value
	 * exceeds maximum value or not. If the field validation failed 
	 * returns validation message.
	 * 
	 * @param field
	 * @param maxVal
	 * @param required
	 * @param fieldName
	 * @return
	 */
	public static String validateField(long field, long maxVal,
											boolean required, String fieldName){
		String msg = null;
		if(required && field <= 0){
			msg = fieldName + " is required field, can't be 0";
			return msg;
		}
		if(field > maxVal){
			msg = fieldName + " exceeds maximum value " + maxVal;
			return msg;
		}
		return null;
	}	
	
	/**
	 * Validates numeric field value is <= 0, also if field value
	 * exceeds maximum value or not. If the field validation failed 
	 * add it to the validation messages.
	 * 
	 * @param field
	 * @param maxVal
	 * @param required
	 * @param fieldName
	 * @param msgs
	 */
	public static void validateField(long field, long maxVal,
											boolean required, String fieldName, ArrayList<String> msgs){
		String msg = ValidationHelper.validateField(field, maxVal, required, 
				fieldName);
		if(msg != null && msg.trim().length() >0){
			msgs.add(msg);
		}
	}	
	
	/**
	 * Validates numeric field value is <= 0, also if field value
	 * is in the specified range or not. If the field validation failed 
	 * returns validation message.
	 * 
	 * @param field
	 * @param allowedValues
	 * @param required
	 * @param fieldName
	 * @return
	 */
	public static String validateField(long field, int[] allowedValues,
														boolean required, String fieldName){
		String msg = null;
		if(required && allowedValues != null && allowedValues.length > 0){
			boolean valueValid = false;
			for(int validValue:allowedValues){
				if(field == validValue){
					valueValid = true;
					break;
				}
			}
			if(!valueValid){
				String allowedValStr = Arrays.toString(allowedValues);
				msg = fieldName + " is not in the range of values " + allowedValStr;
				return msg;
			}
		}
		return null;
	}
	
	/**
	 * Checks if the field required or not, also checks value is in valid
	 * values. If the field validation failed returns validation message.
	 * 
	 * @param field
	 * @param allowedValues
	 * @param required
	 * @param fieldName
	 * @return
	 */
	public static String validateField(String field, String[] allowedValues,
										boolean required, String fieldName){
		String msg = null;
		if(required && (field == null || field.trim().isEmpty())){
			msg = fieldName + " is required field, can't be null or empty";
			return msg;
		}
		if(field != null && allowedValues != null && allowedValues.length > 0){
			boolean valueValid = false;
			for(String validValue:allowedValues){
				if(field.equals(validValue)){
					valueValid = true;
					break;
				}
			}
			if(!valueValid){
				String allowedValStr = Arrays.toString(allowedValues);
				msg = fieldName + " is not in the range of values " + allowedValStr;
				return msg;
			}	
		}
		return null;		
	}
	
	/**
	 * Checks if the field required or not, also checks value is in valid
	 * values. If the field validation failed add it to the messages.
	 * 
	 * @param fieldValue
	 * @param allowedValues
	 * @param required
	 * @param fieldName
	 * @param msgs
	 */
	public static void validateField(String fieldValue, String[] allowedValues, 
			boolean required, String fieldName, ArrayList<String> msgs){
		String msg = ValidationHelper.validateField(fieldValue, allowedValues, required, 
				fieldName);
		if(msgs != null && msg != null && msg.trim().length() >0){
			msgs.add(msg);
		}
	}		
	
}
