package com.gsa.gov.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import sun.misc.BASE64Encoder;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

public class PremClientSample {
	public static void main(String[] args) throws JSONException,
			JsonSyntaxException, UniformInterfaceException,
			ClientHandlerException {
		Client client = Client.create();
		WebResource webResource = client
				.resource("https://extcws.fas.gsa.gov:443/soatest/RESTFileAttachmentService/P3FileIngestAPIREST/RESTFileIngestAPI/UploadService");
		/*
		 * String fileName = "C:/Myong/Myong.txt"; InputStream fileInStream =
		 * null; try { fileInStream = new FileInputStream(fileName); } catch
		 * (FileNotFoundException e) {
		 * System.out.println("File not found exception"); // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("Webservice is being called = " + fileInStream);
		 */
		InputStream fileInStream = null;
		String fileName = "C:/EDW_NEW/20130101_20150501_20150426_ITS_EDW-pppifver-Standard-8-0-0-0-1.csv";
		try {
			fileInStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String authString = "p3xferdt" + ":" + "uA8b@op4#";
		String authStringEnc = new BASE64Encoder()
				.encode(authString.getBytes());
		// form.field("username", username);
		// form.field("password", password);
		// form.field("filename", filename);
		FormDataMultiPart form = new FormDataMultiPart();

		// form.field("name","prem.txt");
		// form.field("filename","20130101_20150501_20150426_ITS_EDW-pppifver-Standard-8-0-0-0-1.csv");
		// form.field("filename","20130101_20150501_20150426_ITS_EDW-pppifver-Standard-8-0-0-0-1.csv");
		// form.field("name",fileInStream);
		// FormDataBodyPart fdp = new FormDataBodyPart(
		// fileInStream, MediaType.APPLICATION_OCTET_STREAM_TYPE);
		// form.bodyPart(fdp);
		final File fileToUpload = new File("C:/EDW/Simple.txt");
		final FormDataMultiPart multiPart = new FormDataMultiPart();
		multiPart.bodyPart(new FileDataBodyPart("file", fileToUpload,
				MediaType.APPLICATION_OCTET_STREAM_TYPE));

		ClientResponse response = webResource.type(
                MediaType.MULTIPART_FORM_DATA_TYPE).header("Authorization", "Basic " + authStringEnc).post(ClientResponse.class,
                multiPart);
		if (response.getStatus() == 200){
				System.out.println("Webservice call over = " + response.getStatus());
		}
		System.out.println("Webservice call over-1 = " + response.getStatus());
		System.out.println("Webservice call over-2 = " + response.getStatus());
		System.out.println("Webservice call over = " + response.getEntity(String.class));
		// Gson gson = new Gson();

		// Result result = gson.fromJson(response, Result.class);

	}
}
