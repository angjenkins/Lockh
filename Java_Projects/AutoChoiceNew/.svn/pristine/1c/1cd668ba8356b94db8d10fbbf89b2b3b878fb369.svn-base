
<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
</head>

<script>
function Validate(Std_Item)

 {  
   if ((trim(Std_Item) == "11A") || (trim(Std_Item) == "11B"))
       return confirm("Reminder: Federal Procurement Manager Regulation (FPMR) : The Contracting Officer of GSA Automotive must advise that in accordance with Section 102-34.45 of the Federal Management Regulations a written justification is needed to acquire Class IV vehicles-Large Sedan . You are required to provide a written justification signed by the appropriate approving agency official that describes how a Midsize Sedan or smaller vehicle will not meet your mission and the mission the Class IV will be used for before the order is finalized by GSA. A copy of the approved justification must also be maintained in your agency file.All orders placed under Autochoice are subject to IG review.");
  }




function doQuickSelect() {
    if (document.getElementById('stdItemQuickSelection').value.length > 0){
 	    document.getElementById('stdItemDTO.stdItem').value = document.getElementById('stdItemQuickSelection').value;
 	    document.myForm.submit();
    }
}

function doStdItem(stdItem) {
 	    document.getElementById('stdItemDTO.stdItem').value = stdItem;
 	    //document.getElementById('Next').click();
 	    document.myForm.submit();
    
}

</script>

<body>
    <form:form commandName="orderBean" modelAttribute="orderBean" method="post"  name="myForm"  action="/AutoChoice/StdItem">
	
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
	 
		<div class="row">
			<div class="col-md-12 mainContent">
				<%@ include file="includeLeftmenu.jsp"%>
			  <div class="col-md-9">

	 	    	 	<div id="quick-selection">
						<h3>Quick Selection</h3>


					     <select class="dropDown" id="stdItemQuickSelection" name="stdItemQuickSelection"  >
						   	               <option value=""></option>
				 					           <c:forEach items="${commonBean.stdItemQuickSelectionList}" var="selectItem" >
						   					        <option value="${selectItem.stdItem}"> ${selectItem.stdItemDesc} </option> 
						   					   </c:forEach>
			            </select>&nbsp;&nbsp;&nbsp;&nbsp;<input name="action1" type="submit" value="Go" class="goBtn" onClick ="doQuickSelect()">
				
					</div>
	
                   <div class="littleMargin borderaround">  
						<div class="headingRow">
						
						   <div class="vehInf vehInfInner100 padding35"><span>${orderBean.vehDescription}</span></div>
				  	   </div>
						    
				        <div class="vehInfBorder lesstopmargin" >
				            <table class="vehQtyTable tableWidth100" summary="Table summary vechicle">
							    <tbody>
									<tr class="tableHeader">
								        <th width="5%">Std Item</th>
								         <th width="60%" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Description</th>
			      					</tr>
			
							         <c:forEach items="${orderBean.stdItemList}" var="selectItem" varStatus="loopDetail" >
									
										    <tr class="${loopDetail.index % 2 == 0 ? 'alternateRow' : ''}">
												<td align="center">					
			 									   <a href="/AutoChoice/Minimum/<c:out value="${selectItem.stdItem}"/>" onclick="javascript: return Validate('${selectItem.stdItem}');">${selectItem.stdItem}</a>&nbsp; &nbsp; 
												</td>
												<td align="left">					
			 									   <a href="/AutoChoice/Minimum/<c:out value="${selectItem.stdItem}"/>" onclick="javascript: return Validate('${selectItem.stdItem}');">${selectItem.description}</a>&nbsp; &nbsp; 
												</td>
												
									 		  </tr>
									  </c:forEach>
									 	  
						       </tbody>
			  			    </table>
						</div>
	        	  </div>  <!--  class="littleMargin borderaround   -->
   	      </div>  <!-- class="col-md-9" -->
	</div>  <!--class="col-md-12 mainContent" --> 
</div>  <!--class="row" -->

<br/><br/>
	
	<form:input type="hidden" path="stdItemDTO.stdItem" id ="stdItemDTO.stdItem"/>
</form:form>
	<%@ include file="includeFooter.jsp"%>
</body>	