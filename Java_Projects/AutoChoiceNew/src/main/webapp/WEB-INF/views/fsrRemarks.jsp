<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<script>
	function orderStatusMenu(val)
	{
		if(val==1){
			$( ".bgImgDiv" ).css( "margin-left", "-18px" );
		}else if(val==2){
			$( ".bgImgDiv" ).css( "margin-left", "90px" );
		}else if(val==3){
			$( ".bgImgDiv" ).css( "margin-left", "167px" );
		}else if(val==4){
			$( ".bgImgDiv" ).css( "margin-left", "230px" );
		}else if(val==5){
			$( ".bgImgDiv" ).css( "margin-left", "300px" );
		}
		
	}
	function showSubContent(divId)
	{
		
		if(divId=='1'){
			$(".div1").show();	
			$(".div2").hide();
			$(".div3").hide();
			$(".div4").hide();
			$(".div5").hide();
		}
		else if(divId=='2'){
			$(".div2").show();	
			$(".div1").hide();
			$(".div3").hide();
			$(".div4").hide();
			$(".div5").hide();
		}
		else if(divId=='3'){
			$(".div3").show();	
			$(".div1").hide();
			$(".div2").hide();
			$(".div4").hide();
			$(".div5").hide();
		}
		else if(divId=='4'){
			$(".div4").show();	
			$(".div1").hide();
			$(".div2").hide();
			$(".div3").hide();
			$(".div5").hide();
		}
		if(divId=='5'){
			$(".div5").show();	
			$(".div1").hide();
			$(".div2").hide();
			$(".div3").hide();
			$(".div4").hide();
		}
	}

	function confirmDelete(caseno, key){
		if(confirm("Are you sure you want to delete this record?")){
			var deleteString = "/AutoChoice/FSRRemarks/" + caseno + "/" + key + "/delete";
			window.location = deleteString;
		}			
	}

	function checkSize() {
		if (document.getElementById("remarksText").value.length > 800) {
		   alert("Text box length cannot exceed 800 characters.");
		   return false
		}
		return true;
	} 
</script>
  
  
</head>
<body>
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
							<li><a href="/AutoChoice/FSRReportBuilder">FSR Build Report</a></li>
							<li><a href="http://www.fsrsolutions.fas.gsa.gov" target="_blank">FSR Solution Blog</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-9">
					<div class="rightColMenuSplash" >
					   <ul>
						  	<li ><a title="Order Status Delivery Procedure" onmouseover="orderStatusMenu('1')"
								href="/AutoChoice/OrderStatusDeliveryProc">&nbsp;Delivery Proc</a>&nbsp;&nbsp;&nbsp; |</li>
							<li ><a title="Order Status Main" onmouseover="orderStatusMenu('2')"
								href="/AutoChoice/OrderStatusMain/Case/${fsrBean.caseNo}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Order</a>&nbsp;&nbsp;&nbsp; |</li>
							<li><a title="Order Status Contract" onmouseover="orderStatusMenu('3')"
								href="/AutoChoice/OrderStatusContract/Case/${fsrBean.caseNo}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Contract</a>&nbsp;&nbsp;&nbsp; |</li>
							<li><a title="Order Status Address" onmouseover="orderStatusMenu('4')"
								href="/AutoChoice/OrderStatusAddress/Case/${fsrBean.caseNo}/ZZ/ZZ">&nbsp;&nbsp;&nbsp;&nbsp;Address</a>&nbsp;&nbsp;&nbsp;</li>
					   </ul>
					  	<div class="bgImgDiv">
					   		<img src="<c:out value="/AutoChoice/resources/img/small_line.jpg" />"/>
					 	</div>
					</div>
					
					<table style="width:97%;">
						<tr>
							<td style="text-align: center;"><span class="titleText">FSR Remarks - <c:out value="${fsrBean.caseNo }"/></span></td>
						</tr>
						<tr>
							<td>
								<c:if test="${fn:length(fsrBean.returnMessage) > 0 }">		
									<div style="text-align:center;"><c:out value="${fsrBean.returnMessage }"/></div>
								</c:if>
							</td>
						</tr>
						<tr>
							<td>
								<c:choose>
									<c:when test="${fn:length(fsrBean.reqFSRList) > 0 }">
										<div class="padding10">
										<div class="vehInfBorder vehInfoFixed">	
											<table id="fluidTable" class="vehQtyTable tableWidth100 tableCellPadding" summary="Table consist data on New Requisition not submited to GSA">
												<thead>
													<tr>
														<th style="text-align:center; width:20%;" scope="col">Date Updated</th>
														<th style="text-align:center; width:50%;" scope="col">Remarks</th>
														<th style="text-align:center; width:15%;" scope="col">User</th>
														<th style="text-align:center; width:15%;" scope="col">Action</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${fsrBean.reqFSRList }" var="fsrListItem"  varStatus="status">
														<tr  <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
															<td scope="row" style="text-align:left;"><c:out value="${fsrListItem.updatedDate }"/></td>
															<td style="text-align:left;"><c:out value="${fn:substring(fsrListItem.remarks,0,100) }"/></td>
															<td style="text-align:left;"><c:out value="${fsrListItem.userUpdated }"/></td>
															<td style="text-align:center;">
																<a href="/AutoChoice/FSRRemarks/${fsrListItem.caseNo}/${fsrListItem.fSR_Key}/update">Update</a><br>
																<a href="javascript:confirmDelete('${fsrListItem.caseNo}',${fsrListItem.fSR_Key});">Delete</a>
															</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										</div>
									</c:when>
									<c:otherwise>No remarks at this time</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</table>
					
					
					<form:form commandName="FSRRemarks" action="/AutoChoice/FSRRemarks" modelAttribute ="fsrBean" method="post" name="myForm"  id="myForm">
						<div class="padding10">
							<c:set var="remarksTemp" value=""/>
							<c:if test="${fsrBean.remarksAction == 'update' || fsrBean.remarksAction == 'delete' }">
								<c:forEach items="${fsrBean.reqFSRList }" var="fsrItem">
				    				<c:if test="${fsrItem.fSR_Key == fsrBean.remarksKey }">
				    					<c:set var="remarksTemp" value="${fn:trim(fsrItem.remarks) }"/>				    					
				    				</c:if>
				    			</c:forEach> 
			    			</c:if>
					    	<textarea class="noteTextarea" style="text-align:left;" title="enter text here" name="remarksText" id="remarksText" placeholder="Put your Note Here." onkeyup="checkSize()"><c:out value="${fn:trim(remarksTemp) }"/></textarea><br><br>
					    	
					    	<div class="pagination-centered">
					    		<c:choose>
						    		<c:when test="${fsrBean.remarksAction == 'update'}">
						    			<input type="hidden" name="action" id="action" value="update"/>
						    			<input type="Submit" class="greenDiv" value="Update" title="submit button">
						    		</c:when>
						    		<c:otherwise>
						    			<input type="hidden" name="action" id="action" value="add"/>
						    			<input type="Submit" class="greenDiv" value="Add" title="submit button">
						    		</c:otherwise>
					    		</c:choose>				    		
					    	</div>
						</div>
					</form:form>
				
			</div>
		</div>
	</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>