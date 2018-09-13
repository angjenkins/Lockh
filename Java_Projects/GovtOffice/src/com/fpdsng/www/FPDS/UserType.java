/**
 * UserType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class UserType  extends com.fpdsng.www.FPDS.UserHeaderType  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.UserPrivilegeType[] listOfUserPrivileges;

    private java.lang.String roleName;

    public UserType() {
    }

    public UserType(
           java.lang.String userID,
           java.lang.String password,
           com.fpdsng.www.FPDS.TypeOfUserType typeOfUser,
           com.fpdsng.www.FPDS.SystemUserProfileType systemUserProfile,
           com.fpdsng.www.FPDS.GovernmentUserProfileType governmentUserProfile,
           com.fpdsng.www.FPDS.PublicUserProfileType publicUserProfile,
           java.lang.Boolean isLogonUser,
           java.lang.String lastLoginDate,
           com.fpdsng.www.FPDS.PasswordAuditInformationType passwordAuditInformation,
           java.lang.String startDate,
           java.lang.String endDate,
           com.fpdsng.www.FPDS.AuditInformationType auditInformation,
           com.fpdsng.www.FPDS.UserPrivilegeType[] listOfUserPrivileges,
           java.lang.String roleName) {
        super(
            userID,
            password,
            typeOfUser,
            systemUserProfile,
            governmentUserProfile,
            publicUserProfile,
            isLogonUser,
            lastLoginDate,
            passwordAuditInformation,
            startDate,
            endDate,
            auditInformation);
        this.listOfUserPrivileges = listOfUserPrivileges;
        this.roleName = roleName;
    }


    /**
     * Gets the listOfUserPrivileges value for this UserType.
     * 
     * @return listOfUserPrivileges
     */
    public com.fpdsng.www.FPDS.UserPrivilegeType[] getListOfUserPrivileges() {
        return listOfUserPrivileges;
    }


    /**
     * Sets the listOfUserPrivileges value for this UserType.
     * 
     * @param listOfUserPrivileges
     */
    public void setListOfUserPrivileges(com.fpdsng.www.FPDS.UserPrivilegeType[] listOfUserPrivileges) {
        this.listOfUserPrivileges = listOfUserPrivileges;
    }


    /**
     * Gets the roleName value for this UserType.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this UserType.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserType)) return false;
        UserType other = (UserType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.listOfUserPrivileges==null && other.getListOfUserPrivileges()==null) || 
             (this.listOfUserPrivileges!=null &&
              java.util.Arrays.equals(this.listOfUserPrivileges, other.getListOfUserPrivileges()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName())));
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
        if (getListOfUserPrivileges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfUserPrivileges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfUserPrivileges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfUserPrivileges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUserPrivileges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userPrivilegeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userPrivilege"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "roleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
