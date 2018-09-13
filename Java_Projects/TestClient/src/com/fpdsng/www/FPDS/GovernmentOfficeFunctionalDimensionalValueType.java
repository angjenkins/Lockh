/**
 * GovernmentOfficeFunctionalDimensionalValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GovernmentOfficeFunctionalDimensionalValueType  implements java.io.Serializable {
    private java.lang.String functionalDimensionName;

    private java.lang.Integer functionalDimensionValueID;

    private java.lang.String functionalDimensionValue;

    public GovernmentOfficeFunctionalDimensionalValueType() {
    }

    public GovernmentOfficeFunctionalDimensionalValueType(
           java.lang.String functionalDimensionName,
           java.lang.Integer functionalDimensionValueID,
           java.lang.String functionalDimensionValue) {
           this.functionalDimensionName = functionalDimensionName;
           this.functionalDimensionValueID = functionalDimensionValueID;
           this.functionalDimensionValue = functionalDimensionValue;
    }


    /**
     * Gets the functionalDimensionName value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @return functionalDimensionName
     */
    public java.lang.String getFunctionalDimensionName() {
        return functionalDimensionName;
    }


    /**
     * Sets the functionalDimensionName value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @param functionalDimensionName
     */
    public void setFunctionalDimensionName(java.lang.String functionalDimensionName) {
        this.functionalDimensionName = functionalDimensionName;
    }


    /**
     * Gets the functionalDimensionValueID value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @return functionalDimensionValueID
     */
    public java.lang.Integer getFunctionalDimensionValueID() {
        return functionalDimensionValueID;
    }


    /**
     * Sets the functionalDimensionValueID value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @param functionalDimensionValueID
     */
    public void setFunctionalDimensionValueID(java.lang.Integer functionalDimensionValueID) {
        this.functionalDimensionValueID = functionalDimensionValueID;
    }


    /**
     * Gets the functionalDimensionValue value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @return functionalDimensionValue
     */
    public java.lang.String getFunctionalDimensionValue() {
        return functionalDimensionValue;
    }


    /**
     * Sets the functionalDimensionValue value for this GovernmentOfficeFunctionalDimensionalValueType.
     * 
     * @param functionalDimensionValue
     */
    public void setFunctionalDimensionValue(java.lang.String functionalDimensionValue) {
        this.functionalDimensionValue = functionalDimensionValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GovernmentOfficeFunctionalDimensionalValueType)) return false;
        GovernmentOfficeFunctionalDimensionalValueType other = (GovernmentOfficeFunctionalDimensionalValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.functionalDimensionName==null && other.getFunctionalDimensionName()==null) || 
             (this.functionalDimensionName!=null &&
              this.functionalDimensionName.equals(other.getFunctionalDimensionName()))) &&
            ((this.functionalDimensionValueID==null && other.getFunctionalDimensionValueID()==null) || 
             (this.functionalDimensionValueID!=null &&
              this.functionalDimensionValueID.equals(other.getFunctionalDimensionValueID()))) &&
            ((this.functionalDimensionValue==null && other.getFunctionalDimensionValue()==null) || 
             (this.functionalDimensionValue!=null &&
              this.functionalDimensionValue.equals(other.getFunctionalDimensionValue())));
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
        if (getFunctionalDimensionName() != null) {
            _hashCode += getFunctionalDimensionName().hashCode();
        }
        if (getFunctionalDimensionValueID() != null) {
            _hashCode += getFunctionalDimensionValueID().hashCode();
        }
        if (getFunctionalDimensionValue() != null) {
            _hashCode += getFunctionalDimensionValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GovernmentOfficeFunctionalDimensionalValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeFunctionalDimensionalValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionalDimensionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionalDimensionValueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionValueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionalDimensionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionValue"));
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
