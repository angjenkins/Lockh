/**
 * ExistsGovernmentOfficeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.exists;

import java.math.BigInteger;

public class ExistsGovernmentOfficeResponseType {
	private java.lang.Boolean isExists;
	public java.math.BigInteger requestNumber;
    public java.math.BigInteger confirmationNumber;
	public ParameterTypeExists[] listOfParameters;
	public OutputMessagesTypeExists outputMessages;

	public ExistsGovernmentOfficeResponseType() {
	}

	public ExistsGovernmentOfficeResponseType(
			java.math.BigInteger requestNumber,
			java.math.BigInteger confirmationNumber,
			com.fpds.exists.ParameterTypeExists[] listOfParameters,
			com.fpds.exists.OutputMessagesTypeExists outputMessages,
			java.lang.Boolean isExists) {
		this.isExists = isExists;
		this.requestNumber = requestNumber;
    	this.confirmationNumber = confirmationNumber;
    	this.listOfParameters = listOfParameters;
    	this.outputMessages = outputMessages;
    	
	}


	/**
	 * Gets the isExists value for this ExistsGovernmentOfficeResponseType.
	 * 
	 * @return isExists
	 */
	public java.lang.Boolean getIsExists() {
		return isExists;
	}

	/**
	 * Sets the isExists value for this ExistsGovernmentOfficeResponseType.
	 * 
	 * @param isExists
	 */
	public void setIsExists(java.lang.Boolean isExists) {
		this.isExists = isExists;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExistsGovernmentOfficeResponseType))
			return false;
		ExistsGovernmentOfficeResponseType other = (ExistsGovernmentOfficeResponseType) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.isExists == null && other.getIsExists() == null) || (this.isExists != null && this.isExists
						.equals(other.getIsExists())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getIsExists() != null) {
			_hashCode += getIsExists().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

}
