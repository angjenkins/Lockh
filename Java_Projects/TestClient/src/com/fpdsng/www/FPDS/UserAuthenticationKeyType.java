/**
 * UserAuthenticationKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class UserAuthenticationKeyType  implements java.io.Serializable {
    private java.lang.String userID;

    private java.lang.String password;

    private java.lang.String serviceOriginatorID;

    public UserAuthenticationKeyType() {
    }

    public UserAuthenticationKeyType(
           java.lang.String userID,
           java.lang.String password,
           java.lang.String serviceOriginatorID) {
           this.userID = userID;
           this.password = password;
           this.serviceOriginatorID = serviceOriginatorID;
    }


    /**
     * Gets the userID value for this UserAuthenticationKeyType.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this UserAuthenticationKeyType.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the password value for this UserAuthenticationKeyType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserAuthenticationKeyType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the serviceOriginatorID value for this UserAuthenticationKeyType.
     * 
     * @return serviceOriginatorID
     */
    public java.lang.String getServiceOriginatorID() {
        return serviceOriginatorID;
    }


    /**
     * Sets the serviceOriginatorID value for this UserAuthenticationKeyType.
     * 
     * @param serviceOriginatorID
     */
    public void setServiceOriginatorID(java.lang.String serviceOriginatorID) {
        this.serviceOriginatorID = serviceOriginatorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAuthenticationKeyType)) return false;
        UserAuthenticationKeyType other = (UserAuthenticationKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.serviceOriginatorID==null && other.getServiceOriginatorID()==null) || 
             (this.serviceOriginatorID!=null &&
              this.serviceOriginatorID.equals(other.getServiceOriginatorID())));
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getServiceOriginatorID() != null) {
            _hashCode += getServiceOriginatorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAuthenticationKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOriginatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "serviceOriginatorID"));
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
