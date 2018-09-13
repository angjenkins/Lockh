/**
 * UpdateOrganizationAssociationsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class UpdateOrganizationAssociationsResponseType  extends com.fpdsng.www.FPDS.ResponseType  implements java.io.Serializable {
    private java.lang.Boolean isUpdated;

    public UpdateOrganizationAssociationsResponseType() {
    }

    public UpdateOrganizationAssociationsResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpdsng.www.FPDS.ParameterType[] listOfParameters,
           com.fpdsng.www.FPDS.OutputMessagesType outputMessages,
           java.lang.Boolean isUpdated) {
        super(
            requestNumber,
            confirmationNumber,
            listOfParameters,
            outputMessages);
        this.isUpdated = isUpdated;
    }


    /**
     * Gets the isUpdated value for this UpdateOrganizationAssociationsResponseType.
     * 
     * @return isUpdated
     */
    public java.lang.Boolean getIsUpdated() {
        return isUpdated;
    }


    /**
     * Sets the isUpdated value for this UpdateOrganizationAssociationsResponseType.
     * 
     * @param isUpdated
     */
    public void setIsUpdated(java.lang.Boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrganizationAssociationsResponseType)) return false;
        UpdateOrganizationAssociationsResponseType other = (UpdateOrganizationAssociationsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isUpdated==null && other.getIsUpdated()==null) || 
             (this.isUpdated!=null &&
              this.isUpdated.equals(other.getIsUpdated())));
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
        if (getIsUpdated() != null) {
            _hashCode += getIsUpdated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrganizationAssociationsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociationsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "isUpdated"));
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
