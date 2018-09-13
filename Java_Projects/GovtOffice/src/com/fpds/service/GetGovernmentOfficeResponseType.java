

package com.fpds.service;

public class GetGovernmentOfficeResponseType{
	//org.apache.axis.types.NonNegativeInteger
    public java.math.BigInteger requestNumber;
    public java.math.BigInteger confirmationNumber;
    public com.fpds.service.ParameterType[] listOfParameters;
    public com.fpds.service.OutputMessagesType outputMessages;
    private com.fpds.service.GovernmentOfficeType governmentOffice;

    public GetGovernmentOfficeResponseType() {
    	
    	
    }

    public GetGovernmentOfficeResponseType(
     	   //Integer requestNumber,
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpds.service.ParameterType[] listOfParameters,
           com.fpds.service.OutputMessagesType outputMessages,
           com.fpds.service.GovernmentOfficeType governmentOffice) {
    	this.requestNumber = requestNumber;
    	this.confirmationNumber = confirmationNumber;
    	this.listOfParameters = listOfParameters;
    	this.outputMessages = outputMessages;
    	this.governmentOffice = governmentOffice;
    }


    /**
     * Gets the governmentOffice value for this GetGovernmentOfficeResponseType.
     * 
     * @return governmentOffice
     */
    public com.fpds.service.GovernmentOfficeType getGovernmentOffice() {
        return governmentOffice;
    }


    /**
     * Sets the governmentOffice value for this GetGovernmentOfficeResponseType.
     * 
     * @param governmentOffice
     */
    public void setGovernmentOffice(com.fpds.service.GovernmentOfficeType governmentOffice) {
        this.governmentOffice = governmentOffice;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGovernmentOfficeResponseType)) return false;
        GetGovernmentOfficeResponseType other = (GetGovernmentOfficeResponseType) obj;
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
              this.governmentOffice.equals(other.getGovernmentOffice())));
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
            _hashCode += getGovernmentOffice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }




}
