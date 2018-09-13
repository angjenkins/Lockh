
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>
<script>
	function doSubmit(vfield) {
	    <c:if test="${commonBean.userAccount.multiRecordFileFlag == 'Y'}">
	    	document.myForm.action = "/AutoChoice/ReqDetailsMIPR";
	    </c:if>
 	    document.myForm.submit();
    
}
</script>



<body>
	<br>
<form:form commandName="orderBean" modelAttribute="orderBean" method="post"  name="myForm" >
	
	
	<div id="bodyContent">
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
								<td width="35%"><span class="titleText">Summary</span></td>
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
										<img width="20" title="Print" src="resources/img/printer.png"
											alt="Print">&nbsp; print
									</div>
									<div class="extraOptions" onclick="javascript:void(0);">
										<img width="20" title="Email" src="resources/img/mail.png" alt="Print">&nbsp;
										email
									</div>
								</td>
							</tr>
						</tbody>
					</table>

					<table width="97%">
						<tbody>
							<tr>
								<td colspan="6">
									<div style="border: none; width: 103%; margin-left: -12px;"
										class="requirementsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span><c:out value="${orderBean.stdItemDTO.stdItem}"/> -<c:out value="${orderBean.stdItemDTO.description}"/> </span> <br>
											<br>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>





					<div class="colorsDiv">
						<table width="97%" class="vehQtyTable">
							<tbody>
						     <tr> 
									<td class="lightBlueBg2">Manufacturer:</td>
									<td align="left" colspan="2"><span class="desc"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.manufacturerName}"/></span></td>
								</tr>
								<tr>
									<td class="lightBlueBg2">Model Year:</td>
									<td align="left" ><span class="desc"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.modelYYYY}"/></span></td>
								</tr>
								<tr>
									<td class="lightBlueBg2">Model:</td>
									<td ><span class="desc"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.modelDescripton}"/></span></td>
								</tr>
								<tr>
									<td class="lightBlueBg2">MPG(City/Hwy/Combined):</td>
									
									<td align="left" ><span class="desc"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.mpgB}"/>/<c:out value="${orderBean.contrLineDTO.mpgC}"/>/<c:out value="${orderBean.contrLineDTO.mpgH}"/></span></td>
								</tr>
								<tr>
									<td class="lightBlueBg2">g CO2/mile:</td>
										
									<td  align="left" colspan="2"><span class="desc"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.gramsPerMile}"/></span></td>
								</tr>
								<tr>
									<td class="lightBlueBg2">Base Price <span
										class="lightBlueText">(A)</span></td>
									
									<td align="left"><c:out value="${orderBean.compareBeanTemp.contrLineDTO.currUnitPrice}"/></td>
								</tr>
								<tr>
									<td class="lightBlueBg2" colspan="2"><span class="lightBlueText">+</span>
										Vehicle Options:</td>
								</tr>
								<tr>
							

									 <c:forEach items="${orderBean.compareBeanTemp.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  >
									    <c:if test="${(contrLineOptCheckDTO.validQty !='O') && (contrLineOptCheckDTO.oemptionType != 'N/A')}"> 
										     <tr class="grayBg">
											         <td class="blueText">
											 	        <span data-toggle="tooltip" data-placement="top" class="popup"  title="${contrLineOptCheckDTO.description}">
											             <c:out value="${contrLineOptCheckDTO.option_Code}"/>
											            </span>
										              </td>
													  <td class="amountSec">
														  	        <c:choose>
															  	           <c:when test="${contrLineOptCheckDTO.oemptionType == 'N/A'}">
																  	              <%--  <c:out value="${contrLineOptCheckDTO.oemptionType}"/>   N/A is the value  --%>
															  	           </c:when>
															  	           <c:otherwise>
															  	              <fmt:formatNumber var="unitPrice" type="number" pattern="###,###,##0.00" value="${contrLineOptCheckDTO.unitPrice}"/>
															  	               <c:out value="${unitPrice}"/>
															  	           </c:otherwise> 	  	        
															        </c:choose>
										              </td>
										        </tr>
										  </c:if>	
									</c:forEach>
								</tr>
								<tr>
									<td class="lightBlueBg2"><span class="leftPadding10">Total Veh.Options </span><span class="lightBlueText">(B)</span></td>
									
									<td align="right">
									   <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.totVehicleOptionPrice}"/>
       				                   <c:out value="${temp}"/>
       								</td>
								</tr>
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">=</span>Sub-Total
										Unit Price<span class="lightBlueText"> (A+B)</span></td>
									
									<td align="right">
									   <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.subTotUnitPrice}"/>
       				                   <c:out value="${temp}"/>
       								</td>
								</tr>
								<tr>
									<td class="lightBlueBg2">Quantity <span
										class="lightBlueText">(C)</span></td>
									
									<td align="right">
    									 <fmt:formatNumber var="temp" type="number" pattern="###" value="${orderBean.compareBeanTemp.vehQty}"/>
         								<c:out value="${temp}"/>
           						    </td>
								</tr>
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">=</span>
										Sub-Total Price<span class="desc"><span
											class="lightBlueText">(A+B)*C</span></span></td>
									
									<td align="right">
    						           <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.subTotalBeforeOrderOption}"/>
					                    <c:out value="${temp}"/>
					                </td>
								</tr>
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">+</span>
										Order Options +:</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									 <c:forEach items="${orderBean.compareBeanTemp.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  >
									    <c:if test="${(contrLineOptCheckDTO.validQty =='O') && (contrLineOptCheckDTO.oemptionType != 'N/A')}"> 
										     <tr class="grayBg">
											         <td class="blueText">
											 	        <span data-toggle="tooltip" data-placement="top" class="popup"  title="${contrLineOptCheckDTO.description}">
											             <c:out value="${contrLineOptCheckDTO.option_Code}"/> x <c:out value="${contrLineOptCheckDTO.quantity}"/>
											            </span>
										              </td>
										              
										              
													  <td class="amountSec">
														  	        <c:choose>
															  	           <c:when test="${contrLineOptCheckDTO.oemptionType == 'N/A'}">
																  	              <%--  <c:out value="${contrLineOptCheckDTO.oemptionType}"/>   N/A is the value  --%>
															  	           </c:when>
															  	           <c:otherwise>
															  	              <fmt:formatNumber var="unitPrice" type="number" pattern="###,###,##0.00" value="${contrLineOptCheckDTO.unitPrice}"/>
															  	               <c:out value="${unitPrice}"/>
															  	           </c:otherwise> 	  	        
															        </c:choose>
										            </td>
										        </tr>
										  </c:if>	
									</c:forEach>
								</tr>
								
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">=</span>Total Order Options $
										<span class="lightBlueText"> (A+B)</span></td>
									
									<td align="right">
									       <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.totalOrderOptionsPrice}"/>
         								 <c:out value="${temp}"/>
       								</td>
								</tr>
								
								
				         		<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">=</span>Total Price
										<span class="lightBlueText"> (A+B)</span></td>
									
									<td align="right">
   											   <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.totalPriceBeforeSC}"/>
         										<c:out value="${temp}"/>
          								</td>
								</tr>
										
								
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">+</span>
										GSA Surcharge</td>
									
									<td align="right">  
									       <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.totsurcharge}"/>
         									<c:out value="${temp}"/>
                                    </td>
								</tr>
								<tr>
									<td class="lightBlueBg2"><span class="lightBlueText">=
									</span>Total Selling Price$ <span class="desc"><span
											class="lightBlueText">(F)</span></span></td>
									
									<td align="right"> 
									       <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.totalSellingPrice}"/>
        								   	<c:out value="${temp}"/>
 		   						 	</td>
								</tr>
							</tbody>
						</table>
					</div>

					<div class="colorsDiv">
						<div class="redColorRow"></div>
						<div class="redColorRow"></div>
						<table width="97%" cellpadding="3" class="vehQtyTable">
							<tbody>
								<tr>
									<td width="30%" class="lightBlueBg2"><span
										class="lightBlueText">=</span> Unit Selling Price$ <span
										class="lightBlueText">(F/C)</span></td>
									<td align="right"> 
									       <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${orderBean.compareBeanTemp.unitSellingPRice}"/>
        								   	<c:out value="${temp}"/>
 		   						 	</td>
								</tr>
							</tbody>
						</table>
					</div>

					<br>

					<div>
						<div class="colorsDiv">
							<table width="98%" style="margin: 10px auto;" class="vehQtyTable">
								<tbody>
									<tr>
										<td class="tableHeader" colspan="2"><b>REMARKS</b></td>
									</tr>
									<tr>
										<td colspan="2" class="skyBlueBground"><b>This Option
												is Not Available (NA)</b></td>
									</tr>
									 <c:forEach items="${orderBean.compareBeanTemp.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  >
									      <c:if test="${contrLineOptCheckDTO.oemptionType == 'N/A'}"> 
										     <tr class="grayBg">
											         <td class="blueText">
											 	        <span data-toggle="tooltip" data-placement="top" class="popup"  title="${contrLineOptCheckDTO.description}">
											             <c:out value="${contrLineOptCheckDTO.option_Code}"/> -    <c:out value="${contrLineOptCheckDTO.description}"/>
											            </span>
										              </td>
						 			        </tr>
										  </c:if>	
									</c:forEach>
								</tbody>
							</table>
						</div>
						<br> <br>
						<div class="colorsDiv">
							<table width="70%" style="margin: 10px auto;" vehqtytable	=""
								class="class=">
								<tbody>
									<tr>
										<td class="tableHeader"><b>Total Quantity:</b></td>
										<td align="right"><input value="1" class="smallinput"></td>
									</tr>
								</tbody>
							</table>
						</div>
						<table width="60%">
							<tbody>
								<tr>
									<td colspan="3">&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td align="left">
										<div class="simplePagination">
											<ul>
  										    <li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
												<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
											</ul>
										</div>
									</td>
									<td>&nbsp;</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
 </form:form>	
	<%@ include file="includeFooter.jsp"%>
</body>