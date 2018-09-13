
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<style>
.popupList {
	float: left;
	height: auto;
}

.popupList li {
	float: left;
	list-style-type: disc;
	margin-left: 17px;
}

.note {
	color: #9B0303;
	font-weight: bold;
}
</style>
<script>
	function slideMenu(val) {
		if (val == 1) {
			$(".bgImgDiv").css("margin-left", "-18px");
		} else if (val == 2) {
			$(".bgImgDiv").css("margin-left", "128px");
		} else if (val == 3) {
			$(".bgImgDiv").css("margin-left", "257px");
		} else if (val == 4) {
			$(".bgImgDiv").css("margin-left", "380px");
		} else if (val == 5) {
			$(".bgImgDiv").css("margin-left", "500px");
		} else if (val == 6) {
			$(".bgImgDiv").css("margin-left", "610px");
		} else if (val == 7) {
			$(".bgImgDiv").css("margin-left", "583px");
		}

	}
	function showSubContent(divId) {

		if (divId == '1') {
			$(".div1").show();
			$(".div2").hide();
			$(".div3").hide();
			$(".div4").hide();
		} else if (divId == '2') {
			$(".div2").show();
			$(".div1").hide();
			$(".div3").hide();
			$(".div4").hide();
		} else if (divId == '3') {
			$(".div3").show();
			$(".div1").hide();
			$(".div2").hide();
			$(".div4").hide();
		}
		if (divId == '4') {
			$(".div4").show();
			$(".div1").hide();
			$(".div2").hide();
			$(".div3").hide();
		}
	}
</script>
<script>
	$(document).ready(function() {
		$('.child').hide();

		$('.parent').children().click(function() {
			//event.preventDefault();
			$(this).children('.child').slideToggle();
		});

		var flag = $('#registerForm').attr('data-modalFlag');
		if (flag == 'true') {
			$('#basicModal').modal();

		}
	});
</script>

<script>
	function FormSubmit() {
		document.forms[0].pageAction.value = "Submit";
		//goSub("Login");
		return true;
	}

	function forgotPw() {
		document.forms[0].pageAction.value = "ForgotPw";
		//go("Login");
		document.myForm.submit();
		return true;
	}
</script>

<script type="text/javascript">
	var menu = new menu.dd("menu");
	menu.init("menu", "menuhover");
</script>

<style>
.popupList {
	float: left;
	height: auto;
}

.popupList li {
	float: left;
	list-style-type: disc;
	margin-left: 17px;
}
</style>

</head>
<body class="modal-open">
	<br>
	<div id="bodyContent" style="heignt: 600px;">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeLoginMenu.jsp"%>
		<%@ include file="includeLoginBreadcrumbs.jsp"%>
		<div class="row">
			<!-- Added by OS For Printing Screen -->


			<div class="col-md-12">

				<div class="indexLeftSpan">
					<div class="leftForm">

						<table border="0" cellspacing="0" cellpadding="0"
							class="tableWidth100">
							<tbody>
								<tr>
									<td>
										<h4>Login</h4>
									</td>
									<td><h5>(registered already)</h5></td>
								</tr>
							</tbody>
						</table>



						<form:form commandName="loginBean" modelAttribute="loginBean"
							method="post" onSubmit="return FormSubmit()" name="myForm">

							<div Class="label12B">
								<span class="note">${loginBean.message}</span>
							</div>

							<div Class="label12B">
								<c:choose>
									<c:when test="${loginBean.errFlg != null }">
										<span class="note">${loginBean.errMsg.userExDetail}</span>
										<br>
										<br>
									</c:when>
								</c:choose>
							</div>

							<div Class="label12B">
								<span class="note">${loginBean.result}</span>
							</div>
							
								User Name <br>
														<input type="text" name="userAccountDTO.userID"
								class="inputField" style="" autofocus  value="">
							<br>
							<br> Password <br>
							<input type="password" name="userAccountDTO.password"
								class="inputField" style="" value ="">
							<br>
							<br>
							<table width="70%" border="0" cellspacing="0" cellpadding="0">
								<tbody>
									<tr>
										<th scope="col"><input type="submit" value="Enter"
											class="navyDiv"></th>
										<th scope="col">&nbsp;</th>
										<th scope="col"><input type="reset" value="Reset"
											class="navyDiv"></th>
									</tr>
								</tbody>
							</table>

							<br>
							<br>
							<a href="/AutoChoice/Register"
								title="Clicking on this link will bring pop-up window with register form"
								rel="Register">Register in AutoChoice</a>
							<!-- links marked rel="Register" get launched; 
								content rel="Register" is hidden until launched in the pop-up in the middle of the screen -->
							<a data-target="#changePwdModal" data-toggle="modal" href="#"
								onClick="forgotPw();">Forgot Password? Enter a user ID and
								click here..</a>
							<input type="hidden" name="command" value="Login">
							<input type="hidden" name="pageAction" value="">
						</form:form>
						<form:form id="registerForm" name="registerForm" method="post"
							modelAttribute="loginBean" commandName="loginBean"
							action="/AutoChoice/Register"
							data-modalFlag="${loginBean.modalDialogFlag}">
							<!-- link marked rel="Register" get launched -->
							<div class="modal fade" id="basicModal" tabindex="-1"
								role="dialog" aria-labelledby="basicModal" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="submit" class="close" name="action" value="x">&times;</button>
											<h4 class="modal-title" id="myModalLabel">Register</h4>
										</div>
										<div Class="label12B">
											<c:choose>
												<c:when test="${loginBean.modalDialogFlag != false }">
													<span class="note">${loginBean.modalDialogErrMsg.userExDetail}</span>
													<br>
													<br>
												</c:when>
											</c:choose>
										</div>
										<div class="modal-body">
											<table class="tableWidth100" align="center" cellpadding="5">
												<tbody>
													<tr>
														<td colspan="2">&nbsp;</td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Agency Code:</td>
														<td><form:input path="userCombinedDTO.agencyCode"
																class="smallinput" size="4" maxlength="4" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Bureau Code:</td>
														<td><form:input path="userCombinedDTO.bureauCode"
																class="smallinput" size="4" maxlength="4" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td width="40%" align="right" class="TextColor">User
															Name:</td>
														<td width="60%"><form:input
																path="userCombinedDTO.userID" class="box180" size="12"
																maxlength="12" /><font class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Change Password:</td>
														<td><form:password path="userCombinedDTO.passwd"
																class="box180" size="20" maxlength="20" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Confirm Password:</td>
														<td><form:password
																path="userCombinedDTO.confirmPasswd" class="box180"
																size="20" maxlength="20" /><font class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">First Name:</td>
														<td><form:input path="userCombinedDTO.firstName"
																class="box180" maxlength="20" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Last name:</td>
														<td><form:input path="userCombinedDTO.lastName"
																class="box180" maxlength="20" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Middle Initial:</td>
														<td><form:input path="userCombinedDTO.middleName"
																class="smallinput" maxlength="3" size="3" /></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Email:</td>
														<td><form:input path="userCombinedDTO.email"
																class="box180" size="30" maxlength="50" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Job Title:</td>
														<td><form:input path="userCombinedDTO.jobTitle"
																class="box180" size="30" maxlength="40" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Telephone No:</td>
														<td><form:input path="userCombinedDTO.telephone"
																class="box180" size="10" maxlength="10" /><font
															class="mandatoryField">*</font>&nbsp;<span
															class="TextColor">Ext:<form:input
																	path="userCombinedDTO.telephoneExt" class="smallinput"
																	size="5" maxlength="5" /></span></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Other Tel.No.:</td>
														<td><form:input path="userCombinedDTO.otherTelephone"
																class="box180" size="15" maxlength="15" /></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Office Address:</td>
														<td><form:input path="userCombinedDTO.address1"
																class="box180" size="20" maxlength="35" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right">&nbsp;</td>
														<td><form:input path="userCombinedDTO.address2"
																class="box180" size="20" maxlength="35" /></td>
													</tr>
													<tr>
														<td align="right">&nbsp;</td>
														<td><form:input path="userCombinedDTO.address3"
																class="box180" size="20" maxlength="35" /></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">City:</td>
														<td><form:input path="userCombinedDTO.city"
																class="box180" size="20" maxlength="20" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">State:</td>
														<td><form:select path="userCombinedDTO.state"
																id="stateId">
																<c:forEach var="item"
																	items="${loginBean.userCombinedDTO.stateList}"
																	varStatus="status">
																	<c:choose>
																		<c:when
																			test="${loginBean.userCombinedDTO.state == item.state}">
																			<form:option value="${item.state}"
																				selected="selected">${item.stateName}</form:option>
																		</c:when>
																		<c:otherwise>
																			<form:option value="${item.state}">${item.stateName}</form:option>
																		</c:otherwise>
																	</c:choose>
																</c:forEach>
															</form:select><font class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">Country:</td>
														<td><form:input path="userCombinedDTO.country"
																value="USA" size="10" maxlength="10" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td align="right" class="TextColor">ZipCode:</td>
														<td><form:input path="userCombinedDTO.zipcode"
																class="box180" size="5" maxlength="5" /><font
															class="mandatoryField">*</font></td>
													</tr>
													<tr>
														<td colspan="2">&nbsp;</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="modal-footer">
											<input type="submit" class="navyDiv" name="action"
												value="Close" /> <input type="submit" name="action"
												class="navyDiv" value="Register" />
										</div>
									</div>
								</div>
							</div>
						</form:form>
					</div>
				</div>

				<div class="indexRightSpan">
					<div id="quick-selection">
						<h1>Steering You + Right Direction</h1>
					</div>



					<div class="opencontent">
						<div class="containerContent">
							<table class="tableWidth100">
								<tbody>
									<tr>
										<td>
											<div class="rightColMenuSplash">
												<ul>
													<li class="active"><a onmouseover="slideMenu('1')"
														href="javascript:showSubContent('1')">Title 1
															Information about</a> |</li>
													<li><a onmouseover="slideMenu('2')"
														href="javascript:showSubContent('2')">Title 2
															Information</a> |</li>
													<li><a onmouseover="slideMenu('3')"
														href="javascript:showSubContent('3')">Title 3
															Information</a> |</li>
													<li><a onmouseover="slideMenu('4')"
														href="javascript:showSubContent('4')">Title 4
															Information</a> |</li>

												</ul>
												<div class="bgImgDiv" style="margin-left: -18px;">
													<img src="./resources/img/small_line.jpg">
												</div>
											</div>
											<div>
												<div class="div1 splashDiv" style="display: none;">
													Div 1 Salvia portland leggings banh mi fanny pack mixtape,
													authentic bushwick wes anderson intelligentsia artisan
													typewriter high life they sold out mixtape high life. Marfa
													ethnic wayfarers brooklyn keytar mixtape. Blue bottle
													shoreditch gluten-free, mixtape hoodie whatever pinterest
													viral twee fashion axe high life irony biodiesel tofu.

													Retro church-key thundercats keytar, skateboard irony
													selvage ethnic freegan banjo pour-over fixie. Raw denim
													fashion ax eoke locavore disrupt, tonx retro authentic
													letterpress raw denim stumptown mixtape ugh kale chips
													flexitarian 90's deep v. Squid fingerstache bespoke wolf
													DIY. Banjo pour-over shoreditch cardigan try-hard. Salvia
													portland leggings banh mi fanny pack mixtape, authentic
													bushwick pour-over fixie. Raw denim fashion ax eoke
													locavore disrupt, tonx retro authentic letterpress raw
													denim</div>
												<div class="div2 splashDiv hide" style="display: none;">
													Div 2 Salvia portland leggings banh mi fanny pack mixtape,
													authentic bushwick wes anderson intelligentsia artisan
													typewriter high life they sold out mixtape high life. Marfa
													ethnic wayfarers brooklyn keytar mixtape. Blue bottle
													shoreditch gluten-free, mixtape hoodie whatever pinterest
													viral twee fashion axe high life irony biodiesel tofu.

													Retro church-key thundercats keytar, skateboard irony
													selvage ethnic freegan banjo pour-over fixie. Raw denim
													fashion ax eoke locavore disrupt, tonx retro authentic
													letterpress raw denim stumptown mixtape ugh kale chips
													flexitarian 90's deep v. Squid fingerstache bespoke wolf
													DIY. Banjo pour-over shoreditch cardigan try-hard. Salvia
													portland leggings banh mi fanny pack mixtape, authentic
													bushwick wes anderson intelligentsia artisan typewriter
													high life they sold out mixtape high life. Marfa ethnic
													wayfarers brooklyn keytar mixtape. Blue bottle shoreditch
													gluten-free, mixtape hoodie whatever pinterest viral twee
													fashion axe high life irony biodiesel tofu. Retro
													church-key thundercats keytar, skateboard irony selvage
													ethnic freegan banjo pour-over fixie. Raw denim fashion ax
													eoke locavore disrupt, tonx retro authentic letterpress raw
													denim</div>
												<div class="div3 splashDiv hide" style="display: none;">
													Div 3 Salvia portland leggings banh mi fanny pack mixtape,
													authentic bushwick wes anderson intelligentsia artisan
													typewriter high life they sold out mixtape high life. Marfa
													ethnic wayfarers brooklyn keytar mixtape. Blue bottle
													shoreditch gluten-free, mixtape hoodie whatever pinterest
													viral twee fashion axe high life irony biodiesel tofu.

													Retro church-key thundercats keytar, skateboard irony
													selvage ethnic freegan banjo pour-over fixie. Raw denim
													fashion ax eoke locavore disrupt, tonx retro authentic
													letterpress raw denim stumptown mixtape ugh kale chips
													flexitarian 90's deep v. Squid fingerstache bespoke wolf
													DIY. Banjo pour-over shoreditch cardigan try-hard.</div>
												<div class="div4 splashDiv hide" style="display: block;">
													Div 4 Salvia portland leggings banh mi fanny pack mixtape,
													authentic bushwick wes anderson intelligentsia artisan
													typewriter high life they sold out mixtape high life. Marfa
													ethnic wayfarers brooklyn keytar mixtape. Blue bottle
													shoreditch gluten-free, mixtape hoodie whatever pinterest
													viral twee fashion axe high life irony biodiesel tofu.
													selvage ethnic freegan banjo pour-over fixie. Raw denim
													fashion ax eoke locavore disrupt, tonx retro authentic
													letterpress raw denim stumptown mixtape ugh kale chips
													flexitarian 90's deep v. Squid fingerstache bespoke wolf
													DIY. Banjo pour-over shoreditch cardigan try-hard.</div>
											</div>
										</td>
									</tr>
								</tbody>
							</table>

						</div>

					</div>
				</div>

				<p class="text-warning">&nbsp;&nbsp;</p>
				<!-- Add the extra clearfix for only the required viewport -->
			</div>
			<!--/mainContent-->
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>

</body>