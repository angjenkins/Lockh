
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
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


$(function() {
	$( ".dateClass" ).datepicker({
		dateFormat : "mm/dd/yy",
		changeMonth: true,
		changeYear: true,
		numberOfMonths: 1,
		minDate: new Date("January 01, 2013"),
		maxDate: "0D"
	});
});

function checkDate(element,row){
	var today = new Date();
	if(element.value != ''){
		var enteredDate = new Date(element.value);
		if(enteredDate > today){
			alert("Date Ag Received cannot be greater than today's date.");
			element.value = "";
			return false;
		}
	}

	if(element.value != '' && document.getElementById("orderStatusVehReceiptList[" + row + "].contr_case_order_date_string").value.length == 10){
		mMonth = document.getElementById("orderStatusVehReceiptList[" + row + "].contr_case_order_date_string").value.substr(5,2);
		mDay   = document.getElementById("orderStatusVehReceiptList[" + row + "].contr_case_order_date_string").value.substr(8,2);	
		mYear  = document.getElementById("orderStatusVehReceiptList[" + row + "].contr_case_order_date_string").value.substr(0,4);
		orderdate1 = mYear+"/"+mMonth+"/"+mDay;		
		var newDate = new Date(orderdate1);
		var enteredDate = new Date(element.value);
		if(enteredDate < newDate){
			alert("Date Ag Received cannot be before the Order Date. " + document.getElementById("orderStatusVehReceiptList[" + row + "].contr_case_order_date_string").value);
			element.value = "";		
			return false;	
		}
	}
	document.getElementById("orderStatusVehReceiptList[" + row + "].editRow").value = true;
	updated = true;
}

function setEdit(row){
	document.getElementById("orderStatusVehReceiptList[" + row + "].editRow").value = true;
	updated = true;
}

function sendPage(){
	if(updated){		
		document.getElementById("myForm").submit();
	}
	else{
		alert("No rows were updated.");
	}
}
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
											<li class="active"><a title="Order Status Main" onmouseover="orderStatusMenu('4')"
												href="#">&nbsp;&nbsp;&nbsp;&nbsp;Order</a>&nbsp;&nbsp;&nbsp; |</li>
											<li><a title="Order Status Contract" onmouseover="orderStatusMenu('5')"
												href="/AutoChoice/OrderStatusContract/Case/${orderStatusBean.caseNumber}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Contract</a>&nbsp;&nbsp;&nbsp; |</li>
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
									<a href ="/AutoChoice/OrderStatusExcel/Main" title="Excel/print" ><img width="20" title="Print" alt="Excel/print" src="<c:url value="/resources/img/excel.png" />" alt="Print">&nbsp; Excel (print)</a>
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
															<div class="vehInf">
																<span>Order Status</span>
															</div>
															<div class="vehInfBorder lesstopmargin vehInfInner100">
															<table class="vehQtyTable tableWidth100" summary="Order Status Data">
																<thead>
																	<tr class="tableHeader" >
																		<th  style="cursor:n-resize;" scope="col">VON</th>
																		<th  style="cursor:n-resize;" scope="col">VIN</th>
																		<th  style="cursor:n-resize;" scope="col">Status</th>
																		<th  style="cursor:n-resize;" scope="col">Date</th>
																		<th  style="cursor:n-resize;" scope="col">Contact Address</th>
																		<th  style="cursor:n-resize;" scope="col">Telephone Number</th>
																		<th  style="cursor:n-resize;" scope="col">Delivery Date</th>
																		<th  style="cursor:n-resize;" scope="col">Date Ag Updated</th>
																		<th  style="cursor:n-resize;" scope="col">User Ag Updated</th>
																		<th  style="cursor:n-resize;" scope="col">Date Agency Received</th>																		
																	</tr>
																</thead>
																<tbody>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusVehReceiptList }">
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																		<td scope="row">
																			<c:choose>
																				<c:when test="${orderStatusBean.privilege != '1' }">
																					<c:choose>
																						<c:when test="${ base.wk_flag == 'A'}">
																							<form:input id="orderStatusVehReceiptList[${status.index}].order_status_von" path="orderStatusVehReceiptList[${status.index}].order_status_von" type="text" value="${base.order_status_von }" alt="VON" onchange="setEdit(${status.index });" size="8" maxlength="8"/>																							
																						</c:when>
																						<c:otherwise>
																							<c:out value="${base.order_status_von }"/>
																							<input type="hidden" id="orderStatusVehReceiptList[${status.index}].order_status_von" name="orderStatusVehReceiptList[${status.index}].order_status_von" value="${base.order_status_von }"/>
																						</c:otherwise>
																					</c:choose>
																				</c:when>
																				<c:otherwise>
																					<c:out value="${base.order_status_von }"/>
																					<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_von" id="orderStatusVehReceiptList[${status.index}].order_status_von" value="${base.order_status_von }"/>
																				</c:otherwise>
																			</c:choose>																			
																		</td>
																		<td scope="row">
																			<c:choose>
																				<c:when test="${orderStatusBean.privilege != '1' }">
																					<c:choose>
																						<c:when test="${ base.wk_flag == 'A'}">
																							<form:input id="orderStatusVehReceiptList[${status.index}].order_status_vin" path="orderStatusVehReceiptList[${status.index}].order_status_vin" type="text" value="${base.order_status_vin }" alt="order_status_vin" onchange="setEdit(${status.index });" size="17" maxlength="17"/>																							
																						</c:when>
																						<c:otherwise>
																							<c:out value="${base.order_status_vin }"/>
																							<input type="hidden" id="orderStatusVehReceiptList[${status.index}].order_status_vin" name="orderStatusVehReceiptList[${status.index}].order_status_vin" value="${base.order_status_vin }"/>
																						</c:otherwise>
																					</c:choose>
																				</c:when>
																				<c:otherwise>
																					<c:out value="${base.order_status_vin }"/>
																					<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_vin" id="orderStatusVehReceiptList[${status.index}].order_status_vin" value="${base.order_status_vin }"/>
																				</c:otherwise>
																			</c:choose>																			
																		</td>
																		<td><c:out value="${base.order_status_status_display }"/></td>
																		<td>
																			<fmt:parseDate value="${base.order_status_status_date}" pattern="yyyy-MM-dd HH:mm:ss" var="statusDate"/>
																			<fmt:formatDate type="date" value="${statusDate}" pattern="yyyy-MM-dd" />	
																		</td>
																		<td>
																			<c:out value="${base.order_status_name }"/><br>
																			<c:out value="${base.order_status_address }"/><br>
																			<c:out value="${base.order_status_city }"/>,&nbsp;
																			<c:out value="${base.order_status_state }"/>&nbsp;
																			<c:out value="${base.order_status_zip }"/>-<c:out value="${base.order_status_sfx }"/>
																		</td>
																		<td>
																			<c:out value="${base.order_status_contact_name }"/><br>
																			<c:out value="${base.order_status_contact_telnum}"/>
																		</td>
																		<td>
																			<fmt:parseDate value="${base.order_status_delivery_date}" pattern="yyyy-MM-dd HH:mm:ss" var="deliveryDate"/>
																			<fmt:formatDate type="date" value="${deliveryDate}" pattern="yyyy-MM-dd"/>
																		</td>
																		<td>
																			<fmt:parseDate value="${base.order_status_date_ag_updated}" pattern="yyyy-MM-dd" var="agUpdateDate"/>
																			<fmt:formatDate type="date" value="${agUpdateDate}" pattern="yyyy-MM-dd" />
																		</td>
																		<td><c:out value="${base.order_status_user_ag_updated }"/></td>
																		<td>
																			<c:choose>
																			<c:when test="${orderStatusBean.privilege != '1'}">
																				<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDateTemp" />
																				<fmt:formatDate type="date" value="${agReceivedDateTemp}" pattern="yyyy-MM-dd" var="agDateDisplay"/>
																				<form:input id="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" path="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" type="text" value="${agDateDisplay }" alt="Date Agency Received" class="dateClass" onchange="checkDate(this,${status.index });"/>(mm/dd/yyyy)
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].counter" id="orderStatusVehReceiptList[${status.index}].counter" value="${status.index }"/>
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].case_number" id="orderStatusVehReceiptList[${status.index}].case_number" value="${base.case_number }"/>																	
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].editRow" id="orderStatusVehReceiptList[${status.index}].editRow" value="${base.editRow }"/>
																				<fmt:parseDate value="${orderStatusBean.orderDate}" pattern="yyyy-MM-dd" var="orderDate"/>
																				<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd" var="formattedOrderDate"/>
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" id="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" value="${formattedOrderDate }"/>
																				<form:input type="hidden" name="orderAction" path="orderAction" id="orderAction" value="${orderStatusBean.orderAction }"/>																				
																			</c:when>
																			<c:otherwise>
																				<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDateTemp"/>
																				<fmt:formatDate type="date" value="${agReceivedDateTemp}" pattern="yyyy-MM-dd" />
																			</c:otherwise>
																			</c:choose>
																		</td>																		
																	</tr>
																	</c:forEach>
																</tbody>
															</table>
															</div>
													</td>
												</tr>												
												<tr>
													<td colspan="2" style="text-align: center;"><input type="button" value="Save" title="submit" class="greenDiv" onclick="sendPage();"></td>
												</tr>
												
												<tr>
													<td width="50%" valign="top"></td>
													<td></td>
												</tr>
											</tbody>
										</table>
										</form:form>
										<table style="width:100%;">
											<tr>
												<td width="100%" colspan="2">
													<div class="width70">
														<div class="vehInf">
															<span>Requisition Data</span>
														</div>
														<div class="vehInfBorder lesstopmargin" >
														<table class="vehQtyTable tableWidth100" summary="Requisition Data">
															<tbody>
																<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
																<tr class="alternateRow" >
																	<td scope="col" style="text-align:right;">
																		<b>Case Number:</b>
																	</td>
																	<td  scope="col">
																		<c:out value="${base2.case_number }"/>
																	</td>
																	<td scope="col" style="text-align:right;">
																		<b>Requisition Number:</b>
																	</td>
																	<td scope="col">
																		<c:out value="${base2.req_fed_mil_req_1 }"/>-<c:out value="${base2.req_fed_mil_req_2 }"/>-<c:out value="${base2.req_fed_mil_req_3 }"/>
																	</td>
																	<td scope="col" style="text-align:right;">
																		<b>Received:</b>
																	</td>
																	<td scope="col">
																		<fmt:parseDate value="${base2.req_Date_Received}" pattern="yyyy-MM-dd HH:mm:ss" var="reqDateReceived"/>
																		<fmt:formatDate type="date" value="${reqDateReceived}" pattern="yyyy-MM-dd" />	
																	</td>
																</tr>
																<tr>
																	<td scope="row" style="text-align:right;">
																		<b>Supp. Address:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Fed_Mil_Sup_Add }"/>
																	</td>
																	<td style="text-align:right;">
																		<b>Signal:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Fed_Mil_Signal }"/>
																	</td>
																	<td style="text-align:right;">
																		<b>Fund:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Fed_Mil_Fund }"/>
																	</td>
																</tr>
																<tr class="alternateRow">
																	<td scope="row" style="text-align:right;">
																		<b>Quantity:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Quantity }"/>
																	</td>
																	<td style="text-align:right;">
																		<b>Est. Unit Price:</b>
																	</td>
																	<td>
																		<fmt:formatNumber value="${base2.req_Est_Unit_Price}" type="currency"/>
																	</td>
																	<td style="text-align:right;">
																		<b>Export:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Export_Code }"/>
																	</td>
																</tr>
																<tr>
																	<td scope="row" style="text-align:right;">
																		<b>Std Item:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_std_item }"/>
																	</td>
																	<td style="text-align:right;">
																		<b>Agency Order Number:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_agency_order_number }"/>
																	</td >
																	<td style="text-align:right;">
																		<b>Funded:</b>
																	</td>
																	<td>
																		<c:out value="${base2.req_Funded }"/>
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
															<span>Agency Bureau Data</span>
														</div>
														<div class="vehInfBorder lesstopmargin" >
														<table class="vehQtyTable tableWidth100" summary="agency bureau">
															<tbody>
																<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
																<tr class="alternateRow">
																	<td scope="col" style="text-align:right;">
																		<b>Agency Name:</b>
																	</td>
																	<td  scope="col">
																		<c:out value="${base2.agbu_Agency }"/>
																	</td>
																</tr>
																<tr>
																	<td scope="row" style="text-align:right;">
																		<b>Bureau Name:</b>
																	</td>
																	<td>
																		<c:out value="${base2.agbu_Bureau }"/>
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
															<span>Message</span>
														</div>
														<div class="vehInfBorder lesstopmargin" >
														<table class="vehQtyTable tableWidth100" summary="Message">
															<tbody>
																<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
																<tr class="alternateRow">
																	<td scope="col" style="text-align:right;">
																		<b>Message 1:</b>
																	</td>
																	<td  scope="col">
																		<c:out value="${base2.req_Message_Line1 }"/>
																	</td>
																</tr>
																<tr >
																	<td  style="text-align:right;" scope="row">
																		<b>Message 2:</b>
																	</td>
																	<td  scope="col">
																		<c:out value="${base2.req_Message_Line2 }"/>
																	</td>
																</tr>
																<tr class="alternateRow" >
																	<td  style="text-align:right;">
																		<b>Message 3:</b>
																	</td>
																	<td  >
																		<c:out value="${base2.req_Message_Line3 }"/>
																	</td>
																</tr>
																<tr >
																	<td style="text-align:right;">
																		<b>Message 4:</b>
																	</td>
																	<td >
																		<c:out value="${base2.req_Message_Line4 }"/>
																	</td>
																</tr>
																<tr class="alternateRow">
																	<td scope="col" style="text-align:right;">
																		<b>Message 5:</b>
																	</td>
																	<td  scope="col">
																		<c:out value="${base2.req_Message_Line5 }"/>
																	</td>
																</tr>
																</c:forEach>
															</tbody>
														</table>
														</div>
													</div>
												</td>
											</tr>
											<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
												<c:if test="${fn:length(base2.req_cart_remarks) > 0 }">
													<tr>
														<td width="100%" colspan="2">
															<div class="width70">
																<div class="vehInf">
																	<span>Internal Agency Financial Data</span>
																</div>
																<div class="vehInfBorder lesstopmargin" >
																<table class="vehQtyTable tableWidth100">
																	<tbody>																		
																		<tr class="alternateRow" >
																			<td scope="col">
																				<c:out value="${base2.req_cart_remarks }"/>
																			</td>
																		</tr>
																	</tbody>
																</table>
																</div>
															</div>
														</td>
													</tr>
												</c:if>
											</c:forEach>
											
										</table>
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
										<div class="redColorRow"></div>
										<div class="redColorRow"></div>
										<div class="noteDiv">
											<img class="pinImg" src="/AutoChoice/resources/img/pin.png" alt="pin">&nbsp;
											<b>Instructions to Consignee Receiving New Motor
												Vechicles Purchased by GSA:</b>
											<p>This information is currently printed on the reverse
												of the consignee copy of the motor vehicle delivery order
												(MVDO). Effective immediately, all agency personnel
												designated as an authorized approver or responsible for
												receipt of agency owned vehicles shall record the month,
												date and year the purchased vehicle is received on line in
												AutoChoice. The approved agency representative shall
												document the month, date and year a new vehicle(s) was
												received.</p>

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