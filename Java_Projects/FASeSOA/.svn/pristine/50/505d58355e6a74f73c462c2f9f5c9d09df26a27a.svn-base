/*
 * @(#)ServicesProperties.java			Sep 12, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.services.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * <code>ServicesProperties</code> provides properties required
 * for Services execution.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public class ServicesProperties implements PropertyConstants{
	
	private static PropertyResourceBundle serviceProps;
	static{
		loadProperties();
	}
	
	public static String getPropertyValue(String key){
		if(serviceProps.getString(key) != null){
			return serviceProps.getString(key).trim();
		}
		return null;
	}
	
	private static void loadProperties(){
		ResourceBundle props = loadProperties(ENTERPRISE_PROPERTIES_FILE);
		loadServiceProperties(props);
	}
	
	private static ResourceBundle loadProperties(String propertyFileName){
		ResourceBundle propBundle = 
			ResourceBundle.getBundle(propertyFileName);
		return propBundle;
	}
	
	private static void loadServiceProperties(ResourceBundle props){
		String servicesFile = props.getString(SERVICES_PROPERTIES_FILE);
		try {
			serviceProps = new PropertyResourceBundle(new FileInputStream(servicesFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

