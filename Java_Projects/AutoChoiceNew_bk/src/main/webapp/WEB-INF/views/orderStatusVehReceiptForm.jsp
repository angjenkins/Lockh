
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>
$(function() {
	$( "#dateFrom" ).datepicker({
		dateFormat : "mm/dd/yy",
		defaultDate: "<c:out value='${orderStatusBean.dateFrom}'/>",
		changeMonth: true,
		changeYear: true,
		numberOfMonths: 1,
		minDate: new Date("January 01, 2000"),
		onClose: function( selectedDate ) {
			$( "#dateTo" ).datepicker( "option", "minDate", selectedDate );
		}
	});
	$( "#dateTo" ).datepicker({
		dateFormat : "mm/dd/yy",
		defaultDate: "<c:out value='${orderStatusBean.dateTo}'/>",
		changeMonth: true,
		changeYear: true,
		numberOfMonths: 1,
		minDate: new Date("January 01, 2000"),
		onClose: function( selectedDate ) {
			$( "#dateFrom" ).datepicker( "option", "maxDate: 0D", selectedDate );
		}
	});
});

function sendPage(){
	var searchValue = $('input[name=searchType]:checked', '#myForm').val();
	if((searchValue == 'Case' ||
			searchValue == 'AgencyOrderNumber' ||
			searchValue == 'Requisition') &&
			(document.getElementById("searchFrom").value.length > 0 && document.getElementById("searchTo").value.length > 0)){
		document.getElementById("myForm").submit();
	}
	else{
		if(searchValue == 'ShipDateRange'  &&
				document.getElementById("dateFrom").value.length > 0 && 
				document.getElementById("dateTo").value.length > 0){
			document.getElementById("myForm").submit();
		}
		else{
			alert("Please select a Search Type and designate its corrresponding From and To search option.");
		}
	}	
}

function upperCase(elem){
	elem.value = elem.value.toUpperCase();
}
</script>
<!-- End of Date Picker -->
    
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
					<table width="97%">
						<tbody>
							<tr>
								<td>
									<div class="rightColMenu">
										<ul>
											<li class="active"><a onmouseover="orderStatusMenu('1')"
												href="#">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp; |</li>
											<li><a onmouseover="orderStatusMenu('2')"
												href="/AutoChoice/OrderStatusMainForm">&nbsp;&nbsp;&nbsp;&nbsp;Order
													Status</a>&nbsp;&nbsp;&nbsp; |</li>

										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="resources/img/small_line.jpg" alt="line image">
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
											<span>Record the actual date your agency received each vehicle.</span> <br>
											<br>
										</div>
										<form:form commandName="OrderStatusVehReceipt" action="/AutoChoice/OrderStatusVehReceipt" modelAttribute ="orderStatusBean" method="post" name="myForm"  id="myForm">
										<table width="100%">
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
																<span></span>
															</div>

															<table width="100%" cellpadding="4" class="leftSpacing">

																<tbody>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td width="35%" align="right"></td>
																		<td>
																			<div class="checkbox">
																				<input type="radio" value="Case" name="searchType" id="searchType" checked/> 
																				<label for="searchType">Case Number</label>
																			</div>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left">
																			<input type="radio" value="AgencyOrderNumber" name="searchType" id="searchType"/> 
																			<label for="searchType">Agency Order Number</label>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>
																			<input type="radio" value="Requisition"  name="searchType" id="searchType"/> 
																			<label for="searchType">Requisition	Number&nbsp;(xxxxxx-xxxx-xxxx)</label>
																		</td>
																	</tr>
																	<tr>
																		<td></td>
																		<td>
																			&nbsp;<label for="searchFrom">From:</label>&nbsp;<form:input type="text" class="smallinput" path="searchFrom" name="searchFrom" id="searchFrom" onblur="upperCase(this);" />
																			&nbsp;<label for="searchTo">To:</label>&nbsp;<form:input type="text" class="smallinput" path="searchTo" name="searchTo" id="searchTo" onblur="upperCase(this);"/>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>--&nbsp;OR&nbsp;--</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left">
																			<input type="radio" value="ShipDateRange"  name="searchType" id="searchType"/> 
																			<label for="searchType">Estimated Shipment Date	Range</label>
																		</td>
																	</tr>
																	<tr>
																		<td></td>
																		<td>&nbsp;<label for="dateFrom">From:</label>&nbsp;<form:input id="dateFrom" path="dateFrom" type="text" value=""/>
																			&nbsp;<label for="dateTo">To:</label>&nbsp;<form:input id="dateTo" path="dateTo" type="text" value=""/>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td align="center" colspan="2">
																			<input
																			type="button" value="Proceed" class="greenDiv"
																			name="button" onclick="sendPage();" title="proceed button">
																			<form:input type="hidden" name="orderAction" path="orderAction" id="orderAction" value="${orderStatusBean.orderAction }"/>
																		</td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
												</tr>
												<tr>
													<td colspan="2"></td>
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