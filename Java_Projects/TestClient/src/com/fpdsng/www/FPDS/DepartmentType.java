/**
 * DepartmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class DepartmentType  implements java.io.Serializable {
    private java.lang.String departmentID;

    private java.lang.String departmentName;

    private java.lang.String[] listOfAdministrators;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private com.fpdsng.www.FPDS.AuditInformationType auditInformation;

    public DepartmentType() {
    }

    public DepartmentType(
           java.lang.String departmentID,
           java.lang.String departmentName,
           java.lang.String[] listOfAdministrators,
           java.lang.String startDate,
           java.lang.String endDate,
           com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
           this.departmentID = departmentID;
           this.departmentName = departmentName;
           this.listOfAdministrators = listOfAdministrators;
           this.startDate = startDate;
           this.endDate = endDate;
           this.auditInformation = auditInformation;
    }


    /**
     * Gets the departmentID value for this DepartmentType.
     * 
     * @return departmentID
     */
    public java.lang.String getDepartmentID() {
        return departmentID;
    }


    /**
     * Sets the departmentID value for this DepartmentType.
     * 
     * @param departmentID
     */
    public void setDepartmentID(java.lang.String departmentID) {
        this.departmentID = departmentID;
    }


    /**
     * Gets the departmentName value for this DepartmentType.
     * 
     * @return departmentName
     */
    public java.lang.String getDepartmentName() {
        return departmentName;
    }


    /**
     * Sets the departmentName value for this DepartmentType.
     * 
     * @param departmentName
     */
    public void setDepartmentName(java.lang.String departmentName) {
        this.departmentName = departmentName;
    }


    /**
     * Gets the listOfAdministrators value for this DepartmentType.
     * 
     * @return listOfAdministrators
     */
    public java.lang.String[] getListOfAdministrators() {
        return listOfAdministrators;
    }


    /**
     * Sets the listOfAdministrators value for this DepartmentType.
     * 
     * @param listOfAdministrators
     */
    public void setListOfAdministrators(java.lang.String[] listOfAdministrators) {
        this.listOfAdministrators = listOfAdministrators;
    }


    /**
     * Gets the startDate value for this DepartmentType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DepartmentType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DepartmentType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DepartmentType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the auditInformation value for this DepartmentType.
     * 
     * @return auditInformation
     */
    public com.fpdsng.www.FPDS.AuditInformationType getAuditInformation() {
        return auditInformation;
    }


    /**
     * Sets the auditInformation value for this DepartmentType.
     * 
     * @param auditInformation
     */
    public void setAuditInformation(com.fpdsng.www.FPDS.AuditInformationType auditInformation) {
        this.auditInformation = auditInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepartmentType)) return false;
        DepartmentType other = (DepartmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departmentID==null && other.getDepartmentID()==null) || 
             (this.departmentID!=null &&
              this.departmentID.equals(other.getDepartmentID()))) &&
            ((this.departmentName==null && other.getDepartmentName()==null) || 
             (this.departmentName!=null &&
              this.departmentName.equals(other.getDepartmentName()))) &&
            ((this.listOfAdministrators==null && other.getListOfAdministrators()==null) || 
             (this.listOfAdministrators!=null &&
              java.util.Arrays.equals(this.listOfAdministrators, other.getListOfAdministrators()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
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
        if (getDepartmentID() != null) {
            _hashCode += getDepartmentID().hashCode();
        }
        if (getDepartmentName() != null) {
            _hashCode += getDepartmentName().hashCode();
        }
        if (getListOfAdministrators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAdministrators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAdministrators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAuditInformation() != null) {
            _hashCode += getAuditInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepartmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAdministrators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfAdministrators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "administrator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformationType"));
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
