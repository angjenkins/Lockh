<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>

<script TYPE="text/javascript" >
var req_email_fax = false;
var del_email_fax = false;
var export_contact_tel = false;   
var flagDOD  = ${orderBean.dod};
var stateObj = "";
var dealerInfoList = "";
var stateSelected = "";
var flag1122 = "${commonBean.userAccount.flg1122 != 'Y' }";

function loading(){
	CheckQty();
}



function isNumOnly(vString)
{
    var NUMBERS = "0123456789";
    var valid = true;

    for(var i=0;i<vString.length;i++)
            if(NUMBERS.indexOf(vString.charAt(i))<0)
                    valid = false;

    return(valid);
}       

function isFloatOnly(vString)
{
    var NUMBERS = ".0123456789";
    var valid = true;

    for(var i=0;i<vString.length;i++)
            if(NUMBERS.indexOf(vString.charAt(i))<0)
                    valid = false;

    return(valid);
}       

function CheckQty() {

	var totamt=0;
	var totqty = Number(document.getElementById("estUnitPrice").value);
	
	if (isFloatOnly(document.getElementById("addFund").value ) == false) {
		alert("Additional Funds amount must be numeric");
		document.getElementById("addFund").focus();
		return false;
	}
	
	if (totqty > 999999)
	 {
	     alert("Your obligated amount shouldn't be greater than $999,999");
	         return false;
	 }
	 totamt=  Number(document.getElementById("estUnitPrice").value) + Number(document.getElementById("addFund").value);
	 //alert(totamt);
	 document.getElementById("totEstUnitPrice").value = formatCurrency(Number(totamt));
	 return true;
}   

function upper(vField) {
    vField.value = vField.value.toUpperCase();         
}


function checkTAS(vfield) {
	var expression ="";
	upper(vfield);
	if (vfield.value.length > 7) 
	 	expression = "\[a-zA-Z0-9]{2}\\s{1}\[a-zA-Z0-9]{4}\\s{1}\[a-zA-Z0-9]{3}";
	else 
	 	expression = "\[a-zA-Z0-9]{2}\\s{1}\[a-zA-Z0-9]{4}";
	
	if( !vfield.value.match( expression ) ) {
		alert( "Please enter a valid TAS format" );
		vfield.focus();
		return false; 
	}	
	return true;
}

function checkMIPR(){
	CheckQty();
	
	if(document.getElementById('agencyOrderNo').value.trim() == ''){
		alert("Agency Order Number is required");
		document.getElementById('agencyOrderNo').focus();
		return false;
	}
	if(document.getElementById('lineItem').value.trim() == ''){
		alert("Line Item is required");
		document.getElementById('lineItem').focus();
		return false;
	}
	
	if(flag1122 != "Y" && !checkTAS(document.getElementById('tas'))){
		return false;
	}
	
	var action = '${orderBean.action}';
	document.getElementById("myForm").action = "/AutoChoice/ReqDetailsMIPRUpdate/" + action;
	document.getElementById("myForm").submit();	
}

function sendIncomplete(){
	CheckQty();
	
	document.getElementById("myForm").action = "/AutoChoice/ReqDetailsMIPRUpdate/Incomplete";
	document.getElementById("myForm").submit();
} 


//--------------------  trim ----------------------------
function trim(vString)
{  
    var tString = vString;

    //trim left spaces
    if (tString.charAt(0) == " ")
            tString = trim(tString.substring(1, tString.length));

    //trim right spaces
    if (tString.charAt(tString.length-1) == " ")
            tString = trim(tString.substring(0, tString.length-1))

    return(tString);
}


//--------------------  formatCurrency ----------------------------
function formatCurrency(number) {
	var num = new String(number);
	if(num.indexOf(".") == -1) {
	    intLen = num.length;
	    toEnd = intLen;
	    var strLeft = new String(num.substring(0, toEnd));
	    var strRight = new String("00");
	}
	else {
	    pos = eval(num.indexOf("."));
	    var strLeft = new String(num.substring(0, pos));
	    intToEnd = num.length;
	    intThing = pos + 1;
	    var strRight = new String(num.substring(intThing, intToEnd));
	
	    if(strRight.length > 2) {
	            nextInt = strRight.charAt(2);
	            if (nextInt >= 5) {
	               strRight = new String(strRight.substring(0, 2));
	               strRight = new String(eval((strRight * 1) + 1));
	               if((strRight * 1) >= 100) {
	                   strRight = "00";
	                   strLeft = new String(eval((strLeft * 1) + 1));
	               }                               
	               if(strRight.length <= 1) {
	                  strRight = new String("0" + strRight);
	               }
	            }
	            else {
	               strRight = new String(strRight.substring(0, 2));
	            }
	    }
	    else {
	            if(strRight.length != 2) {
	              	 strRight + "0";
	            }
	    }
	}
	
	if(strLeft.length > 3) {
	    var curPos = (strLeft.length - 3);
	    while(curPos > 0) {
		       var remainingLeft = new String(strLeft.substring(0, curPos));
		       var strLeftLeft = new String(strLeft.substring(0, curPos));
		       var strLeftRight = new String(strLeft.substring(curPos, strLeft.length));
		       strLeft = new String(strLeftLeft + "," + strLeftRight);
		       curPos = (remainingLeft.length - 3);
	    }
	}
	
	strWhole = strLeft + "." + strRight;
	finalValue = strWhole;
	return(finalValue)
}

function goBack() {
    window.history.back()
}
</script>

</script>

</head>

<body onLoad="loading()">
    <div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>

		<div class="clrDiv"></div>

  		<div class="row">
   
  <!-- Added by OS For Printing Screen -->

   			<div class="col-md-12 mainContent">
				<%@ include file="includeLeftmenu.jsp"%>
   				<div class="col-md-9">
   				<table class="tableWidth97">
				   <tr>
					   <td>
					   <div class="rightColMenu">
					   <ul>
					   <li><a href="#" onMouseOver="slideMenu('1')">Minimum Requirements</a> |</li>
					   <li class="active"><a href="#" onMouseOver="slideMenu('2')">Options</a> |</li>
					   <li><a href="#" onMouseOver="slideMenu('3')">Compare Prices</a> |</li>
					   <li><a href="#" onMouseOver="slideMenu('4')">Other Features</a> |</li>
					   <li><a href="#" onMouseOver="slideMenu('5')">Clarifications</a> |</li>
					   <li><a href="#" onMouseOver="slideMenu('6')">Emissions</a> |</li>
					   <li><a href="#" onMouseOver="slideMenu('7')">Vendor Performance</a></li>
					   </ul>
					   <div class="bgImgDiv optionsIndicatorPosition" >
					   <img src="/AutoChoice/resources/img/small_line.jpg" alt="display small line"/>
					   </div>
					   </div>
					   </td>
				   </tr>
			   </table>
			   <table class="littleMargin tableWidth97">
				   <tr>
					   <td width="35%">
					   	<span class="titleText">Pending Order</span>
					   </td>
					   <td width="27%">
						    <div onClick="javascript:window.print();" class="extraOptions"><img alt="Print" src="resources/img/printer.png" width="20" title="Print"></img>&nbsp; print</div>
						   <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="img/mail.png" width="20" title="Email"></img>&nbsp; email</div>-->
					   </td>					   
				   </tr>
				   <c:if test="${fn:length(orderBean.returnMessage) > 0 }">								
						<tr>
							<td style="text-align:center;">
								<c:out value="${orderBean.returnMessage }"  escapeXml="False"/>
							</td>
						</tr>
					</c:if>
			   </table>
			  <table class="tableWidth97">
				  <tr>
					  <td colspan="6">					  
						  <div class="optionsMainDiv">
							  <div class="headerDiv">
								  <div class="circledDiv"></div>
								  <span></span>					 
							  </div>
							 <ul class="minibreadCrumb" >
							 <li class="seperator"><a href="notetoput.html">Note</a></li>
							 <li class="seperator"><a href="colors.html">Color Selection</a></li>
							 <li class="seperator"><a href="summary.html">Summary</a></li>
							 <li ><a href="form_submit.html">Submission Form</a></li>					 
							 </ul>
							<div class="noteDiv">
								<img src="resources/img/pin.png" class="pinImg" alt="pin image"/>&nbsp; Note: An Asterisk (<span class="mandatory"> * </span>) indicates a required column.
								<div class="redColorRow" ></div>
								<div class="redColorRow" ></div>
							</div>
							<form:form commandName="ReqDetailExecute" action="/AutoChoice/ReqDetailExecute" modelAttribute ="orderBean" method="post" name="myForm"  id="myForm">
						    <table class="tableWidth100">
							    <tr>
								    <td colspan="2" summary="Table of the requisition Details" >
									    <div class="vehInfBorder">
									    <div class="vehInf vehInfInner100" >
									    	<span>Requisition Detail</span>
									    </div>
									    <table class="leftSpacing tableWidth100" cellpadding="4">
										    <tr>
											    <td width="25%"><label for="agencyOrderNo">Agency Order No:</label></td>
											    <td><form:input type="text" path="reqCart.agencyOrderNo" id="agencyOrderNo" name="agencyOrderNo" title="agency order number" value="${orderBean.reqCart.agencyOrderNo }" size="20" maxlength="20" class="address" onchange="javascript: agencyOrderNo.value = trim(agencyOrderNo.value);"/><font class="mandatoryField">*</font></td>
										    </tr>
										    <c:if test="${not empty orderBean.agBuOnBehalfList }">
										    	<tr>
												    <td width="25%"><label for="agBuOnBehalf">Ordering On Behalf:</label></td>
												    <td>
												    	<form:select  path="reqCart.agBuOnBehalf" id="agBuOnBehalf" name="agBuOnBehalf" items="${orderBean.agBuOnBehalfList}" itemValue="combinedCode" title="agency bureau on behalf list" itemLabel="codeNameDisplay"></form:select>
													</td>
											    </tr>
										    </c:if>										    
										    <tr>
											    <td><label for="lineItem">Line Item:</label></td>
											    <td> 
											    	<form:input type="text" path="reqCart.lineItem" id="lineItem" name="lineItem" title="Line Item" value="${orderBean.reqCart.lineItem }"  size="6" maxlength="6" class="box40"/>
											    	<font class="mandatoryField">*</font>										
											    </td>
										    </tr>
										    <tr>
										    	<td></td>
										    	<td><span class="desc">For more information on the Funding Agency and Funding Office fields, please visit the Federal Data Procurement System.<br> A list of codes can be viewed at  <a>https://www.fpds.gov/fpdsng_cms/index.php/en/worksite.html</a> under "List of Contracting Office&quot;</span></td></tr>
										    <tr>
										    <tr>
											    <td>Total Quantity:</td>
											    <td>
											    	<c:out value="${orderBean.reqCart.quantity }"/>
												</td>
										    </tr>
											<tr>
											    <td><label for="estUnitPrice">Unit Price $:</label></td>
											    <td>
											    	<input type="hidden" id="estUnitPrice" name="reqCart.estUnitPrice" value="${orderBean.reqCart.estUnitPrice }"/>
											    	<fmt:parseNumber value="${orderBean.reqCart.estUnitPrice}" type="number" var="estUnitPriceTemp"/>
													<fmt:formatNumber maxFractionDigits="4" value="${estUnitPriceTemp}"/>
												</td>
										    </tr>
										    <tr>
											    <td><label for="addFund">Additional Funds per unit:</label></td>
											    <td>
												    <form:input type="text" path="reqCart.addFund" id="addFund" name="addFund" title="Additional Funds" class="smallinput"  value="${orderBean.reqCart.addFund }" onChange="CheckQty()"/>
												    <span class="desc">&nbsp;(Obligate additional funds to this order)</span>												    
											    </td>
										    </tr>
										    <tr>
											    <td><label for="addFund">Total Est Line Price $:</label></td>
											    <td>
												    <fmt:parseNumber value="${orderBean.reqCart.estUnitPrice * orderBean.reqCart.quantity}" type="number" var="totEstLinePriceTemp"/>
													<fmt:formatNumber type="currency" value="${totEstLinePriceTemp}"/>
													<input type="hidden" id="totEstUnitPrice" name="totEstUnitPrice" value="" readonly/>
											    </td>
										    </tr>
										    <tr>
											    <td >Description:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.nonStdDesc }"/></span></td>
										    </tr>
										    <tr>
											    <td><label for="acrn">ACRN:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.acrn" id="acrn" name="acrn" title="ACRN" value="${orderBean.reqCart.acrn }"  size="2" maxlength="2" class="box40"/>
												</td>
										    </tr>
										    <c:choose>
											    <c:when test="${commonBean.userAccount.agencyCode == '17'}">
												    <tr>
													    <td><label for="tcn">TCN:</label></td>
													    <td> 
													    	<form:input type="text" path="reqCart.tcn" id="tcn" name="tcn" title="tcn" value="${orderBean.reqCart.tcn }"  size="30" maxlength="30" class="address"/>
													    	&nbsp;
													    </td>
												    </tr>
												</c:when>
												<c:otherwise>
													<input type="hidden" id="tcn" name="reqCart.tcn" value="${orderBean.reqCart.tcn }"/>
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${commonBean.userAccount.flg1122 != 'Y' }">
												    <tr>
													    <td><label for="tas">Treasury Account Symbol:</label></td>
													    <td>
													    	<form:input type="text" path="reqCart.tas" id="tas" name="tas" title="tas" value="${orderBean.reqCart.tas }"  size="12" maxlength="12" class="address"  onchange="javascript: return checkTAS(this);"/> &nbsp;
													    	<font class="mandatoryField">*</font>
													  		<a href='<c:url value="http://www.fms.treas.gov/fastbook/index.html"/>'  target="_blank" title="How to find your TAS number."><button class="blueBtn" type="button">TAS</button></a><br>
													  		(XX XXXX or XX XXXX XXX)
													    </td>
												    </tr>
											    </c:when>
											    <c:otherwise>
											    	<input type="hidden" id="tas" name="reqCart.tas" value="${orderBean.reqCart.tas }" /> &nbsp;
											    </c:otherwise>
											</c:choose>					   
									    </table>
									    </div>
								    </td>
							    </tr>							     
							    <tr>
							    	<td colspan="2" align="center">&nbsp;</td>
							    </tr>
							    <tr>
							    	<td colspan="2" align="center">
							    		<c:choose>
							    			<c:when test="${orderBean.action == 'Edit' }">
							    				<input  type="button" class="greenDiv" value="Update Pending Order" onclick="checkMIPR();" title="Update Pending Order Button">
							    			</c:when>
							    			<c:otherwise>
							    				<input  type="button" class="greenDiv" value="Add to Pending Orders" onclick="checkMIPR();" title="Add Pending Order Button">
							    				&nbsp;&nbsp;&nbsp;&nbsp;
							    				<input  type="button" class="greenDiv" value="Save Incomplete" onclick="sendIncomplete();" title="Save as Incomplete Button">
							    			</c:otherwise>
							    		</c:choose>							    		
							    	</td>
							    </tr>
						    </table>

						    </form:form>
						   <div class="width100 topMargin13">
						  		<table class="littleMargin tableWidth97">
								   <tr>
									   <td width="34%">&nbsp;</td>
									   <td width="33%" class="rightPadding105">
										   <div class="simplePagination">
										   <ul>
										 	 <li><a href="#" class="active">Next &nbsp; >></a></li>
										    <li><a href="javascript: goBack();"><< &nbsp; Previous</a></li>
										   </ul>
										   </div> 
									   </td>
									   <td width="33%">&nbsp;</td>
								   </tr>
							   </table>
						   </div>
					 	</div>
					 </td>
				  </tr>
			  </table>
   </div>
   </div>
   </div>
<p class="text-warning">&nbsp;&nbsp;</p>
<!-- Add the extra clearfix for only the required viewport -->
</div> <!--/mainContent-->
<div>
</div>
<%@ include file="includeFooter.jsp"%>

  </body>
</html>