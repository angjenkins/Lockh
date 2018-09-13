
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>

<body>
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<div class="col-md-9">
					<table width="97%">
						<tbody>
							<tr>
								<td>
									<div class="rightColMenu">
										<ul>
											<li ><a title="Order Status Vehicle Receipt" onmouseover="slideMenu('1')"
												href="/AutoChoice/OrderStatusVehReceiptForm">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp; |</li>
											<li ><a title="Order Status Form" onmouseover="slideMenu('2')"
												href="/AutoChoice/OrderStatusMainForm">&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp; |</li>
											<li class="active"><a title="Order Status Delivery Procedure" onmouseover="slideMenu('3')"
												href="/AutoChoice/OrderStatusDeliveryProc">&nbsp;Delivery Proc</a>&nbsp;&nbsp;&nbsp; </li>
										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="/AutoChoice/resources/img/small_line.jpg">
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
						<table class="littleMargin tableWidth97">
					   		<tr>
					   			<td width="35%">
					   				<span class="titleText">Delivery Procedures</span>
					   			</td>
					   			<td width="35%" class="rightPadding105">
							   	</td>
							   	<td width="27%">
					    			<a href ="/AutoChoice/OrderStatusExcel/DelProc" title="Excel/print" ><img width="20" title="Print" alt="Excel/print" src="<c:url value="/resources/img/excel.png" />" alt="Print">&nbsp; Excel (print)</a>
					   			</td>
					   		</tr>
					   	</table>
					  	<table class="tableWidth97">
					  		<tr>
					  			<td colspan="6">					 
									<div class="optionsMainDiv">
									<div class="headerDiv">
										<div class="circledDiv"></div>
							  			<span></span> <br/><br/>
						  			</div>
						  
						    		<table class="tableWidth100">
									    <tr>
										    <td colspan="2">
											    <div class="vehInfBorder">
												    <div class="vehInf100 lesstopmargin">
												    	<span>Dealer Prep:</span>
												    </div>										    
										    		<table class="leftSpacing tableWidth100" cellpadding="4">
										      			<tr span="1">
										   					<td>Dealerships receive dealer prep payment and delivery paperwork for the GSA vendor.</td>
								    					</tr>
					    								<tr span="1">
					  										<td>
					  											GSA vehicle contract price includes a dealer-prep fee.  <b><em>You are not required to pay any fees to the dealership.</em></b>  
					  											If you experience difficulty concerning the release of your vehicle from the dealership, please contact GSA Automotive at (703) 605-CARS (2277).
					  										</td>
					    								</tr>
					    								<tr span="1">
					  										<td>Vehicle delivered to your facility (CNS option) cannot be taken to a dealership to be
  prepped.</td>
					    								</tr>
					    							</table>
					    							<div class="vehInf100 lesstopmargin" >
												    	<span>Picking Up Your Vehicle:</span>
												    </div>
						    
						    						<table  class="leftSpacing tableWidth100" cellpadding="4">
						      							<tr span="1">
						   									<td>When picking up your vehicles, bring your license plates, Certificates of Origin (COV), or Motor Vehicle Delivery Order with you, to provide proof of
  ownership.</td>
						   								</tr>
						   								<tr span="1"><td>Review/inspect the vehicle completely to ensure ordered options are included and there is no damage to the vehicle.</td>
						    							</tr>
						    						</table>
						    						<div class="vehInf100 lesstopmargin" >
												    	<span>Vehicle Identification Number:</span>
												    </div>
						    
												    <table class="leftSpacing tableWidth100" cellpadding="4">
												    	<tr >
												   			<td>Compare the Vehicle Identification Number (VIN) on your vehicle to the COV or a copy of the Motor Vehicle Delivery Order to verify, it's your vehicle.</td>
												    	</tr>
												    </table>
						    					</div>
						    				</td>
						   				</tr>
						    			<tr>
										    <td colspan="2">
										    </td>
									    </tr>
									    <tr>
									    	<td valign="top" width="50%">
									    </td>
										    <td >
										    </td>
									    </tr>
						    		</table>
						    	</div>
						    	</td>
						    	</tr>
						    	</table>
						</div>
					</div>
				</div>
		  	<div class="width100">
		  		<table class="tableWidth100">
				<tr>
				<td width="35%">&nbsp;
				
				</td>	
				<td width="20%" >&nbsp;</td>
				<td width="45%">&nbsp;</td>	
				</tr>
		  		</table>
			</div>
			<div class="redColorRow" ></div>
			<div class="redColorRow" ></div>
			<div class="noteDiv">
				<img src="/AutoChoice/resources/img/pin.png" class="pinImg" />&nbsp; <b>Instructions to Consignee Receiving New Motor Vehicles Purchased by GSA:</b>
				<p>This information is currently printed on the reverse of the consignee copy of the motor vehicle delivery order (MVDO). Effective immediately, all agency personnel designated as an authorized approver or responsible for receipt of agency owned vehicles shall record the month, date and year the purchased vehicle is received on line in AutoChoice. The approved agency representative shall document the month, date and year a new vehicle(s) was received.</p>
			</div>
 </div>
<p class="text-warning">&nbsp;&nbsp;</p>
<!-- Add the extra clearfix for only the required viewport -->
</div> <!--/mainContent-->
    </div> <!-- /container -->
	<%@ include file="includeFooter.jsp"%>
</body>