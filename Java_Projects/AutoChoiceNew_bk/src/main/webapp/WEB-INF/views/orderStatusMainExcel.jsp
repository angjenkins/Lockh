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
<title>Order Status - Main</title>
</head>
<body>
	
<table >
<thead>
	<tr>
		<td colspan="10">
			<b>Order Status</b>
		</td>
	</tr>
	<tr class="tableHeader" >
		<th  >VON</th>
		<th  >VIN</th>
		<th  >Status</th>
		<th >Date</th>
		<th  >Contact Address</th>
		<th  >Telephone Number</th>
		<th  >Delivery Date</th>
		<th >Date Ag Updated</th>
		<th  >User Ag Updated</th>
		<th  >Date Agency Received</th>																		
	</tr>
</thead>
<tbody>
	<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusVehReceiptList }">
	<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
		<td scope="row">
			<c:out value="${base.order_status_von }"/>																					
		</td>
		<td scope="row">
			<c:out value="${base.order_status_vin }"/>									
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
			<fmt:parseDate value="${base.order_status_date_ag_received}" pattern="yyyy-MM-dd" var="agReceivedDateTemp"/>
			<fmt:formatDate type="date" value="${agReceivedDateTemp}" pattern="yyyy-MM-dd" />	
		</td>																		
	</tr>
	</c:forEach>
	<tr><td colspan="10"><b>Requisition Data</b></td></tr>
	<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
	<tr  >
		<td ></td>
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
		<td colspan="3"></td>
	</tr>
	<tr>
		<td ></td>
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
		<td colspan="3"></td>
	</tr>
	<tr >
		<td ></td>
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
		<td colspan="3"></td>
	</tr>
	<tr>
		<td ></td>
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
		<td colspan="3"></td>
	</tr>
	</c:forEach>
	<tr><td colspan="10"><b>Agency Bureau Data</b></td></tr>
	<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
	<tr class="alternateRow">
		<td ></td>
		<td scope="col" style="text-align:right;">
			<b>Agency Name:</b>
		</td>
		<td  scope="col">
			<c:out value="${base2.agbu_Agency }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	<tr>
		<td ></td>
		<td scope="row" style="text-align:right;">
			<b>Bureau Name:</b>
		</td>
		<td>
			<c:out value="${base2.agbu_Bureau }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	</c:forEach>
	<tr><td colspan="10"><b>Message</b></td></tr>
	<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
	<tr class="alternateRow">
		<td ></td>
		<td scope="col" style="text-align:right;">
			<b>Message 1:</b>
		</td>
		<td  scope="col">
			<c:out value="${base2.req_Message_Line1 }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	<tr >
		<td ></td>
		<td  style="text-align:right;" scope="row">
			<b>Message 2:</b>
		</td>
		<td  scope="col">
			<c:out value="${base2.req_Message_Line2 }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	<tr class="alternateRow" >
		<td ></td>
		<td  style="text-align:right;">
			<b>Message 3:</b>
		</td>
		<td  >
			<c:out value="${base2.req_Message_Line3 }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	<tr >
		<td ></td>
		<td style="text-align:right;">
			<b>Message 4:</b>
		</td>
		<td >
			<c:out value="${base2.req_Message_Line4 }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	<tr class="alternateRow">
		<td ></td>
		<td scope="col" style="text-align:right;">
			<b>Message 5:</b>
		</td>
		<td  scope="col">
			<c:out value="${base2.req_Message_Line5 }"/>
		</td>
		<td colspan="7"></td>
	</tr>
	</c:forEach>
	<c:forEach var="base2" varStatus="status" items="${orderStatusBean.orderStatusList }">
		<c:if test="${fn:length(base2.req_cart_remarks) > 0 }">
			<tr><td colspan="10"><b>Internal Agency Financial Data</b></td></tr>
			<tr ><td ></td><td colspan="9"><c:out value="${base2.req_cart_remarks }"/></td></tr>
		</c:if>
	</c:forEach>
	</tbody>
</table>
</body>
</html>