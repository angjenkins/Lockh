/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.service;

public class AddressType  implements java.io.Serializable {
    private java.lang.String streetAddress;

    private java.lang.String streetAddress2;

    private java.lang.String streetAddress3;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String province;

    private java.lang.String ZIPCode;

    private java.lang.String countryCode;

    public AddressType() {
    }

    public AddressType(
           java.lang.String streetAddress,
           java.lang.String streetAddress2,
           java.lang.String streetAddress3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String province,
           java.lang.String ZIPCode,
           java.lang.String countryCode) {
           this.streetAddress = streetAddress;
           this.streetAddress2 = streetAddress2;
           this.streetAddress3 = streetAddress3;
           this.city = city;
           this.state = state;
           this.province = province;
           this.ZIPCode = ZIPCode;
           this.countryCode = countryCode;
    }


    /**
     * Gets the streetAddress value for this AddressType.
     * 
     * @return streetAddress
     */
    public java.lang.String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this AddressType.
     * 
     * @param streetAddress
     */
    public void setStreetAddress(java.lang.String streetAddress) {
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the streetAddress2 value for this AddressType.
     * 
     * @return streetAddress2
     */
    public java.lang.String getStreetAddress2() {
        return streetAddress2;
    }


    /**
     * Sets the streetAddress2 value for this AddressType.
     * 
     * @param streetAddress2
     */
    public void setStreetAddress2(java.lang.String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }


    /**
     * Gets the streetAddress3 value for this AddressType.
     * 
     * @return streetAddress3
     */
    public java.lang.String getStreetAddress3() {
        return streetAddress3;
    }


    /**
     * Sets the streetAddress3 value for this AddressType.
     * 
     * @param streetAddress3
     */
    public void setStreetAddress3(java.lang.String streetAddress3) {
        this.streetAddress3 = streetAddress3;
    }


    /**
     * Gets the city value for this AddressType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AddressType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this AddressType.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AddressType.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the province value for this AddressType.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this AddressType.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the ZIPCode value for this AddressType.
     * 
     * @return ZIPCode
     */
    public java.lang.String getZIPCode() {
        return ZIPCode;
    }


    /**
     * Sets the ZIPCode value for this AddressType.
     * 
     * @param ZIPCode
     */
    public void setZIPCode(java.lang.String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }


    /**
     * Gets the countryCode value for this AddressType.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this AddressType.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressType)) return false;
        AddressType other = (AddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress()))) &&
            ((this.streetAddress2==null && other.getStreetAddress2()==null) || 
             (this.streetAddress2!=null &&
              this.streetAddress2.equals(other.getStreetAddress2()))) &&
            ((this.streetAddress3==null && other.getStreetAddress3()==null) || 
             (this.streetAddress3!=null &&
              this.streetAddress3.equals(other.getStreetAddress3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.ZIPCode==null && other.getZIPCode()==null) || 
             (this.ZIPCode!=null &&
              this.ZIPCode.equals(other.getZIPCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
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
        if (getStreetAddress() != null) {
            _hashCode += getStreetAddress().hashCode();
        }
        if (getStreetAddress2() != null) {
            _hashCode += getStreetAddress2().hashCode();
        }
        if (getStreetAddress3() != null) {
            _hashCode += getStreetAddress3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getZIPCode() != null) {
            _hashCode += getZIPCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }


}
