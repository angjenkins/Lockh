/**
 * ListOfGovernmentOfficesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.getlist;

public class ListOfGovernmentOfficesType  extends com.fpds.getlist.ListOfSearchResults  {
    private com.fpds.getlist.GovernmentOfficeType[] governmentOffice;

    public ListOfGovernmentOfficesType() {
    }

    public ListOfGovernmentOfficesType(
           com.fpds.getlist.CountType count,
           com.fpds.getlist.GovernmentOfficeType[] governmentOffice) {
        super(
            count);
        this.governmentOffice = governmentOffice;
    }


    /**
     * Gets the governmentOffice value for this ListOfGovernmentOfficesType.
     * 
     * @return governmentOffice
     */
    public com.fpds.getlist.GovernmentOfficeType[] getGovernmentOffice() {
        return governmentOffice;
    }


    /**
     * Sets the governmentOffice value for this ListOfGovernmentOfficesType.
     * 
     * @param governmentOffice
     */
    public void setGovernmentOffice(com.fpds.getlist.GovernmentOfficeType[] governmentOffice) {
        this.governmentOffice = governmentOffice;
    }

    public com.fpds.getlist.GovernmentOfficeType getGovernmentOffice(int i) {
        return this.governmentOffice[i];
    }

    public void setGovernmentOffice(int i, com.fpds.getlist.GovernmentOfficeType _value) {
        this.governmentOffice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfGovernmentOfficesType)) return false;
        ListOfGovernmentOfficesType other = (ListOfGovernmentOfficesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.governmentOffice==null && other.getGovernmentOffice()==null) || 
             (this.governmentOffice!=null &&
              java.util.Arrays.equals(this.governmentOffice, other.getGovernmentOffice())));
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
        if (getGovernmentOffice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGovernmentOffice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGovernmentOffice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }



}
