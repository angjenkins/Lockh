/**
 * EnableGovernmentOfficeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class EnableGovernmentOfficeResponseType  extends com.fpdsng.www.FPDS.ResponseType  implements java.io.Serializable {
    private java.lang.Boolean isEnabled;

    public EnableGovernmentOfficeResponseType() {
    }

    public EnableGovernmentOfficeResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpdsng.www.FPDS.ParameterType[] listOfParameters,
           com.fpdsng.www.FPDS.OutputMessagesType outputMessages,
           java.lang.Boolean isEnabled) {
        super(
            requestNumber,
            confirmationNumber,
            listOfParameters,
            outputMessages);
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the isEnabled value for this EnableGovernmentOfficeResponseType.
     * 
     * @return isEnabled
     */
    public java.lang.Boolean getIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this EnableGovernmentOfficeResponseType.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(java.lang.Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnableGovernmentOfficeResponseType)) return false;
        EnableGovernmentOfficeResponseType other = (EnableGovernmentOfficeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isEnabled==null && other.getIsEnabled()==null) || 
             (this.isEnabled!=null &&
              this.isEnabled.equals(other.getIsEnabled())));
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
        if (getIsEnabled() != null) {
            _hashCode += getIsEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnableGovernmentOfficeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "enableGovernmentOfficeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "isEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
