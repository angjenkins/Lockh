
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script>

function sendPage(){
	var vin = document.getElementById("vinSelected").value.trim();
	var reasonString = document.getElementById("reason").value.trim();
	if(vin.length < 1 ){
		alert("You must first select a VIN.");
		document.getElementById("searchFrom").focus();
		return;
	}
	if(reasonString.length < 1 ){
		alert("Reason (Never Received or Lost) is required to send the request.");
		document.getElementById("reason").focus();
		return;
	}

	document.getElementById("myForm").submit();
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
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%"><span class="titleText">Request for Certificate of Origin for a Vehicle (COV)</span></td>
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
							<tr>
								<td colspan="6">

									<div class="optionsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span>Case <c:out value="${orderStatusBean.caseNumber }"/></span>											
										</div>
										<table style="width:100%;">
											<tbody>
												
												<tr>
													<td colspan="2">
														<c:if test="${fn:length(orderStatusBean.returnMessage2) > 0 }">		
															<div style="text-align:center;"><c:out value="${orderStatusBean.returnMessage2 }"/></div>
														</c:if>
													</td>
												</tr>
												<tr>
													<td width="100%" colspan="2">
															<div class="vehInfBorder lesstopmargin">
																<form:form commandName="OrderStatusCOVEmail" action="/AutoChoice/OrderStatusCOVEmail" modelAttribute ="orderStatusBean" method="post" name="myForm"  id="myForm">
																<table class="vehQtyTable tableWidth100" summary="Request for Certificate of Origin for a Vehicle (COV)">
																	<thead>
																		<tr class="tableHeader" >
																			<th scope="col"> Caseno </th>
																	        <th scope="col"> Requisition No. </th>
																	        <th scope="col"> Contract </th>
																	        <th scope="col"> Model </th>
																	        <th scope="col"> Sch Line </th>
																	        <th scope="col"> Dt Ordered </th>
																			<th scope="col"> Shipment Date </th>																																				
																		</tr>
																	</thead>
																	<tbody>																	
																		<c:set var="groupDUNS" value=""/>
																		<c:forEach var="base" varStatus="status" items="${orderStatusBean.covList }">
																		<c:set var="groupDUNS" value="${base.contrduns_group_duns }"/>
																		<tr class="alternateRow">
																			<td scope="row" style="text-align: center;"><c:out value="${base.case_number }"/></td>
																			<td style="text-align: center;"><c:out value="${base.req_fed_mil_req_1 }"/>-<c:out value="${base.req_fed_mil_req_2 }"/>-<c:out value="${base.req_fed_mil_req_3 }"/></td>
																			<td style="text-align: center;"><c:out value="${base.contr_case_contract }"/></td>
																			<td style="text-align: center;"><c:out value="${base.req_model }"/></td>
																			<td style="text-align: center;"><c:out value="${base.contr_case_Sch_Line }"/></td>
																			<td style="text-align: center;">
																				<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd HH:mm:ss" var="orderDate"/>
																				<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd" />	
																			</td>
																			<td style="text-align: center;">
																				<fmt:parseDate value="${base.contr_case_shipment_date}" pattern="yyyy-MM-dd HH:mm:ss" var="shipDate"/>
																				<fmt:formatDate type="date" value="${shipDate}" pattern="yyyy-MM-dd" />	
																			</td>								
																		</tr>
																		</c:forEach>
																		<tr>
																			<td colspan="7">
																				<c:if test="${fn:length(orderStatusBean.returnMessage) > 0 }">		
																					<div style="text-align:center;"><c:out value="${orderStatusBean.returnMessage }"/></div>
																				</c:if>
																			</td>
																		</tr>
																		<tr class="alternateRow">
																			<td colspan="3" style="text-align: right;"><b>Select Vehicle Identification Number(VIN) :</b></td>
																			<td colspan="4">
																				<select id="vinSelected" name="vinSelected" title="list of available VINs"  >
																			         <c:choose>   
																			            <c:when test ="${orderStatusBean.vinSelected != ''}" >
																			   				<c:forEach items="${orderStatusBean.vinList}" var="selectItem" >
																				   					<option value="${selectItem}" title="${selectItem}" <c:if test="${selectItem == orderStatusBean.vinSelected}">selected</c:if>><c:out value="${selectItem}" /></option>
																			   				</c:forEach>
																			            </c:when>
																			            <c:otherwise>
																				   		    <option value ="Select One" selected>Select One </option>
																			   				<c:forEach items="${orderStatusBean.vinList}" var="selectItem" >
																				   					<option value="${selectItem}" title="${selectItem}"><c:out value="${selectItem}" /></option>
																			   				</c:forEach>
																			            </c:otherwise>   
																			         </c:choose>	
																			    </select>
																			</td>
																		</tr>
																		<tr>
																			<td colspan="3" style="text-align: right;"><b>Reason :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<input type="radio" name="reason" id="reason" value="Never received" alt="Reason - Never received" <c:if test="${fn:length(orderStatusBean.reason) < 1 || orderStatusBean.reason == 'Never received' }">checked</c:if> >
																				<label for="reason">&nbsp; Never received</label>&nbsp;&nbsp;
																				<input type="radio" name="reason" id="reason" value="Lost" alt="Reason - Lost" <c:if test="${orderStatusBean.reason == 'Lost' }">checked</c:if> >
																				<label for="reason">&nbsp; Lost</label>
																			</td>
																		</tr>
																		<tr class="alternateRow">
																			<td colspan="7" style="text-align: center;"><b>Mailing Address</b> - Certificates of Origin are made out to the Agency and Address provided in the Mailing Address. </td>
																		</tr>
																		<c:forEach var="base" varStatus="status" items="${orderStatusBean.covList }">
																		<tr >
																			<td colspan="3" style="text-align: right;"><b>Agency Name :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_Line1 }"/> 
																			</td>
																		</tr>
																		<tr class="alternateRow">
																			<td colspan="3" style="text-align: right;"><b>Address :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_Line2 }"/><br>
																				<c:out value="${base.req_Mail_Add_Line3 }"/><br>
																				<c:out value="${base.req_Mail_Add_Line4 }"/><br> 
																			</td>
																		</tr>
																		<tr >
																			<td colspan="3" style="text-align: right;"><b>City :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_City }"/> 
																			</td>
																		</tr>
																		<tr class="alternateRow" >
																			<td colspan="3" style="text-align: right;"><b>State :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_State }"/> 
																			</td>
																		</tr>
																		<tr >
																			<td colspan="3" style="text-align: right;"><b>Zip :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_Zip }"/>-<c:out value="${base.req_Mail_Add_Zip_Sfx }"/>
																			</td>
																		</tr>
																		<tr class="alternateRow" >
																			<td colspan="3" style="text-align: right;"><b>Country :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<c:out value="${base.req_Mail_Add_Country }"/> 
																			</td>
																		</tr>
																		</c:forEach>
																		<tr  >
																			<td colspan="3" style="text-align: right;"></td>
																			<td colspan="4" style="text-align: left;"></td>
																		</tr>
																		<tr  >
																			<td colspan="3" style="text-align: right;"><b>Copy for Additional Email :</b></td>
																			<td colspan="4" style="text-align: left;">
																				<form:input type="text" path="searchFrom" id="searchFrom" name="searchFrom" value="" size="20" maxlength="50"/>
																			</td>
																		</tr>
																		<tr>
																			<td colspan="7" style="text-align: center;">
																				<input type="button" value="Send via Email" alt="submit" class="greenDiv" onclick="sendPage();" <c:if test="${empty orderStatusBean.toEmailList || groupDUNS == '1'}">disabled</c:if>>
																				<form:input type="hidden" name="orderAction" path="orderAction" id="orderAction" value="${orderStatusBean.orderAction }"/>
																			</td>
																		</tr>
																	</tbody>
																</table>
																</form:form>
															</div>
													</td>
												</tr>												
												
												
												<tr>
													<td width="50%" valign="top"></td>
													<td></td>
												</tr>
											</tbody>
										</table>
										

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