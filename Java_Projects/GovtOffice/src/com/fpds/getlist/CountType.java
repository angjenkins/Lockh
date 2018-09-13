/**
 * CountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.getlist;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="CountType",namespace="http://www.getlist.com")
public class CountType  {
    private java.math.BigInteger total;

    private java.math.BigInteger fetched;

    public CountType() {
    }

    public CountType(
    		java.math.BigInteger total,
    		java.math.BigInteger fetched) {
           this.total = total;
           this.fetched = fetched;
    }


    /**
     * Gets the total value for this CountType.
     * 
     * @return total
     */
    public java.math.BigInteger getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CountType.
     * 
     * @param total
     */
    public void setTotal(java.math.BigInteger total) {
        this.total = total;
    }


    /**
     * Gets the fetched value for this CountType.
     * 
     * @return fetched
     */
    public java.math.BigInteger getFetched() {
        return fetched;
    }


    /**
     * Sets the fetched value for this CountType.
     * 
     * @param bigInteger
     */
    public void setFetched(BigInteger bigInteger) {
        this.fetched = bigInteger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountType)) return false;
        CountType other = (CountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.fetched==null && other.getFetched()==null) || 
             (this.fetched!=null &&
              this.fetched.equals(other.getFetched())));
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
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getFetched() != null) {
            _hashCode += getFetched().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }


}
