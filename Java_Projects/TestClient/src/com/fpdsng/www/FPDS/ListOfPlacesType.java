/**
 * ListOfPlacesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class ListOfPlacesType  extends com.fpdsng.www.FPDS.ListOfSearchResults  implements java.io.Serializable {
    private com.fpdsng.www.FPDS.PlaceType[] place;

    public ListOfPlacesType() {
    }

    public ListOfPlacesType(
           com.fpdsng.www.FPDS.CountType count,
           com.fpdsng.www.FPDS.PlaceType[] place) {
        super(
            count);
        this.place = place;
    }


    /**
     * Gets the place value for this ListOfPlacesType.
     * 
     * @return place
     */
    public com.fpdsng.www.FPDS.PlaceType[] getPlace() {
        return place;
    }


    /**
     * Sets the place value for this ListOfPlacesType.
     * 
     * @param place
     */
    public void setPlace(com.fpdsng.www.FPDS.PlaceType[] place) {
        this.place = place;
    }

    public com.fpdsng.www.FPDS.PlaceType getPlace(int i) {
        return this.place[i];
    }

    public void setPlace(int i, com.fpdsng.www.FPDS.PlaceType _value) {
        this.place[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOfPlacesType)) return false;
        ListOfPlacesType other = (ListOfPlacesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              java.util.Arrays.equals(this.place, other.getPlace())));
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
        if (getPlace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlace(), i);
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
        new org.apache.axis.description.TypeDesc(ListOfPlacesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfPlacesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
