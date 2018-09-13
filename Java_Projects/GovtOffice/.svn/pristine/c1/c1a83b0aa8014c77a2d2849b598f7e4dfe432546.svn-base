/**
 * ResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ResponseType  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger requestNumber;

    private java.math.BigInteger confirmationNumber;

    private com.fpdsng.www.FPDS.ParameterType[] listOfParameters;

    private com.fpdsng.www.FPDS.OutputMessagesType outputMessages;

    public ResponseType() {
    }

    public ResponseType(
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpdsng.www.FPDS.ParameterType[] listOfParameters,
           com.fpdsng.www.FPDS.OutputMessagesType outputMessages) {
           this.requestNumber = requestNumber;
           this.confirmationNumber = confirmationNumber;
           this.listOfParameters = listOfParameters;
           this.outputMessages = outputMessages;
    }


    /**
     * Gets the requestNumber value for this ResponseType.
     * 
     * @return requestNumber
     */
    public org.apache.axis.types.NonNegativeInteger getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ResponseType.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(org.apache.axis.types.NonNegativeInteger requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the confirmationNumber value for this ResponseType.
     * 
     * @return confirmationNumber
     */
    public java.math.BigInteger getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this ResponseType.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.math.BigInteger confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the listOfParameters value for this ResponseType.
     * 
     * @return listOfParameters
     */
    public com.fpdsng.www.FPDS.ParameterType[] getListOfParameters() {
        return listOfParameters;
    }


    /**
     * Sets the listOfParameters value for this ResponseType.
     * 
     * @param listOfParameters
     */
    public void setListOfParameters(com.fpdsng.www.FPDS.ParameterType[] listOfParameters) {
        this.listOfParameters = listOfParameters;
    }


    /**
     * Gets the outputMessages value for this ResponseType.
     * 
     * @return outputMessages
     */
    public com.fpdsng.www.FPDS.OutputMessagesType getOutputMessages() {
        return outputMessages;
    }


    /**
     * Sets the outputMessages value for this ResponseType.
     * 
     * @param outputMessages
     */
    public void setOutputMessages(com.fpdsng.www.FPDS.OutputMessagesType outputMessages) {
        this.outputMessages = outputMessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseType)) return false;
        ResponseType other = (ResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestNumber==null && other.getRequestNumber()==null) || 
             (this.requestNumber!=null &&
              this.requestNumber.equals(other.getRequestNumber()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.listOfParameters==null && other.getListOfParameters()==null) || 
             (this.listOfParameters!=null &&
              java.util.Arrays.equals(this.listOfParameters, other.getListOfParameters()))) &&
            ((this.outputMessages==null && other.getOutputMessages()==null) || 
             (this.outputMessages!=null &&
              this.outputMessages.equals(other.getOutputMessages())));
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
        if (getRequestNumber() != null) {
            _hashCode += getRequestNumber().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getListOfParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputMessages() != null) {
            _hashCode += getOutputMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "responseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "requestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parameterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "outputMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "outputMessagesType"));
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
