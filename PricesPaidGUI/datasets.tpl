<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=EDGE;IE=9; IE=8; IE=7; " />

<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="pragma" content="no-cache" />
    <title>Prices Paid Portal</title>
    <meta name="robots" content="NOINDEX, NOFOLLOW">

   <link rel="stylesheet" type="text/css" href="theme/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="theme/css/decoration_gui.css" >
    <link rel="stylesheet" type="text/css" media="screen, projection" href="./theme/css/shared.css" >
    <link rel="stylesheet" type="text/css" media="screen, projection" href="./theme/css/mainPage.css" >
    <link rel="stylesheet" href="../SlickGrid-master/slick.grid.css" type="text/css">
    <link rel="stylesheet" href="./theme/css/jquery-ui.css" />
    <!-- <link rel="stylesheet" href="//code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" /> -->
	<link rel="stylesheet" type="text/css" href="../js/jquery.jqplot.css" >
   {{!goog_anal_script}}
<style>
#dataTable{
	width: 750px;
	height: 400px;
	font:Arial, Helvetica, sans-serif; 
	text-align:left; 
	border-color: 1px solid  #666;
	padding: 20px !important;
	margin: 20px;
}
#skip-to-content-destination a.skip-content {
color: #060;
height: 1px;
left: -1000px;
overflow: hidden;
position: absolute;
text-align: left;
top: -1000px;
width: 1px;
z-index: 9000;
}

#mainsearchbutton { cursor: pointer; cursor: hand; }
</style>
</head>
<body>
		<div id="skip-to-content-destination"><a href="#startContent" class="skip-content">Skip to main content</a></div>

<!--
<div id="beta">
  <img id="betastripe" src="theme/img/Beta3.0.png"  title="Beta 3.0 icon">
</div>
-->
<!--  revised header CSS for revised UI  -->  
  <div id="header">
    <div class="col-md-3 col-xs-5 logo"><img alt="Prices Paid Portal"  id="mainsearchbutton" src="theme/img/pp_logo_beta_lg.png" width="312" height="36" align="left" title="Prices Paid Portal logo"></div>
    <!-- move these links to the right-->
    <div class="newmenu">
		<ul>
            <!--<li id="helplink"><a href="./SearchHelp">HELP</a></li>-->
	     <li id="helplink"><a href="https://max.omb.gov/community/x/bJRTKg" target="_blank">HELP</a></li>
            <li id="FeedbackLink"><a href="#/">FEEDBACK</a></li>
            <li id="logoutLink"><a href="#">LOGOUT</a></li>
          </ul>
     </div>
   <form method="post" action="PricesPaid" id="bigsearchform_new">
	   	<input type="hidden" name="antiCSRF" value="{{acsrf}}" />
	   	<input type="hidden" name="session_id" value="{{session_id}}" />
	    <div id="mainsearch"><div id="mainsearchbutton" class="searchtitle"><label for="search_string"> SEARCH:</label></div><div id="searchbox">
	    <input id="search_string" name="search_string" type="text" class="newsearch rounded" placeholder="Search..." maxlength="500" >
	    <input type="button" id="searchButton1" class="searchButton" title="Click here to search the database" ></div></div>
		</div>
	</form>
	
<!--<form method="post" action="PricesPaid"><input type="hidden" name="antiCSRF" value="{{acsrf}}" />
<input type="hidden" name="session_id" value="{{session_id}}" />
<input type="hidden" name="commodity_id" id="commodity_id" />
<input name="search_string" type="text" class="newsearch rounded" placeholder="Search..." maxlength="500" ><input type="button" class="searchButton" title="Click here to search the database"></button>
</form>-->
<!-- end revised header -->
<!-- Content ... below the header -->

<form method="post" id="fakeReturnForm" action="./StartPageReturned">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>

<form method="post" id="fileform" action="./files">
    <input id="acsrf_val" type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input id='session_val' type="hidden" name="session_id" value="{{session_id}}" />
    <input id="filename" name="filename" type="hidden" value="" />
</form>

			
<div id="startContent">
       <h2>Acquisition Data Library</h2>
	<p> The Acquisition Data Library contains pricing reports and other historical data that will help with budget planning and acquisition research.</p>

    <p><span style="font-weight:bold">Disclaimer:</span> Please note that data accessible through the links below is not guaranteed to be accurate, complete or current and may not have been verified or validated.  Any use of and any decisions you take based upon the data are at your own risk.  In no event shall the General Services Administration, or the U.S. Government, have any liability to any party arising out of, or in connection with, such data.</p>
 
  <table class="table table-bordered" summary="Add summary text when available" style="font-size:85%; text-align:left">
      
      <tr bgcolor="#2e5180" style="color:#FFF; font-weight:bold; text-align:center">
      
        <td width="64">&nbsp;</td>
        <td width="104">Data Set</td>
        <td width="771">Description</td>
        <td width="256">File/Link</td>
      </tr>
      <tr bgcolor="#cbdff8" padding="10px">
       <td rowspan="6" style="font-weight:bold; vertical-align:middle">Products</td>
        <td>GSA Advantage</td>
        <td><p>These  are GSA Advantage data sets that have purchases of commercial products and  services from FSS Schedule contracts and GSA GWACs. The following categories  are included: building &amp; industrial; furniture &amp; furnishings; cleaning  &amp; chemicals; IT solutions &amp; electronics; laboratory, cleaning, medical;  law enforcement, fire, security; office solutions; recreational &amp; apparel;  services; tools, hardware, machinery; vehicles, watercraft. The data is  published quarterly. You can visit GSA Advantage! at:  <a href="https://www.gsaadvantage.gov/advantage/main/start_page.do" target="_new">https://www.gsaadvantage.gov/advantage/main/start_page.do</a></p></td>
        <td><a id="ad1" href="#">Advantage_FY2014_FYQ1.xlsx</a>
        <br><a id="ad2" href="#">Advantage_FY2014_FYQ2.xlsx</a>
        <br><a id="ad3" href="#">Advantage_FY2014_FYQ3.xlsx</a>
        <br><a id="ad4" href="#">Advantage_FY2014_FYQ4.xlsx</a>
        <br><a id="ad5" href="#">Advantage_FY2015_FYQ1.xlsx</a><br></td>
      </tr>
      <tr bgcolor="#eeeeee">
        <td><p>GSA  Federal Supply System (FSS-19)</p></td>
         <td><p>These  are data sets pulled from the FSS-19 system, a contract system for procurement  and distribution of supplies from 
. The data includes transactions and  pricing of the GSA supply and schedule contracts. Specific details on stored  stock orders, the Special Orders Program, expanded direct delivery, and  schedule orders sales from the GSA Federal Supply System are of note. The data  is updated on a quarterly basis.</p></td>
        <td><a id="fd1" href="#">FSS19_FY2014_FYQ1.xlsx</a>
        <br><a id="fd2" href="#">FSS19_FY2014_FYQ2.xlsx</a>
        <br><a id="fd3" href="#">FSS19_FY2014_FYQ3.xlsx</a>
        <br><a id="fd3" href="#">FSS19_FY2014_FYQ4.xlsx</a>
        <br><a id="fd4" href="#">FSS19_FY2015_FYQ1.xlsx</a></td>
        
      </tr>
      <tr bgcolor="#cbdff8">
        <td>OS2</td>
        <td><p>These  are data sets pulled from purchases associated with GSA's Second-Generation  Office Supplies (OS2) program. The data sets have purchases from products in  the office equipment and supplies category. These include: Ability One  products; toner supplies; small business products; green products. The data  focuses on contractor, product name, minimum order requirement,  NSN/manufacturer part number, shipping, and variation in price. It centers on  GSA's Schedule 75 for Office Supplies. The data is published quarterly. For  more details on what OS2 includes, please see:  <a href="https://www.gsaadvantage.gov/advantage/department/main.do?cat=ADV.FSSI" target="_blank">https://www.gsaadvantage.gov/advantage/department/main.do?cat=ADV.FSSI</a></p></td>
        <td><a id="ed1" href="#">EDW_Products_OS2_FY2014_FYQ1.xlsx</a><br>
        	<a id="ed2" href="#">EDW_Products_OS2_FY2014_FYQ2.xlsx</a><br>
        	<a id="ed3" href="#">EDW_Products_OS2_FY2014_FYQ3.xlsx</a><br></b>
        
      </tr>
      <tr bgcolor="#eeeeee">
        <td>NITCP</td>
         <td>This data is from purchases associated with GSA’s National IT Commodity Program (NITCP). NITCP is a collection of BPAs for IT Hardware. One avenue to purchase off of the BPA is through GSA Reverse Auctions. The data reports shared are inclusive of all NITCP BPA purchases regardless of procurement channel. Procurements focus on IT commodities and ancillary services for federal, state, and local governments using innovative solutions. Specific offerings include: computers, data center equipment, mobile solutions, monitors, tablets, and video teleconferencing equipment. This data is published quarterly. </td>
        <td><a id="nit1" href="#">NITCP_OS2FY2014_FYQ1.xlsx</a><br>
        <a id="nit2" href="#">NITCP_OS2FY2014_FYQ2.xlsx</a></td>
        
      </tr>
      <tr bgcolor="#cbdff8">
        <td>Reverse Auctions</td>
         <td>This data is from the Reverse Auction Platform, a site run by GSA's National IT Commodity Program (NITCP) to help agencies acquire non-complex commodities and simple services. The data set describes NITCP's specific BPAs' offerings explore computers, data center equipment, mobile solutions, monitors, tablets, and video teleconferencing equipment. The data is published quarterly. You can visit GSA Reverse Auctions at: <a href="https://reverseauctions.gsa.gov/reverseauctions/ralogin/" target="_blank">https://reverseauctions.gsa.gov/reverseauctions/ralogin/ </a></td>
        <td><a id="rd1" href="#">REVERSE_AUCTIONS_FY2014_Q1.xlsx</a><br>
            <a id="rd2" href="#">REVERSE_AUCTIONS_FY2014_Q2.xlsx</a><br>
            <a id="rd3" href="#">REVERSE_AUCTIONS_FY2014_Q3.xlsx</a><br>
            <a id="rd4" href="#">REVERSE_AUCTIONS_FY2014_Q4.xlsx</a><br>
            <a id="rd5" href="#">REVERSE_AUCTIONS_FY2015_Q1.xlsx</a></td>
        
      </tr>
      <tr bgcolor="#eeeeee">
        <td>GSA SmartBUY</td>
         <td><!--These are data sets pulled from SmartBUY, a Federal Strategic Sourcing Initiative (FSSI) featuring blanket purchase agreements (BPAs) for commercial off the shelf software. SmartBUY allows federal, state, local, and tribal government organizations to pay less for Geospatial Information Systems (GIS) and Information Assurance (IA) software and supporting services. The data covers the following agreements by market category: Database management; Enterprise Content Management (ECM); Enterprise Resource Planning (ERP); GIS; IA; Network Management. The data focuses on purchases of software from the following publishers: BDNA Corporation; Belarc, Inc.; BigFix, Inc.; Carbon Project; CubeWerx; Environmental Systems Research Institute (ESRI); Google; iGrafx; MapDotNet; NT Concepts; Oracle; Planet Associates, Inc.; Quest Software; Science Applications International Corporation (SAIC); VMware, Inc.; Xacta.; The data is published by most recent quarter.-->
	
These are data sets provided by the GSA SmartBUY program. They include acquisition data from 14 different Agencies' Microsoft Enterprise Agreements. 
Information on the the following areas is displayed: 

Basic contract information: 
1) contract Size [Seats]; 2) annual spending; 3) length of contract; 4) date range of contract; 5) reseller name


SKU level pricing data: 1) product description; 2) quantity; 3) price paid


Schedule 70 average reseller data (10 resellers): 1) product description; 2) price


</td>
        <td bgcolor="#eeeeee">
        <a id="d14" href="#">GSA_SMARTBUY_AGENCY_SKU_LEVEL_PRICING.csv</a><br>
        <a id="d15" href="#">GSA_SMARTBUY_AGENCY_CONTRACTS.csv</a><br>
        <a id="d16" href="#">GSA_SMARTBUY_SCHEDULE_70_PRICING.csv</a><br>
	<!--
        <a id="d15" href="../files/GSA_SMARTBUY_LINE_ITEM_DETAIL.csv">GSA_SMARTBUY_LINE_ITEM_DETAIL.csv</a>
        <a id="d15" href="../files/GSA_SMARTBUY_LINE_ITEM_DETAIL.csv">GSA_SMARTBUY_LINE_ITEM_DETAIL.csv</a>
	
        <a id="d14" href="../files/SMARTBUY_FY2014_FEBRUARY_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx">
        SMARTBUY_FY2014_FEBRUARY_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx</a><br>
        <a id="d15" href="../files/SMARTBUY_FY2014_JANUARY_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx">
        SMARTBUY_FY2014_JANUARY_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx</a><br>
        <a id="d16" href="../files/SMARTBUY_FY2014_MARCH_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx">
        SMARTBUY_FY2014_MARCH_FA8771-09-A-0301_SALES_REPORTS_ESI_SW_TELOS.xlsx</a><br>
        <a id="d17" href="../files/SMARTBUY_FY2014_Q2_AFFIGENT_SALES_AND_COST_AVOIDANCE.xls">
        SMARTBUY_FY2014_Q2_AFFIGENT_SALES_AND_COST_AVOIDANCE.xls</a><br>
        <a id="d18" href="../files/SMARTBUY_FY2014_Q2_AUTONOMIC_SAIR_ROS_041114.xls">
        SMARTBUY_FY2014_Q2_AUTONOMIC_SAIR_ROS_041114.xls</a><br>
        <a id="d19" href="../files/SMARTBUY_FY2014_Q2_DLT_SALES_AND_COST_AVOIDANCE.xlsx">
        SMARTBUY_FY2014_Q2_DLT_SALES_AND_COST_AVOIDANCE.xlsx</a><br>
        <a id="d20" href="../files/SMARTBUY_FY2014_Q2_ESTIMATED_SAVINGS.xlsx">
        SMARTBUY_FY2014_Q2_ESTIMATED_SAVINGS.xlsx</a><br>
        <a id="d21" href="../files/SMARTBUY_FY2014_Q2_GEOROVER_SALES_REPORT.xls">
        SMARTBUY_FY2014_Q2_GEOROVER_SALES_REPORT.xls</a><br>
        <a id="d22" href="../files/SMARTBUY_FY2014_Q2_GSQ0009AE0021_PLANET_ASSOC_ROFSALES.xls">
        SMARTBUY_FY2014_Q2_GSQ0009AE0021_PLANET_ASSOC_ROFSALES.xls</a><br>
        <a id="d23" href="../files/SMARTBUY_FY2014_Q2_IMMIX_SALES_AND_COST_AVOIDANCE.xlsx">
        SMARTBUY_FY2014_Q2_IMMIX_SALES_AND_COST_AVOIDANCE.xlsx</a><br>
        <a id="d24" href="../files/SMARTBUY_FY2014_Q2_MYTHICS_SALES_AND_COST_AVOIDANCE.xlsx">
        SMARTBUY_FY2014_Q2_MYTHICS_SALES_AND_COST_AVOIDANCE.xlsx</a><br>
        <a id="d25" href="../files/SMARTBUY_FY2014_Q2_QUEST_SALES_AND_COST_AVOIDANCE.xlsx">
        SMARTBUY_FY2014_Q2_QUEST_SALES_AND_COST_AVOIDANCE.xlsx</a>
        <a id="d26" href="../files/SMARTBUY_FY2014_Q2_SAIR_BPA_INTELLIGENT_DECISIONS_REPORTING.xls">
        SMARTBUY_FY2014_Q2_SAIR_BPA_INTELLIGENT_DECISIONS_REPORTING.xls</a>
        <a id="d27" href="../files/SMARTBUY_FY2014_Q2_SHI_IGRAFX_SALES_REPORT.xlsx">
        SMARTBUY_FY2014_Q2_SHI_IGRAFX_SALES_REPORT.xlsx</a>
        <a id="d28" href="../files/SMARTBUY_FY2014_Q2_SOFTMART_DOD_ESI_IGRAFX_SALES_REPORT.xlsx">
        SMARTBUY_FY2014_Q2_SOFTMART_DOD_ESI_IGRAFX_SALES_REPORT.xlsx</a>
        <a id="d29" href="../files/SMARTBUY_FY2014_Q2_VMWARE_W91QUZ-09-A-0003_OT.xlsx">
        SMARTBUY_FY2014_Q2_VMWARE_W91QUZ-09-A-0003_OT.xlsx</a></td>
        -->
      </tr>
  <tr >
        <td rowspan="6" style="font-weight:bold; vertical-align:middle">Services</td>
        <td bgcolor="#ffffff">Wireless</td>
        <td bgcolor="#ffffff"><p>These  are data sets pulled from the Wireless Federal Strategic Sourcing Initiative  (FSSI) Blanket Purchase Agreement (BPA). The prices paid report is comprised of  prices paid for the wireless services of the four providers under the BPA:  AT&amp;T Mobility LLC; Sprint; T-Mobile Inc.; Verizon Wireless. The BPA is  based on GSA IT Schedule 70, Special Item Number (SIN) 132-53. Data includes: a  variety of wireless devices, bundled with the service, including 4th generation  smartphones, cell phones, and broadband data  devices; standardized wireless and cellular domestic service plans;  infrastructure/subsystems and accessories. The data is published monthly by  carrier.</p></td>
        <td bgcolor="#ffffff">
        <a id="d30" href="#">AT&T_WIRELESS_FY2014_Q1.zip</a><br>
        <a id="d31" href="#">AT&T_WIRELESS_FY2014_Q2.zip</a><br>
        <a id="d32" href="#">AT&T_WIRELESS_FY2014_Q3.zip</a><br>
        <a id="d33" href="#">SPRINT_WIRELESS_FY2014_Q1.zip</a><br>
        <a id="d34" href="#">SPRINT_WIRELESS_FY2014_Q2.zip</a><br>
        <a id="d35" href="#">SPRINT_WIRELESS_FY2014_Q3.zip</a><br>
        <a id="d36" href="#">TMOBILE_WIRELESS_FY2014_Q1.zip</a><br>
        <a id="d37" href="#">TMOBILE_WIRELESS_FY2014_Q2.zip</a><br>
        <a id="d38" href="#">TMOBILE_WIRELESS_FY2014_Q3.zip</a><br>
        <a id="d39" href="#">VERIZON_WIRELESS_FY2014_Q1.zip</a><br>
        <a id="d40" href="#">VERIZON_WIRELESS_FY2014_Q2.zip</a><br>
        <a id="d41" href="#">VERIZON_WIRELESS_FY2014_Q3.zip</a></td>
      </tr>
      <tr bgcolor="#cbdff8">
        <td>GWAC</td>
        <td><p>This  data source includes invoice and invoice line item details for task orders  under the GWAC program. This is an operational system of record.</p></td>
        <td>
	<!--
	<a id="d42" href="#">GWAC_MM_FY2014_Q1.xlsx</a><br>
        	<a id="d43" href="#">GWAC_MM_FY2014_Q2.xlsx</a><br>
        	<a id="d44" href="#">GWAC_MM_FY2014_Q3.xlsx</a>-->
	<a href="https://strategicsourcing.gov/prices-paid-alliant-and-alliant-small-business-gwac" target="_blank">
https://strategicsourcing.gov/prices-paid-alliant-and-alliant-small-business-gwac</a>
</td>
      </tr>
      <tr bgcolor="#ffffff">
        <td>Domestic Delivery</td>
        <td><p>These  are data sets pulled from GSA's Domestic Delivery Services (DDS) program. Data  contains the most commonly shipped package weights as well as agencies shipping  behaviors compared to those of other federal agencies. The data represents all  government expenditures through GSA's Federal Strategic Sourcing Initiative  (FSSI) DDS Contract and Multiple Award Schedule (MAS) for FedEX  and UPS. Prices paid for each transaction represent the total amount of the  shipment amount plus all surcharges for a shipment. The data is published by  most recent quarter. You can further explore DDS data at:  <a href="https://strategicsourcing.gov/content/demand-management-measures" target="_self">https://strategicsourcing.gov/content/demand-management-measures</a></p></td>
        <!--<td><a id="d45" href="../files/FEDEX_DDS_MAS_FY2014_FEBRUARY.zip">FEDEX_DDS_MAS_FY2014_FEBRUARY.zip</a><br>
        <a id="d46" href="../files/FEDEX_DDS_MAS_FY2014_MARCH.zip">FEDEX_DDS_MAS_FY2014_MARCH.zip</a><br>
        <a id="d47" href="../files/FEDEX_DDS_MAS_FY2014_APRIL.zip">FEDEX_DDS_MAS_FY2014_APRIL.zip</a><br>
        <a id="d48" href="../files/UPS_DDS_MAS_FY2014_FEBRUARY.zip">UPS_DDS_MAS_FY2014_FEBRUARY.zip</a><br>
        <a id="d49" href="../files/UPS_DDS_MAS_FY2014_MARCH.zip">UPS_DDS_MAS_FY2014_MARCH.zip</a><br>
        <a id="d50" href="../files/UPS_DDS_MAS_FY2014_APRIL.zip">UPS_DDS_MAS_FY2014_APRIL.zip</a><br>
        <a id="d51" href="../files/UPS_DDS2_FSSI_FY2014_FEBRUARY.zip">UPS_DDS2_FSSI_FY2014_FEBRUARY.zip</a><br>
        <a id="d52" href="../files/UPS_DDS2_FSSI_FY2014_MARCH.zip">UPS_DDS2_FSSI_FY2014_MARCH.zip</a><br>
        <a id="d53" href="../files/UPS_DDS2_FSSI_FY2014_APRIL.zip">UPS_DDS2_FSSI_FY2014_APRIL.zip
</a><br></td>-->
	<td>Coming Soon!</td>
      </tr>

       <tr bgcolor="#cbdff8">
        <td>DOMEX</td>
         <td><p>The DOMEX BPA provides domestic express delivery services for the United States Department of Defense (DoD) and data sources include FedEx and UPS shipment sales from the Domestic Express Package Delivery Service (DOMEX) Blanket Purchase Agreement (BPA).  Purchase data focuses on carrier, specific agency, content description, logistics, and variations in cost according to weight and time, etc.</p></td>
        <td>
        <a id="d54" href="#" target="_blank">DOMEX_FEDEX_RATES.pdf</a><br>
        <a id="d56" href="#">DOMEX_FY2013_JANUARY_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d55" href="#">DOMEX_FY2013_FEBRUARY_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d57" href="#">DOMEX_FY2013_MARCH_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d59" href="#">DOMEX_FY2014_JANUARY_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d58" href="#">DOMEX_FY2014_FEBRUARY_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d60" href="#">DOMEX_FY2014_MARCH_FEDEX_DETAIL_REPORT.xlsx</a><br>
        <a id="d61" href="#">DOMEX_FY2014_VOLREL_REPORT.xlsx</a><br>

</td>
      </tr>


      <tr bgcolor="#ffffff">
        <td>Network Services</td>
	<td><p>These are data sets pulled from GSAC"b,b"s Office of Network Services Programs and covers the following: telecommunications services (Networx), services for individuals who are deaf and hard of hearing (FedRelay), the Wireless Federal Strategic Sourcing Initiative (FSSI), local service in the United States (Local Telecommunication Contracts; WITS3); and secure telecommunications equipment, labor services, and solutions for your federal infrastructure, building, or campus (Connections II). The data is published quarterly.</p></td>
        <td><a href="https://releasedprices.networx.gov/" target="_blank">https://releasedprices.networx.gov/</a></td>
      </tr>


	 <tr bgcolor="#cbdff8">
        
        <td><p>Satellite Services</p></td>
        <td><p>For  information regarding Satellite Communications, please contact Jim Russo at:  <a href="mailto:jim.russo@gsa.gov" target="_self"/> jim.russo@gsa.gov </a> or Annette Cole at: <a href="mailto:annette.cole@gsa.gov" target="_self">annette.cole@gsa.gov</a>.</p></td>
        <td>&nbsp;</td>
      </tr>


  </table>
  
  <p>Please direct requests for more data elements or historical information, as well as general support or questions, to: <a href="mailto:CAP.P3data@gsa.gov">CAP.P3data@gsa.gov</a></p>
</div>
       
<!--  PREM  end of data set content -->      

{{!footer_html}}
{{!feedback_html}}
<!--
<div id ="feedbackdialogbox" style="font-size:14px;">
                <div><h3>Feedback</h3></div>
        <p>
             <label for="feedback_name" class="feedback-label-len">(Optional) tell us who you are</label><br />
             <input type="text" id="feedback_name" placeholder>
          </p>
          <p>
             <label for="feedback_message"  class="feedback-label-len">How can we do better?</label><br />
             <textarea rows="3" id="feedback_message" placeholder="Go ahead, type your feedback here..."></textarea>
             <br>
          </p>
        	<fieldset>
        	<legend>Rating</Rating>
             <div id="radio_button_list_title_wrapper">
               <div id="radio_button_list_title" class="feedback-label-len">
                  How likely are you to recommend Prices Paid to a colleague (1 means not likely, 5 means very likely)?
               </div>
               <div>
                                                <input id="radio1" type="radio" name="rating" value="1" class="rating-radio"><label for="radio1">One</label>
                                                <input id="radio2" type="radio" name="rating" value="2" class="rating-radio"><label for="radio2">Two</label>
                                                <input id="radio3" type="radio" name="rating" value="3" class="rating-radio"><label for="radio3">Three</label>
                                                <input id="radio4" type="radio" name="rating" value="4" class="rating-radio"><label for="radio4">Four</label>
                                                <input id="radio5" type="radio" name="rating" value="5" class="rating-radio"><label for="radio5">Five</label>
 
               </div>
            </div>
          </fieldset>
          </p>
           <button id="feedback_submit" >Send</button>
 
</div>
-->

</body>
     <script  src="../js/jquery.min.js"></script>


    <script src="../SlickGrid-master/lib/jquery.event.drag-2.2.js"></script>

    <script src="../SlickGrid-master/slick.core.js"></script>
    <script src="../SlickGrid-master/slick.editors.js"></script>
    <script src="../SlickGrid-master/slick.grid.js"></script>
    <!-- jqplot stuff -->

    <!--[if lt IE 9]>
    <![endif]-->
    <script  src="../js/excanvas/excanvas.js"></script>
    <script  src="../js/jquery.jqplot.min.js"></script>

    <script  src="../js/plugins/jqplot.canvasTextRenderer.min.js"></script>
    <script  src="../js/plugins/jqplot.canvasAxisLabelRenderer.min.js"></script>
    <script  src="../js/plugins/jqplot.highlighter.min.js"></script>
    <script  src="../js/plugins/jqplot.cursor.min.js"></script>
    <script  src="../js/plugins/jqplot.bubbleRenderer.min.js"></script>
   <script  src="../js/plugins/jqplot.dateAxisRenderer.min.js"></script>

    <!-- Trying to get a bloody paginator to work! -->
    <script src="../js/jqPagination-master/js/jquery.jqpagination.js"></script>

    <!-- I use Stuart Banerman's hashcode to map award names to colors reliably: https://github.com/stuartbannerman/hashcode -->
    <script src="../js/hashcode-master/lib/hashcode.min.js"></script>

  <link href="../js/feedback_me/css/jquery.feedback_me.css" rel="stylesheet" type="text/css" />
  <script  src="../js/jquery-ui.min.js"></script>
  <script  src="../js/feedback_me/js/jquery.feedback_me.js"></script>
  <script  src="./js/feedback.js"></script>
  <script  src="./js/StandardFunctions.js"></script>
  <script  src="./js/Utility.js"></script>
  <script  src="./js/result_rendering.js"></script>
  <script  src="./js/plot_rendering.js"></script>
  <script  src="./js/grid_rendering.js"></script>
  <script  src="./js/header.js"></script>
  <script  src="./js/GUISpecifics.js"></script>
  <script  src="./js/pagination.js"></script>
  
  <script  src="../gui/MorrisDataDecorator/js/handlers.js"></script>

 <script>

HANDLER_NAMESPACE_OBJECT.decoration_add_dialog_id = "#dialog";

$(HANDLER_NAMESPACE_OBJECT.decoration_add_dialog_id).dialog({
    autoOpen: false,
    modal: false,
    buttons: [],
    open: function(event, ui){
     setTimeout("$('#dialog').dialog('close')",1500);
    }
});


$(document).ready(function(){

    setInterval(checksession,5000)
    //validatesession()
    if (!window.addEventListener){
        alert_message = "N"
        checksession()
        //window.attachEvent('onpageshow',checksession);
    }
    else{
        alert_message = "N"
        checksession()
        //alert('Window')
        //window.addEventListener('pageshow',checksession,false);
    }

    function checksession() {
            $.ajax({
                type:'POST'
                ,url:'CheckSession'
                ,success: validateresult
                ,data: { antiCSRF : '{{acsrf}}',
                       session_id: '{{session_id}}'}
		,error: function (jqXHR, exception) {
             if (jqXHR.status === 0) {
		return;
                 //alert('Not connect.\n Verify Network.');
             } else if (jqXHR.status == 404) {
                 alert('Requested page not found. [404]');
             } else if (jqXHR.status == 500) {
                 alert('Internal Server Error [500].');
             } else if (exception === 'parsererror') {
                 alert('Requested JSON parse failed.');
             } else if (exception === 'timeout') {
                 alert('Time out error.');
             } else if (exception === 'abort') {
                 alert('Ajax request aborted.');
             } else {
                 alert('Uncaught Error.\n' + jqXHR.responseText);
             }
         }
                })
	}
        function validateresult(session_ind){
                //alert('validate result called_for = ' + called_for)
                if (session_ind == "Y"){
                        alert_message = "Y"
                        //if (called_for == "SEARCH") {formSubmit()}
                        //else if (called_for == 'DATA') { $('#datasetform').submit();}
                        //else if (called_for == 'FEEDBACK') { createfeedback()}
                        //else if (called_for == 'HELP') {createhelp()}
                }else{
                        if (alert_message == "Y") {
                alert("Your session has been timed-out based upon GSA Security Policy. Please click OK to be redirected to the login page to start a new session.");
                }
                   alert_message = "Y";
                   window.location = './';

                }
            }


	$( "#ad1,#ad2,#ad3,#ad4,#ad5,#fd1,#fd2,#fd3,#fd4,#d5,#d6,#d7,#d8,#d9,#d10,#d11,#d12,#d13,#d14,#d15,#d16,#d17,#d18,#d19,#d20,#d21,#d22 , #d23 , #d24 , #d25 , #d26 , #d27 , #d28 ,#d29 , #d30 , #d31 , #d32 , #d33 , #d34 , #d35 , #d36 , #d37 , #d38 , #d39 , #d40 , #d41 , #d42 , #d43 , #d44 , #d45 , #d46 , #d47 , #d48 ,#d49 , #d50 , #d51 , #d52 , #d53, #d54, #d55, #d56, #d57, #d58, #d59 ,#d60, #d61, #rd1, #rd2, #rd3, #rd4, #rd5, #nit1, #nit2, #nit3 ").on('click',function(e){
		val = $(this).html()
		ga('send',{
			'hitType':'event'
			,'eventCategory':'Download'
			,'eventAction':'click'
                        ,'eventLabel': val
		});
		 var filenm = $(this).text().trim()
		console.log('filenm ='+filenm)
                $('#filename').val(filenm)
		    $('#fileform').submit()
		e.preventDefault()
		//var that=this;
		//_gaq.push(['_trackEvent','Download','PDF',this.href]);
		//setTimeout(function()
	//		{location.href=that.href;},400)
	//		;return false;
	})
	
	$("#mainsearchbutton").click(function() {
           $('#fakeReturnForm').submit();
	});
	/*
	$('#feedbackdialogbox').dialog({
        autoOpen:false,
        width:500,
        height:380,
        modal:true
	})
 
	$("#feedback_submit").click(function() {
        name =  $("#feedback_name").val(),
        message =  $("#feedback_message").val(),
        //email =  $("#feedback_email").val(),
        radio_list_value =  $("input[name='rating']:checked").val()
        if (message.length == 0){
                alert("Please enter a message")
        }
        else {
        $.post("record_feedback",
     { antiCSRF: '{{acsrf}}',
       session_id: '{{session_id}}',
       message: message,
       name: name,
       radio_list_value: radio_list_value
     },
     displayfeedbackmsg
    ).fail(function() { alert("Unable to send the feedback email"); });

        function displayfeedbackmsg(){
                alert("Thank you for your feedback.")
                $("#feedback_name").val(""),
		$("#feedback_message").val(""),
		$("input[name='rating']").checked = false
		$('.rating-radio').prop('checked', false);
                $( "#feedbackdialogbox" ).dialog( "close") ;
        }

     }
    
    });
    */

	
	$( '#FeedbackLink' ).click(function(){
		createfeedback()
	   })
	   
	   
	function formSubmit()
	{
	    if ($("#search_string").val().length != 0) {
	        $("#bigsearchform_new").submit();
	   } else {
	        alert("Please enter a search term!");
	   }
	}
	$('#searchButton1').click( function() {
		formSubmit()
	});
     $("#bigsearchform_new").submit(function() {
         if ($("#search_string").val().length != 0) {
                return true;
           } else {
                alert("Please enter a search term!");
                return false;
   }
  });


	

    $("#feedback_submit").click(function() {
        name =  $("#feedback_name").val(),
        message =  $("#feedback_message").val(),
        //email =  $("#feedback_email").val(),
        radio_list_value =  $("input[name='rating']:checked").val()
        if (message.length == 0){
                alert("Please enter a message")
        }
        else {
           $.ajax({
                type:'POST'
                ,url:'record_feedback'
                ,data: { antiCSRF : '{{acsrf}}'
                      ,session_id: '{{session_id}}'
                      ,message:message
                      ,name:name
                      ,radio_list_value:radio_list_value}
                ,success: function(textStatus,jqxhr){
                                displayfeedbackmsg(textStatus,jqxhr)
                                }
                ,error: function(jqXHR, exception) {
            if (jqXHR.status === 0) {
                return;
                //alert('Not connect\n Verify Network.');
            } else if (jqXHR.status == 404) {
                alert('Requested page not found. [404]');
            } else if (jqXHR.status == 500) {
                alert('Internal Server Error [500].');
            } else if (exception === 'parsererror') {
                alert('Requested JSON parse failed.');
            } else if (exception === 'timeout') {
                alert('Time out error.');
            } else if (exception === 'abort') {
                alert('Ajax request aborted.');
            } else {
                alert('Uncaught Error\n' + jqXHR.responseText);
            }
                }
        })
        function displayfeedbackmsg(){
                alert("Thank you for your feedback.")
                $("#feedback_name").val(""),
                        $("#feedback_message").val(""),
                        $("input[name='rating']").checked = false
                        $('.rating-radio').prop('checked', false);
                        $( "#feedbackdialogbox" ).dialog( "close") ;
                        $('#feedbackNum_counter').text(500)
        }}
})
$("#logoutLink").click(Logout);

    $("#return_to_search").click(function() {
  $('#fakeReturnForm').submit();
    });

    $("#pricespaid_logo").click(function() {
  $('#fakeReturnForm').submit();
    });

});


// These should probably be parametrized
var portfolio_url = "/gui/portfolio";
var portfolio_url_addendum = "?antiCSRF={{acsrf}}&session_id={{session_id}}";
var portfolio_post_data = {
             antiCSRF: '{{acsrf}}',
             session_id: '{{session_id}}',
};
var tag_url = "/gui/tag";

HANDLER_NAMESPACE_OBJECT.portfolio_url = portfolio_url;
HANDLER_NAMESPACE_OBJECT.portfolio_url_addendum = portfolio_url_addendum;
HANDLER_NAMESPACE_OBJECT.portfolio_post_data = portfolio_post_data;
HANDLER_NAMESPACE_OBJECT.tag_url = tag_url;
HANDLER_NAMESPACE_OBJECT.decoration_add_dialog_id = "#dialog";

PAGE_CONTEXT = {};
PAGE_CONTEXT.render_transaction_delete = false;

DEFAULT_NUM_RESULTS = 100;

// BEGIN set up click handlers
$('#next_button').click(next_handler);
$('#prev_button').click(prev_handler);
$('#like_button').click(like_handler);
$('#dislike_button').click(dislike_handler);
$('#add_portfolio_button').click(add_portfolio_handler);
// $('#add_tag_button').click(add_tag_handler);
// END   set up click handlers

function Portfolio(click) {
      var portfolio = $(this).attr('id').substring("draggable-id-".length);
      $("#portfolioinput").val(portfolio);
      $("#fakeform").submit();
}

function refreshDroppablesPortfolios() {
      $(".droppableportfolio").click(Portfolio);
}


var alert_message = ""
var called_for = ""
HANDLER_NAMESPACE_OBJECT.refresh_droppables = refreshDroppablesPortfolios;

$(document).ready(function(){
        //get_portfolio_list();
//        get_tag_list(refreshDroppablesPortfolios);
  //set up some minimal options for the feedback_me plugin


    }
);


function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}


</script>


</html>
