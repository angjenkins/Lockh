
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
					<div class="">
						<table width="97%">
							<tbody>
								<tr>
									<td></td>
								</tr>
							</tbody>
						</table>
						<table width="97%" class="littleMargin">
							<tbody>
								<tr>
									<td width="35%"><span class="titleText">Pending
											Orders</span></td>
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

						<div class="colorsDiv">
							<div class="noteDiv">
								<img class="pinImg" alt="pin" src="resources/img/pin.png">&nbsp;
								Please read the following carefully and make changes to your
								order where approprite.
								<div class="redColorRow"></div>
								<div class="redColorRow"></div>
							</div>

						</div>
						<table width="97%">
							<tbody>
								<tr>
									<td colspan="6">
										<div class="vehInf">
											<span>New Requisitions - Not Submitted to GSA</span>
										</div>
										<div class="vehInfBorder lesstopmargin">
											<table width="100%"
												summary="Table with list of pending orders"
												class="vehQtyTable">
												<tbody>
													<tr class="tableHeader">
														<th>Requisition No.</th>
														<th width="6%">Std. Item</th>
														<th>Model</th>
														<th width="6%">Q-ty</th>
														<th width="7%">Estimated Price</th>
														<th width="7%">Additional Funds</th>
														<th width="7%">Unit Obligated Amt</th>
														<th width="7%">Total Actual</th>
														<th width="7%">Total Obligated Amt</th>
														<th width="5%">Priority</th>
														
														
														<th width="5%">Created By</th>
    													
														<th width="5%">Order Now</th>
														<th>Actions</th>
													</tr>
													<c:forEach items="${pendingOrderBean.requisitionsCartList}" var="requisitionsCart" varStatus="status">
													<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
														<td align="center">
														<c:out value="${requisitionsCart.fedMilReq1}" /> - 
														<c:out value="${requisitionsCart.fedMilReq2}" /> - 
														<c:out value="${requisitionsCart.fedMilReq3}" /> 
														</td>
														<td align="center"><c:out value="${requisitionsCart.stdItem}"/></td>
														<td align="center"><c:out value="${requisitionsCart.model}" /></td>
														<td align="center"><c:out value="${requisitionsCart.quantity}" /></td>
														<td class="amountSec"><c:out value="${requisitionsCart.totUnitPrice}" /></td>
														<td class="amountSec"><c:out value="${requisitionsCart.addFund}" /></td>
														<td class="amountSec">0000</td>
														<td class="amountSec"><c:out value="${requisitionsCart.totalPriceActual}"/></td>
														<td class="amountSec">0000</td>
														
														<td class="amountSec"><c:out value="${requisitionsCart.priority}"/></td>
														
														
														<td align="center"><c:out value="${requisitionsCart.createdBy}" /></td>
														
														<td align="center">
														
														<input type="checkbox" value='<c:out value="${requisitionsCart.caseNumber}" />' 
														name="checkbox1" id="order1"> 
															</td>
															
														<td class="lastChild"><a href="#">Edit</a> <a
															href="#">Delete</a> <a href="#">View</a> <a href="#">Copy</a>
														</td>
													</tr>
													</c:forEach>
													
												</tbody>
											</table>
										</div>
										<div>
											<br>
											<table width="98%">
												<tbody>
													<tr>
														<td align="center"><input type="button"
															value="Finalize Selected Pending Orders" class="greenDiv"></td>
													</tr>

												</tbody>
											</table>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<br>
						<div class="colorsDiv">
							<div class="noteDiv">
								<img class="pinImg" alt="pin" src="resources/img/pin.png">&nbsp;
								Please read the following carefully and make changes to your
								order where approprite.
								<div class="redColorRow"></div>
								<div class="redColorRow"></div>
							</div>
						</div>
						<div class="vehInf">
							<span>Special Order(Non-Standart, MAS, Express Desk</span> )
						</div>
						<div class="tableDiv2 lesstopmargin">
							<table width="100%" summary="Table with special orders"
								class="vehQtyTable">
								<tbody>
									<tr class="tableHeader">
										<th>Requisition No.</th>
										<th>Agency Order No.</th>
										<th>Std<br>Item</th>
										<th>Q-ty</th>
										<th>Estimated Price</th>
										<th>Total Actual</th>
										<th>Priority</th>
										<th>Created By</th>
										<th width="5%">Order Now</th>
										<th>Actions</th>
									</tr>
									<c:forEach items="${pendingOrderBean.masRequisitionsCartList}" var="masRequisitionsCart" varStatus="status">
													<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
														<td align="center">
														<c:out value="${masRequisitionsCart.fedMilReq1}" /> - 
														<c:out value="${masRequisitionsCart.fedMilReq2}" /> - 
														<c:out value="${masRequisitionsCart.fedMilReq3}" /> 
														</td>
															<td align="center"><c:out value="${masRequisitionsCart.agencyOrderNo}"/></td>
														<td align="center"><c:out value="${masRequisitionsCart.stdItem}"/></td>
														<td align="center"><c:out value="${masRequisitionsCart.quantity}" /></td>
														<td class="amountSec"><c:out value="${masRequisitionsCart.totUnitPrice}" /></td>
														<td class="amountSec">0000</td>
														<td class="amountSec"><c:out value="${masRequisitionsCart.priority}"/></td>
														
														
														<td align="center"><c:out value="${masRequisitionsCart.createdBy}" /></td>
														
														<td align="center">
														
														<input type="checkbox" value='<c:out value="${masRequisitionsCart.caseNumber}" />' 
														name="checkbox1" id="order1"> 
															</td>
															
														<td class="lastChild"><a href="#">Edit</a> <a
															href="#">Delete</a> <a href="#">View</a> <a href="#">Copy</a>
														</td>
													</tr>
													</c:forEach>
									
								</tbody>
							</table>
						</div>
					</div>
					<br>
					<div>

						<table width="98%">
							<tbody>
								<tr>
									<td align="center"><input type="button"
										value="Finalize Selected Pending Orders" class="greenDiv"></td>
								</tr>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>