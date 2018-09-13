/**
 * GovernmentOfficeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GovernmentOfficeLocator extends org.apache.axis.client.Service
		implements com.fpdsng.www.FPDS.GovernmentOffice {

	public GovernmentOfficeLocator() {
	}

	public GovernmentOfficeLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public GovernmentOfficeLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for GovernmentOfficePort
	private java.lang.String GovernmentOfficePort_address = "https://www.fpds.gov/FPDS/BusinessServices/DataCollection/organizations/1.2/GovernmentOffice";

	public java.lang.String getGovernmentOfficePortAddress() {
		return GovernmentOfficePort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String GovernmentOfficePortWSDDServiceName = "GovernmentOfficePort";

	public java.lang.String getGovernmentOfficePortWSDDServiceName() {
		return GovernmentOfficePortWSDDServiceName;
	}

	public void setGovernmentOfficePortWSDDServiceName(java.lang.String name) {
		GovernmentOfficePortWSDDServiceName = name;
	}

	public com.fpdsng.www.FPDS.GovernmentOfficePortType getGovernmentOfficePort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(GovernmentOfficePort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getGovernmentOfficePort(endpoint);
	}

	public com.fpdsng.www.FPDS.GovernmentOfficePortType getGovernmentOfficePort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.fpdsng.www.FPDS.GovernmentOfficeBindingStub _stub = new com.fpdsng.www.FPDS.GovernmentOfficeBindingStub(
					portAddress, this);
			_stub.setPortName(getGovernmentOfficePortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setGovernmentOfficePortEndpointAddress(java.lang.String address) {
		GovernmentOfficePort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (com.fpdsng.www.FPDS.GovernmentOfficePortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				com.fpdsng.www.FPDS.GovernmentOfficeBindingStub _stub = new com.fpdsng.www.FPDS.GovernmentOfficeBindingStub(
						new java.net.URL(GovernmentOfficePort_address), this);
				_stub.setPortName(getGovernmentOfficePortWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("GovernmentOfficePort".equals(inputPortName)) {
			return getGovernmentOfficePort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS",
				"GovernmentOffice");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://www.fpdsng.com/FPDS", "GovernmentOfficePort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("GovernmentOfficePort".equals(portName)) {
			setGovernmentOfficePortEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
