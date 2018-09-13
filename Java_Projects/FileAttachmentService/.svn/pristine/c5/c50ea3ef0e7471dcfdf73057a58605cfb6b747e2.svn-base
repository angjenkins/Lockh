package com.gsa.gov.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;


import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;

public class FileUploadClient {
	public static Result callrestservice(InputStream uploadedInputStream,
			String filename, String username, String password) {
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/RESTFileAttachmentService/rest/file/upload");
		/*
		 * String fileName = "C:/Myong/Myong.txt"; InputStream fileInStream =
		 * null; try { fileInStream = new FileInputStream(fileName); } catch
		 * (FileNotFoundException e) {
		 * System.out.println("File not found exception"); // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("Webservice is being called = " + fileInStream);
		 */
		FormDataMultiPart form = new FormDataMultiPart();
		form.field("username", username);
		form.field("password", password);
		form.field("filename", filename);
		FormDataBodyPart fdp = new FormDataBodyPart("filecontent",
				uploadedInputStream, MediaType.APPLICATION_OCTET_STREAM_TYPE);
		form.bodyPart(fdp);
		String response = webResource.type(MediaType.MULTIPART_FORM_DATA).post(
				String.class, form);
		System.out.println("Webservice call over = " + response);
		Gson gson = new Gson();

		Result result = gson.fromJson(response, Result.class);
		return result;
	}
}
