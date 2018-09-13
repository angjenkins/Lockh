/**
 * PasswordAuditInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class PasswordAuditInformationType  implements java.io.Serializable {
    private java.lang.Boolean passwordChangeRequired;

    private java.lang.String passwordResetDate;

    public PasswordAuditInformationType() {
    }

    public PasswordAuditInformationType(
           java.lang.Boolean passwordChangeRequired,
           java.lang.String passwordResetDate) {
           this.passwordChangeRequired = passwordChangeRequired;
           this.passwordResetDate = passwordResetDate;
    }


    /**
     * Gets the passwordChangeRequired value for this PasswordAuditInformationType.
     * 
     * @return passwordChangeRequired
     */
    public java.lang.Boolean getPasswordChangeRequired() {
        return passwordChangeRequired;
    }


    /**
     * Sets the passwordChangeRequired value for this PasswordAuditInformationType.
     * 
     * @param passwordChangeRequired
     */
    public void setPasswordChangeRequired(java.lang.Boolean passwordChangeRequired) {
        this.passwordChangeRequired = passwordChangeRequired;
    }


    /**
     * Gets the passwordResetDate value for this PasswordAuditInformationType.
     * 
     * @return passwordResetDate
     */
    public java.lang.String getPasswordResetDate() {
        return passwordResetDate;
    }


    /**
     * Sets the passwordResetDate value for this PasswordAuditInformationType.
     * 
     * @param passwordResetDate
     */
    public void setPasswordResetDate(java.lang.String passwordResetDate) {
        this.passwordResetDate = passwordResetDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordAuditInformationType)) return false;
        PasswordAuditInformationType other = (PasswordAuditInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passwordChangeRequired==null && other.getPasswordChangeRequired()==null) || 
             (this.passwordChangeRequired!=null &&
              this.passwordChangeRequired.equals(other.getPasswordChangeRequired()))) &&
            ((this.passwordResetDate==null && other.getPasswordResetDate()==null) || 
             (this.passwordResetDate!=null &&
              this.passwordResetDate.equals(other.getPasswordResetDate())));
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
        if (getPasswordChangeRequired() != null) {
            _hashCode += getPasswordChangeRequired().hashCode();
        }
        if (getPasswordResetDate() != null) {
            _hashCode += getPasswordResetDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordAuditInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "passwordAuditInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordChangeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "passwordChangeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordResetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "passwordResetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
