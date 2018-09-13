/**
 * GovernmentUserProfileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GovernmentUserProfileType  extends com.fpdsng.www.FPDS.UserProfileType  implements java.io.Serializable {
    private java.lang.String agencyID;

    private java.lang.String organizationID;

    private java.lang.String contractingOfficeID;

    private java.lang.String rankID;

    private java.lang.String routingSymbol;

    private java.lang.String roomNo;

    private java.lang.String supervisorUserID;

    public GovernmentUserProfileType() {
    }

    public GovernmentUserProfileType(
           java.lang.String userTitle,
           java.lang.String firstOrGivenName,
           java.lang.String middleInitialOrName,
           java.lang.String lastOrFamilyName,
           java.lang.String emailAddress,
           java.lang.String recvEmailFlag,
           java.lang.String phoneNo,
           java.lang.String phoneExt,
           java.lang.String faxNo,
           java.lang.String agencyID,
           java.lang.String organizationID,
           java.lang.String contractingOfficeID,
           java.lang.String rankID,
           java.lang.String routingSymbol,
           java.lang.String roomNo,
           java.lang.String supervisorUserID) {
        super(
            userTitle,
            firstOrGivenName,
            middleInitialOrName,
            lastOrFamilyName,
            emailAddress,
            recvEmailFlag,
            phoneNo,
            phoneExt,
            faxNo);
        this.agencyID = agencyID;
        this.organizationID = organizationID;
        this.contractingOfficeID = contractingOfficeID;
        this.rankID = rankID;
        this.routingSymbol = routingSymbol;
        this.roomNo = roomNo;
        this.supervisorUserID = supervisorUserID;
    }


    /**
     * Gets the agencyID value for this GovernmentUserProfileType.
     * 
     * @return agencyID
     */
    public java.lang.String getAgencyID() {
        return agencyID;
    }


    /**
     * Sets the agencyID value for this GovernmentUserProfileType.
     * 
     * @param agencyID
     */
    public void setAgencyID(java.lang.String agencyID) {
        this.agencyID = agencyID;
    }


    /**
     * Gets the organizationID value for this GovernmentUserProfileType.
     * 
     * @return organizationID
     */
    public java.lang.String getOrganizationID() {
        return organizationID;
    }


    /**
     * Sets the organizationID value for this GovernmentUserProfileType.
     * 
     * @param organizationID
     */
    public void setOrganizationID(java.lang.String organizationID) {
        this.organizationID = organizationID;
    }


    /**
     * Gets the contractingOfficeID value for this GovernmentUserProfileType.
     * 
     * @return contractingOfficeID
     */
    public java.lang.String getContractingOfficeID() {
        return contractingOfficeID;
    }


    /**
     * Sets the contractingOfficeID value for this GovernmentUserProfileType.
     * 
     * @param contractingOfficeID
     */
    public void setContractingOfficeID(java.lang.String contractingOfficeID) {
        this.contractingOfficeID = contractingOfficeID;
    }


    /**
     * Gets the rankID value for this GovernmentUserProfileType.
     * 
     * @return rankID
     */
    public java.lang.String getRankID() {
        return rankID;
    }


    /**
     * Sets the rankID value for this GovernmentUserProfileType.
     * 
     * @param rankID
     */
    public void setRankID(java.lang.String rankID) {
        this.rankID = rankID;
    }


    /**
     * Gets the routingSymbol value for this GovernmentUserProfileType.
     * 
     * @return routingSymbol
     */
    public java.lang.String getRoutingSymbol() {
        return routingSymbol;
    }


    /**
     * Sets the routingSymbol value for this GovernmentUserProfileType.
     * 
     * @param routingSymbol
     */
    public void setRoutingSymbol(java.lang.String routingSymbol) {
        this.routingSymbol = routingSymbol;
    }


    /**
     * Gets the roomNo value for this GovernmentUserProfileType.
     * 
     * @return roomNo
     */
    public java.lang.String getRoomNo() {
        return roomNo;
    }


    /**
     * Sets the roomNo value for this GovernmentUserProfileType.
     * 
     * @param roomNo
     */
    public void setRoomNo(java.lang.String roomNo) {
        this.roomNo = roomNo;
    }


    /**
     * Gets the supervisorUserID value for this GovernmentUserProfileType.
     * 
     * @return supervisorUserID
     */
    public java.lang.String getSupervisorUserID() {
        return supervisorUserID;
    }


    /**
     * Sets the supervisorUserID value for this GovernmentUserProfileType.
     * 
     * @param supervisorUserID
     */
    public void setSupervisorUserID(java.lang.String supervisorUserID) {
        this.supervisorUserID = supervisorUserID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GovernmentUserProfileType)) return false;
        GovernmentUserProfileType other = (GovernmentUserProfileType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agencyID==null && other.getAgencyID()==null) || 
             (this.agencyID!=null &&
              this.agencyID.equals(other.getAgencyID()))) &&
            ((this.organizationID==null && other.getOrganizationID()==null) || 
             (this.organizationID!=null &&
              this.organizationID.equals(other.getOrganizationID()))) &&
            ((this.contractingOfficeID==null && other.getContractingOfficeID()==null) || 
             (this.contractingOfficeID!=null &&
              this.contractingOfficeID.equals(other.getContractingOfficeID()))) &&
            ((this.rankID==null && other.getRankID()==null) || 
             (this.rankID!=null &&
              this.rankID.equals(other.getRankID()))) &&
            ((this.routingSymbol==null && other.getRoutingSymbol()==null) || 
             (this.routingSymbol!=null &&
              this.routingSymbol.equals(other.getRoutingSymbol()))) &&
            ((this.roomNo==null && other.getRoomNo()==null) || 
             (this.roomNo!=null &&
              this.roomNo.equals(other.getRoomNo()))) &&
            ((this.supervisorUserID==null && other.getSupervisorUserID()==null) || 
             (this.supervisorUserID!=null &&
              this.supervisorUserID.equals(other.getSupervisorUserID())));
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
        if (getAgencyID() != null) {
            _hashCode += getAgencyID().hashCode();
        }
        if (getOrganizationID() != null) {
            _hashCode += getOrganizationID().hashCode();
        }
        if (getContractingOfficeID() != null) {
            _hashCode += getContractingOfficeID().hashCode();
        }
        if (getRankID() != null) {
            _hashCode += getRankID().hashCode();
        }
        if (getRoutingSymbol() != null) {
            _hashCode += getRoutingSymbol().hashCode();
        }
        if (getRoomNo() != null) {
            _hashCode += getRoomNo().hashCode();
        }
        if (getSupervisorUserID() != null) {
            _hashCode += getSupervisorUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GovernmentUserProfileType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentUserProfileType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractingOfficeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "contractingOfficeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rankID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "rankID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "routingSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "roomNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "supervisorUserID"));
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
