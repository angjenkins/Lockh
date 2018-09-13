/**
 * OutputMessagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.service;

public class OutputMessagesType {
    private com.fpds.service.ErrorType[] listOfErrors;

    private com.fpds.service.WarningType[] listOfWarnings;

    private com.fpds.service.InfoType[] listOfInfoMessages;

    public OutputMessagesType() {
    }

    public OutputMessagesType(
           com.fpds.service.ErrorType[] listOfErrors,
           com.fpds.service.WarningType[] listOfWarnings,
           com.fpds.service.InfoType[] listOfInfoMessages) {
           this.listOfErrors = listOfErrors;
           this.listOfWarnings = listOfWarnings;
           this.listOfInfoMessages = listOfInfoMessages;
    }


    /**
     * Gets the listOfErrors value for this OutputMessagesType.
     * 
     * @return listOfErrors
     */
    public com.fpds.service.ErrorType[] getListOfErrors() {
        return listOfErrors;
    }


    /**
     * Sets the listOfErrors value for this OutputMessagesType.
     * 
     * @param listOfErrors
     */
    public void setListOfErrors(com.fpds.service.ErrorType[] listOfErrors) {
        this.listOfErrors = listOfErrors;
    }


    /**
     * Gets the listOfWarnings value for this OutputMessagesType.
     * 
     * @return listOfWarnings
     */
    public com.fpds.service.WarningType[] getListOfWarnings() {
        return listOfWarnings;
    }


    /**
     * Sets the listOfWarnings value for this OutputMessagesType.
     * 
     * @param listOfWarnings
     */
    public void setListOfWarnings(com.fpds.service.WarningType[] listOfWarnings) {
        this.listOfWarnings = listOfWarnings;
    }


    /**
     * Gets the listOfInfoMessages value for this OutputMessagesType.
     * 
     * @return listOfInfoMessages
     */
    public com.fpds.service.InfoType[] getListOfInfoMessages() {
        return listOfInfoMessages;
    }


    /**
     * Sets the listOfInfoMessages value for this OutputMessagesType.
     * 
     * @param listOfInfoMessages
     */
    public void setListOfInfoMessages(com.fpds.service.InfoType[] listOfInfoMessages) {
        this.listOfInfoMessages = listOfInfoMessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutputMessagesType)) return false;
        OutputMessagesType other = (OutputMessagesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listOfErrors==null && other.getListOfErrors()==null) || 
             (this.listOfErrors!=null &&
              java.util.Arrays.equals(this.listOfErrors, other.getListOfErrors()))) &&
            ((this.listOfWarnings==null && other.getListOfWarnings()==null) || 
             (this.listOfWarnings!=null &&
              java.util.Arrays.equals(this.listOfWarnings, other.getListOfWarnings()))) &&
            ((this.listOfInfoMessages==null && other.getListOfInfoMessages()==null) || 
             (this.listOfInfoMessages!=null &&
              java.util.Arrays.equals(this.listOfInfoMessages, other.getListOfInfoMessages())));
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
        if (getListOfErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfWarnings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfInfoMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfInfoMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfInfoMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }


}
