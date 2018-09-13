/**
 * ListOfFunctionalDimensionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfFunctionalDimensionsType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.FunctionalDimensionType[] functionalDimension;

    public ListOfFunctionalDimensionsType() {
    }

    public ListOfFunctionalDimensionsType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.FunctionalDimensionType[] functionalDimension) {
        super(
            count);
        this.functionalDimension = functionalDimension;
    }


    /**
     * Gets the functionalDimension value for this ListOfFunctionalDimensionsType.
     * 
     * @return functionalDimension
     */
    public com.fpdsng.www.FPDS.FunctionalDimensionType[] getFunctionalDimension() {
        return functionalDimension;
    }


    /**
     * Sets the functionalDimension value for this ListOfFunctionalDimensionsType.
     * 
     * @param functionalDimension
     */
    public void setFunctionalDimension(com.fpdsng.www.FPDS.FunctionalDimensionType[] functionalDimension) {
        this.functionalDimension = functionalDimension;
    }

    public com.fpdsng.www.FPDS.FunctionalDimensionType getFunctionalDimension(int i) {
        return this.functionalDimension[i];
    }

    public void setFunctionalDimension(int i, com.fpdsng.www.FPDS.FunctionalDimensionType _value) {
        this.functionalDimension[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfFunctionalDimensionsType)) return false;
        ListOfFunctionalDimensionsType other = (ListOfFunctionalDimensionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.functionalDimension==null && other.getFunctionalDimension()==null) || 
             (this.functionalDimension!=null &&
              java.util.Arrays.equals(this.functionalDimension, other.getFunctionalDimension())));
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
        if (getFunctionalDimension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFunctionalDimension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFunctionalDimension(), i);
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
        new org.apache.axis.description.TypeDesc(ListOfFunctionalDimensionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfFunctionalDimensionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionalDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionType"));
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
