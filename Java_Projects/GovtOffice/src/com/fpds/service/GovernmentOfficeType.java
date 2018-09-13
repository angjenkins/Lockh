/**
 * GovernmentOfficeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.service;

public class GovernmentOfficeType  extends com.fpds.service.AddressType  {
    private java.lang.String governmentOfficeID;

    private java.lang.String officeID;

    private java.lang.String agencyID;

    private java.lang.String officeName;

    private java.lang.String agencyName;

    private java.lang.String regionCode;

    private com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType[] listOfGovernmentOfficeFunctionalDimensionalValue;

    private java.lang.String parentOrganizationID;

    private java.lang.String parentOrganizationCode;

    private java.lang.Boolean isContractingOffice;

    private java.lang.String contractingOfficeID;

    private java.lang.String contractingOfficeStartDate;

    private java.lang.String contractingOfficeEndDate;

    private java.lang.String[] listOfAdministrators;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private com.fpds.service.AuditInformationType auditInformation;

    public GovernmentOfficeType() {
    }

    public GovernmentOfficeType(
           java.lang.String streetAddress,
           java.lang.String streetAddress2,
           java.lang.String streetAddress3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String province,
           java.lang.String ZIPCode,
           java.lang.String countryCode,
           java.lang.String governmentOfficeID,
           java.lang.String officeID,
           java.lang.String agencyID,
           java.lang.String officeName,
           java.lang.String agencyName,
           java.lang.String regionCode,
           com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType[] listOfGovernmentOfficeFunctionalDimensionalValue,
           java.lang.String parentOrganizationID,
           java.lang.String parentOrganizationCode,
           java.lang.Boolean isContractingOffice,
           java.lang.String contractingOfficeID,
           java.lang.String contractingOfficeStartDate,
           java.lang.String contractingOfficeEndDate,
           java.lang.String[] listOfAdministrators,
           java.lang.String startDate,
           java.lang.String endDate,
           com.fpds.service.AuditInformationType auditInformation) {
        super(
            streetAddress,
            streetAddress2,
            streetAddress3,
            city,
            state,
            province,
            ZIPCode,
            countryCode);
        this.governmentOfficeID = governmentOfficeID;
        this.officeID = officeID;
        this.agencyID = agencyID;
        this.officeName = officeName;
        this.agencyName = agencyName;
        this.regionCode = regionCode;
        this.listOfGovernmentOfficeFunctionalDimensionalValue = listOfGovernmentOfficeFunctionalDimensionalValue;
        this.parentOrganizationID = parentOrganizationID;
        this.parentOrganizationCode = parentOrganizationCode;
        this.isContractingOffice = isContractingOffice;
        this.contractingOfficeID = contractingOfficeID;
        this.contractingOfficeStartDate = contractingOfficeStartDate;
        this.contractingOfficeEndDate = contractingOfficeEndDate;
        this.listOfAdministrators = listOfAdministrators;
        this.startDate = startDate;
        this.endDate = endDate;
        this.auditInformation = auditInformation;
    }


    /**
     * Gets the governmentOfficeID value for this GovernmentOfficeType.
     * 
     * @return governmentOfficeID
     */
    public java.lang.String getGovernmentOfficeID() {
        return governmentOfficeID;
    }


    /**
     * Sets the governmentOfficeID value for this GovernmentOfficeType.
     * 
     * @param governmentOfficeID
     */
    public void setGovernmentOfficeID(java.lang.String governmentOfficeID) {
        this.governmentOfficeID = governmentOfficeID;
    }


    /**
     * Gets the officeID value for this GovernmentOfficeType.
     * 
     * @return officeID
     */
    public java.lang.String getOfficeID() {
        return officeID;
    }


    /**
     * Sets the officeID value for this GovernmentOfficeType.
     * 
     * @param officeID
     */
    public void setOfficeID(java.lang.String officeID) {
        this.officeID = officeID;
    }


    /**
     * Gets the agencyID value for this GovernmentOfficeType.
     * 
     * @return agencyID
     */
    public java.lang.String getAgencyID() {
        return agencyID;
    }


    /**
     * Sets the agencyID value for this GovernmentOfficeType.
     * 
     * @param agencyID
     */
    public void setAgencyID(java.lang.String agencyID) {
        this.agencyID = agencyID;
    }


    /**
     * Gets the officeName value for this GovernmentOfficeType.
     * 
     * @return officeName
     */
    public java.lang.String getOfficeName() {
        return officeName;
    }


    /**
     * Sets the officeName value for this GovernmentOfficeType.
     * 
     * @param officeName
     */
    public void setOfficeName(java.lang.String officeName) {
        this.officeName = officeName;
    }


    /**
     * Gets the agencyName value for this GovernmentOfficeType.
     * 
     * @return agencyName
     */
    public java.lang.String getAgencyName() {
        return agencyName;
    }


    /**
     * Sets the agencyName value for this GovernmentOfficeType.
     * 
     * @param agencyName
     */
    public void setAgencyName(java.lang.String agencyName) {
        this.agencyName = agencyName;
    }


    /**
     * Gets the regionCode value for this GovernmentOfficeType.
     * 
     * @return regionCode
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this GovernmentOfficeType.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the listOfGovernmentOfficeFunctionalDimensionalValue value for this GovernmentOfficeType.
     * 
     * @return listOfGovernmentOfficeFunctionalDimensionalValue
     */
    public com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType[] getListOfGovernmentOfficeFunctionalDimensionalValue() {
        return listOfGovernmentOfficeFunctionalDimensionalValue;
    }


    /**
     * Sets the listOfGovernmentOfficeFunctionalDimensionalValue value for this GovernmentOfficeType.
     * 
     * @param listOfGovernmentOfficeFunctionalDimensionalValue
     */
    public void setListOfGovernmentOfficeFunctionalDimensionalValue(com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType[] listOfGovernmentOfficeFunctionalDimensionalValue) {
        this.listOfGovernmentOfficeFunctionalDimensionalValue = listOfGovernmentOfficeFunctionalDimensionalValue;
    }


    /**
     * Gets the parentOrganizationID value for this GovernmentOfficeType.
     * 
     * @return parentOrganizationID
     */
    public java.lang.String getParentOrganizationID() {
        return parentOrganizationID;
    }


    /**
     * Sets the parentOrganizationID value for this GovernmentOfficeType.
     * 
     * @param parentOrganizationID
     */
    public void setParentOrganizationID(java.lang.String parentOrganizationID) {
        this.parentOrganizationID = parentOrganizationID;
    }


    /**
     * Gets the parentOrganizationCode value for this GovernmentOfficeType.
     * 
     * @return parentOrganizationCode
     */
    public java.lang.String getParentOrganizationCode() {
        return parentOrganizationCode;
    }


    /**
     * Sets the parentOrganizationCode value for this GovernmentOfficeType.
     * 
     * @param parentOrganizationCode
     */
    public void setParentOrganizationCode(java.lang.String parentOrganizationCode) {
        this.parentOrganizationCode = parentOrganizationCode;
    }


    /**
     * Gets the isContractingOffice value for this GovernmentOfficeType.
     * 
     * @return isContractingOffice
     */
    public java.lang.Boolean getIsContractingOffice() {
        return isContractingOffice;
    }


    /**
     * Sets the isContractingOffice value for this GovernmentOfficeType.
     * 
     * @param isContractingOffice
     */
    public void setIsContractingOffice(java.lang.Boolean isContractingOffice) {
        this.isContractingOffice = isContractingOffice;
    }


    /**
     * Gets the contractingOfficeID value for this GovernmentOfficeType.
     * 
     * @return contractingOfficeID
     */
    public java.lang.String getContractingOfficeID() {
        return contractingOfficeID;
    }


    /**
     * Sets the contractingOfficeID value for this GovernmentOfficeType.
     * 
     * @param contractingOfficeID
     */
    public void setContractingOfficeID(java.lang.String contractingOfficeID) {
        this.contractingOfficeID = contractingOfficeID;
    }


    /**
     * Gets the contractingOfficeStartDate value for this GovernmentOfficeType.
     * 
     * @return contractingOfficeStartDate
     */
    public java.lang.String getContractingOfficeStartDate() {
        return contractingOfficeStartDate;
    }


    /**
     * Sets the contractingOfficeStartDate value for this GovernmentOfficeType.
     * 
     * @param contractingOfficeStartDate
     */
    public void setContractingOfficeStartDate(java.lang.String contractingOfficeStartDate) {
        this.contractingOfficeStartDate = contractingOfficeStartDate;
    }


    /**
     * Gets the contractingOfficeEndDate value for this GovernmentOfficeType.
     * 
     * @return contractingOfficeEndDate
     */
    public java.lang.String getContractingOfficeEndDate() {
        return contractingOfficeEndDate;
    }


    /**
     * Sets the contractingOfficeEndDate value for this GovernmentOfficeType.
     * 
     * @param contractingOfficeEndDate
     */
    public void setContractingOfficeEndDate(java.lang.String contractingOfficeEndDate) {
        this.contractingOfficeEndDate = contractingOfficeEndDate;
    }


    /**
     * Gets the listOfAdministrators value for this GovernmentOfficeType.
     * 
     * @return listOfAdministrators
     */
    public java.lang.String[] getListOfAdministrators() {
        return listOfAdministrators;
    }


    /**
     * Sets the listOfAdministrators value for this GovernmentOfficeType.
     * 
     * @param listOfAdministrators
     */
    public void setListOfAdministrators(java.lang.String[] listOfAdministrators) {
        this.listOfAdministrators = listOfAdministrators;
    }


    /**
     * Gets the startDate value for this GovernmentOfficeType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GovernmentOfficeType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GovernmentOfficeType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GovernmentOfficeType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the auditInformation value for this GovernmentOfficeType.
     * 
     * @return auditInformation
     */
    public com.fpds.service.AuditInformationType getAuditInformation() {
        return auditInformation;
    }


    /**
     * Sets the auditInformation value for this GovernmentOfficeType.
     * 
     * @param auditInformation
     */
    public void setAuditInformation(com.fpds.service.AuditInformationType auditInformation) {
        this.auditInformation = auditInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GovernmentOfficeType)) return false;
        GovernmentOfficeType other = (GovernmentOfficeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.governmentOfficeID==null && other.getGovernmentOfficeID()==null) || 
             (this.governmentOfficeID!=null &&
              this.governmentOfficeID.equals(other.getGovernmentOfficeID()))) &&
            ((this.officeID==null && other.getOfficeID()==null) || 
             (this.officeID!=null &&
              this.officeID.equals(other.getOfficeID()))) &&
            ((this.agencyID==null && other.getAgencyID()==null) || 
             (this.agencyID!=null &&
              this.agencyID.equals(other.getAgencyID()))) &&
            ((this.officeName==null && other.getOfficeName()==null) || 
             (this.officeName!=null &&
              this.officeName.equals(other.getOfficeName()))) &&
            ((this.agencyName==null && other.getAgencyName()==null) || 
             (this.agencyName!=null &&
              this.agencyName.equals(other.getAgencyName()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.listOfGovernmentOfficeFunctionalDimensionalValue==null && other.getListOfGovernmentOfficeFunctionalDimensionalValue()==null) || 
             (this.listOfGovernmentOfficeFunctionalDimensionalValue!=null &&
              java.util.Arrays.equals(this.listOfGovernmentOfficeFunctionalDimensionalValue, other.getListOfGovernmentOfficeFunctionalDimensionalValue()))) &&
            ((this.parentOrganizationID==null && other.getParentOrganizationID()==null) || 
             (this.parentOrganizationID!=null &&
              this.parentOrganizationID.equals(other.getParentOrganizationID()))) &&
            ((this.parentOrganizationCode==null && other.getParentOrganizationCode()==null) || 
             (this.parentOrganizationCode!=null &&
              this.parentOrganizationCode.equals(other.getParentOrganizationCode()))) &&
            ((this.isContractingOffice==null && other.getIsContractingOffice()==null) || 
             (this.isContractingOffice!=null &&
              this.isContractingOffice.equals(other.getIsContractingOffice()))) &&
            ((this.contractingOfficeID==null && other.getContractingOfficeID()==null) || 
             (this.contractingOfficeID!=null &&
              this.contractingOfficeID.equals(other.getContractingOfficeID()))) &&
            ((this.contractingOfficeStartDate==null && other.getContractingOfficeStartDate()==null) || 
             (this.contractingOfficeStartDate!=null &&
              this.contractingOfficeStartDate.equals(other.getContractingOfficeStartDate()))) &&
            ((this.contractingOfficeEndDate==null && other.getContractingOfficeEndDate()==null) || 
             (this.contractingOfficeEndDate!=null &&
              this.contractingOfficeEndDate.equals(other.getContractingOfficeEndDate()))) &&
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
        int _hashCode = super.hashCode();
        if (getGovernmentOfficeID() != null) {
            _hashCode += getGovernmentOfficeID().hashCode();
        }
        if (getOfficeID() != null) {
            _hashCode += getOfficeID().hashCode();
        }
        if (getAgencyID() != null) {
            _hashCode += getAgencyID().hashCode();
        }
        if (getOfficeName() != null) {
            _hashCode += getOfficeName().hashCode();
        }
        if (getAgencyName() != null) {
            _hashCode += getAgencyName().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getListOfGovernmentOfficeFunctionalDimensionalValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfGovernmentOfficeFunctionalDimensionalValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfGovernmentOfficeFunctionalDimensionalValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentOrganizationID() != null) {
            _hashCode += getParentOrganizationID().hashCode();
        }
        if (getParentOrganizationCode() != null) {
            _hashCode += getParentOrganizationCode().hashCode();
        }
        if (getIsContractingOffice() != null) {
            _hashCode += getIsContractingOffice().hashCode();
        }
        if (getContractingOfficeID() != null) {
            _hashCode += getContractingOfficeID().hashCode();
        }
        if (getContractingOfficeStartDate() != null) {
            _hashCode += getContractingOfficeStartDate().hashCode();
        }
        if (getContractingOfficeEndDate() != null) {
            _hashCode += getContractingOfficeEndDate().hashCode();
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



}
