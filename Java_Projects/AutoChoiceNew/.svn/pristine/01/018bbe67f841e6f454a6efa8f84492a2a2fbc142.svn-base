<%@ include file="includeTop.jsp"%>
<html 
xmlns:o="urn:schemas-microsoft-com:office:office" 
xmlns:x="urn:schemas-microsoft-com:office:excel" 
xmlns="http://www.w3.org/TR/REC-html40">
<head>
	<!--[if gte mso 9]>
		<xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>
		<x:Name>{worksheet}</x:Name><x:WorksheetOptions>
		<x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets>
		</x:ExcelWorkbook></xml><![endif]-->
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Status - Contract</title>
</head>
<body>
<table>
	<thead>
		<c:forEach var="base" varStatus="status" items="${orderStatusBean.contrCaseList }">
		<tr  >
			<th scope="col" colspan="6">
				<b>Contract Number: <c:out value="${base.contr_case_contract }"/> - <c:out value="${base.contrduns_contract_full_name }"/></b> 
			</th>																		
		</tr>
		</c:forEach>
		<tr  >
			<th >Mod</th>
			<th >Sch Line</th>
			<th >Ordered Date</th>
			<th >Shipment Date</th>
			<th >Quantity</th>
			<th >Unit Price</th>																
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
		<tr><td colspan="6"><b>Vehicle Description</b></td></tr>
		<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">
		<tr class="alternateRow">
			<td ></td>
			<td scope="row"><b>Standard Item Desc.:</b></td>
			<td><c:out value="${base.std_items_description }"/></td>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td ></td>
			<td scope="row"><b>Color:</b></td>
			<td><c:out value="${base.req_Veh_Color }"/></td>
			<td colspan="3"></td>
		</tr>
		<tr class="alternateRow">
			<td ></td>
			<td scope="row"><b>Non Std Desc.:</b></td>
			<td><c:out value="${base.req_Non_Std_Desc }"/></td>
			<td colspan="3"></td>
		</tr>
		</c:forEach>
		<tr><td colspan="6"><b>Options</b></td></tr>
		<tr >
			<td colspan="6">
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
					<td></td>
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
					<td colspan="3"></td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:set var="otherOptFound" value="${true}"/>
			</c:otherwise>
			</c:choose>
		</c:forEach>
		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
			<td></td>
			<td scope="row" style="text-align: left;">
				 <b>= Total Options per Vehicle</b> <em>(A)</em>
			</td>
			<td style="text-align: right;">
				<fmt:formatNumber type="currency" value="${totOptVehPrice}"/>
				<c:set var="totPrice" value="${totPrice + totOptVehPrice }"/>
			</td>
			<td colspan="3"></td>
		</tr>
		<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">	
			<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
				<td></td>
				<td scope="row" style="text-align: left;">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					Quantity <em>(B)</em>
				</td>
				<td style="text-align: right;">x <c:out value="${base.req_Quantity }"/></td>
				<c:set var="totPrice" value="${base.req_Quantity * totPrice }"/>
				<td colspan="3"></td>
			</tr>
		</c:forEach>
		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
			<td></td>
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
			<td colspan="3"></td>
		</tr>																
		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
			<td></td>
			<td colspan="2">
				&nbsp;&nbsp;&nbsp;<b>+ Other Options : </b>
			</td>
			<td colspan="3"></td>
		</tr>
		<c:forEach var="base" varStatus="status" items="${orderStatusBean.contractLineOptionList }">
			<c:if test="${base.options_table_valid_qty == 'O' }">
				<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
					<td></td>
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
					<td colspan="3"></td>
				</tr>
			</c:if>
		</c:forEach>
		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
			<td></td>
			<td scope="row" style="text-align: left;">
				 <b>= Total Other Options </b><em> (D)</em> 
			</td>
			<td style="text-align: right;">
				<fmt:formatNumber type="currency" value="${totOptOrderPrice}"/>
				<c:set var="totPrice" value="${totPrice + totOptOrderPrice }"/>
			</td>
			<td colspan="3"></td>
		</tr>
		<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if> >
			<td></td>
			<td scope="row" style="text-align: left;"><b>= Total Options Price  </b> <em>(D+C)</em></td>
			<td style="text-align: right;">
				<fmt:formatNumber type="currency" value="${totPrice}"/>
			</td>
			<td colspan="3"></td>
		</tr>
		<tr><td colspan="6"><b>Solicitation Data</b></td></tr>
		<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">	
		<tr>
			<td></td>
			<td scope="row"><b>Solicitation No.:</b></td>
			<td><c:out value="${base.solicitation_sol_no }"/></td>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td scope="row"><b>Schedule Line:</b></td>
			<td><c:out value="${base.contr_case_Sch_Line }"/></td>
			<td colspan="3"></td>
		</tr>																	
		<tr><td colspan="6"><b>Buyer Information</b></td></tr>
		<tr class="alternateRow">
			<td></td>
			<td scope="row"><b>NAME:</b></td>
			<td><c:out value="${base.buyer_First_Name }"/> <c:out value="${base.buyer_Last_Name }"/></td>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td scope="row"><b>Telephone:</b></td>
			<td><c:out value="${base.buyer_Phone }"/></td>
			<td colspan="3"></td>
		</tr>																	
		<tr><td colspan="6"><b>Mark,TCN,ACRN,NSN,Registration No.</b></td></tr>			
		<tr class="alternateRow">
			<td></td>
			<td scope="row"><b>Mark For:</b></td>
			<td><c:out value="${base.req_Mark_For }"/></td>
			<td colspan="3"></td>
		</tr>
		<tr>	
			<td></td>
			<td scope="row"><b>ACRN:</b></td>
			<td><c:out value="${base.req_ACRN }"/></td>
			<td colspan="3"></td>
		</tr>	
		<tr>
			<td></td>
			<td scope="row"><b>TCN:</b></td>
			<td><c:out value="${base.req_TCN }"/></td>
			<td colspan="3"></td>
		</tr>	
		<tr>
			<td></td>
			<td scope="row"><b>NSN:</b></td>
			<td><c:out value="${base.req_NSN }"/></td>
			<td colspan="3"></td>
		</tr>	
		<tr>
			<td></td>
			<td scope="row"><b>Registration No.:</b></td>
			<td><c:out value="${base.req_Registration_No }"/></td>
			<td colspan="3"></td>
		</tr>			
		</c:forEach>							
	</tbody>
</table>

</body>
</html>