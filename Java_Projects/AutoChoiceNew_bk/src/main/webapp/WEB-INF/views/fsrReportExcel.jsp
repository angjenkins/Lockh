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
	<body>
			<table border=1 summary="Search">
				<thead>
					<tr>
						<th >No.</th>
						<th >State</th>
						<th >City</th>
						<th>Agency Name	</th>
						<th>Bureau Name	</th>
						<th >Case Number</th>
						<th >Qty</th>
						<th >Model</th>
						<th >StdItem</th>
						<th >Contact Shipment Date</th>
						<th >Vendor Shipment Date</th>
						<th >Delivery Date</th>
						<th >VIN</th>
						<th >Contact Name</th>
						<th >Telephone</th> 
						<th >Email</th>
						<th >Order Date</th>  
					</tr>
				</thead>
				<tbody>
					<c:forEach var="base" varStatus="status" items="${fsrBean.fsrCombinedDisplay }">
						<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
							<td><c:out value="${status.count }"/></td>
							<td><c:out value="${base.requisitions_con_add_state }"/></td>
							<td><c:out value="${base.requisitions_con_add_city }"/></td>
							<td><c:out value="${base.agbu_table_agency }"/></td>
							<td><c:out value="${base.agbu_table_bureau }"/></td>
							<td><c:out value="${base.contr_case_caseNo }"/></td>
							<td><c:out value="${base.contr_case_quantity }"/></td>
							<td><c:out value="${base.contr_line_model }"/></td>
							<td><c:out value="${base.contr_line_std_item }"/></td>
							<td>
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
							<td>
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
							<td>
								<fmt:parseDate value="${base.order_status_deliverydt}" pattern="yyyy-MM-dd HH:mm:ss" var="deliveryDate"/>
								<fmt:formatDate type="date" value="${deliveryDate}" pattern="yyyy-MM-dd"/>
							</td>
							<td><c:out value="${base.order_status_vin }"/></td>
							<td><c:out value="${base.requisitions_message_line4 }"/></td>
							<td><c:out value="${base.requisitions_message_line5 }"/></td>
							<td><c:out value="${base.requisitions_con_email_address }"/></td>
							<td>
								<fmt:parseDate value="${base.contr_case_order_date}" pattern="yyyy-MM-dd HH:mm:ss" var="orderDate"/>
								<fmt:formatDate type="date" value="${orderDate}" pattern="yyyy-MM-dd"/>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
</body></html>