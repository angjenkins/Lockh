

package com.fpds.exists;

public class GetGovernmentOfficeResponseTypeExists{
	//org.apache.axis.types.NonNegativeInteger
    public java.math.BigInteger requestNumber;
    public java.math.BigInteger confirmationNumber;
    public com.fpds.exists.ParameterTypeExists[] listOfParameters;
    public com.fpds.exists.OutputMessagesTypeExists outputMessages;
    private com.fpds.exists.GovernmentOfficeTypeExists governmentOffice;

    public GetGovernmentOfficeResponseTypeExists() {
    	
    	
    }

    public GetGovernmentOfficeResponseTypeExists(
     	   //Integer requestNumber,
           org.apache.axis.types.NonNegativeInteger requestNumber,
           java.math.BigInteger confirmationNumber,
           com.fpds.exists.ParameterTypeExists[] listOfParameters,
           com.fpds.exists.OutputMessagesTypeExists outputMessages,
           com.fpds.exists.GovernmentOfficeTypeExists governmentOffice) {
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
    public com.fpds.exists.GovernmentOfficeTypeExists getGovernmentOffice() {
        return governmentOffice;
    }


    /**
     * Sets the governmentOffice value for this GetGovernmentOfficeResponseType.
     * 
     * @param governmentOffice
     */
    public void setGovernmentOffice(com.fpds.exists.GovernmentOfficeTypeExists governmentOffice) {
        this.governmentOffice = governmentOffice;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGovernmentOfficeResponseTypeExists)) return false;
        GetGovernmentOfficeResponseTypeExists other = (GetGovernmentOfficeResponseTypeExists) obj;
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
