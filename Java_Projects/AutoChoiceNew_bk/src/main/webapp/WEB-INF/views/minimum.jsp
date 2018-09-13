<%@ include file="includeTop.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="includeHead.jsp"%>
</head>

<script>
	function doSubmit(vfield) {
 	    document.myForm.submit();
    
}

	
</script>




<body>
    <br>
    
<%--       <form:form commandName="orderBean" modelAttribute="orderBean" method="post"  name="myForm" action="/AutoChoice/Options/${commonBean.stdItem}"> --%>
      
      <form:form commandName="orderBean" modelAttribute="orderBean" method="post"  name="myForm">
    
	<div id="bodyContent"">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<%@ include file="includeLeftmenu.jsp"%>
				<div class="col-md-9">
					<%@ include file="includePagenav.jsp"%>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%"><span class="titleText">Minimum
										Requirements</span></td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>

										</ul>
									</div>
								</td>
								<td width="27%">
									<div class="extraOptions" onclick="javascript:window.print();">
									<img width="20" title="Print" src="<c:url value="/resources/img/printer.png" />"
											alt="Print">&nbsp; print
									</div> <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
								</td>
							</tr>
						</tbody>
					</table>
					<div class="requirementsMainDiv" style="margin-left: 0px;">
						<div class="headerDiv">
							<div class="circledDiv"></div>
							<span>${commonBean.stdItem} -
								${commonBean.stdItemDescription} </span> <br /> <br />

						</div>

					    <c:if test="${! empty minimumBean.stdItemVerbiageList}">
							<div class="vehInf">
								<span>Vehicle Information</span>
							</div>
							<div class="paragraph">
								<section id="demo">
	
									<article>
									
										      <table  class="TextNormal">
										         <tr>
										    	   <td>
										             <c:forEach var="item" items="${minimumBean.stdItemVerbiageList}">
										    	        ${item.description}
										             </c:forEach>
										           </td>
										    	  </tr>    
										        </table> 
	
	<!-- 									<p>Flannel pinterest Austin twee narwhal, hoodie swag wolf -->
	<!-- 										photo booth. Hella kale chips marfa occupy pitchfork put a -->
	<!-- 										bird on it. Semiotics dreamcatcher selfies beard DIY umami -->
	<!-- 										craft beer 3 wolf moon. Try-hard literally mustache polaroid -->
	<!-- 										ennui VHS. High life fixie wolf, trust fund twee seitan -->
	<!-- 										pinterest blog helvetica sriracha. Tattooed selvage try-hard, -->
	<!-- 										biodiesel banjo direct trade echo park kogi tonx bespoke. Pork -->
	<!-- 											belly put a bird on it iphone, fixie literally bespoke tonx -->
	<!-- 										butcher +1 swag.</p> -->
									</article>
	
								</section>
							</div>
                      </c:if> 
					</div>
		    	      
 
					<div class="tableDiv1">
						<table width="100%" class="vehQtyTable">
							<tbody>
								<tr class="tableHeader">
									<th width="50%">GSA Components</th>
									<th width="20%">GSA Min Req</th>
									<c:forEach items="${minimumBean.model}" var="column">
										<th width="20%"><c:out value="${column}" /></th>
									</c:forEach>

								</tr>
								<c:forEach items="${minimumBean.stdOptions}" var="column">
									<tr>
										<td><div class="tdgreenBg">
												<c:out value="${column.key}" />
											</div></td>
									</tr>
										<c:forEach items="${column.value}" var="stdoptions" varStatus="loopDetail">
											<tr class="${loopDetail.index % 2 == 0 ? 'alternateRow' : ''}">
												<td><div class="descCont">${stdoptions.key}</div></td>
												<td>${stdoptions.value}</td>

												<c:forEach
													items="${minimumBean.stdOptionsValues[stdoptions.key]}"
													var="stdOptionDesc">
													<td valign="bottom"><div class="descCont">${stdOptionDesc.value}</div></td>
												</c:forEach>
											</tr>
										</c:forEach>
								</c:forEach>
							
							</tbody>
						</table>
					</div>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%">&nbsp;</td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
								</td>
								<td width="27%">&nbsp;</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		
	</div>

  </form:form> 
	<%@ include file="includeFooter.jsp"%>
</body>
</html>