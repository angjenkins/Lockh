/**
 * GetGovernmentOfficeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GetGovernmentOfficeResponseType  extends com.fpdsng.www.FPDS.ResponseType  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice;

    public GetGovernmentOfficeResponseType() {
    }

    public GetGovernmentOfficeResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpdsng.www.FPDS.ParameterType[] listOfParameters,
           com.fpdsng.www.FPDS.OutputMessagesType outputMessages,
           com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) {
        super(
            requestNumber,
            confirmationNumber,
            listOfParameters,
            outputMessages);
        this.governmentOffice = governmentOffice;
    }


    /**
     * Gets the governmentOffice value for this GetGovernmentOfficeResponseType.
     * 
     * @return governmentOffice
     */
    public com.fpdsng.www.FPDS.GovernmentOfficeType getGovernmentOffice() {
        return governmentOffice;
    }


    /**
     * Sets the governmentOffice value for this GetGovernmentOfficeResponseType.
     * 
     * @param governmentOffice
     */
    public void setGovernmentOffice(com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) {
        this.governmentOffice = governmentOffice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGovernmentOfficeResponseType)) return false;
        GetGovernmentOfficeResponseType other = (GetGovernmentOfficeResponseType) obj;
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
              this.governmentOffice.equals(other.getGovernmentOffice())));
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
            _hashCode += getGovernmentOffice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGovernmentOfficeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getGovernmentOfficeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("governmentOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType"));
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
