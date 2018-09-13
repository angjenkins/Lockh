/**
 * ListOfOrganizationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfOrganizationsType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.OrganizationType[] organization;

    public ListOfOrganizationsType() {
    }

    public ListOfOrganizationsType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.OrganizationType[] organization) {
        super(
            count);
        this.organization = organization;
    }


    /**
     * Gets the organization value for this ListOfOrganizationsType.
     * 
     * @return organization
     */
    public com.fpdsng.www.FPDS.OrganizationType[] getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this ListOfOrganizationsType.
     * 
     * @param organization
     */
    public void setOrganization(com.fpdsng.www.FPDS.OrganizationType[] organization) {
        this.organization = organization;
    }

    public com.fpdsng.www.FPDS.OrganizationType getOrganization(int i) {
        return this.organization[i];
    }

    public void setOrganization(int i, com.fpdsng.www.FPDS.OrganizationType _value) {
        this.organization[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfOrganizationsType)) return false;
        ListOfOrganizationsType other = (ListOfOrganizationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              java.util.Arrays.equals(this.organization, other.getOrganization())));
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
        if (getOrganization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganization(), i);
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
        new org.apache.axis.description.TypeDesc(ListOfOrganizationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfOrganizationsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
