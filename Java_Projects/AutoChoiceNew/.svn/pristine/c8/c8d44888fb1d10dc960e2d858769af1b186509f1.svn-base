<%@ include file="includeTop.jsp"%>
<html
    xmlns:o='urn:schemas-microsoft-com:office:office'
    xmlns:w='urn:schemas-microsoft-com:office:word'
    xmlns='http://www.w3.org/TR/REC-html40'>
    <head><title>Time</title>
    <xml>
        <w:worddocument xmlns:w="#unknown">
            <w:view>Print</w:view>
            <w:zoom>90</w:zoom>
            <w:donotoptimizeforbrowser />
        </w:worddocument>
    </xml>
    <style>
        @page Section1
        {size:8.5in 11.0in;
         margin:1.0in 1.25in 1.0in 1.25in ;
         mso-header-margin:.5in;
         mso-footer-margin:.5in; mso-paper-source:0;}
        div.Section1
        {page:Section1;}
    </style>
</head>
<body lang=EN-US style='tab-interval:.5in'>
<div class="Section1">
<form:form commandName="fsrBean" modelAttribute="fsrBean" method="post" name="myForm">

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
								<td><c:out value="${column.value}" /></td>
							</c:forEach>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form:form>
		</div>

</body>
</html>
