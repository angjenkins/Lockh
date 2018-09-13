/**
 * WarningType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class WarningType  implements java.io.Serializable {
    private java.lang.String[] elementName;

    private java.lang.String warningCode;

    private java.lang.String warningMessage;

    public WarningType() {
    }

    public WarningType(
           java.lang.String[] elementName,
           java.lang.String warningCode,
           java.lang.String warningMessage) {
           this.elementName = elementName;
           this.warningCode = warningCode;
           this.warningMessage = warningMessage;
    }


    /**
     * Gets the elementName value for this WarningType.
     * 
     * @return elementName
     */
    public java.lang.String[] getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this WarningType.
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
     * Gets the warningCode value for this WarningType.
     * 
     * @return warningCode
     */
    public java.lang.String getWarningCode() {
        return warningCode;
    }


    /**
     * Sets the warningCode value for this WarningType.
     * 
     * @param warningCode
     */
    public void setWarningCode(java.lang.String warningCode) {
        this.warningCode = warningCode;
    }


    /**
     * Gets the warningMessage value for this WarningType.
     * 
     * @return warningMessage
     */
    public java.lang.String getWarningMessage() {
        return warningMessage;
    }


    /**
     * Sets the warningMessage value for this WarningType.
     * 
     * @param warningMessage
     */
    public void setWarningMessage(java.lang.String warningMessage) {
        this.warningMessage = warningMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WarningType)) return false;
        WarningType other = (WarningType) obj;
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
            ((this.warningCode==null && other.getWarningCode()==null) || 
             (this.warningCode!=null &&
              this.warningCode.equals(other.getWarningCode()))) &&
            ((this.warningMessage==null && other.getWarningMessage()==null) || 
             (this.warningMessage!=null &&
              this.warningMessage.equals(other.getWarningMessage())));
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
        if (getWarningCode() != null) {
            _hashCode += getWarningCode().hashCode();
        }
        if (getWarningMessage() != null) {
            _hashCode += getWarningMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WarningType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "elementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "elementNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningMessage"));
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
