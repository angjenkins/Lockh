<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />
<meta http-equiv="cache-control" content="max-age=0" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
<meta http-equiv="pragma" content="no-cache" />
    <title>Prices Paid Portal</title>
    <meta name="robots" content="NOINDEX, NOFOLLOW">

    <link rel="stylesheet" type="text/css" href="theme/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="./theme/css/decoration_gui.css" >
    <link href="./theme/css/shared.css" rel="stylesheet" type="text/css" media="screen, projection">
    <link href="./theme/css/mainPage.css" rel="stylesheet" type="text/css" media="screen, projection">
    <link rel="stylesheet" href="../SlickGrid-master/slick.grid.css" type="text/css">
    <!--<link rel="stylesheet" href="//code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />-->
    <link rel="stylesheet" href="./theme/css/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="../js/jqPagination-master/css/jqpagination.css">
    <link rel="stylesheet" type="text/css" href="../js/jquery.jqplot.css" >
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

<body>
	<div id="skip-to-content-destination"><a href="#content" class="skip-content">Skip to main content</a></div>
<!--
  <div id="header">
    <div class="col-md-3 col-xs-5 logo">
      <span id="pricespaid_logo"><img src="theme/img/pp_logo_beta.png" alt="PricesPaid"></span>
    </div>
-->
<!--Start of new revised header -->
<div id="header">
    <div class="col-md-3 col-xs-5 logo"><img alt="Prices Paid Portal" id="mainsearchbutton" src="theme/img/pp_logo_beta_lg.png" width="312" height="36" align="left" title="Prices Paid Portal logo"></div>
    <!-- move these links to the right-->
    <div class="newmenu">
	  <ul>
	    <li id="datalink"><a href="#">DATA LIBRARY</a></li>
            <!--<li id="helplink"><a href="./SearchHelp">HELP</a></li>-->
            <li id="helplink"><a href="https://max.omb.gov/community/x/bJRTKg" target="_blank">HELP</a></li>
            <!--<li id="helplink"><a href="#">HELP</a></li>-->
            <li id="FeedbackLink"><a href="#">FEEDBACK</a></li>
            <li id="logoutLink"><a href="#">LOGOUT</a></li>
          </ul>
    </div>
    <!--<div class="col-md-9 col-xs-7">-->
<!--REVISED SEARCH-->
    <div id="mainsearch"><div id="mainsearchbutton" class="searchtitle"> SEARCH:</div><div id="searchbox">
<!--
    <form method="post" action="PricesPaid"> 
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
    <input type="hidden" name="commaodity_id" id="commodity_id" /> -->
    <label style="display:none" for="small_search_string">SEARCH</label>
      <input id="small_search_string" name="search_string" value="{{search_string}}" type="text" class="newsearch rounded " placeholder="Search..." maxlength="500" ><input type="button" id="searchButton1" class="searchButton" title="Click here to search the database" >
    <!--</form>-->
    </div>
    </div>
    <!--end REVISED SEARCH -->
<!-- /.navbar-collapse -->
      
</div>

<form method="post" id="datasetform" action="./DataSets">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>


<!-- Code related to portfolio management
<div id="sidebar" class="col-xs-3">
      <div id="sidebarpaginator"> <span id="paginationHolder2"> </div>

      <div id="sidebar_tab">
        PORTFOLIOS
      </div>
      <div class="sidecontainer">
      <div id='sidebar-manage-results'>
	     <div>
		  <div id="current_portfolio_list"></div>
	     </div>
      </div>

      <div  id="portfolios">
		 <div id="portfolio_list">New Portfolio will appear here</div>
      </div>

      <div>
           <div>
    	        <input type="text" id="new_portfolio_name" placeholder="New Portfolio Name...">
    	        <button type="button" class="btn btn-like" id="add_portfolio_button">Create Portfolio</button>
           </div>
      </div>

      <p> <a href="./theme/movies/PortfolioTutorial.mp4" target="_blank">Watch a tutorial on portfolios</a>
      </p>

</div>

</div>

</div>

</div>

Uncomment the above lines

    <div id="sidebar" class="col-xs-3">
      <div id='sidebar-manage-results'>
        <span>Limit results to: </span>
        <input type="text" id="num_results_to_return" placeholder="100" title="Change number of results returned here. More results will slow your response time. If you find yourself paging through too many results, try adding terms to your search to increase the relevancy of your results, excluding terms by putting a minus sign (-) in front of a term you want to exclude.">


        <div id="sidebarpaginator">   <span id="paginationHolder2"></span> </div>
        {{!portfolio_panel}}


        <a href="./theme/movies/PortfolioTutorial.mp4" target="_blank">Watch a tutorial on portfolios</a>

      </div>
    </div>
  </div>
-->
<br>
    
  <div class="container">
    <div class='row'>
    <!--
      <div class='col-12-xs'>
        <img id="betastripe" src="theme/img/Beta3.0.png"  title="Beta 3.0">
      </div>
      -->
    </div>



    <!-- Content ... below the header -->
    <div id="content">

      <div id="loading">
        <h1>    Searching, Please Wait... </h1>
      </div>


   <div id="results-header">
    <!--<span class="majorlabel" id="optionalPrefix">First &nbsp;</span>-->
    <span class="majorlabel" id="placeForNumberReturned"></span>
    <span class="majorlabel">&nbsp;search results </span>
    <span class="joininglabel">for </span>
    <span class="majorlabel" id="search_string_render"></span>

    </div>


<div id="tabs" >
  <ul>
    <li><a href="#tabs-1">View Results</a></li>
    <li><a href="#tabs-2">View Results Grid</a></li>
    <li><a href="#tabs-3">View Results Graph</a></li>
  </ul>
  
  <div id="tabs-1">

        <div id="sortcontrols">

	<div id="detail-header">
	  <span id="paginationHolder1">
	  </span>
        </div>
	  <span class="results-sortby">
	  <label for="sortColumn">Sort:</label>
	   {{!column_dropdown}}
	  </span>

	  <span class="results-sortdir">
	  <label for="sortOrder">Order:</label>
	   <span id="orderDropdownWrapper">
	      <select id="sortOrder" >
		  <option value="dsc">Descending</option>
		  <option value="asc">Ascending</option>
	     </select>
	   </span>
	  </span>
          <span class="results-perpage"><label for="num_results_to_return">Show Results:</label></span>
          <select id='num_results_to_return'>
            <option value="5">5</option>
            <option value="10">10</option>
            <option value="20" selected="selected">20</option>
            <option value="50">50</option>
            <option value="100">100</option>
            <option value="1000">1000</option>
          </select>

	</div>

         <div class="detailArea">
	 
    <label for="small_search_string_sub">Search Within:</label>
      <input id="small_search_string_sub" name="search_string" type="text" class="newsearch_sub rounded " placeholder="Search..." maxlength="500" ><input type="button" id="searchButton2" class="searchButton_sub" title="Click here to search the database" >
         <a href="#" id="exportLink2"/>Export to Excel&nbsp;<img src="theme/img/ExcelImgSml.gif" width="25" height="25" title="Export to Excel Spreadsheet" style="margin-right:10px" alt="Export to Excel"></a>&nbsp;
         <a href="#" id="exportLink1"/>Export to HTML&nbsp;<img src="theme/img/wwwIcon.png" width="25" height="25" title="Export to HTML" alt="Export to HTML"></a>
         <a href="#" id="exportLink3"/>Export to Word&nbsp;<img src="theme/img/WordSml.gif" width="25" height="25" title="Export to WORD" alt="Export to WORD"></a>
<!--&nbsp;<a href="#">Export to PDF&nbsp;<img src="images/PDFImgSml.gif" width="25" height="25" title="Export to PDF"></a>--></div>


	<div style="clear:both;"></div>
	<div id="detailArea"></div>
	<div style="clear:both"></div>
  </div>

  <div id="tabs-2">
    <a href="tabs-1">
    <p class="readerText">This page is a graphical representation of the search results available under the view results tab </p>
    </a>

    <p>
Clicking on a column header will sort both the grid and the detail area by that column.  Clicking on the header again will reverse the order of the sort.
    </p>
    <div id="myGrid" style="height:500px;"></div>
    <p></p>

     <!--<div style="clear:both"></div>-->
  </div>

  <div id="tabs-3">
	<p>For an accessible representation of the purchasing information in this chart, click the following link <a id="accesslink">(purchasing data table)</a></p>
     <div id="chartContainer">
       <div id="chartdiv" style="height:500px;width:800px"></div>
       <table id="legend1b">
       </table>
     </div>
  </div>


</div>
</div>

<!-- end of "content" -->
</div>



<form id="fakeform" method="post" action="PortfolioPage">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
    <input id="portfolioinput" type="hidden" name="portfolio" value="" />
</form>

<form method="get" id="fakeLogoutForm" action="./">
</form>

<form method="post" id="fakeReturnForm" action="./StartPageReturned">
    <input type="hidden" name="antiCSRF" value="{{acsrf}}" />
    <input type="hidden" name="session_id" value="{{session_id}}" />
</form>

<div id="dialog">
Transaction Added to Portfolio.
</div>
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

{{!footer_html}}
{{!feedback_html}}

</div>
</body>
    <script  src="../js/jquery.min.js"></script>
    <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>-->


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
  <!--<script  src="../js/feedback_me/js/jquery.feedback_me.js"></script>-->
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

    $("#logoutLink").click(Logout);
    /*Portfolio button click
    $("#portfolio-button").hover(
                    function() {
                                $("#sidebar").show() 
                               },
                          function() { $("#sidebar").hide() }    );
    */

      //$("#return_to_search").click(function() {
    $("#mainsearchbutton").click(function() {
            $('#fakeReturnForm').submit();
    });

    $("#pricespaid_logo").click(function() {
  $('#fakeReturnForm').submit();
    });
/*
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
    ).fail(function() { alert("Unable to send the Feedback"); });

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



HANDLER_NAMESPACE_OBJECT.refresh_droppables = refreshDroppablesPortfolios;

$(document).ready(function(){

    validatesession()

    function validatesession(){

    if (!window.addEventListener){
        //alert('call-0')
        alert_message = "N"
	called_for = 'GLOBAL'
        checksession()
        //window.attachEvent('onpageshow',checksession);
    }
    else{
        //alert('call-0')
        alert_message = "N"
	called_for = 'GLOBAL'
        checksession()
        //window.addEventListener('pageshow',checksession(),false);
    }
    }

   $('#exportLink1').click(function(e){
	createHTML()
   })

  $('#exportLink2').click(function(e){
	createXLS()
   })

  $('#exportLink3').click(function(e){
        createWORD()
   })

  $("#datalink").click(function(){
	$('#datasetform').submit();
    })
  $('#accesslink').click(function(){
	$("#tabs").tabs("option", "active", 1)	
})

  $('#FeedbackLink' ).click(function(){
        createfeedback()
   })
   
    
    $('#num_results_to_return').on('change',function(){
        performSearch()
    })
  	
    $(function() {
        $("#tabs").tabs();
    })

	$('#tabs').bind('tabsactivate', function(event, ui) {
	   var index = ui.newTab.index();

	   if (index === 2 ) {
	  initialize_plot(data,medianUnitPrice);
	  grid_rendering()
	   }
	   else if (index === 1) {
	    grid_rendering();
	    initialize_plot(data,medianUnitPrice);

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
        //get_portfolio_list();
//        get_tag_list(refreshDroppablesPortfolios);
/*
	$('#feedbackdialogbox').dialog({
           autoOpen:false,
           width:500,
           height:580,
           modal:true
 })
  */
    }
);

// This is an ugly global variable hack that seems to be
// needed to events properly bound to dynamically created elements!
var SCRATCH_NUMBER = 0;
var called_for = ""
var ajax_call_over = "N";
var session_ind = "";
var alert_message = "Y";
var itemDetailAssociation = [];

// The current desire is that
var colors = [];
var data = [];
var transactionData = [];
var internalFieldLabel = [];
internalFieldLabel["starred"] = "Favorite";
internalFieldLabel["color"] = "Color";

// Note: that search_string here is html-encoded by Bottle,
// So presumably this does not represent a XSS vulnerability...
//$('#search_string_render').html('&ldquo;'+htmlEscape('{{search_string}}')+'&rdquo;');

$('#commodities li').first().addClass("selected");
var currentlySelectedCommodityElement  = '{{commodity_id}}';
$('input[id=small_search_string]').on('keyup', function(e) {
    if (e.which == 13) {
	$('#small_search_string_sub').val("")
	performSearch()
    }
});
$('input[id=small_search_string_sub]').on('keyup', function(e) {
    if (e.which == 13) {
	//$('#small_search_string_sub').val("")
	performSearch()
    }
})

// This is my basic page math...
var PAGESIZE = 5;
var currentPage = 0;


var timeSearchBegan;

var grid;
var currentColumn = "score";

var currentCommodityId = '{{commodity_id}}';

var com = $("#commodityChoice").val(currentCommodityId);

function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}
/*
function createfeedback(){
	alert('loading')
        $('#feedbackdialogbox').dialog({
           autoOpen:false,
           width:500,
           height:580,
           modal:true
    })

        var maxChars = $("#feedback_message");
        var max_length = maxChars.attr('maxlength');
        if (max_length > 0) {
            maxChars.bind('keyup', function(e){
                length = new Number(maxChars.val().length);
                counter = max_length-length;
                $("#feedbackNum_counter").text(counter);
            });
        }

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
        }


     }
    });

}
*/
  
  function createHTML(){
                var standard = standardCommodities[currentCommodityId];
                var search = $('#small_search_string').val();
                var max_results_num = get_max_results();
                window.open("./SimpleHTML?portfolio=no&antiCSRF={{acsrf}}&session_id={{session_id}}&targetpage=main&psc_pattern="+standard+"&search_string="+search+"&max_results="+max_results_num)

}
   function createXLS(){
            var standard = standardCommodities[currentCommodityId];
            var search = $('#small_search_string').val();
            var max_results_num = get_max_results();
            window.open("./SimpleCSV?portfolio=no&antiCSRF={{acsrf}}&session_id={{session_id}}&targetpage=main&psc_pattern="+standard+"&search_string="+search+"&max_results="+max_results_num,'_self')
}

   function createWORD(){
            var standard = standardCommodities[currentCommodityId];
            var search = $('#small_search_string').val();
            var max_results_num = get_max_results();
            window.open("./SimpleWORD?portfolio=no&antiCSRF={{acsrf}}&session_id={{session_id}}&targetpage=main&psc_pattern="+standard+"&search_string="+search+"&max_results="+max_results_num,'_self')
}
 function checksession(called_for) {
        //alert('check-session')

            $.ajax({
                type:'POST'
                ,url:'CheckSession'
                ,success: validateresult
                ,data: { antiCSRF : '{{acsrf}}',
                       session_id: '{{session_id}}'}
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
                alert('Uncaught Error.\n' + jqXHR.responseText);
            }
                }

                })
    }
      function validateresult(session_ind){
                //alert('validate result called_for = ' + called_for)
                if (session_ind == "Y"){
                        alert_message = "Y"
                        //if (called_for == "HTML"){createHTML()}
                        //else if (called_for == "XLS") {createXLS()}
                        //else if (called_for == "WORD") {createWORD()}
                        //else if (called_for == "GLOBAL" || called_for == "SEARCH" || called_for == "ENTER" || called_for =="CHANGE") {performSearch()}
                        //else if (called_for == 'DATA') { $('#datasetform').submit();}
                        //else if (called_for == 'FEEDBACK') { createfeedback() ;}
                        //else if (called_for == 'HELP') {createhelp()}
                }else{
			if (alert_message == "Y") {
                alert("Your session has been timed-out based upon GSA Security Policy. Please click OK to be redirected to the login page to start a new session.");
		}
		   alert_message = "Y";
                   window.location = './';

                }
            }

function get_max_results() {
    var max_results = $('#num_results_to_return').val();
    var max_results_num = parseFloat(max_results);
    //if (!isNumber(max_results_num)) {
    //   max_results_num = DEFAULT_NUM_RESULTS;
    //}
     return max_results_num;
}
$('#searchButton1').click(function(){
	$('#small_search_string_sub').val("")
	performSearch()
}
)
$('#searchButton2').click(function(){
    var search = $('#small_search_string').val().length;
    var sub_string_search = $('#small_search_string_sub').val().length;

    if (search == 0) {alert('Enter a Search Term before you can do a sub-search')}
    else if (sub_string_search == 0) {alert("Enter a search term to search results")}
    else {performSearch()}
}
)


function performSearch(){
    $('#sortColumn').val("score");
    $('#sortOrder').val("dsc");
    $('#loading').show();
    $('#results-header').hide();
    timeSearchBegan = new Date();
    var standard = standardCommodities[currentCommodityId];
    var search = $('#small_search_string').val();
    var sub_search = $('#small_search_string_sub').val();
    var sub_search_length = $('#small_search_string_sub').val().length;
    //alert('sub_search_length = ' + sub_search_length)
    if (sub_search_length == 0) {
	    var search_string = search
            var main_search = "Y"
    }else{
	    var search_string = sub_search
	    var main_search = "N"
    }
    //alert('main_search = ' + main_search)  
    //alert('search string = ' + search_string)  
    var max_results_num = get_max_results();

    if (search.length == 0) {
      processAjaxSearch([]);
     } else {
      //$('#search_string_render').html('&ldquo;'+htmlEscape(search_string)+'&rdquo;');
      $.post("search",
     { search_string: search_string,
             antiCSRF: '{{acsrf}}',
             session_id: '{{session_id}}',
             psc_pattern: standard,
             numRows: max_results_num,
             main_search:main_search
     },
     processAjaxSearch
    ).fail(function() { alert("The search failed in some way; please try something else."); });
    }
};

    var comclickcount = 0;
    $("#comDropdownWrapper").click(function(){
  if ((comclickcount % 2) == 1) {
      var com = $("#commodityChoice").val();
      currentCommodityId = com;
            performSearch();
  }
  comclickcount++;
    });


function processAjaxSearch(dataFromSearch) {
    //console.log(JSON.stringify(dataFromSearch))
    numFound = dataFromSearch.numFound
    searchstring = dataFromSearch.searchstring.split("&&")
    var text = []
    for (each in searchstring){
	//text.push(  "'" + searchstring[each].trim() + "'"  )}
	text.push(  "'" + $.trim(searchstring[each]) + "'"  )}
    var text1 = text.join('    +     ')
    if (dataFromSearch.numFound == 0) {
	numFound = 0
	}else{
    numFound =  numberWithCommas(numFound)}
    delete dataFromSearch.numFound
    delete dataFromSearch.searchstring


    //console.log('text = ' + text)

    dataFromSearch = handleEmptyResults(dataFromSearch);

    $('#loading').hide();
    $('#results-header').show();
    var timeSearchEnded = new Date();
    transactionData = [];
    data = [];
    var totalNumber = 0;
    for (var key in dataFromSearch) {
        transactionData[totalNumber++] = dataFromSearch[key];
    }
    var numberDiv = document.getElementById('placeForNumberReturned');
    //numberDiv.innerHTML = totalNumber;
    numberDiv.innerHTML = numFound
    $('#search_string_render').html(text1)
    //var max_results_num = get_max_results();
    	//alert('totalNumber =' + totalNumber)
    $('#optionalPrefix').show();
    //if (totalNumber >= max_results_num) {
    //   $('#optionalPrefix').show();
    //} else {
    //   $('#optionalPrefix').hide();
    //}
recreatePagination();

// Note: This counts the Page from 1, not zero!
// $(document).ready(function() {
  
  if (totalNumber == 0){
  	maxpage = 1
  }else
  {
  	maxpage = Math.ceil(totalNumber/PAGESIZE)
  }
  $('.pagination').jqPagination({
//    link_string : '/?page={page_number}',
    link_string : '',
    max_page  :  maxpage,
    currentPage     : 1,
    paged   : function(page) {
                currentPage = page - 1;
                redrawDetailArea(transactionData,currentPage);
    }
  });

// });

    var secondsSpent = (timeSearchEnded-timeSearchBegan)/1000.0;
    $('#timeSpentRender').text(secondsSpent.toFixed(2));

    var medianUnitPrice = 0.0;

    grid_rendering();
    initialize_plot(data,medianUnitPrice);
  }

  performSearch();

</script>


</html>
