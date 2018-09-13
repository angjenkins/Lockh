/**
 * CountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class CountType  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger total;

    private org.apache.axis.types.NonNegativeInteger fetched;

    public CountType() {
    }

    public CountType(
           org.apache.axis.types.NonNegativeInteger total,
           org.apache.axis.types.NonNegativeInteger fetched) {
           this.total = total;
           this.fetched = fetched;
    }


    /**
     * Gets the total value for this CountType.
     * 
     * @return total
     */
    public org.apache.axis.types.NonNegativeInteger getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CountType.
     * 
     * @param total
     */
    public void setTotal(org.apache.axis.types.NonNegativeInteger total) {
        this.total = total;
    }


    /**
     * Gets the fetched value for this CountType.
     * 
     * @return fetched
     */
    public org.apache.axis.types.NonNegativeInteger getFetched() {
        return fetched;
    }


    /**
     * Sets the fetched value for this CountType.
     * 
     * @param fetched
     */
    public void setFetched(org.apache.axis.types.NonNegativeInteger fetched) {
        this.fetched = fetched;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountType)) return false;
        CountType other = (CountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.fetched==null && other.getFetched()==null) || 
             (this.fetched!=null &&
              this.fetched.equals(other.getFetched())));
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
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getFetched() != null) {
            _hashCode += getFetched().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetched");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "fetched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
