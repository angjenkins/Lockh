/*
 * @(#)LogHandler.java			Jul 19, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.order.v1.wdc.dao;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * <code>LogHandler</code> is the JAX-WS handler
 * providing logging SOAP debugging information.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see javax.xml.ws.handler.soap.SOAPHandler<SOAPMessageContext>   
 */

public class LogHandler implements SOAPHandler<SOAPMessageContext>{

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
    Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
    if (outboundProperty.booleanValue()) {
        SOAPMessage message = context.getMessage();
     	 try {
				printSOAPMessage(message, "Before Calling FSS-19");
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
    return outboundProperty;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	/**
	 * Prints SOAP message String for debug purpose.
	 * 
	 * @param 	message
	 * @param 	ctxt
	 * @throws 	SOAPException
	 * @throws 	IOException
	 */
	private void printSOAPMessage(SOAPMessage message, String ctxt) 
				throws SOAPException, IOException{
		System.out.println(ctxt);
		message.writeTo(System.out);
		System.out.println("");		
	}
}
