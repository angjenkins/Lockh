<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/datepicker.js" />"></script>

<script>
	$(document).ready(function() {

		$('#dp1').datepicker();
		$('#dp2').datepicker();
	});
</script>
<style>
.tableHeader th {
	padding: 9.5px;
}

.note {
	color: #9B0303;
	font-weight: bold;
}
</style>

</head>
<body>
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<ul id="breadcrumbs-one">
			<div id="breadcrumb">
				<ul class="crumbs">
				</ul>
			</div>
		</ul>
		<form:form id="adminAddNewGroupForm" name="adminAddNewGroupForm"
			method="post" action="/AutoChoice/AdminAddNewGroup"
			modelAttribute="adminBean" commandName="adminBean">
			<div class="row">
				<div class="col-md-12 mainContent">
					<div class="col-md-1"></div>
					<div class="col-md-11">
						<div class="">
							<table width="97%">
								<tr>
									<td></td>
								</tr>
							</table>
							<table class="littleMargin tableWidth97">
								<tr>
									<td width="35%"><span class="titleText">Add New
											Grouping</span></td>
									<td width="35%" class="rightPadding105">
										<div class="simplePagination">
											<ul>
												<li></li>
												<li><a href="#"></li>
											</ul>
										</div>
									</td>
									<td width="27%">
										<div onClick="javascript:window.print();" class="extraOptions"></div>
									</td>
								</tr>
							</table>
							<table class="tableWidth97">
								<tr>
									<td colspan="6">

										<div class="optionsMainDiv">


											<table class="tableWidth100" align="center">
												<tr>
													<td colspan="2">
														<div class="vehInfBorder">

															<div class="noteDiv">
																<img alt="pin"
																	src="<c:url value="/resources/img/pin.png" />"
																	class="pinImg" />&nbsp; Note*** 00001 is your default
																Grouping it won't allow you to delete it.<br>
																Therefore we suggest to use 00002, 00003, etc. for
																consistency purposes on your Group Code.</br> Nevertheless if
																you wish to create your own Group Code you may do so.
																<div class="redColorRow"></div>
																<div class="redColorRow"></div>
															</div>
															<br />
															<div Class="label12B">
																<c:if test="${fn:length(adminBean.returnMessage) > 0 }">
																	<span class="note"> <c:out
																			value="${adminBean.returnMessage }" />
																	</span>
																</c:if>
															</div>
															<table class="leftSpacing tableWidth100" cellpadding="4">
																<tr>
																	<td>&nbsp;</td>
																	<td>&nbsp;</td>
																</tr>
																<tr>
																	<td width="50%" align="right">Group Code:</td>
																	<td align="left"><c:choose>
																			<c:when test="${adminBean.groupCode ne ''}">
																				<form:input path="groupCode" readonly="true" />
																			</c:when>
																			<c:otherwise>
																				<form:input path="groupCode" />
																			</c:otherwise>
																		</c:choose></td>
																</tr>
																<tr>
																	<td align="right">Group Description:</td>
																	<td><form:input path="groupCodeDesc" /></td>
																</tr>
																<tr>
																	<td colspan="2" align="center"><input
																		name="action" type="submit" class="greenDiv"
																		value="Save">&nbsp;&nbsp;&nbsp;<input
																		type="button" class="greenDiv" value="Close"
																		onclick="location.href='/AutoChoice/AdminGroupAssign'" /></td>
																</tr>
															</table>
														</div>
													</td>
												</tr>
												<tr>
													<td colspan="2"></td>
												</tr>
												<tr>
													<td valign="top" width="50%"></td>
													<td></td>
												</tr>
											</table>
											<div class="width100">
												<table class="tableWidth100">
													<tr>
														<td width="35%">&nbsp;</td>
														<td width="20%">&nbsp;</td>
														<td width="45%">&nbsp;</td>
													</tr>
												</table>
											</div>
											<div></div>

										</div>
									</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
		</form:form>
		<p class="text-warning">&nbsp;&nbsp;</p>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>