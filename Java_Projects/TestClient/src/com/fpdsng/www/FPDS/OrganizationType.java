/**
 * OrganizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class OrganizationType  implements java.io.Serializable {
    private java.lang.String organizationID;

    private java.lang.String parentOrganizationID;

    private java.lang.String parentOrganizationCode;

    private java.lang.String organizationCode;

    private java.lang.String organizationName;

    private java.lang.String organizationShortName;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String organizationCategoryID;

    private com.fpdsng.www.FPDS.OrganizationType[] listOfChildOrganizations;

    private com.fpdsng.www.FPDS.AuditInformationType auditInformation;

    public OrganizationType() {
    }

    public OrganizationType(
           java.lang.String organizationID,
           java.lang.String parentOrganizationID,
           java.lang.String parentOrganizationCode,
           java.lang.String organizationCode,
           java.lang.String organizationName,
           java.lang.String organizationShortName,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String organizationCategoryID,
           com.fpdsng.www.FPDS.OrganizationType[] listOfChildOrganizations,
           com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
           this.organizationID = organizationID;
           this.parentOrganizationID = parentOrganizationID;
           this.parentOrganizationCode = parentOrganizationCode;
           this.organizationCode = organizationCode;
           this.organizationName = organizationName;
           this.organizationShortName = organizationShortName;
           this.startDate = startDate;
           this.endDate = endDate;
           this.organizationCategoryID = organizationCategoryID;
           this.listOfChildOrganizations = listOfChildOrganizations;
           this.auditInformation = auditInformation;
    }


    /**
     * Gets the organizationID value for this OrganizationType.
     * 
     * @return organizationID
     */
    public java.lang.String getOrganizationID() {
        return organizationID;
    }


    /**
     * Sets the organizationID value for this OrganizationType.
     * 
     * @param organizationID
     */
    public void setOrganizationID(java.lang.String organizationID) {
        this.organizationID = organizationID;
    }


    /**
     * Gets the parentOrganizationID value for this OrganizationType.
     * 
     * @return parentOrganizationID
     */
    public java.lang.String getParentOrganizationID() {
        return parentOrganizationID;
    }


    /**
     * Sets the parentOrganizationID value for this OrganizationType.
     * 
     * @param parentOrganizationID
     */
    public void setParentOrganizationID(java.lang.String parentOrganizationID) {
        this.parentOrganizationID = parentOrganizationID;
    }


    /**
     * Gets the parentOrganizationCode value for this OrganizationType.
     * 
     * @return parentOrganizationCode
     */
    public java.lang.String getParentOrganizationCode() {
        return parentOrganizationCode;
    }


    /**
     * Sets the parentOrganizationCode value for this OrganizationType.
     * 
     * @param parentOrganizationCode
     */
    public void setParentOrganizationCode(java.lang.String parentOrganizationCode) {
        this.parentOrganizationCode = parentOrganizationCode;
    }


    /**
     * Gets the organizationCode value for this OrganizationType.
     * 
     * @return organizationCode
     */
    public java.lang.String getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this OrganizationType.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(java.lang.String organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the organizationName value for this OrganizationType.
     * 
     * @return organizationName
     */
    public java.lang.String getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this OrganizationType.
     * 
     * @param organizationName
     */
    public void setOrganizationName(java.lang.String organizationName) {
        this.organizationName = organizationName;
    }


    /**
     * Gets the organizationShortName value for this OrganizationType.
     * 
     * @return organizationShortName
     */
    public java.lang.String getOrganizationShortName() {
        return organizationShortName;
    }


    /**
     * Sets the organizationShortName value for this OrganizationType.
     * 
     * @param organizationShortName
     */
    public void setOrganizationShortName(java.lang.String organizationShortName) {
        this.organizationShortName = organizationShortName;
    }


    /**
     * Gets the startDate value for this OrganizationType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OrganizationType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this OrganizationType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this OrganizationType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the organizationCategoryID value for this OrganizationType.
     * 
     * @return organizationCategoryID
     */
    public java.lang.String getOrganizationCategoryID() {
        return organizationCategoryID;
    }


    /**
     * Sets the organizationCategoryID value for this OrganizationType.
     * 
     * @param organizationCategoryID
     */
    public void setOrganizationCategoryID(java.lang.String organizationCategoryID) {
        this.organizationCategoryID = organizationCategoryID;
    }


    /**
     * Gets the listOfChildOrganizations value for this OrganizationType.
     * 
     * @return listOfChildOrganizations
     */
    public com.fpdsng.www.FPDS.OrganizationType[] getListOfChildOrganizations() {
        return listOfChildOrganizations;
    }


    /**
     * Sets the listOfChildOrganizations value for this OrganizationType.
     * 
     * @param listOfChildOrganizations
     */
    public void setListOfChildOrganizations(com.fpdsng.www.FPDS.OrganizationType[] listOfChildOrganizations) {
        this.listOfChildOrganizations = listOfChildOrganizations;
    }


    /**
     * Gets the auditInformation value for this OrganizationType.
     * 
     * @return auditInformation
     */
    public com.fpdsng.www.FPDS.AuditInformationType getAuditInformation() {
        return auditInformation;
    }


    /**
     * Sets the auditInformation value for this OrganizationType.
     * 
     * @param auditInformation
     */
    public void setAuditInformation(com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
        this.auditInformation = auditInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationType)) return false;
        OrganizationType other = (OrganizationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizationID==null && other.getOrganizationID()==null) || 
             (this.organizationID!=null &&
              this.organizationID.equals(other.getOrganizationID()))) &&
            ((this.parentOrganizationID==null && other.getParentOrganizationID()==null) || 
             (this.parentOrganizationID!=null &&
              this.parentOrganizationID.equals(other.getParentOrganizationID()))) &&
            ((this.parentOrganizationCode==null && other.getParentOrganizationCode()==null) || 
             (this.parentOrganizationCode!=null &&
              this.parentOrganizationCode.equals(other.getParentOrganizationCode()))) &&
            ((this.organizationCode==null && other.getOrganizationCode()==null) || 
             (this.organizationCode!=null &&
              this.organizationCode.equals(other.getOrganizationCode()))) &&
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName()))) &&
            ((this.organizationShortName==null && other.getOrganizationShortName()==null) || 
             (this.organizationShortName!=null &&
              this.organizationShortName.equals(other.getOrganizationShortName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.organizationCategoryID==null && other.getOrganizationCategoryID()==null) || 
             (this.organizationCategoryID!=null &&
              this.organizationCategoryID.equals(other.getOrganizationCategoryID()))) &&
            ((this.listOfChildOrganizations==null && other.getListOfChildOrganizations()==null) || 
             (this.listOfChildOrganizations!=null &&
              java.util.Arrays.equals(this.listOfChildOrganizations, other.getListOfChildOrganizations()))) &&
            ((this.auditInformation==null && other.getAuditInformation()==null) || 
             (this.auditInformation!=null &&
              this.auditInformation.equals(other.getAuditInformation())));
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
        if (getOrganizationID() != null) {
            _hashCode += getOrganizationID().hashCode();
        }
        if (getParentOrganizationID() != null) {
            _hashCode += getParentOrganizationID().hashCode();
        }
        if (getParentOrganizationCode() != null) {
            _hashCode += getParentOrganizationCode().hashCode();
        }
        if (getOrganizationCode() != null) {
            _hashCode += getOrganizationCode().hashCode();
        }
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        if (getOrganizationShortName() != null) {
            _hashCode += getOrganizationShortName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOrganizationCategoryID() != null) {
            _hashCode += getOrganizationCategoryID().hashCode();
        }
        if (getListOfChildOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfChildOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfChildOrganizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditInformation() != null) {
            _hashCode += getAuditInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrganizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrganizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationShortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfChildOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfChildOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organization"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformationType"));
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
