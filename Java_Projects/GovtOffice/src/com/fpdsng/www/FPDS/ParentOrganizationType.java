/**
 * ParentOrganizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ParentOrganizationType  extends com.fpdsng.www.FPDS.OrganizationType  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.ParentOrganizationType[] parentOrganization;

    public ParentOrganizationType() {
    }

    public ParentOrganizationType(
           java.lang.String organizationID,
           java.lang.String parentOrganizationID,
           java.lang.String parentOrganizationCode,
           java.lang.String organizationCode,
           java.lang.String organizationName,
           java.lang.String organizationShortName,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String organizationCategoryID,
           com.fpdsng.www.FPDS.OrganizationType[] listOfChildOrganizations,
           com.fpdsng.www.FPDS.AuditInformationType auditInformation,
           com.fpdsng.www.FPDS.ParentOrganizationType[] parentOrganization) {
        super(
            organizationID,
            parentOrganizationID,
            parentOrganizationCode,
            organizationCode,
            organizationName,
            organizationShortName,
            startDate,
            endDate,
            organizationCategoryID,
            listOfChildOrganizations,
            auditInformation);
        this.parentOrganization = parentOrganization;
    }


    /**
     * Gets the parentOrganization value for this ParentOrganizationType.
     * 
     * @return parentOrganization
     */
    public com.fpdsng.www.FPDS.ParentOrganizationType[] getParentOrganization() {
        return parentOrganization;
    }


    /**
     * Sets the parentOrganization value for this ParentOrganizationType.
     * 
     * @param parentOrganization
     */
    public void setParentOrganization(com.fpdsng.www.FPDS.ParentOrganizationType[] parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public com.fpdsng.www.FPDS.ParentOrganizationType getParentOrganization(int i) {
        return this.parentOrganization[i];
    }

    public void setParentOrganization(int i, com.fpdsng.www.FPDS.ParentOrganizationType _value) {
        this.parentOrganization[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParentOrganizationType)) return false;
        ParentOrganizationType other = (ParentOrganizationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentOrganization==null && other.getParentOrganization()==null) || 
             (this.parentOrganization!=null &&
              java.util.Arrays.equals(this.parentOrganization, other.getParentOrganization())));
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
        if (getParentOrganization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentOrganization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentOrganization(), i);
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
        new org.apache.axis.description.TypeDesc(ParentOrganizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrganization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationType"));
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
