<%@ include file="includeTop.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="includeHead.jsp"%>
</head>



<script>

var status = false;
var selected ="";
var submittedclick = 0;

function initialize(){
  var vfield = document.forms[0].elements;

    for (var i=0;i<vfield.length;i++)	{
        if (vfield.elements[i].name == 'x_DDR'){
          if (vfield.elements[i].checked == true)
              vfield.elements['x_ExDel'].disabled = true;
        }       
        if (vfield.elements[i].name == 'x_ExDel'){
          if (vfield.elements[i].checked == true) {
              vfield.elements['x_DDR'].disabled = true;
              for (counter = 0; counter <document.forms[0].x_DDR.length; counter++)
                 document.forms[0].x_DDR[counter].disabled=false;
            }       
        }

        if (vfield.elements[i].name == 'x_Misc'){
                for (counter = 0; counter <document.forms[0].x_Misc.length; counter++) {
                   document.forms[0].x_Misc[counter].disabled=false;
                 }       
          }

    
    }
  return true;
}





function getSelectedOptions(){
	  // var vfield = document.forms[0].elements;
	   var vfield  = document.myForm.elements; 
	   var options ="";
	   var ctr = 0;
	   var temp ="";
	   
		 for (i=0;i<vfield.length;i++) {
			if ((vfield[i].name.substring(0,2) == "x_" ) && (vfield[i].checked == true)){
	            if (ctr == 0 ){		
				  options = options + vfield[i].value; 
				}
				else{
	              options = options + ","+ vfield[i].value; 
		        } 
				temp  =  "qty_"+vfield[i].value;
	         	found = false;
				for (j=0;j<vfield.length;j++) {
				   if ((vfield[j].name == temp) && (vfield[i].checked == true) ) {
				      if ( vfield[j].value > 0 ) {
	 		             options = options +"=" +vfield[j].value;   // options is TYPE "O" or "V"
	                     found = true;
					  }
				   
				      else {
				    	  alert("You have to enter quantity for "+vfield[j].name );
				    	  return false;
				      }
				   }	 
				
				}
				if (!found){
		        	options = options +"=1";    // qty default is 1 for all
				}
				ctr++;
			}	
		 	
		 }
	//   alert ("options selected : " +options);
	   document.getElementById("optionsAndQty").value= options;
       document.myForm.submit();
	   return false;			
	}




function  RadioButton(vfield)
{
  var temp="";

  if (selected == vfield.value)
	{     vfield.checked= false;
		   counter = 0;
		   if (vfield.name == 'x_ExDel'){
			   for (counter = 0; counter < myForm.x_DDR.length; counter++)
					myForm.x_DDR[counter].disabled=false;


              myForm.x_Delivery.disabled=false;
		      myForm.x_Delivery.checked=false; 
// need to use when radio item has more than one else you'll get the undefined error.
//			  counter = 0;
//              for (counter = 0; counter < myForm.x_Delivery.length; counter++) {
//					myForm.x_Delivery[counter].disabled=false;
//					myForm.x_Delivery[counter].checked=false;

  //            }
		   }
		   counter = 0;
		   if (vfield.name == 'x_DDR'){
		//       for (counter = 0; counter < myForm.x_ExDel.length; counter++)  since its only 1611 right now loop is not working.
					myForm.x_ExDel.disabled=false;
					myForm.x_ExDel.checked=false; 
                    myForm.x_Delivery.disabled=false;
					myForm.x_Delivery.checked=false; 


		   }
		  if (vfield.name == 'x_Delivery'){	
		     counter = 0;
		     for (counter = 0; counter < myForm.x_DDR.length; counter++){
        		  myForm.x_DDR[counter].disabled=false; 
			      myForm.x_DDR[counter].checked=false; 
		     }    
		     myForm.x_ExDel.disabled=false; 
         }


		   if (vfield.elements[i].name == 'x_Misc'){
	            if (vfield.elements[i].checked == true) {
	                for (counter = 0; counter <document.forms[0].x_Misc.length; counter++)
	                   document.forms[0].x_Misc[counter].disabled=false;
	              }       
	          }

	     
		  


		   selected ="";
		   return null;
    }  
  selected=vfield.value;
  if (vfield.name == 'x_ExDel'){	
     counter = 0;
     for (counter = 0; counter < myForm.x_DDR.length; counter++){
          myForm.x_DDR[counter].disabled=true; 
          myForm.x_DDR[counter].checked=false; 

       }
      myForm.x_Delivery.disabled=true; 
   }

  if (vfield.name == 'x_DDR'){	
     counter = 0;
 //          alert(document.myForm.x_DDR.length); 
          myForm.x_ExDel.disabled=true; 
          myForm.x_Delivery.disabled=true; 
   }

  if (vfield.name == 'x_Delivery'){	
     counter = 0;
     for (counter = 0; counter < myForm.x_DDR.length; counter++){
          myForm.x_DDR[counter].disabled=true; 
          myForm.x_DDR[counter].checked=false; 
     }    
      myForm.x_ExDel.disabled=true; 
   }


  /// to be finished...

   if (vfield.elements[i].name == 'x_Misc'){
	   vfield.elements[i].disabled == true
          for (counter = 0; counter <document.forms[0].x_Misc.length; counter++) {
             document.forms[0].x_Misc[counter].disabled=false;
           }       
    }

  

}

function checkall() {
 counter = 0;
 var vfield  = document.myForm.elements;
	for(i=0; i<vfield.elements.length; i++) {
		 if(vfield.elements[i].type=="checkbox") {
  			if  (vfield.elements[i].checked == true) {
			    counter++;   
		    }
         }
		 if(vfield.elements[i].type=="radio") {
		    if  (vfield.elements[i].checked == true) {
			      counter++;   
			}
		}	
	}
   

    if (counter > 18 ) {
       alert ("GSA cannot accept orders containing over 18 options for the remainder of the fiscal year.  Please call 703-605-2277 if you have any questions.");
        return false;

    }
return true;
}



function Submitted(vfield)
{  
    if (submittedclick >= 1)
     {
     alert("Please donot double click this button!");
  	 return false; 
    }

 //    <cfif session.areq_18opt is "Yes">  APM REMOVE TEMP 06/10/2014
	     if  (!checkall())
    	     return false;
 //    </cfif>
     submittedclick++;
	 myForm.submit();
  return true;  
}  

function DblSubmitted(vfield)
{  
    if (submittedclick >= 1)
     {
     alert("Please donot double click this button!");
  	 return false; 
    }
     submittedclick++;
  return true;  
}  

</script>

<body onLoad="initialize()">
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
								<td width="25%"><span class="titleText">Options</span></td>
								<td width="35%" class="rightPadding105"><div
										class="simplePagination">
										<ul>
										    <li><a class="active"  href="javascript:;"  onclick="getSelectedOptions();">Next &nbsp;
															&gt;&gt;</a></li>
											<li>
													  <a href="javascript:;" onclick="goBack();">&lt;&lt; &nbsp; Previous</a></li>
										</ul>
									</div></td>
								<td width="27%">
									<div class="extraOptions" onclick="javascript:window.print();">
										<img width="20" title="Print" src="<c:url value="/resources/img/printer.png" />"
											alt="Print">&nbsp; print
									</div> <!--<div onClick="javascript:void(0);" class="extraOptions"><img alt="Print" src="resources/img/mail.png" width="20" title="Print"></img>&nbsp; email</div>-->
								</td>
							</tr>
						</tbody>
					</table>
		   <form:form commandName="orderBean" modelAttribute ="orderBean" method="post" name="myForm" >
					<div class="optionsMainDiv">
						<div class="headerDiv">
							<div class="circledDiv"></div>
							<span><c:out value="${orderBean.stdItemDTO.stdItem}"/> -<c:out value="${orderBean.stdItemDTO.description}"/></span> <br>
							<br>

						</div>
						<div class="width100">
							<table width="100%">
								<tbody>
									<tr>
										<td width="35%">
											<div class="vehInfBorder">
												<div class="vehInf vehInfInner100">Quantity of vehicles :
<!-- 												</div> -->
<!--  												<div>  -->
													<input  type="text" class="qtyinput"   value="${orderBean.inputVehicleQuantity}"  size="3" maxlength="3" />
													
												</div>
											</div>
										</td>
										<td width="20%">&nbsp;</td>
										<td width="45%" align="right"><input type="button" class="greenDiv" value="Compare Prices" onclick="getSelectedOptions();" /></td>	
									</tr>
								</tbody>
							</table>
						</div>
						
		
                          <c:forEach items="${orderBean.stdItemOptionList}" var="stdItemOption"  varStatus="loopDetail">
						     <c:if test="${stdItemOption.optionsCategoryCode=='AREQ'}">
							     <div class="vehInfBorder">
								    <div class="vehInf vehInfInner40">Additional Requirements
									  (AREQ)
								    </div>
								    <div class="padding10">
								  	  <input type="checkbox" name ="x_${stdItemOption.optionsCategoryCode}"> <span class="code">AREQ</span> -
								       Additional Req
									  <p></p>
									  <p>Additional Requirements (AREQ) option code allows customers to request specific equipment not listed in the options above. Selection of AREQ will result in the manual processing of your order. After review of the AREQ, GSA will obtain pricing for the AREQ. AREQ should only be used for mission-related requirements. Do not use AREQ to list any of the following: 1) GSA minimum requirements, 2) manufacturer standard equipment, 3) internal agency data, or 4) vendor selection. AREQ cannot be used to request makes/models not offered in Autochoice, or to request Autochoice options already shown as not available by the manufacturer. Please list AREQ requirements concisely and include enough information for GSA to obtain valid pricing.<br>
	                                  <b> You will be required to upload a file detailing your Additional Requirements before sending the order to GSA. 
	                                  </p>
								    </div>
							     </div>
                             </c:if>	
						  </c:forEach>
						<c:set var="oldCagetoryCode"  value=""/>	
						<c:set var="typeAction"  value=""/>		
						<div class="vehInfBorder">
							<table width="100%" class="vehQtyTable">
								<tbody>
									<tr class="tableHeader">
										<th width="65%" class="leftPadding10">Check the boxes
											below to add Optional Equipment</th>
										<th width="35%" class="alignLeft">quantity of the options</th>
									</tr>
									
								   <c:forEach items="${orderBean.stdItemOptionList}" var="stdItemOption"  varStatus="loopDetail">
								      <c:if test="${stdItemOption.optionsCategoryCode!='AREQ'}">
										   <c:if test="${stdItemOption.optionsCategoryCode!=oldCagetoryCode}">
		        		 						<c:set var="oldCagetoryCode"  value="${stdItemOption.optionsCategoryCode}"/>
		        		 						<c:set var="prevRow"  value=""/>	
			        	 						<tr>
			        	 						    <td><div class="tdgreenBg">
						   					             <c:out value="${stdItemOption.optionsCategoryName}"/>
						   					           </div>
						   					        </td> 
						  						</tr>	
		        	   						</c:if>
		        	   						
		        	   						<c:set var="prevRow"  value="${prevRow == '' ? 'alternateRow' : ''}"/> 
		        	   						
		        	   						<c:set var="typeOfAction"  value="CheckBox"/>	
		        	   						<c:if test="${stdItemOption.optionsCategorySelectionType ==	 'S'}">
		        	   						   <c:set var="typeOfAction"  value="Radio"/>
		        	   						</c:if>
	
		        	   					     <tr class="${prevRow}">
		        	   						     <td class="leftPadding20"> 
		        	   						        <input  name ="x_<c:out value="${stdItemOption.optionsCategoryCode}"/>" type="<c:out value="${typeOfAction}"/>" value="${stdItemOption.option_Code}" onClick="RadioButton(this)">&nbsp;&nbsp;<span class="code"><c:out value="${stdItemOption.option_Code}"/></span><c:out value="- ${stdItemOption.optionsTableDescription}" />
												</td>
												<td class="leftPadding20">
		        	   						      <c:if test="${stdItemOption.optionsTableValidQty == 'V' ||  stdItemOption.optionsTableValidQty == 'O'}">
												    <input type="text"	name ="qty_<c:out value="${stdItemOption.option_Code}"/>"	class="input60">
												  </c:if>   
												  &nbsp;		
												</td>
											</tr>
											<c:if test="${stdItemOption.option_Code== 'DDRL'}" >
							                  <tr>
							                    <td colspan="2"> By selecting this option the Ordering agency/ Operator is excercising Governmental Privilege to exempt vehicles
							                      used for law enforcement activities from this GSA minimum requirement because the elimination  of DRLs (and 
							                      corresponding reduction in vehicle conspicuity) is critical to the agency's mission. </td>
							                  </tr>
							                </c:if>
											
									  </c:if>	
							 	 </c:forEach>
								</tbody>		
							</table>
						</div>
  					  
  					  
  					  
  					     <table class="tableWidth100">
							  <tr>
									<td align="center"><input type="button" class="greenDiv" value="Compare Prices" onclick="getSelectedOptions();" /></td>
						 	</tr>
			
						 </table>  
  					  
  					     <input type="hidden" name="optionsAndQty" id="optionsAndQty"	 values =""> 

						
<!-- 						<div class="width100 topMargin13"> -->
<!-- 							<table width="97%" class="littleMargin"> -->
<!-- 								<tbody> -->
<!-- 									<tr> -->
<!-- 										<td width="35%">&nbsp;</td> -->
<!-- 										<td width="35%" class="rightPadding105"> -->
<!-- 											<div class="simplePagination"> -->
<!-- 												<ul> -->
<!-- 													<li><a class="active"  href="javascript:;"  onclick="getSelectedOptions();">Next &nbsp; -->
<!-- 															&gt;&gt;</a></li> -->
<!-- 													<li> -->
<!-- 													  <a href="javascript:;" onclick="getSelectedOptions();">&lt;&lt; &nbsp; Previous</a></li> -->
<!-- 													 <input type="hidden" name="optionsAndQty" id="optionsAndQty"	 values =""> -->
<!-- 												</ul> -->
<!-- 											</div> -->
<!-- 										</td> -->
<!-- 										<td width="27%">&nbsp;</td> -->
<!-- 									</tr> -->
<!-- 								</tbody> -->
<!-- 							</table> -->
<!-- 						</div> -->
					</div>
				</div>
			</div>	
		</div>
	</div>
	</form:form>
	
	
	<%@ include file="includeFooter.jsp"%>
</body>