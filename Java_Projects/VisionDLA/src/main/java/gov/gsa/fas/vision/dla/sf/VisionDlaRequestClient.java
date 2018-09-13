/*
 * @(#)VisionDlaRequestClient.java			Aug 16, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sf;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.VisionDlaException;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;
import gov.gsa.fas.vision.dla.request.WsdrRequestData;
import gov.gsa.fas.vision.dla.sf.caserequest.DLAAttachment;
import gov.gsa.fas.vision.dla.sf.caserequest.DLARequest;
import gov.gsa.fas.vision.dla.sf.caserequest.DLAResponse;
import gov.gsa.fas.vision.dla.sf.caserequest.NCSCDLAServicePortType;
import gov.gsa.fas.vision.dla.sf.caserequest.NCSCDLAServiceService;
import gov.gsa.fas.vision.dla.sf.login.InvalidIdFault_Exception;
import gov.gsa.fas.vision.dla.sf.login.LoginFault_Exception;
import gov.gsa.fas.vision.dla.sf.login.LoginResult;
import gov.gsa.fas.vision.dla.sf.login.SforceService;
import gov.gsa.fas.vision.dla.sf.login.Soap;
import gov.gsa.fas.vision.dla.sf.login.UnexpectedErrorFault_Exception;


/**
 * <code>VisionDlaRequestClient</code> invokes SalesForce service operations.
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaRequestClient {
	
	private static final Logger logger = Logger.getLogger(VisionDlaRequestClient.class.getName());

	private static String SF_PROVIDER_ENDPOINT_ADDRESS = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_SF_PROVIDER_ENDPOINT);
	private static String SF_DLASERVICE_ENDPOINT_ADDRESS = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_SF_DLASERVICE_ENDPOINT);
	private static String SF_USER_NAME=
			VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_SF_USERNAME);
	private static String SF_USER_PASSWORD=
			VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_SF_PASSWORD);
	private static String SF_SECURITY_TOKEN = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.VISIONDLA_SF_SECURITY_TOKEN);
	
	private static final String PARTNER_WSDL_LOCATION = "wsdl/salesforce/NCSC-Partner.wsdl";
	private static final String DLASERVICE_WSDL_LOCATION = "wsdl/salesforce/NCSC-DLAService.wsdl";
	
	private String sfServerUrl;
	private String sfSessionId;
	
	private QName dlaServiceQName;
	
	private NCSCDLAServicePortType dlaServicePort;
	
	/**
	 * Invokes Salesforce Partner service login operation and
	 * returns the session Id.
	 * 
	 * @return
	 * @throws VisionDlaException
	 */
	 public void login() throws VisionDlaException{
		URL partnerWsdlUrl = SforceService.class.getClassLoader().getResource(PARTNER_WSDL_LOCATION);
//		debugSalesforceConnectivity(partnerWsdlUrl);
		QName sforceQname = new SforceService().getServiceName();
		SforceService sforceService = new SforceService(partnerWsdlUrl, sforceQname);
		Soap soapObj = sforceService.getSoap();
		BindingProvider provider = (BindingProvider) soapObj;
		provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SF_PROVIDER_ENDPOINT_ADDRESS);		
		LoginResult loginResult = null;
		try {
			loginResult = soapObj.login(SF_USER_NAME, SF_USER_PASSWORD + SF_SECURITY_TOKEN);
			logger.info("login():Session Id->" + loginResult.getSessionId());
			setSfSessionId(loginResult.getSessionId());
			setSfServerUrl(loginResult.getServerUrl());
		} catch (InvalidIdFault_Exception e) {
			logger.error("login(): Login failed", e);
			throw new VisionDlaException("Salesforce login failed-Invalid Id", e);
		} catch (LoginFault_Exception e) {
			logger.error("login(): Login failed", e);
			throw new VisionDlaException("Salesforce login failed-Login Fault", e);
		} catch (UnexpectedErrorFault_Exception e) {
			logger.error("login(): Login failed", e);
			throw new VisionDlaException("Salesforce login failed-Unexpected Error", e);
		}
	}
	 

	public DLAResponse postRequestDetails(WsdrRequestData wsdrData) throws VisionDlaException{
		logger.info("postRequestDetails(): Sending WSDR request datails to Salesforce" +
				"-VisionDlaKey->" + wsdrData.getVisionDlaId());
		dlaServicePort = getSFDlaServicePort();
		//Sending request data
		DLARequest dlaReq = WsdrSalesforceTransformation.transformRequestData(wsdrData);
		DLAResponse dlaResp = dlaServicePort.processWSDR(dlaReq);
		if(dlaResp != null){
			logger.info("postRequestDetails(): DLA Response Status -> " +dlaResp.getStatus());
			logger.info("postRequestDetails(): DLA Response No success->" + dlaResp.getSuccessCount());
		}
		return dlaResp;
	}
	 
	public DLAResponse postRequestAttachment(WsdrRequestData wsdrData, 
			String fileName, byte[] attContent) throws VisionDlaException{
		dlaServicePort = getSFDlaServicePort();
		DLAAttachment attachmentRequest = WsdrSalesforceTransformation.
				trasformRequestAttachment(wsdrData, fileName, attContent);
		DLAResponse dlaResp = dlaServicePort.processAttachment(attachmentRequest);
		if(dlaResp != null){
			logger.info("postRequestAttachment(): DLA Response Status -> " +dlaResp.getStatus());
			logger.info("postRequestAttachment(): DLA Response No success->" + dlaResp.getSuccessCount());
		}
		return dlaResp;
	}
	
	/**
	 * @return the sfServerUrl
	 */
	public String getSfServerUrl() {
		return sfServerUrl;
	}

	/**
	 * @return the sfSessionId
	 */
	public String getSfSessionId() {
		return sfSessionId;
	}

	/**
	 * @param serverUrl
	 */
	private void setSfServerUrl(String serverUrl) {
		this.sfServerUrl = serverUrl;
	}

	/**
	 * @param sessionId
	 */
	private void setSfSessionId(String sessionId) {
		this.sfSessionId = sessionId;
	}
	
	private NCSCDLAServicePortType getSFDlaServicePort(){
		if(dlaServicePort != null){
			return dlaServicePort;
		}
		URL dlaServiceWsdlUrl = NCSCDLAServiceService.class.getClassLoader().getResource(DLASERVICE_WSDL_LOCATION);
		dlaServiceQName = new NCSCDLAServiceService().getServiceName();
		NCSCDLAServiceService dlaService = new NCSCDLAServiceService(dlaServiceWsdlUrl, dlaServiceQName);
		dlaServicePort = dlaService.getNCSCDLAService();
		BindingProvider bindingProvider = (BindingProvider)dlaServicePort;
		logger.info("postRequestDetails(): Server Url ->" + getSfServerUrl());
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				SF_DLASERVICE_ENDPOINT_ADDRESS);
		//To add SessionHeader using handler chain
		List<Handler> handlerChain = new ArrayList<Handler>();
		handlerChain.add(new SessionHeaderHandler());
		bindingProvider.getBinding().setHandlerChain(handlerChain);
		return dlaServicePort;
	}
	
//	void debugSalesforceConnectivity(URL wsdlUrl){
//		logger.info("WSDL URL->" + wsdlUrl.toString());
//		logger.info("Salesforce Endpoint Address->" + SF_PROVIDER_ENDPOINT_ADDRESS);
//		logger.info("Salesforce User Name->" + SF_USER_NAME);
//		logger.info("Salesforce Password->" + SF_USER_PASSWORD);
//		logger.info("Salesfroce Security token->" + SF_SECURITY_TOKEN);
//	}
	
	private class SessionHeaderHandler implements SOAPHandler<SOAPMessageContext>{

		/* (non-Javadoc)
		 * @see javax.xml.ws.handler.Handler#handleMessage(javax.xml.ws.handler.MessageContext)
		 */
		@Override
		public boolean handleMessage(SOAPMessageContext context) {
	    Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
	    if (outboundProperty.booleanValue()) {
	    	try {
					SOAPHeader soapHeader = context.getMessage().getSOAPPart().getEnvelope().getHeader();
					if(soapHeader == null) soapHeader = context.getMessage().getSOAPPart().getEnvelope().addHeader();
					QName sessionHeader = new QName(dlaServiceQName.getNamespaceURI(), "SessionHeader", "ncs");
					QName sessionId = new QName(dlaServiceQName.getNamespaceURI(), "sessionId", "ncs");
          SOAPHeaderElement sessionHeaderElement = soapHeader.addHeaderElement(sessionHeader);
          SOAPElement sessionIdElement = sessionHeaderElement.addChildElement(sessionId);
          sessionIdElement.addTextNode(getSfSessionId());
					//Prints the message
					context.getMessage().writeTo(System.out);
					System.out.println();
				} catch (SOAPException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	    }
	    return true;
		}

		@Override
		public boolean handleFault(SOAPMessageContext context) {
			return false;
		}
		@Override
		public void close(MessageContext context) {
			
		}
		@Override
		public Set<QName> getHeaders() {
			return null;
		}
	}
}
