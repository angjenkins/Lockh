
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>

<script>
	function doSubmit(vfield) {
 	    document.myForm.submit();
    
}

	function markEditRow(rownum ,vfield){

		document.getElementById('modelColorBidList'+ rownum +'.editFlag').value = 'true';
		Update(vfield);
	}
	
</script>




<script language="JavaScript">
 function CheckQty() {
  var numOfElements = document.myform.elements.length;
  var totqty = document.myform.Quantity.value;
  var totsel = 0;
  var totstring ="";
  var vfield = " ";
  var count  = 0 
       for(i=0;i< numOfElements;i++) {      
		  vfield = document.myform.elements[i].name;
			if (vfield.substring(0,1) == 'x')
			 {
   			   totstring = totstring + " + " + document.myform.elements[i].value; 
		       totsel = eval(totstring);
			   count  = count+ 1; 			   
		      }
        }
		if (( totsel != totqty ) && ( count > 0)) {
		   alert( "Please verify your quantity,  'Total Color Quantity'  must be equal to 'Total Quantity'!" ) 
		   return false;
		}   

		if (totqty == 0 ) {
		   alert( "Total Quantity  should be greater than 0!" ) 
		   return false;
		}   
		
}   

 function CheckQtyColorLimit() {
  var numOfElements = document.myform.elements.length;
  var totqty = document.myform.Quantity.value;
  var totsel = 0;
  var totstring ="";
  var vfield = " ";
  var count  = 0;
  var colorcount = 0
       for(i=0;i< numOfElements;i++) {      
		  vfield = document.myform.elements[i].name;
			if (vfield.substring(0,1) == 'x')
			 {
   			   totstring = totstring + " + " + document.myform.elements[i].value; 
		       totsel = eval(totstring);
			   count  = count+1; 			
			   if (document.myform.elements[i].value > 0)
			   {
			   		colorcount = colorcount+1;
			   }
		      }
        }
				
		if (colorcount > 1)
		{
			alert( "MIPR orders cannot select more than one color per Line Item." ) 
		   	return false;
		}
		if (( totsel != totqty ) && ( count > 0)) {
		   alert( "Please verify your quantity,  'Total Color Quantity'  must be equal to 'Total Quantity'!" ) 
		   return false;
		}   

		if (totqty == 0 ) {
		   alert( "Total Quantity  should be greater than 0!" ) 
		   return false;
		}   

		
}   




 function ComputeQty(vfield) {
  var numOfElements = document.myform.elements.length;
  var totqty = document.myform.Quantity.value;
  var totsel = 0;
  var totstring ="";
  var vfield = " ";
       for(i=0;i< numOfElements;i++) {      
		  vfield = document.myform.elements[i].name;
            if (document.myform.elements[i].value.length == 0) 
			     {  document.myform.elements[i].value = 0;
				   }		  
			if (vfield.substring(0,1) == 'x')
			 { totstring = totstring + " + " + document.myform.elements[i].value; 
		       totsel = eval(totstring); 			   
		      }
          }         
    document.myform.Total_Color.value = totsel;
		
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
								<td width="35%"><span class="titleText">Color
										Selection</span></td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
										<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
										<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
								
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
									<div class="requirementsMainDiv">
										<div class="headerDiv">
											<div class="circledDiv"></div>
											<span><c:out value="${orderBean.stdItemDTO.stdItem}"/> -<c:out value="${orderBean.stdItemDTO.description}"/> </span> <br>
											<br>
										</div>
										<ul class="minibreadCrumb" role="menubar">
										  <li class="seperator" role="menubaritem"><a href="notetoput.html">Justification</a></li>
										  <li class="seperator" role="menubaritem"><a href="clarification.html">Clarification</a></li>
										  <li class="seperator" role="menubaritem"><a href="colors.html">Color Selection</a></li>
										</ul>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					
					<div class="colorsDiv">
				    	<table class="vehQtyTable1 tableWidth100" >
							<tr class="dotBg">
							<td width="40%" >&nbsp;</td>
							<td class="lightBlueBg2"> </td>
							</tr>
							<tr>
								<td align="right">Manufacturer:</td>
								<td colspan="2" class="lightBlueBg2"><c:out value="${orderBean.contrLineDTO.manufacturerName}"/></td>
							</tr>
							<tr>
								<td align="right" >Model:</td>
								<td colspan="2"class="lightBlueBg2"><c:out value="${orderBean.contrLineDTO.modelDescripton}"/></td>
							</tr>
							<tr>
								<td align="right" >Model Year:</td>
								<td colspan="2"class="lightBlueBg2"><c:out value="${orderBean.contrLineDTO.modelYYYY}"/></td>
							</tr>
							<tr>
							<td  align="right">Quantity:</td>
							<td colspan="2"class="lightBlueBg2"><c:out value="${orderBean.inputVehicleQuantity}"/></td>							</tr>
						</table>
					</div>
					<br>
					

					<div class="colorsDiv">
						<div class="colorDivHeader">
							<span class="titleText">Available Colors: </span>
						</div>
						<table class="ColorTable tableWidth100" >
							<tbody>
								<tr>
								  <td  width="40%" class="paddingRight20" scope="col" align="right"><b>Colors Name </b></td>
								  <td width="60%" class="paddingleft40" scope="col"><b> Color quantaty</b></td>
								</tr>
							
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
								 <c:forEach items="${orderBean.modelColorList}" var="selectItem" varStatus="status" >
									<tr>
										<td align="right" class="TextColor "><lable for ="${selectItem.description}"><c:out value="${selectItem.description}"/></lable></td>
										<td>

					 				       <input type="text" class="qtyinput"  id ="modelColorList${status.index}.quantity"  name= "modelColorList[${status.index}].quantity"  onBlur="isNumOnly(this);" width="3" size="3" maxlength="3" onChange="markEditRow(${status.index},this);"/>
					 				       <form:input type="hidden" path= "modelColorList[${status.index}].model"/>
					 				       <form:input type="hidden" path= "modelColorList[${status.index}].color_Code"/>
					 				       <form:input type="hidden" path= "modelColorList[${status.index}].std_Item"/>
					 				       <form:input type="hidden" path= "modelColorList[${status.index}].description"/>
					 				       <form:input type="hidden" path= "modelColorList[${status.index}].editFlag"/>
					 				       

										</td>
		
									</tr>	
		
								 </c:forEach>
								<tr>
									<td colspan="2">&nbsp;</td>
								</tr>
							</tbody>
					</table>
						
					<div class="grayBg">
						<div class="redColorRow" ></div>
						  <div class="redColorRow" ></div>
							<table class="tableWidth100">
								<tr class="colorDivHeader">
								<td width="40%" align="right" class="paddingright20"><span class="titleTextColor"><lable for="total color">Total Color Quantity:</lable></span></td>
								<td width="60%" valign="middle">
									<input type="text" class="qtyinput"  value="${orderBean.inputVehicleQuantity}"  size="3" maxlength="3" />
	<!-- 								<input type="button" class="greenDiv" value="Save"></td> -->
								</tr>
							</table>
						 </div>
						</div>
						
					<table width="97%" class="littleMargin">
						<tbody>
							<tr>
								<td width="35%">&nbsp;</td>
								<td width="35%" class="rightPadding105">
									<div class="simplePagination">
										<ul>
										<li><a class="active"  href="javascript:;"  onclick="doSubmit(this);">Next &nbsp; &gt;&gt;</a></li>
												<li><a href="#" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div>
								</td>
								<td width="27%">&nbsp;</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
  </form:form>	
	<%@ include file="includeFooter.jsp"%>
</body>