package com.fpds.service;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.log4j.Logger;

import com.fpds.client.WsClientexists;
import com.fpds.client.WsClientget;
import com.fpds.client.WsClientgetlist;
import com.fpds.getlist.GetListGovernmentOfficeResponseType;

@WebService(endpointInterface = "com.fpds.service.GovtOffice", serviceName = "GovtOffice",
targetNamespace="http://fas.gsa.gov/GovtOffice/service")
public class GovtOfficeImpl implements GovtOffice{
	final static Logger logger = Logger.getLogger(GovtOfficeImpl.class);
	@Override
	public GetGovernmentOfficeResponseType get(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : ");
		}
 
		if(logger.isInfoEnabled()){
			logger.info("This is info : ");
		}
 

		System.out.println("Service being called");
		GetGovernmentOfficeResponseType gs = WsClientget.get(authenticationKey, governmentOfficeKey);
		System.out.println("Service call over");
		return gs;
	}
	@Override
	public com.fpds.exists.ExistsGovernmentOfficeResponseType exists(
			com.fpds.exists.UserAuthenticationKeyTypeExists authenticationKey,
			com.fpds.exists.GovernmentOfficeKeyTypeExists governmentOfficeKey) throws RemoteException {
		com.fpds.exists.ExistsGovernmentOfficeResponseType eg = WsClientexists.get(authenticationKey, governmentOfficeKey);
		// TODO Auto-generated method stub
		return eg;
	}
	
	@Override
	public GetListGovernmentOfficeResponseType getList(
			com.fpds.getlist.UserAuthenticationKeyType authenticationKey,
			com.fpds.getlist.GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria)
			throws RemoteException {
		// TODO Auto-generated method stub
		com.fpds.getlist.GetListGovernmentOfficeResponseType eg = WsClientgetlist.getlist(authenticationKey, governmentOfficeSearchCriteria);
		return eg;
	}


    
}
