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
						<c:forEach items="${fsrBean.reportBuilderResult[0]}"
							var="column">
							<th><c:out value="${column.key}" /></th>
						</c:forEach>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${fsrBean.reportBuilderResult}"
						var="columns">
						<tr>
							<c:forEach items="${columns}" var="column">
								<td STYLE="vnd.ms-excel.numberformat:mm/dd/yyyy" ><c:out value="${column.value}" /></td>
							</c:forEach>
						</tr>
					</c:forEach>
				</tbody>
			</table>
</body></html>