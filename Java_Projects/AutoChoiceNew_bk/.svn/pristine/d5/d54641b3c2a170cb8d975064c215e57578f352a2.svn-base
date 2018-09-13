<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table width="97%">
	<tbody>
		<tr>
			<td colspan="6">
				<div class="rightColMenu">
					<ul>
					
						<li>
						<c:choose>
						  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'Minimum'))||(fn:contains(pageContext.request.requestURL, 'minimum'))}">
							<a  onmouseover="slideMenu('1')" class="active">Minimum Requirements</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('1')" href="/AutoChoice/Minimum" onclick="return CheckUpdate();">Minimum Requirements</a> |
						   </c:otherwise>
						   </c:choose> 
						</li>
                        
                        <li> 
						<c:choose>
						  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'Options'))||(fn:contains(pageContext.request.requestURL, 'options'))}">
							<a  onmouseover="slideMenu('2')" class="active">Options</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('2')" href="/AutoChoice/Options" onclick="return CheckUpdate();">Option</a> |
						   </c:otherwise>
						   </c:choose> 
						</li>


                        <li> 
						<c:choose>
						  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'Compare'))||(fn:contains(pageContext.request.requestURL, 'compare'))}">
							<a  onmouseover="slideMenu('3')" class="active">Compare Prices</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('3')" href="/AutoChoice/Compare" onclick="return CheckUpdate();">Compare Prices</a> |
						   </c:otherwise>
						   </c:choose> 
						</li>

						<li>
						<c:choose>
						  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'OtherFeatures'))||(fn:contains(pageContext.request.requestURL, 'otherfeatures'))}">
							<a  onmouseover="slideMenu('4')" class="active">Other Features</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('4')" href="/AutoChoice/OtherFeatures" onclick="return CheckUpdate();">Other Features</a> |
						   </c:otherwise>
						   </c:choose> 
						</li>   
						<li>
						<c:choose>
						  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'Clarifications'))||(fn:contains(pageContext.request.requestURL, 'clarifications'))}">
							<a  onmouseover="slideMenu('5')" class="active">Clarifications</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('5')" href="/AutoChoice/Clarifications" onclick="return CheckUpdate();">Clarifications</a> |
						   </c:otherwise>
						  </c:choose> 
    					</li>
						<li>
						 <c:choose>
							  <c:when	test="${(fn:contains(requestScope['javax.servlet.forward.request_uri'], 'Emissions'))||(fn:contains(pageContext.request.requestURL, 'emissions'))}">
						  	  <a  onmouseover="slideMenu('6')" class="active">Emissions</a> |
						   </c:when>
					       <c:otherwise>
							  <a onmouseover="slideMenu('5')" href="/AutoChoice/Emissions" onclick="return CheckUpdate();">Emissions</a> |
						   </c:otherwise>
						  </c:choose> 
						</li>
						<li><a onmouseover="slideMenu('7')" 
							href="http://fleet.fas.gsa.gov/ROADS/VendorPerformance.pdf" target="_blank">Vendor
								Performance</a></li>
					</ul>
					<div class="bgImgDiv requirementsIndicatorPosition"
						style="margin-left: 583px;">
						<img src="<c:url value="/resources/img/small_line.jpg"/>">
					</div>
				</div>
			</td>
		</tr>
	</tbody>
</table>