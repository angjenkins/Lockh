function Logout() {
      $.post("Logout",
           { antiCSRF: '{{acsrf}}',
             session_id: '{{session_id}}'
        });
      alert("You are now securely logged out.");
      window.location = './';
 }
 function createhelp(){
    var win =  window.open('https://max.omb.gov/community/x/bJRTKg','_blank')
    win.focus();
}
function createfeedback(){
      $( "#feedbackdialogbox" ).dialog( "open") ;
 }



// WARNING!!! My understanding is we can't use jqPlot if 
// we have IE8.  They may want to switch to a simple mode,
// but I will just add a message in the chartdiv!
var isIE8orLower = false;
if (/MSIE (\d+\.\d+);/.test(navigator.userAgent)){ //test for MSIE x.x;
 var ieversion=new Number(RegExp.$1); // capture x.x portion and store as a number
 if (ieversion<9)
    isIE8orLower = true;
}
