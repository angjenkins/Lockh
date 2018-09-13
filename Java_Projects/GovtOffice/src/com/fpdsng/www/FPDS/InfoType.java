/**
 * InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class InfoType  implements java.io.Serializable {
    private java.lang.String[] elementName;

    private java.lang.String infoCode;

    private java.lang.String infoMessage;

    public InfoType() {
    }

    public InfoType(
           java.lang.String[] elementName,
           java.lang.String infoCode,
           java.lang.String infoMessage) {
           this.elementName = elementName;
           this.infoCode = infoCode;
           this.infoMessage = infoMessage;
    }


    /**
     * Gets the elementName value for this InfoType.
     * 
     * @return elementName
     */
    public java.lang.String[] getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this InfoType.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String[] elementName) {
        this.elementName = elementName;
    }

    public java.lang.String getElementName(int i) {
        return this.elementName[i];
    }

    public void setElementName(int i, java.lang.String _value) {
        this.elementName[i] = _value;
    }


    /**
     * Gets the infoCode value for this InfoType.
     * 
     * @return infoCode
     */
    public java.lang.String getInfoCode() {
        return infoCode;
    }


    /**
     * Sets the infoCode value for this InfoType.
     * 
     * @param infoCode
     */
    public void setInfoCode(java.lang.String infoCode) {
        this.infoCode = infoCode;
    }


    /**
     * Gets the infoMessage value for this InfoType.
     * 
     * @return infoMessage
     */
    public java.lang.String getInfoMessage() {
        return infoMessage;
    }


    /**
     * Sets the infoMessage value for this InfoType.
     * 
     * @param infoMessage
     */
    public void setInfoMessage(java.lang.String infoMessage) {
        this.infoMessage = infoMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoType)) return false;
        InfoType other = (InfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              java.util.Arrays.equals(this.elementName, other.getElementName()))) &&
            ((this.infoCode==null && other.getInfoCode()==null) || 
             (this.infoCode!=null &&
              this.infoCode.equals(other.getInfoCode()))) &&
            ((this.infoMessage==null && other.getInfoMessage()==null) || 
             (this.infoMessage!=null &&
              this.infoMessage.equals(other.getInfoMessage())));
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
        if (getElementName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfoCode() != null) {
            _hashCode += getInfoCode().hashCode();
        }
        if (getInfoMessage() != null) {
            _hashCode += getInfoMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "elementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "elementNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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