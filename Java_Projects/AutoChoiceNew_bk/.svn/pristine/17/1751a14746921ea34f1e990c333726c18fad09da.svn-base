<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/datepicker.js" />"></script>
<script src="js/readmore.js"></script>

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
		<form:form id="adminUserEditProfileForm"
			name="adminUserEditProfileForm" method="post"
			action="/AutoChoice/AdminUserProfile" modelAttribute="adminBean"
			commandName="adminBean">
			<div class="row">
				<div class="col-md-12 mainContent">
				<div class="col-md-1"></div>
					<div class="col-md-11">
						<div class="form-body">

							<div class="vehInfBorder">
								<div class="vehInf vehInfInner100">
									<span>Edit User Profile</span>
								</div>
								<br />
								<div Class="label12B">
									<c:if test="${fn:length(adminBean.returnMessage) > 0 }">
										<span class="note"> <c:out
												value="${adminBean.returnMessage }" />
										</span>
									</c:if>
								</div>
								<table class="tableWidth97" align="center" cellpadding="5">
									<tr>
										<td>&nbsp;</td>
										<td width="50%">&nbsp;</td>
									</tr>
									<tr>
										<td width="50%" align="right">Group Assignment:</td>
										<td><form:input path="groupCode" class="box180"
												readonly="true" /></td>
									</tr>
									<tr>
										<td align="right">User Level Rights:</td>
										<td><form:select path="userCombinedDTO.privilege"
												id="privilegeId">
												<form:options items="${adminBean.privilegeMap}" />
											</form:select></td>
									</tr>
									<tr>
										<td align="right">User Name:</td>
										<td><form:input path="userCombinedDTO.userID"
												class="address" readonly="true" /></td>
									</tr>
									<tr>
										<td align="right">First Name</td>
										<td><form:input path="userCombinedDTO.firstName"
												class="address" size="20" maxlength="20" /></td>
									</tr>
									<tr>
										<td align="right">Last Name</td>
										<td><form:input path="userCombinedDTO.lastName"
												class="address" size="20" maxlength="20" /></td>
									</tr>
									<tr>
										<td align="right">Middle Initial:</td>
										<td><form:input path="userCombinedDTO.middleName"
												class="smallinput" size="3" maxlength="3" /></td>
									</tr>
									<tr>
										<td align="right">Email:</td>
										<td><form:input path="userCombinedDTO.email"
												class="address" size="30" maxlength="50" /></td>
									</tr>
									<tr>
										<td align="right">Telephone Number:</td>
										<td><form:input path="userCombinedDTO.telephone"
												size="10" maxlength="10" />&nbsp;Ext:<form:input
												path="userCombinedDTO.telephoneExt" class="smallinput"
												size="5" maxlength="5" /></td>
									</tr>
									<tr>
										<td align="right">Other Tel. No.</td>
										<td><form:input path="userCombinedDTO.otherTelephone"
												size="15" maxlength="15" /></td>
									</tr>
									<tr>
										<td align="right">Requisitioner Address:</td>
										<td><form:input path="userCombinedDTO.address1"
												class="address" size="20" maxlength="35" /></td>
									</tr>
									<tr>
										<td></td>
										<td><form:input path="userCombinedDTO.address2"
												class="address" size="20" maxlength="35" /></td>
									</tr>
									<tr>
										<td></td>
										<td><form:input path="userCombinedDTO.address3"
												class="address" size="20" maxlength="35" /></td>
									</tr>
									<tr>
									<tr>
										<td align="right">City:</td>
										<td><form:input path="userCombinedDTO.city" size="20"
												maxlength="20" /></td>
									</tr>
									<tr>
									<tr>
										<td align="right">State:</td>
										<td><form:select path="userCombinedDTO.state"
												id="stateId">
												<c:forEach var="item"
													items="${adminBean.userCombinedDTO.stateList}"
													varStatus="status">
													<c:choose>
														<c:when
															test="${adminBean.userCombinedDTO.state == item.state}">
															<form:option value="${item.state}" selected="selected">${item.stateName}</form:option>
														</c:when>
														<c:otherwise>
															<form:option value="${item.state}">${item.stateName}</form:option>
														</c:otherwise>
													</c:choose>
												</c:forEach>
											</form:select></td>
									<tr>
										<td align="right">Country:</td>
										<td><form:input path="userCombinedDTO.country"
												class="box180" size="10" maxlength="10" /></td>
									</tr>
									<tr>
										<td align="right">Zip Code:</td>
										<td><form:input path="userCombinedDTO.zipcode"
												class="smallinput" size="5" maxlength="5" /></td>
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
										<td colspan="2" align="center"><input type="submit"
											name="action" class="greenDiv" value="Save" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="button"
											type="button" onclick="location.href='/AutoChoice/Admin'"
											class="greenDiv" value="Cancel" /></td>
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
			<form:hidden path="userCombinedDTO.groupCode" />
			<form:hidden path="userCombinedDTO.agencyCode" />
			<form:hidden path="userCombinedDTO.bureauCode" />
		</form:form>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>
