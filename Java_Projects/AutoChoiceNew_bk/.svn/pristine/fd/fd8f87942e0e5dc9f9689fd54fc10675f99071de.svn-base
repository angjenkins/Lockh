
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
</head>

<script type="text/javascript">

function checkInput(){
	var dateFromString = document.getElementById("dateFrom").value.trim();
	var dateToString = document.getElementById("dateTo").value.trim();
	var dateTypeString = document.getElementById("dateType").value.trim();
	if(dateFromString.length < 1 ){
		alert("Date From is required to send the request.");
		document.getElementById("dateFrom").focus();
		return;
	}
	if(dateToString.length < 1 ){
		alert("Date To is required to send the request.");
		document.getElementById("dateTo").focus();
		return;
	}
	if(dateTypeString.length < 1 ){
		alert("Date Type (Order or Shipment) is required to send the request.");
		document.getElementById("dateType").focus();
		return;
	}

	document.getElementById("myForm").submit();
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
		$( "#dateFrom" ).datepicker({
			dateFormat : "mm/dd/yy",
			defaultDate: "<c:out value='${fsrBean.dateFrom}'/>",
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
			defaultDate: "<c:out value='${fsrBean.dateTo}'/>",
			changeMonth: true,
			changeYear: true,
			numberOfMonths: 1,
			minDate: new Date("January 01, 2000"),
			onClose: function( selectedDate ) {
				$( "#dateFrom" ).datepicker( "option", "maxDate: 0D", selectedDate );
			}
		});
	});
</script>
    <!-- End of Date Picker -->

<style>
	.tableHeader th {
	padding: 2.5px;
	text-align:center;
	font-size:12px;
	}
	.wmd-view-topscroll{
	position:fixed;
	bottom:0;
	right:2.4%;
	}
</style>
<style>
	div.ui-datepicker{
	 font-size:10px;
	}
</style>

<body class="fsrBody">
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeLoginBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<div class="col-md-3">
					<div class="leftDiv fsrLeftNav">
						<div class="leftDivHeader">
							<h4 class="leftDivHeading">FSR Program</h4>
						</div>
						<ul class="leftMemu parent">
							<c:forEach var="regions" items="${fsrBean.regionList }">
								<li>
									<a <c:if test="${fsrBean.region.region_Code ==regions.region_Code }">class="leftMenuActive"</c:if> href="/AutoChoice/FSRListExecute/${regions.region_Code }" title="FSR Report By Region - ${regions.regionName }">
										<c:out value="${regions.region_Code }"/>-<c:out value="${regions.regionName }"/> 
										<c:if test="${fsrBean.region.region_Code ==regions.region_Code }">
											<img border="0" alt="&gt;" alt="menu left arrow" class="bc-arrow leftArrow" src="<c:url value="/resources/img/arrow.gif" />">
										</c:if>
									</a>
								</li>
							</c:forEach>
						</ul>
					</div>
					<div class="leftDiv fsrLeftSubNav">
						<ul class="leftMemu parent">
							<li><a href="/AutoChoice/FSRReportBuilder" title="FSR Report Builder">FSR Build Report</a></li>
							<li><a href="http://www.fsrsolutions.fas.gsa.gov" target="_blank" title="FSR Solution Blog">FSR Solution Blog</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-9">
					<div class="">
						<table width="97%"  class="leftSpacing">
							<tbody>
								<tr>
									<td width="35%" ><span class="titleText">FSR-<c:out value="${ fsrBean.region.regionName}"/></span></td>
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
										<!-- <div class="extraOptions" onclick="javascript:window.print();"> -->
											<a href ="/AutoChoice/FSRReportExcel" title="Excel/print" ><img width="20" title="Print" alt="Excel/print" src="<c:url value="/resources/img/excel.png" />" alt="Print">&nbsp; Excel (print)</a>
										<!--</div> <div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
									</td>
								</tr>
								<c:if test="${fn:length(fsrBean.returnMessage) > 0 }">								
									<tr>
										<td colspan="3" style="text-align:center;">
											<c:out value="${fsrBean.returnMessage }"/>
										</td>
									</tr>
								</c:if>
								<tr>
									<td colspan="3">
										<div class="vehInfBorder">
											<div class="vehInf vehInfInner100">
										   		<span>Orders Due to be Shipped</span>
										   	</div>
											<form:form commandName="FSRListExecute" action="/AutoChoice/FSRListExecute" modelAttribute ="fsrBean" method="post" name="myForm"  id="myForm">
												<div class="noteDiv padding10">
													<table style="width: 70%; height: 80px;">
														<tr>
															<td style="width: 18%;">
																<input type="radio" name="dateType" id="dateType" value="order" alt="Date Type - Order" <c:if test="${fn:length(fsrBean.dateType) < 1 || fsrBean.dateType == 'order' }">checked</c:if> >
																<label for="dateType">&nbsp; Order Date</label>
															</td>
															<td style="width: 10%;">&nbsp;</td>
															<td >Date Range: &nbsp;&nbsp;&nbsp;&nbsp;</td>
														</tr>
													    <tr>
													    	<td>
													    		<input type="radio" name="dateType" id="dateType" alt="Date Type - Shipment" value="shipment" <c:if test="${fsrBean.dateType == 'shipment' }">checked</c:if>>
													    		<label for="reqVal1">&nbsp; Shipment Date</label>
													    	</td>
															<td>&nbsp;</td>														
															<td >
																<div class="noteDiv">
																	From:&nbsp;<form:input id="dateFrom" path="dateFrom" type="text" value=""  alt="Date From"/><font class="mandatoryField">*</font>
																	To:&nbsp;<form:input id="dateTo" path="dateTo" type="text"  alt="Date To"  value="" /><font class="mandatoryField">*</font>
																	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																	<input type="button" value="Submit" class="greenDiv" onclick="checkInput();" alt="submit"/>
																</div>
															</td>														
														</tr>
													</table>														
													<div class="container"></div>												   
												</div>
												<div class="container"></div>
												<div class="redColorRow"></div>
												<div class="redColorRow"></div>														
											</form:form>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<div class="wmd-view-topscroll">
						    <div class="scroll-div1">
						    </div>
						</div>
						<div class="vehInfBorder vehInfoFixed">						
							<table id="fluidTable" class="vehQtyTable tableWidth100 font11 tableCellPadding" summary="Table consist data on New Requisition not submited to GSA">
								<thead>
									<tr class="tableHeader" >
										<th  style="cursor:n-resize;" scope="col">No.</th>
										<th  style="cursor:n-resize;" scope="col">State</th>
										<th  style="cursor:n-resize;" scope="col">City</th>
										<th  style="cursor:n-resize;" scope="col">Agency <br> Name</th>
										<th  style="cursor:n-resize;" scope="col">Bureau <br> Name</th>
										<th  style="cursor:n-resize;" scope="col">Case<br> Number</th>
										<th  style="cursor:n-resize;" scope="col">Qty</th>
										<th  style="cursor:n-resize;" scope="col">Model</th>
										<th  style="cursor:n-resize;" scope="col">StdItem</th>
										<th  style="cursor:n-resize;" scope="col">Order Date</th> 
										<th  style="cursor:n-resize;" scope="col">Contact<br>Shipment Date</th>
										<th  style="cursor:n-resize;" scope="col">Vendor<br> Shipment Date</th>
										<th  style="cursor:n-resize;" scope="col">Delivery Date</th>
										<th  style="cursor:n-resize;" scope="col">VIN</th>
										<th  style="cursor:n-resize;" scope="col">Contact Name</th>
										<th  style="cursor:n-resize;" scope="col">Telephone</th> 
										<th  style="cursor:n-resize;" scope="col">Email</th>										 
										<th  style="cursor:n-resize;" scope="col">Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="base" varStatus="status" items="${fsrBean.fsrCombinedDisplay }">
									<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
										<td scope="row"><c:out value="${status.count }"/></td>
										<td><c:out value="${base.requisitions_con_add_state }"/></td>
										<td><c:out value="${base.requisitions_con_add_city }"/></td>
										<td><c:out value="${base.agbu_table_agency }"/></td>
										<td><c:out value="${base.agbu_table_bureau }"/></td>
										<td><c:out value="${base.contr_case_caseNo }"/></td>
										<td><c:out value="${base.contr_case_quantity }"/></td>
										<td><c:out value="${base.contr_line_model }"/></td>
										<td><c:out value="${base.contr_line_std_item }"/></td>
										<td class="dateFieldTd">
											<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd HH:mm:ss" var="orderDate"/>
											<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd"/>
										</td>
										<td class="dateFieldTd">
											<c:catch var="isNumber">
											   <c:set var="var" value="${fn:substring(base.contr_case_shipment_date,0,1) * 1}" />
											</c:catch>
											<c:choose>
												<c:when test="${isNumber == null}">
													<fmt:parseDate value="${base.contr_case_shipment_date}" pattern="yyyy-MM-dd HH:mm:ss" var="shipDate"/>
													<fmt:formatDate type="date" value="${shipDate}" pattern="yyyy-MM-dd" />
												</c:when>
												<c:otherwise>
													<c:out value="${base.contr_case_shipment_date }"/>
												</c:otherwise>
											</c:choose>
										</td>
										<td class="dateFieldTd">
											<c:catch var="isNumber2">
											   <c:set var="var" value="${fn:substring(base.order_status_status_date,0,1) * 1}" />
											</c:catch>
											<c:choose>
												<c:when test="${isNumber2 == null}">
													<fmt:parseDate value="${base.order_status_status_date}" pattern="yyyy-MM-dd" var="statusDate"/>
													<fmt:formatDate type="date" value="${statusDate}" pattern="yyyy-MM-dd" />
												</c:when>
												<c:otherwise>
													<c:out value="${base.order_status_status_date }"/>
												</c:otherwise>
											</c:choose>
										</td>
										<td class="dateFieldTd">
											<fmt:parseDate value="${base.order_status_deliverydt}" pattern="yyyy-MM-dd HH:mm:ss" var="deliveryDate"/>
											<fmt:formatDate type="date" value="${deliveryDate}" pattern="yyyy-MM-dd"/>
										</td>
										<td><c:out value="${base.order_status_vin }"/></td>
										<td><c:out value="${base.requisitions_message_line4 }"/></td>
										<td><c:out value="${base.requisitions_message_line5 }"/></td>
										<td><c:out value="${base.requisitions_con_email_address }"/></td>										
										<td class="lastChild">
											<a href="/AutoChoice/OrderStatusMain/Case/${base.contr_case_caseNo}/ZZ/ZZ">View</a><br> 
											<a href="/AutoChoice/FSRRemarks/${base.contr_case_caseNo}/KEY/load">Remarks</a></td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
							<script type="text/javascript">
								var menu=new menu.dd("menu");
								menu.init("menu","menuhover");
								$(function(){
									var tableWidth=$("#fluidTable").width();
									$(".scroll-div1").width(tableWidth);
									var rightSideWidth=$(".col-md-9").width();
									$(".wmd-view-topscroll").width(rightSideWidth);
									if(tableWidth<=rightSideWidth){
										$(".wmd-view-topscroll").hide();	
									}
								    $(".wmd-view-topscroll").scroll(function(){
								        $(".vehInfoFixed")
								            .scrollLeft($(".wmd-view-topscroll").scrollLeft());
								    });
								    
								   
								});
							</script>	
						</div>
									
									
						<div>
							<br>
							<table width="98%">
								<tbody>
									<tr>
										<td align="center"></td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%">&nbsp;</td>
								<td width="42%" class="rightPadding105">
									<!-- 
									<div class="simplePagination">
										<ul>
											<li><a class="active" href="#">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
									 -->
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