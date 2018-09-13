
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<style>
.popupList {
	float: left;
	height: auto;
	background: none;
}

.popupList li {
	float: left;
	list-style-type: disc;
	margin-left: 17px;
}

.changePwd {
	padding: 10px;
	background-color: #F1F2F4;
	margin-top: 5px;
}

.changePwd table {
	width: 70%;
	margin: 0 auto;
	margin-left: 25%;
}

.changePwd table tr td {
	text-align: left;
}

.note {
	color: #9B0303;
	font-weight: bold;
}
</style>


<script type="text/javascript">
	var menu = new menu.dd("menu");
	menu.init("menu", "menuhover");
</script>
<script>
function formSubmit(pgaction)
{	
	var tf = true;
	form = document.forms[0];
	
	command = form.command.value = "ChangePw";	
	
	if  (pgaction == "Update")
	{
		if ( !(checkform(pgaction) ) )
		{	tf=false;
			return false;
		}
	}
	form.pageAction.value = pgaction;
	document.myForm.submit();
}

function checkform(pgaction)
{
	pwOld 		= document.getElementById('userAccountDTO.oldPassword');
	pwNew1 		= document.getElementById('userAccountDTO.newPassword1');
	pwNew2 		= document.getElementById('userAccountDTO.newPassword2');
	pwQuestion	= document.getElementById('userAccountDTO.passwordQuestion');
	pwHint		= document.getElementById('userAccountDTO.passwordAnswer');
	email		= document.getElementById('userAccountDTO.email');
	
	if (!isEmpty("Old Password", pwOld)) return false;
	
	if (!isEmpty("New Password", pwNew1)) return false;
	
	if (pwNew1.value == "12345678" || pwNew2.value == "12345678") 
	{
		alert("New Password cannot be 12345678.");
		pwNew1.focus();
		pwNew1.select();
		return false;
	}
	
	if(! PasswordStrength(pwNew1.value , "New Password: ")) {pwNew1.focus(); return false;}
	
	if (!isEmpty("Confirm New Password", pwNew2)) return false;
	
	if(! PasswordStrength(pwNew2.value , "Confirm New Password: ")) {pwNew2.focus(); return false;}
	
	if (pwNew1.value != pwNew2.value) 
	{
		alert("New Password and Confirm New Password must match.");
		pwNew1.focus();
		pwNew1.select();
		return false;
	}
	
	if (!isEmpty("Password Hint Question", pwQuestion)) return false; 
					
	if (!isEmpty("Password Hint Answer", pwHint)) return false;
	
	if (!isValidEmail(email)) return false;
	
	return true;
}
function PasswordStrength(pass , FldDesc) 
{       
		len = pass.length;
		
		for(i=0;i<len;i++){
			if(pass.substring(i,i+1) == " ")
				{
					alert(FldDesc + "Password should not contain spaces.");
					return false;
				}
		}
		
        if(len < 8 || len > 16){ 
           alert(FldDesc + " Password has to be minimum of 8 Characters and maximum of 16 characters.");
			return false;
        } 

	  if(pass.toLowerCase() == document.getElementById('userAccountDTO.userID').value.toLowerCase()){ 
           alert(FldDesc + " Password cannot be same as your user ID.");
		   return false;
        } 

		if(document.getElementById('userAccountDTO.oldPassword') != null ){			
		   if(pass.toLowerCase() == document.getElementById('userAccountDTO.oldPassword').value.toLowerCase()){ 
           alert(FldDesc + " Password cannot be same as your old password.");
           document.getElementById('userAccountDTO.newPassword1').value='';
           document.getElementById('userAccountDTO.newPassword2').value='';
		   
		   return false;
        } 
		}
        
        if(!pass.match(/[a-z_]/i) ){ 
           alert(FldDesc + " Password must contain atleast 1 Alphabetic Character.") ;
			return false;
        } 
        
	  if(!pass.match(/[0-9]/)){ 
           alert(FldDesc + " Password must contain atleast 1 Numerical Digit."); 
			return false;
        } 

        if(!pass.match(/\W/)){ 
                 alert(FldDesc + " Password must contain atleast 1 Special Character."); 
				return false;
        } 

        return true; 
}

function isEmpty(name, field)
{
	if ((field.value.length==0) || (field.value==null) || (stripSpaces(field.value)==""))
	{
		alert("Please enter " + name);
		field.focus();
		return false;
	}
	return true;
}

function stripSpaces(inString)
{
	inString = inString.replace(/^\s*/, "").replace(/\s*$/, "");
	return inString;
}

function isValidEmail(emailId)
{
	var emailalert = "Invalid email address";
	if (emailId.value == " " || emailId.value == "")
	{
		alert("Email address is required");
		emailId.focus();
		return false;
	}
//	var cntr = countElement(emailId, "@");
//	if (cntr > 1)
//	{
//		alert(emailalert+":"+emailId+"\nInvalid Number of '@' in email address");
//		return false;
//	}
//	if (cntr != 1)
//	{
//		alert(emailalert+":"+emailId);
//		return false;
//	}
	var filter=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	if (filter.test(emailId.value))
	{
		return true;
	}
	else
	{
		alert(emailalert+": "+emailId.value)
		emailId.focus();
		return false;
	}

	return true;
}

</script>


</head>
<body class="modal-open">
	<c:set value="" var="tempPwOld" />
	<c:set value="" var="tempPwNew1" />
	<c:set value="" var="tempPwNew2" />
	<c:set value="" var="tempPwQtn" />
	<c:set value="" var="tempPwHint" />

	<br>
	<div id="bodyContent" style="heignt: 600px;">
		<%@ include file="includeBanner.jsp"%>
		<c:choose>
			<c:when
				test="${(commonBean.loggedinUser==null)||(fn:trim(commonBean.loggedinUser)=='')}">
				<%@ include file="includeLoginMenu.jsp"%>
			</c:when>
			<c:otherwise>
				<%@ include file="includeMenu.jsp"%>
			</c:otherwise>
		</c:choose>
		<%@ include file="includeLoginBreadcrumbs.jsp"%>
		<div class="row">
			<!-- Added by OS For Printing Screen -->

			<form:form commandName="loginBean" modelAttribute="loginBean"
				method="post" name="myForm" id="myForm">

				<div class="col-md-12">

					<div class="changePwd borderaround">
						<table>
							<tbody>
								<tr>
									<td align="left" colspan="2"><span class="titleText">Update
											Password, Hint Question and Answer. (Password Reset, Password
											Expired, or First Time User Login) :</span></td>
								</tr>
								<c:choose>
									<c:when test="${loginBean.message != null }">
										<tr>
											<td colspan="2">&nbsp;</td>

										</tr>
										<tr>
											<td colspan="2"><div class="messageLine3" align="left">
													<span class="note">${loginBean.message}</span>
												</div></td>
										</tr>
									</c:when>
								</c:choose>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<c:choose>
									<c:when test="${loginBean.errFlg != null }">
										<tr>
											<td colspan="2"><span class="note"><c:set
														value="${loginBean.userAccountDTO.oldPassword}"
														var="tempPwOld" /> <c:set
														value="${loginBean.userAccountDTO.newPassword1}"
														var="tempPwNew1" /> <c:set
														value="${loginBean.userAccountDTO.newPassword2}"
														var="tempPwNew2" /> <c:set
														value="${loginBean.userAccountDTO.passwordQuestion}"
														var="tempPwQtn" /> <c:set
														value="${loginBean.userAccountDTO.passwordAnswer}"
														var="tempPwHint" /> ${loginBean.errMsg.userExDetail}</span></td>
										</tr>
										<tr>
											<td colspan="2">&nbsp;</td>
										</tr>
									</c:when>

								</c:choose>
								<tr>
									<td width="100%" colspan="2">Due to increased security
										measures, this website requires creation/update of passwords
										before granting web access. <br>Other reasons you have
										been routed to this page are listed below:
									</td>
								</tr>

								<tr>
									<td colspan="2">
										<ul class="popupList">
											<li>Your password has expired due to inactivity.</li>
											<li>It is a temporary password and must be changed.</li>
											<li>You wish to change your existing password.</li>
										</ul>
									</td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<tr>
									<td colspan="2">You are required to change your password
										regularly. Please enter a web password that meets all of the
										following criteria:</td>
								</tr>

								<tr>
									<td colspan="2">
										<ul class="popupList">
											<li>Password MUST be between 8 - 16 characters</li>
											<li>Does not match your Login ID and does not contain
												any spaces.</li>
										</ul>
									</td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<tr>
									<td colspan="2">The following characteristics must be met:
									</td>
								</tr>

								<tr>
									<td colspan="2">
										<ul class="popupList">
											<li>Must contain at least one upper case letter (A-Z)</li>
											<li>Must contain at least one lower case letter (a-z)</li>
											<li>Must contain at least one numeral (0-9)</li>
											<li>Must contain at least one of the following
												non-alphanumeric characters:#@ $%&amp;!*+=?_:[ ] { }</li>
										</ul>
									</td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<tr>
									<td align="right">Old Password:</td>
									<td><input type="password"
										name="userAccountDTO.oldPassword"
										id="userAccountDTO.oldPassword" size="20" maxlength="16"
										value="${tempPwOld}" class="text-box single-line"
										autocomplete="off"></td>
								</tr>
								<tr>
									<td align="right">Enter New Password:</td>
									<td><input type="password"
										name="userAccountDTO.newPassword1"
										id="userAccountDTO.newPassword1" size="20" maxlength="16"
										value="${tempPwNew1}" class="text-box single-line"
										autocomplete="off"></td>
								</tr>
								<tr>
									<td align="right">Confirm New Password:</td>
									<td><input type="password"
										name="userAccountDTO.newPassword2"
										id="userAccountDTO.newPassword2" size="20" maxlength="16"
										value="${tempPwNew2}" class="text-box single-line"
										autocomplete="off"></td>
								</tr>
								<tr>
									<td align="right">Password Hint Question:</td>
									<td><input type="text"
										name="userAccountDTO.passwordQuestion"
										id="userAccountDTO.passwordQuestion" size="60" maxlength="200"
										value="${loginBean.userAccountDTO.passwordQuestion}"
										class="text-box single-line"><font
										class="mandatoryField">*</font></td>
								</tr>
								<tr>
									<td align="right">Password Hint Answer:</td>
									<td><input type="text"
										name="userAccountDTO.passwordAnswer"
										id="userAccountDTO.passwordAnswer" size="30" maxlength="30"
										value="${tempPwHint}" class="text-box single-line">
										&nbsp;<font class="mandatoryField">*</font>&nbsp;<font
										class="note">(case sensitive)</font></td>
								</tr>
								<tr>
									<td align="right">Email:</td>
									<td><input type="text" name="userAccountDTO.email"
										id="userAccountDTO.email" size="50" maxlength="50"
										value="${loginBean.userAccountDTO.email}"><font
										class="mandatoryField">*</font></td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								<tr>
									<td align="center" colspan="2">
										<button data-dismiss="modal" class="navyDiv" type="button"
											onClick=<c:choose>
															<c:when test="${loginBean.fromPage != null}">
																"window.location.href = '/AutoChoice/Home';"
															</c:when>
															<c:otherwise>
																"window.location.href = '/AutoChoice/StdItem';"
															</c:otherwise>
														</c:choose>> Cancel</button>
										<button class="navyDiv" type="button"
											onClick="formSubmit('Update');">Save changes</button>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<!-- Add the extra clearfix for only the required viewport -->
				</div>
				<input type="hidden" name="command" value="ChangePw">
				<input type="hidden" name="pageAction"
					value="${loginBean.pageAction}">
				<input type="hidden" name="fromPage" value="${loginBean.fromPage}">
				<input type="hidden" name="userAccountDTO.userID"
					id="userAccountDTO.userID"
					value="${loginBean.userAccountDTO.userID}">
			</form:form>
			<!--/mainContent-->
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>

</body>