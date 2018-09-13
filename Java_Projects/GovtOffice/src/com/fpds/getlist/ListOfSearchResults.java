/**
 * ListOfSearchResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpds.getlist;

public class ListOfSearchResults {
	private com.fpds.getlist.CountType count;

	public ListOfSearchResults() {
	}

	public ListOfSearchResults(com.fpds.getlist.CountType count) {
		this.count = count;
	}

	/**
	 * Gets the count value for this ListOfSearchResults.
	 * 
	 * @return count
	 */
	public com.fpds.getlist.CountType getCount() {
		return count;
	}

	/**
	 * Sets the count value for this ListOfSearchResults.
	 * 
	 * @param count
	 */
	public void setCount(com.fpds.getlist.CountType count) {
		this.count = count;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ListOfSearchResults))
			return false;
		ListOfSearchResults other = (ListOfSearchResults) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.count == null && other.getCount() == null) || (this.count != null && this.count
				.equals(other.getCount())));
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
		if (getCount() != null) {
			_hashCode += getCount().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

}
