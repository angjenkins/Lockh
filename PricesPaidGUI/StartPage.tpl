<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="pragma" content="no-cache" />

    <meta charset="UTF-8">
    <title>Prices Paid Portal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="theme/css/bootstrap.css">
    <link href="./theme/css/shared.css" rel="stylesheet" type="text/css" media="screen, projection">
    <link href="./theme/css/mainPage.css" rel="stylesheet" type="text/css" media="screen, projection">
    <link rel="stylesheet" href="./theme/css/jquery-ui.css" />
    {{!goog_anal_script}}
<style>
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

</style>
</head>

<body id="start">
<div id="skip-to-content-destination"><a href="#startContent" class="skip-content">Skip to main content</a></div>
<!--
<img id="betastripe" src="theme/img/Beta3.0.png"  alt="Beta 3.0">
-->
<div id="header">
    <div class="col-md-3 col-xs-5 logo"><img alt="Prices Paid Portal" src="theme/img/pp_logo_beta_lg.png" width="312" height="36" align="left" title="Prices Paid Portal logo"></div>
    <div class="newmenu">
            <ul>
	    <!--<li style="display:none" id="timeout">{{timeout}}</li>-->
            <!--<li id="timeout">{{timeout}}</li>-->
	    <!--<li id="dataload"><a href="#">DATA LOAD</a></li>-->
            <li id="datalink"><a href="#">DATA LIBRARY</a></li>
            <!--<li id="helplink"><a href="./SearchHelp">HELP</a></li>-->
	    <!--<li><a href="#" class="helplink">HELP</a></li>-->
            <li id="helplink"><a href="https://max.omb.gov/community/x/bJRTKg" target="_blank">HELP</a></li>
            <li id="logoutLink"><a href="#">LOGOUT</a></li>
          </ul>
        </div>
</div>

<form method="get" id="fakeLogoutForm" action="./" >
</form>
<form method="post" id="fakeReturnForm" action="./PricesPaid">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>

<form method="post" id="datasetform" action="./DataSets">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>
<form method="post" id="dataloadform" action="./DataLoads">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>



<div id="startContent">
	  <h2>Welcome to the Prices Paid Portal (P3)!</h2>
	  <h3>The database currently contains these datasets</h3>
    <p><ul style="padding-left:0px">
    	<li><span style="font-weight:bold">OS2 --</span> Office Supply sales from the Strategic Sourcing Initiative (FSSI) OS2 BPAs.</li>
       <li><span style="font-weight:bold">GSA Advantage! --</span> Sales from the GSA Advantage! system.</li>
       <li><span style="font-weight:bold">GSA Federal Supply System (FSS-19) --</span> Stored Stock Orders, Special Orders Program, <br> Expanded Direct Delivery, and Schedule Orders sales from the GSA Federal Supply System.</li>
       <li><span style="font-weight:bold">NITCP --</span> IT commodity sales from the GSA National Information Technology Commodity Program BPAs.</li>
    </ul></p>

	  <h3>Begin by entering the term you want to search for</h3>
	<div id="startsearch">
	<!--<div id="startsearchbox">-->
		<form id="bigsearchform_new" method="post" action="PricesPaid">
                        <label style="display:none" for="search_string">SEARCH</label>
			<input id="search_string" name="search_string" type="text" class="startnewsearch rounded" placeholder="Search..." maxlength="500" >
			<input id="searchButton1"  type="button" class="searchButton" title="Click here to search the database">
			<input type="hidden" name="antiCSRF" value="{{acsrf}}" />
			<input type="hidden" name="session_id" value="{{session_id}}" />
			<input type="hidden" name="commodity_id" id="commodity_id" />
		</form>
	<!--</div>-->
	</div>
	
	<br>
	<br>
        <div id="startContent">
	<p><span style="font-weight:bold">Disclaimer: </span>Please note that data accessible through P3 is not guaranteed to be accurate, complete or current and may not have been verified or validated.<br>  Any use of and any decisions you take based upon the data are at your own risk. <br> In no event shall the General Services Administration, or the U.S. Government, have any liability to any party arising out of, or in connection with, such data.</p>
	</div>
</div>

{{!footer_html}}
</body>
    <script src="../js/jquery.min.js"></script>
    <script  src="./js/header.js"></script>
<script>

var called_for = ""
var alert_message = ""

$(document).ready(function(){
    setInterval(checksession,5000)
    //Increment the idle time counter every minute.
    //var idleInterval = setInterval(timerIncrement, 60000); // 1 minute

    //Zero the idle timer on mouse movement.
    //$(this).mousemove(function (e) {
       // idleTime = 0;
    //a});
	/*
    $(this).keypress(function (e) {
        idleTime = 0;
    });
    });

    function timerIncrement() {
    idleTime = idleTime + 1;
    if (idleTime > 19) { // 20 minutes
	alert("Your session has been timed-out based upon GSA Security Policy. Please click OK to be redirected to the login page to start a new session.");
        window.location = './';
    }
*/
    //http://stackoverflow.com/questions/6363199/pageshow-event-in-javascript - pageshow is replaced with onpageShow to support IE8
    
    if (!window.addEventListener){
        //alert('Not Window')
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
	//alert('check session called')
	    $.ajax({
                type:'POST'
                ,url:'CheckSession'
                ,data: { antiCSRF : '{{acsrf}}',
                       session_id: '{{session_id}}'}
                ,success: function(session_ind,textStatus,jqxhr){
				validateresult(session_ind,textStatus,jqxhr)
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
	function validateresult(session_ind){
                //alert('validate result called_for = ' + called_for)
                if (session_ind == "Y"){
                        alert_message = "Y"
                        //if (called_for == "SEARCH" || called_for =="ENTER" ) {formSubmit()}
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

    }

     $("#datalink").click(function(){
	$('#datasetform').submit();
    })

     $("#dataload").click(function(){
	$('#dataloadform').submit();
    })
    $("#logoutLink").click(Logout);

    $("#pricespaid_logo").click(function() {
	$('#fakeReturnForm').submit();
    });

    function formSubmit()
    {
    if ($("#search_string").val().length != 0) {
        $("#bigsearchform_new").submit();
       } else {
        alert("Please enter a search term!");
         }
   }

   $("#bigsearchform_new").submit(function() {
	 if ($("#search_string").val().length != 0) {
		return true;
	   } else {
		alert("Please enter a search term!");
		return false;
   }
  });

$('#searchButton1').click(function(){
	formSubmit()
}
);
 
});

</script>

</html>

