package com.gsa.gov.rest;

import java.io.*;
import org.apache.commons.fileupload.FileUploadBase;
import java.util.*;
import javax.xml.soap.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemHeaders;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 100)
// 50MB
public class UploadServlet extends HttpServlet {

	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 1000 * 1024 * 1024 * 200;
	private int maxMemSize = 1000 * 1024 * 1024 * 200;
	private File file;

	public void init() {
		// Get the file location where it would be stored.
		filePath = getServletContext().getInitParameter("file-upload");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
		// Check that we have a file upload request
		// org.apache.commons.fileupload.FileUploadBase fu = new
		// org.apache.commons.fileupload.FileUploadBase();
		isMultipart = ServletFileUpload.isMultipartContent(request);
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		if (!isMultipart) {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet upload</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>No file uploaded</p>");
			out.println("</body>");
			out.println("</html>");
			return;
		}
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// maximum size that will be stored in memory
		factory.setSizeThreshold(maxMemSize);
		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File("c:\\temp"));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// maximum file size to be uploaded.
		upload.setSizeMax(maxFileSize);
		InputStream inpstream = null;
		try {
			// Parse the request to get file items.
			List fileItems = upload.parseRequest(request);

			// Process the uploaded file items
			Iterator i = fileItems.iterator();

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet upload</title>");
			out.println("</head>");
			out.println("<body>");
			String fileName = "";
			String username = "";
			String password = "";
			while (i.hasNext()) {
				FileItem fi = (FileItem) i.next();

				if (fi.getFieldName().equals("username")) {
					username = fi.getString();

				}
				if (fi.getFieldName().equals("password")) {
					password = fi.getString();

				}
				if (!fi.isFormField()) {
					// Get the uploaded file parameters

					String fieldName = fi.getFieldName();
					// System.out.println("fieldName = " + fieldName);
					fileName = fi.getName();
					String contentType = fi.getContentType();
					boolean isInMemory = fi.isInMemory();
					long sizeInBytes = fi.getSize();
					// fi.getInputStream()
					// Write the file
					if (fileName.lastIndexOf("\\") >= 0) {
						file = new File(
								filePath
										+ fileName.substring(fileName
												.lastIndexOf("\\")));
					} else {
						file = new File(
								filePath
										+ fileName.substring(fileName
												.lastIndexOf("\\") + 1));
					}
					inpstream = fi.getInputStream();
					Result result;
					result = FileUploadClient.callrestservice(inpstream,
							fileName, username, password);
					System.out.println("result = " + result);
					System.out.println("result = " + result.getStatus());
					System.out.println("result = " + result.getResult());
					// fi.write( file ) ;
					if (result.getResult().equals("SUCCESS")) {
						request.setAttribute("obj", "File Loaded Successfully");
					} else if (result.getResult().equals("INVALID-USER-PASS")) {
						request.setAttribute("obj", "Invalid Username/Password. Contact P3 Team");
					} else if (result.getResult().equals("DUPLICATE-FILENAME")) {
						request.setAttribute("obj", "Duplicate Filename. Try different Filename");	
					} else if (result.getResult().equals("JSCHEXCEPTION")) {
						request.setAttribute("obj", "JSCHException. Contact P3 Team");
					} else if (result.getResult().equals("SFTPEXCEPTION")) {
						request.setAttribute("obj", "SFTPException. Contact P3 Team");
					}
					
					//out.println("Uploaded Filename: " + fileName + "<br>");

					System.out.println("fileName = " + fileName);
					System.out.println("Path = " + filePath);
					// WsClient.uploadmethod(fileName,filePath);
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}
				out.println("</body>");
				out.println("</html>");
				// WsClient ws = new WsClient();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		throw new ServletException("GET method used with "
				+ getClass().getName() + ": POST method required.");
	}

}