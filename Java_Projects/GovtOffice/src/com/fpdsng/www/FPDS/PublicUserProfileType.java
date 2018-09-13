/**
 * PublicUserProfileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class PublicUserProfileType  extends com.fpdsng.www.FPDS.UserProfileType  implements java.io.Serializable {
    private java.lang.String organizationName;

    private com.fpdsng.www.FPDS.AddressType address;

    public PublicUserProfileType() {
    }

    public PublicUserProfileType(
           java.lang.String userTitle,
           java.lang.String firstOrGivenName,
           java.lang.String middleInitialOrName,
           java.lang.String lastOrFamilyName,
           java.lang.String emailAddress,
           java.lang.String recvEmailFlag,
           java.lang.String phoneNo,
           java.lang.String phoneExt,
           java.lang.String faxNo,
           java.lang.String organizationName,
           com.fpdsng.www.FPDS.AddressType address) {
        super(
            userTitle,
            firstOrGivenName,
            middleInitialOrName,
            lastOrFamilyName,
            emailAddress,
            recvEmailFlag,
            phoneNo,
            phoneExt,
            faxNo);
        this.organizationName = organizationName;
        this.address = address;
    }


    /**
     * Gets the organizationName value for this PublicUserProfileType.
     * 
     * @return organizationName
     */
    public java.lang.String getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this PublicUserProfileType.
     * 
     * @param organizationName
     */
    public void setOrganizationName(java.lang.String organizationName) {
        this.organizationName = organizationName;
    }


    /**
     * Gets the address value for this PublicUserProfileType.
     * 
     * @return address
     */
    public com.fpdsng.www.FPDS.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PublicUserProfileType.
     * 
     * @param address
     */
    public void setAddress(com.fpdsng.www.FPDS.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicUserProfileType)) return false;
        PublicUserProfileType other = (PublicUserProfileType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicUserProfileType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "publicUserProfileType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "addressType"));
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
