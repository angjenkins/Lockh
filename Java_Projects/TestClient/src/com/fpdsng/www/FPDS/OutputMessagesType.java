/**
 * OutputMessagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class OutputMessagesType  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.ErrorType[] listOfErrors;

    private com.fpdsng.www.FPDS.WarningType[] listOfWarnings;

    private com.fpdsng.www.FPDS.InfoType[] listOfInfoMessages;

    public OutputMessagesType() {
    }

    public OutputMessagesType(
           com.fpdsng.www.FPDS.ErrorType[] listOfErrors,
           com.fpdsng.www.FPDS.WarningType[] listOfWarnings,
           com.fpdsng.www.FPDS.InfoType[] listOfInfoMessages) {
           this.listOfErrors = listOfErrors;
           this.listOfWarnings = listOfWarnings;
           this.listOfInfoMessages = listOfInfoMessages;
    }


    /**
     * Gets the listOfErrors value for this OutputMessagesType.
     * 
     * @return listOfErrors
     */
    public com.fpdsng.www.FPDS.ErrorType[] getListOfErrors() {
        return listOfErrors;
    }


    /**
     * Sets the listOfErrors value for this OutputMessagesType.
     * 
     * @param listOfErrors
     */
    public void setListOfErrors(com.fpdsng.www.FPDS.ErrorType[] listOfErrors) {
        this.listOfErrors = listOfErrors;
    }


    /**
     * Gets the listOfWarnings value for this OutputMessagesType.
     * 
     * @return listOfWarnings
     */
    public com.fpdsng.www.FPDS.WarningType[] getListOfWarnings() {
        return listOfWarnings;
    }


    /**
     * Sets the listOfWarnings value for this OutputMessagesType.
     * 
     * @param listOfWarnings
     */
    public void setListOfWarnings(com.fpdsng.www.FPDS.WarningType[] listOfWarnings) {
        this.listOfWarnings = listOfWarnings;
    }


    /**
     * Gets the listOfInfoMessages value for this OutputMessagesType.
     * 
     * @return listOfInfoMessages
     */
    public com.fpdsng.www.FPDS.InfoType[] getListOfInfoMessages() {
        return listOfInfoMessages;
    }


    /**
     * Sets the listOfInfoMessages value for this OutputMessagesType.
     * 
     * @param listOfInfoMessages
     */
    public void setListOfInfoMessages(com.fpdsng.www.FPDS.InfoType[] listOfInfoMessages) {
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

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutputMessagesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "outputMessagesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "errorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "error"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfWarnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfWarnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warning"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfInfoMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfInfoMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "info"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
