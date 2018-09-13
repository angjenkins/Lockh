
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
											<li><a onmouseover="slideMenu('1')"
												href="order_status_receipt.html">&nbsp;Vehicle Receipt</a>&nbsp;&nbsp;&nbsp;
												|</li>
											<li class="active"><a onmouseover="slideMenu('2')"
												href="#">&nbsp;&nbsp;&nbsp;&nbsp;Order Status</a>&nbsp;&nbsp;&nbsp;
												|</li>

										</ul>
										<div class="bgImgDiv optionsIndicatorPosition">
											<img src="resources/img/small_line.jpg">
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%"><span class="titleText">Order Status</span>
								</td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
											<li><a class="active" href="#">Next &nbsp; &gt;&gt;</a></li>
											<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
								</td>
								<td width="27%">
									<div class="extraOptions" onclick="javascript:window.print();">
										<img width="20" title="Print" src="resources/img/printer.png"
											alt="Print">&nbsp; print
									</div> <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
								</td>
							</tr>
						</tbody>
					</table>
					<table width="97%">
						<tbody>
							<tr>
								<td colspan="6">

									<div class="optionsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span>8E-SEDAN, SUBCOMPACT, ELECTRIC VEHICLE</span> <br>
											<br>

										</div>

										<table width="100%">
											<tbody>
												<tr>
													<td width="100%" colspan="2">
														<div class="vehInfBorder">
															<div class="vehInf lesstopmargin">
																<span>Check Order Status.</span>
															</div>

															<table width="100%" cellpadding="4" class="leftSpacing">

																<tbody>
																	<tr>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td class="vehQtyTable tdgreenBg">Search Key</td>
																	</tr>
																	<tr>
																		<td width="35%">&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Case Number" name="radio1" id="radio1">
																			<label for="radio1">Case Number</label></td>
																	</tr>
																	<tr>
																		<td width="35%">&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Agency Order Number" name="radio1" id="radio2">
																			<label for="radio2">Requisition Number</label></td>
																	</tr>
																	<tr>
																		<td width="35%">&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Requisition Number" name="radio1" id="radio3">
																			<label for="radio3">Agency Order Number</label></td>
																	</tr>

																	<tr>
																		<td width="35%">&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Requisition Number" name="radio1" id="radio4">
																			<label for="radio4">VIN Number (Enter
																				full/partial VIN)</label></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td><input type="text"></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td></td>
																	</tr>
																	<tr>

																	</tr>
																	<tr span="3">
																		<td align="center"></td>
																		<td><input type="button" value="Check Status"
																			class="greenDiv" name="button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
																			type="button" value="COV" class="greenDiv"
																			name="button"></td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
												</tr>
												<tr>
													<td colspan="2"></td>
												</tr>
												<tr>
													<td width="50%" valign="top"></td>
													<td></td>
												</tr>
											</tbody>
										</table>
										<div class="width100">
											<table width="100%">
												<tbody>
													<tr>
														<td width="35%">&nbsp;</td>
														<td width="20%">&nbsp;</td>
														<td width="45%">&nbsp;</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="redColorRow"></div>
										<div class="redColorRow"></div>
										<div class="noteDiv">
											<img class="pinImg" src="resources/img/pin.png">&nbsp; <b>Instructions
												to Consignee Receiving New Motor Vechicles Purchased by GSA:</b>
											<p>This information is currently printed on the reverse
												of the consignee copy of the motor vehicle delivery order
												(MVDO). Effective immediately, all agency personnel
												designated as an authorized approver or responsible for
												receipt of agency owned vehicles shall record the month,
												date and year the purchased vehicle is received on line in
												AutoChoice. The approved agency representative shall
												document the month, date and year a new vehicle(s) was
												received.</p>

										</div>

									</div>

								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>