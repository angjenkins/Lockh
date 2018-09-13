<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/datepicker.js" />"></script>

<script>
	$(document)
			.ready(
					function() {

						$('#dp1').datepicker();
						$('#dp2').datepicker();
					});
</script>
<SCRIPT type="text/javascript">
      function isNumberKey(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;

         return true;
      }
</SCRIPT>
<script type="text/javascript">
function valEmail(emailId)
{
	var emailalert = "Invalid email address";
	var filter=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	if (filter.test(emailId.value))
	{
		return true;
	}
	else
	{
		alert(emailalert+": "+emailId.value);
		emailId.focus();
		return false;
	}

	return true;
	
}
</script>

<script type="text/javascript">
 function val() {   
	 
 	 var missingFields = false;
	 var strFields = "";
	 if(myProfileForm.firstName.value == '') {
		 missingFields = true;
		 strFields += " Please enter FirstName\n";
	 }
	 if(myProfileForm.lastName.value == '') {
		 missingFields = true;
		 strFields += " Please enter lastName\n";
	 }
	 if(myProfileForm.email.value == '') {
		 missingFields = true;
		 strFields += " Please enter an email\n";
	 }
	 if(myProfileForm.jobTitle.value == '') {
		 missingFields = true;
		 strFields += " Please enter jobTitle\n";
	 }
	 if(myProfileForm.telPhNo1.value == '') {
		 missingFields = true;
		 strFields += " Please enter telePhoneNo1\n";
	 }
	 if(myProfileForm.telPhNo2.value == '') {
		 missingFields = true;
		 strFields += " Please enter telePhoneNo2\n";
	 }
	 if(myProfileForm.telPhNo3.value == '') {
		 missingFields = true;
		 strFields += " Please enter telePhoneNo3\n";
	 }
	 if(myProfileForm.address1.value == '') {
		 missingFields = true;
		 strFields += " Please enter Address\n";
	 }
	 if(myProfileForm.city.value == '') {
		 missingFields = true;
		 strFields += " Please enter city\n";
	 }
	 if(myProfileForm.country.value == '') {
		 missingFields = true;
		 strFields += " Please enter country\n";
	 }
	 if(myProfileForm.zipCode.value == '') {
		 missingFields = true;
		 strFields += " Please enter zipCode\n";
	 }
	 
	 if(missingFields) {
		 alert(strFields);
		 return false;
	 }
	 
	 if(!isEmpty(myProfileForm.changePwd.value, myProfileForm.confirmPwd.value)) {
		if(!(validatePassWords(myProfileForm.changePwd.value, myProfileForm.confirmPwd.value))) {
			return false; 
		}
	 
	 }
	 
	 
	 
	 return true;
};

function stripSpaces(inString)
{
	inString = inString.replace(/^\s*/, "").replace(/\s*$/, "");
	return inString;
}

function validatePassWords(changePwd, confirmPwd){
	if ((!(((changePwd.length == 0) || (changePwd == null) || (stripSpaces(changePwd)==""))) && ((confirmPwd.length == 0) || (confirmPwd == null) || (stripSpaces(confirmPwd)==""))) || (((changePwd.length == 0) || (changePwd == null) || (stripSpaces(changePwd)=="")) && !(((confirmPwd.length == 0) || (confirmPwd == null) || (stripSpaces(confirmPwd)==""))))) {
			alert("The two passwords columns length must be the same.");	
			return false;
	}
	if (changePwd == "12345678" || confirmPwd == "12345678") 
	{
		alert("New Password cannot be 12345678.");
		changePwd.focus();
		//changePwd.select();
		return false;
	}
	
	if(! PasswordStrength(changePwd , "Change Password: ")) 
	{
		//changePwd.focus(); 
		return false;
	}
	
	//if (!isEmpty("Confirm New Password", confirmPwd)) return false;
	
	if(! PasswordStrength(confirmPwd , "Confirm New Password: ")) 
	{
		//confirmPwd.focus();
		return false;
	}
	
	
	if (changePwd.value != confirmPwd.value) 
	{
		alert("New Password and Confirm New Password must match.");
		changePwd.focus();
		//changePwd.select();
		return false;
	}
	
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
            
	  	if(pass.toLowerCase() == myProfileForm.userName.value.toLowerCase()){ 
            alert(FldDesc + " Password cannot be same as your user ID.");
 		   return false;
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

function isEmpty(changePwd, confirmPwd)
{
	if (((changePwd.length == 0) || (changePwd == null) || (stripSpaces(changePwd)=="")) && 
			((confirmPwd.length == 0) || (confirmPwd == null) || (stripSpaces(confirmPwd)=="")))
	{
		return true;
	}
	return false;
}
</script>

<style>
.tableHeader th {
	padding: 9.5px;
}
</style>

</head>
<body>
	<br>
	<form:form id="myProfileForm" name="myProfileForm" method="post"
		modelAttribute="myProfileBean" commandName="myProfileBean">
		<div id="bodyContent">
			<%@ include file="includeBanner.jsp"%>
			<%@ include file="includeMenu.jsp"%>
			<%-- <%@ include file="includeBreadcrumbs.jsp"%> --%>

			<div class="clrDiv"></div>

			<div class="row">

				<!-- Added by OS For Printing Screen -->

				<div class="col-md-12 mainContent">

					<div class="col-md-3"></div>
					<div class="col-md-9">

						<table class="littleMargin tableWidth97">
							<tr>
								<td width="20%"></td>
								<td width="60%"><span class="titleText">My Profile</span></td>
								<td width="20%"></td>
							</tr>
							<tr>
								<td><br /></td>
								<td><img alt="pin" src="resources/img/pin.png"
									class="pinImg" title="pin">&nbsp; Note: Please fill up
									the required fields to avoid seeing (<span class="mandatory">
										* </span>) indicates a required column.</td>
								<td></td>
							</tr>
							<tr>
								<td colspan="3"><c:if
										test="${fn:length(myProfileBean.profileResult) > 0 }">
										<div
											style="border: none; width: 695px; height: 30px; text-align: left; color: red;">
											<c:out value="${myProfileBean.profileResult }" />
										</div>

									</c:if>

									<div class="thickBorderdiv">
										<table class="tableWidth100" align="center" cellpadding="5">
											<tr>
												<td colspan="2">&nbsp;</td>
											</tr>
											<tr>
												<td width="40%" align="right" class="TextColor">User
													Name:</td>
												<td width="60%">${myProfileBean.userAccountDTO.userID}</td>
												<form:hidden path="userAccountDTO.userID" name="userName"
													id="userName" />
											</tr>
											<tr>
												<td align="right" class="TextColor">Change Password:</td>
												<td><form:input type="password"
														path="userAccountDTO.newPassword1" name="changePwd"
														id="changePwd" /></td>

											</tr>
											<tr>
												<td align="right" class="TextColor">Confirm Password:</td>
												<td><form:input type="password"
														path="userAccountDTO.newPassword2" name="confirmPwd"
														id="confirmPwd" /></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">First Name:</td>
												<td><form:input type="text"
														path="userAccountDTO.firstName" name="firstName"
														id="firstName" class="box180" /><font
													class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Last name:</td>
												<td><form:input type="text"
														path="userAccountDTO.lastName" name="lastName"
														id="lastName" class="box180" /><font
													class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Middle Initial:</td>
												<td><form:input type="text"
														path="userAccountDTO.middleName" name="middleIntial"
														id="middleIntial" class="smallinput" /></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Email:</td>
												<td><form:input type="text" path="userAccountDTO.email"
														name="email" id="email" class="box180"
														onBlur="valEmail(this)" /><font class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Job Title:</td>
												<td><form:input type="text"
														path="userAccountDTO.jobTitle" name="jobTitle"
														id="jobTitle" class="box180" /><font
													class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Telephone No:</td>
												<td><form:input type="text"
														path="userAccountDTO.telPhNo1" name="telPhNo1"
														id="telPhNo1" class="smallinput"
														onkeypress="return isNumberKey(event);" maxlength="3" /> -
													<form:input type="text" path="userAccountDTO.telPhNo2"
														name="telPhNo2" id="telPhNo2" class="smallinput"
														onkeypress="return isNumberKey(event);" maxlength="3" /> -
													<form:input type="text" path="userAccountDTO.telPhNo3"
														name="telPhNo3" id="telPhNo3" class="smallinput"
														onkeypress="return isNumberKey(event);" maxlength="4" /><font
													class="mandatoryField">*</font> <span class="TextColor">Ext:<form:input
															type="text" path="userAccountDTO.telephoneExt"
															name="telephoneExt" id="telephoneExt" class="smallinput"
															onkeypress="return isNumberKey(event);" maxlength="5" /></span></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Other Tel.No.:</td>
												<td><form:input type="text"
														path="userAccountDTO.otherTelephone" name="otherTelPhNo"
														id="otherTelPhNo" class="box180"
														onkeypress="return isNumberKey(event);" maxlength="15" /></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Office Address:</td>
												<td><form:input type="text"
														path="userAccountDTO.address1" name="address1"
														id="address1" class="box180" /><font
													class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right">&nbsp;</td>
												<td><form:input type="text"
														path="userAccountDTO.address2" name="address2"
														id="address2" class="box180" /></td>
											</tr>
											<tr>
												<td align="right">&nbsp;</td>
												<td><form:input type="text"
														path="userAccountDTO.address3" name="address3"
														id="address3" class="box180" /></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">City:</td>
												<td><form:input type="text" path="userAccountDTO.city"
														name="city" id="city" class="box180" /><font
													class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">State:</td>
												<td><form:select path="userAccountDTO.state"
														id="stateId" class="box180">
														<c:forEach var="item"
															items="${myProfileBean.userAccountDTO.stateList}"
															varStatus="status">
															<c:choose>
																<c:when
																	test="${myProfileBean.userAccountDTO.state == item.state}">
																	<form:option value="${item.state}" selected="selected">${item.stateName}</form:option>
																</c:when>
																<c:otherwise>
																	<form:option value="${item.state}">${item.stateName}</form:option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
														<font class="mandatoryField">*</font>
													</form:select></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">Country:</td>
												<td><form:input type="text"
														path="userAccountDTO.country" name="country" id="country"
														class="box180" /><font class="mandatoryField">*</font></td>
											</tr>
											<tr>
												<td align="right" class="TextColor">ZipCode:</td>
												<td><form:input type="text"
														path="userAccountDTO.zipCode" name="zipCode" id="zipCode"
														class="box180" maxlength="9"
														onkeypress="return isNumberKey(event);" /><font
													class="mandatoryField">*</font></td>
											</tr>

											<tr>
												<td colspan="2">&nbsp;</td>
											</tr>
										</table>


									</div></td>
							</tr>
							<tr>
								<td colspan="3" align="center"><input type="submit"
									name="action" value="Save" class="greenDiv"
									onclick="return val();;" /></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<p class="text-warning">&nbsp;&nbsp;</p>
	<!-- Add the extra clearfix for only the required viewport -->
	<!--/mainContent-->
	<%@ include file="includeFooter.jsp"%>
</body>
</html>
