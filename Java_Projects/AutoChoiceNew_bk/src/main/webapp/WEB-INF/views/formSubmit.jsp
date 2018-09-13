
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
					<%@ include file="includePagenav.jsp"%>

					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%"><span class="titleText">Submition</span></td>
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
											<span>8E-SEDAN, SUBCOMPACT, ELECTRIC VEHICLE</span>

										</div>
										<ul class="minibreadCrumb">
											<li class="seperator"><a href="notetoput.html">Note</a></li>
											<li class="seperator"><a href="colors.html">Color
													Selection</a></li>
											<li class="seperator"><a href="summary.html">Summary</a></li>
											<li><a href="form_submit.html">Submission Form</a></li>

										</ul>
										<div class="noteDiv">
											<img class="pinImg" src="resources/img/pin.png">&nbsp; Note: An
											Asterisk (<span class="mandatory"> * </span>) indicates a
											required column.
											<div class="redColorRow"></div>
											<div class="redColorRow"></div>
										</div>
										<table width="100%">
											<tbody>
												<tr>
													<td width="100%" colspan="2">
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Requisition Detail</span>
															</div>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td width="25%">Agency Order No:</td>
																		<td><input type="text" class="address"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Requisition Number:</td>
																		<td><input type="text" class="smallinput">&nbsp;
																			<input type="text" class="smallinput">&nbsp;
																			<input type="text" class="smallinput"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Signal Code:</td>
																		<td><select>
																				<option value="A">A</option>
																				<option value="B">B</option>
																		</select><font class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Supplementary Address:</td>
																		<td><input type="text" class="smallinput"><span
																			class="desc">(Required for Signal Code B and
																				K)</span></td>
																	</tr>
																	<tr>
																		<td>Fund Code:</td>
																		<td><input type="text" class="smallinput"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Unit Price $:</td>
																		<td>$ 15,474.21</td>
																	</tr>
																	<tr>
																		<td>Additional Funds per unit:</td>
																		<td><input type="text" value="0.00"
																			class="smallinput"><span class="desc">(Obligate
																				additional funds to this order)</span></td>
																	</tr>
																	<tr>
																		<td>Total East Unit Price $:</td>
																		<td><input type="text" value="15,474.21"
																			class="smallinput skyBlueBground"></td>
																	</tr>
																	<tr>
																		<td>Description:</td>
																		<td><span class="desc">8E-SEDAN,
																				SUBCOMPACT, ELECTRIC VEHICLE</span></td>
																	</tr>
																	<tr>
																		<td>Shipment Location:</td>
																		<td><select><option>Domestic</option></select><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td><span class="desc">For export orders,
																				please enter the overseas contact person and phone
																				number.</span></td>
																	</tr>
																	<tr>
																		<td>Contact Person:</td>
																		<td><input type="text" class="address"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Phone Number:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Priority Level:</td>
																		<td><select><option>Low</option></select><span
																			class="desc">This priority pertains to your
																				order once it has been stored in your Pending
																				Orders.</span></td>
																	</tr>
																	<tr>
																		<td>Treasury Account Symbol:</td>
																		<td><input type="text" class="smallinput">
																			&nbsp;
																			<button class="blueBtn">TAS</button></td>
																	</tr>
																	<tr>
																		<td>Internal Agency Financial Data:</td>
																		<td><input type="text" class="box500"></td>
																	</tr>
																	<tr>
																		<td>&nbsp;</td>
																		<td><span class="desc">Info will be passed
																				to GSA Finance but will not be passed to GSA
																				Automotive.</span></td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
												</tr>
												<tr>
													<td valign="top" colspan="2">
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Dealership</span>
															</div>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td align="center" colspan="2">&nbsp;</td>
																	</tr>
																	<tr>
																	</tr>
																	<tr>
																		<td align="center" colspan="2"><button>Find
																				Dealership</button></td>
																	</tr>
																	<tr>
																		<td width="30%">Dealership Name:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>Address:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>City:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>State:</td>
																		<td><input type="text" class="smallinput"></td>
																	</tr>
																	<tr>
																		<td>Zip Code:</td>
																		<td><input type="text" class="smallinput"></td>
																	</tr>
																	<tr>
																		<td>Telephone No.:</td>
																		<td><input type="text"></td>
																	</tr>

																</tbody>
															</table>
														</div>
													</td>

												</tr>




												<tr>
													<td>
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Requisitioning Address</span>
															</div>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td width="25%">Agency Name:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																		<td></td>
																		<td></td>
																	</tr>
																	<tr>
																		<td>Address:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>City:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>State:</td>
																		<td><select><option>AA</option></select><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Zip Code:</td>
																		<td><input type="text" class="smallinput">&nbsp;<input
																			type="text" class="smallinput"></td>
																	</tr>
																	<tr>
																		<td>Country:</td>
																		<td><input type="text" class="box180"></td>
																	</tr>
																	<tr>
																		<td>Email Address:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Fax Number:</td>
																		<td><span class="desc">Is it
																				International? </span><input type="checkbox"> <input
																			type="text" class="box110"><font
																			class="mandatoryField">*</font><br> <span
																			class="desc">(Include Country Code for
																				International)</span></td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
													<td width="50%" valign="top">
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Mailing Address</span>
															</div>
															<span class="desc">Certificates of Origin are made
																out to the Agency and Address provided in the Mailing
																Address. Parts and Service Manuals are also sent to the
																Mailing Address. Do not provide a person's name in the
																Mailing Address. </span><br>
															<br>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td width="25%">Agency Name:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Address:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>City:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>State:</td>
																		<td><select><option>AA</option></select><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Zip Code:</td>
																		<td><input type="text" class="smallinput">&nbsp;<input
																			type="text" class="smallinput"></td>
																	</tr>
																	<tr>
																		<td>Country:</td>
																		<td><input type="text" class="box180"></td>
																	</tr>

																</tbody>
															</table>
														</div>
													</td>
												</tr>
												<tr>

													<td>
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Delivery Address</span>
															</div>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td width="25%">Agency Name:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Address:</td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td></td>
																		<td><input type="text" class="address"></td>
																	</tr>
																	<tr>
																		<td>City:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>State:</td>
																		<td><select><option>AA</option></select><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Zip Code:</td>
																		<td><input type="text" class="smallinput">&nbsp;<input
																			type="text" class="smallinput"></td>
																	</tr>
																	<tr>
																		<td>Country:</td>
																		<td><input type="text" class="box180"></td>
																	</tr>
																	<tr>
																		<td>Email Address:</td>
																		<td><input type="text" class="box180"><font
																			class="mandatoryField">*</font></td>
																	</tr>
																	<tr>
																		<td>Fax Number:</td>
																		<td><span class="desc">Is it
																				International? </span><input type="checkbox"> <input
																			type="text" class="box110"><font
																			class="mandatoryField">*</font><br> <span
																			class="desc">(Include Country Code for
																				International)</span></td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
													<td valign="top">
														<div class="vehInfBorder">
															<div class="vehInf vehInfInner100">
																<span>Billing Address</span>
															</div>
															<table width="100%" cellpadding="4" class="leftSpacing">
																<tbody>
																	<tr>
																		<td valign="top">Address:</td>
																		<td><span class="desc">GSA, Accounts
																				Payable(BCEB)<br> 1500 Bannister Rd.<br>
																				PO Box 419018
																		</span></td>
																	</tr>
																	<tr>
																		<td>City:</td>
																		<td><span class="desc">Kansas City</span></td>
																	</tr>
																	<tr>
																		<td>State:</td>
																		<td><span class="desc">MO</span></td>
																	</tr>
																	<tr>
																		<td>Zip Code:</td>
																		<td><span class="desc">64141</span></td>
																	</tr>
																	<tr>
																		<td>Country:</td>
																		<td><span class="desc">USA</span></td>
																	</tr>
																</tbody>
															</table>
														</div>
													</td>
												</tr>

												<tr>
													<td align="center" colspan="2">&nbsp;</td>
												</tr>
												<tr>
													<td align="center" colspan="2"><input type="button"
														value="Add to Pending Orders" class="greenDiv"></td>
												</tr>
											</tbody>
										</table>
										<div class="width100 topMargin13">
											<table width="97%" class="littleMargin">
												<tbody>
													<tr>
														<td width="35%">&nbsp;</td>
														<td width="35%" class="rightPadding105">
															<div class="simplePagination">
																<ul>
																	<li><a class="active" href="#">Next &nbsp;
																			&gt;&gt;</a></li>
																	<li><a href="#">&lt;&lt; &nbsp; Previous</a></li>
																</ul>
															</div>
														</td>
														<td width="27%">&nbsp;</td>
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