/**
 * PlaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class PlaceType  extends com.fpdsng.www.FPDS.PlaceCodeType  implements java.io.Serializable {
    private java.lang.String placeName;

    private java.lang.String ZIPCode;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private com.fpdsng.www.FPDS.AuditInformationType auditInformation;

    public PlaceType() {
    }

    public PlaceType(
           java.lang.String locationCode,
           java.lang.String stateCode,
           java.lang.String countryCode,
           java.lang.String placeName,
           java.lang.String ZIPCode,
           java.lang.String startDate,
           java.lang.String endDate,
           com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
        super(
            locationCode,
            stateCode,
            countryCode);
        this.placeName = placeName;
        this.ZIPCode = ZIPCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.auditInformation = auditInformation;
    }


    /**
     * Gets the placeName value for this PlaceType.
     * 
     * @return placeName
     */
    public java.lang.String getPlaceName() {
        return placeName;
    }


    /**
     * Sets the placeName value for this PlaceType.
     * 
     * @param placeName
     */
    public void setPlaceName(java.lang.String placeName) {
        this.placeName = placeName;
    }


    /**
     * Gets the ZIPCode value for this PlaceType.
     * 
     * @return ZIPCode
     */
    public java.lang.String getZIPCode() {
        return ZIPCode;
    }


    /**
     * Sets the ZIPCode value for this PlaceType.
     * 
     * @param ZIPCode
     */
    public void setZIPCode(java.lang.String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }


    /**
     * Gets the startDate value for this PlaceType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PlaceType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PlaceType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PlaceType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the auditInformation value for this PlaceType.
     * 
     * @return auditInformation
     */
    public com.fpdsng.www.FPDS.AuditInformationType getAuditInformation() {
        return auditInformation;
    }


    /**
     * Sets the auditInformation value for this PlaceType.
     * 
     * @param auditInformation
     */
    public void setAuditInformation(com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
        this.auditInformation = auditInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceType)) return false;
        PlaceType other = (PlaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.placeName==null && other.getPlaceName()==null) || 
             (this.placeName!=null &&
              this.placeName.equals(other.getPlaceName()))) &&
            ((this.ZIPCode==null && other.getZIPCode()==null) || 
             (this.ZIPCode!=null &&
              this.ZIPCode.equals(other.getZIPCode()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.auditInformation==null && other.getAuditInformation()==null) || 
             (this.auditInformation!=null &&
              this.auditInformation.equals(other.getAuditInformation())));
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
        if (getPlaceName() != null) {
            _hashCode += getPlaceName().hashCode();
        }
        if (getZIPCode() != null) {
            _hashCode += getZIPCode().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAuditInformation() != null) {
            _hashCode += getAuditInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "ZIPCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformationType"));
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
