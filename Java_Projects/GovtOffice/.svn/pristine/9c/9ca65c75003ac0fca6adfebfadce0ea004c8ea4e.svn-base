package com.fpds.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.fpds.getlist.CountType;
import com.fpds.getlist.GetListGovernmentOfficeResponseType;
import com.fpds.getlist.GovernmentOfficeType;
import com.fpds.getlist.ListOfGovernmentOfficesType;
import com.fpds.getlist.UserAuthenticationKeyType;
import com.fpds.getlist.AuditInformationType;
import com.fpds.getlist.GovernmentOfficeFunctionalDimensionalValueType;
import com.fpds.getlist.GovernmentOfficeSearchCriteriaType;
import com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType;
import com.fpdsng.www.FPDS.GovernmentOfficeKeyType;
import com.fpdsng.www.FPDS.GovernmentOfficeLocator;
import com.fpdsng.www.FPDS.ParameterType;

public class WsClientgetlist {

	public static com.fpdsng.www.FPDS.UserAuthenticationKeyType setuserpass(
			com.fpds.getlist.UserAuthenticationKeyType uapass) {
		com.fpdsng.www.FPDS.UserAuthenticationKeyType ua = new com.fpdsng.www.FPDS.UserAuthenticationKeyType();
		System.out.println("uapass.getUserID() == " + uapass.getUserID());
		System.out.println("uapass.getPassword() == " + uapass.getPassword());
		System.out.println("uapass.getService == "
				+ uapass.getServiceOriginatorID());
		ua.setUserID(uapass.getUserID());
		ua.setPassword(uapass.getPassword());
		ua.setServiceOriginatorID(uapass.getServiceOriginatorID());
		return ua;
	}

	// public com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType getList(
	// com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey,
	// com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType
	// governmentOfficeSearchCriteria)
	// throws java.rmi.RemoteException;

	public static GetListGovernmentOfficeResponseType getlist(
			com.fpds.getlist.UserAuthenticationKeyType uapass,
			com.fpds.getlist.GovernmentOfficeSearchCriteriaType gspass) {
		com.fpdsng.www.FPDS.GovernmentOfficeLocator ws = new com.fpdsng.www.FPDS.GovernmentOfficeLocator();
		com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType gs = new com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType();
		com.fpdsng.www.FPDS.UserAuthenticationKeyType ua = setuserpass(uapass);

		// GovernmentOfficeKeyType gs = new GovernmentOfficeKeyType();
		// gs.setOfficeID(gspass.getOfficeID());
		// gs.setAgencyID(gspass.getAgencyID());

		/*
		 * ua.setUserID("gsacart");; ua.setPassword("market03!");
		 * ua.setServiceOriginatorID("gsacart"); gs.setOfficeID("ZG000");
		 * gs.setAgencyID("4740");
		 */
		gs.setAgencyID(gspass.getAgencyID());
		gs.setOfficeID(gspass.getOfficeID());
		gs.setAgencyName(gspass.getAgencyName());
		gs.setRegionCode(gspass.getRegionCode());
		gs.setParentOrganizationID(gspass.getParentOrganizationID());
		gs.setParentOrganizationCode(gspass.getParentOrganizationCode());
		gs.setIsContractingOffice(gspass.getIsContractingOffice());
		gs.setStatus(gspass.getStatus());
		gs.setCity(gspass.getCity());
		gs.setState(gspass.getState());
		gs.setZIPCode(gspass.getZIPCode());
		gs.setCountryCode(gspass.getCountryCode());
		gs.setStartDate(gspass.getStartDate());
		gs.setEndDate(gspass.getEndDate());
		gs.setFunctionalDimensionName(gspass.getFunctionalDimensionName());
		gs.setFunctionalDimensionValue(gspass.getFunctionalDimensionValue());
		
		
		GetListGovernmentOfficeResponseType response = new GetListGovernmentOfficeResponseType();
		try {
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result = ws
					.getGovernmentOfficePort().getList(ua, gs);
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
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		populaterequestnumber(result, response);
		populateconfirmationnumber(result, response);
		populatelistofparameters(result, response);
		populateoutputmessage(result, response);
		populategovtoffice(result, response);

	}

	private static void populategovtoffice(
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		System.out.println("populate govt office");
		ListOfGovernmentOfficesType listOfGovernmentOffices = new ListOfGovernmentOfficesType();
		int i = 0;

		// com.fpds.getlist.ErrorType[] listOfErrors = new
		// com.fpds.getlist.ErrorType[result
		// .getOutputMessages().getListOfErrors().length];

		if (result.getListOfGovernmentOffices().getCount() == null) {
			System.out.println("Count Is Null");
		} else {
			CountType count = new CountType();
			count.setFetched(result.getListOfGovernmentOffices().getCount()
					.getFetched());
			count.setTotal(result.getListOfGovernmentOffices().getCount()
					.getTotal());
			listOfGovernmentOffices.setCount(count);
		}
		System.out.println("result = " +  result.getListOfGovernmentOffices());
		System.out.println("len = " + result
			                              .getListOfGovernmentOffices().getGovernmentOffice());
		if (result.getListOfGovernmentOffices() == null || result.getListOfGovernmentOffices().getGovernmentOffice() == null) {
			System.out.println("Govt Office Is Null");
		} else {
			com.fpds.getlist.GovernmentOfficeType[] governmentOfficeTypes = new com.fpds.getlist.GovernmentOfficeType[result
			                                                                                          				.getListOfGovernmentOffices().getGovernmentOffice().length];

			for (com.fpdsng.www.FPDS.GovernmentOfficeType res : result
					.getListOfGovernmentOffices().getGovernmentOffice()) {

				com.fpds.getlist.GovernmentOfficeType governmentOffice = new com.fpds.getlist.GovernmentOfficeType();

				governmentOffice.setStreetAddress(res.getStreetAddress());
				governmentOffice.setStreetAddress2(res.getStreetAddress2());
				governmentOffice.setStreetAddress3(res.getStreetAddress3());
				governmentOffice.setCity(res.getCity());
				governmentOffice.setState(res.getState());
				governmentOffice.setProvince(res.getProvince());
				governmentOffice.setZIPCode(res.getZIPCode());
				governmentOffice.setCountryCode(res.getCountryCode());
				governmentOffice.setGovernmentOfficeID(res
						.getGovernmentOfficeID());
				governmentOffice.setOfficeID(res.getOfficeID());
				governmentOffice.setAgencyID(res.getAgencyID());
				governmentOffice.setOfficeName(res.getOfficeName());
				governmentOffice.setAgencyName(res.getAgencyName());
				governmentOffice.setRegionCode(res.getRegionCode());
				governmentOffice.setParentOrganizationID(res
						.getParentOrganizationID());
				governmentOffice.setParentOrganizationCode(res
						.getParentOrganizationCode());
				governmentOffice.setIsContractingOffice(res
						.getIsContractingOffice());
				governmentOffice.setContractingOfficeID(res
						.getContractingOfficeID());
				governmentOffice.setContractingOfficeStartDate(res
						.getContractingOfficeStartDate());
				governmentOffice.setContractingOfficeEndDate(res
						.getContractingOfficeEndDate());
				governmentOffice.setStartDate(res.getStartDate());
				governmentOffice.setEndDate(res.getEndDate());

				AuditInformationType ait = new AuditInformationType();
				ait.setCreatedBy(res.getAuditInformation().getCreatedBy());

				ait.setCreatedDate(res.getAuditInformation().getCreatedDate());

				ait.setLastModifiedBy(res.getAuditInformation()
						.getLastModifiedBy());
				ait.setLastModifiedDate(res.getAuditInformation()
						.getLastModifiedDate());

				if (res.getListOfGovernmentOfficeFunctionalDimensionalValue() != null) {
					com.fpds.getlist.GovernmentOfficeFunctionalDimensionalValueType listOfGovernmentOfficeFunctionalDimensionalValue[] = new com.fpds.getlist.GovernmentOfficeFunctionalDimensionalValueType[res
							.getListOfGovernmentOfficeFunctionalDimensionalValue().length];

					int z = 0;
					for (com.fpdsng.www.FPDS.GovernmentOfficeFunctionalDimensionalValueType gfdvt1 : res
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
					governmentOffice
							.setListOfGovernmentOfficeFunctionalDimensionalValue(listOfGovernmentOfficeFunctionalDimensionalValue);
				}

				governmentOfficeTypes[i] = governmentOffice;
				i += 1;

				// response.setGovernmentOffice(governmentOffice);
			}
			listOfGovernmentOffices.setGovernmentOffice(governmentOfficeTypes);
		}
		response.setListOfGovernmentOffices(listOfGovernmentOffices);
	}

	private static void populaterequestnumber(
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		response.requestNumber = result.getRequestNumber();
	}

	private static void populateconfirmationnumber(
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		System.out.println("requestNumber = " + result.getRequestNumber());
		System.out.println("confirmation Number = "
				+ result.getConfirmationNumber());
		response.confirmationNumber = result.getConfirmationNumber();
	}

	private static void populatelistofparameters(
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		// com.fpds.getlist.ParameterType[] responselistofparameters;
		System.out.println("populatelist of parameters");
		int i = 0;
		if (result.getListOfParameters() == null) {
			System.out.println("Is Null");
		} else {
			for (ParameterType each : result.getListOfParameters()) {
				com.fpds.getlist.ParameterType pt = new com.fpds.getlist.ParameterType();
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
			com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType result,
			com.fpds.getlist.GetListGovernmentOfficeResponseType response) {
		System.out.println("populate outputmessage");
		if (result.getOutputMessages() == null) {
			System.out.println("Is Null");
		} else {
			com.fpds.getlist.ErrorType et = new com.fpds.getlist.ErrorType();
			com.fpds.getlist.WarningType wt = new com.fpds.getlist.WarningType();
			com.fpds.getlist.InfoType it = new com.fpds.getlist.InfoType();
			com.fpds.getlist.ErrorType[] listOfErrors = new com.fpds.getlist.ErrorType[result
					.getOutputMessages().getListOfErrors().length];
			com.fpds.getlist.WarningType[] listOfWarnings = new com.fpds.getlist.WarningType[result
					.getOutputMessages().getListOfWarnings().length];
			com.fpds.getlist.InfoType[] listOfInfoMessages = new com.fpds.getlist.InfoType[result
					.getOutputMessages().getListOfInfoMessages().length];
			int i = 0;
			System.out.println("Populate error type");
			for (com.fpdsng.www.FPDS.ErrorType etr : result.getOutputMessages()
					.getListOfErrors()) {
				et.setElementName(etr.getElementName());
				et.setErrorCode(etr.getErrorCode());
				et.setErrorMessage(etr.getErrorMessage());
				listOfErrors[i] = et;
				i += 1;
			}

			int j = 0;
			for (com.fpdsng.www.FPDS.WarningType etr : result
					.getOutputMessages().getListOfWarnings()) {
				wt.setElementName(etr.getElementName());
				wt.setWarningCode(etr.getWarningCode());
				wt.setWarningMessage(etr.getWarningCode());
				listOfWarnings[j] = wt;
				j += 1;

			}

			int k = 0;
			for (com.fpdsng.www.FPDS.InfoType itr : result.getOutputMessages()
					.getListOfInfoMessages()) {
				it.setElementName(itr.getElementName());
				it.setInfoCode(itr.getInfoCode());
				it.setInfoMessage(itr.getInfoMessage());
				listOfInfoMessages[k] = it;
				k += 1;

			}
			com.fpds.getlist.OutputMessagesType omt = new com.fpds.getlist.OutputMessagesType();
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
