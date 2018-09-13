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

.form-body {
	width: 70%;
	align: center;
	padding: 0 10px 10px 10px;
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
		<form:form id="adminUseViewProfileForm" name="adminUseViewProfileForm"
			method="post" modelAttribute="adminBean" commandName="adminBean">
			<div class="row">
				<div class="col-md-12 mainContent">
				<div class="col-md-1"></div>
					<div class="col-md-11">
						<div class="form-body">
							<div class="vehInfBorder">
								<div class="vehInf vehInfInner40" style="width: 100%">
									<c:choose>
										<c:when test="${adminBean.actionType eq 'Delete'}">
											<span>Here's the record you wish to delete:</span>
										</c:when>
										<c:otherwise>
											<span>View User Profile</span>
										</c:otherwise>
									</c:choose>
								</div>
								<table class="tableWidth100" align="center" cellpadding="5">
									<tr>
										<td>&nbsp;</td>
										<td width="52%">&nbsp;</td>
									</tr>
									<tr>
										<td width="48%" align="right">User Level Rights:</td>
										<td>${adminBean.userCombinedDTO.privilege}</td>
									</tr>
									<tr>
										<td align="right">User Name:</td>
										<td>${adminBean.userCombinedDTO.userID}</td>
									</tr>
									<tr>
										<td align="right">First Name:</td>
										<td>${adminBean.userCombinedDTO.firstName}</td>
									</tr>
									<tr>
										<td align="right">Middle Name</td>
										<td>${adminBean.userCombinedDTO.middleName}</td>
									</tr>

									<tr>
										<td align="right">Email:</td>
										<td span="2">${adminBean.userCombinedDTO.email}</td>
									</tr>
									<tr>
										<td align="right">Telephone Number:</td>
										<td>${adminBean.userCombinedDTO.telephone}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Extension:&nbsp;${adminBean.userCombinedDTO.telephoneExt}</td>
									</tr>
									<tr>
										<td align="right">Other Tel. No.</td>
										<td>${adminBean.userCombinedDTO.otherTelephone}</td>
									</tr>
									<tr>
										<td align="right">Address:</td>
										<td>${adminBean.userCombinedDTO.address1}</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>${adminBean.userCombinedDTO.address2}</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>${adminBean.userCombinedDTO.address3}</td>
									</tr>
									<tr>
									<tr>
										<td align="right">City:</td>
										<td>${adminBean.userCombinedDTO.city}</td>
									</tr>
									<tr>
									<tr>
										<td align="right">State:</td>
										<td>${adminBean.userCombinedDTO.state}</td>
									<tr>
										<td align="right">Country:</td>
										<td>${adminBean.userCombinedDTO.country}</td>
									</tr>
									<tr>
										<td align="right">Zip Code:</td>
										<td>${adminBean.userCombinedDTO.zipcode}</td>
									</tr>
									<tr>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td colspan="2" align="center">
										<c:choose>
												<c:when test="${adminBean.actionType eq 'Delete'}">
													<input name="button" type="button" class="greenDiv"
														value="Delete"
														onclick="location.href='/AutoChoice/Admin/${adminBean.userIndex}/Delete'" />
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="button"
														type="button" onclick="location.href='/AutoChoice/Admin'"
														class="greenDiv" value="Cancel" />
												</c:when>
												<c:otherwise>
													<input type="button"
														onclick="location.href='/AutoChoice/Admin'"
														class="greenDiv" value="Back to User Listing" />
												</c:otherwise>
										</c:choose>
										</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
								</table>
							</div>


						</div>
						<br>
					</div>
				</div>
			</div>
			<p class="text-warning">&nbsp;&nbsp;</p>
		</form:form>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>
