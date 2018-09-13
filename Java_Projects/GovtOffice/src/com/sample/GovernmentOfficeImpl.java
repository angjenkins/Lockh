package com.sample;

import java.rmi.RemoteException;

import javax.jws.WebService;

import com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GovernmentOfficeKeyType;
import com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType;
import com.fpdsng.www.FPDS.GovernmentOfficeType;
import com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.UpdateOrganizationAssociationType;
import com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType;
import com.fpdsng.www.FPDS.UserAuthenticationKeyType;

@WebService(endpointInterface = "com.sample.GovernmentOffice", serviceName = "GovtOffice")
public class GovernmentOfficeImpl implements GovernmentOffice{

	@Override
	public GetGovernmentOfficeResponseType get(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) {
		GetGovernmentOfficeResponseType ggor = new GetGovernmentOfficeResponseType();
		// TODO Auto-generated method stub
		return ggor;
	}
/*
	@Override
	public CreateGovernmentOfficeResponseType create(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeType governmentOffice) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateGovernmentOfficeResponseType createContractingOffice(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeType governmentOffice) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateGovernmentOfficeResponseType update(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeType governmentOffice) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetGovernmentOfficeResponseType get(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetListGovernmentOfficeResponseType getList(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExistsGovernmentOfficeResponseType exists(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteGovernmentOfficeResponseType delete(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisableGovernmentOfficeResponseType disable(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnableGovernmentOfficeResponseType enable(
			UserAuthenticationKeyType authenticationKey,
			GovernmentOfficeKeyType governmentOfficeKey) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateOrganizationAssociationsResponseType updateOrganizationAssociations(
			UserAuthenticationKeyType authenticationKey,
			UpdateOrganizationAssociationType[] listOfUpdateOrganizationAssociations)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}*/

}
