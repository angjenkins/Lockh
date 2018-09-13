package com.gsa.gov.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

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

public class PremClient {
	public static void main(String[] args) throws JSONException, JsonSyntaxException, UniformInterfaceException, ClientHandlerException {
		Client client = Client.create();
		WebResource webResource = client
				//.resource("http://localhost:8080/RESTFileAttachmentService/rest/file/upload");
				//.resource("http://fcoh1m-cws02t.fas.gsa.gov:52501/attachment.restservices/rest/file/upload");
				.resource("http://fcoh3m-soa03.fas.gsa.gov:52401/attachment.restservices/rest/file/upload");
		InputStream fileInStream = null;
		//String fileName = "C:/Myong/Myong.txt";
		String fileName = "C:/EDW/DoD_20141216_Computers.csv";
		try {
			fileInStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FormDataMultiPart form = new FormDataMultiPart();
		form.field("username", "p3xferdt");
		form.field("password", "92mnGg1Cb14D9hVhG1W5fZra4UI=");
		form.field("filename", "DoD_20141216_Computers.csv");
		FormDataBodyPart fdp = new FormDataBodyPart("filecontent",
				fileInStream, MediaType.APPLICATION_OCTET_STREAM_TYPE);
		form.bodyPart(fdp);
		System.out.println("Started");
		String response = webResource.type(MediaType.MULTIPART_FORM_DATA).post(
				String.class, form);
		System.out.println("Webservice call over = " + response);
		JSONObject jso = new JSONObject(response);
		System.out.println(jso);
		Gson gson = new Gson();
		//String json = gson.toJson(response);*/
		Result result = gson.fromJson(response,Result.class);
		System.out.println(result.getClass());
		System.out.println(result);
		//Result result = null;
		//return result;
	}
}
