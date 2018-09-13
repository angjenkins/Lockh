
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>

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
<style>
	div.ui-datepicker{
	 font-size:10px;
	}
</style>
<head>

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
											<li><a title="Order Status Main" onmouseover="orderStatusMenu('4')"
												href="/AutoChoice/OrderStatusMain/Case/${orderStatusBean.caseNumber}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Order</a>&nbsp;&nbsp;&nbsp; |</li>
											<li class="active"><a title="Order Status Contract" onmouseover="orderStatusMenu('5')"
												href="#">&nbsp;&nbsp;&nbsp;&nbsp;Contract</a>&nbsp;&nbsp;&nbsp; |</li>
											<li><a title="Order Status Address" onmouseover="orderStatusMenu('6')"
												href="/AutoChoice/OrderStatusAddress/Case/${orderStatusBean.caseNumber}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Address</a>&nbsp;&nbsp;&nbsp;</li>
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
									<a href ="/AutoChoice/OrderStatusExcel/Contract" title="Excel/print" ><img width="20" title="Print" alt="Excel/print" src="<c:url value="/resources/img/excel.png" />" alt="Print">&nbsp; Excel (print)</a>
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
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf">
																<span>Contract Information</span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Contr Case Info" >
																<thead>
																	<c:set var="firstTime" value="true"/>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.contrCaseList }">																	
																	<c:if test="${firstTime}">
																		<c:set var="firstTime" value="false"/>
																		<tr class="tableHeader" >
																		<th scope="col" colspan="6">
																			Contract Number: <c:out value="${base.contr_case_contract }"/> - <c:out value="${base.contrduns_contract_full_name }"/> 
																		</th>																		
																	</tr>
																	</c:if>
																	</c:forEach>
																	<tr class="tableHeader" >
																		<th scope="col">Mod</th>
																		<th scope="col">Sch Line</th>
																		<th scope="col">Ordered Date</th>
																		<th scope="col">Shipment Date</th>
																		<th scope="col">Quantity</th>
																		<th scope="col">Unit Price</th>																
																	</tr>
																</thead>
																<tbody>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.contrCaseList }">
																	<tr>
																		<td scope="row"><c:out value="${base.contr_case_mod }"/></td>
																		<td scope="row"><c:out value="${base.contr_case_Sch_Line }"/></td>
																		<td>
																			<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd HH:mm:ss" var="orderDate"/>
																			<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd" />	
																		</td>
																		<td>
																			<fmt:parseDate value="${base.contr_case_shipment_date}" pattern="yyyy-MM-dd HH:mm:ss" var="shipDate"/>
																			<fmt:formatDate type="date" value="${shipDate}" pattern="yyyy-MM-dd" />	
																		</td>
																		<td scope="row"><c:out value="${base.contr_case_quantity }"/></td>
																		<td>
																			<fmt:parseNumber value="${base.contr_case_sc}" type="number" var="scNumber"/>
																			<fmt:formatNumber type="currency" value="${((scNumber * base.contr_case_unit_price)/100) + base.contr_case_unit_price}"/>	
																		</td>					
																	</tr>
																	</c:forEach>
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
																<span>Vehicle Description</span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Vehicle Description">
																<tbody>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">
																	<tr class="alternateRow">
																		<td scope="row"><b>Standard Item Desc.:</b></td>
																		<td><c:out value="${base.std_items_description }"/></td>
																	</tr>
																	<tr>
																		<td scope="row"><b>Color:</b></td>
																		<td><c:out value="${base.req_Veh_Color }"/></td>
																	</tr>
																	<tr class="alternateRow">
																		<td scope="row"><b>Non Std Desc.:</b></td>
																		<td><c:out value="${base.req_Non_Std_Desc }"/></td>
																	</tr>
																	</c:forEach>
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
																<span>Options</span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" sumamry="options">
																<tbody>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																		<td colspan="2">
																			<b>Options Per Vehicle</b>
																		</td>
																	</tr>
																	<c:set var="totPrice" value="0"/>
																	<c:set var="totOptVehPrice" value="0"/>
																	<c:set var="totOptOrderPrice" value="0"/>
																	<c:set var="otherOptFound" value="${false}"/>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.contractLineOptionList }">
																		<c:choose>
																		<c:when test="${base.options_table_valid_qty != 'O' }">
																			<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																				<td scope="row" style="text-align: left;">
																					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																					<c:out value="${base.option_code }"/>
																					<c:if test="${base.options_table_category_code == 'EngAFV' }">
																						AFV
																					</c:if>
																					- <c:out value="${base.options_table_desc }"/>
																				</td>
																				<c:choose>
																					<c:when test="${base.contr_line_opt_curr_unit_price == 0 }">																						
																						<td style="background-color:yellow;">N/A</td>
																					</c:when>
																					<c:otherwise>
																						<td style="text-align: right;">
																							<fmt:formatNumber type="currency" value="${base.contr_line_opt_curr_unit_price}"/>
																							<c:set var="totOptVehPrice" value="${totOptVehPrice +  base.contr_line_opt_curr_unit_price}"/>
																						</td>
																					</c:otherwise>
																				</c:choose>
																			</tr>
																		</c:when>
																		<c:otherwise>
																			<c:set var="otherOptFound" value="${true}"/>
																		</c:otherwise>
																		</c:choose>
																	</c:forEach>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
																		<td scope="row" style="text-align: left;">
																			 <b> = Total Options per Vehicle</b> <em>(A)</em>
																		</td>
																		<td style="text-align: right;">
																			<fmt:formatNumber type="currency" value="${totOptVehPrice}"/>
																			<c:set var="totPrice" value="${totPrice + totOptVehPrice }"/>
																		</td>
																	</tr>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">	
																		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
																			<td scope="row" style="text-align: left;">
																				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																				Quantity <em>(B)</em>
																			</td>
																			<td style="text-align: right;">x <c:out value="${base.req_Quantity }"/></td>
																			<c:set var="totPrice" value="${base.req_Quantity * totPrice }"/>
																		</tr>
																	</c:forEach>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
																		<c:choose>
																			<c:when test="${otherOptFound}">
																				<td scope="row" style="text-align: left;"><b> =Sub-Total</b> <em>  (C = A * B)</em></td>
																			</c:when>
																			<c:otherwise>
																				<td scope="row" style="text-align: left;"><b> =Total Options Price</b> <em>  (C = A * B)</em></td>
																			</c:otherwise>
																		</c:choose>
																		<td style="text-align: right;">
																			<fmt:formatNumber type="currency" value="${totPrice}"/>
																		</td>
																	</tr>																
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																		<td colspan="2">
																			&nbsp;&nbsp;&nbsp;<b>+ Other Options : </b>
																		</td>
																	</tr>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.contractLineOptionList }">
																		<c:if test="${base.options_table_valid_qty == 'O' }">
																			<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																				<td scope="row" style="text-align: left;">
																					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																					<c:out value="${base.option_code }"/>
																					<c:if test="${base.options_table_category_code == 'EngAFV' }">
																						AFV
																					</c:if>
																					- <c:out value="${base.options_table_desc }"/> (<c:out value="${base.option_file_qty }"/> * <c:out value="${base.contr_line_opt_curr_unit_price }"/>)
																				</td>
																				<c:choose>
																					<c:when test="${base.contr_line_opt_curr_unit_price == 0 }">
																						<td style="background-color:yellow;">N/A YELLOW BACKGROUND</td>
																					</c:when>
																					<c:otherwise>
																						<td style="text-align: right;">
																							<fmt:formatNumber type="currency" value="${base.contr_line_opt_curr_unit_price * base.option_file_qty}"/>
																							<c:set var="totOptOrderPrice" value="${totOptOrderPrice +  (base.contr_line_opt_curr_unit_price * base.option_file_qty)}"/>
																						</td>																						
																					</c:otherwise>
																				</c:choose>
																			</tr>
																		</c:if>
																	</c:forEach>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
																		<td scope="row" style="text-align: left;">
																			 <b> = Total Other Options </b><em> (D)</em> 
																		</td>
																		<td style="text-align: right;">
																			<fmt:formatNumber type="currency" value="${totOptOrderPrice}"/>
																			<c:set var="totPrice" value="${totPrice + totOptOrderPrice }"/>
																		</td>
																	</tr>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
																		<td scope="row" style="text-align: left;"><b>= Total Options Price  </b> <em>(D+C)</em></td>
																		<td style="text-align: right;">
																			<fmt:formatNumber type="currency" value="${totPrice}"/>
																		</td>
																	</tr>
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>												
												
												<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">	
												<tr>
													<td width="100%" colspan="2">
														<div class="width70">
															<div class="vehInf">
																<span>Solicitation Data</span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Solicitation Data">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>Solicitation No.:</b></td>
																		<td><c:out value="${base.solicitation_sol_no }"/></td>
																	</tr>
																	<tr>
																		<td scope="row"><b>Schedule Line:</b></td>
																		<td><c:out value="${base.contr_case_Sch_Line }"/></td>
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
																<span>Buyer Information</span>
															</div>
															<div class="vehInfBorder lesstopmargin" >
															<table class="vehQtyTable tableWidth100" summary="Buyer Info">
																<tbody>																	
																	<tr class="alternateRow">
																		<td scope="row"><b>NAME:</b></td>
																		<td><c:out value="${base.buyer_First_Name }"/> <c:out value="${base.buyer_Last_Name }"/></td>
																	</tr>
																	<tr>
																		<td scope="row"><b>Telephone:</b></td>
																		<td><c:out value="${base.buyer_Phone }"/></td>
																	</tr>																	
																</tbody>
															</table>
															</div>
														</div>
													</td>
												</tr>	
												<c:if test="${base.req_agency_code == '17' || base.req_agency_code == '21' || base.req_agency_code == '57' }">
													<tr>
														<td width="100%" colspan="2">
															<div class="width70">
																<div class="vehInf">
																	<span>Mark,TCN,ACRN,NSN,Registration No.</span>
																</div>
																<div class="vehInfBorder lesstopmargin" >
																<table class="vehQtyTable tableWidth100" summary="Mark,TCN,ACRN,NSN,Registration No.">
																	<tbody>																	
																		<tr class="alternateRow">
																			<td scope="row"><b>Mark For:</b></td>
																			<td><c:out value="${base.req_Mark_For }"/></td>
																		</tr>
																		<tr>
																			<td scope="row"><b>ACRN:</b></td>
																			<td><c:out value="${base.req_ACRN }"/></td>
																		</tr>	
																		<tr>
																			<td scope="row"><b>TCN:</b></td>
																			<td><c:out value="${base.req_TCN }"/></td>
																		</tr>	
																		<tr>
																			<td scope="row"><b>NSN:</b></td>
																			<td><c:out value="${base.req_NSN }"/></td>
																		</tr>	
																		<tr>
																			<td scope="row"><b>Registration No.:</b></td>
																			<td><c:out value="${base.req_Registration_No }"/></td>
																		</tr>																	
																	</tbody>
																</table>
																</div>
															</div>
														</td>
													</tr>
												</c:if>
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