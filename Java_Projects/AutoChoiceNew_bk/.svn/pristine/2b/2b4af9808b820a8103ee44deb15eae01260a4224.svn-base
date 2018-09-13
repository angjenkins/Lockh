
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/datepicker.js" />"></script>

<script>
	$(document).ready(
			function() {
				$('th').click(
						function() {
							var table = $(this).parents('table').eq(0);
							var rows = table.find('tr:gt(0)').toArray().sort(
									comparer($(this).index()));
							this.asc = !this.asc;
							if (!this.asc) {
								rows = rows.reverse();
							}
							for (var i = 0; i < rows.length; i++) {
								table.append(rows[i]);
							}

							table.find('tr').removeClass('alternateRow');
							table.find('tr:nth-child(odd)').addClass(
									'alternateRow');
						});

				function comparer(index) {
					return function(a, b) {
						var valA = getCellValue(a, index), valB = getCellValue(
								b, index);
						return $.isNumeric(valA) && $.isNumeric(valB) ? valA
								- valB : valA.localeCompare(valB);
					}
				}

				function getCellValue(row, index) {
					return $(row).children('td').eq(index).html();
				}

				/*Sorting the table on userID on link click*/

				$("#trigger-UserIDSortLink").click(
						function() {
							var $table = $('#userDetailsTableId');
							var rows = $table.find('tr:gt(0)').toArray().sort(
									comparer(0));
							this.asc = !this.asc;
							if (!this.asc) {
								rows = rows.reverse();
							}
							for (var i = 0; i < rows.length; i++) {
								$table.append(rows[i]);
							}

							$table.find('tr').removeClass('alternateRow');
							$table.find('tr:nth-child(odd)').addClass(
									'alternateRow');

							//To avoid default link behaviour 
							return false;
						});
			});

	function getUserDetails(selected) {
		var urlString = "/AutoChoice/UserDetails/" + selected.value;
		window.location = urlString;

	}

	function deleteUser(index) {
		var deleteString = "/AutoChoice/AdminUserProfile/" + index + "/Delete";
		window.location = deleteString;
	}

	function editUser(index) {
		var editString = "/AutoChoice/AdminUserProfile/" + index + "/Edit";
		window.location = editString;
	}

	function viewUser(index) {
		var viewString = "/AutoChoice/AdminUserProfile/" + index + "/View";
		window.location = viewString;
	}
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
		<div class="clrDiv"></div>
		<form:form id="adminForm" name="adminForm" method="post"
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
							<table width="97%" class="littleMargin">
								<tr>
									<td><span class="titleText">Administering Users
											Within the Group.</span></td>
								</tr>
							</table>
							<table width="97%" class="littleMargin">
								<tr>
									<td width="25%">Group Assignment:<form:select
											path="groupCode" id="groupCodeId"
											class="inputBorder width251" onchange="getUserDetails(this);">
											<!-- <form:options items="${onlineSalesBean.saleNumberList}" itemValue="value" itemLabel="description" />-->
											<c:forEach var="item" items="${adminBean.groupCodeList}"
												varStatus="status">
												<c:choose>
													<c:when
														test="${adminBean.groupCodeDesc == item.description}">
														<form:option value="${item.group_Code}"
															selected="selected">${item.description}</form:option>
													</c:when>
													<c:otherwise>
														<form:option value="${item.group_Code}">${item.description}</form:option>
													</c:otherwise>
												</c:choose>
											</c:forEach>
										</form:select></td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<tr>
									<td>Current Sorting: <a href="#"
										id="trigger-UserIDSortLink">User ID</a></td>
								</tr>
							</table>
							<div class="colorsDiv">
								<div class="noteDiv">
									<img alt="pin" src="<c:url value="/resources/img/pin.png" />" class="pinImg" />&nbsp;
									Click on the column heading to Sort by Ascending or Descending
									order.<br>

									<div class="container"></div>

									<div class="redColorRow"></div>
									<div class="redColorRow"></div>
								</div>

							</div>
							<br />
							<div Class="label12B">
								<c:if test="${fn:length(adminBean.returnMessage) > 0 }">
									<span class="note"> <c:out
											value="${adminBean.returnMessage }" />
									</span>
								</c:if>
							</div>
							<table width="97%" summary="List of the administrative staff">
								<tr>
									<td colspan="6">
										<div class="vehInfBorder">
											<table width="100%" class="vehQtyTable"
												id="userDetailsTableId">
												<tr class="tableHeader">
													<th style="cursor: n-resize;" scope="col">UserID</th>
													<th style="cursor: n-resize;" scope="col">FirstName</th>
													<th style="cursor: n-resize;" scope="col">LastName</th>
													<th style="cursor: n-resize;" scope="col">MI</th>
													<th style="cursor: n-resize;" scope="col">Telephone</th>
													<th style="cursor: n-resize;" scope="col">Rights</th>
													<th style="cursor: n-resize;" scope="col">Email</th>
													<th style="cursor: n-resize;" scope="col">Actions</th>
												</tr>
												<c:forEach items="${adminBean.userDetailsList}" var="item"
													varStatus="status">
													<tr class="${status.index % 2 == 0 ? '' : 'alternateRow'}">
														<td>${item.userID}</td>
														<td>${item.firstName}</td>
														<td>${item.lastName}</td>
														<td>${item.middleName}</td>
														<td>${item.telephone}</td>
														<td>${item.privilege}</td>
														<td>${item.email}</td>
														<td class="lastChild"><a
															href="javascript:editUser('${status.index}');">Edit</a> <a
															href="javascript:deleteUser('${status.index}');">Delete</a>
															<a href="javascript:viewUser('${status.index}');">View</a></td>
													</tr>
												</c:forEach>
											</table>
										</div>
									</td>
								</tr>
								<tr>
									<td colspan="2" align="center"></td>
								</tr>
								<tr>
									<td colspan="2" align="center"><input type="button"
										onclick="location.href='/AutoChoice/AdminUserProfile/0/Add'"
										class="greenDiv" value="Add New to Group"></td>
								</tr>
							</table>
							<div>
								<br>
								<table width="98%">
									<tr>
										<td align="center"></td>
									</tr>

								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<form:hidden path="groupCodeDesc" />
		</form:form>
		<p class="text-warning">&nbsp;&nbsp;</p>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>