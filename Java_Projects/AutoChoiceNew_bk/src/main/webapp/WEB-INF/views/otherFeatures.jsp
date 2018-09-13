
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>
<body>
	<br>
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
								<td width="35%"><span class="titleText">Other
										Features</span></td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active" href="#">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
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

					<div class="tableDiv2">
						<table width="100%" class="vehQtyTable">
							<tbody>
								<tr class="tableHeader">
									<th width="40%">GSA Components</th>
									<c:forEach items="${orderBean.otherfeaturesValueBean}"
										var="otherModel">
										<th width="20%">${otherModel.modelDescripton}</th>
									</c:forEach>
								</tr>
								<c:forEach items="${orderBean.otherfeatureslist}" var="other">
									<tr>
										<td colspan=3><div class="tdgreenBg">
												<c:out value="${other.key.categoryName}" />
											</div></td>
									</tr>
									<c:forEach items="${other.value}" var="otherDesc"
										varStatus="loopDetail">
										<tr class="alternateRow">
											<td><div class="descCont">
													<c:out value="${otherDesc.description}" />
												</div></td>
											<c:forEach items="${otherDesc.stdOptions}" var="values"
												varStatus="loopDetail">
												<td><div class="descCont"><c:out value="${values.fedValueNext}" /></div></td>
											</c:forEach>
										</tr>
									</c:forEach>
								</c:forEach>
							</tbody>
						</table>
					</div>

					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%">&nbsp;</td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active" href="#">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
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
	<%@ include file="includeFooter.jsp"%>
</body>