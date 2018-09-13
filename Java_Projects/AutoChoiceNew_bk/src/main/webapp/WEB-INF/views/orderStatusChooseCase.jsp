
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>

var updated = false;

function sendAgencyOrderPage(elem){
	if(elem.value == ''){
		alert("Please select a case");
		return false;
	}
	else{
		var destination = "";
		if(document.getElementById("orderAction").value == 'COV'){
			destination = "OrderStatusCOV";
		}
		else{
			destination = "OrderStatusMain";
		}
		document.getElementById("searchFrom").value = elem.value;
		document.getElementById("myForm").action = "/AutoChoice/" + destination;
		document.getElementById("myForm").submit();
	}
}

function sendVINPage(){
	if(updated){		
		document.getElementById("myForm").action = "/AutoChoice/OrderStatusUpdate";
		document.getElementById("myForm").submit();
	}
	else{
		alert("No rows were updated.");
	}
}

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



</script>

<style>
	div.ui-datepicker{
	 font-size:10px;
	}
</style>
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
												href="/AutoChoice/OrderStatusMainForm">&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp; </li>
										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="/AutoChoice/resources/img/small_line.jpg">
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

									<div class="optionsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span>CHOOSE CASE</span>											
										</div>
										<form:form commandName="OrderStatusMain" action="" modelAttribute ="orderStatusBean" method="post" name="myForm"  id="myForm">
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
															<c:choose>
															<c:when test="${orderStatusBean.searchType == 'AgencyOrderNumber' }">
																<div class="width70">
																	<div class="vehInf">
																		<span>Select case:</span>
																	</div>
																	<div class="vehInfBorder lesstopmargin">
																	<table class="vehQtyTable tableWidth100">
																		<tr >
																			<td scope="col" style="">	
																				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																				<b>Select a case :</b>																			
																				<select name="reqListBox" id="reqListBox" onchange="sendAgencyOrderPage(this);" >
																					<option value="" title="select a case">Select a case:</option>
																					<c:forEach items="${orderStatusBean.reqList }" var="req">
																						<option value="${req.caseNumber }" title="${req.caseNumber }"><c:out value="${req.caseNumber }"/></option>
																					</c:forEach>
																				</select>
																				<form:input type="hidden" name="searchFrom" path="searchFrom" id="searchFrom" value=""/>
																				<form:input type="hidden" name="searchType" path="searchType" id="searchType" value="Case"/>
																				<form:input type="hidden" name="orderAction" path="orderAction" id="orderAction" value="${orderStatusBean.orderAction }"/>
																			</td>																	
																		</tr>
																		<tr><td>&nbsp;</td></tr>
																		<tr><td>&nbsp;</td></tr>
																	</table>
																	</div>
																</div>
															</c:when>
															<c:when test="${orderStatusBean.searchType == 'VIN' }">
																<div class="vehInf">
																	<span>Select case:</span>
																</div>
																<div class="vehInfBorder lesstopmargin">
																<table class="vehQtyTable tableWidth100">
																	<thead>
																		<tr class="tableHeader" >
																			<th  style="cursor:n-resize;" scope="col">VON</th>
																			<th  style="cursor:n-resize;" scope="col">VIN</th>
																			<th  style="cursor:n-resize;" scope="col">Case</th>
																			<th  style="cursor:n-resize;" scope="col">Std Item</th>
																			<th  style="cursor:n-resize;" scope="col">Model</th>
																			<th  style="cursor:n-resize;" scope="col">Status</th>
																			<th  style="cursor:n-resize;" scope="col">Date</th>
																			<th  style="cursor:n-resize;" scope="col">Contact Address</th>
																			<th  style="cursor:n-resize;" scope="col">Telephone Number</th>
																			<th  style="cursor:n-resize;" scope="col">Delivery Date</th>
																			<th  style="cursor:n-resize;" scope="col">Date Ag Updated</th>
																			<th  style="cursor:n-resize;" scope="col">User Ag Updated</th>
																			<c:if test="${orderStatusBean.privilege == 'A' || orderStatusBean.privilege == 'S' }">
																				<th  style="cursor:n-resize;" scope="col">Date Agency Received</th>
																			</c:if>																		
																		</tr>
																	</thead>
																	<tbody>
																		<c:set var="dateExists" value="${false}"/>
																		<c:choose>
																			<c:when test="${orderStatusBean.orderAction == 'COV' }">
																				<c:set var="command" value="OrderStatusCOV"/>
																			</c:when>																			
																			<c:otherwise>
																				<c:set var="command" value="OrderStatusMain"/>
																			</c:otherwise>
																		</c:choose>																		
																	
																		<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusVehReceiptList }">
																		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
																			<td scope="row">
																				<c:out value="${base.order_status_von }"/>															
																			</td>
																			<td>
																				<a href="/AutoChoice/${command }/VIN/${base.order_status_vin }/ZZ/ZZ" title="Order Status VIN Number - ${base.order_status_vin  }">
																					<c:out value="${base.order_status_vin }"/>	
																				</a>																	
																			</td>
																			<td>
																				<a href="/AutoChoice/${command }/CaseNo/${base.case_number }/ZZ/ZZ" title="Order Status Case Number - ${base.case_number  }">
																					<c:out value="${base.case_number }"/>		
																				</a>																
																			</td>
																			<td>
																				<c:out value="${base.req_std_item }"/>																		
																			</td>
																			<td>
																				<c:out value="${base.req_model }"/>																		
																			</td>
																			<td><c:out value="${base.order_status_status }"/></td>
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
																			
																			<c:if test="${orderStatusBean.privilege == 'A' || orderStatusBean.privilege == 'S'}">
																				<td>
																					<c:choose>
																					<c:when test="${not empty base.contr_case_order_date}">
																						<c:set var="dateExists" value="${true}"/>
																						<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDateTemp" />
																						<fmt:formatDate type="date" value="${agReceivedDateTemp}" pattern="yyyy-MM-dd" var="agDateDisplay"/>
																						<form:input id="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" path="orderStatusVehReceiptList[${status.index}].order_status_date_ag_received_string" type="text" value="${agDateDisplay }" alt="Date Agency Received" class="dateClass" onchange="checkDate(this,${status.index });"/>(mm/dd/yyyy)
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].case_number" id="orderStatusVehReceiptList[${status.index}].case_number" value="${base.case_number }"/>																	
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_vin" id="orderStatusVehReceiptList[${status.index}].order_status_vin" value="${base.order_status_vin }"/>
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].order_status_von" id="orderStatusVehReceiptList[${status.index}].order_status_von" value="${base.order_status_von }"/>
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].editRow" id="orderStatusVehReceiptList[${status.index}].editRow" value="${base.editRow }"/>
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].counter" id="orderStatusVehReceiptList[${status.index}].counter" value="${status.index }"/>
																						<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd" var="orderDate"/>
																						<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd" var="formattedOrderDate"/>
																						<input type="hidden" name="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" id="orderStatusVehReceiptList[${status.index}].contr_case_order_date_string" value="${formattedOrderDate }"/>																			
																					</c:when>
																					<c:otherwise>
																						<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDateTemp"/>
																						<fmt:formatDate type="date" value="${agReceivedDateTemp}" pattern="yyyy-MM-dd" />
																					</c:otherwise>
																					</c:choose>
																				</td>
																			</c:if>																		
																		</tr>
																		</c:forEach>
																	</tbody>
																</table>
																</div>
															</c:when>
															</c:choose>
													</td>
												</tr>
												<c:if test="${orderStatusBean.searchType == 'VIN' && orderStatusBean.privilege != '1' && dateExists}">
													<tr>
														<td colspan="2" style="text-align: center;"><input type="button" value="Save" alt="submit" class="greenDiv" onclick="sendVINPage();"></td>
													</tr>
												</c:if>
												<tr>
													<td width="50%" valign="top"></td>
													<td></td>
												</tr>
											</tbody>
										</table>
										</form:form>

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