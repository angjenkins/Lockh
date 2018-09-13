package com.fpds.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.fpds.exists.ExistsGovernmentOfficeResponseType;
import com.fpds.exists.GovernmentOfficeKeyTypeExists;
import com.fpds.exists.UserAuthenticationKeyTypeExists;
import com.fpds.service.AuditInformationType;
import com.fpds.service.GovernmentOfficeFunctionalDimensionalValueType;
import com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GovernmentOfficeKeyType;
import com.fpdsng.www.FPDS.GovernmentOfficeLocator;
import com.fpdsng.www.FPDS.ParameterType;
import com.fpdsng.www.FPDS.UserAuthenticationKeyType;

public class WsClientexists {

	public static UserAuthenticationKeyType setuserpass(
			com.fpds.exists.UserAuthenticationKeyTypeExists uapass) {
		UserAuthenticationKeyType ua = new UserAuthenticationKeyType();
		System.out.println("uapass.getUserID() == " + uapass.getUserID());
		System.out.println("uapass.getPassword() == " + uapass.getPassword());
		System.out.println("uapass.getService == "
				+ uapass.getServiceOriginatorID());
		ua.setUserID(uapass.getUserID());
		ua.setPassword(uapass.getPassword());
		ua.setServiceOriginatorID(uapass.getServiceOriginatorID());
		return ua;
	}

	public static ExistsGovernmentOfficeResponseType get(
			com.fpds.exists.UserAuthenticationKeyTypeExists uapass,
			com.fpds.exists.GovernmentOfficeKeyTypeExists gspass) {
		GovernmentOfficeLocator ws = new GovernmentOfficeLocator();
		UserAuthenticationKeyType ua = setuserpass(uapass);

		GovernmentOfficeKeyType gs = new GovernmentOfficeKeyType();
		gs.setOfficeID(gspass.getOfficeID());
		gs.setAgencyID(gspass.getAgencyID());

		/*
		 * ua.setUserID("gsacart");; ua.setPassword("market03!");
		 * ua.setServiceOriginatorID("gsacart"); gs.setOfficeID("ZG000");
		 * gs.setAgencyID("4740");
		 */
		com.fpds.exists.ExistsGovernmentOfficeResponseType response = new com.fpds.exists.ExistsGovernmentOfficeResponseType();
		try {
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType result = ws
					.getGovernmentOfficePort().exists(ua, gs);
			System.out.println("requestNumber = " + result.getRequestNumber());
			System.out.println("confirmation Number = "
					+ result.getConfirmationNumber());
			populatedataforget(result, response);

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return response;
	}

	private static void populatedataforget(
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType result,
			com.fpds.exists.ExistsGovernmentOfficeResponseType response) {
		populaterequestnumber(result, response);
		populateconfirmationnumber(result, response);
		populatelistofparameters(result, response);
		populateoutputmessage(result, response);
		// populategovtofficetype(result, response);

	}

	private static void populaterequestnumber(
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType ggor,
			com.fpds.exists.ExistsGovernmentOfficeResponseType response) {
		response.requestNumber = ggor.getRequestNumber();
		response.setIsExists(ggor.getIsExists());
	}

	private static void populateconfirmationnumber(
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType ggor,
			com.fpds.exists.ExistsGovernmentOfficeResponseType response) {
		System.out.println("requestNumber = " + ggor.getRequestNumber());
		System.out.println("confirmation Number = "
				+ ggor.getConfirmationNumber());
		response.confirmationNumber = ggor.getConfirmationNumber();
	}

	private static void populatelistofparameters(
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType ggor,
			com.fpds.exists.ExistsGovernmentOfficeResponseType response) {
		// com.fpds.service.ParameterType[] responselistofparameters;
		System.out.println("populatelist of parameters");
		int i = 0;
		if (ggor.getListOfParameters() == null) {
			System.out.println("Is Null");
		} else {
			for (ParameterType each : ggor.getListOfParameters()) {
				com.fpds.exists.ParameterTypeExists pt = new com.fpds.exists.ParameterTypeExists();
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
			com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType ggor,
			com.fpds.exists.ExistsGovernmentOfficeResponseType response) {
		System.out.println("populate outputmessage");
		if (ggor.getOutputMessages() == null) {
			System.out.println("Is Null");
		} else {
			com.fpds.service.ErrorType et = new com.fpds.service.ErrorType();
			com.fpds.service.WarningType wt = new com.fpds.service.WarningType();
			com.fpds.service.InfoType it = new com.fpds.service.InfoType();
			com.fpds.service.ErrorType[] listOfErrors = new com.fpds.service.ErrorType[ggor
					.getOutputMessages().getListOfErrors().length];
			com.fpds.service.WarningType[] listOfWarnings = new com.fpds.service.WarningType[ggor
					.getOutputMessages().getListOfWarnings().length];
			com.fpds.service.InfoType[] listOfInfoMessages = new com.fpds.service.InfoType[ggor
					.getOutputMessages().getListOfInfoMessages().length];
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

			int j = 0;
			for (com.fpdsng.www.FPDS.WarningType etr : ggor.getOutputMessages()
					.getListOfWarnings()) {
				wt.setElementName(etr.getElementName());
				wt.setWarningCode(etr.getWarningCode());
				wt.setWarningMessage(etr.getWarningCode());
				listOfWarnings[j] = wt;
				j += 1;

			}

			int k = 0;
			for (com.fpdsng.www.FPDS.InfoType itr : ggor.getOutputMessages()
					.getListOfInfoMessages()) {
				it.setElementName(itr.getElementName());
				it.setInfoCode(itr.getInfoCode());
				it.setInfoMessage(itr.getInfoMessage());
				listOfInfoMessages[k] = it;
				k += 1;

			}
			com.fpds.exists.OutputMessagesTypeExists omt = new com.fpds.exists.OutputMessagesTypeExists();
			omt.setListOfErrors(listOfErrors);
			omt.setListOfInfoMessages(listOfInfoMessages);
			omt.setListOfWarnings(listOfWarnings);
			response.outputMessages = omt;
			// response.outputMessages.setListOfErrors(listOfErrors);
			// response.outputMessages.setListOfInfoMessages(listOfInfoMessages);
			// response.outputMessages.setListOfWarnings(listOfWarnings);
		}

	}

}
