
function upperCase(elem){
	elem.value = elem.value.toUpperCase();
}





/*

Version: 3.0.1
--------------
Functionality Added:
- getRadioVal(vField)

*/

/*
// -------------------- checks for required fields ----------------------------
function checkForm() {
	ret = true
	with(document.mainForm) {
		emptyField(name)
		emptyField(phone)
		if ((checkRadio(groupRadio)) && ret) {
			alert('Please select a radio Sample.')
			ret = false
		}
		if (!(checkSelect(selectOne)) && ret) {
			alert('Please select a Select Sample.')
			ret = false
		}		
	}
	return (ret)
}

function emptyField(vField) {
	if (vField.value == "" && ret) {
		alert(vField.name + ' is a required field.')
		ret = false
	}
}
*/

/* Javascript library 

1. isNull(vField) - returns true or false .. eg: if (isNull(lastName)) alert('Enter blah')
2. upper(vField)  - returns the value into uppercase .. eg: alert(upper(lastName))
3. valEmail(vField) - returns true of false .. eg: onchange="valEmail(emailAddr)"
4. formatPhone(vField) - returns true or false .. eg: onchange="formatPhone(phone)"
5. valDate(vField) - returns true or false .. eg: onchange="valDate(dateField)"
6. valZip(vField) - returns true or false .. eg: onchange="valZip(zipField)" Validates field is a zip code only 0-9 and the "-"
7. removeHttp(vField) - returns the value into this eg: onchange="removeHttp(vField)" Removes the 'http://' portion of URL from FIELD
8. chgString(vField) - returns the value of the field with first char converted to upper case .. eg: onchange="chgString(vField)"
9. checkSelect(vField) - returns true of false .. eg: if(!(checkSelect(vField))) alert("Please select one")
10. getSelectVal(vField) - returns the value .. eg: alert(getSelectVal(vField))
11. checkRadio(vField) - returns true or false .. eg: if(checkRadio(vField)) alert("Please select one")
12. getRadioVal(vField) - returns the value .. eg: alert(getRadioVal(vField))
13. round(vField,X) - returns the value .. val must be integer or number eg: alert(round(tmp))

14. trim(vString) - trims for spaces .. eg: alert(trim(lastname.value))
15. isNumOnly(vString) - returns true or false .. eg: if(isNumOnly(num.value)) alert('All Numbers')
18. isCharOnly(vString) - returns true or false .. eg: if(isCharOnly(char.value)) alert('All Char')
22. isRemDollar(vString) - returns true or false .. eg: if(isRemDollar(dol.value)) alert('No Dollar')
19. removeCommas(vString) - returns the value .. eg: alert(removeCommas(vString))
20. formatCurrency(number) - returns the value .. must be number eg: alert(formatCurrency(dollarVal.value))
21. isDate(vDateString) - returns true or false .. eg: if (isDate(tmpField.value)) alert('True Date')
22. formatDate(vDate) - returns the value .. Formats the date 'Mon-dd-yyyy' eg: alert(formatDate(test.value))
23. isDecimal(vstring) - returns true or false ..eg  123456.99, -2323.22
*/

// --------------------  isNull ----------------------------
function isNull(vField) {
	var ret = false;
	vField.value = trim(vField.value);

	if (vField.value.length == 0)
		ret = true;

	return(ret);
}

// --------------------  upper ----------------------------
function upper(vField) {
	vField.value = vField.value.toUpperCase();	  	
}

// --------------------  valEmail ----------------------------
function valEmail(vField)
{
	ret = true;
	vEmail = vField.value;

	//If field has valid chars check format
	if((trim(vEmail)).length > 1)	
	{
		if(!(vEmail.indexOf("@")>0) || !(vEmail.indexOf(".")>0))
		{
			alert("Email is not in valid format. \n\n account@domain.com");
			ret = false;
			vField.value = "";
			vField.focus();
		}
	} else {
		//values are spaces, clear the field.
		vField.value = "";
		ret = false;
	}
	return (ret);
}

// --------------------  formatPhone ----------------------------
function formatPhone(vField)
{
  var vString = vField.value;
  var nString = "";
  var retVal = true;

  for(i=0;i<vString.length;i++) {
	 if(isNumOnly(vString.charAt(i)) && (vString.charAt(i) != " ")) {
		nString += vString.charAt(i);
	 }
  }

  if(nString.length == 10) {
	 nString = "("+nString.substring(0,3)+") "+nString.substring(3,6)+"-"+nString.substring(6,10);
	 vField.value = nString;

  } else if(nString.length < 10 && vString.length > 0) {
		alert("Enter a phone number with at least 10 digits.");
		vField.focus();
		retVal = false;
  }
  return(retVal);
}

// --------------------  valDate ----------------------------
function valDate(vField)
{
	var ret = true;
	if (!isDate(vField.value)) 	{
		alert("Please enter a valid date.");
		vField.value = "";
		vField.focus();
		ret = false;
	} else {
		vField.value = formatDate(new Date(vField.value));    
	}
	return(ret);
} 

// --------------------  valZip ----------------------------
//Validates field is a zip code only 0-9 and the "-"
function valZip(vField)
{
	var vString = vField.value;
	var retVal = true;

	for(i=0;i<vString.length;i++)
	{
		if(!isNumOnly(vString.charAt(i)) && (vString.charAt(i) != "-"))
	 {
		alert("Not a valid zip code.");
		vField.value = "";
		retVal = false;
		break;
	 }
	}
	return(retVal);
}

// --------------------  removeHttp ----------------------------
//Removes the 'http://' portion of URL from FIELD
function removeHttp(vField)
{
	var vString = vField.value;

	if(!vString.indexOf("http://") || !vString.indexOf("HTTP://"))
		vField.value = vString.substring(7,vString.length);  
}

// --------------------  chgString ----------------------------
function chgString(vField) {
	vString = vField.value;
	firstChar = vString.substring(0,1);
	restString = vString.substring(1,vString.length);
	finalString = firstChar.toUpperCase() + restString.toLowerCase();
	vField.value = finalString;
}

// --------------------  checkSelect ----------------------------
//Checks whether the select list is selected
function checkSelect(vField)
{
	var ret = true;
	if (vField.selectedIndex == 0)
		ret = false;
	return(ret);
}

// --------------------  getSelectVal ----------------------------
//Gets the value from the select list
function getSelectVal(vField)
{
	var ret = vField.options[vField.selectedIndex].value;
	return(ret);
}

// --------------------  checkRadio ----------------------------
//Checks for radio group
function checkRadio(vField) {
	noRadio = true;
	for (i=0;i<vField.length;i++) {
		if (vField[i].checked) {
			noRadio = false;
			i = vField.length;
		}
	}
	return(noRadio);
}

// --------------------  getRadioVal ----------------------------
//Get for radio value
function getRadioVal(vField) {
	radioVal = '';
	for (i=0;i<vField.length;i++) {
		if (vField[i].checked) {
			radioVal = vField[i].value;
			i = vField.length;
		}
	}
	return(radioVal);
}

// --------------------  trim ----------------------------
function trim(vString)
{  
	var tString = vString;

	//trim left spaces
	if (tString.charAt(0) == " ")
		tString = trim(tString.substring(1, tString.length));

	//trim right spaces
	if (tString.charAt(tString.length-1) == " ")
		tString = trim(tString.substring(0, tString.length-1));

	return(tString);
}

// --------------------  isNumOnly ----------------------------
//Checks to see if a string contains only numbers
function isNumOnly(vString)
{
	var NUMBERS = "0123456789";
	var valid = true;

	for(var i=0;i<vString.length;i++)
		if(NUMBERS.indexOf(vString.charAt(i))<0)
			valid = false;

	return(valid);
}


//Checks to see if a string contains only numbers
function isDecimal(vString)
{
	var NUMBERS = "0123456789.-";
	var valid = true;

	for(var i=0;i<vString.length;i++)
		if(NUMBERS.indexOf(vString.charAt(i))<0)
			valid = false;

	return(valid);
}

// --------------------  isCharOnly ----------------------------
//Checks to see if a string contains only characters
function isCharOnly(vString)
{
	var CHARS = "abcdefghijgklmnopqrstuvwxyzABCDEFGHIJGKLMNOPQRSTUVWXYZ";
	var valid = true;

	for(var i=0;i<vString.length;i++) 
		if(CHARS.indexOf(vString.charAt(i))<0)
			valid = false;
	return(valid);
}

// --------------------  isRemDollar ----------------------------
//Checks to see if a the valid format for numbers 
function isRemDollar(vString)
{
	var DOLLAR = "0123456789.,";
	var valid = true;

	for(var i=0;i<vString.length;i++){
		if(DOLLAR.indexOf(vString.charAt(i))<0)
			valid = false;
	}
	
	return valid;
}

// --------------------  removeCommas ----------------------------
function removeCommas(vString) {  
	var tString = vString;
	for (i=0;i<tString.length;i++) {
		if (tString.charAt(i) == ",") {
			tString = tString.substring(0,i) + tString.substring(i+1,tString.length);
		}
	}
	
	for (i=0;i<tString.length;i++) {
		if (tString.charAt(i) == "$") {
			tString = tString.substring(0,i) + tString.substring(i+1,tString.length);
		}
	}
	return(tString);
}

// if count return more than 1, should be an error.
function countDecimalPoint(vString) {  
	var tString = vString;
	var count = 0;
	for (i=0;i<tString.length;i++) {
		if (tString.charAt(i) == ".") {
			count ++;
		}
	}
	if (count > 1){
		return false;
	}
 return true;
}


function removeCharacter(vString,char) {  
	var tString = vString;
	for (i=0;i<tString.length;i++) {
		if (tString.charAt(i) == char) {
			tString = tString.substring(0,i) + tString.substring(i+1,tString.length);
		}
	}
	return(tString);
}


// --------------------  round ----------------------------
// val must be integer or number
function round(vField,X) {
	// rounds number to X decimal places, defaults to 2
	X = (!X ? 2 : X);
	val = vField;
	vField = Math.round(val*Math.pow(10,X))/Math.pow(10,X);
	return(vField);
}

// --------------------  formatCurrency ----------------------------
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
							strRight = strRight + "0";
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
return(finalValue);
}

// --------------------  isDate ----------------------------	
function isDate(vDateString)
{
	var d = new Date(vDateString);
	var ret = true;

	if (isNaN(d))
		ret = false;

	return(ret);
}

function getFullYear1(vDate) {
	var y =vDate.getYear();
	if (y<1000) {
		if (y>50)
			y += 1900;
		else
			y += 2000;
	}
	return y;
}

// --------------------  formatDate ----------------------------
//Formats the date 'Mon-dd-yyyy'
function formatDate(vDate)
{  
	return((vDate.getMonth()+1)+"/"+vDate.getDate()+"/"+getFullYear1(vDate));
}



//Checks to see if a string contains only characters
function isCharNumOnly(vfield)
 
{   
	var CHARS = "abcdefghijgklmnopqrstuvwxyzABCDEFGHIJGKLMNOPQRSTUVWXYZ1234567890";
	var valid = true;
   
   
    
	for(var i=0;i<vfield.value.length;i++) {
		if(CHARS.indexOf(vfield.value.charAt(i))<0) {
			valid = false;
	   } 
	}   
	if ( valid == false) {
		alert('Invalid '+ vfield.value +' characters! Valid characters are '+CHARS);

  		vfield.focus();
	}		
    
	
	return(valid);
   
}



