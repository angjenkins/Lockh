/**
 * GovernmentOfficeKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GovernmentOfficeKeyType  implements java.io.Serializable {
    private java.lang.String officeID;

    private java.lang.String agencyID;

    public GovernmentOfficeKeyType() {
    }

    public GovernmentOfficeKeyType(
           java.lang.String officeID,
           java.lang.String agencyID) {
           this.officeID = officeID;
           this.agencyID = agencyID;
    }


    /**
     * Gets the officeID value for this GovernmentOfficeKeyType.
     * 
     * @return officeID
     */
    public java.lang.String getOfficeID() {
        return officeID;
    }


    /**
     * Sets the officeID value for this GovernmentOfficeKeyType.
     * 
     * @param officeID
     */
    public void setOfficeID(java.lang.String officeID) {
        this.officeID = officeID;
    }


    /**
     * Gets the agencyID value for this GovernmentOfficeKeyType.
     * 
     * @return agencyID
     */
    public java.lang.String getAgencyID() {
        return agencyID;
    }


    /**
     * Sets the agencyID value for this GovernmentOfficeKeyType.
     * 
     * @param agencyID
     */
    public void setAgencyID(java.lang.String agencyID) {
        this.agencyID = agencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GovernmentOfficeKeyType)) return false;
        GovernmentOfficeKeyType other = (GovernmentOfficeKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeID==null && other.getOfficeID()==null) || 
             (this.officeID!=null &&
              this.officeID.equals(other.getOfficeID()))) &&
            ((this.agencyID==null && other.getAgencyID()==null) || 
             (this.agencyID!=null &&
              this.agencyID.equals(other.getAgencyID())));
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
        if (getOfficeID() != null) {
            _hashCode += getOfficeID().hashCode();
        }
        if (getAgencyID() != null) {
            _hashCode += getAgencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GovernmentOfficeKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "officeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
