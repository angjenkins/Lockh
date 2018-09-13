/**
 * SystemUserProfileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class SystemUserProfileType  implements java.io.Serializable {
    private java.lang.String agencyID;

    private java.lang.String contractingOfficeID;

    private java.lang.String[] listOfAdministrators;

    public SystemUserProfileType() {
    }

    public SystemUserProfileType(
           java.lang.String agencyID,
           java.lang.String contractingOfficeID,
           java.lang.String[] listOfAdministrators) {
           this.agencyID = agencyID;
           this.contractingOfficeID = contractingOfficeID;
           this.listOfAdministrators = listOfAdministrators;
    }


    /**
     * Gets the agencyID value for this SystemUserProfileType.
     * 
     * @return agencyID
     */
    public java.lang.String getAgencyID() {
        return agencyID;
    }


    /**
     * Sets the agencyID value for this SystemUserProfileType.
     * 
     * @param agencyID
     */
    public void setAgencyID(java.lang.String agencyID) {
        this.agencyID = agencyID;
    }


    /**
     * Gets the contractingOfficeID value for this SystemUserProfileType.
     * 
     * @return contractingOfficeID
     */
    public java.lang.String getContractingOfficeID() {
        return contractingOfficeID;
    }


    /**
     * Sets the contractingOfficeID value for this SystemUserProfileType.
     * 
     * @param contractingOfficeID
     */
    public void setContractingOfficeID(java.lang.String contractingOfficeID) {
        this.contractingOfficeID = contractingOfficeID;
    }


    /**
     * Gets the listOfAdministrators value for this SystemUserProfileType.
     * 
     * @return listOfAdministrators
     */
    public java.lang.String[] getListOfAdministrators() {
        return listOfAdministrators;
    }


    /**
     * Sets the listOfAdministrators value for this SystemUserProfileType.
     * 
     * @param listOfAdministrators
     */
    public void setListOfAdministrators(java.lang.String[] listOfAdministrators) {
        this.listOfAdministrators = listOfAdministrators;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemUserProfileType)) return false;
        SystemUserProfileType other = (SystemUserProfileType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencyID==null && other.getAgencyID()==null) || 
             (this.agencyID!=null &&
              this.agencyID.equals(other.getAgencyID()))) &&
            ((this.contractingOfficeID==null && other.getContractingOfficeID()==null) || 
             (this.contractingOfficeID!=null &&
              this.contractingOfficeID.equals(other.getContractingOfficeID()))) &&
            ((this.listOfAdministrators==null && other.getListOfAdministrators()==null) || 
             (this.listOfAdministrators!=null &&
              java.util.Arrays.equals(this.listOfAdministrators, other.getListOfAdministrators())));
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
        if (getAgencyID() != null) {
            _hashCode += getAgencyID().hashCode();
        }
        if (getContractingOfficeID() != null) {
            _hashCode += getContractingOfficeID().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemUserProfileType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "systemUserProfileType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyID"));
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
        elemField.setFieldName("listOfAdministrators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfAdministrators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "administrator"));
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
