
package gov.gsa.fas.AutoChoice.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.channels.FileChannel;
import java.sql.Timestamp;
import java.text.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;



public class UtilsLib 
{
    
    public static boolean compareDates(final Timestamp ts1,final Timestamp ts2){
    	Calendar calA = Calendar.getInstance();
    	Calendar calB = Calendar.getInstance();
    	calA.setTimeInMillis(ts1.getTime());
    	calB.setTimeInMillis(ts2.getTime());
    	if(calA.get(Calendar.DAY_OF_YEAR) != calB.get(Calendar.DAY_OF_YEAR))
    		return false;
    	else
    		return true;
    }
    /**
     * return formatted Timestamp as String from the given format.
     * @param ts
     * @return
     */
    		
    public static String getFormattedTS(final String format,final Timestamp ts){
    	SimpleDateFormat dateFormat = new SimpleDateFormat(format);
    	if (ts ==null){
    		return "";
    	}
    	else{
    		return dateFormat.format(ts);
    	}
    }
  
    
    /**
     * Get the current timestamp.
     * @return
     */
    public static Timestamp getCurrentTS(){
    	
    	Date today = new Date();
    	return new Timestamp(today.getTime());
    }
    
//    //  Getting the current datetime as String.
//	public static String getCurrentTimeStampStr(){
//
//		Date today;
//		String output;
//		SimpleDateFormat formatter;
//
//		formatter = new SimpleDateFormat("yyyyMMddHHmmss00");
//		today = new Date();
//		output = formatter.format(today);
//
//		return output;
//	}
//	
//	modified by hiren for timestamp -- 08/13/07
//Get timestamp from Calendar parameter
    public static Timestamp getTimeStamp(GregorianCalendar gregCal){
//		Date dateCal;
//		String output;
//		SimpleDateFormat formatter;
//
//		formatter = new SimpleDateFormat("yyyyMMddHHmmss00");
//		dateCal = gregCal.getTime();
//		output = formatter.format(dateCal);
//		
//		return Double.parseDouble(output);
    	return new Timestamp(gregCal.getTimeInMillis());
	}
    
//  Get timestamp from Calendar parameter in JReportFormat
    public static String getTimeStampJR(GregorianCalendar gregCal){
		Date dateCal;
		String output;
		SimpleDateFormat formatter;

		formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateCal = gregCal.getTime();
		output = formatter.format(dateCal);

		return output;
	}
    
    public static Calendar getCalendarForTS(final Timestamp ts){
    	Calendar cal = Calendar.getInstance();    	
    	cal.setTimeInMillis(ts.getTime());
    	return cal;
    }
    public static String formatDate(final Timestamp ts){
    	if(ts != null){
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    	return format.format(ts).toString();
    	}
    	else{
    		return "00/00/0000";
    	}
    }
    //This function formats the date from the Database(yyyymmdd double format)
	//to mm/dd/yy  String for display
    public static String formatDate(double date){
    	String convString = "";
    	String tempString = "";

    	tempString = "" + date;

    	if (tempString.equals("0.0")){
    		convString = "00/00/0000";
    	}
    	else{
    		//In cases of dates such as 05/20/2005, the database value gets stored as 2.005052E13
    		//hence the 0 in 20 gets truncated. The following if clause takes care of that situation
    		if (tempString.charAt(8) == 'E') {
    			convString = tempString.substring(5,7)+ "/" + tempString.substring(7,8) + "0/" +  tempString.substring(0,1) + tempString.substring(2,5);
    		}
    		else {
    			convString = tempString.substring(5,7)+ "/" + tempString.substring(7,9) + "/" +  tempString.substring(0,1) + tempString.substring(2,5);
    		}
    	}
    	return convString;
    }

	//This function formats the date from the yyyymmdd string format
	//to mm/dd/yy  String for display
    public static String formatDate(String date){
    	String convString = "";

    	if (date.equals("0.0") || "".equals(date)){
    		convString = "00/00/0000";
    	}
   		else {
    		convString = date.substring(4,6)+ "/" + date.substring(6,8) + "/" +  date.substring(0,4);
      	}
    	return convString;
    }

	//This function formats the date from the Database(yyyymmdd double format)
	//to CCYYMMDD  String for comparison
    public static String formatDateCCYYMMDD(double date){
    	String convString = "";
    	String tempString = "";

    	tempString = "" + date;

    	if (tempString.equals("0.0")){
    		convString = "00000000";
    	}
    	else{
    		//In cases of dates such as 05/20/2005, the database value gets stored as 2.005052E13
    		//hence the 0 in 20 gets truncated. The following if clause takes care of that situation
    		if (tempString.charAt(8) == 'E') {
    			convString = tempString.substring(0,1) + tempString.substring(2,5) + tempString.substring(5,7) + tempString.substring(7,8)+"0";
    		}
    		else {
    			convString =  tempString.substring(0,1) + tempString.substring(2,5) + tempString.substring(5,7) + tempString.substring(7,9);
    		}
    	}
    	return convString;
    }

	//This function formats the date from the Database(yyyymmdd double format)
	//to mm/dd/yy HH:MM:ss.000 String for display
//    public static String formatDateTimeStamp(double date){
//    	String convString = "";
//    	String tempString = "";
//
//    	tempString = "" + date;
//
//    	try{
//    	if (tempString.equals("0.0")){
//    		convString = "00/00/0000 00:00:00.000";
//    	}
//    	else{
//    		//In cases of dates such as 05/20/2005, the database value gets stored as 2.005052E13
//    		//hence the 0 in 20 gets truncated. The following if clause takes care of that situation
//    		if (tempString.charAt(8) == 'E') {
//    			convString = tempString.substring(5,7)+ "/" + tempString.substring(7,8) + "0/" +  tempString.substring(0,1) + tempString.substring(2,5) + " 00:00:00.000";
//    		}
//    		else
//    		if ((tempString.charAt(9) == 'E') || (tempString.charAt(11) == 'E') || (tempString.charAt(12) == 'E') || (tempString.charAt(13) == 'E') || (tempString.charAt(14) == 'E')) {
//    			convString = tempString.substring(5,7)+ "/" + tempString.substring(7,9) + "/" +  tempString.substring(0,1) + tempString.substring(2,5) + " 00:00:00.000";
//    		}
//    		else {
//    			convString = tempString.substring(5,7)+ "/" + tempString.substring(7,9) + "/" +  tempString.substring(0,1) + tempString.substring(2,5)  + " " + tempString.substring(9,11) + ":" + tempString.substring(11,13) + ":" + tempString.substring(13,15)+ ".000";
//    		}
//    	}
//    	}
//    	catch (Exception e){
//    		System.out.println("*** ROADS error while formatting date : " + date + " " + e.getMessage());
//    		convString = "00/00/0000 00:00:00.000";
//    	}
//    	return convString;
//    }

	//This function formats the date from the Database(yyyymmdd double format)
	//to yyyy-mm-dd HH:MM:ss String for  - JReport accepts this format
    public static String formatDateTimeStampJR(double date){
    	String convString = "";
    	String tempString = "";

    	tempString = "" + date;

    	if (tempString.equals("0.0")){
    		convString = "0000-00-00 00:00:00";
    	}
    	else{
    		//In cases of dates such as 05/20/2005, the database value gets stored as 2.005052E13
    		//hence the 0 in 20 gets truncated. The following if clause takes care of that situation
    		if (tempString.charAt(8) == 'E') {
    			convString = tempString.substring(0,1) + tempString.substring(2,5) + "-" + tempString.substring(5,7) + "0-" +  tempString.substring(7,8) + tempString.substring(2,5) + " 00:00:00";
    		}
    		else
    		if (tempString.charAt(9) == 'E') {
    			convString = tempString.substring(0,1) + tempString.substring(2,5) + "-" + tempString.substring(5,7) + "-" +  tempString.substring(7,9) + tempString.substring(2,5) + " 00:00:00";    			
    		}
    		else {
    			convString = tempString.substring(0,1) + tempString.substring(2,5) + "-" + tempString.substring(5,7)+ "-" + tempString.substring(7,9) +  " " + tempString.substring(9,11) + ":" + tempString.substring(11,13) + ":" + tempString.substring(13,15);    			
    		}
    	}
    	return convString;
    }
    public static Timestamp formatStringToTimestamp(String inDate){
    	Timestamp outTimestamp = null;
    	if(inDate != null){
    		Date tmpOutDate;
    		try {
    			tmpOutDate = DateFormat.getDateInstance(DateFormat.SHORT).parse(inDate);
    			outTimestamp = new Timestamp(tmpOutDate.getTime());			
    			return outTimestamp;
    		} 
    		catch (ParseException e) {
    			return null;
    		}
    	}
    	else{
    		return null;
    	}
    }

    public static Timestamp getCurrentTimeStamp(){
		Date today = new Date();
		 Timestamp timeStamp = new Timestamp(today.getTime());
		 try {  
		       String currentDate;
			   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			   currentDate = dateFormat.format(new Date());
		       Date date = dateFormat.parse(currentDate );
			   timeStamp = new Timestamp(date.getTime());
			   } catch (ParseException e)
			   {System.out.println("Exception :"+e); 
			   }  
		
//			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd hh:mm:ss");
//			String currentDate = dateFormat.format(now);
		 
		
		return timeStamp;
	}
    //This function formats the date from the yyyy-MM-dd String formate to Database yyyymmdd double format.
    // This function mainly used in Import Vin process
    public static double unformatDate(String date) throws ParseException
    {
        // Create a date formatter that can parse dates of
        // the form MM-dd-yyyy.
        SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Create a date formatter that can parse dates of
        // the form yyyyMMddHHmmss for updating in database.
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss00");
        // Parse the text version of the date.
        // We have to perform the parse method in a
        // try-catch construct in case dateStringToParse
        // does not contain a date in the format we are expecting.
        Date dbdate = bartDateFormat.parse(date);
        String output = formatter.format(dbdate);

        // Return the parsed date as a double value
        // System.out.println(output);
        return Double.parseDouble(output);
    }

    /* using a calendar to add a certain number of days to
    to another date
    */
    public static Date addDays(Date aDate, int nDays)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        cal.add(Calendar.DATE, nDays);
        return cal.getTime();
    }

    //This function accepts a double value and returns a string
    //in Currency format
    public static String formatCurrency(double amt) {

    	String currString = "";

    	NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
    	currString = n.format(amt);

    	return currString;

    }

    // format Standard Item to NNNA
    public static String formatStdItem(String a)
    {
        if ("".equals(a))
            return "    ";

        StringBuffer b = new StringBuffer(a);
        char c = b.charAt(b.length() - 1);

   //     Commented out to not to have last character as Blank space. ( DGS)
 //       if (Character.isDigit(c))
 //           b.insert(b.length(), " ");
        int len = 0;
        if (Character.isDigit(c))
        	len = (3 - b.length());
        else
        	len = (4 - b.length());
        
        //       for (int i = 0; i < len; i++)
        //           b.insert(i, " ");
        while (len > 0)
        {
            b.insert(0, " ");
            len--;
        }

        return b.toString();
    }

    public static String inValidChar(String str) {
   	 String valid="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/-";
   	 int len = str.length();
  	     for (int i=0; i < len; i++) {
		  if (valid.indexOf(str.substring(i,i+1)) <0 )
	 	  {
	 		 return "'Error' : Invalid character ==> " + str.substring(i,i+1);
	 	  }
	   }
  	     return str;
    }
    
    public static boolean compareDates(String dateFrom , String dateTo ) {
   	 Double dbFrom = new Double(dateFrom);
   	 Double dbTo = new Double(dateTo);
   	 if(dbFrom.doubleValue() > dbTo.doubleValue())
   		 return true;
   	 else
   		 return false;
    }
    
	public static boolean isValidDate(String aDate, String fromFormat)
    {
    	try{
    		if(aDate.length() != fromFormat.length()){
    			return false;
    		}
    		String aDate1 = aDate.replace("/", "").replace("-","");
    		if(UtilsLib.findMatch("\\D",aDate1)){
    			return false;
    		}
    		
    		SimpleDateFormat sf = new SimpleDateFormat(fromFormat);
    		sf.setLenient(false);
        	Date dt = sf.parse(aDate);
    	}
    	catch(Exception e){
    		//System.out.println("EXCEPTION: "+e);
    		return false;
    	}
    	return true;
    }
	
	// Use this function after applying RoadsUtils.isValidDate("","") function.
	public static String getFormatDate(String dt, String fromDtFmt , String toDtFmt) throws ParseException{
		 SimpleDateFormat formatter = new SimpleDateFormat(fromDtFmt);
		 Date dt1 = formatter.parse(dt);
		 return (new SimpleDateFormat(toDtFmt).format(dt1));		 
	}
	
	public static boolean isNumeric(String input, String type) throws Exception{
		boolean returnValue = true;
		try{
			int intDummy = 0;
			double doubleDummy = 0.0;
			if(type.trim().equalsIgnoreCase("INT")){
				intDummy = Integer.parseInt(input);
			}
			else if(type.trim().equalsIgnoreCase("DOUBLE")){
				doubleDummy = Double.parseDouble(input);
			}
			else{
				returnValue = false;
			}
		}
		catch(Exception ex){
			returnValue = false;
		}
		return returnValue;
	}
	
    
	/**
	 * I return a String of numberOf chars (c).
	 * @param c
	 * @param numberOf
	 * @return String
	 */
	public static String repeat(char c, int numberOf) {
		if (numberOf > 0) {
			StringBuffer sb = new StringBuffer(c);
			for (int i=0; i < numberOf; i++) {
				sb.append(c);
			}
			return sb.toString();
		} else {
			return "";
		}
	}

	/**
	 * I return a String consisting of str repeated numberOf times.
	 * @param str
	 * @param numberOf
	 * @return String
	 */
	public static String repeat(String str, int numberOf) {
		if (numberOf > 0) {
			StringBuffer sb = new StringBuffer(str);
			for (int i=1; i < numberOf; i++) {
				sb.append(str);
			}
			return sb.toString();
		} else {
			return "";
		}
	}



	/**
	 * I return a blank Spaces.
	 * @param xnumber
     * @param xformat e.g. ####  or ###,###.00 etc.
	 * return String
	 */


	 public static String getDecimalFormat( double xnumber,String xformat) {
    	 NumberFormat form = new DecimalFormat(xformat);
    	 return form.format(xnumber);
    }



	/**
	 * I return a blank Spaces.
	 * @param numberOf
	 * @return String
	 */
	public static String Space(int numberOf) {
		StringBuffer sb = new StringBuffer("");
		if (numberOf > 0) {
			for (int i=0; i < numberOf; i++) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}



	 /**
	 * I return a yyyyMMddHHmmss.
	 * @param xdate,xformat
	 * @return String
	 */

	//  converting any input date e.g. mm/dd/yyyy  to yyyyMMddHHmmss.
    // xformat will be the date format from the input field
    public static String convertStrToDate(String xdate,String xformat) throws ParseException  {
		String output = "";
		SimpleDateFormat formatter;
		String toFormat = "yyyy-mm-dd HH:mm:ss";

		Date dt = new SimpleDateFormat(xformat).parse(xdate);
		formatter = new SimpleDateFormat(toFormat);
		output = formatter.format(dt);
		return output;
	}

  
    public static boolean findMatch(String pattern, String pswd){
		Pattern pat = Pattern.compile(pattern);
		Matcher match = pat.matcher(pswd);
    	return match.find();
    }
    	

 
    public static String getDateFormat(String xformat,Timestamp xdate){
    	String output = "";
		if (xdate != null) {
				output = getFormattedTS(xformat, xdate);
		}
		else{
			Date today;
			SimpleDateFormat formatter;
			formatter = new SimpleDateFormat(xformat);
			today = new Date();
			output = formatter.format(today);
		}
    	return output;
    }
	public static String getDateFormat(String xformat,double xdate){
		String output = "";
		if (xdate == 0) {
			Date today;
			SimpleDateFormat formatter;
			formatter = new SimpleDateFormat(xformat);
			today = new Date();
			output = formatter.format(today);
			
			
		}
		else{
			
			String tempString = "";
			tempString = "" + xdate;
			
			//In cases of dates such as 05/20/2005, the database value gets stored as 2.005052E13
			//hence the 0 in 20 gets truncated. The following if clause takes care of that situation
			
			
			if (xformat.equals("MMddyy")) {
				if (tempString.charAt(8) == 'E') {
					output= tempString.substring(5,7)+  tempString.substring(7,8) + "0" +   tempString.substring(3,5);
				}
				else {
					output = tempString.substring(5,7)+ tempString.substring(7,9) +  tempString.substring(3,5);
				}
			}
			else {
				if (xformat.equals("yyMMdd")) {
					
					if (tempString.charAt(8) == 'E') {
						output=  tempString.substring(3,5) + tempString.substring(5,7)+  tempString.substring(7,8) + "0" ;
					}
					else {
						output =  tempString.substring(3,5)+ tempString.substring(5,7)+ tempString.substring(7,9);
					}
				}
				
				else { 
					if (xformat.equals("MM-dd-yyyy")) {
						if (tempString.charAt(8) == 'E') {
							output= tempString.substring(5,7)+ "-"+ tempString.substring(7,8) + "0" + "-"+  tempString.substring(0,1) + tempString.substring(2,5);
						}
						else {
							output = tempString.substring(5,7)+"-"+ tempString.substring(7,9) + "-" + tempString.substring(0,1) + tempString.substring(2,5);
							
						}
					}
					
				}
			}
		}
		
		return output;
		
	}
	//this method used in fleet trasmittal tao to round 4 decimal total price to 2 decimal price
	public static final double roundDouble(double d, int places) {
        return Math.round(d * Math.pow(10, (double) places)) / Math.pow(10,
            (double) places);
    }
	 public static String buildSQLINParameters(String[] arrSQLParams){
			String output = "";
			int i = 0;
			while (i++ < arrSQLParams.length) {
				output += "?, ";
			}
			output = output.substring(0, output.length() - 2) + ")";
			return output;
	 }
	 
	 public static String stringPadding(String input, int size) {
		 if (input == null)
		 {
			 input = "";
		 }
		 StringBuffer sbInput = new StringBuffer(input);
		 while (sbInput.length() < size) 
			 sbInput.append(' ');
		 return sbInput.toString();
	 }

	 public static String stringPaddingZero(String input, int size) {
		 if (input == null)
		 {
			 input = "";
		 }
		 StringBuffer sbInput = new StringBuffer(input);
		 sbInput.reverse();
		 while (sbInput.length() < size){ 
			 sbInput.append('0');
		 }	 
		 sbInput.reverse();
		 return sbInput.toString();
	 }

	 public static List<String> getHolidayList(final String strHolidays){		
		 	List<String> aHolidayList = new ArrayList<String>();
			String[] temp = strHolidays.split(",");
			aHolidayList = Arrays.asList(temp);
			return aHolidayList;
		}	 
	 public static void copyFile(File in, File out) 
	 throws IOException, Exception 
	 {
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			System.out.println("IN File Path :: " +  in.getAbsolutePath());
			System.out.println("OUT File Path :: " +  out.getAbsolutePath());
			inChannel = new FileInputStream(in).getChannel();
			outChannel = new FileOutputStream(out).getChannel();
			inChannel.transferTo(0, inChannel.size(), outChannel);
		 } 
		 catch (IOException e) {
			 System.out.println("ROADS Exception from RoadsUtils copyFile :: IOException ::" + e.getMessage());
			 throw e;
		 }
		 catch (Exception ex) {
			 System.out.println("ROADS Exception from RoadsUtils copyFile :: Exception ::" + ex.getMessage());
			 throw ex;
		 }
		 finally {
			 if (inChannel != null) inChannel.close();
			 if (outChannel != null) outChannel.close();
		 }
	 }


	private static String getCurrentTime()
    {
        //format time to display on log file
        Date now = new Date();
        SimpleDateFormat timeformatter = new SimpleDateFormat("HH:mm:ss");
        return timeformatter.format(now);
    }

	public static String validateRequestObject(HttpServletRequest reqObj) 
    {
    	Pattern validationPattern = Pattern.compile("[<>|]");
    	Matcher validationMatcher = null;
    	String invalidChar = "";
    	
    	
    	if (reqObj != null){
        	Enumeration enumParams = reqObj.getParameterNames();
        	String paramName = "";
        	String reqParam = "";
        	while(enumParams.hasMoreElements()){
    	        paramName = (String)enumParams.nextElement();
    	        reqParam = reqObj.getParameter(paramName);
    	        
    	        validationMatcher = validationPattern.matcher(reqParam);
    	        if(reqParam != null){
    	        	//System.out.println(reqParam);
    	        	while (validationMatcher.find()) {
    	        		invalidChar = invalidChar + validationMatcher.group();
    	            }  	        	
    	        }
    	    }
        }
        
        	return invalidChar; 
       
       
    	
        	
    }
	
	public static String cString(Object s)
    {
        if (s == null)
            return "";         
       return (String)s;
    }
	
    public static String getStackTrace(Throwable t)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        t.printStackTrace(pw);
        pw.flush();
        sw.flush();
        return sw.toString();
    }
}

