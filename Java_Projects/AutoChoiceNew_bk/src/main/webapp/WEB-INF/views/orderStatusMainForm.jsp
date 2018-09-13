
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

function sendPage(elem){
	var searchValue = $('input[name=searchType]:checked', '#myForm').val();
	var actionString = "";
	if(searchValue == ''){
		alert("Please select a Search Type");	
		return false;
	}
	if(document.getElementById("myForm").searchFrom.value == ''){
		alert("Please enter search text");
		return false;	
	}
	if(elem.value == 'Submit'){
		actionString = "/AutoChoice/OrderStatusMain";		
	}
	else{
		actionString = "/AutoChoice/OrderStatusCOV";
	}
	document.getElementById("myForm").action = actionString;
	document.getElementById("myForm").submit();
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
					<a name="maincontent"></a>
					<table width="97%">
						<tbody>
							<tr>
								<td>
									<div class="rightColMenu">
										<ul>
											<li ><a title="Order Status Vehicle Receipt" onmouseover="orderStatusMenu('1')"
												href="/AutoChoice/OrderStatusVehReceiptForm">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp; |</li>
											<li class="active"><a title="Order Status Form" onmouseover="orderStatusMenu('2')"
												href="#">&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Delivery Procedure" onmouseover="orderStatusMenu('3')"
												href="/AutoChoice/OrderStatusDeliveryProc">&nbsp;Delivery Proc</a>&nbsp;&nbsp;&nbsp;</li>
										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="/AutoChoice/resources/img/small_line.jpg" alt="line image">
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<table class="littleMargin tableWidth97">
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
									<!-- -
									<div class="extraOptions" onclick="javascript:window.print();">
										<img width="20" title="Print" src="resources/img/printer.png"
											alt="Print">&nbsp; print
									</div> <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
									 
								</td>
							</tr>
						</tbody>
					</table>
					<table class="tableWidth97">
						<tbody>
							<tr>
								<td colspan="6">

									<div class="optionsMainDiv">
										<form:form commandName="OrderStatusMain" action="/AutoChoice/OrderStatusMain" modelAttribute ="orderStatusBean" method="post" name="myForm"  id="myForm">
										<table class="tableWidth100">
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

															<table cellpadding="4" class="leftSpacing tableWidth100">

																<tbody>
																	<tr>
																		<td>&nbsp;</td>
																		<td class="vehQtyTable tdgreenBg">Search Key</td>
																	</tr>
																	<tr>
																		<td width="35%" align="right"></td>
																		<td>
																			<div class="checkbox">
																				<input type="radio" value="Case" name="searchType" id="searchType" checked title="select Case Number" /> 
																				<label for="searchType">Case Number</label>
																			</div>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left">
																			<input type="radio" value="AgencyOrderNumber" name="searchType" id="searchType" title="select Agency Order Number" /> 
																			<label for="searchType">Agency Order Number</label>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>
																			<input type="radio" value="Requisition"  name="searchType" id="searchType" title="select Requisition"/> 
																			<label for="searchType">Requisition	Number&nbsp;(xxxxxx-xxxx-xxxx)</label>
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>
																			<input type="radio" value="VIN"  name="searchType" id="searchType" title="select VIN"/> 
																			<label for="searchType">VIN Number (Enter full/partial VIN)</label>
																		</td>
																	</tr>
																	<tr>
																		<td></td>
																		<td>
																			<form:input type="text" class="smallinput" path="searchFrom" name="searchFrom" id="searchFrom" title="Search Text" size="17" maxlength="17" onblur="upperCase(this);" />
																		</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td align="center" colspan="2">
																			<input type="button" value="Submit" class="greenDiv" name="button" onclick="sendPage(this);">&nbsp;
																			<c:if test="${commonBean.userAccount.privilege == 'A' ||
																				commonBean.userAccount.privilege == 'S'}">
																				<input type="button" value="COV" class="greenDiv" name="button" onclick="sendPage(this);">																				
																			</c:if>
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