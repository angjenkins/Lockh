/**
 * ParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.service;

public class ParameterType  implements java.io.Serializable {
    private java.lang.String parameterName;

    private java.lang.String parameterType;

    private java.lang.String parameterValue;

    private java.lang.String requirementState;

    public ParameterType() {
    }

    public ParameterType(
           java.lang.String parameterName,
           java.lang.String parameterType,
           java.lang.String parameterValue,
           java.lang.String requirementState) {
           this.parameterName = parameterName;
           this.parameterType = parameterType;
           this.parameterValue = parameterValue;
           this.requirementState = requirementState;
    }


    /**
     * Gets the parameterName value for this ParameterType.
     * 
     * @return parameterName
     */
    public java.lang.String getParameterName() {
        return parameterName;
    }


    /**
     * Sets the parameterName value for this ParameterType.
     * 
     * @param parameterName
     */
    public void setParameterName(java.lang.String parameterName) {
        this.parameterName = parameterName;
    }


    /**
     * Gets the parameterType value for this ParameterType.
     * 
     * @return parameterType
     */
    public java.lang.String getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this ParameterType.
     * 
     * @param parameterType
     */
    public void setParameterType(java.lang.String parameterType) {
        this.parameterType = parameterType;
    }


    /**
     * Gets the parameterValue value for this ParameterType.
     * 
     * @return parameterValue
     */
    public java.lang.String getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ParameterType.
     * 
     * @param parameterValue
     */
    public void setParameterValue(java.lang.String parameterValue) {
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the requirementState value for this ParameterType.
     * 
     * @return requirementState
     */
    public java.lang.String getRequirementState() {
        return requirementState;
    }


    /**
     * Sets the requirementState value for this ParameterType.
     * 
     * @param requirementState
     */
    public void setRequirementState(java.lang.String requirementState) {
        this.requirementState = requirementState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParameterType)) return false;
        ParameterType other = (ParameterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterName==null && other.getParameterName()==null) || 
             (this.parameterName!=null &&
              this.parameterName.equals(other.getParameterName()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType()))) &&
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue()))) &&
            ((this.requirementState==null && other.getRequirementState()==null) || 
             (this.requirementState!=null &&
              this.requirementState.equals(other.getRequirementState())));
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
        if (getParameterName() != null) {
            _hashCode += getParameterName().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        if (getRequirementState() != null) {
            _hashCode += getRequirementState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
