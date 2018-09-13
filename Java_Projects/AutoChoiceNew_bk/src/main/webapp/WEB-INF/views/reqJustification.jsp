
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>

<script>
	function doSubmit(vfield) {
 	    document.myForm.submit();
    
}
</script>

<body>
	<br>

 <form:form commandName="orderBean" modelAttribute="orderBean" method="post"  name="myForm" >

	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<%@ include file="includeLeftmenu.jsp"%>
				<div class="col-md-9">
					<%@ include file="includePagenav.jsp"%>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="25%"><span class="titleText">Note</span></td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#" onclick="goBack();" >&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
								</td>
								<td width="27%">
									<div class="extraOptions" onclick="javascript:window.print();">
										<img width="20" title="Print" src="resources/img/printer.png"
											alt="Print">&nbsp; print
									</div> <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
								</td>
							</tr>
						</tbody>
					</table>
         
 
					<div class="optionsMainDiv">
						<div class="headerDiv">
							<div class="circledDiv"></div>
							<span>8E-SEDAN, SUBCOMPACT, ELECTRIC VEHICLE</span> <br>
							<br>
							<ul style="margin-left: -23px;" class="minibreadCrumb">
								<li class="seperator"><a href="#">Note</a></li>
								<li>Summary</li>
							</ul>
						</div>
						<br>
						<br>
						<div class="vehInfBorder">
							<div class="padding10">
								<p></p>
								<p>Other than Low Offer Justification In accordance with FAR
									part 16.505 you must provide a written justification when the
									lowest priced vehicle as equipped is not selected. Your best
									value justification will be included in the order file and is
									subject to IG review.</p>
									 <textarea name="reqJust.justification" rows="10" cols="80" class="noteTextarea" ><c:out value="${reqJust.justification}"/></textarea>
                                     <form:input type="hidden" path ="reqJust.caseNo"/>		<!-- for edit purposes	-->						 
								<br>
								<br> 
								<div style="text-align: center;">
									<input type="button" value="Submit"  onclick="doSubmit(this);" class="greenDiv">
								</div>
							</div>
						</div>
						<div class="width100 topMargin13">
							<table width="97%" class="littleMargin">
								<tbody>
									<tr>
										<td width="35%">&nbsp;</td>
										<td width="35%" class="rightPadding105">
											<div class="simplePagination">
												<ul>
													<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
													<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
												</ul>
											</div>
										</td>
										<td width="27%">&nbsp;</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
 </form:form>  	
	<%@ include file="includeFooter.jsp"%>
</body>
</html>