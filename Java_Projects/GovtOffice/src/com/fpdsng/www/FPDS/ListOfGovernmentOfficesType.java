/**
 * ListOfGovernmentOfficesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfGovernmentOfficesType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.GovernmentOfficeType[] governmentOffice;

    public ListOfGovernmentOfficesType() {
    }

    public ListOfGovernmentOfficesType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.GovernmentOfficeType[] governmentOffice) {
        super(
            count);
        this.governmentOffice = governmentOffice;
    }


    /**
     * Gets the governmentOffice value for this ListOfGovernmentOfficesType.
     * 
     * @return governmentOffice
     */
    public com.fpdsng.www.FPDS.GovernmentOfficeType[] getGovernmentOffice() {
        return governmentOffice;
    }


    /**
     * Sets the governmentOffice value for this ListOfGovernmentOfficesType.
     * 
     * @param governmentOffice
     */
    public void setGovernmentOffice(com.fpdsng.www.FPDS.GovernmentOfficeType[] governmentOffice) {
        this.governmentOffice = governmentOffice;
    }

    public com.fpdsng.www.FPDS.GovernmentOfficeType getGovernmentOffice(int i) {
        return this.governmentOffice[i];
    }

    public void setGovernmentOffice(int i, com.fpdsng.www.FPDS.GovernmentOfficeType _value) {
        this.governmentOffice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfGovernmentOfficesType)) return false;
        ListOfGovernmentOfficesType other = (ListOfGovernmentOfficesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.governmentOffice==null && other.getGovernmentOffice()==null) || 
             (this.governmentOffice!=null &&
              java.util.Arrays.equals(this.governmentOffice, other.getGovernmentOffice())));
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
        if (getGovernmentOffice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGovernmentOffice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGovernmentOffice(), i);
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
        new org.apache.axis.description.TypeDesc(ListOfGovernmentOfficesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfGovernmentOfficesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("governmentOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType"));
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
