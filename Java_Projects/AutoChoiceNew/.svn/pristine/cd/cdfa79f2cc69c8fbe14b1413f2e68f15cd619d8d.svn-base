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

function loading(){
	<c:if test="${not empty orderBean.dealerInfoJSON}">
		dealerInfoList = ${orderBean.dealerInfoJSON};
		loadDealerStateList();
	</c:if>
	loadStateList();
	CheckQty();
}

function loadDealerStateList(){
	var stateTemp = "";
    var select = document.getElementById('dealerStateSelect');
    select.options.length = 0; // clear out existing items
    for (var i = 0; i < dealerInfoList.bindings.length; i++) {
    	var d = dealerInfoList.bindings[i];
        if(stateTemp != d.state){	        
	        select.options.add(new Option(d.stateName, d.state))
	        stateTemp = d.state;
        }
    }

    document.getElementById('dealerCitySelect').length = 0;
    document.getElementById('dealerDealerSelect').length = 0;
}

function loadDealerCityList(vfield){
	stateSelected = vfield.value;
	var firstCity = "";
	var cityTemp = "";
    var select = document.getElementById('dealerCitySelect');
    select.options.length = 0; // clear out existing items
    for (var i = 0; i < dealerInfoList.bindings.length; i++) {
    	var d = dealerInfoList.bindings[i];
        if(stateSelected == d.state && cityTemp != d.city){
	        select.options.add(new Option(d.city, d.city))
	        cityTemp = d.city;
	        if(firstCity == ""){		       
                firstCity = d.city;
            }
        }
    }
    loadDealerDealerList(firstCity);
}

function loadDealerDealerList(city){
    var select = document.getElementById('dealerDealerSelect');
    var dealerTemp = "";
    var displayText = "";
    var firstDealer = "";
    select.options.length = 0; // clear out existing items
    for (var i = 0; i < dealerInfoList.bindings.length; i++) {
    	var d = dealerInfoList.bindings[i];
        if(stateSelected == d.state && 
                city == d.city && 
                dealerTemp != d.code){     
	        displayText = d.name + "/" + d.street;
	        select.options.add(new Option(displayText, d.code))
	        dealerTemp = d.code;
	        if(firstDealer == ""){		       
	        	firstDealer = d.code;
            }
        }
    }
    loadDealerSelectInfo(firstDealer);
}

function loadDealerSelectInfo(dealer){
	for (var i = 0; i < dealerInfoList.bindings.length; i++) {
    	var d = dealerInfoList.bindings[i];
        if(dealer == d.code){   
        	document.getElementById("dealerCodeDisplay").value = d.code;  
            document.getElementById("dealerNameDisplay").value = d.name;
            document.getElementById("dealerStreetDisplay").value = d.street;
            document.getElementById("dealerCityDisplay").value = d.city;
            document.getElementById("dealerStateDisplay").value = d.state;
            document.getElementById("dealerZipDisplay").value = d.zip;
            document.getElementById("dealerCountryDisplay").value = d.country;
            document.getElementById("dealerTelephoneDisplay").value = d.telephone;
	        break;
        }
    }
}

function loadDealerFormInfo(action){
	if(action == 'Load'){
		var conCity = document.getElementById("conAddCity").value.toUpperCase();
		var conState = document.getElementById("conAddState").value.toUpperCase();
		if(document.getElementById("dealerCityDisplay").value.toUpperCase() != conCity && 
				document.getElementById("dealerStateDisplay").value.toUpperCase() != conState){
			if(!confirm("The dealership you have selected is not located in the same state as your consignee address. Do you want to continue?")){
				return false;
			}
		}	
		document.getElementById("reqCart.dealerCode").value = document.getElementById("dealerCodeDisplay").value;
		document.getElementById("dealerName").value = document.getElementById("dealerNameDisplay").value;
		document.getElementById("dealerStreet").value = document.getElementById("dealerStreetDisplay").value;
		document.getElementById("dealerCity").value = document.getElementById("dealerCityDisplay").value;
		document.getElementById("dealerState").value = document.getElementById("dealerStateDisplay").value;
		document.getElementById("dealerZipCode").value = document.getElementById("dealerZipDisplay").value;
		document.getElementById("dealerTelephone").value = document.getElementById("dealerTelephoneDisplay").value;
	}
	else{
		document.getElementById("reqCart.dealerCode").value = "";
		document.getElementById("dealerName").value = "";
		document.getElementById("dealerStreet").value = "";
		document.getElementById("dealerCity").value = "";
		document.getElementById("dealerState").value ="";
		document.getElementById("dealerZipCode").value = "";
		document.getElementById("dealerTelephone").value = "";
	}
	$( ".arrow_box" ).fadeOut("slow");
}

function cancelDealerSelect(){
	$( ".arrow_box" ).fadeOut("slow");
}

function loadStateList(){
	stateObj = { "stateList" : [
	<c:set var="firstTime" value="true"/>
	<c:forEach items="${orderBean.stateList}" var="state">
		<c:choose>
			<c:when test="${firstTime == 'true'}">
				<c:set var="firstTime" value="false"/>
			</c:when>
			<c:otherwise>
				, 
			</c:otherwise>
		</c:choose>
		{ "state":"${state.state}" , "country":"${state.country}" }
	</c:forEach>
	 ]}
	//alert(stateObj);
}
// for (i=0; i < reccount; i++)
//   myarray[i]=new Array(2);
function StateCountry(vfield) {
		//alert(vfield.name);
	  if ( vfield.name == "reqCart.conAddState") {
		  
		  for (var i in stateObj.stateList) {
			  //alert(stateObj.stateList[i].state);
			  if(stateObj.stateList[i].state == vfield.value){
				  //alert("in con");
				  document.getElementById("conAddCountry").value = stateObj.stateList[i].country;
			  }
	  	  }
	  }
	
	  if ( vfield.name == "reqCart.reqAddState") {
		 for (var i in stateObj.stateList) {
			  if(stateObj.stateList[i].state == vfield.value){
				  document.getElementById("reqAddCountry").value = stateObj.stateList[i].country;
			  }
	  	  }
	  }
	
	if ( vfield.name == "reqCart.mailAddState") {
		for (var i in stateObj.stateList) {
			  if(stateObj.stateList[i].state == vfield.value){
				  document.getElementById("mailAddCountry").value = stateObj.stateList[i].country;
			  }
	  	  }
	  }
}     

function SignalCode(){
	var list = document.getElementById("fedMilSignal");
	document.getElementById("serviceCode").value= "";
	
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K') 
	   {  document.getElementById("fedMilSupAdd").focus();
	          return true;
	    } 
	
	
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K') 
	   {  document.getElementById("fedMilSupAdd").focus();
	          return true;
	    } 
	
	
	if( list.options[list.selectedIndex].value == '') 
	{ alert("Please select one from the Signal Code Options");
	  return false;
	    }       
	
	ServiceCode();
}   


function ServiceCode(){
	var list = document.getElementById("fedMilSignal");
	if( list.options[list.selectedIndex].value == 'C' || list.options[list.selectedIndex].value == 'L') {
	   
	   if (flagDOD== true) {
	   
	      document.getElementById("serviceCode").readonly = false;
	      document.getElementById("serviceCode").value= document.getElementById("fedMilReq1").value.substring(0, 1);
		  document.getElementById("serviceCode").readonly = true;
	
	   }
	   else
	   {
	      document.getElementById("serviceCode").value= document.getElementById("fedMilReq1").value.substring(0, 2);
		  document.getElementById("serviceCode").readonly = false;
		  
	   }
	}	


}

function FedMilReq1Check(){
var ret = true;
document.getElementById("fedMilReq1").blur();
if(document.getElementById("fedMilReq1").value.length != 6 )
	{ alert("The first node of the Requisition Number must be six characters.");
     ret = false;                   
}

if ( document.getElementById("fedMilReq1").value.substring(0, 1) == 'G'){
    alert(document.getElementById("fedMilReq1").value+" is invalid BOAC. All BOAC's begins with 'G' are reserved for credit card payments only");
	document.getElementById("fedMilReq1").value ="";
	document.getElementById("fedMilReq1").focus();
	 
     ret = false;   

}

if (ret) {
	  ServiceCode();
}

return(ret);
}

function SuppAddress(vField) {
var totqty = document.getElementById("estUnitPrice").value;
var ret = true;
var list = document.getElementById("fedMilSignal");
upper(vField);
document.getElementById("fedMilSupAdd").blur();
if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K') 
{ 
	if (document.getElementById("fedMilSupAdd").value.length  != 6 )
	{ alert("Supplementary Address is required for Signal Code B or K. (6 characters)");
     ret = false;                  
}
}          
if (eval(totqty) > 999999)
 {
     alert("Your obligated amount shouldn't be greater than $999,999");
        ret = false;
 }                      

if ( document.getElementById("fedMilSupAdd").value.substring(0, 1) == 'G'){
    alert("All BOAC's begins with 'G' are reserved for credit card payments only");
 	 document.getElementById("fedMilSupAdd").focus();
     ret = false;   

}
	 
 

return(ret);
}


function FundCode(vField){
	var list = document.getElementById("fedMilSignal");
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K') 
	    { if (document.getElementById("fedMilSupAdd").value.length == 0)
	               document.getElementById("fedMilSupAdd").focus();
	    }  
	return true;
}




function IsJulian(vstring){
	var DaysInYear = 0;
	var ret = true;
	
	
	if (( vstring.substring(0, 1) == 0) || ( vstring.substring(0, 1) == 2) || 
	  ( vstring.substring(0, 1) == 4) || ( vstring.substring(0, 1) == 6) ||
	      ( vstring.substring(0, 1) == 8)) {
	       DaysInYear = 366;
	   }                        
	else 
	        DaysInYear = 365;
	if ((vstring.substring(1, 4) < 1 ) || (vstring.substring(1, 4) > DaysInYear)) 
	   ret = false;
	
	 if  ( isNumOnly(vstring) == false) {
	    alert("This block must be numeric!");
	    ret = false;
	                 }
	             
	return(ret);


}

function FedMil2(vfield){
	var DaysInYear = 0;
	var vstring    = vfield.value;
	var ret = true;
	if  ( isNumOnly(vstring) == false){
	  alert("The second field of the Requisition Number must be numeric and Julian date format");
	      vfield.blur();
	      vfield.focus();
	      ret = false;
	}
	
	if ( IsJulian(vstring) == false ) {
	      alert("The second field of the Requisition Number must be Julian date format");
	      vfield.blur();
	      vfield.focus();
	       ret = false;
	      }
	
	if   (vstring.length < 4)    {
	    alert("The second field of the Requisition Number must be numeric and Julian date format");
	    ret = false;
	}
	             
	return ret;
}


function FedMil3Change(vfield){
	var vstring    = vfield.value;
	
	if   (vstring.length < 4)     {
	 alert("The third field of the Requisition Number must be 4 characters in length.");
	     return false;
	     }
	return true;    
}


function FedMil3Focus(vfield){
	var list = document.forms[0].fedMilReq1;
	var vstring  = document.forms[0].fedMilReq2.value
	if  ( IsJulian(vstring) == false){
	  vfield.blur();
	  alert("Invalid Julian Date!",1);
	  document.forms[0].fedMilReq2.focus();
	      return true;
	    }
	if (list.value.length == 0){ 
	   alert("Before you enter data here, you must fill in the first block of the Requisition field",1);
	   vfield.blur();
	   document.forms[0].fedMilReq1.focus();
	     }         
	    
	return true;    

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


function CheckDelivery(vfield)
{
var ls_ExDel_found = false;
var lb_alert_export = false;
var msg1 ="";
var msg2 ="";

ls_ExDel_found = ${orderBean.exDelFound};   


if (vfield.name == "exportCode") {
  var list_export =document.getElementById("exportCode");
  msg2 = "\r\n* For export orders, please enter the overseas contact person and phone number."; 
  if ((list_export.options[list_export.selectedIndex].value == 'N') &&  (ls_ExDel_found == true)  ) {
  	  msg1="* Shipment location should not be domestic when selecting an option for outside the continental U.S.  (eg. 1611 ).\r\n";
     alert (msg1);
	 lb_alert_export = true;
     export_contact_tel = false  
     return false;
  }
  if ((list_export.options[list_export.selectedIndex].value == 'F') &&  (ls_ExDel_found == false) ) {
     msg1 = "* Shipment location should NOT be Export when Options for outside Continental  US (eg. 1611 ) is NOT selected.\r\n"  
     alert (msg1+msg2);
	 lb_alert_export = true;
     export_contact_tel = false  
     return false;
  } 

  if ((lb_alert_export == false) && (list_export.options[list_export.selectedIndex].value == 'F') &&   export_contact_tel == false ) {
     alert(msg2);
  }
  



} 

return true;
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


function ValidateAll() { 
	var ret = true;
	var ls_string = "";
	var ls_cns_found = ${orderBean.cnsFound};

	
	if (! CheckQty())
	    return false;
	
	Validate_Email_Fax();	
	            
	if ( req_email_fax == false ){
		alert("Requisition Email or Fax must be filled in before submitting. \n\n Fax must be in numeric format only");
	    return false;
	}
	            
	if ( del_email_fax == false ){
		alert("Delivery Email or Fax must be filled in before submitting.\n\n Fax must be in numeric format only");
	    return false;
	}	
	    
	var  agencyCd = <c:out value="${commonBean.userAccount.agencyCode}"/>;
	var list = document.getElementById("fedMilSignal");
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K')  {
		 if (document.getElementById("fedMilSupAdd").value.length  == 0 ) {
		          alert("Supplementary Address is required for Signal Code B or K");
		     return false;                    
		 }
	}  
	
	if( list.options[list.selectedIndex].value == 'C' || list.options[list.selectedIndex].value == 'L') {
	   
	   if (flagDOD  == true) {
		  document.getElementById("serviceCode").readonly = false;
	      document.getElementById("serviceCode").value= document.getElementById("fedMilReq1").value.substring(0, 1);
		  document.getElementById("serviceCode").readonly = true;
	   }
	   else
	   {
	      if ((document.getElementById("serviceCode").value.length < 2 ) || (isNumOnly(document.getElementById("serviceCode").value) == false))  {
		     alert("Invalid Service Code, valid code must be two digits.");
			 document.getElementById("serviceCode").focus();
			 return false;
		  }  
		  
		  if ((document.getElementById("serviceCode").value != agencyCd)  &&  (document.getElementById("serviceCode").value != document.getElementById("fedMilReq1").value.substring(0, 2 ))) {
		     alert("Invalid Service Code, valid code must be two digits of your agency code or the first two digits from the Requisition number/BOAC.");
			 document.getElementById("serviceCode").focus();
			 return false;
		  }		  
		  if (document.getElementById("fedMilFund").value =="00") {
		          alert("Fund Code should not be 00 when Signal is C or L."); 
		      return false;
	      }
	  }	
	}	
	
	//this needs to place here after the above validation to make sure the  fedMilSupAdd (Supplementary Address) and fedMilReq1(AAC)  is not empty
	
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K')  {
	  document.getElementById("reqCart.boac").value =  document.getElementById("fedMilSupAdd").value;  
	}
	else {
	  document.getElementById("reqCart.boac").value =  document.getElementById("fedMilReq1").value;
	}        	
	var list = document.getElementById("reqAddState");
	if  ( ! list.options[list.selectedIndex].value == 'XX' ) 
	{ if (document.getElementById("reqAddState").value.length  == 0 )
	         { alert("Zip Code is required under Requisition Address");
	     return false;                    
	             }
	    }        
	
	var list = document.getElementById("mailAddState");
	if  ( ! list.options[list.selectedIndex].value == 'XX' ) 
	{ if (document.getElementById("mailAddState").value.length  == 0 )
	         { alert("Zip Code is required under Mailing Address");
	     return false;                    
	             }
	    }   
	    
	var list = document.getElementById("conAddState");
	var list_export =document.getElementById("exportCode");
	
	
	if  ( ! (list.options[list.selectedIndex].value == 'XX') ){ 
		if (document.getElementById("conAddState").value.length  == 0 ){ 
			alert("Zip Code is required under Consignee Address");
	     	return false;                    
	    }
	}        
	else
	{ 
	  if  ( (list_export.options[list_export.selectedIndex].value == 'N')  ) { 
		  alert("Shipment Location must be 'Export' when delivery is outside the US and  option 1611 must be selected." );
	      return false;                   
	  }
	  if (ls_cns_found )
	  {
	      alert("Option 'CNS' shouldn't be included when delivery is outside US." ); 
	      return false;                          
	  } 
	}               
	    
	export_contact_tel = true;  		
	if (CheckDelivery(document.getElementById("exportCode")) == false)
	  return false;
	
	if (CheckSpecialChar(document.getElementById("fedMilFund")) == false)
	  return false;
	if ('<c:out value="${commonBean.userAccount.flg1122}"/>' == 'N') {	  
	  if (checkTAS(document.getElementById("tas")) == false)
	     return false;
	}
	//document.getElementById("OrderIt").disabled=true;
	//document.getElementById("Back").disabled=true;

	var action = '${orderBean.action}';
	document.getElementById("myForm").action = "/AutoChoice/ReqDetailsUpdate/" + action;
	document.getElementById("myForm").submit();
	return true;   
}

function sendIncomplete(){
	var list = document.getElementById("fedMilSignal");
	if( list.options[list.selectedIndex].value == 'C' || list.options[list.selectedIndex].value == 'L') {	   
	   if (flagDOD  == true) {
		  document.getElementById("serviceCode").readonly = false;
	      document.getElementById("serviceCode").value= document.getElementById("fedMilReq1").value.substring(0, 1);
		  document.getElementById("serviceCode").readonly = true;
	   }
	}
	if( list.options[list.selectedIndex].value == 'B' || list.options[list.selectedIndex].value == 'K')  {
	  document.getElementById("reqCart.boac").value =  document.getElementById("fedMilSupAdd").value;  
	}
	else {
	  document.getElementById("reqCart.boac").value =  document.getElementById("fedMilReq1").value;
	}

	CheckQty();
	
	document.getElementById("myForm").action = "/AutoChoice/ReqDetailsUpdate/Incomplete";
	document.getElementById("myForm").submit();
}

function Window_Dealer() {
	remote=window.open('/AutoChoice/DealerLocation' ,'copy','width=600,height=350,channelmode=0,dependent=0,directories=0,fullscreen=0,location=0,menubar=0,resizable=1,scrollbars=1,status=1,toolbar=0,left=0,top=100,screenX=0,screenY=0');
	remote.focus();
}

function Validate_Email_Fax() {
   
   if ( (! trim(document.getElementById("reqEmailAdd").value)  == "") || (! trim(document.getElementById("reqFaxNum").value) =="")) 
         req_email_fax = true; 
       else 
            req_email_fax = false;                   
                     

   if ( (! trim(document.getElementById("conEmailAdd").value)  == "") || (! trim(document.getElementById("conFaxNum").value) =="")) 
         del_email_fax = true; 
       else          
             del_email_fax = false; 

                     
                     
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


function ValEmail(vField)
{
    ret = true;
    vEmail = vField.value;

    //If field has valid chars check format
    if(vEmail.length > 1)   
    {
        if(!(vEmail.indexOf("@")>0))
        {
                alert("Email is not in valid format.It should be like this \n\n account@domain.com. No space(s) in between");
                ret = false
                vField.focus()
        }
    } else {
            //values are spaces, clear the field.
            vField.value = ""
            ret = false
    }

    return (ret)
}


function FedMilFund(vfield)
{
upper(vfield);
if (document.getElementById("fedMilFund").value.length  < 2 ) {
alert("Fund Code must be 2 character in length.");
return false; 
}

if (CheckSpecialChar(document.getElementById("fedMilFund")) == false)
  return false;




return true;  
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


function FaxFormat(vfield) {

	if (vfield.name == "reqFaxNum") {
	if  (!(document.getElementById("reqFaxIntl").checked)) {
	        if  ((! (vfield.value.length == 10 )) && (! (vfield.value == "" ))){
	           alert("Fax number must be in 10 numeric in length! \n No dashes or parenthesis.");
	               vfield.focus();
	           return false; 
	        }     
	}  
	} 
		
	if (vfield.name == "conFaxNum") {
	 if  (! (document.getElementById("conFaxIntl").checked)) {
	      if  ((! (vfield.value.length == 10 )) && (! (vfield.value == "" ))){
	          alert("Fax number must be in 10 numeric in length! \n No dashes or parenthesis.");
	              vfield.focus();
	          return false; 
	         }     
	     }
	}
	      
	if  (( ! (isNumOnly(vfield.value) ) )  && (! (vfield.value == "" )) ) {
	 alert("Fax number must be in  numeric  format! No dashes or parenthesis. ");
	      vfield.focus();
	 return false; 
	}     
}



function  CheckSpecialChar(vfield) {
	var iChars = "~`!@#$%^&*()+=-[]\\\';,./{}|\":<>?";
	
	for (var i = 0; i < vfield.value.length; i++) {
	
		if (iChars.indexOf(vfield.value.charAt(i)) != -1) {
		alert ("Your "+ vfield.name +" has special characters. \nThese are not allowed.\n Please remove them and try again.");
		return false;
		}
	}
	return true;
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
					   	<span class="titleText">Submition</span>
					   </td>
					   <td width="35%" class="rightPadding105">
					   		<!-- -
						   <div class="simplePagination">
							  <ul>
							 	 <li><a href="#" class="active">Next &nbsp; >></a></li>
							    <li><a href="#"><< &nbsp; Previous</a></li>
							  </ul>
							</div>
							 --> 
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
								  <span>8E-SEDAN, SUBCOMPACT, ELECTRIC VEHICLE</span>					 
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
										    <tr>
											    <td><label for="fedMilReq1">Requisition Number:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.fedMilReq1" id="fedMilReq1" name="fedMilReq1" title="fed mil req number 1" value="${orderBean.reqCart.fedMilReq1 }" size="6" maxlength="6" class="smallinput" onchange="upper(this)" onBlur="return FedMilReq1Check(this);"/>&nbsp;
											     	<form:input type="text" path="reqCart.fedMilReq2" id="fedMilReq2" name="fedMilReq2" title="fed mil req number 2" value="${orderBean.reqCart.fedMilReq2 }"  size="4" maxlength="4" class="smallinput" onchange="FedMil2(this)"/>&nbsp;
											    	<form:input type="text" path="reqCart.fedMilReq3" id="fedMilReq3" name="fedMilReq3" title="fed mil req number 3" value="${orderBean.reqCart.fedMilReq3 }"  size="4" maxlength="4" class="smallinput" onchange="javascript: return FedMil3Change(this);" onfocus="FedMil3Focus(this)"/>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <c:choose>
											    <c:when test="${not empty orderBean.agBuOnBehalfList }">
											    	<tr>
													    <td width="25%"><label for="agBuOnBehalf">Ordering On Behalf:</label></td>
													    <td>
													    	<form:select  path="reqCart.agBuOnBehalf" id="agBuOnBehalf" name="agBuOnBehalf" items="${orderBean.agBuOnBehalfList}" itemValue="combinedCode" title="agency bureau on behalf list" itemLabel="codeNameDisplay"></form:select>
														</td>
												    </tr>
											    </c:when>
											    <c:otherwise>
											    	<input type="hidden" id="agBuOnBehalf" name="reqCart.agBuOnBehalf" value="${orderBean.reqCart.agBuOnBehalf }"/>
											    </c:otherwise>
										    </c:choose>
										    <tr>
											    <td><label for="fedMilSignal">Signal Code:</label></td>
											    <td>
											    	<form:select  path="reqCart.fedMilSignal" id="fedMilSignal" name="fedMilSignal" items="${orderBean.signalCodeList}" title="signal code list" onChange="javascript:return SignalCode()"></form:select>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td><label for="fedMilSupAdd">Supplementary Address:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.fedMilSupAdd" id="fedMilSupAdd" name="fedMilSupAdd" title="Supplementary Address" value="${orderBean.reqCart.fedMilSupAdd }"  size="6" maxlength="6" class="smallinput" onBlur="return SuppAddress(this);"/>
											    	<span class="desc">&nbsp;(Required for Signal Code B and K)</span>
											    </td>
										    </tr>
										    <tr>
											    <td><label for="serviceCode">Service Code:</label></td>
											    <td>
											    	<input type="text" class="smallinput" />
											    	<form:input type="text" path="reqCart.serviceCode" id="serviceCode" name="serviceCode" title="Service Code" value="${orderBean.reqCart.serviceCode }"  size="2" maxlength="2" class="box40" readonly="${orderBean.ddrFound}" onBlur="return SuppAddress(this);"/>
											    	<span class="desc">&nbsp;(Required for Signal Code C and L)</span>
											    </td>
										    </tr>
										    <tr>
											    <td><label for="fedMilFund">Fund Code:</label></td>
											    <td> 
											    	<form:input type="text" path="reqCart.fedMilFund" id="fedMilFund" name="fedMilFund" title="Fund Code" value="${orderBean.reqCart.fedMilFund }"  size="2" maxlength="2" class="box40" onchange="javascript: return FedMilFund(this)"/>
											    	<span class="desc">&nbsp;(Required for Signal Code C and L otherwise use 00)</span>
											    </td>
										    </tr>
										    <tr>
										    	<td></td>
										    	<td><span class="desc">For more information on the Funding Agency and Funding Office fields, please visit the Federal Data Procurement System.<br> A list of codes can be viewed at  <a>https://www.fpds.gov/fpdsng_cms/index.php/en/worksite.html</a> under "List of Contracting Office&quot;</span></td></tr>
										    <tr>
										    <tr>
											    <td><label for="fundAg">Funding Agency:</label></td>
											    <td> 
											    	<form:input type="text" path="reqCart.fundAg" id="fundAg" name="fundAg" title="Fund Agency" value="${orderBean.reqCart.fundAg }"  size="4" maxlength="4" class="smallinput"/>
											    	&nbsp;
											    </td>
										    </tr>
											<tr>
											    <td><label for="fundOff">Funding Office:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.fundOff" id="fundOff" name="fundOff" title="Fund Office" value="${orderBean.reqCart.fundOff }"  size="6" maxlength="6" class="smallinput"/>
											    </td>
										    </tr>
											<tr>
											    <td><label for="estUnitPrice">Unit Price $:</label></td>
											    <td>
											    	<input type="hidden" id="estUnitPrice" name="reqCart.estUnitPrice" value="${orderBean.reqCart.estUnitPrice }"/>
											    	<fmt:parseNumber value="${orderBean.reqCart.estUnitPrice}" type="number" var="estUnitPriceTemp"/>
													<fmt:formatNumber type="currency" value="${estUnitPriceTemp}"/>
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
											    <td><label for="totEstUnitPrice">Total Est Unit Price $:</label></td>
											    <td>												
											    	<input type="text" id="totEstUnitPrice" name="totEstUnitPrice" class="smallinput skyBlueBground" value="" readonly/>											    	
												</td>
										    </tr>
										    <tr>
											    <td >Description:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.nonStdDesc }"/></span></td>
										    </tr>
										    <tr>
											    <td><label for="exportCode">Shipment Location:</label></td>
											    <td>
											    	<form:select path="reqCart.exportCode" name="exportCode" id="exportCode" OnChange="javascript:return CheckDelivery(this);">
											    		<form:option value="N" label="Domestic"/>
											    		<form:option value="F" label="Export"/>
											    	</form:select>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td>&nbsp;</td>
											    <td><span class="desc">For export orders, please enter the overseas contact person and phone number.</span></td>
										    </tr>
										    <c:choose>
										    <c:when test="${commonBean.userAccount.agencyCode == '17' || commonBean.userAccount.agencyCode == '21' || commonBean.userAccount.agencyCode == '57'}">
											    <tr>
												    <td><label for="nsn">NSN:</label></td>
												    <td> 
												    	<form:input type="text" path="reqCart.nsn" id="nsn" name="nsn" title="NSN" value="${orderBean.reqCart.nsn }"  size="16" maxlength="16" class="smallinput"/>
												    	&nbsp;
												    </td>
											    </tr>
												<tr>
												    <td><label for="registrationNum">Registration Number:</label></td>
												    <td>
												    	<form:input type="text" path="reqCart.registrationNum" id="registrationNum" name="registrationNum" title="Registration Number" value="${orderBean.reqCart.registrationNum }"  size="20" maxlength="20" class="smallinput"/>
												    </td>
											    </tr>
												<tr>
												    <td><label for="markFor">Mark For:</label></td>
												    <td>
												    	<form:input type="text" path="reqCart.markFor" id="markFor" name="markFor" title="Mark For" value="${orderBean.reqCart.markFor }"  size="30" maxlength="30" class="address"/>
													</td>
											    </tr>
											    <tr>
												    <td><label for="acrn">ACRN:</label></td>
												    <td>
												    	<form:input type="text" path="reqCart.acrn" id="acrn" name="acrn" title="ACRN" value="${orderBean.reqCart.acrn }"  size="2" maxlength="2" class="box40"/>
													</td>
											    </tr>
										    </c:when>
										    <c:otherwise>
										    	<input type="hidden" id="nsn" name="reqCart.nsn" value="${orderBean.reqCart.nsn }"/>
										    	<input type="hidden" id="registrationNum" name="reqCart.registrationNum" value="${orderBean.reqCart.registrationNum }"/>
										    	<input type="hidden" id="markFor" name="reqCart.markFor" value="${orderBean.reqCart.markFor }" />
										    	<input type="hidden" id="acrn" name="reqCart.acrn" value="${orderBean.reqCart.acrn }"/>
										    </c:otherwise>
										    </c:choose>
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
										    <tr>
											    <td><label for="messageLine4">Contact Person:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.messageLine4" id="messageLine4" name="messageLine4" title="messageLine4" value="${orderBean.reqCart.messageLine4 }"  size="35" maxlength="35" class="address"/>
											    	<font class="mandatoryField">*</font>
											   	</td>
										    </tr>
										    <tr>
											    <td><label for="messageLine5">Phone Number:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.messageLine5" id="messageLine5" name="messageLine5" title="messageLine5" value="${orderBean.reqCart.messageLine5 }"  size="35" maxlength="35" class="address"/>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td><label for="priority">Priority Level:</label></td>
											    <td><form:select path="reqCart.priority" name="reqCart.priority" id="priority">
											    		<form:option value="Low" label="Low" selected="true"/>
											    		<form:option value="Medium" label="Medium"/>
											    		<form:option value="High" label="High"/>
											    	</form:select>
											    	<span class="desc">&nbsp;This priority pertains to your order once it has been stored in your Pending Orders.</span>
											    </td>
										    </tr>
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
										    <tr>
											    <td><label for="remarks">Internal Agency Financial Data:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.remarks" id="remarks" name="remarks" title="remarks" value="${orderBean.reqCart.remarks }"  size="80" maxlength="80" class="address" /> &nbsp;
											    </td>
										    </tr>
										    <tr>
											    <td>&nbsp;</td>
											    <td><span class="desc">Info will be passed to GSA Finance but will not be passed to GSA Automotive.</span></td>
										    </tr>
									    </table>
									    </div>
								    </td>
							    </tr>							    
							    <tr>
								    <td >
									    <div class="vehInfBorder">
									    <div class="vehInf vehInfInner100" >
									    	<span>Requisitioning Address</span>
									    </div>
									    <table class="leftSpacing tableWidth100" cellpadding="4">
										    <tr>
											    <td width="25%">
											    <label for="reqAddLine1">Agency Name:</label>
											    </td>
											    <td>
											    	<form:input type="text" path="reqCart.reqAddLine1" id="reqAddLine1" name="reqAddLine1" title="Req Add Line 1" value="${orderBean.reqCart.reqAddLine1 }"  size="35" maxlength="35" class="address" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="reqAddLine2">Address:</label></td>
											    <td><form:input type="text" path="reqCart.reqAddLine2" id="reqAddLine2" name="reqAddLine1" title="Req Add Line 2" value="${orderBean.reqCart.reqAddLine2 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.reqAddLine3" id="reqAddLine3" name="reqAddLine3" title="Req Add Line 3" value="${orderBean.reqCart.reqAddLine3 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.reqAddLine4" id="reqAddLine4" name="reqAddLine4" title="Req Add Line 4" value="${orderBean.reqCart.reqAddLine4 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ><label for="reqAddCity">City:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.reqAddCity" id="reqAddCity" name="reqAddCity" title="Req Add City" value="${orderBean.reqCart.reqAddCity }"  size="20" maxlength="20" class="box180" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="reqAddState">State:</label></td>
											    <td>
											    	<form:select path="reqCart.reqAddState" name="reqAddState" id="reqAddState"  onchange ="StateCountry(this)" >
											    		<c:forEach items="${orderBean.stateList }" var="state">
											    			<form:option label="${state.stateName }" value="${state.state }" />
											    		</c:forEach>											    		
											    	</form:select>
											    	<font class="mandatoryField">*</font></td>
										    </tr>
										    <tr>
											    <td ><label for="reqAddZip">Zip Code:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.reqAddZip" id="reqAddZip" name="reqAddZip" title="Req Add Zip" value="${orderBean.reqCart.reqAddZip }"  size="5" maxlength="5" class="smallinput" />&nbsp;
											    	<form:input type="text" path="reqCart.reqAddZipSfx" id="reqAddZipSfx" name="reqAddZipSfx" title="Req Add Zip Suffix" value="${orderBean.reqCart.reqAddZipSfx }"  size="4" maxlength="4" class="smallinput" />
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="reqAddCountry">Country:</label></td>
											    <td><form:input type="text" path="reqCart.reqAddCountry" id="reqAddCountry" name="reqAddCountry" title="Req Add Country" value="${orderBean.reqCart.reqAddCountry }"  size="15" maxlength="15" class="box180" /></td>
										    </tr>
										    <tr>
											    <td ><label for="reqEmailAdd">Email Address:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.reqEmailAdd" id="reqEmailAdd" name="reqEmailAdd" title="Req Email Address" value="${orderBean.reqCart.reqEmailAdd }"  size="35" maxlength="50" class="box180" onblur="return ValEmail(this);"/>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="reqFaxNum">Fax Number:</label></td>
											    <td>
												    <span class="desc">Is it International?</span>
												    <form:checkbox path="reqCart.reqFaxIntl" name="reqFaxIntl" id="reqFaxIntl"  value="Y" title="Req Fax International Check Box" checked="${orderBean.reqCart.reqFaxIntl == 'Y'}"/><label for="reqFaxIntl"></label>
												    <form:input type="text" path="reqCart.reqFaxNum" id="reqFaxNum" name="reqFaxNum" title="Req Fax Number" value="${orderBean.reqCart.reqFaxNum }"  size="35" maxlength="50" class="box110" onBlur="return FaxFormat(this);"/>
												    <font class="mandatoryField">*</font><br/>
												    <span class="desc">(Include Country Code for International)</span>
											    </td>
										    </tr>
									    </table>
									    </div>
								    </td>
								    <td valign="top" width="50%">
									    <div class="vehInfBorder">
									    <div class="vehInf vehInfInner100" >
									    	<span>Mailing Address</span>
									    </div>
									    <span class="desc">Certificates of Origin are made out to the Agency
									    and Address provided in the Mailing Address. Parts and Service Manuals are also
									    sent to the Mailing Address. Do not provide a person's name in the Mailing Address. 
									     </span><br/><br/>
									    <table class="leftSpacing tableWidth100" cellpadding="4">
										    <tr>
											    <td width="25%">
											    	<label for="mailAddLine1">Agency Name:</label>
											    </td>
											    <td>
											    	<form:input type="text" path="reqCart.mailAddLine1" id="mailAddLine1" name="mailAddLine1" title="Mail Add Line 1" value="${orderBean.reqCart.mailAddLine1 }"  size="35" maxlength="35" class="address" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="mailAddLine2">Address:</label></td>
											    <td><form:input type="text" path="reqCart.mailAddLine2" id="mailAddLine2" name="mailAddLine2" title="Mail Add Line 2" value="${orderBean.reqCart.mailAddLine2 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.mailAddLine3" id="mailAddLine3" name="mailAddLine3" title="Mail Add Line 3" value="${orderBean.reqCart.mailAddLine3 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.mailAddLine4" id="mailAddLine4" name="mailAddLine4" title="Mail Add Line 4" value="${orderBean.reqCart.mailAddLine4 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ><label for="mailAddCity">City:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.mailAddCity" id="mailAddCity" name="mailAddCity" title="Mail Add City" value="${orderBean.reqCart.mailAddCity }"  size="20" maxlength="20" class="box180" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="mailAddState">State:</label></td>
											    <td>
											    	<form:select path="reqCart.mailAddState" name="mailAddState" id="mailAddState"  onchange ="StateCountry(this)" >
											    		<c:forEach items="${orderBean.stateList }" var="state">
											    			<form:option label="${state.stateName }" value="${state.state }" />
											    		</c:forEach>											    		
											    	</form:select>
											    	
											    	<font class="mandatoryField">*</font></td>
										    </tr>
										    <tr>
											    <td ><label for="mailAddZip">Zip Code:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.mailAddZip" id="mailAddZip" name="mailAddZip" title="Mail Add Zip" value="${orderBean.reqCart.mailAddZip }"  size="5" maxlength="5" class="smallinput" />&nbsp;
											    	<form:input type="text" path="reqCart.mailAddZipSfx" id="mailAddZipSfx" name="mailAddZipSfx" title="Mail Add Zip Suffix" value="${orderBean.reqCart.mailAddZipSfx }"  size="4" maxlength="4" class="smallinput" />
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="mailAddCountry">Country:</label></td>
											    <td><form:input type="text" path="reqCart.mailAddCountry" id="mailAddCountry" name="mailAddCountry" title="Mail Add Country" value="${orderBean.reqCart.mailAddCountry }"  size="15" maxlength="15" class="box180" /></td>
										    </tr>										   
									    </table></div>
								    </td>
							    </tr>
							    <!-- Delivery Address -->
							    <tr>							
								    <td >
									    <div class="vehInfBorder">
									    <div class="vehInf vehInfInner100" >
									    	<span>Delivery Address</span>
									    </div>
									    <table class="leftSpacing tableWidth100" cellpadding="4">
										    <tr>
											    <td width="25%">
											    	<label for="conAddLine1">Agency Name:</label>
											    </td>
											    <td>
											    	<form:input type="text" path="reqCart.conAddLine1" id="conAddLine1" name="conAddLine1" title="Con Add Line 1" value="${orderBean.reqCart.conAddLine1 }"  size="35" maxlength="35" class="address" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="conAddLine2">Address:</label></td>
											    <td><form:input type="text" path="reqCart.conAddLine2" id="conAddLine2" name="conAddLine1" title="Con Add Line 2" value="${orderBean.reqCart.conAddLine2 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.conAddLine3" id="conAddLine3" name="conAddLine3" title="Con Add Line 3" value="${orderBean.reqCart.conAddLine3 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ></td>
											    <td><form:input type="text" path="reqCart.conAddLine4" id="conAddLine4" name="conAddLine4" title="Con Add Line 4" value="${orderBean.reqCart.conAddLine4 }"  size="35" maxlength="35" class="address" /></td>
										    </tr>
										    <tr>
											    <td ><label for="conAddCity">City:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.conAddCity" id="conAddCity" name="conAddCity" title="con Add City" value="${orderBean.reqCart.conAddCity }"  size="20" maxlength="20" class="box180" />
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="conAddState">State:</label></td>
											    <td>
											    	<form:select path="reqCart.conAddState" name="conAddState" id="conAddState"  onchange ="StateCountry(this)" >
											    		<c:forEach items="${orderBean.stateList }" var="state">
											    			<form:option label="${state.stateName }" value="${state.state }" />
											    		</c:forEach>											    		
											    	</form:select>
											    	<font class="mandatoryField">*</font></td>
										    </tr>
										    <tr>
											    <td ><label for="conAddZip">Zip Code:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.conAddZip" id="conAddZip" name="conAddZip" title="con Add Zip" value="${orderBean.reqCart.conAddZip }"  size="5" maxlength="5" class="smallinput" />&nbsp;
											    	<form:input type="text" path="reqCart.conAddZipSfx" id="conAddZipSfx" name="conAddZipSfx" title="con Add Zip Suffix" value="${orderBean.reqCart.conAddZipSfx }"  size="4" maxlength="4" class="smallinput" />
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="conAddCountry">Country:</label></td>
											    <td><form:input type="text" path="reqCart.conAddCountry" id="conAddCountry" name="conAddCountry" title="con Add Country" value="${orderBean.reqCart.conAddCountry }"  size="15" maxlength="15" class="box180" /></td>
										    </tr>
										    <tr>
											    <td ><label for="conEmailAdd">Email Address:</label></td>
											    <td>
											    	<form:input type="text" path="reqCart.conEmailAdd" id="conEmailAdd" name="conEmailAdd" title="con Email Address" value="${orderBean.reqCart.conEmailAdd }"  size="35" maxlength="50" class="box180" onblur="return ValEmail(this);"/>
											    	<font class="mandatoryField">*</font>
											    </td>
										    </tr>
										    <tr>
											    <td ><label for="conFaxNum">Fax Number:</label></td>
											    <td>
												    <span class="desc">Is it International?</span>
												    <form:checkbox path="reqCart.conFaxIntl" name="conFaxIntl" id="conFaxIntl" value="Y" title="con Fax International Check Box" checked="{orderBean.reqCart.conFaxIntl == 'Y' }"/><label for="conFaxIntl"></label>
												    <form:input type="text" path="reqCart.conFaxNum" id="conFaxNum" name="conFaxNum" title="con Fax Number" value="${orderBean.reqCart.conFaxNum }"  size="35" maxlength="50" class="box110" onBlur="return FaxFormat(this);"/>
												    <font class="mandatoryField">*</font><br/>
												    <span class="desc">(Include Country Code for International)</span>
											    </td>
										    </tr>
									    </table></div>
								    </td>
								    <!-- Billing Address -->
								    <td valign="top">
									    <div class="vehInfBorder">
									    <div class="vehInf vehInfInner100" >
									    	<span>Billing Address</span>
									    </div>
									    <table class="leftSpacing tableWidth100" cellpadding="4">
										    <tr>
											    <td valign="top">">Address:</td>
											    <td>
											    	<span class="desc">
											    		<c:out value="${orderBean.reqCart.billAddLine1 }"/><br/>
											    		<c:out value="${orderBean.reqCart.billAddLine2 }"/><br/>
											    		<c:out value="${orderBean.reqCart.billAddLine3 }"/><br/>
											    		<c:out value="${orderBean.reqCart.billAddLine4 }"/><br/>
													</span>
											    </td>
										    </tr>
										    <tr>
											    <td >City:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.billAddCity }"/></span></td>
										    </tr>
										    <tr>
											    <td >State:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.billAddState }"/></span></td>
										    </tr>
										    <tr>
											    <td >Zip Code:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.billAddZip }"/> <c:out value="${orderBean.reqCart.billAddZipSfx }"/></span></td>
										    </tr>
										    <tr>
											    <td >Country:</td>
											    <td><span class="desc"><c:out value="${orderBean.reqCart.billAddCountry}"/></span></td>
										    </tr>
									    </table>
									    </div>
								    </td>
							    </tr>	
							    <c:if test="${orderBean.dealerFlag != 'N' && !orderBean.cnsFound }">
								    <tr>
									    <td valign="top" colspan="2">
										    <div class="vehInfBorder">
											    <div class="vehInf vehInfInner100" >
											    	<span>Dealership</span>
											    </div>
											    <table class="leftSpacing tableWidth100" cellpadding="4">
												    <tr>
												    	<td colspan="2" align="center">&nbsp;</td>
												    </tr>
												    <tr>
												    	<td colspan="2" align="center">
												    		<c:choose>
												    		<c:when test="${orderBean.allowOrdering == 'Y' }">
												    			<button type="button" onClick="showArrowBox();" title="Find Dealership Button">Find Dealership</button>
												    		</c:when>
												    		<c:otherwise>
												    			This feature is disabled until the contract for the selected manufacturer/model becomes available.
												    		</c:otherwise>
												    		</c:choose>												    		
												    	</td>
												    </tr>
												    <tr>
													    <td width="30%">
													    	<label for="dealerName">Dealership Name:</label>
													    </td>
												    	<td>
												    		<input type="text" id="dealerName" name="dealerName" title="dealdealerNamername" value="${orderBean.dealerInfo.dealerName }"  size="35" maxlength="60" class="address" readonly/>
												    	</td>
												    </tr>
												    <tr>
													    <td ><label for="dealerStreet">Address:</label></td>
													    <td><input type="text" id="dealerStreet" name="dealerstreet" title="street" value="${orderBean.dealerInfo.street }"  size="35" maxlength="60" class="address"  readonly/></td>
												    </tr>
												    <tr>
													    <td ><label for="dealercity">City:</label></td>
													    <td><input type="text" id="dealerCity" name="dealercity" title="city" value="${orderBean.dealerInfo.city }"  size="35" maxlength="60" class="address" readonly /></td>
												    </tr>
												    <tr>
													    <td ><label for="dealerState">State:</label></td>
													    <td><input type="text" id="dealerState" name="dealerstate" title="state" value="${orderBean.dealerInfo.state }"  size="2" maxlength="2" class="box40"  readonly/></td>
												    </tr>
												    <tr>
													    <td ><label for="dealerZipCode">Zip Code:</label></td>
													    <td><input type="text" id="dealerZipCode" name="dealerzipCode" title="zipCode" value="${orderBean.dealerInfo.zipCode }"  size="5" maxlength="5" class="address"  readonly/></td>
												    </tr>
												    <tr>
													    <td ><label for="dealerTelephone">Telephone No.:</label></td>
													    <td><input type="text" id="dealerTelephone" name="dealertelephone" title="telephone" value="${orderBean.dealerInfo.telephone }"  size="10" maxlength="10" class="address"  readonly/></td>
												    </tr>									    
											    </table>
										    </div>
									    </td>							    
								    </tr>
							    </c:if>						     
							    <tr>
							    	<td colspan="2" align="center">&nbsp;</td>
							    </tr>
							    <tr>
							    	<td colspan="2" align="center">
							    		<c:choose>
							    			<c:when test="${orderBean.action == 'Edit' }">
							    				<input  type="button" class="greenDiv" value="Update Pending Order" onclick="ValidateAll(this);" title="Update Pending Order Button">
							    			</c:when>
							    			<c:otherwise>
							    				<input  type="button" class="greenDiv" value="Add to Pending Orders" onclick="ValidateAll(this);" title="Add Pending Order Button">
							    				&nbsp;&nbsp;&nbsp;&nbsp;
							    				<input  type="button" class="greenDiv" value="Save Incomplete" onclick="sendIncomplete();" title="Save as Incomplete Button">
							    			</c:otherwise>
							    		</c:choose>							    		
							    	</td>
							    </tr>
						    </table>
						    <input type="hidden" id="reqCart.dealerCode" name="reqCart.dealerCode" value="${orderBean.reqCart.dealerCode }" />
						    <input type="hidden" id="stateList" name="stateList" value=""/>
						    <input type="hidden" id="reqCart.boac" name="reqCart.boac" value=""/>
						    <div class="arrow_box">
								<span><img class="closeImg" src="resources/img/close.png" alt="close image" title="close image"></span>
								<div class="errorContent">
									<table width="100%" border="0">
										<tr colspan="2"><span class="titleText">Dealership Locator</span></tr>
										<tr colspan="2"><br>										
										 <br></tr>
										  <tr>
										    <td style="width:20%; text-align:right;"><label for="dealerStateSelect">State:</label> </td>
										    <td style="width:80%;">
										    	<select id="dealerStateSelect" onchange="loadDealerCityList(this);" title="Dealer Select Box - State">
										    	</select>
										    </td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerCitySelect">City:</label> </td>
										    <td>
										    	<select id="dealerCitySelect" onchange="loadDealerDealerList(this.value);"  title="Dealer Select Box - City">
										    	</select>
										    </td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerDealerSelect">Dealer/Street:</label></td>
										    <td>
										    	<select  id="dealerDealerSelect" onchange="loadDealerSelectInfo(this.value);" title="Dealer Select Box - Address">
										    	</select>
											</td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerNameDisplay">Dealer Name:</label></td>
										    <td>
										    	<input type="text" id="dealerNameDisplay" value="" size="60" readonly title="Dealer Select Box - Display Name"/>
										    	<input type="hidden" id="dealerCodeDisplay" value="" readonly/>
										    </td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerStreetDisplay">Address:</label></td>
										    <td><input type="text" id="dealerStreetDisplay" value="" size="60"  readonly title="Dealer Select Box - Display Address"/></td>
										  </tr>
										  <tr>
										    <td></td>
										    <td>
										    	<input type="text" id="dealerCityDisplay" value="" readonly title="Dealer Select Box - Display city" />, 
										    	<input type="text" id="dealerStateDisplay" value="" readonly title="Dealer Select Box - Display state"/>&nbsp;
										    	<input type="text" id="dealerZipDisplay" value="" readonly title="Dealer Select Box - Display zip"/></td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerCountryDisplay">Country:</label></td>
										    <td><input type="text" id="dealerCountryDisplay" value="" readonly title="Dealer Select Box - Display Country"/></td>
										  </tr>
										  <tr>
										    <td style="text-align:right;"><label for="dealerTelephoneDisplay">Phone Number:</label></td>
										    <td><input type="text" id="dealerTelephoneDisplay" value="" readonly title="Dealer Select Box - Display Phone Number"/></td>
										  </tr>
									</table>
									
									<table width="100%" border="0" align="center">
										  <tr >
										    <td align="center"><br>
										    	<input  type="button" class="greenDiv" value="OK" onclick="loadDealerFormInfo('Load');" title="Dealer Select Button - OK">
										   		<input  type="button" class="greenDiv" value="Blank Dealer" onclick="loadDealerFormInfo('Empty');" title="Dealer Select Button - Blank Dealer">
										   		<input  type="button" class="greenDiv" value="Cancel" onclick="cancelDealerSelect();" title="Dealer Select Button - Cancel">
										   	</td>
										  </tr>
									</table>
									<br>
								</div>
							</div>

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