/**
 * GovernmentOfficePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public interface GovernmentOfficePortType extends java.rmi.Remote {
    public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType create(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType createContractingOffice(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType update(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType get(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType getList(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType exists(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType delete(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType disable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType enable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    public com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType updateOrganizationAssociations(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.UpdateOrganizationAssociationType[] listOfUpdateOrganizationAssociations) throws java.rmi.RemoteException;
}
