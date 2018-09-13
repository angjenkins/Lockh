
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script>

var updated = false;

$(document).ready(function(){
	$('th').click(function(){
	    var table = $(this).parents('table').eq(0)
	    var rows = table.find('tr:gt(0)').toArray().sort(comparer($(this).index()))
	    this.asc = !this.asc
	    if (!this.asc){rows = rows.reverse()}
	    for (var i = 0; i < rows.length; i++){table.append(rows[i])}
	    table.find('tr').removeClass('alternateRow');
	    table.find('tr:nth-child(odd)').addClass('alternateRow');
	})
	function comparer(index) {
	    return function(a, b) {
	        var valA = getCellValue(a, index), valB = getCellValue(b, index)
	        return $.isNumeric(valA) && $.isNumeric(valB) ? valA - valB : valA.localeCompare(valB)
	    }
	}
	function getCellValue(row, index){ return $(row).children('td').eq(index).html() }
});
</script>
</head>

<body>
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<div class="col-md-9">
					<a name="maincontent"></a>
					<table width="97%">
						<tbody>
							<tr>
								<td>
									<div class="rightColMenu">
										<ul>
											<li ><a title="Order Status Vehicle Receipt" onmouseover="orderStatusMenu('1')"
												href="/AutoChoice/OrderStatusVehReceiptForm">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Form" onmouseover="orderStatusMenu('2')"
												href="/AutoChoice/OrderStatusMainForm">&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Delivery Procedure" onmouseover="orderStatusMenu('3')"
												href="/AutoChoice/OrderStatusDeliveryProc">&nbsp;Delivery Proc</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Main" onmouseover="orderStatusMenu('4')"
												href="/AutoChoice/OrderStatusMain/Case/${orderStatusBean.caseNumber}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Order</a>&nbsp;&nbsp;&nbsp; |</li>
											<li><a title="Order Status Contract" onmouseover="orderStatusMenu('5')"
												href="/AutoChoice/OrderStatusContract/Case/${orderStatusBean.caseNumber}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Contract</a>&nbsp;&nbsp;&nbsp; |</li>
											<li class="active"><a title="Order Status Address" onmouseover="orderStatusMenu('6')"
												href="#">&nbsp;&nbsp;&nbsp;&nbsp;Address</a>&nbsp;&nbsp;&nbsp;</li>
											<c:if test="${commonBean.userAccount.privilege == '6' }">
												<li>| <a title="FSR Remarks" onmouseover="orderStatusMenu('7')"
												href="/AutoChoice/FSRRemarks/${orderStatusBean.caseNumber}/KEY/load">&nbsp;&nbsp;&nbsp;&nbsp;FSR Remarks</a>&nbsp;&nbsp;&nbsp;</li>
											</c:if>
										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="/AutoChoice/resources/img/small_line.jpg" alt="line image">
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%"><span class="titleText">Order Status</span></td>
								<td width="35%" class="rightPadding105">
									<!-- -
									<div class="simplePagination">
										<ul>
											<li><a class="active" href="#">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
									 -->
								</td>
								<td width="27%">
									<a href ="/AutoChoice/OrderStatusExcel/Address" title="Excel/print" ><img width="20" title="Print" alt="Excel/print" src="<c:url value="/resources/img/excel.png" />" alt="Print">&nbsp; Excel (print)</a>
								</td>
							</tr>
						</tbody>
					</table>
					<table width="97%">
						<tbody>
							<tr>
								<td colspan="6">

									<div class="optionsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span>Case <c:out value="${orderStatusBean.caseNumber }"/></span>											
										</div>
										<form:form commandName="OrderStatusUpdate" action="/AutoChoice/OrderStatusUpdate" modelAttribute ="orderStatusBean" method="post" name="myForm"  id="myForm">
										<table style="width:100%;">
											<tbody>
												<tr>
													<td colspan="2">
														<c:if test="${fn:length(orderStatusBean.returnMessage) > 0 }">		
															<div style="text-align:center;"><c:out value="${orderStatusBean.returnMessage }"/></div>
														</c:if>
													</td>
												</tr>
												<tr>
													<td colspan="2">
														<c:if test="${fn:length(orderStatusBean.returnMessage2) > 0 }">		
															<div style="text-align:center;"><c:out value="${orderStatusBean.returnMessage2 }"/></div>
														</c:if>
													</td>
												</tr>
												<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf">
																<span><b>Requisitioner Address</b></span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Requisitioner Address">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>Address:</b></td>
																		<td>
																			<c:out value="${base.req_Req_Add_Line1 }"/><br>
																			<c:out value="${base.req_Req_Add_Line2 }"/><br>
																			<c:out value="${base.req_Req_Add_Line3 }"/><br>
																			<c:out value="${base.req_Req_Add_Line4 }"/>
																		</td>
																	</tr>
																	<tr >
																		<td scope="row"><b>City:</b></td>
																		<td><c:out value="${base.req_Req_Add_City }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>State:</b></td>
																		<td><c:out value="${base.req_Req_Add_State }"/></td>
																	</tr>
																	<tr >
																		<td scope="row"><b>Country:</b></td>
																		<td><c:out value="${base.req_Req_Add_Country }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Zip Code:</b></td>
																		<td><c:out value="${base.req_Req_Add_Zip }"/>-<c:out value="${base.req_Req_Add_Zip_Sfx }"/></td>
																	</tr>
																	<tr  >
																		<td scope="row"><b>Email:</b></td>
																		<td><c:out value="${base.req_Req_Email_Address }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Fax:</b></td>
																		<td><c:out value="${base.req_Req_Fax_Number }"/></td>
																	</tr>																	
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>	
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf">
																<span><b>Mailing Address</b></span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Mailing Address">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>Address:</b></td>
																		<td>
																			<c:out value="${base.req_Mail_Add_Line1 }"/><br>
																			<c:out value="${base.req_Mail_Add_Line2 }"/><br>
																			<c:out value="${base.req_Mail_Add_Line3 }"/><br>
																			<c:out value="${base.req_Mail_Add_Line4 }"/>
																		</td>
																	</tr>
																	<tr >
																		<td scope="row"><b>City:</b></td>
																		<td><c:out value="${base.req_Mail_Add_City }"/></td>
																	</tr>
																	<tr  class="alternateRow">
																		<td scope="row"><b>State:</b></td>
																		<td><c:out value="${base.req_Mail_Add_State }"/></td>
																	</tr>
																	<tr >
																		<td scope="row"><b>Country:</b></td>
																		<td><c:out value="${base.req_Mail_Add_Country }"/></td>
																	</tr>
																	<tr  class="alternateRow">
																		<td scope="row"><b>Zip Code:</b></td>
																		<td><c:out value="${base.req_Mail_Add_Zip }"/>-<c:out value="${base.req_Mail_Add_Zip_Sfx }"/></td>
																	</tr>														
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>	
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf">
																<span><b>Delivery Address</b></span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Delivery Address">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>Address:</b></td>
																		<td>
																			<c:out value="${base.req_Con_Add_Line1 }"/><br>
																			<c:out value="${base.req_Con_Add_Line2 }"/><br>
																			<c:out value="${base.req_Con_Add_Line3 }"/><br>
																			<c:out value="${base.req_Con_Add_Line4 }"/>
																		</td>
																	</tr>
																	<tr >
																		<td scope="row"><b>City:</b></td>
																		<td><c:out value="${base.req_Con_Add_City }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>State:</b></td>
																		<td><c:out value="${base.req_Con_Add_State }"/></td>
																	</tr>
																	<tr >
																		<td scope="row"><b>Country:</b></td>
																		<td><c:out value="${base.req_Con_Add_Country }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Zip Code:</b></td>
																		<td><c:out value="${base.req_Con_Add_Zip }"/>-<c:out value="${base.req_Req_Add_Zip_Sfx }"/></td>
																	</tr>
																	<tr >
																		<td scope="row"><b>Email:</b></td>
																		<td><c:out value="${base.req_Con_Email_Address }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Fax:</b></td>
																		<td><c:out value="${base.req_Con_Fax_Number }"/></td>
																	</tr>																	
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>	
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf ">
																<span><b>Billing Address</b></span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="billing Address">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>Address:</b></td>
																		<td>
																			<c:out value="${base.req_Bill_Add_Line1 }"/><br>
																			<c:out value="${base.req_Bill_Add_Line2 }"/><br>
																			<c:out value="${base.req_Bill_Add_Line3 }"/><br>
																			<c:out value="${base.req_Bill_Add_Line4 }"/>
																		</td>
																	</tr>
																	<tr >
																		<td scope="row"><b>City:</b></td>
																		<td><c:out value="${base.req_Bill_Add_City }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>State:</b></td>
																		<td><c:out value="${base.req_Bill_Add_State }"/></td>
																	</tr>
																	<tr >
																		<td scope="row"><b>Country:</b></td>
																		<td><c:out value="${base.req_Bill_Add_Country }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Zip Code:</b></td>
																		<td><c:out value="${base.req_Bill_Add_Zip }"/>-<c:out value="${base.req_Mail_Add_Zip_Sfx }"/></td>
																	</tr>														
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>
												</c:forEach>
												
												<tr>
													<td width="50%" valign="top"></td>
													<td></td>
												</tr>
											</tbody>
										</table>
										</form:form>
										
										<div class="width100">
											<table width="100%">
												<tbody>
													<tr>
														<td width="35%">&nbsp;</td>
														<td width="20%">&nbsp;</td>
														<td width="45%">&nbsp;</td>
													</tr>
												</tbody>
											</table>
										</div>

									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>