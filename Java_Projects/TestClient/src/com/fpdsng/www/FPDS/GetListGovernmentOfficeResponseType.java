/**
 * GetListGovernmentOfficeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GetListGovernmentOfficeResponseType  extends com.fpdsng.www.FPDS.ResponseType  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.ListOfGovernmentOfficesType listOfGovernmentOffices;

    public GetListGovernmentOfficeResponseType() {
    }

    public GetListGovernmentOfficeResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpdsng.www.FPDS.ParameterType[] listOfParameters,
           com.fpdsng.www.FPDS.OutputMessagesType outputMessages,
           com.fpdsng.www.FPDS.ListOfGovernmentOfficesType listOfGovernmentOffices) {
        super(
            requestNumber,
            confirmationNumber,
            listOfParameters,
            outputMessages);
        this.listOfGovernmentOffices = listOfGovernmentOffices;
    }


    /**
     * Gets the listOfGovernmentOffices value for this GetListGovernmentOfficeResponseType.
     * 
     * @return listOfGovernmentOffices
     */
    public com.fpdsng.www.FPDS.ListOfGovernmentOfficesType getListOfGovernmentOffices() {
        return listOfGovernmentOffices;
    }


    /**
     * Sets the listOfGovernmentOffices value for this GetListGovernmentOfficeResponseType.
     * 
     * @param listOfGovernmentOffices
     */
    public void setListOfGovernmentOffices(com.fpdsng.www.FPDS.ListOfGovernmentOfficesType listOfGovernmentOffices) {
        this.listOfGovernmentOffices = listOfGovernmentOffices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListGovernmentOfficeResponseType)) return false;
        GetListGovernmentOfficeResponseType other = (GetListGovernmentOfficeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.listOfGovernmentOffices==null && other.getListOfGovernmentOffices()==null) || 
             (this.listOfGovernmentOffices!=null &&
              this.listOfGovernmentOffices.equals(other.getListOfGovernmentOffices())));
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
        if (getListOfGovernmentOffices() != null) {
            _hashCode += getListOfGovernmentOffices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListGovernmentOfficeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getListGovernmentOfficeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfGovernmentOffices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfGovernmentOffices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfGovernmentOfficesType"));
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
