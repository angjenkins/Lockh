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
				
				/*Sorting the table on GroupCode on link click*/				
				$("#trigger-GroupCodeSortLink").click(function() {					
					var $table = $('#groupCodeDetailsTableId');
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
					
					// To avoid default link behaviour
					return false;
				});
			});

	function deleteGroup(index) {
		if (confirm("Are you sure you want to delete this record?")) {
			var deleteString = "/AutoChoice/AdminGroupAssign/" + index
					+ "/Delete";
			window.location = deleteString;
		}
	}

	function editGroup(index) {
		var editString = "/AutoChoice/AdminAddNewGroup/" + index + "/Edit";
		window.location = editString;
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
		<form:form id="adminGroupAssignForm" name="adminGroupAssignForm"
			method="post" modelAttribute="adminBean" commandName="adminBean">
			<div class="row">
				<div class="col-md-12 mainContent">
					<div class="col-md-1"></div>
					<div class="col-md-11">
						<table class="littleMargin tableWidth97">
							<tr>
								<td><span class="titleText">Group Assignment</span></td>

							</tr>
						</table>
						<table class="littleMargin tableWidth97">
							<tr>
								<td width="25%"></td>
								<td></td>
							</tr>
							<tr>
								<td colspan="2">&nbsp;</td>
							</tr>
							<tr>
								<td>Current Sorting: <a href="#" id="trigger-GroupCodeSortLink">Group Code</a></td>
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
						<div Class="label12B">
							<c:if test="${fn:length(adminBean.returnMessage) > 0 }">
								<span class="note"> <c:out
										value="${adminBean.returnMessage }" />
								</span>
							</c:if>
						</div>

						<table class="tableWidth97"
							summary="List of the administrative staff">
							<tr>
								<td colspan="6">
									<div class="vehInfBorder">
										<table class="vehQtyTable tableWidth100" id="groupCodeDetailsTableId"
											Summary="Group assignment">
											<tr class="tableHeader">
												<th style="cursor: n-resize;" scope="col">Group Code</th>
												<th style="cursor: n-resize;" scope="col">Group Name</th>
												<th style="cursor: n-resize;" scope="col">Actions</th>
											</tr>
											<c:forEach items="${adminBean.groupAssignmentList}"
												var="item" varStatus="status">
												<tr class="${status.index % 2 == 0 ? '' : 'alternateRow'}">
													<td>${item.group_Code}</td>
													<td>${item.description}</td>
													<td class="lastChild"><a
														href="javascript:editGroup('${status.index}');">Edit</a> <a
														href="javascript:deleteGroup('${status.index}');">Delete</a>
													</td>
												</tr>
											</c:forEach>
										</table>
									</div>
									<div>
										<br>
										<table width="98%">
											<tr>
												<td align="center"></td>
											</tr>

										</table>
									</div>
							<tr>
								<td colspan="2" align="center"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="button"
									onclick="location.href='/AutoChoice/AdminAddNewGroup/0/Add'"
									class="greenDiv" value="Add New Group"></td>
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
		</form:form>
		<p class="text-warning">&nbsp;&nbsp;</p>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>