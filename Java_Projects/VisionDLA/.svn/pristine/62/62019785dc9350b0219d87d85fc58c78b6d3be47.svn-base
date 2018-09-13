/*
 * @(#)OrderDiscrepancyOutcomeTest.java			Sep 9, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.services.discrepancyoutcome.v1;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.gsa.fas.discrepancyoutcome.v1.AdjustedQuantity;
import gov.gsa.fas.discrepancyoutcome.v1.Attachment;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessAttachmentRequest;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessResponse;

/**
 * <code>OrderDiscrepancyOutcomeTest</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class OrderDiscrepancyOutcomeTest {

	private OrderDiscrepancyOutcome orderDiscrepancyOutcome;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String pattern = "%-5p %c - %m%n";
		BasicConfigurator.configure(new ConsoleAppender(
				new PatternLayout(pattern)));			
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String wsdlPath = "http://127.0.0.1:8080/dla.services/OrderDiscrepancyOutcome?wsdl";
		String serviceName = "OrderDiscrepancyOutcomeImplService";
		URL wsdlUrl = new URL(wsdlPath);
		QName serviceQName = new QName(
				"http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", serviceName);
		Service service = Service.create(wsdlUrl, serviceQName);
		orderDiscrepancyOutcome = service.getPort(OrderDiscrepancyOutcome.class);		
	}
	
	@Test
	public void testResponse(){
		gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome  discrOutcome = createOrderDiscrepancyOutcome();
		ProcessResponse resp = null;
		try {
			resp = orderDiscrepancyOutcome.processDiscrepancyOutcome(discrOutcome);
		} catch (ServiceFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(resp != null){
			System.out.println("Response Success->" + resp.isSuccessful());
			System.out.println("DLA Key->" + resp.getVisionDlaKey());
		}
	}

	@Test
	public void testResponseAttachment() {
		String respAttName = "Test1.txt";
		String respFilePath= "C:/Project/VissDLA2013/Attachments/";
		try {
			ProcessAttachmentRequest attReq = new ProcessAttachmentRequest();
			attReq.setVisionDlaKey(10010);
			attReq.setWebSDRNumber("TestWSDR");
			Attachment att = new Attachment();
			att.setDocumentName(respAttName);
			byte[] attDoc = getAttachment(respFilePath + respAttName);
			byte[] encodePlanDoc = Base64.encodeBase64(attDoc);
			att.setDocument(encodePlanDoc);
			attReq.setAttachment(att);
			ProcessResponse resp = orderDiscrepancyOutcome.processAttachment(attReq);
			if(resp != null){
				System.out.println("Response Success->" + resp.isSuccessful());
				System.out.println("DLA Key->" + resp.getVisionDlaKey());
			}
		} catch (ServiceFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private byte[] getAttachment(String respFilePath){
		InputStream input = null;
		try {
			input = new FileInputStream(respFilePath);
			// return IOUtils.toByteArray(in);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024 * 4];
			long count = 0;
			int n = 0;
			while (-1 != (n = input.read(buffer))) {
				output.write(buffer, 0, n);
				count += n;
			}
			if (count > Integer.MAX_VALUE) {
				System.out.println("Count reached max value");
			}

			return output.toByteArray();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;		
	}
	
	private gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome  createOrderDiscrepancyOutcome(){
		gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome  discrOutcome = new gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome ();
		discrOutcome.setVisionDlaKey(10010);
		discrOutcome.setWebSDRNumber("TestWEBSDR");
		discrOutcome.setTransactionSetPurposeCode("00");
		discrOutcome.getDiscrepancyCode().add("899");
		discrOutcome.getDispositionCode().add("AB");
		discrOutcome.setActionCode("7");
		discrOutcome.setComments("The Case is closed");
		discrOutcome.setAttachmentCount(0);
		discrOutcome.setStatus("REJECTED");
//		List<String> attList = discrOutcome.getAttachmentName();
//		attList.add("Test1.pdf");
//		attList.add("Test2.pdf");
		AdjustedQuantity adjQty = new AdjustedQuantity();
		adjQty.setQuantity("27");
		adjQty.setUnitCode("EA");
		adjQty.setUnitPrice("10.06");
//		discrOutcome.setAdjustedQuantity(adjQty);
		return discrOutcome;
	}

}
