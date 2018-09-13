<!DOCTYPE html> 
<html>
    <head>
 <meta http-equiv="X-UA-Compatible" content="IE=EDGE;IE=9; IE=8; IE=7; " />
 
       <title>Prices Paid Portal</title>
       <meta name="robots" content="NOINDEX, NOFOLLOW">
    <link href="/gui/theme/css/loginPage.css" rel="stylesheet" type="text/css" media="screen, projection">
    <link href="/gui/theme/css/shared.css" rel="stylesheet" type="text/css" media="screen, projection">
    <!--<link rel="stylesheet" href="//code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />-->
    <link rel="stylesheet" href="/gui/theme/css/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="/gui/theme/css/bootstrap.css">
    <script type="text/javascript" src="../js/jquery-latest.pack.js"></script>
    <script src="../js/jquery.min.js"></script>
    <script  src="../js/jquery-ui.min.js"></script>
    {{!goog_anal_script}}
<script type="text/javascript" >
$(document).ready(function() {	

	//select all the a tag with name equal to modal
	$('a[name=modal]').click(function(e) {
		//Cancel the link behavior
		e.preventDefault();
		
		//Get the A tag
		var id = $(this).attr('href');
	
		//Get the screen height and width
		var maskHeight = $(document).height();
		var maskWidth = $(window).width();
	
		//Set heigth and width to mask to fill up the whole screen
		$('#mask').css({'width':maskWidth,'height':maskHeight});
		
		//transition effect		
		$('#mask').fadeIn(1000);	
		$('#mask').fadeTo("slow",0.8);	
	
		//Get the window height and width
		var winH = $(window).height();
		var winW = $(window).width();
              
		//Set the popup window to center
		$(id).css('top',  winH/2-$(id).height()/2);
		$(id).css('left', winW/2-$(id).width()/2);
	
		//transition effect
		$(id).fadeIn(2000); 
	
	});
	
	//if close button is clicked
	$('.window .close').click(function (e) {
		//Cancel the link behavior
		e.preventDefault();
		
		$('#mask').hide();
		$('.window').hide();
	});		
	
	//if mask is clicked
	$('#mask').click(function () {
		$(this).hide();
		$('.window').hide();
	});			

	$(window).resize(function () {
	 
 		var box = $('#boxes .window');
 
        //Get the screen height and width
        var maskHeight = $(document).height();
        var maskWidth = $(window).width();
      
        //Set height and width to mask to fill up the whole screen
        $('#mask').css({'width':maskWidth,'height':maskHeight});
               
        //Get the window height and width
        var winH = $(window).height();
        var winW = $(window).width();

        //Set the popup window to center
        box.css('top',  winH/2 - box.height()/2);
        box.css('left', winW/2 - box.width()/2);
	 
	});
	
});

</script>
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
<body>
<body style="background-color:#ffffff;">


<!--
{{!extra_login_methods}}

  <form id="fakeLoginViaMaxForm" action="/gui/LoginViaMax" method="get">
  </form>

{{!footer_html}}
-->

<body style="background-color:#ffffff;">

<div id="skip-to-content-destination"><a href="#instructions" class="skip-content">Skip to main content</a></div>

<!--
<div id="beta">
  <img id="betastripe" src="/gui/theme/img/Beta3.0.png"  title="Beta 3.0 icon">
</div>
-->
  
<div id="header">
    <div class="col-md-3 col-xs-5 logo"><img alt="Prices Paid Portal" src="/gui/theme/img/pp_logo_beta_lg.png" width="312" height="36" align="left" title="Prices Paid Portal logo"></div></div>
<br>

<div id="instructions">

	<p id="message"></p>
	<div id="loginBox" >
	<div class="title">Welcome to the Prices Paid Portal</div>
	<div class="logtext">
	Access is limited to Federal Employees only. Authentication is provided through MAX.</br>
	To become a registered MAX user <a href="https://max.omb.gov/maxportal/registrationForm.action"> click here.</a> <a href="https://max.omb.gov/community/display/Egov/PIV+and+CAC+Card+Registration+Instructions"> (Instructions) </a> 
	</div>


	<div id="max" style="float:left;padding-left:130px"> 
	<div class="loginBox">
	  <p style="font-weight:bold;font-size:20px">ANALYZE DATA</p>
	  <p><a href="#rules" name="modal">View Rules of Behavior</a></p>
	  <p><a href="/gui/theme/img/Loginscreen.pdf" >Click here for help logging in</a></p>
	<br>
	  <p><span class="loginButton"><a href='{{!ombmax_redirect_url}}'>Sign On With MAX</a></span></p>
	</div>
	</div>

	<div id="dataload" style="float:left;padding-left:250px"> <div class="loginBox-username">
	<form action="/gui/DataLoads" method="post" id="targetform">
	  <p style="font-weight:bold;font-size:20px">PROVIDE DATA</p>
                <div style="margin-bottom:10px">
                        <!--<span>Username:</span>-->
                        <label for="username" style="color:#428bca"> Username:</label>
                        <input type="text" name="username" id="username">
                </div>
                <div>
                        <!--<span>Password:</span>-->
                        <label for="password" style="color:#428bca"> Password:</label>
                        <input name="password" type="password" id="password">
                </div>
		 <p><div id="fileuploadsubmit">Data Ingest - File Upload</div></p>

                <!--<input  id="fileuploadsubmit" type="submit" value="Data Ingest - File Upload">-->
      </form>
      </div>

	<div align="center" id="basic"> 
	<div class="loginBox-username">
	<form action="/gui/StartPage" method="post">
    		<div style="margin-bottom:10px">
    	  		<!--<span>Username:</span>-->
                        <label for="username"> Username:</label>
     			<input type="text" name="username" id="username">
    		</div>
    		<div>
     			<!--<span>Password:</span>-->
                        <label for="password"> Password:</label>
      			<input name="password" type="password" id="password">
    		</div>
    		<br>
    		<span class="loginButton"> <input  type="submit" value="Sign in with Password"> </span>
	</form>
	</div>
	</div>

	</div>
</div>

      <div style="clear:both"></div>
<br>
<br>
<br>
{{!footer_html}}

<div id="boxes">
<!-- Vehicle Comments -->
<div id="rules" class="window">
	
		<div class="windowheader">Prices Paid Portal Rules of Behavior<a href="#"class="close" style="float:right; color:#000; font-size:12px; margin-top:5px; padding-right: 10px"/>Close</a></div>
		<div id="rulestext">
        <p><span class="rulebold">Usage Agreement</span></p>

<p>This is a Federal computer system and is the property of the United States Government. It is for authorized use only. Unauthorized use of this system is prohibited and may constitute a violation of 18 U.S.C. CB' 1030 or other Federal laws and regulations and may result in criminal, civil, and/or administrative action.</p>

<p>Only Federal employees are authorized to use this system. It is intended for use by Federal acquisition personnel, including but not limited to procurement officials and program offices conducting market research. Contractors, even those assisting the Federal Government with an acquisition, are not authorized to use this system or otherwise obtain information from this system because it may contain contractor information considered to be company confidential. Unauthorized disclosure of company confidential information is subject to the penalties set forth in 18 U.S.C. CB' 1905 and 41 U.S.C. CB' 2105. Information downloaded or otherwise obtained from the system must be protected in accordance with this agreement and may also be considered source selection sensitive pursuant to 41 USC 2101(7) and FAR part 3 in accordance with agency procedures.</p>

<p>By accessing and continuing to use this system, you indicate your awareness of, and consent to, these terms and conditions and acknowledge that there is no reasonable expectation of privacy in the access or use of this computer system. Users (authorized or unauthorized) have no explicit or implicit expectation of privacy in anything viewed, created, downloaded, or stored on this system, including e-mail, Internet, and Intranet use. Any or all uses of this system (including all peripheral devices and output media) and all files on this system may be intercepted, monitored, read, captured, recorded, disclosed, copied, audited, and/or inspected by authorized agency personnel, the Office of Inspector General (OIG),and/or other law enforcement personnel, as well as authorized officials of other agencies. Access or use of this computer by any person, whether authorized or unauthorized, constitutes consent to such interception, monitoring, reading, capturing, recording, disclosure, copying, auditing, and/or inspection at the discretion of authorized agency personnel, law enforcement personnel (including the OIG),and/or authorized officials other agencies. </p></div>
 					
</div>
</div>

<div id="mask"></div>

<script type="text/javascript" >
$(document).ready(function() {	
	$('#fileuploadsubmit').click(function(){
		if (validateform() != false){
			$('#targetform').submit()
                }
                else{
                     event.preventDefault();
                     }

	})
	 

	function validateform(){
                var x = document.forms['targetform']['username'].value;
                //console.log('x.value.length = ' + x.value.length)
                //console.log(x.value.match(/^[0-9a-zA-Z]+$/))
                if (x == null || x == ""){
                        alert("Username can't be empty")
                        return false;
                        }
                //else if (!x.match(/^[0-9a-zA-Z]+$/))
                else if ( (x.length > 16) || (!x.match(/^[0-9a-zA-Z]+$/)) )
                        {
                        alert('Username should be less than 16 characters and alpha-numeric')
                        return false;
                }

                var y = document.forms['targetform']['password'].value;
                if (y == null || y == ""){
                        alert("Password can't be empty")
                        return false;
                        }
                else if ( y.length < 8 || y.length > 20 )
                        {
                        alert('Password should be greater than 8 characters and less than 20 characters')
                        return false;
                }

                //var z = document.forms['targetform']['File Upload'].value;

                //if (z == null || z == ""){
                //        alert("Please attach a file");
                //        return false;
                //        }

                }


	 //$(function() {
         //       $("#targetform").on("submit",function(event){
	//		alert('target form submitted')
        //                if (validateform() != false){
        //                $('#progressbar-load').show();
        //                }
        //                else{
        //                        event.preventDefault();
        //                        }
        //                })
        //});


	//select all the a tag with name equal to modal
	$('a[name=modal]').click(function(e) {
		//Cancel the link behavior
		e.preventDefault();
		
		//Get the A tag
		var id = $(this).attr('href');
	
		//Get the screen height and width
		var maskHeight = $(document).height();
		var maskWidth = $(window).width();
	
		//Set heigth and width to mask to fill up the whole screen
		$('#mask').css({'width':maskWidth,'height':maskHeight});
		
		//transition effect		
		$('#mask').fadeIn(1000);	
		$('#mask').fadeTo("slow",0.8);	
	
		//Get the window height and width
		var winH = $(window).height();
		var winW = $(window).width();
              
		//Set the popup window to center
		$(id).css('top',  winH/2-$(id).height()/2);
		$(id).css('left', winW/2-$(id).width()/2);
	
		//transition effect
		$(id).fadeIn(2000); 
	
	});
	
	//if close button is clicked
	$('.window .close').click(function (e) {
		//Cancel the link behavior
		e.preventDefault();
		
		$('#mask').hide();
		$('.window').hide();
	});		
	
	//if mask is clicked
	$('#mask').click(function () {
		$(this).hide();
		$('.window').hide();
	});			

	$(window).resize(function () {
	 
 		var box = $('#boxes .window');
 
        //Get the screen height and width
        var maskHeight = $(document).height();
        var maskWidth = $(window).width();
      
        //Set height and width to mask to fill up the whole screen
        $('#mask').css({'width':maskWidth,'height':maskHeight});
               
        //Get the window height and width
        var winH = $(window).height();
        var winW = $(window).width();

        //Set the popup window to center
        box.css('top',  winH/2 - box.height()/2);
        box.css('left', winW/2 - box.width()/2);
	 
	});
	
});

</script>

<script>
$(document).ready(function(){
if ('{{message}}' == 'T') {
  $('#message').css("background",'red')
  $('#message').html('Access Denied: You must be a Federal employee and use a PIV/CAC Card to access this application. Please go to  <a href="https://login.max.gov/cas/login?bypassMaxsso=true&renew=true"> OMB MAX </a>,logout, and then login using your PIV/CAC card.')
} else if ('{{message}}'.substring(0,8) == 'DATALOAD'){
	  $('#message').css("background",'red')
	  $('#message').html('{{message}}'.substring(9) )
} 


}
)
</script>

<script>
/*
% import ppGuiConfig

if ('{{ppGuiConfig.BASIC_DISPLAY_VALUE}}' == 'T') {
  $("#basic").show();
} else {
  $("#basic").hide();
}
if ('{{ppGuiConfig.GITHUB_DISPLAY_VALUE}}' == 'T') {
  $("#github").show();
} else {
  $("#github").hide();
}
if ('{{ppGuiConfig.MYUSA_DISPLAY_VALUE}}' == 'T') {
  $("#myUSA").show();
} else {
  $("#myUSA").hide();
}
if ('{{ppGuiConfig.MAX_DISPLAY_VALUE}}' == 'T') {
  $("#max").show();
} else {
  $("#max").hide();
}
*/
% from configs.ppGuiConfig import BASIC_DISPLAY_VALUE, GITHUB_DISPLAY_VALUE, MYUSA_DISPLAY_VALUE, MAX_DISPLAY_VALUE, GITHUB_APPLICATION__PUBLIC_KEY

if ('{{BASIC_DISPLAY_VALUE}}' == 'T') {
  $("#basic").show();
} else {
  $("#basic").hide();
}
if ('{{GITHUB_DISPLAY_VALUE}}' == 'T') {
  $("#github").show();
} else {
  $("#github").hide();
}
if ('{{MYUSA_DISPLAY_VALUE}}' == 'T') {
  $("#myUSA").show();
} else {
  $("#myUSA").hide();
}
if ('{{MAX_DISPLAY_VALUE}}' == 'T') {
  $("#max").show();
} else {
  $("#max").hide();
}


$("#github").click(function () {


// NOTE: This is a valuable example of how to use OAuth.  However, 
// it is not currently used by P3.
// var res = OAuth.initialize('{{!GITHUB_APPLICATION__PUBLIC_KEY}}');

// OAuth.popup('github', 
//   function(err, result) {
//    if (err) {
//       alert("Sorry, authentication failed: "+err);
//    } else {
// // Here we could actually use the access_token to the get the user name, which is 
// // whhat we really need to do.
//    var obj = result.get(result.access_token); 
//    alert("result.access_token ="+ result.access_token);
//   }
//  });


});


$("#max").click(function () {
  $('#fakeLoginViaMaxForm').submit();
});
</script>

</body>
</html>
