/**
 * GetListGovernmentOfficeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.getlist;

import javax.xml.bind.annotation.XmlType;

import com.fpds.getlist.OutputMessagesType;
import com.fpds.getlist.ParameterType;
@XmlType(name="GetListGovernmentOfficeResponseType",namespace="http://www.getlist.com")
public class GetListGovernmentOfficeResponseType   {
    private com.fpds.getlist.ListOfGovernmentOfficesType listOfGovernmentOffices;
	public java.math.BigInteger requestNumber;
    public java.math.BigInteger confirmationNumber;
	public ParameterType[] listOfParameters;
	public OutputMessagesType outputMessages;


    public GetListGovernmentOfficeResponseType() {
    }

    public GetListGovernmentOfficeResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpds.getlist.ParameterType[] listOfParameters,
           com.fpds.getlist.OutputMessagesType outputMessages,
           com.fpds.getlist.ListOfGovernmentOfficesType listOfGovernmentOffices) {
        this.listOfGovernmentOffices = listOfGovernmentOffices;
    	this.requestNumber = requestNumber;
    	this.confirmationNumber = confirmationNumber;
    	this.listOfParameters = listOfParameters;
    	this.outputMessages = outputMessages;
    }


    /**
     * Gets the listOfGovernmentOffices value for this GetListGovernmentOfficeResponseType.
     * 
     * @return listOfGovernmentOffices
     */
    public com.fpds.getlist.ListOfGovernmentOfficesType getListOfGovernmentOffices() {
        return listOfGovernmentOffices;
    }


    /**
     * Sets the listOfGovernmentOffices value for this GetListGovernmentOfficeResponseType.
     * 
     * @param listOfGovernmentOffices
     */
    public void setListOfGovernmentOffices(com.fpds.getlist.ListOfGovernmentOfficesType listOfGovernmentOffices) {
        this.listOfGovernmentOffices = listOfGovernmentOffices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListGovernmentOfficeResponseType)) return false;
        GetListGovernmentOfficeResponseType other = (GetListGovernmentOfficeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.listOfGovernmentOffices==null && other.getListOfGovernmentOffices()==null) || 
             (this.listOfGovernmentOffices!=null &&
              this.listOfGovernmentOffices.equals(other.getListOfGovernmentOffices())));
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
        if (getListOfGovernmentOffices() != null) {
            _hashCode += getListOfGovernmentOffices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }


}
