<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script type="text/javascript">
   var mupdated = false;
   var mctr=1;
   var selectedreport = false;

   function WindowName() {
     window.name = "Main";
   }
   function Validate(vfield) {
       if (vfield.name == 'caseFrom' && document.myForm.caseTo.value =="")
         document.myForm.caseTo.value = vfield.value ;
       if (vfield.name == 'dateFrom' && document.myForm.dateTo.value =="" )
         document.myForm.dateTo.value = vfield.value ;
   }
   function Updated(vfield,rowNumber)
	{ 
      var temp ="";
      mupdated = true;

      if (vfield.checked  == true ) {
         vfield.value = vfield.value +'~'+mctr+'';
         temp ="x_"+vfield.name;
         eval("document.myForm."+temp+".value="+mctr);
         mctr = mctr + 1;  }

      else {
         if (vfield.checked  == false )  {
             temp ="x_"+vfield.name;
              eval("document.myForm."+temp+".value=''");
          }
      }

 	  document.getElementById('reportBuilderList'+ rowNumber +'.editFlag').value = 'true';
 	  document.getElementById('reportBuilderList'+ rowNumber +'.sequence').value = mctr;
 	 
      
//      if ( selectedreport == true ) {
//            selectedreport == false; 

//           for( var i=0, limit=document.myForm.x_SavedReport.options.length; i < limit; ++i )
//         	{
//    	       if( document.myForm.x_SavedReport.options[i].value=="Select One" )
//  			       document.myForm.x_SavedReport.options[i].selected=true;
//        	}
	//      }      
    }

   function submitform(action) {
	   	if (action == "Insert") {
	          document.myForm.target ="_self"; 
	          document.myForm.action.value ="Insert";  //default
	 		  if ( ReportButton() == true ) {
	   	     	  document.getElementById("myForm").submit();
		       }
		}	  
	    else {		
	         if(checkDates()){
	         	document.myForm.target ="myNewWin";
	         	document.myForm.action.value ="Process";
	         	document.getElementById("myForm").submit();
	         }
		}			
   }

   function checkDates(){
	   	var dateFromString = document.getElementById("dateFrom").value.trim();
		var dateToString = document.getElementById("dateTo").value.trim();
		var dateTypeString = document.getElementById("dateType").value.trim();
		if(dateFromString.length < 1 ){
			alert("Date From is required to send the request.");
			document.getElementById("dateFrom").focus();
			return false;;
		}
		if(dateToString.length < 1 ){
			alert("Date To is required to send the request.");
			document.getElementById("dateTo").focus();
			return false;
		}
		if(dateTypeString.length < 1 ){
			alert("Date Type (Order or Shipment) is required to send the request.");
			document.getElementById("dateType").focus();
			return false;
		}
		return true;
	}

   function ReportButton() {
     if (document.myForm.x_querytitle.value =="")  {
         alert("You have to enter a valid name for your report to be saved.");
         return false;

      }

      if (document.myForm.x_querytitle.value ==document.myForm.x_SavedReport[document.myForm.x_SavedReport.selectedIndex].text)   {
          if (confirm("You will be overwriting this existing query,are you sure about it?") == false)
             return false;
          else
               document.myForm.x_pageAction.value ="Update";
          
      }


    return true;            
   
   
   }



   function CheckUpdate1()
   {
   
     if  (document.myForm.x_Proceed.value =="Admin") {
          window.location = "vehicletype.cfm";
          return false;
     }

      if (CheckBoxesChecked() == false) {
        alert("You have to select at least one column to proceed.");
  	   return false; 
      } 
      if (CheckDuplicate(this) == false)
  	   return false; 
        
      return true;	 
     
   }
   
  

   function  CheckBoxesChecked() 
   {
    var TotalBoxes = 0;
    var TotalOn = 0;
    for (var i=0;i<document.myForm.elements.length;i++) {
         var e = document.myForm.elements[i];
         if (e.type=='checkbox') {
           TotalBoxes++;
            if (e.checked) {
                 TotalOn++;
            }
       
          }
     }
   if  (  TotalOn == 0)
       return false;
   return true;
  }

	function sendme() 
	{ 
	    window.open("","myNewWin","width=400,height=200,toolbar=0"); 
	    var a = window.setTimeout("document.myForm.submit();",400); 
	} 
	
	function CheckDuplicate(vfield) {
	       var numOfElements = document.myForm.elements.length;
	       var mynumber=new Array();
	       var  counter =0; 
	      // making sure it has asssign sequence number when selected 
	        for(i=0;i< numOfElements;i++) {
	          temp ="";
	          mvalue=""; 
	          var e = document.myForm.elements[i];
	
	          if (e.type=='checkbox') {
	            if (e.checked) {
	                temp ="x_"+e.name;
	                mvalue= eval("document.myForm."+temp+".value");
	                if ( mvalue == "") {
	                   alert("You have to assigned a sequence number to your column selection.");
	                   return false;
	                }
	             }  
	            }    
	          }
	
	
	
	
		   for(i=0;i< numOfElements;i++) {
		    vfield = document.myForm.elements[i].name;
				if ((vfield.substring(0,2) == 'x_')  && (myForm.elements[i].value != "")) {
	                mynumber[counter]=document.myForm.elements[i].value; 
	                counter ++;
				 } 
	       }  
	
		   for(i=0;i<mynumber.length-1;i++) { 
			   for(j=i+1;j < mynumber.length;j++) {
						  if (mynumber[i]== mynumber[j])  
						    { alert("You cannot have duplicate "+ mynumber[i] + " number in the series!");
							   return false;
							}  
		        }             
	            
		           
	        }
	 return true;
	}
	
	 $("#Requistion_Number").click(function (e) {
	 	   alert("hi");
	  }).click();
	
	
	 function SaveReport(vfield) {
	       mctr =1
	       var numOfElements = document.myForm.elements.length;
	       var myfield = new Array();
	       var counter = 0; 
	       var  temp = "";
	       
	       selectedreport = true;
	       // reset the value first
	       document.myForm.x_querytitle.value = document.myForm.x_SavedReport[document.myForm.x_SavedReport.selectedIndex].text;
	
	       //reset here
	       for(j=0;j< numOfElements;j++) {
	  	              e = document.myForm.elements[j];
	                  if ((e.name != 'x_status') && (e.type=='checkbox')) {
	                      e.checked =false;
						  temp ="x_"+e.name;
				          eval("document.myForm."+temp+".value=''");
	                  }       
	       }
	
	       // fill the form
	       myfield = vfield.value.split(',');
	
	      if (vfield.value != 'Select One') {
			   for(i=0;i< myfield.length;i++) {
					for(j=0;j< numOfElements;j++) {
						  e = document.myForm.elements[j];
						  if ((e.name != 'x_status') && (e.type=='checkbox')) {
							   if (e.name == myfield[counter] )  {
								  e.checked =true;
								  temp ="x_"+e.name;
								  eval("document.myForm."+temp+".value="+mctr);
								  temp ="y_"+e.name;
								  temp = document.getElementById(temp).value;
								  document.getElementById('reportBuilderList'+ temp +'.editFlag').value = 'true';
							 	  document.getElementById('reportBuilderList'+ temp +'.sequence').value = mctr;
							   }
						   }       
					 }
					
					counter++;
					mctr++;
				 }
	       }  
	   
	}
 

	 function markEditRow(rownum){
	  	  document.getElementById('reportBuilderList'+ rownum +'.editFlag').value = 'true';
	 } 

	$(function() {
		$( "#dateFrom" ).datepicker({
			dateFormat : "mm/dd/yy",
			defaultDate: "+1w",
			changeMonth: true,
			changeYear: true,
			numberOfMonths: 1,
			minDate: new Date("January 01, 2000"),
			onClose: function( selectedDate ) {
				$( "#dateTo" ).datepicker( "option", "minDate", selectedDate );
			}
		});
		$( "#dateTo" ).datepicker({
			dateFormat : "mm/dd/yy",
			defaultDate: "+1w",
			changeMonth: true,
			changeYear: true,
			numberOfMonths: 1,
			minDate: new Date("January 01, 2000"),
			onClose: function( selectedDate ) {
				$( "#dateFrom" ).datepicker( "option", "maxDate: 0D", selectedDate );
			}
		});
	});
	</script>
    <!-- End of Date Picker -->


	<style>
		div.ui-datepicker{
		 font-size:10px;
		}
	</style>
	
</head>
<body>
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<%@ include file="includeMenu.jsp"%>
		<%@ include file="includeBreadcrumbs.jsp"%>
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
							<li>FSR Build Report</li>
							<li><a href="http://www.fsrsolutions.fas.gsa.gov" title="link to solution blog" target="_blank">FSR Solution Blog</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-9">
      				<form:form commandName="FSRReportBuilder" action="/AutoChoice/FSRReportBuilder" modelAttribute ="fsrBean"  method="post" name="myForm" id="myForm">
						<div class="vehInfBorder">
						 <table cellpadding="4" class="littleMargin tableWidth97">
						 	<tr>
						 		<td style="text-align: center;" colspan="2">
						 			<span class="titleText">FSR Report Builder</span>
						 		</td>
						 	</tr>
						 	<c:if test="${fn:length(fsrBean.returnMessage) > 0}">
						    	<tr>
									<td colspan="2" align="center"><span class="red"><c:out value="${fsrBean.returnMessage}" escapeXml="False"/></span></td>
								</tr>
						    </c:if>
						 	<tr>
						 		<td colspan="2">
						 			<div class="requirementsMainDiv" >
						 			<table  class="compareVehiclesTable tableWidth100 boldFont">
						 				<tr>
									      	<td style="width:50%;">
									        	<strong> <label for="x_SavedReport">Select From Previous Saved Report</label></strong><br>
									        	<select id="x_SavedReport" name="x_SavedReport" title="list of previously saved reports"  onChange="SaveReport(this)" >
										         <c:choose>   
										            <c:when test ="${fsrBean.reportSelected != ''}" >
										   				<c:forEach items="${fsrBean.fsrSavedReportList}" var="selectItem" >
											   					<option value="${selectItem.fieldNames}" title="${selectItem.fieldNames}" <c:if test="${selectItem.fieldNames == fsrBean.reportSelected}">selected</c:if>><c:out value="${selectItem.reportNumber}" /></option>
										   				</c:forEach>
										            </c:when>
										            <c:otherwise>
											   		    <option value ="Select One" selected>Select One </option>
										   				<c:forEach items="${fsrBean.fsrSavedReportList}" var="selectItem" >
											   					<option value="${selectItem.fieldNames}" title="${selectItem.fieldNames}"><c:out value="${selectItem.reportNumber}" /></option>
										   				</c:forEach>
										            </c:otherwise>   
										         </c:choose>	
										         </select>					
										         
										         <c:if test="${! empty fsrBean.fsrSavedReportList}" >
										            &nbsp;&nbsp;<a href="/AutoChoice/FSRReportBuilderAdmin">Manage Saved Report</a>
										         </c:if>   						
									       </td>
									       <td  style="width:50%">
									       		<strong><label for="builderRegionList">Region:</label></strong><br>
									       		<form:select multiple="true"  id="builderRegionList" path="builderRegionList" items="${fsrBean.regionList}" itemValue="region_Code" title="region list" itemLabel="regionName">
													<form:option value="" label="---Please Select---" title=""/>
												</form:select>
									       		<!-- 
									       		<form:select  multiple="true" path="builderRegionList">
													<form:option value="" label="---Please Select---"/>
													<form:options items="${fsrBean.regionList}" itemValue="region_Code" itemLabel="regionName" /> 
												</form:select>
												 -->
									       </td>
									    </tr>						    
									    <tr>
									       <td>
									       		<strong><label for="dateType">Date Type:</label></strong><br>
									       		<input type="radio" name="dateType" id="dateType" value="order" title="select date type - order" <c:if test="${fn:length(fsrBean.dateType) < 1 || fsrBean.dateType == 'order' }">checked</c:if> >Order<br>
									       		<input type="radio" name="dateType" id="dateType" value="shipment" title="select date type - shipment" <c:if test="${fsrBean.dateType == 'shipment' }">checked</c:if>>Shipment
									       </td>
									       <td>	</td>
									    </tr>						
									    <tr>
									       <td><strong><label for="dateFrom">Date From:</label></strong></td>
									       <td><strong><label for="dateTo">Date To:</label></strong></td>
									    </tr>						
									    <tr>
									       <td><input id="dateFrom" name="dateFrom" type="text" value="" title="select date from"/><font class="mandatoryField">*</font></td>
									       <td><input id="dateTo" name="dateTo"  type="text" value="" title="select date to"/><font class="mandatoryField">*</font></td>
									    </tr>
									    <tr>
										   <td><strong><label for="caseFrom">Case Number From:</label></strong> </td>
									       <td><strong><label for="caseTo">Case Number To:</label></strong>  </td>
									    </tr>						
									    <tr>
									       <td><form:input path="caseFrom" type="text"  size="5" maxlength="6"  onChange="Validate(this);" title="select case from"/> </td>
									       <td><form:input path="caseTo" type="text"  size="5" maxlength="6" onChange="Validate(this);" title="select case to" /> </td>
									    </tr>
						 			</table>
						 			</div>
						 		</td>
						 	</tr>						   
						</table>
						<div class="borderaround">
							<div class="noteDiv">
								<img src="/AutoChoice/resources/img/pin.png" alt="pin" class="pinImg">&nbsp;When using the Check Box below Sequence number will be automatically generated for you.
								<div class="redColorRow"></div>
							    <div class="redColorRow"></div>
							</div>						   
						</div>
						</div>
						
						<div class="borderaround padding10">
						 <table class="tableWidth97">
						
						  <tr align="left" valign="top">
						     <td style="width:32%;"> 
						     	
						        <table>
						          <th align="left"> <strong>Requisitions :</strong></th>
						           <tr><td>
						
						             <c:set var="ctr"  value="0"/>
									 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
						    
						                <c:if test="${item.category == 'Requisitions'}"> 			 
								         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput"  title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
								  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}" title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
								         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
								  	      
								         <c:out value="${item.formDisplay}"/><br>
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="" /> 
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
						
								         <c:set var="ctr"  value="${ctr+1}"/>
								        </c:if>
									</c:forEach>
						             </td>
						           </tr> 
						        </table>
						        
						      </td> 
						     
						      <td  style="width:32%;">
						      		<table>
							           <th align="left"><strong>Order Status:</strong> </th>
							           <tr><td>
										 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
							               <c:if test="${item.category == 'OrderStatus'}"> 			 
									         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput" title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
									  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}"  title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
									         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
							
									         <c:out value="${item.formDisplay}"/><br>
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="${item.sequence}" /> 
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="${item.editFlag}" />
									         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
									         <c:set var="ctr"  value="${ctr+1}"/>
								           </c:if>
										</c:forEach>
							             </td>
							           </tr>
							         </table>								
						      </td>
							<td  style="width:32%;">
						      	<table>
						          <th> <strong>Contrcase:</strong></th>
						           <tr><td>
									 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
						               <c:if test="${item.category == 'Contrcase'}"> 			 
								         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput"   title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
								  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}"  title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
								         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
						
								         <c:out value="${item.formDisplay}"/><br>
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="" /> 
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
								         
								         <c:set var="ctr"  value="${ctr+1}"/>
							           </c:if>
									</c:forEach>
						             </td>
						           </tr>
						          </table>	
						     </td>
						  </tr>
						      
						  <tr align="left" valign="top">						
						      
						     <td style="width:32%;">
						      	<table>
						           <th align="left"><strong>Vehicle Data:</strong> </th>
						           <tr><td>
									 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
						               <c:if test="${item.category == 'VehicleData'}"> 			 
								         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput"  title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
								  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}"  title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
								         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
						
								         <c:out value="${item.formDisplay}"/><br>
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="${item.sequence}" /> 
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="${item.editFlag}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
								         <c:set var="ctr"  value="${ctr+1}"/>
							           </c:if>
									</c:forEach>
						             </td>
						           </tr>
						         </table>
						     </td> 
						     <td  style="width:32%;">
						      <table>
						           <th align="left"><strong>Buyer:</strong> </th>
						           <tr><td>
									 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
						               <c:if test="${item.category == 'Buyer'}"> 			 
								         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput"  title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
								  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}"  title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
								         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
						
								         <c:out value="${item.formDisplay}"/><br>
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="${item.sequence}" /> 
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="${item.editFlag}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
								         <c:set var="ctr"  value="${ctr+1}"/>
							           </c:if>
									</c:forEach>
						             </td>
						           </tr>
						         </table>
						     </td> 
						     <td  style="width:32%;">
						      	<table>
						           <th align="left"><strong>Requisitions FSR:</strong> </th>
						           <tr><td>
									 <c:forEach var="item" items="${fsrBean.reportBuilderList}" varStatus="status" > 
						               <c:if test="${item.category == 'RequisitionsFSR'}"> 			 
								         <input name="x_${item.formField}" type="text" size="2" maxlength="2" class="miniinput"  title="column sequence - ${item.formDisplay}" onChange="CheckDuplicate(this)">
								  	     <input id="${item.formField}" name="${item.formField}" type="checkbox" value="${item.formDisplay}"  title="select column ${item.formDisplay}" onClick="Updated(this,${ctr})" >
								         <input id="y_${item.formField}" name="y_${item.formField}" type="hidden" value="${ctr}">
						
								         <c:out value="${item.formDisplay}"/><br>
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formField"  value="${item.formField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].formDisplay"  value="${item.formDisplay}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].columnNameOut"  value="${item.columnNameOut}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbField"  value="${item.dbField}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].dbSize"  value="${item.dbSize}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].sequence"  value="${item.sequence}" /> 
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].editFlag"  value="${item.editFlag}" />
								         <form:input type="hidden"  path="reportBuilderList[${ctr}].category"  value="${item.category}" />
								         <c:set var="ctr"  value="${ctr+1}"/>
							           </c:if>
									</c:forEach>
						             </td>
						           </tr>
						         </table>
						     </td> 
						  </tr>
						</table>
						</div>					
						<br>
						 <table class="compareVehiclesTable tableWidth97">
						
						     <tr><td colspan="2">Process As :
							       <form:select path="fileType" title="select report type">
										<option value="text/html" title="select report type - text/html" >HTML</option> 
										<option value="text/plain" title="select report type - text/plain]">Text</option> 
								        <option value="application/msexcel" title="select report type - application/msexcel">Excel</option> 
										<option value="application/msword" title="select report type - application/msword">Word</option> 
										<!--- <option value="application/pdf">PDF</option>  --->
								    </form:select>
							     </td>
							  </tr>
						     <tr>
						     	<td colspan="2">
						     		<input name="actionButton" type="button" onClick="submitform('Process')" class="greenDiv" value ="Process" title="submit"> 
									&nbsp;&nbsp;&nbsp;
						            <input name="x_ClearAll" type="reset" class="greenDiv"  value="Clear" onClick="javascript: mctr =1;"  title="clear">
						
						            <input name="actionButton" type="button" onClick="submitform('Insert')" class="greenDiv" value="Save this Query"  title="save this query">
						            <input name="x_querytitle" type="text" value=""  title="query name input">&nbsp;&nbsp;&nbsp;Enter query name here.
						            <input name="x_pageAction" type="hidden" value="">
						            <input type="hidden" name="action" value=""/>
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