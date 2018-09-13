<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link href="${pageContext.request.contextPath}/css/main.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/jquery-ui.min.css"
	rel="stylesheet" />
<script src="${pageContext.request.contextPath}/jscript/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/jscript/jquery-ui.min.js"></script>

</head>
<script>
	function validateform(){
		var x = document.forms['fileform']['username'].value;
		if (x == null || x == ""){
			alert("Username can't be empty")
			return false;
			}
		var y = document.forms['fileform']['password'].value;
		if (y == null || y == ""){
			alert("Password can't be empty")
			return false;
			}
		var z = document.forms['fileform']['file'].value;
		if (z == null || z == ""){
			alert("Please attach a file");
			return false;
			}
		}
	$(function() {
		
		$("#targetform").on("submit",function(event){
			
			if (validateform() != false){
			$("#status").empty()			
			$("#progressbar").progressbar({
				value : false
			});
			
			progressbarValue.css({
				"background" : '#2EA3A5'
			});

			}
			else{
				event.preventDefault();
				}			
			})
		//$("button")
	//			.on("click",function(event) {
	//						var target = $(event.target), progressbar = $("#progressbar"), progressbarValue = progressbar
	//								.find(".ui-progressbar-value");
//
	//						if (target.is("#numButton")) {
		//						progressbar.progressbar("option", {
			//						value : Math.floor(Math.random() * 100)
				//				});
					//		} else if (target.is("#colorButton")) {
					//			progressbarValue.css({
					//				"background" : '#2EA3A5'
					//			});
					//		} else if (target.is("#falseButton")) {
					//			progressbar.progressbar("option", "value",
					//					false);
					//		}
					//	});
	});
</script>
<style>
#progressbar .ui-progressbar-value {
	background-color: #ccc;
}
</style>
<body>
	<div id="header">
		<div class="logo">
			<img alt="Prices Paid Portal"
				src="${pageContext.request.contextPath}/images/pp_logo_beta_lg.png"
				width="312" height="36" align="left" title="Prices Paid Portal logo">
		</div>
	</div>
	<br>

	<div id="leftcontent">&nbsp;</div>
	<div id="maincontent">

		<!--  <div id="progressbar"></div>
		<button id="numButton">Random Value - Determinate</button>
		<button id="falseButton">Indeterminate</button>
		<button id="colorButton">Random Color</button>-->
		<h1>P3 File Upload</h1>

		<form action="UploadServlet" method="post" name="fileform" id="targetform"
			enctype="multipart/form-data" >

			<br> <label>Username: &nbsp&nbsp&nbsp</label><input type="text"
				placeholder="Username" name="username"> <br> <br>
			<label>Password:&nbsp&nbsp&nbsp&nbsp&nbsp</label><input type="text"
				placeholder="Password" name="password"> <br> <br>

			<hr>
			<p>
				Select a file : <input type="file" name="file" size="45" />
			</p>
			<br> <input id="submitbut" type="submit" value="Upload" />
			
		<!-- ${obj} -->
		</form>
		
	</div>
	<div id="rightcontent"><div id="status"><c:out value="${obj}" /></div>
	<div id="progressbar-left">&nbsp</div>
	<div id="progressbar"></div>
	<!--  <button id="numButton">Random Value - Determinate</button>
	<button id="falseButton">Indeterminate</button>
	<button id="colorButton">Random Color</button>
	-->
</body>
</html>