$(document).ready(function(){

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
    });*/

})
