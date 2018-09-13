/**
 * ListOfUsersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfUsersType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.UserType[] user;

    public ListOfUsersType() {
    }

    public ListOfUsersType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.UserType[] user) {
        super(
            count);
        this.user = user;
    }


    /**
     * Gets the user value for this ListOfUsersType.
     * 
     * @return user
     */
    public com.fpdsng.www.FPDS.UserType[] getUser() {
        return user;
    }


    /**
     * Sets the user value for this ListOfUsersType.
     * 
     * @param user
     */
    public void setUser(com.fpdsng.www.FPDS.UserType[] user) {
        this.user = user;
    }

    public com.fpdsng.www.FPDS.UserType getUser(int i) {
        return this.user[i];
    }

    public void setUser(int i, com.fpdsng.www.FPDS.UserType _value) {
        this.user[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfUsersType)) return false;
        ListOfUsersType other = (ListOfUsersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              java.util.Arrays.equals(this.user, other.getUser())));
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
        if (getUser() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUser(), i);
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
        new org.apache.axis.description.TypeDesc(ListOfUsersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUsersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userType"));
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
