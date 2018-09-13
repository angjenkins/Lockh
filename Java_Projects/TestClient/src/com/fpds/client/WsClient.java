package com.fpds.client;
//http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.jst.ws.cxf.doc.user%2Ftasks%2Fcreate_client.html
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GovernmentOffice;
import com.fpdsng.www.FPDS.GovernmentOfficeKeyType;
import com.fpdsng.www.FPDS.GovernmentOfficeLocator;
import com.fpdsng.www.FPDS.GovernmentOfficePortType;
import com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType;
import com.fpdsng.www.FPDS.UserAuthenticationKeyType;

public class WsClient{
	
	public static void main(String[] args) {
		//WsClient ws = new WsClient();
		GovernmentOfficeLocator ws = new GovernmentOfficeLocator();
		//ws.getGovernmentOfficePort()
		//System.out.println(ws.getServiceName());
		//System.out.println(ws.getWSDLDocumentLocation().getPath());
		//ws.getGovernmentOfficePort(new URL("https://www.fpds.gov/FPDS/BusinessServices/DataCollection/organizations/1.2/GovernmentOffice"));
		System.out.println("Prem");
		UserAuthenticationKeyType ua = new UserAuthenticationKeyType();
		ua.setUserID("gsacart");
		ua.setPassword("market03!");
		ua.setServiceOriginatorID("gsacart");
		//GovernmentOfficeSearchCriteriaType gs = new GovernmentOfficeSearchCriteriaType();
		GovernmentOfficeKeyType gs = new GovernmentOfficeKeyType();
		gs.setOfficeID("ZG000");
		gs.setAgencyID("4740");
		try {
			System.out.println(ua.getUserID());
			System.out.println(gs.getOfficeID());
			
			GetGovernmentOfficeResponseType res = ws.getGovernmentOfficePort().get(ua,gs);
			System.out.println(res.getConfirmationNumber());
			System.out.println(res.getGovernmentOffice().getCity());
			//GetGovernmentOfficeResponseType res = ws.getGovernmentOfficePort(new URL("https://www.fpds.gov/FPDS/BusinessServices/DataCollection/organizations/1.2/GovernmentOffice")).get(ua, gs);
			
			System.out.println("Call over");
			//res.getListOfGovernmentOffices().getGovernmentOffice(0);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Call createCall() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Call createCall(QName arg0) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Call createCall(QName arg0, QName arg1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Call createCall(QName arg0, String arg1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Call[] getCalls(QName arg0) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HandlerRegistry getHandlerRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Remote getPort(Class arg0) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Remote getPort(QName arg0, Class arg1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator getPorts() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QName getServiceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeMappingRegistry getTypeMappingRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getWSDLDocumentLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGovernmentOfficePortAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GovernmentOfficePortType getGovernmentOfficePort()
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GovernmentOfficePortType getGovernmentOfficePort(URL portAddress)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
