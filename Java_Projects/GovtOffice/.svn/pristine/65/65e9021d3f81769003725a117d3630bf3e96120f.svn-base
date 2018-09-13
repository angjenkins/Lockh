package com.fpds.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface GovtOffice {
    //public com.fpds.service.CreateGovernmentOfficeResponseType create(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
    //public com.fpds.service.CreateGovernmentOfficeResponseType createContractingOffice(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
    //public com.fpds.service.UpdateGovernmentOfficeResponseType update(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException;
	@WebMethod(operationName="get")
    public com.fpds.service.GetGovernmentOfficeResponseType get(@WebParam(name="authenticationKey") com.fpds.service.UserAuthenticationKeyType authenticationKey,@WebParam(name="governmentOfficeKey") com.fpds.service.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    @WebMethod(operationName="getlist")
	public com.fpds.getlist.GetListGovernmentOfficeResponseType getList(com.fpds.getlist.UserAuthenticationKeyType authenticationKey, com.fpds.getlist.GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria) throws java.rmi.RemoteException;
	@WebMethod(operationName="exists")
    public com.fpds.exists.ExistsGovernmentOfficeResponseType exists(com.fpds.exists.UserAuthenticationKeyTypeExists authenticationKey, com.fpds.exists.GovernmentOfficeKeyTypeExists governmentOfficeKey) throws java.rmi.RemoteException;
	//@WebMethod(operationName="exists")
    //public com.fpds.service.ExistsGovernmentOfficeResponseType exists(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    //public com.fpds.service.DeleteGovernmentOfficeResponseType delete(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    //public com.fpds.service.DisableGovernmentOfficeResponseType disable(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    //public com.fpds.service.EnableGovernmentOfficeResponseType enable(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException;
    //public com.fpds.service.UpdateOrganizationAssociationsResponseType updateOrganizationAssociations(com.fpds.service.UserAuthenticationKeyType authenticationKey, com.fpds.service.UpdateOrganizationAssociationType[] listOfUpdateOrganizationAssociations) throws java.rmi.RemoteException;
}
