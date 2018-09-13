
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
				<%@ include file="includeLeftmenu.jsp"%>
				<div class="col-md-9">
					<table width="97%">
						<tbody>
							<tr>
								<td></td>
							</tr>
						</tbody>
					</table>
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="45%"><span class="titleText">Motor
										Vehicle Delivery Order Report</span></td>
								<td width="15%" class="rightPadding105"></td>
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

											<span>8E-SEDAN, SUBCOMPACT, ELECTRIC VEHICLE</span> <br>
											<br>

										</div>

										<table width="100%">
											<tbody>
												<tr>
													<td width="100%" colspan="2">
														<div class="vehInfBorder">
															<div class="noteDiv">
																<img class="pinImg" src="resources/img/pin.png">&nbsp; <b>Please
																	enter the requested information below.</b>
																<p>Enter a range of search values when requesting
																	multiple reports. Enter the same value in the From and
																	To columns if you know the specific criteria that you
																	are searching with.</p>
															</div>
															<div class="redColorRow"></div>
															<div class="redColorRow"></div>
															<table width="100%" cellpadding="4">

																<tbody>
																	<tr>
																		<td width="30%">&nbsp;</td>
																		<td width="70%">&nbsp;</td>

																	</tr>
																	<tr>
																		<td align="right"><strong>Bureau Code:</strong></td>
																		<td><input type="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
																			type="text"></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td width="20%" align="left"><input type="radio"
																			value="Case Number" name="radio1" id="radio1">
																			<label for="radio1"><strong>Case
																					Number</strong></label></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Agency Order Number" name="radio1" id="radio2">
																			<label for="radio2"><strong>Agency
																					Order Number</strong></label></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Requisition Number" name="radio1" id="radio3">
																			<label for="radio3"><strong>Requisition
																					Number</strong></label></td>
																	</tr>

																	<tr>
																		<td>&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Requisition Number" name="radio1" id="radio4">
																			<label for="radio4"><strong>Requisition
																					Number </strong></label>(Requires Dates) <br> Please use the
																			following format: XXXXXX-XXXX-XXXX</td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td><strong>From:&nbsp;&nbsp;</strong><input
																			type="text"><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To:&nbsp;&nbsp;<input
																				type="text"></strong></td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td align="right"></td>
																		<td></td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>

																	<tr>
																		<td>&nbsp;</td>
																		<td><strong>-OR-&nbsp;&nbsp;</strong></td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td align="left"><input type="radio"
																			value="Order Date Range" name="radio1" id="radio5">
																			<label for="radio5"><strong>Order
																					Date Range</strong></label></td>
																	</tr>

																	<tr>
																		<td>&nbsp;</td>
																		<td><strong>From:&nbsp;&nbsp;</strong> <input
																			type="text" data-date-format="mm/dd/yy" id="dp1"
																			class="qtyinput" name="text"> <strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To:&nbsp;&nbsp;<input
																				type="text" id="dp2" data-date-format="mm/dd/yy"
																				class="qtyinput"></strong></td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>
																	<tr>
																		<td align="right"></td>
																		<td></td>
																		<td>&nbsp;</td>
																		<td>&nbsp;</td>
																	</tr>

																	<tr>

																	</tr>
																	<tr span="3">
																		<td align="center"></td>
																		<td><input type="button" value="Submit"
																			class="greenDiv" name="button"></td>
																		<td>&nbsp;</td>
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