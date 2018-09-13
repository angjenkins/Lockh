/*
 * @(#)VisionDlaConfig.java			Aug 3, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.PropertyResourceBundle;

/**
 * <code>VisionDlaConfig</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class VisionDlaConfig implements ConfigConstants{
	
	private static PropertyResourceBundle dlaProps;
	
	static{
		loadProperties();
//		loadDlaProps();
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getPropertyValue(String key){
		if(dlaProps.getString(key) != null){
			return dlaProps.getString(key).trim();
		}
		return null;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static int getPropertyNumericValue(String key){
		if(dlaProps.getString(key) != null){
			String numStr =  dlaProps.getString(key).trim();
			return Integer.parseInt(numStr);
		}
		return -1;
	}	
	
	/**
	 * 
	 */
	private static void loadProperties(){
		InputStream appPropsStream = VisionDlaConfig.class.getClassLoader().getResourceAsStream(APP_PROPERTIES_FILE);
		Properties appProps = new Properties();
		try {
			appProps.load(appPropsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String serviceFile = appProps.getProperty(DLA_PROPERTIES_FILE);
		System.out.println("Service File location->" + serviceFile);
		loadDlaProperties(serviceFile);
//		ResourceBundle props = loadProperties(APP_PROPERTIES_FILE);
//		loadDlaProperties(props);
	}
	
	/**
	 * 
	 * @param propertyFileName
	 * @return
	 */
//	private static String loadProperties(String propertyFileName){
//		ResourceBundle propBundle = 
//			ResourceBundle.getBundle(propertyFileName);
//		String servicesFile = propBundle.getString(DLA_PROPERTIES_FILE);
//		return servicesFile;
//	}
	
	/**
	 * 
	 * @param props
	 */
	private static void loadDlaProperties(String serviceFile){
		try {
			dlaProps = new PropertyResourceBundle(new FileInputStream(serviceFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	// For local loading only
//	private static void loadDlaProps(){
//		try {
//			dlaProps = new PropertyResourceBundle(new FileInputStream("C:\\Svn\\VisionDLA\\resources\\config\\visiondla.properties"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
//	}
}
