package com.fpdsng.www.FPDS;

public class GovernmentOfficePortTypeProxy implements com.fpdsng.www.FPDS.GovernmentOfficePortType {
  private String _endpoint = null;
  private com.fpdsng.www.FPDS.GovernmentOfficePortType governmentOfficePortType = null;
  
  public GovernmentOfficePortTypeProxy() {
    _initGovernmentOfficePortTypeProxy();
  }
  
  public GovernmentOfficePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGovernmentOfficePortTypeProxy();
  }
  
  private void _initGovernmentOfficePortTypeProxy() {
    try {
      governmentOfficePortType = (new com.fpdsng.www.FPDS.GovernmentOfficeLocator()).getGovernmentOfficePort();
      if (governmentOfficePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)governmentOfficePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)governmentOfficePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (governmentOfficePortType != null)
      ((javax.xml.rpc.Stub)governmentOfficePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fpdsng.www.FPDS.GovernmentOfficePortType getGovernmentOfficePortType() {
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType;
  }
  
  public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType create(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.create(authenticationKey, governmentOffice);
  }
  
  public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType createContractingOffice(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.createContractingOffice(authenticationKey, governmentOffice);
  }
  
  public com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType update(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.update(authenticationKey, governmentOffice);
  }
  
  public com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType get(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.get(authenticationKey, governmentOfficeKey);
  }
  
  public com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType getList(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.getList(authenticationKey, governmentOfficeSearchCriteria);
  }
  
  public com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType exists(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.exists(authenticationKey, governmentOfficeKey);
  }
  
  public com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType delete(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.delete(authenticationKey, governmentOfficeKey);
  }
  
  public com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType disable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.disable(authenticationKey, governmentOfficeKey);
  }
  
  public com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType enable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.enable(authenticationKey, governmentOfficeKey);
  }
  
  public com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType updateOrganizationAssociations(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.UpdateOrganizationAssociationType[] listOfUpdateOrganizationAssociations) throws java.rmi.RemoteException{
    if (governmentOfficePortType == null)
      _initGovernmentOfficePortTypeProxy();
    return governmentOfficePortType.updateOrganizationAssociations(authenticationKey, listOfUpdateOrganizationAssociations);
  }
  
  
}