package com.fpds.client;

//http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.jst.ws.cxf.doc.user%2Ftasks%2Fcreate_client.html
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import com.fpds.service.AuditInformationType;
import com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType;
import com.fpds.service.GovernmentOfficeType;
import com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GovernmentOffice;
import com.fpdsng.www.FPDS.GovernmentOfficeKeyType;
import com.fpdsng.www.FPDS.GovernmentOfficeLocator;
import com.fpdsng.www.FPDS.GovernmentOfficePortType;
import com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType;
import com.fpdsng.www.FPDS.ParameterType;
import com.fpdsng.www.FPDS.UserAuthenticationKeyType;

public class WsClient {

	/*
	 * public static void main(String[] args){
	 * com.fpds.service.UserAuthenticationKeyType uapass = new
	 * com.fpds.service.UserAuthenticationKeyType();
	 * com.fpds.service.GovernmentOfficeKeyType gspass = new
	 * com.fpds.service.GovernmentOfficeKeyType(); uapass.setUserID("gsacart");
	 * uapass.setPassword("market03!");
	 * uapass.setServiceOriginatorID("gsacart"); gspass.setOfficeID("ZG000");
	 * gspass.setAgencyID("4740"); WsClient.get(uapass, gspass); }
	 */
	public static com.fpds.service.GetGovernmentOfficeResponseType get(
			com.fpds.service.UserAuthenticationKeyType uapass,
			com.fpds.service.GovernmentOfficeKeyType gspass) {
		GovernmentOfficeLocator ws = new GovernmentOfficeLocator();
		UserAuthenticationKeyType ua = new UserAuthenticationKeyType();
		GovernmentOfficeKeyType gs = new GovernmentOfficeKeyType();
		System.out.println("uapass.getUserID() == " + uapass.getUserID());
		System.out.println("uapass.getPassword() == " + uapass.getPassword());
		System.out.println("uapass.getService == "
				+ uapass.getServiceOriginatorID());
		System.out.println("gspass.getOfficeID() == " + gspass.getOfficeID());
		System.out.println("gspass.getAgencyID() == " + gspass.getAgencyID());
		ua.setUserID(uapass.getUserID());
		ua.setPassword(uapass.getPassword());
		ua.setServiceOriginatorID(uapass.getServiceOriginatorID());
		gs.setOfficeID(gspass.getOfficeID());
		gs.setAgencyID(gspass.getAgencyID());
		/*
		 * ua.setUserID("gsacart");; ua.setPassword("market03!");
		 * ua.setServiceOriginatorID("gsacart"); gs.setOfficeID("ZG000");
		 * gs.setAgencyID("4740");
		 */
		com.fpds.service.GetGovernmentOfficeResponseType response = new com.fpds.service.GetGovernmentOfficeResponseType();
		try {
			GetGovernmentOfficeResponseType result = ws
					.getGovernmentOfficePort().get(ua, gs);
			System.out.println("requestNumber = " + result.getRequestNumber());
			System.out.println("confirmation Number = "
					+ result.getConfirmationNumber());
			populatedata(result, response);

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return response;
	}

	private static void populatedata(GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		populaterequestnumber(ggor, response);
		populateconfirmationnumber(ggor, response);
		populatelistofparameters(ggor, response);
		populateoutputmessage(ggor, response);
		populategovtofficetype(ggor, response);

	}

	private static void populaterequestnumber(
			GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		response.requestNumber = ggor.getRequestNumber();
	}

	private static void populateconfirmationnumber(
			GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		System.out.println("requestNumber = " + ggor.getRequestNumber());
		System.out.println("confirmation Number = "
				+ ggor.getConfirmationNumber());
		response.confirmationNumber = ggor.getConfirmationNumber();
	}

	private static void populatelistofparameters(
			GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		// com.fpds.service.ParameterType[] responselistofparameters;
		System.out.println("populatelist of parameters");
		int i = 0;
		if (ggor.getListOfParameters() == null) {
			System.out.println("Is Null");
		} else {
			for (ParameterType each : ggor.getListOfParameters()) {
				com.fpds.service.ParameterType pt = new com.fpds.service.ParameterType();
				System.out.println("param name = " + each.getParameterName());
				System.out.println("param type = " + each.getParameterType());
				System.out.println("param value = " + each.getParameterValue());
				System.out.println("param state = "
						+ each.getRequirementState());
				pt.setParameterName(each.getParameterName());
				pt.setParameterType(each.getParameterType());
				pt.setParameterValue(each.getParameterValue());
				pt.setRequirementState(each.getRequirementState());
				response.listOfParameters[i] = pt;
				i += 1;
			}
		}
	}

	private static void populateoutputmessage(
			GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		System.out.println("populate outputmessage");
		if (ggor.getOutputMessages() == null) {
			System.out.println("Is Null");
		} else {
			com.fpds.service.ErrorType et = new com.fpds.service.ErrorType();
			com.fpds.service.WarningType wt = new com.fpds.service.WarningType();
			com.fpds.service.InfoType it = new com.fpds.service.InfoType();
			com.fpds.service.ErrorType[] listOfErrors = new com.fpds.service.ErrorType[ggor.getOutputMessages().getListOfErrors().length];
			com.fpds.service.WarningType[] listOfWarnings = new com.fpds.service.WarningType[ggor.getOutputMessages().getListOfWarnings().length];
			com.fpds.service.InfoType[] listOfInfoMessages = new com.fpds.service.InfoType[ggor.getOutputMessages().getListOfInfoMessages().length];
			int i = 0;
			System.out.println("Populate error type");
			for (com.fpdsng.www.FPDS.ErrorType etr : ggor.getOutputMessages()
					.getListOfErrors()) {
				et.setElementName(etr.getElementName());
				et.setErrorCode(etr.getErrorCode());
				et.setErrorMessage(etr.getErrorMessage());
				listOfErrors[i] = et;
				i += 1;
			}
			System.out.println("Populate Warning type");
			int j = 0;
			for (com.fpdsng.www.FPDS.WarningType etr : ggor.getOutputMessages()
					.getListOfWarnings()) {
				wt.setElementName(etr.getElementName());
				wt.setWarningCode(etr.getWarningCode());
				wt.setWarningMessage(etr.getWarningCode());
				listOfWarnings[j] = wt;
				j += 1;

			}
			System.out.println("Populate Info type");
			int k = 0;
			for (com.fpdsng.www.FPDS.InfoType itr : ggor.getOutputMessages()
					.getListOfInfoMessages()) {
				it.setElementName(itr.getElementName());
				it.setInfoCode(itr.getInfoCode());
				it.setInfoMessage(itr.getInfoMessage());
				listOfInfoMessages[k] = it;
				k += 1;

			}
			com.fpds.service.OutputMessagesType omt = new com.fpds.service.OutputMessagesType();
			omt.setListOfErrors(listOfErrors);
			omt.setListOfInfoMessages(listOfInfoMessages);
			omt.setListOfWarnings(listOfWarnings);
			response.outputMessages = omt;
			// response.outputMessages.setListOfErrors(listOfErrors);
			// response.outputMessages.setListOfInfoMessages(listOfInfoMessages);
			// response.outputMessages.setListOfWarnings(listOfWarnings);
		}

	}

	private static void populategovtofficetype(
			GetGovernmentOfficeResponseType ggor,
			com.fpds.service.GetGovernmentOfficeResponseType response) {
		System.out.println("populate govt office type");
		System.out.println("Prem = " + response.getGovernmentOffice());
		System.out.println("Prem-1 = " + ggor.getGovernmentOffice());
		if (ggor.getGovernmentOffice() == null) {
			System.out.println("Is Null");
		}else{
		com.fpds.service.GovernmentOfficeType governmentOffice = new com.fpds.service.GovernmentOfficeType();
		governmentOffice.setStreetAddress(ggor.getGovernmentOffice().getStreetAddress());
		
		/*response.getGovernmentOffice().setStreetAddress(
				ggor.getGovernmentOffice().getStreetAddress()==null?"":ggor.getGovernmentOffice().getStreetAddress());*/
		governmentOffice.setStreetAddress2(
				ggor.getGovernmentOffice().getStreetAddress2());
		governmentOffice.setStreetAddress3(
				ggor.getGovernmentOffice().getStreetAddress3());
		governmentOffice.setCity(
				ggor.getGovernmentOffice().getCity());
		governmentOffice.setState(
				ggor.getGovernmentOffice().getState());
		governmentOffice.setProvince(
				ggor.getGovernmentOffice().getProvince());
		governmentOffice.setZIPCode(
				ggor.getGovernmentOffice().getZIPCode());
		governmentOffice.setCountryCode(
				ggor.getGovernmentOffice().getCountryCode());
		governmentOffice.setGovernmentOfficeID(
				ggor.getGovernmentOffice().getGovernmentOfficeID());
		governmentOffice.setOfficeID(
				ggor.getGovernmentOffice().getOfficeID());
		governmentOffice.setAgencyID(
				ggor.getGovernmentOffice().getAgencyID());
		governmentOffice.setOfficeName(
				ggor.getGovernmentOffice().getOfficeName());
		governmentOffice.setAgencyName(
				ggor.getGovernmentOffice().getAgencyName());
		governmentOffice.setRegionCode(
				ggor.getGovernmentOffice().getRegionCode());
		governmentOffice.setParentOrganizationID(
				ggor.getGovernmentOffice().getParentOrganizationID());
		governmentOffice.setParentOrganizationCode(
				ggor.getGovernmentOffice().getParentOrganizationCode());
		governmentOffice.setIsContractingOffice(
				ggor.getGovernmentOffice().getIsContractingOffice());
		governmentOffice.setContractingOfficeID(
				ggor.getGovernmentOffice().getContractingOfficeID());
		governmentOffice.setContractingOfficeStartDate(
				ggor.getGovernmentOffice().getContractingOfficeStartDate());
		governmentOffice.setContractingOfficeEndDate(
				ggor.getGovernmentOffice().getContractingOfficeEndDate());
		governmentOffice.setStartDate(
				ggor.getGovernmentOffice().getStartDate());
		governmentOffice.setEndDate(
				ggor.getGovernmentOffice().getEndDate());
		
		AuditInformationType ait = new AuditInformationType();
		ait.setCreatedBy(
						ggor.getGovernmentOffice().getAuditInformation()
								.getCreatedBy());
	
		ait.setCreatedDate(
						ggor.getGovernmentOffice().getAuditInformation()
								.getCreatedDate());
		
		ait.setLastModifiedBy(
						ggor.getGovernmentOffice().getAuditInformation()
								.getLastModifiedBy());
		ait.setLastModifiedDate(
						ggor.getGovernmentOffice().getAuditInformation()
								.getLastModifiedDate());
		
		
		com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType listOfGovernmentOfficeFunctionalDimensionalValue[] = new com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType[ggor
				.getGovernmentOffice()
				.getListOfGovernmentOfficeFunctionalDimensionalValue().length];
		
		int z = 0;
		for (com.fpdsng.www.FPDS.GovernmentOfficeFunctionalDimensionalValueType gfdvt1 : ggor
				.getGovernmentOffice()
				.getListOfGovernmentOfficeFunctionalDimensionalValue()) {
			GovernmentOfficeFunctionalDimensionalValueType gfdvt = new GovernmentOfficeFunctionalDimensionalValueType();
			gfdvt.setFunctionalDimensionName(gfdvt1
					.getFunctionalDimensionName());
			gfdvt.setFunctionalDimensionValue(gfdvt1
					.getFunctionalDimensionValue());
			gfdvt.setFunctionalDimensionValueID(gfdvt1
					.getFunctionalDimensionValueID());
			listOfGovernmentOfficeFunctionalDimensionalValue[z] = gfdvt;
			z += 1;
		}
		governmentOffice.setAuditInformation(ait);
		governmentOffice.setListOfGovernmentOfficeFunctionalDimensionalValue(listOfGovernmentOfficeFunctionalDimensionalValue);
		response.setGovernmentOffice(governmentOffice);
	}
	}
}