/**
 * PlaceCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;


/**
 * combination of state and location,country codes
 */
public class PlaceCodeType  implements java.io.Serializable {
    /* 5 digit location code */
    private java.lang.String locationCode;

    /* 2 letter state code */
    private java.lang.String stateCode;

    /* FIPS10 Country Code */
    private java.lang.String countryCode;

    public PlaceCodeType() {
    }

    public PlaceCodeType(
           java.lang.String locationCode,
           java.lang.String stateCode,
           java.lang.String countryCode) {
           this.locationCode = locationCode;
           this.stateCode = stateCode;
           this.countryCode = countryCode;
    }


    /**
     * Gets the locationCode value for this PlaceCodeType.
     * 
     * @return locationCode   * 5 digit location code
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this PlaceCodeType.
     * 
     * @param locationCode   * 5 digit location code
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the stateCode value for this PlaceCodeType.
     * 
     * @return stateCode   * 2 letter state code
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this PlaceCodeType.
     * 
     * @param stateCode   * 2 letter state code
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the countryCode value for this PlaceCodeType.
     * 
     * @return countryCode   * FIPS10 Country Code
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this PlaceCodeType.
     * 
     * @param countryCode   * FIPS10 Country Code
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceCodeType)) return false;
        PlaceCodeType other = (PlaceCodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
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
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceCodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeCodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "stateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countryCode"));
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
