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
<title>Order Status - Address</title>
</head>
<body>
<table>
<c:forEach var="base" varStatus="status" items="${orderStatusBean.orderStatusList }">
	<tr>
		<th colspan="3">Order Status - Address Info (<c:out value="${orderStatusBean.caseNumber }"/>)</th>
	</tr>
	<tr><td colspan="3"><b>Requisitioner Address</b></td></tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Address:</b></td>
		<td>
			<c:out value="${base.req_Req_Add_Line1 }"/><br>
			<c:out value="${base.req_Req_Add_Line2 }"/><br>
			<c:out value="${base.req_Req_Add_Line3 }"/><br>
			<c:out value="${base.req_Req_Add_Line4 }"/>
		</td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>City:</b></td>
		<td><c:out value="${base.req_Req_Add_City }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>State:</b></td>
		<td><c:out value="${base.req_Req_Add_State }"/></td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>Country:</b></td>
		<td><c:out value="${base.req_Req_Add_Country }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Zip Code:</b></td>
		<td><c:out value="${base.req_Req_Add_Zip }"/>-<c:out value="${base.req_Req_Add_Zip_Sfx }"/></td>
	</tr>
	<tr  >
		<td></td>
		<td scope="row"><b>Email:</b></td>
		<td><c:out value="${base.req_Req_Email_Address }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Fax:</b></td>
		<td><c:out value="${base.req_Req_Fax_Number }"/></td>
	</tr>	
	<tr><td colspan="3"><b>Mailing Address</b></td></tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Address:</b></td>
		<td>
			<c:out value="${base.req_Mail_Add_Line1 }"/><br>
			<c:out value="${base.req_Mail_Add_Line2 }"/><br>
			<c:out value="${base.req_Mail_Add_Line3 }"/><br>
			<c:out value="${base.req_Mail_Add_Line4 }"/>
		</td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>City:</b></td>
		<td><c:out value="${base.req_Mail_Add_City }"/></td>
	</tr>
	<tr  class="alternateRow">
		<td></td>
		<td scope="row"><b>State:</b></td>
		<td><c:out value="${base.req_Mail_Add_State }"/></td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>Country:</b></td>
		<td><c:out value="${base.req_Mail_Add_Country }"/></td>
	</tr>
	<tr  class="alternateRow">
		<td></td>
		<td scope="row"><b>Zip Code:</b></td>
		<td><c:out value="${base.req_Mail_Add_Zip }"/>-<c:out value="${base.req_Mail_Add_Zip_Sfx }"/></td>
	</tr>		
	<tr><td colspan="2"><b>Delivery Address</b></td></tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Address:</b></td>
		<td>
			<c:out value="${base.req_Con_Add_Line1 }"/><br>
			<c:out value="${base.req_Con_Add_Line2 }"/><br>
			<c:out value="${base.req_Con_Add_Line3 }"/><br>
			<c:out value="${base.req_Con_Add_Line4 }"/>
		</td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>City:</b></td>
		<td><c:out value="${base.req_Con_Add_City }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>State:</b></td>
		<td><c:out value="${base.req_Con_Add_State }"/></td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>Country:</b></td>
		<td><c:out value="${base.req_Con_Add_Country }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Zip Code:</b></td>
		<td><c:out value="${base.req_Con_Add_Zip }"/>-<c:out value="${base.req_Req_Add_Zip_Sfx }"/></td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>Email:</b></td>
		<td><c:out value="${base.req_Con_Email_Address }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Fax:</b></td>
		<td><c:out value="${base.req_Con_Fax_Number }"/></td>
	</tr>		
	<tr><td colspan="3"><b>Billing Address</b></td></tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Address:</b></td>
		<td>
			<c:out value="${base.req_Bill_Add_Line1 }"/><br>
			<c:out value="${base.req_Bill_Add_Line2 }"/><br>
			<c:out value="${base.req_Bill_Add_Line3 }"/><br>
			<c:out value="${base.req_Bill_Add_Line4 }"/>
		</td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>City:</b></td>
		<td><c:out value="${base.req_Bill_Add_City }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>State:</b></td>
		<td><c:out value="${base.req_Bill_Add_State }"/></td>
	</tr>
	<tr >
		<td></td>
		<td scope="row"><b>Country:</b></td>
		<td><c:out value="${base.req_Bill_Add_Country }"/></td>
	</tr>
	<tr class="alternateRow">
		<td></td>
		<td scope="row"><b>Zip Code:</b></td>
		<td><c:out value="${base.req_Bill_Add_Zip }"/>-<c:out value="${base.req_Mail_Add_Zip_Sfx }"/></td>
	</tr>				
</c:forEach>
</table>
</body>
</html>