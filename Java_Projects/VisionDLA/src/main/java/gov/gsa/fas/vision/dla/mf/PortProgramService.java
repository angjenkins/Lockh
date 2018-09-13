/*
 * @(#)PortProgramService.java			Aug 20, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.mf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.apache.log4j.Logger;

/**
 * <code>PortProgramService</code> is the Service which uses the socket interface to Mainframe Port Programs.
 * 
 * F I N D A N D S E N D D A T A
 * 
 * this procedure controls the logic for the following functions:
 * 
 * CAF this function reads the CAF file and returns the data. NAF this function
 * reads the NAF file and returns the data. DOC this function reads the URHF and
 * CRHF file and returns data. ZKP this function reads the URHF file and returns
 * data. ORDER this function reads the URHF and CRHF file and returns order
 * information. PRI999 this function reads the NAF file and returns price info.
 * the 999 is the number of items to be priced. for 3 items the input file looks
 * like this: PRI0036230-00-163-1856 6230-00-299-3035 6230-00-643-3486 | || | |
 * | || | |---item # 3 | || |--- item # 2 | ||--- item # 1 | | | |--- 3 items to
 * be priced | |--- the prefix PRI calls the PRICING procedure
 * 
 * this record can be formated without the dashas, for example:
 * PRI0036230001631856 6230002993035 6230006433486
 * 
 * for now, this java support only one price PRI001
 * 
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
class PortProgramService {
	private static Logger logger = Logger.getLogger(PortProgramService.class);

	private static int MAXBUFF = 1000;

	private int port;
	private String ipAddress;
	
	PortProgramService(String hostIp, int port){
		this.ipAddress = hostIp;
		this.port = port;
	}

	// static int NXPORT = Integer.parseInt(AppConfig.PORT_PROGRAM_PORT);
	// static String IP = AppConfig.PORT_PROGRAM_IP;

	public String getRecord(String table, String key) {

		String r = null;

		if (table.length() > 6)
			table = table.substring(0, 6);

		table = table.trim();
		table = table.toUpperCase();
		key = key.toUpperCase();

		if (table.length() < 3)
			throw new UnsupportedOperationException("Invalid table code. Expected length<3, but received ["+table+"]");

		if (table.length() == 3) {
			if (!table.equals("CAF") && !table.equals("NAF") && !table.equals("DOC") && !table.equals("ZKP"))
				throw new UnsupportedOperationException("Unsupported table code. Received ["+table+"]");
			table = table.concat("   ");
		} else if (table.length() == 5) {
			if (!table.equals("ORDER"))
				throw new UnsupportedOperationException("Invalid table code. Received ["+table+"]");
			table = table.concat(" ");
		} else if (!table.equals("PRI001"))
			throw new UnsupportedOperationException("Unsupported table code. Received ["+table+"]");

		table = table.concat(key);

		Socket s = null;
		try {
			//int x = 0;
			char xx[] = new char[MAXBUFF];

			s = new Socket(this.ipAddress, this.port);
			int lsize = 0;

			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(), "8859_1"));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			out.write(table, 0, table.length());
			out.flush();

			//x = 
			in.read(xx, 0, MAXBUFF);

			r = new String(xx);

			for (int j = r.length() - 1; j > 2; j--) {
				if (xx[j] != '@') {
					lsize = j;
					j = 0;
				}
			}

			if (lsize > 0)
				r = r.substring(0, lsize);

			in.close();
			out.close();
			s.close();

			return r;
		} catch (Exception e) {
			throw new RuntimeException("Error during Socket Connection to "+this.ipAddress+":"+this.port, e);
		} finally {
			try {
				s.close();
			} catch (Exception e) {
				logger.warn("Error when trying to close Socket Connection to "+this.ipAddress+":"+this.port,e);
			}
		}
	}
	
}
