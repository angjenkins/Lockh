package gov.gsa.fas.fpdsatomfeed.common;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

public class getFPDSUpdates
{
	private final static Logger logger = Logger.getLogger(System.class
			.getName());	
  static PrintStream pStr = null;
  static PrintStream pStrLog = null;
  static Writer wXMLOut1 = null;
  StringBuilder  wXMLOut=new StringBuilder(); 
  static PrintStream wXMLdelOut = null;
  private String sSearchFor = "<link rel=\"last\" type=\"text/html\" href=\"https://www.fpds.gov/ezsearch/FEEDS/ATOM?s=FPDS&amp;FEEDNAME=PUBLIC&";
  private boolean isSearchForCountDone=false;
  private long recordCount=0L;
  
  
  

private boolean isSearchForCountDone() {
	return isSearchForCountDone;
}

private void setSearchForCountDone(boolean isSearchForCountDone) {
	this.isSearchForCountDone = isSearchForCountDone;
}

public long getXMLFileRecordCount(String sQuery, String sContractType, String version)
  throws Exception
{
	
	String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=";
	//String sURL2 = " CONTRACT_TYPE:\"IDV\"&start=";
    String sURL2 = " CONTRACT_TYPE:\"" + sContractType + "\"";
        
    logger.info("AtomFeed getXMLFileRecordCount Link:"+sURL1 + sQuery.trim() + "%20" + sURL2.trim() + version);
    URL urlFPDSData = new URL(sURL1 + sQuery.trim() + "%20" + sURL2.trim() + version);
    BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));

    String inputLine;
    while ((inputLine = in.readLine()) != null && !isSearchForCountDone )
    {
    
    	  setReecordCount(inputLine);
	
    }
    in.close();
	
	
	
	
	
	
	
	
	
	
	
	
 /* String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=";
  String sURL2 = " CONTRACT_TYPE:\"" + sContractType + "\"";

 
  
  int nCountIndexStart = 0;
  int nCountIndexEnd = 0;
  int nCountIndexLoopStart = 0;
  int nCountIndexLoopEnd = 0;

  long nRetVal = 0L;

  System.out.println("sContractType = " + sContractType);
  System.out.println("Counting: = " + sURL1 + sQuery + sURL2);

  URL urlFPDSData = new URL(sURL1 + sQuery.trim() + "%20" + sURL2.trim());
  //URL urlFPDSData = new URL("https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=LAST_MOD_DATE:[2013/06/13,2013/06/13]%20CONTRACT_TYPE:%22AWARD%22");
  System.out.println(sURL1 + sQuery.trim() + "%20" + sURL2.trim());

  BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));
  String inputLine ="";
  while ((inputLine = in.readLine()) != null)
  	//System.out.println(inputLine);
  {
    if (inputLine.indexOf(sSearchFor) > 0)
    {
  	//  System.out.println(inputLine);
      nCountIndexStart = inputLine.indexOf("start=");
      //System.out.println("Index Start: " + nCountIndexStart);
      
      nCountIndexEnd = inputLine.indexOf("\"></link>");
      //System.out.println("Index End: " + nCountIndexEnd);
      
      String sTheNumberIs = inputLine.substring(nCountIndexStart + 6, nCountIndexEnd);
      System.out.println("The Number is: " + sTheNumberIs);
      nRetVal = Long.parseLong(sTheNumberIs.trim());
      
      if(nRetVal == 0){
      	nCountIndexLoopStart = inputLine.indexOf("start=", nCountIndexEnd);
      	nCountIndexLoopEnd = inputLine.indexOf("\"></link>", nCountIndexEnd);
      	
      	sTheNumberIs = inputLine.substring(nCountIndexLoopStart + 6, nCountIndexLoopEnd);
      	System.out.println("The new Number is: " + sTheNumberIs);
      	nRetVal = Long.parseLong(sTheNumberIs.trim());
      }
    }
  }
  in.close();
*/
  return recordCount;
}

  public long  getDELETEXMLFileRecordCount(String sDate, String sContractType)
  throws Exception
{
  String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=DELETED&q=";
  String sSearchFor = "<link rel=\"last\" type=\"text/html\" href=\"https://www.fpds.gov/ezsearch/FEEDS/ATOM?s=FPDS&amp;FEEDNAME=DELETED&";
 
  long nRecords = 0L;
  int nCountIndexStart = 0;
  int nCountIndexEnd = 0;
  int nCountIndexLoopStart = 0;
  int nCountIndexLoopEnd = 0;

  long nRetVal = 0L;

  logger.info("sContractType = " + sContractType);
  logger.info("AtomFeed getDELETEXMLFileRecordCount Link:" + sURL1 + sDate.trim() );

  URL urlFPDSData = new URL(sURL1 + sDate.trim());
  //URL urlFPDSData = new URL("https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=LAST_MOD_DATE:[2013/06/13,2013/06/13]%20CONTRACT_TYPE:%22AWARD%22");
  

  BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));
  String inputLine ="";
  while ((inputLine = in.readLine()) != null)
  	//System.out.println(inputLine);
  {
    if (inputLine.indexOf(sSearchFor) > 0)
    {
  	//  System.out.println(inputLine);
      nCountIndexStart = inputLine.indexOf("start=");
      //System.out.println("Index Start: " + nCountIndexStart);
      
      nCountIndexEnd = inputLine.indexOf("\"></link>");
      //System.out.println("Index End: " + nCountIndexEnd);
      
      String sTheNumberIs = inputLine.substring(nCountIndexStart + 6, nCountIndexEnd);
      System.out.println("The Number is: " + sTheNumberIs);
      nRetVal = Long.parseLong(sTheNumberIs.trim());
      
      if(nRetVal == 0){
      	nCountIndexLoopStart = inputLine.indexOf("start=", nCountIndexEnd);
      	nCountIndexLoopEnd = inputLine.indexOf("\"></link>", nCountIndexEnd);
      	
      	sTheNumberIs = inputLine.substring(nCountIndexLoopStart + 6, nCountIndexLoopEnd);
      	System.out.println("The new Number is: " + sTheNumberIs);
      	nRetVal = Long.parseLong(sTheNumberIs.trim());
      }
    }
  }
  in.close();

  return nRetVal;
}
  
  private void setReecordCount(String inputLine) throws Exception{
	  int nCountIndexStart = 0;
	  int nCountIndexEnd = 0;
	  int nCountIndexLoopStart = 0;
	  int nCountIndexLoopEnd = 0;

	  long nRetVal = 0L;
	  if (inputLine.indexOf(sSearchFor) > 0)
	    {
	  	//  System.out.println(inputLine);
	      nCountIndexStart = inputLine.indexOf("start=");
	      //System.out.println("Index Start: " + nCountIndexStart);
	      
	      nCountIndexEnd = inputLine.indexOf("\"></link>");
	      //System.out.println("Index End: " + nCountIndexEnd);
	      
	      String sTheNumberIs = inputLine.substring(nCountIndexStart + 6, nCountIndexEnd);
	      System.out.println("The Number is: " + sTheNumberIs);
	      nRetVal = Long.parseLong(sTheNumberIs.trim());
	      
	      if(nRetVal == 0){
	      	nCountIndexLoopStart = inputLine.indexOf("start=", nCountIndexEnd);
	      	nCountIndexLoopEnd = inputLine.indexOf("\"></link>", nCountIndexEnd);
	      	
	      	sTheNumberIs = inputLine.substring(nCountIndexLoopStart + 6, nCountIndexLoopEnd);
	      	System.out.println("The new Number is: " + sTheNumberIs);
	      	nRetVal = Long.parseLong(sTheNumberIs.trim());
	      	
	      }
	      	String sXMLLine3 = "      <ns1:count>";
	      	String sXMLLine4 = "         <ns1:total>" + nRetVal + "</ns1:total>";
		    String sXMLLine5 = "         <ns1:fetched>" + nRetVal + "</ns1:fetched>";
		    String sXMLLine6 = "      </ns1:count>";
		    wXMLOut.append(sXMLLine3);
		    wXMLOut.append(sXMLLine4);
		    wXMLOut.append(sXMLLine5);
		    wXMLOut.append(sXMLLine6);
  
		  recordCount = nRetVal;  
	      setSearchForCountDone(true);
	    }
	    
	  
  }

  public StringBuilder getIDVXMLFileViaAtom(String sFileName, String sDate, String nStart, String version)
    throws Exception
  {
	
    String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=";
    String sURL2 = " CONTRACT_TYPE:\"IDV\"&start=";
    String sURL3 = "/>";
    String sIDVStart = "<ns1:IDV xmlns";
    String sIDVEnd = "</ns1:IDV>";
    String sXMLLine1 = "<?xml version=\"1.0\"?>";
    String sXMLLine2 = "   <ns1:listOfIDVs xmlns:ns1=\"http://www.fpdsng.com/FPDS\">";
    //String sXMLLine3 = "      <ns1:count>";
    //String sXMLLine4 = "         <ns1:total>" + nLastBatch + "</ns1:total>";
   // String sXMLLine5 = "         <ns1:fetched>" + nLastBatch + "</ns1:fetched>";
   // String sXMLLine6 = "      </ns1:count>";
      String sXMLLastLine = "   </ns1:listOfIDVs>";

    int bShouldIWrite = 0;
    logger.info("AtomFeed getIDV Link:"+sURL1 + sDate.trim() + "%20" + sURL2.trim() + nStart + version);
    URL urlFPDSData = new URL(sURL1 + sDate.trim() + "%20" + sURL2.trim() + nStart + version);
    BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));

      wXMLOut.append(sXMLLine1);
      wXMLOut.append(sXMLLine2);
     // wXMLOut.append(sXMLLine3);
      //wXMLOut.append(sXMLLine4);
      //wXMLOut.append(sXMLLine5);
     // wXMLOut.append(sXMLLine6);
   
    String inputLine;
    while ((inputLine = in.readLine()) != null)
    {
    	
      if (!isSearchForCountDone){
    	  setReecordCount(inputLine);
      }
      if (inputLine.indexOf(sIDVStart) != -1) {
        bShouldIWrite = 1;
      }
       inputLine = inputLine.replace(" version=\"1.0\"", " ");
      inputLine = inputLine.replace(" version=\"1.1\"", " ");
      inputLine = inputLine.replace(" version=\"1.2\"", " ");
      inputLine = inputLine.replace(" version=\"1.3\"", " ");
      inputLine = inputLine.replace(" version=\"1.4\"", " ");

      if (bShouldIWrite == 1) {
        wXMLOut.append(inputLine);
      }
      if (inputLine.indexOf(sIDVEnd) != -1) {
        bShouldIWrite = 0;
      }
    }


      wXMLOut.append(sXMLLastLine);
  

    in.close();

    return wXMLOut;
  }
  


  public StringBuilder getDELETEXMLFileViaAtom(String sFileName, String sDate, String nStart, long nLastBatch)
    throws Exception
  {
    String sURL3 = "/>";
    String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=DELETED&q=";
    String sURL2 = "&start=";
    String agencyID = "";
    String agencydesc = "";
    String pidd = "";
    String refpidd = "";
    String modNumber = "";
    String refmodNumber = "";
    String signedDate = "";
    String obligatedAmount = "";
    String lastModifiedDate = "";
    String recordtype = "";
    String referencedIDVIDAgency = "";
    boolean inreferencedIDVID = false;
    String transactionNumber = "";
    logger.info("AtomFeed getDELETE Link:" + sURL1 + sDate.trim() + "%20" + sURL2.trim() + nStart);
    URL urlFPDSData = new URL(sURL1 + sDate.trim() + sURL2 + nStart);
    BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));
    String inputLine;
    while ((inputLine = in.readLine()) != null)
    {
       inputLine = inputLine.replace(" version=\"1.0\"", " ");
      inputLine = inputLine.replace(" version=\"1.1\"", " ");
      inputLine = inputLine.replace(" version=\"1.2\"", " ");
      inputLine = inputLine.replace(" version=\"1.3\"", " ");
      inputLine = inputLine.replace(" version=\"1.4\"", " ");
      if (inputLine.contains("<ns1:awardID>"))
        recordtype = "AWARD";
      if (inputLine.contains("<ns1:IDV"))
        recordtype = "IDV";
      inputLine = removeInvalidXmlCharacters(inputLine);
      if (inputLine.contains("<ns1:awardID>"))
        recordtype = "AWARD";
      if (inputLine.contains("<ns1:IDV"))
        recordtype = "IDV";
      if ((inputLine.contains("<ns1:referencedIDVID>")) && (recordtype == "AWARD"))
        inreferencedIDVID = true;
      if ((inputLine.contains("</ns1:referencedIDVID>")) && (recordtype == "AWARD"))
        inreferencedIDVID = false;
      if (inputLine.contains("<ns1:agencyID description"))
      {
        agencyID = inputLine.substring(inputLine.indexOf("<ns1:agencyID description=\"") + 27, inputLine.indexOf("\">"));
        agencydesc = inputLine.substring(inputLine.indexOf("\">") + 2, inputLine.indexOf("</ns1:agencyID>"));
      }

      if ((inputLine.contains("<ns1:PIID>")) && (!inreferencedIDVID))
      {
        pidd = inputLine.substring(inputLine.indexOf("<ns1:PIID>") + 10, inputLine.indexOf("</ns1:PIID>"));
      }

      if ((inputLine.contains("<ns1:agencyID>")) && (inreferencedIDVID))
      {
        referencedIDVIDAgency = inputLine.substring(inputLine.indexOf("<ns1:agencyID>") + 14, inputLine.indexOf("</ns1:agencyID>"));
      }

      if ((inputLine.contains("<ns1:PIID>")) && (inreferencedIDVID))
      {
        refpidd = inputLine.substring(inputLine.indexOf("<ns1:PIID>") + 10, inputLine.indexOf("</ns1:PIID>"));
      }

      if ((inputLine.contains("<ns1:modNumber>")) && (inreferencedIDVID))
      {
        refmodNumber = inputLine.substring(inputLine.indexOf("<ns1:modNumber>") + 15, inputLine.indexOf("</ns1:modNumber>"));
      }

      if ((inputLine.contains("<ns1:modNumber>")) && (!inreferencedIDVID))
      {
        modNumber = inputLine.substring(inputLine.indexOf("<ns1:modNumber>") + 15, inputLine.indexOf("</ns1:modNumber>"));
      }

      if (inputLine.contains("<ns1:transactionNumber>"))
      {
        transactionNumber = inputLine.substring(inputLine.indexOf("<ns1:transactionNumber>") + 23, inputLine.indexOf("</ns1:transactionNumber>"));
      }

      if (inputLine.contains("<ns1:signedDate>"))
      {
        signedDate = inputLine.substring(inputLine.indexOf("<ns1:signedDate>") + 16, inputLine.indexOf("</ns1:signedDate>"));
      }

      if (inputLine.contains("<ns1:obligatedAmount>"))
      {
        obligatedAmount = inputLine.substring(inputLine.indexOf("<ns1:obligatedAmount>") + 22, inputLine.indexOf("</ns1:obligatedAmount>"));
      }

      if (inputLine.contains("<ns1:lastModifiedDate>"))
      {
        lastModifiedDate = inputLine.substring(inputLine.indexOf("<ns1:lastModifiedDate>") + 22, inputLine.indexOf("</ns1:lastModifiedDate>"));
      }

      if ((inputLine.contains("</ns1:award>")) || (inputLine.contains("</ns1:IDV>")))
      {
    	  wXMLOut.append("\n" + recordtype + "^|" + agencyID + "^|" + referencedIDVIDAgency + "^|" + agencydesc + "^|" + pidd + "^|" + modNumber + "^|" + signedDate + "^|" + obligatedAmount + "^|" + lastModifiedDate + "^|" + refmodNumber + "^|" + refpidd + "^|" + transactionNumber + "^|" + sDate);

        agencyID = "";
        agencydesc = "";
        referencedIDVIDAgency = "";
        pidd = "";
        modNumber = "";
        signedDate = "";
        obligatedAmount = "";
        lastModifiedDate = "";
        recordtype = "";
        inreferencedIDVID = false;
        refmodNumber = "";
        refpidd = "";
        transactionNumber = "";
      }
    }
    in.close();
    return wXMLOut;
  }

  public StringBuilder getAWARDXMLFileViaAtom(String sFileName, String sQuery, String nStart, String version)
    throws Exception
  {
    String sURL1 = "https://www.fpds.gov/ezsearch/FEEDS/ATOM?FEEDNAME=PUBLIC&q=";
    String sURL2 = " CONTRACT_TYPE:\"AWARD\"&start=";
    String sURL3 = "/>";
    String sAwardStart = "<ns1:award xmlns";
    String sNASAStart = "<ns1:agencySpecific";
    String sNASAEnd = "</ns1:agencySpecific";
    String sAwardEnd = "</ns1:award>";
    String sXMLLine1 = "<?xml version=\"1.0\"?>";
    String sXMLLine2 = "   <ns1:listOfAwards xmlns:ns1=\"http://www.fpdsng.com/FPDS\">";
    //String sXMLLine3 = "      <ns1:count>";
   // String sXMLLine4 = "         <ns1:total>" + nLastBatch + "</ns1:total>";
   // String sXMLLine5 = "         <ns1:fetched>" + nLastBatch + "</ns1:fetched>";
  //  String sXMLLine6 = "      </ns1:count>";
    String sXMLLastLine = "   </ns1:listOfAwards>";
    int bShouldIWrite = 0;
    logger.info("AtomFeed getAWARD Link:"+ sURL1 + sQuery.trim() + "%20" + sURL2.trim() + nStart + version);
    URL urlFPDSData = new URL(sURL1 + sQuery.trim() + "%20" + sURL2.trim() + nStart + version);
    BufferedReader in = new BufferedReader(new InputStreamReader(urlFPDSData.openStream()));
	  wXMLOut.append(sXMLLine1);
	  wXMLOut.append(sXMLLine2);
	  //wXMLOut.append(sXMLLine3);
	 // wXMLOut.append(sXMLLine4);
	//  wXMLOut.append(sXMLLine5);
	//  wXMLOut.append(sXMLLine6);
   
    String inputLine;
    while ((inputLine = in.readLine()) != null)
    {
      if (!isSearchForCountDone){
      	  setReecordCount(inputLine);
        } 
      if (inputLine.indexOf(sAwardStart) != -1)
        bShouldIWrite = 1;
      if (inputLine.indexOf(sNASAEnd) != -1)
          bShouldIWrite = 1;
      if (inputLine.indexOf(sNASAStart) != -1)
        bShouldIWrite = 0;
      if (bShouldIWrite == 1)
      {
        inputLine = inputLine.replace(" version=\"1.0\"", " ");
        inputLine = inputLine.replace(" version=\"1.1\"", " ");
        inputLine = inputLine.replace(" version=\"1.2\"", " ");
        inputLine = inputLine.replace(" version=\"1.3\"", " ");
        inputLine = inputLine.replace(" version=\"1.4\"", " ");
        if(inputLine.contains("</ns1:NASASpecificAwardElements")){
        	//System.out.println(inputLine);
            //System.out.println("**********");
            String tempNASAString = "";
            if(inputLine.indexOf("<ns1:accounting")!= -1){
      	    tempNASAString = inputLine.substring(inputLine.indexOf("<ns1:accounting"), inputLine.indexOf("</ns1:award"));
            }else{
            	 tempNASAString = inputLine.substring(0,inputLine.indexOf("</ns1:award"));
            }
      	   inputLine = inputLine.replace(tempNASAString, "");
         }
        wXMLOut.append(inputLine.replace("&", " "));
      //System.out.println(inputLine);
       // System.out.println("**********");
      }

      if (inputLine.indexOf(sNASAEnd) != -1) {
        bShouldIWrite = 1;
      }
      if (inputLine.indexOf(sAwardEnd) != -1) {
        bShouldIWrite = 0;
      }
    }
  
      wXMLOut.append(sXMLLastLine);
   
    in.close();

    return wXMLOut;
  }

  public String removeInvalidXmlCharacters(String input)
  {
    if (input == null) {
      return input;
    }

    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < input.length(); i++)
    {
      char c = input.charAt(i);

    if (c != '\0')
      {
        if ((c == '\t') || (c == '\n') || (c == '\r') || 
          ((c >= ' ') && (c <= 55295)) || 
          ((c >= 57344) && (c <= 65533)) || (
          (c >= 65536) && (c <= 1114111)))
        {
          sb.append(c);
        }
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    getFPDSUpdates GetFPDSUpdates = new getFPDSUpdates();

    String sLastUpdated = " ";

    String sLastUpdatedInCART = " ";
    StringBuilder x ;

    long startTime = System.currentTimeMillis();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
    dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));

    long nReturnValue = -1L;

    String sContractType = args[0];

    System.out.println("Contract Type: " + sContractType);

    if (sContractType.equals("IDV"))
    {
      sLastUpdatedInCART = args[1];
      sLastUpdated = sLastUpdatedInCART.substring(15, 25);
      sLastUpdatedInCART = sLastUpdatedInCART.replace(" ", "");
      System.out.println("IDV: Last Updated in CART " + sLastUpdated);
    }
    if (sContractType.equals("AWARD"))
    {
      sLastUpdatedInCART = args[1];
      sLastUpdated = sLastUpdatedInCART.substring(15, 25);
      sLastUpdatedInCART = sLastUpdatedInCART.replace(" ", "");
      System.out.println("IDV: Last Updated in CART " + sLastUpdated);
    }

    if (sContractType.equals("DELETE"))
    {
      sLastUpdatedInCART = args[1];
      sLastUpdated = sLastUpdatedInCART.substring(15, 25);
      sLastUpdatedInCART = sLastUpdatedInCART.replace(" ", "");
      System.out.println("Delete: Last Updated in CART " + sLastUpdated);
    }

    String sYear = sLastUpdated.substring(0, 4);
    String sMonth = sLastUpdated.substring(5, 7);
    String sDay = sLastUpdated.substring(8, 10);
    try
    {
      if (sContractType.equals("DELETE"))
      {
        pStrLog = new PrintStream(new FileOutputStream("/ftpdata/cartuser/atomfeeds/AF_Delete.log", true));
      }

      if (sContractType.equals("AWARD"))
      {
        pStrLog = new PrintStream(new FileOutputStream("/ftpdata/cartuser/atomfeeds/AF_AWARD.log", true));
      }
      if (sContractType.equals("IDV"))
      {
        pStrLog = new PrintStream(new FileOutputStream("/ftpdata/cartuser/atomfeeds/AF_IDV.log", true));
      }

    }
    catch (Exception ex)
    {
      System.out.println(ex.getMessage());
    }

    try
    {
      try
      {
        if (sContractType.equals("AWARD"))
        {
          nReturnValue = GetFPDSUpdates.getXMLFileRecordCount(sLastUpdatedInCART, sContractType,"");
//"//ftpdata//cartuser//atomfeeds//afawards//AWARD_" +
          wXMLOut1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( "//ftpdata//cartuser//atomfeeds//afawards//AWARD_"  + sYear + sMonth + sDay + "_" + nReturnValue + ".xml"), "UTF-8"));
        }

        if (sContractType.equals("IDV"))
        {
          nReturnValue = GetFPDSUpdates.getXMLFileRecordCount(sLastUpdatedInCART, sContractType,"");
//"//ftpdata//cartuser//atomfeeds//afidv//IDV_" +
          wXMLOut1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("//ftpdata//cartuser//atomfeeds//afidv//IDV_" + sYear + sMonth + sDay + "_" + nReturnValue + ".xml"), "UTF-8"));
        }

        if (sContractType.equals("DELETE"))
        {
          nReturnValue = GetFPDSUpdates.getDELETEXMLFileRecordCount(sLastUpdatedInCART, sContractType);
//"//ftpdata//cartuser//atomfeeds//afdelete//DELETE" +
          wXMLdelOut = new PrintStream(new FileOutputStream("//ftpdata//cartuser//atomfeeds//afdelete//DELETE" + sYear + sMonth + sDay + "_" + nReturnValue + ".txt", true));
          wXMLdelOut.print("recordtype^|agencyID^|referencedIDVIDAgency^|agencydesc^|pidd^|modNumber^|signedDate^|obligatedAmount^|lastModifiedDate^|refmodNumber^|refpidd^|transactionNumber^|sDate1");
        }

      }
      catch (Exception ex)
      {
        System.out.println(ex.getMessage());
      }

      for (int i = 0; i <= nReturnValue; i += 10)
      {
        System.out.println("Current Batch: " + i + " of " + nReturnValue);

        if (sContractType.equals("AWARD"))
        {
          x = GetFPDSUpdates.getAWARDXMLFileViaAtom(sYear + sMonth + sDay, sLastUpdatedInCART, i+"", "&VERSION=");
        }

        if (sContractType.equals("IDV"))
        {
          x = GetFPDSUpdates.getIDVXMLFileViaAtom(sYear + sMonth + sDay, sLastUpdatedInCART, i+"", "&VERSION=");
        }

        if (sContractType.equals("DELETE")) {
          System.out.println("DELETE FUNCTION CALL : " + sYear + sMonth + sDay + " :: " + sLastUpdatedInCART + " :: " + i + " :: " + nReturnValue);
          x = GetFPDSUpdates.getDELETEXMLFileViaAtom(sYear + sMonth + sDay, sLastUpdatedInCART, i+"", nReturnValue);
        }

      }

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    try
    {
      System.out.println("IN PROCESS of CLOSIG");
      if ((sContractType.equals("AWARD")) || (sContractType.equals("IDV")))
        wXMLOut1.close();
      if (sContractType.equals("DELETE")) {
        wXMLdelOut.close();
      }

    }
    catch (IOException ex)
    {
      System.out.println(ex.getMessage());
    }

    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;

    SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
    dateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));

 //   pStrLog.println("Start: (" + dateFormat.format(new Date(startTime)) + ") End: (" + dateFormat.format(new Date(endTime)) + ") - Last Updated: - " + sYear + "/" + sMonth + "/" + sDay + " - Batch Count: " + nReturnValue + " - CONTRACT_TYPE: " + sContractType);

   // pStrLog.println("  * Elapsed Time: " + dateFormat2.format(new Date(elapsedTime)));

   // pStrLog.close();

    System.out.println("Goodbye:... ");
  }
}