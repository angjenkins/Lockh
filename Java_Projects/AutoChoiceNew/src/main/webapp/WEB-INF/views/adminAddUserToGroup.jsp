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
									comparer(1));
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
		<form:form id="adminAddUserToGroupForm" name="adminAddUserToGroupForm"
			method="post" modelAttribute="adminBean" commandName="adminBean"
			action="/AutoChoice/AdminUserProfile">
					<div class="row">
						<div class="col-md-12 mainContent">
							<div class="col-md-1"></div>
							<div class="col-md-11">
								<table class="tableWidth97">
									<tr>
										<td></td>
									</tr>
								</table>
								<table class="littleMargin tableWidth97">
									<tr>
										<td width="35%"><span class="titleText">User
												Available to Add for ${adminBean.groupCodeDesc}</span></td>
									</tr>
									<tr>
										<td colspan="2">&nbsp;</td>
									</tr>
									<tr>
										<td>Current Sorting: <a href="#"
											id="trigger-UserIDSortLink">User ID</a>
									</tr>
								</table>

								<div class="colorsDiv">
									<div class="noteDiv">
										<img src="<c:url value="/resources/img/pin.png" />" alt="pin" class="pinImg" />&nbsp;
										Click on the column heading to Sort by Ascending or Descending
										order.
										<div class="redColorRow"></div>
									</div>
								</div>

								<div Class="label12B">
									<c:if test="${fn:length(adminBean.returnMessage) > 0 }">
										<span class="note"> <c:out
												value="${adminBean.returnMessage }" />
										</span>
									</c:if>
								</div>

								<table class="tableWidth97">
									<tr>
										<td colspan="6">
											<div class="vehInfBorder lesstopmargin">
												<table class="vehQtyTable tableWidth100"
													id="userDetailsTableId"
													summary="Table with list users available to add for default">
													<tr class="tableHeader">
														<th style="cursor: n-resize;" width="6%" scope="col">_</th>
														<th style="cursor: n-resize;" width="10%" scope="col">User
															ID</th>
														<th style="cursor: n-resize;" width="15%" scope="col">First
															Name</th>
														<th style="cursor: n-resize;" width="15%" scope="col">Last
															Name</th>
														<th style="cursor: n-resize;" width="6%" scope="col">MI</th>
														<th style="cursor: n-resize;" width="20%" scope="col">City</th>
														<th style="cursor: n-resize;" width="8%" scope="col">State</th>
														<th style="cursor: n-resize;" width="20%" scope="col">Telephone</th>

													</tr>
													<c:forEach items="${adminBean.usersToAddInGroup}"
														var="item" varStatus="status">
														<tr class="${status.index % 2 == 0 ? '' : 'alternateRow'}">
															<td align="center"><form:checkbox
																	path="usersToAddInGroup[${status.index}].userSelected"
																	id="userSelectedId" /> <form:hidden
																	path="usersToAddInGroup[${status.index}].userID" /></td>
															<td align="center">${item.userID}</td>
															<td align="center">${item.firstName}</td>
															<td align="center">${item.lastName}</td>
															<td align="center">${item.middleName}</td>
															<td align="center">${item.city}</td>
															<td align="center">${item.state}</td>
															<td align="center">${item.telephone}</td>
														</tr>
													</c:forEach>
												</table>
											</div> <br>
											<table class="tableWidth100">
												<tr>
													<td align="center"><input type="submit" name="action"
														class="greenDiv" value="Add to ${adminBean.groupCodeDesc}" />&nbsp;&nbsp;&nbsp;<input
														type="button" class="greenDiv" value="Close"
														onclick="location.href='/AutoChoice/Admin'" /></td>
												</tr>

											</table>
										</td>
									</tr>
								</table>
								<br>
							</div>
						</div>
					</div>
		</form:form>
		<p class="text-warning">&nbsp;&nbsp;</p>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>