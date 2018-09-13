package gov.gsa.fas.AutoChoice.util;


import java.io.*;
import java.net.*;
public class PortFile {
	  static  int NXPORT =  8000;
//      static  String IP = "159.142.4.3";  // *ERH * 12/2/2011
//      static  String IP = "159.142.4.2";  // *Tom * 12/2/2011
	  static  String IP = "clearpathinternal.fas.gsa.gov";  // 736 DR-Roads replace hardcode IPD on validation CAF file 
//	  static  String IP = "gsac0.fas.gsa.gov";
	  static  Socket  s = null;
	  static  int MAXBUFF = 1000;


	  String x = null;

	 public String getRecord(String table, String key)  {
	  String r = null;
	  Socket s = null;
	  int x= 0;
	  char xx [] ;
	  xx = new char [MAXBUFF];
//System.out.println("PortFile: 159.142.4.2");
	  if (table.length() > 6)
	    table = table.substring(0,6);

	  table = table.trim();
	  table = table.toUpperCase();
	  key = key.toUpperCase();

	  if (table.length() < 3)
	     return "-1Invalid table code";

	  if (table.length() == 3)
	  {
	    if (!table.equals("CAF") && !table.equals("NAF") && !table.equals("DOC") &&
		!table.equals("ZKP"))
	        return "-1Invalid table code";
	    table = table.concat("   ");
	  }
	  else if(table.length() == 5)
	  {
	    if (!table.equals("ORDER"))
	        return "-1Invalid table code";
	    table = table.concat(" ");
	  }
	  else  if(!table.equals("PRI001"))
	    return "-1Invalid table code";

	  table = table.concat(key);

	  try {
	    s = new Socket(IP, NXPORT);
	    int lsize=0;

	    BufferedReader in = new BufferedReader
	      (new InputStreamReader(s.getInputStream(), "8859_1"));
	    BufferedWriter out = new BufferedWriter
	      (new OutputStreamWriter(s.getOutputStream()));

//System.out.println("PortFile OutputStreamWriter: " + out);

	    out.write(table, 0, table.length());
	    out.flush();

	    x = in.read(xx, 0, MAXBUFF);

	    r = new String (xx);

	    for (int j = r.length() -1; j > 2 ; j--)
	    {
	        if (xx[j] != '@')
	        {
	           lsize = j;
	           j = 0;
	        }
	    }

	    if (lsize > 0)
	      r = r.substring (0, lsize);

	    in.close();
	    out.close();
	    s.close();
	    return r;
	    }
	  catch (Exception e) {
	    e.printStackTrace();
	    return "ERR";
	    }
	  finally {
		try {
		    s.close();
		}
		  catch (Exception e) {
		    e.printStackTrace();
		    return "Error when trying to close socket";
		    }
	     }
	  }
	}

