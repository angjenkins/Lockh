
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
					<table width="97%">
						<tbody>
							<tr>
								<td>
									<div class="rightColMenu">
										<ul>
											<li class="active"><a title="Order Status Vehicle Receipt" onmouseover="orderStatusMenu('1')"
												href="#">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Form" onmouseover="orderStatusMenu('2')"
												href="/AutoChoice/OrderStatusMainForm">&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Delivery Procedure" onmouseover="orderStatusMenu('3')"
												href="/AutoChoice/OrderStatusDeliveryProc">&nbsp;Delivery Proc</a>&nbsp;&nbsp;&nbsp; </li>
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
								<td width="35%"><span class="titleText">Vehicle
										Receipt</span></td>
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
							<TR>
								<td colspan="6">
									- Enter the actual date your agency received the vehicle by vehicle identification number (VIN). <bR />
									- Select the case number for more detail information on your order. <br />
									- If the order does not have any status data, select the case number to enter date of receipt.<br />
									- VIN is required when entering receipt date
								</td>
							</TR>
							<tr>
								<td colspan="6">

									<div class="optionsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span>RECORDING RECEIPT DATE OF VEHICLE</span>											
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
													<td width="100%" colspan="2">
														<div class="vehInfBorder">
															<div class="vehInf lesstopmargin">
																<span>Record the actual date your agency received each vehicle.</span>
															</div>
															<table class="vehQtyTable">
																<thead>
																	<tr class="tableHeader" >
																		<th  style="cursor:n-resize;" scope="col">Case Number</th>
																		<th  style="cursor:n-resize;" scope="col">VON</th>
																		<th  style="cursor:n-resize;" scope="col">VIN</th>
																		<th  style="cursor:n-resize;" scope="col">Std Item</th>
																		<th  style="cursor:n-resize;" scope="col">Model</th>
																		<th  style="cursor:n-resize;" scope="col">Status</th>
																		<th  style="cursor:n-resize;" scope="col">Status Date</th>
																		<th  style="cursor:n-resize;" scope="col">Contract Shipping<br> Due Date</th>
																		<th  style="cursor:n-resize;" scope="col">Contract Address</th>
																		<th  style="cursor:n-resize;" scope="col">Tel. Number</th>
																		<th  style="cursor:n-resize;" scope="col">Deliver Date</th>
																		<th  style="cursor:n-resize;" scope="col">Date Ag Updated</th>
																		<th  style="cursor:n-resize;" scope="col">User Ag Updated</th>
																		<th  style="cursor:n-resize;" scope="col">Date Ag Received</th>																		
																	</tr>
																</thead>
																<tbody>
																	<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusVehReceiptList }">
																	<input type="hidden" name="orderStatusVehReceiptList[${status.index}].editRow" id="orderStatusVehReceiptList[${status.index}].editRow" value="${base.editRow }"/>
																	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																		<td scope="row">
																			<a href="/AutoChoice/OrderStatusMain/CaseNo/${base.case_number }/ZZ/ZZ" title="Order Status Case Number - ${base.case_number  }">
																				<c:out value="${base.case_number }"/>
																			</a>
																		</td>
																		<td><c:out value="${base.order_status_von }"/></td>
																		<td><c:out value="${base.order_status_vin }"/></td>
																		<td><c:out value="${base.req_std_item }"/></td>
																		<td><c:out value="${base.req_model }"/></td>
																		<td><c:out value="${base.order_status_status }"/></td>
																		<td>																			
																			<fmt:parseDate value="${base.order_status_status_date}" pattern="yyyy-MM-dd HH:mm:ss" var="statusDate"/>
																			<fmt:formatDate type="date" value="${statusDate}" pattern="yyyy-MM-dd" />																				
																		</td>
																		<td>
																			<fmt:parseDate value="${base.contr_case_shipment_date}" pattern="yyyy-MM-dd HH:mm:ss" var="shipDate"/>
																			<fmt:formatDate type="date" value="${shipDate}" pattern="yyyy-MM-dd" />
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
																			<c:when test="${fn:length(base.order_status_vin) > 0 && orderStatusBean.privilege != '1'}">
																				<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDate" />
																				<fmt:formatDate type="date" value="${agReceivedDate}" pattern="yyyy-MM-dd" var="agDateDisplay"/>
																				<form:input id="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" path="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" type="text" value="${agDateDisplay }" alt="Date Agency Received" class="dateClass" onchange="checkDate(this,${status.index });"/>(mm/dd/yyyy)
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].counter" id="orderStatusVehReceiptList[${status.index}].counter" value="${status.index }"/>
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].case_number" id="orderStatusVehReceiptList[${status.index}].case_number" value="${base.case_number }"/>																	
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_vin" id="orderStatusVehReceiptList[${status.index}].order_status_vin" value="${base.order_status_vin }"/>
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_von" id="orderStatusVehReceiptList[${status.index}].order_status_von" value="${base.order_status_von }"/>
																				<form:input type="hidden" name="orderAction" path="orderAction" id="orderAction" value="${orderStatusBean.orderAction }"/>
																				<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd" var="orderDate"/>
																				<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd" var="formattedOrderDate"/>
																				<input type="hidden" name="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" id="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" value="${formattedOrderDate }"/>																				
																			</c:when>
																			<c:otherwise>
																				<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDate"/>
																				<fmt:formatDate type="date" value="${agReceivedDate}" pattern="yyyy-MM-dd" />
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
													<td colspan="2" style="text-align: center;"><input type="button" value="Save" alt="submit" class="greenDiv" onclick="sendPage();"></td>
												</tr>
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
										<div class="redColorRow"></div>
										<div class="redColorRow"></div>
										<div class="noteDiv">
											<img class="pinImg" src="resources/img/pin.png" alt="pin">&nbsp;
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