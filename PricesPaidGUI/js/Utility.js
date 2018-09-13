

    if (!Array.prototype.forEach) {
	Array.prototype.forEach = function (fn, scope) {
            'use strict';
            var i, len;
            for (i = 0, len = this.length; i < len; ++i) {
		if (i in this) {
                    fn.call(scope, this[i], i, this);
		}
            }
	};
    }


function numberWithCommas(x) {
    if (x) {
      var parts = x.toString().split(".");
      parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
      return parts.join(".");
   } else {
      return "NA";
   }
}


function medianSortedValues(values) { 
    if (values.length != 0) {
	var half = Math.floor(values.length/2);
	if(values.length % 2) {
            return parseFloat(values[half]["unitPrice"]);
	} else {
	    return (parseFloat(values[half-1]["unitPrice"]) +
		    parseFloat(values[half]["unitPrice"])) / 2.0;
	}
    } else {
	return 0.0;
    }
}


function handleEmptyResults(dataFromSearch) {
// If we timed out or failed to authenticate, we need to alert the user.
//    var search = $('#small_search_string').val();
    if (!(dataFromSearch != null && typeof dataFromSearch === 'object')) {
		 return [];
    }
    if ((typeof dataFromSearch) == 'undefined') {
		 return []
    }
    if (dataFromSearch[0] === undefined) {
		 return [];
    }
    if (dataFromSearch[0]["status"] && (dataFromSearch[0]["status"] == "BadAuthentication")) {
        //alert("Unable to Authenticate. Probably your session timed-out. Please log in again.");	 
        alert("Your session has been timed-out based upon GSA Security Policy. Please click OK to be redirected to the login page to start a new session.");

         return [];
    }
    return dataFromSearch;
}

function htmlEscape(str) {
    return String(str)
            .replace(/&/g, '&amp;')
            .replace(/"/g, '&quot;')
            .replace(/'/g, '&#39;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;');
}
