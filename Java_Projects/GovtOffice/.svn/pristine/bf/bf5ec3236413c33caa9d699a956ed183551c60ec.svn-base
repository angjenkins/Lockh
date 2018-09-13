/**
 * ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.getlist;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="ErrorType",namespace="http://www.getlist.com")
public class ErrorType  {
    private java.lang.String[] elementName;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    public ErrorType() {
    }

    public ErrorType(
           java.lang.String[] elementName,
           java.lang.String errorCode,
           java.lang.String errorMessage) {
           this.elementName = elementName;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the elementName value for this ErrorType.
     * 
     * @return elementName
     */
    public java.lang.String[] getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this ErrorType.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String[] elementName) {
        this.elementName = elementName;
    }

    public java.lang.String getElementName(int i) {
        return this.elementName[i];
    }

    public void setElementName(int i, java.lang.String _value) {
        this.elementName[i] = _value;
    }


    /**
     * Gets the errorCode value for this ErrorType.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ErrorType.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this ErrorType.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ErrorType.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorType)) return false;
        ErrorType other = (ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              java.util.Arrays.equals(this.elementName, other.getElementName()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getElementName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }


}
