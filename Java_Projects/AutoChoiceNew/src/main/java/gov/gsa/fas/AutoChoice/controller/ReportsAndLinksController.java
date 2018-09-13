package gov.gsa.fas.AutoChoice.controller;

//http://javahonk.com/dynamically-generate-pdf-using-servlet/

import java.io.ByteArrayOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.beans.AdminBean;
import gov.gsa.fas.AutoChoice.service.GeneratePDF;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author PremanandPeddachetty
 * 
 */
@Controller
@Scope("request")
public class ReportsAndLinksController {
	@Autowired
	private GeneratePDF gp;

	@RequestMapping(value = "/VehicleAvailiability", method = RequestMethod.GET)
	public void getManageUserAcct(HttpServletResponse response,
			HttpServletRequest request) {
		final ServletContext servletContext = request.getSession()
				.getServletContext();
		final File tempDirectory = (File) servletContext
				.getAttribute("javax.servlet.context.tempdir");
		final String temperotyFilePath = tempDirectory.getAbsolutePath();

		String fileName = "Generate_Report_" + System.currentTimeMillis()
				+ ".pdf";
		response.setContentType("application/pdf");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "max-age=0");
		response.setHeader("Content-disposition", "attachment; " + "filename="
				+ fileName);

		try {
			gp.createPdf(temperotyFilePath + "\\" + fileName);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos = convertPDFToByteArrayOutputStream(temperotyFilePath + "\\"
					+ fileName);
			OutputStream os = response.getOutputStream();
			baos.writeTo(os);
			os.flush();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	private static ByteArrayOutputStream convertPDFToByteArrayOutputStream(
			String fileName) {

		InputStream inputStream = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {

			inputStream = new FileInputStream(fileName);

			byte[] buffer = new byte[1024];
			baos = new ByteArrayOutputStream();

			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return baos;
	}
	
	@RequestMapping(value = "/mvdo", method = RequestMethod.GET)
	public String getmvdoreports(HttpServletResponse response,
			HttpServletRequest request){
		setHeaders(response);
		this.orderStatusBean.setReturnMessage("");
		this.orderStatusBean.setPrivilege(getLoginBean().getCurrentUser().getPrivilege());
		model.addAttribute("commonBean", getCommonBean());
		model.addAttribute("orderStatusBean", this.orderStatusBean);
		return "mvdo";
		
	}

}
