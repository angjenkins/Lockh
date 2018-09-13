
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>
<body>
	<script>
		$(document).ready(function() {
			compareMenuActive();
			slideMenu('3');
		});
	
	
		function doSubmit(vfield) {
	 	    document.myForm.submit();
	    
	}
		
		</script>
	
	
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
								<td width="35%"><span class="titleText">OEM Clarifications</span>
								</td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
									<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
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
					<table width="97%">
						<tbody>
							
							<tr>
								<td colspan="6">
									<div style="border: none; width: 103%; margin-left: -12px;"
										class="requirementsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span><c:out value="${orderBean.stdItemDTO.stdItem}" />
												-<c:out value="${orderBean.stdItemDTO.description}" /></span> <br>
											<br>

										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>

					<div class="colorsDiv">
						<div class="grayBg">
							<div class="redColorRow"></div>
							<div class="redColorRow"></div>
							<table width="100%">
								<tbody>
									<tr>
										<td width="50%" height="20px"></td>
										<td valign="middle"></td>
									</tr>
								</tbody>
							</table>
						</div>

						
							<div class="width100">
								<table width="100%" class="vehQtyTable">
									<tbody>
										<tr>
											<td width="15%" class="tdgreenBg">Manufacture:</td>
											<td width="50%"><c:out
													value="${orderBean.contrLineDTO.manufacturerName}" /></td>
											<td width="15%" class="tdgreenBg">Model:</td>
											<td width="20%"><c:out
													value="${orderBean.contrLineDTO.modelDescripton}" /></td>
										</tr>
									</tbody>
								</table>
							</div>

							<table width="100%">
								<tbody>
									<c:forEach items="${orderBean.oemClarificationList}" var="deviation"
										varStatus="loopDetail">
										<tr>
											<td colspan="2">&nbsp;<c:out value="${deviation.desc}" /></td>
										</tr>
									</c:forEach>
									<tr>
										<td colspan="4">&nbsp;</td>
									</tr>
								</tbody>
							</table>

						
						<div class="grayBg">
							<div class="redColorRow"></div>
							<div class="redColorRow"></div>
							<table width="100%">
								<tbody>
									<tr>
										<td width="50%" height="20px"></td>
										<td valign="middle"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					
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
  </form:form>	
	<%@ include file="includeFooter.jsp"%>
</body>