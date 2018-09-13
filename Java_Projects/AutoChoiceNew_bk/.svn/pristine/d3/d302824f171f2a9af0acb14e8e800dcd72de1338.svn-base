<%@ include file="includeTop.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="includeHead.jsp"%>
</head>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

  

<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.elevatezoom.js"/>"></script>




<script >

 function openwindow(contract,schline,model,stditem) {
	   var urlpath ="";
		  urlpath='uploadfileviewer.cfm?'+'Contract='+ contract+ '&Sch_Line='+schline+'&Model='+model+'&Std_Item='+stditem ; 
		  window.open(urlpath,'mywindow','width=900,height=600'); 
	}
	

function open_window(url) 
{ 
  window.open(url,'1',"width=700,height=600,menu=yes,menubar=yes,scrollbars=yes resizable=yes");
}


function Validate(currentRow,recordCount,contract,schline,stdItem)
{
    var  ret = true;
	var ans = true;

	document.getElementById('contrLineDTO.contract').value = contract;
	document.getElementById('contrLineDTO.sch_Line').value = schline;
	document.getElementById('contrLineDTO.currentRow').value = currentRow;    // use for lowest price
	document.getElementById('contrLineDTO.recordCount').value = recordCount;  // use for lowest price

	
	 if ((trim(stdItem) == " 11A") || (trim(stdItem) == " 11B"))
	       ret = confirm("Reminder: Federal Procurement Manager Regulation (FPMR) : The Contracting Officer of GSA Automotive must advise that in accordance with Section 102-34.45 of the Federal Management Regulations a written justification is needed to acquire Class IV vehicles-Large Sedan . You are required to provide a written justification signed by the appropriate approving agency official that describes how a Midsize Sedan or smaller vehicle will not meet your mission and the mission the Class IV will be used for before the order is finalized by GSA. A copy of the approved justification must also be maintained in your agency file.All orders placed under Autochoice are subject to IG review." );
		   
//	  if (( Count != Current_Count)  & ( ret == true)) {
//		  ans= confirm("Federal Acquisition Requirement (FAR) : The Contracting Officer must remind all ordering agencies that FAR Part 16.505 requires a written //justification when the lowest price vehicle as equipped is NOT selected.The best value justification is required to be included in your records as your order is //subject to IG Review.");


	    //Action = Action +"&FairOpportunity=false";
//	  }	 
//	  else
	   // Action = Action +"&FairOpportunity=true";
	   
//	  if (ans == false)
//	    return false;
	 
	  document.myForm.submit();
	  return ret;
}

function ValidateXXX(Std_Item,Count,Current_Count,Action)
{
  var  ret = true;
  var ans = true;
  var list = document.myForm.Fair_Opportunity;
 
  if( list.options[list.selectedIndex].value == '') 
    { alert("Please select one option from Fair Opportunity!");
           document.myForm.Fair_Opportunity.focus();
      return false;
  } 
  document.myform1.Fair_Opportunity.value  = document.myForm.Fair_Opportunity.value;
 
  if ((Std_Item == " 11A") || (Std_Item == " 11B"))
       ret = confirm("Reminder: Federal Procurement Manager Regulation (FPMR) : The Contracting Officer of GSA Automotive must advise that in accordance with Section 102-34.45 of the Federal Management Regulations a written justification is needed to acquire Class IV vehicles-Large Sedan . You are required to provide a written justification signed by the appropriate approving agency official that describes how a Midsize Sedan or smaller vehicle will not meet your mission and the mission the Class IV will be used for before the order is finalized by GSA. A copy of the approved justification must also be maintained in your agency file.All orders placed under Autochoice are subject to IG review." );
	   
  if (( Count != Current_Count)  & ( ret == true)) {
//	  ans= confirm("Federal Acquisition Requirement (FAR) : The Contracting Officer must remind all ordering agencies that FAR Part 16.505 requires a written //justification when the lowest price vehicle as equipped is NOT selected.The best value justification is required to be included in your records as your order is //subject to IG Review.");


    Action = Action +"&FairOpportunity=false";
  }	 
  else
    Action = Action +"&FairOpportunity=true";
   
  if (ans == false)
    return false;
  document.myForm.action = Action;	
  document.myForm.submit();
  return ret;
  
}
</script>



<style>
#preview {
	position: absolute;
	border: 1px solid #ccc;
	background: #333;
	padding: 5px;
	display: none;
	color: #fff;
}
</style>

<body > 
 	<div id="bodyContent">

		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<%@ include file="includeLeftmenu.jsp"%>
				<div class="col-md-9">
					<%@ include file="includePagenav.jsp"%>

 <table class="tableWidth97">
  <tr>
   <td colspan="6">
 <div class="requirementsMainDiv" >
 <div class="headerDiv">
 <div class="circledDiv"></div>
 	<span><c:out value="${orderBean.stdItemDTO.stdItem}"/> -<c:out value="${orderBean.stdItemDTO.description}"/></span> <br>
     <br/>
 </div>
  <br/>
  <input type="button" class="greenDiv floatRight" value="Start a New Compare">
 <br/><br/>
 <table  class="compareVehiclesTable  tableWidth100" summary="This table contains data on the gasolin use per milage.">
	 <tr>
	<td colspan="8" class="nopadding">
	<div class="vehInf vehInfInner40">MPG and g Co/mile Comparison <img alt="leaf" src="<c:url value="/resources/img/glyphicons_001_leaf.png"/>" /></div>
	</td> 
	 </tr>
	 
	<tr class="lightBlueBg">
	<td width="21%">Vehicle Model</td>
	  <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	
	    <td colspan="2" width="23%"> <c:out value="${contractAvailable.contrLineDTO.modelDescripton}"/>
	    </td>
	  </c:forEach>
	    
	</tr>
	
	<tr class="lightBlueBg">
	<td>Base/Options</td>
	  <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	   <td>MPG</td>
	   <td>gC02/mile</td>
	  </c:forEach>
	</tr> 
	
	
	<tr>
	<td>Base Model</td>
	  <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	    <td><c:out value="${contractAvailable.contrLineDTO.mpgB}"/>/<c:out value="${contractAvailable.contrLineDTO.mpgC}"/>/<c:out value="${contractAvailable.contrLineDTO.mpgH}"/></td>
	     <td><c:out value="${contractAvailable.contrLineDTO.gramsPerMile}"/></td>
	   </c:forEach>
	</tr>
   
     <c:set var="mpgFlag" value ="false"/> 
     <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	       <c:forEach items="${contractAvailable.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  varStatus="loopDetail">
	              <c:if test="${contrLineOptCheckDTO.mpgFlag == 'Y'}">
	                 <c:set var="mpgFlag" value ="true"/>
	              </c:if>
		   </c:forEach>
	 </c:forEach>

   <c:if test ="${mpgFlag =='true'}">
       <c:set var="firstRow" value ="false"/>
	   <tr>
			      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
			           <c:set var="found" value ="false"/>
				       <c:forEach items="${contractAvailable.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  varStatus="loopDetail">
			              <c:if test="${contrLineOptCheckDTO.mpgFlag == 'Y'}">
			                    <c:if test="${firstRow == 'false'}">
				                    <td><c:out value="${contrLineOptCheckDTO.option_Code}"/></td>
				                     <c:set var="firstRow" value ="true"/>
		                        </c:if>
		                        <c:set var="found" value ="true"/>
		                         
							    <td><c:out value="${contrLineOptCheckDTO.mpgB}"/>/<c:out value="${contrLineOptCheckDTO.mpgC}"/>/<c:out value="${contrLineOptCheckDTO.mpgH}"/></td>
							    <td><c:out value="${contrLineOptCheckDTO.gramsPerMile}"/></td>
						   </c:if>
						</c:forEach>
						<c:if test ="${(found == 'false') &&  (firstRow =='true')}">
						    <td colspan="2"> &nbsp; </td>
						</c:if>
		   	      </c:forEach>
		</tr>
   </c:if>
 



	<tr>
	<td> 50-State Emissions <BR/> Certified Engine</td>
	  <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	    <td><c:out value="${contractAvailable.contrLineDTO.state50}"/></td>
	     <td>&nbsp;</td>
	   </c:forEach>
	</tr>

</table>
 
 </div>
 </td>
 </tr>
 </table>
  <br/>

 <DIV ID="dek"></DIV> 
 	  <script type="text/javascript" 
		src="<c:url value="/resources/js/picture.js"/>"></script>
  
<form:form commandName="orderBean" modelAttribute ="orderBean" method="post" name="myForm"  >

 <table class="compareTable tableWidth97" summary="This table consist data comparison of the cars models.">
 <tr>
   <td class="lightBlueBg topleftradius" width="15%">Manufacturer</td>
   <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center" width="12%">
         <div class="compareHeader"><c:out value="${contractAvailable.contrLineDTO.manufacturerName}"/>
         	<c:if test="${contractAvailable.contrLineDTO.afvFlag ==	 'Y'}">
                  <c:url value="/resources/afv.png"/>
            </c:if>
         </div>
      </td>
   </c:forEach>
 </tr>
 <tr>
   <td class="lightBlueBg">Model Picture</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center">
    	  	<div style="position: relative; width: 170px; height: 130px;">
<%--  		  <a 	 href="<c:url value ="${orderBean.mainPics}"/><c:url value ="${contractAvailable.contract}"/>/<c:url value ="${contractAvailable.fileNamePicture}"/>"  onClick="openwindow('BA010','8C.1','ELANTRA','  8C');" class="preview" style="border: none; top: 0"> --%> 
<%--           <img src="<c:url value ="${orderBean.thumbNails }"/><c:url value ="${contractAvailable.contract}"/>/<c:url value ="${contractAvailable.fileNamePicture}"/>" width="80" height="60"> --%> --%>
          <img src="<c:url value ="${orderBean.thumbNails }"/><c:url value ="${contractAvailable.contrLineDTO.contract}"/>/<c:url value ="${ contractAvailable.contrLineDTO.fileNamePicture}"/>" width="80" height="60"  style='cursor:pointer;cursor:hand' ONMOUSEOVER="popup('<c:url value ="${orderBean.mainPics}"/><c:url value ="${contractAvailable.contrLineDTO.contract}"/>/<c:url value ="${contractAvailable.contrLineDTO.fileNamePicture}"/>','brown');" ONMOUSEOUT="kill();" onClick="openwindow('BA010','8C.1','ELANTRA','  8C');">  

<%--           </a>     ---%>
	    </div>
       
      
<!--          <div>    -->
<%--             <img src="<c:url value ="${orderBean.thumbNails }"/><c:url value ="${contractAvailable.contrLineDTO.contract}"/>/<c:url value ="${ contractAvailable.contrLineDTO.fileNamePicture}"/>" width="80" height="60"  style='cursor:pointer;cursor:hand' ONMOUSEOVER="popup('<c:url value ="${orderBean.mainPics}"/><c:url value ="${contractAvailable.contrLineDTO.contract}"/>/<c:url value ="${contractAvailable.contrLineDTO.fileNamePicture}"/>','brown');" ONMOUSEOUT="kill();" onClick="openwindow('BA010','8C.1','ELANTRA','  8C');">  --%> 
<%--            <img id="${contractAvailable.contrLineDTO.fileNamePicture}" src="<c:url value ="${orderBean.thumbNails}"/><c:url value ="${contractAvailable.contrLineDTO.contract}"/>/<c:url value ="${ contractAvailable.contrLineDTO.fileNamePicture}"/>" data-zoom-image="${orderBean.thumbNails}${contractAvailable.contrLineDTO.contract}" onMouseOver="enlargeImage(this.id)">  --%>

<!--          </div> -->
       </td>  
   </c:forEach>
 </tr>
 
 

 <tr> 
   <td class="lightBlueBg">Model</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center">
		<c:out value="${contractAvailable.contrLineDTO.modelDescripton}"/>
      </td>
   </c:forEach>
 </tr>

 <tr>
   <td class="lightBlueBg">Model Year</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center">
		<c:out value="${contractAvailable.contrLineDTO.modelYYYY}"/>
      </td>
    </c:forEach>
 </tr>
 
 <tr>
 <td class="lightBlueBg">Additional Information</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center">
		<c:out value="${contractAvailable.contrLineDTO.description}"/>
      </td>
   </c:forEach>
 </tr>

 <c:if test = "${commonBean.userAccount.flg1122 =='Y'}" >
	<tr>
	 <td class="lightBlueBg">Program 1122</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
	      <td align="center">
             <c:choose> 
                   <c:when test="${contractAvailable.contrLineDTO.flag1122=='Y'}">
			           Yes
			       </c:when>
			       <c:otherwise>
			          No
			       </c:otherwise>
			 </c:choose>             
	      </td>
	   </c:forEach>
	 </tr>
</c:if>

<tr>
 <td class="lightBlueBg">Shipment Days</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="center">
		<c:out value="${contractAvailable.totShipDays}"/>
      </td>
   </c:forEach>
 </tr>


 <tr>
 <td class="lightBlueBg">Base Price $ <font class="lightBlueText">(A)</font></td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
      <td align="right">
        <fmt:formatNumber var="currUnitPrice" type="number" pattern="###,###,##0.00" value="${contractAvailable.contrLineDTO.currUnitPrice}"/>
		<c:out value="${currUnitPrice}"/>
      </td>
   </c:forEach>
 </tr>
  <tr>
 <td class="lightBlueBg2" ><font class="blueText">+</font> Vehicle Options</td>
<td colspan="">&nbsp;</td>
 </tr>


 <c:forEach items="${orderBean.collisionOptionInputList}" var="input"  >
    <c:if test="${input.validQty !='O'}"> 
	     <tr class="grayBg">
		    <td class="blueText">
		 	      <span data-toggle="tooltip" data-placement="top" class="popup"  title="${input.description}">
		            <c:out value="${input.option_Code}"/>
		          </span>
	        </td>
	
		      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
			
			          <c:forEach items="${contractAvailable.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  varStatus="loopDetail">
			                  
			                <c:if test="${input.option_Code == contrLineOptCheckDTO.option_Code}">  
						      	     <td class="amountSec">
								  	        <c:choose>
									  	           <c:when test="${contrLineOptCheckDTO.oemptionType == 'N/A'}">
									  	               <c:out value="${contrLineOptCheckDTO.oemptionType}"/>  <%--  N/A is the value  --%>
									  	           </c:when>
									  	           <c:otherwise>
									  	              <fmt:formatNumber var="unitPrice" type="number" pattern="###,###,##0.00" value="${contrLineOptCheckDTO.unitPrice}"/>
										  	               <c:out value="${unitPrice}"/>
									  	           </c:otherwise> 	  	        
								  	        </c:choose>
													  	        
							            </td>
			                 </c:if>
				        </c:forEach>
		        </c:forEach>   
	        </tr>
	  </c:if>	
</c:forEach>

 <tr>
 <td class="lightBlueBg">Additl Required Vehicle <font class="lightBlueText">(B)</font></td>
  
       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totAdditionalReqPrice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
    
  
 </tr>
 <tr>

 <td class="lightBlueBg">Total Vehicle Options <font class="lightBlueText">(C)</font></td>
       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totVehicleOptionPrice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 </tr>

 <tr>
 <td class="lightBlueBg"><font class="lightBlueText">=</font>Subtotal Unit Price <font class="lightBlueText">(A+B+C)</font></td>
       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.subTotUnitPrice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 
 </tr>
<tr>
     <td class="lightBlueBg">Quantity <font class="lightBlueText">(D)</font></td>
       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###" value="${contractAvailable.vehQty}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 
 </tr>
 <tr>
       <td class="lightBlueBg"><font class="lightBlueText">=</font>Sub- Totals <font class="lightBlueText">(A+B+C)*D</font></td>

       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.subTotalBeforeOrderOption}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
</tr> 


 <tr>
 <td class="lightBlueBg"><font class="lightBlueText">+</font> Order Options</td>
 </tr>
 <c:forEach items="${orderBean.collisionOptionInputList}" var="input"  >
    <c:if test="${input.validQty =='O'}"> 
	     <tr class="grayBg">
		    <td class="blueText">
		 	      <span data-toggle="tooltip" data-placement="top" class="popup"  title="${input.description}">
		            <c:out value="${input.option_Code}"/> x <c:out value="${input.quantity}"/>
		          </span>
	        </td>
	
		      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
			
			          <c:forEach items="${contractAvailable.contrLineOptCheckDTOList}" var="contrLineOptCheckDTO"  varStatus="loopDetail">
			                  
			                <c:if test="${input.option_Code == contrLineOptCheckDTO.option_Code}">  
						      	     <td align="right">
								  	        <c:choose>
									  	           <c:when test="${contrLineOptCheckDTO.oemptionType == 'N/A'}">
									  	               <c:out value="${contrLineOptCheckDTO.oemptionType}"/>  <%--  N/A is the value  --%>
									  	           </c:when>
									  	           <c:otherwise>
									  	              <fmt:formatNumber var="unitPrice" type="number" pattern="###,###,##0.00" value="${contrLineOptCheckDTO.unitPrice}"/>
										  	               <c:out value="${unitPrice}"/>
									  	           </c:otherwise> 	  	        
								  	        </c:choose>
													  	        
							            </td>
			                 </c:if>
				        </c:forEach>
		        </c:forEach>   
	        </tr>
	  </c:if>	
</c:forEach>

 <tr>
 <td class="lightBlueBg">Total Order Options $ <font class="lightBlueText">(E)</font></td>
       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
        <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totalOrderOptionsPrice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 </tr> 
 <tr>
   <td class="lightBlueBg"><font class="lightBlueText">=</font> Total Price <font class="lightBlueText">((A+B+C)*D)+E</font></td>

       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totalPriceBeforeSC}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 
 </tr>
  
 <tr>
 <td class="lightBlueBg"><font class="lightBlueText">+</font> GSA Surcharge</td>

       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totsurcharge}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>

 </tr>
  <tr>
 <td class="lightBlueBg"><font class="lightBlueText">=</font> Total Selling Price <font class="lightBlueText">(F)</font></td>

       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.totalSellingPrice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>

 </tr> 
 <tr>
 <td class="lightBlueBg2">Unit Selling Price  $ <font class="lightBlueText"> (F/C)</font></td>

       <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
         <fmt:formatNumber var="temp" type="number" pattern="###,###,##0.00" value="${contractAvailable.unitSellingPRice}"/>
         <td align="right"><c:out value="${temp}"/></td>
       </c:forEach>
 </tr>
 
 <tr>
      <td  class="noBorder">&nbsp;</td>
      <c:forEach items="${orderBean.compareBeanList}" var="contractAvailable"  varStatus="loopDetail">
 			<td align="right"><input type="button" class="greenDiv" value="Select Model"  onClick="javascript: return Validate(${loopDetail.index},${contractAvailable.contrLineDTO.recordCount},'${contractAvailable.contrLineDTO.contract}','${contractAvailable.contrLineDTO.sch_Line}','${contractAvailable.contrLineDTO.stdItem}');"/></td>
	   </c:forEach>
			<form:input type ="hidden" path ="contrLineDTO.contract"  value =""/>
			<form:input type ="hidden" path ="contrLineDTO.sch_Line"  value =""/> 
			<form:input type ="hidden" path ="contrLineDTO.currentRow"  value =""/>
			<form:input type ="hidden" path ="contrLineDTO.recordCount"  value =""/> 


</tr>
 </table>
 
 </form:form>
			</div>
				</div>
			</div>
		</div>

	<%@ include file="includeFooter.jsp"%>
</body>


<script type="text/javascript">
	var menu=new menu.dd("menu");
	menu.init("menu","menuhover");
	function enlargeImage(imgId){
		$("#"+imgId).elevateZoom({zoomWindowPosition: 10});
		  }
</script>



<script src="<c:url value="/resources/js/tooltip.js"/>"></script>
<script>
$('.popup').tooltip();
</script>
