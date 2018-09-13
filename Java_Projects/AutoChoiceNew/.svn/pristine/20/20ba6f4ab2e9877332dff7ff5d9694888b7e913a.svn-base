<%@ include file = "includeTop.jsp" %>
<html>
<head>
 <%@ include file = "includeHead.jsp" %>
 <script type="text/javascript">

var  updated = false;
var  checkcopy = 0;
var  selectcopy =false;
var  buttonselected ="";
var  ctr =20;  // default table row size
var  isAddLine = false ;
function markEditRow(rownum){
   document.getElementById('fsrSavedReportList'+ rownum +'.editFlag').value = 'true';
	Update();
}


function markDelRow(elem, rownum){
	var del = elem.value;
	var ed = document.getElementById('fsrSavedReportList'+ rownum +'.delFlag').value;
	//alert(del);
	if(del == 'True'){
		document.getElementById('fsrSavedReportList'+ rownum +'.delFlag').value = 'True';
		document.getElementById('fsrSavedReportList'+ rownum +'.editFlag').value = 'False';
		//togglePanelMore('#'+rownum);
	}
	else{
		document.getElementById('fsrSavedReportList'+ rownum +'.delFlag').value = 'False';
	}
}



function Update() {
   updated = true;
return true;
}



function ActionSelected(Action,lineval) 
{
 if ( updated == true)
     document.myForm.Updated.value =true; 

if ( Action == "Save" ){
    if (updated == false) {
        alert("Sorry there is nothing to save! No changes were made.");
		return false;
    }

    updated=false; 
    document.myForm.Updated.value =false; 
}		 
	 
if ( Action == "Ignore" ){
   updated = false;
   document.myForm.Updated.value =false;
   }
	 
 buttonselected = Action;
 document.myForm.Action.value =Action; 
 document.myForm.Line_Number.value = lineval;
 document.myForm.submit();
 return false;
} 

function CheckUpdate()
{  
   if( updated == true & buttonselected != "Save")
    { alert("You have to save your changes first.Please hit the save button.");
	 return false; }

   if( updated == true)	 
      document.myForm.Updated.value =true; 

   if  (selectcopy == false & buttonselected == "*Copy")
    {
       alert("You have to check at least one line/row to proceed in copying.");
	   buttonselected ="";
       return false;
	}

   
  return true;	 
	 
}


function CheckButton(vfield)
{
 
   if (vfield.value == "Save" )
     {
       if (updated == false) 
      {
	    alert("Sorry there is nothing to save! No changes were made.");
		return false;
	  }	
	  buttonselected =vfield.value;
      if  (updated == true )
          updated=false;
     }
    if (vfield.value == "*Copy" )
	 {
	   buttonselected =vfield.value;
       if  (checkcopy > 0  )
        { selectcopy = true;
     
          document.myForm.Action.value ="*Copy"; 	
	    }
	 }	
} 


function CheckIt(vfield) {  
  var  option_name = vfield.name;
  var  oem_value = "x" + vfield.name.substring(2,vfield.name.length);

  if ((document.myForm.elements[oem_value].value == "") & (vfield.checked ==true) ){
    //  alert ("You have to enter your OEM Value first before you check it");
    // vfield.checked= false;
	// document.myForm.elements[oem_value].focus();
	} 
  else
     updated =true;	
}


function SubmitToGSA(form) {  
	var vfield  = document.myForm.elements;

    document.myForm.Action.value ="Send to GSA"; 	
	if ( CheckUpdate() == false )
	    return false;
	//for (i=0;i<vfield.length;i++) {
	//	if (vfield[i].name.charAt(0) == "x" ) {
	//		if (vfield[i].value == "" || vfield[i].value == " "  ){
	//		  alert("You have to fill up all the column under OEM data before sending it to GSA.");
	//		  return false;
	//	   }	  
	//	}
	//}
	return confirm("Are you sure you want to send it as final to GSA? Sending it to GSA won't allow you edit it anymore.You would need to make a request in case you have some adjustment.");
}
function open_window(url) { window.open(url,'1',"width=700,height=600,menu=yes,menubar=yes,scrollbars=yes")}


function checkAllBox(vfield) {
	boxes = document.myForm.ChkCopy.length;
	if ( document.getElementById('CheckAll').checked == true) {
		for (i = 0; i < boxes; i++) {
			  document.myForm.ChkCopy[i].checked =true;
		}
		$("input:hidden[name*='"+'copyFlag'+"']").attr('value', 'true');
	}
	else { 	
		for (i = 0; i < boxes; i++) {
			  document.myForm.ChkCopy[i].checked = false;
		}

		$("input:hidden[name*='"+'copyFlag'+"']").attr('value', 'false');

    }
	
 }


function checkFlagBox(vfield) {
 
		boxes = document.myForm.ChkCopy.length;
		found = false;
		for (i = 0; i < boxes; i++) {
			if (document.myForm.ChkCopy[i].checked == true) {
				found = true;
				break;
			}	
		}
	    if ( !found){
	    	alert("Please select at least one record to copy." );
	    }
	 return found;
   
 
 }
 

// for hiding row but could be use to hide other 
function togglePanelMore(id) {
	var viewContainer = $(id);
	viewContainer.hide();
}


</script>
</head>


<body>
<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeLoginBreadcrumbs.jsp"%>
		<div class="row">
			<div class="col-md-12 mainContent">
				<div class="col-md-3">
					<div class="leftDiv fsrLeftNav">
						<div class="leftDivHeader">
							<h4 class="leftDivHeading">FSR Program</h4>
						</div>
						<ul class="leftMemu parent">
							<c:forEach var="regions" items="${fsrBean.regionList }">
								<li>
									<a <c:if test="${fsrBean.region.region_Code ==regions.region_Code }">class="leftMenuActive"</c:if> href="/AutoChoice/FSRListExecute/${regions.region_Code }" title="FSR Report By Region - ${regions.regionName }">
										<c:out value="${regions.region_Code }"/>-<c:out value="${regions.regionName }"/> 
										<c:if test="${fsrBean.region.region_Code ==regions.region_Code }">
											<img border="0" alt="&gt;" alt="menu left arrow" class="bc-arrow leftArrow" src="<c:url value="/resources/img/arrow.gif" />">
										</c:if>
									</a>
								</li>
							</c:forEach>
						</ul>
					</div>
					<div class="leftDiv fsrLeftSubNav">
						<ul class="leftMemu parent">
							<li><a href="/AutoChoice/FSRReportBuilder" title="FSR Build Report link">FSR Build Report</a></li>
							<li><a href="http://www.fsrsolutions.fas.gsa.gov" title="FSR Solution Blog link" target="_blank">FSR Solution Blog</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-9">
					
					<form:form commandName="FSRReportBuilderAdmin" action="/AutoChoice/FSRReportBuilderAdmin" modelAttribute ="fsrBean" method="post" name="myForm"  id="myForm">
					<table style="width:97%;">
						<tr>
							<td style="text-align: center;"><span class="titleText">FSR Report Builder Admin</span></td>
						</tr>
						<tr>
							<td>
								<c:if test="${fn:length(fsrBean.returnMessage) > 0 }">		
									<div style="text-align:center;"><c:out value="${fsrBean.returnMessage }"/></div>
								</c:if>
							</td>
						</tr>
						<tr>
							<td>
								<div class="vehInfBorder vehInfoFixed">	
								<table id="fluidTable" class="vehQtyTable tableWidth100 tableCellPadding" summary="Table consist data on New Requisition not submited to GSA">
								    <thead>
							    	   <tr>
							              <th width="30" align="center">Report Name</th>
							              <th width="120">Access</th>
							        	  <th width="40">Delete?</th>
							           </tr>
								    </thead>
								    <tbody>
							        	<c:forEach var="item" items="${fsrBean.fsrSavedReportList}" varStatus="status">						
											<tr id="${status.index}"  class="${ctr % 2 == 0 ? 'even' : 'odd'}">
											  <td>
											       ${item.reportNumber}
											  </td>
											  <td>
											  		<select id="fsrSavedReportList[${status.index}].privilege" name="fsrSavedReportList[${status.index}].privilege" title="privilege select"  onChange="markEditRow(${status.index})">
											   			<option value="P" <c:if test="${item.privilege =='P'}">selected </c:if>>Personal</option>
											   			<option value="S" <c:if test="${item.privilege =='S'}">selected </c:if>>Share</option>
										   			</select>
								  			   </td>
											   <td>
											   		<select id ="ChkDelete" name="ChkDelete" onchange="markDelRow(this, ${status.index});" title="delete this row select">
											   			<option value="False">False</option>
											   			<option value="True">True</option>
											   		</select>											   		
											   </td>
											</tr>											
							    			<c:set var="ctr"  value="${ctr+1}"/>	
											<form:input type="hidden" path="fsrSavedReportList[${status.index}].delFlag"  value="${item.delFlag}"/>
						 					<form:input type="hidden" path="fsrSavedReportList[${status.index}].editFlag"  value=""/>
						 					<form:input type="hidden" path="fsrSavedReportList[${status.index}].id"  value="${item.id}"/>
									   </c:forEach>
									   <tr>
							           		<td align="center" class="paddingR5" colspan="4">							                  
							                    <div align="center">
							                    <input type="submit"  name="action" id="action" value="Save" title="Save button" class="greenDiv">
							                    &nbsp;  &nbsp;  
							                    <input type="submit"  name="action" id="action" value="Ignore Changes"  title="Ignore Changes button" class="greenDiv"> 
							                    <input type="submit"  name="action" id="action" value="Back to Report Builder"  title="Back to Report Builder button" onclick = "javascript:document.location='/AutoChoice/FSRReportBuilder'" class="greenDiv"> 
							                    </div>							                  
							                </td>							                  
							           </tr> 
						    		</tbody>						            
								</table><!--End Grid Detail-->			
								</div>											
							</td>
						</tr>
					</table>
					</form:form>
	</div>
	</div>
	</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
</body>
</html>