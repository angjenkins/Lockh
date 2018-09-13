/**
 * UserProfileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class UserProfileType  implements java.io.Serializable {
    private java.lang.String userTitle;

    private java.lang.String firstOrGivenName;

    private java.lang.String middleInitialOrName;

    private java.lang.String lastOrFamilyName;

    private java.lang.String emailAddress;

    private java.lang.String recvEmailFlag;

    private java.lang.String phoneNo;

    private java.lang.String phoneExt;

    private java.lang.String faxNo;

    public UserProfileType() {
    }

    public UserProfileType(
           java.lang.String userTitle,
           java.lang.String firstOrGivenName,
           java.lang.String middleInitialOrName,
           java.lang.String lastOrFamilyName,
           java.lang.String emailAddress,
           java.lang.String recvEmailFlag,
           java.lang.String phoneNo,
           java.lang.String phoneExt,
           java.lang.String faxNo) {
           this.userTitle = userTitle;
           this.firstOrGivenName = firstOrGivenName;
           this.middleInitialOrName = middleInitialOrName;
           this.lastOrFamilyName = lastOrFamilyName;
           this.emailAddress = emailAddress;
           this.recvEmailFlag = recvEmailFlag;
           this.phoneNo = phoneNo;
           this.phoneExt = phoneExt;
           this.faxNo = faxNo;
    }


    /**
     * Gets the userTitle value for this UserProfileType.
     * 
     * @return userTitle
     */
    public java.lang.String getUserTitle() {
        return userTitle;
    }


    /**
     * Sets the userTitle value for this UserProfileType.
     * 
     * @param userTitle
     */
    public void setUserTitle(java.lang.String userTitle) {
        this.userTitle = userTitle;
    }


    /**
     * Gets the firstOrGivenName value for this UserProfileType.
     * 
     * @return firstOrGivenName
     */
    public java.lang.String getFirstOrGivenName() {
        return firstOrGivenName;
    }


    /**
     * Sets the firstOrGivenName value for this UserProfileType.
     * 
     * @param firstOrGivenName
     */
    public void setFirstOrGivenName(java.lang.String firstOrGivenName) {
        this.firstOrGivenName = firstOrGivenName;
    }


    /**
     * Gets the middleInitialOrName value for this UserProfileType.
     * 
     * @return middleInitialOrName
     */
    public java.lang.String getMiddleInitialOrName() {
        return middleInitialOrName;
    }


    /**
     * Sets the middleInitialOrName value for this UserProfileType.
     * 
     * @param middleInitialOrName
     */
    public void setMiddleInitialOrName(java.lang.String middleInitialOrName) {
        this.middleInitialOrName = middleInitialOrName;
    }


    /**
     * Gets the lastOrFamilyName value for this UserProfileType.
     * 
     * @return lastOrFamilyName
     */
    public java.lang.String getLastOrFamilyName() {
        return lastOrFamilyName;
    }


    /**
     * Sets the lastOrFamilyName value for this UserProfileType.
     * 
     * @param lastOrFamilyName
     */
    public void setLastOrFamilyName(java.lang.String lastOrFamilyName) {
        this.lastOrFamilyName = lastOrFamilyName;
    }


    /**
     * Gets the emailAddress value for this UserProfileType.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this UserProfileType.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the recvEmailFlag value for this UserProfileType.
     * 
     * @return recvEmailFlag
     */
    public java.lang.String getRecvEmailFlag() {
        return recvEmailFlag;
    }


    /**
     * Sets the recvEmailFlag value for this UserProfileType.
     * 
     * @param recvEmailFlag
     */
    public void setRecvEmailFlag(java.lang.String recvEmailFlag) {
        this.recvEmailFlag = recvEmailFlag;
    }


    /**
     * Gets the phoneNo value for this UserProfileType.
     * 
     * @return phoneNo
     */
    public java.lang.String getPhoneNo() {
        return phoneNo;
    }


    /**
     * Sets the phoneNo value for this UserProfileType.
     * 
     * @param phoneNo
     */
    public void setPhoneNo(java.lang.String phoneNo) {
        this.phoneNo = phoneNo;
    }


    /**
     * Gets the phoneExt value for this UserProfileType.
     * 
     * @return phoneExt
     */
    public java.lang.String getPhoneExt() {
        return phoneExt;
    }


    /**
     * Sets the phoneExt value for this UserProfileType.
     * 
     * @param phoneExt
     */
    public void setPhoneExt(java.lang.String phoneExt) {
        this.phoneExt = phoneExt;
    }


    /**
     * Gets the faxNo value for this UserProfileType.
     * 
     * @return faxNo
     */
    public java.lang.String getFaxNo() {
        return faxNo;
    }


    /**
     * Sets the faxNo value for this UserProfileType.
     * 
     * @param faxNo
     */
    public void setFaxNo(java.lang.String faxNo) {
        this.faxNo = faxNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfileType)) return false;
        UserProfileType other = (UserProfileType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userTitle==null && other.getUserTitle()==null) || 
             (this.userTitle!=null &&
              this.userTitle.equals(other.getUserTitle()))) &&
            ((this.firstOrGivenName==null && other.getFirstOrGivenName()==null) || 
             (this.firstOrGivenName!=null &&
              this.firstOrGivenName.equals(other.getFirstOrGivenName()))) &&
            ((this.middleInitialOrName==null && other.getMiddleInitialOrName()==null) || 
             (this.middleInitialOrName!=null &&
              this.middleInitialOrName.equals(other.getMiddleInitialOrName()))) &&
            ((this.lastOrFamilyName==null && other.getLastOrFamilyName()==null) || 
             (this.lastOrFamilyName!=null &&
              this.lastOrFamilyName.equals(other.getLastOrFamilyName()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.recvEmailFlag==null && other.getRecvEmailFlag()==null) || 
             (this.recvEmailFlag!=null &&
              this.recvEmailFlag.equals(other.getRecvEmailFlag()))) &&
            ((this.phoneNo==null && other.getPhoneNo()==null) || 
             (this.phoneNo!=null &&
              this.phoneNo.equals(other.getPhoneNo()))) &&
            ((this.phoneExt==null && other.getPhoneExt()==null) || 
             (this.phoneExt!=null &&
              this.phoneExt.equals(other.getPhoneExt()))) &&
            ((this.faxNo==null && other.getFaxNo()==null) || 
             (this.faxNo!=null &&
              this.faxNo.equals(other.getFaxNo())));
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
        if (getUserTitle() != null) {
            _hashCode += getUserTitle().hashCode();
        }
        if (getFirstOrGivenName() != null) {
            _hashCode += getFirstOrGivenName().hashCode();
        }
        if (getMiddleInitialOrName() != null) {
            _hashCode += getMiddleInitialOrName().hashCode();
        }
        if (getLastOrFamilyName() != null) {
            _hashCode += getLastOrFamilyName().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getRecvEmailFlag() != null) {
            _hashCode += getRecvEmailFlag().hashCode();
        }
        if (getPhoneNo() != null) {
            _hashCode += getPhoneNo().hashCode();
        }
        if (getPhoneExt() != null) {
            _hashCode += getPhoneExt().hashCode();
        }
        if (getFaxNo() != null) {
            _hashCode += getFaxNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfileType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userProfileType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstOrGivenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "firstOrGivenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitialOrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "middleInitialOrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastOrFamilyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "lastOrFamilyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recvEmailFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "recvEmailFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "phoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "phoneExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "faxNo"));
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
