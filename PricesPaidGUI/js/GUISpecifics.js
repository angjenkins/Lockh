
function renderCustomField(name,fieldSeparator,value,dollarsign) {
    var html = "";
    html +=      ' <div  class="customField">';
    html +=      ' <span  class="fieldName">';
    html +=  (name in nonStandardFieldDescriptor) ? nonStandardFieldDescriptor[name] : name;
    //    html += name;

    html += fieldSeparator;

    html +=      ' </span>';
    html +=      ' <span  class="fieldValue">';
    if (dollarsign == "Y") {
        html += '$'
        html += value;
    }
    else { html += value;}
    html +=      ' </span>';
    html +=      '</div>';
    return html;
}

function renderDetailArea(dataRow,i) {
    var fieldseparator = " : ";
    var html = "";
    html +=      ' <div  class="itemDetailArea">';

    html += renderCustomField('Contract Number',fieldseparator, dataRow['Contract Number']);
    html += renderCustomField('Order Id',fieldseparator, dataRow['awardIdIdv']);
    html += renderCustomField('Ordering Agency',fieldseparator, dataRow['contractingAgency']);
    html += renderCustomField('Ordering Bureau',fieldseparator, dataRow['Bureau']);
    html += renderCustomField('Ordering Office Zip',fieldseparator, dataRow['From Zip Code']);
    html += renderCustomField('Ship to Office Zip',fieldseparator, dataRow['To Zip Code']);
    html += renderCustomField('PSC Description',fieldseparator, dataRow['PSC Description']);
    html += renderCustomField('Product Service Code',fieldseparator, dataRow['psc']);
    html += renderCustomField('U.N. Product Service Code',fieldseparator, dataRow['Unspsc Code']);
    html += renderCustomField('Vendor DUNS #',fieldseparator, dataRow['Duns Number']);
    html += renderCustomField('Ordering Process',fieldseparator, dataRow['Ordering Process']);
    html += renderCustomField('Data Source',fieldseparator, dataRow['dataSource']);
    //for (var k in dataRow) {
        //if (!((k in standardFieldDescriptor) || (k in internalFieldLabel))) {
        //if (k in displayfields) {
	//    var v = dataRow[k];
	    // This is just to see what will happen, I will have to add proper titles later.
        //    var label = (k in displayfields) ? displayfields[k] : k;
	//    html += renderCustomField(label,fieldseparator,v);
	//}
    //}

    return html;
}


function detailItemHandler(e) {
    var num = "scratch".length;
    //The expand click depends on the parent element id, this needs to be ajusted if any div is added
    $(this).text("Hide Details")
    var scratch = $(this).parent().parent().parent().attr('id').substring(num);
    var id = itemDetailAssociation[scratch];
    var expandableSection = $("#expandArea"+scratch);
    if (expandableSection.html().length != 0) {
	expandableSection.empty();
        $(this).text("Expand Details")
    } else {
	expandableSection.append(renderDetailArea(transactionData[id],id));
    }
}
function renderRow(label,content) {
    var row = "";
    row += "<tr>";
    row += "<td>";
    row += label;
    row += "</td>";
    row += "<td>";
    row += content;
    row += "</td>";
    row += "</tr>";
    return row;
}


function renderAgency(dataRow) {
    var html = "";
    html += '<div class="result-agency">';
    html += '<div class="agency-name">' + ((dataRow.contractingAgency) ? dataRow.contractingAgency.substring(0,30) : "") +"</div>";
    html += '<div>' + dataRow.orderDate +"</div>";
    html += '</div>\n';
    return html;
}
function renderVehicle(dataRow) {
    var html = "";
    html += '<div class="result-vehicle">'+dataRow.awardIdIdv+'</div>\n';
    return html;
}
function renderVendor(dataRow) {
    var html = "";
    html += '<div class="result-vendor">'+((dataRow.vendor) ? dataRow.vendor.substring(0,50) : "") +'</div>\n';
    return html;
}

function renderResultBottom(dataRow) {
    var html = "";
    html += '<div class="result-bottom">\n';
    html += renderAgency(dataRow);
    html += renderVehicle(dataRow);
    html += renderVendor(dataRow);
    html += '</div>\n';
    return html;
}

function renderResultLeft(dataRow) {
   //console.log('renderResultLeft=' + JSON.stringify(dataRow,null,4))
   var manu_name = dataRow['Manufacturer Name']
   var fieldseparator = " : ";
   var html = "";
    html += '<div>\n';
    //html += '<div class="result-short-desc">' + ((dataRow.productDescription) ? dataRow.productDescription.substring(0,60) : "") +"</div>";
    //html += '<div class="result-long-desc">' + ((dataRow.longDescription) ? dataRow.longDescription.substring(0,160) : "") +"</div>";
    //html += '<div class="result-date">' + ((dataRow['orderDate']) ? dataRow['orderDate'] : "") + "</div>";
    html += '<div class="manu-long">';
    html += renderCustomField('Product Description',fieldseparator, dataRow.productDescription);
    html += '</div>\n';

    html += '<div class="manu-name">';
    html += renderCustomField('Manufacturer Name',fieldseparator, manu_name);
    html += '</div>\n';

    html += '<div class="manu-part">';
    html += renderCustomField('Manufacturer Part Number',fieldseparator, dataRow['Manufacturer Part Number']);
    html += '</div>\n';


    html += '<div class="manu-order">';
    html += renderCustomField('Order Date',fieldseparator, dataRow['orderDate']);
    html += '</div>\n';

    html += renderCustomField('Vendor',fieldseparator, dataRow.vendor);

    html += '<div class="prices-groups">';
    html += '<div class="price-tab">';
    html += renderCustomField('Unit Price',fieldseparator, numberWithCommas(dataRow.unitPrice.slice(0,-2)),"Y");
    html += '</div>\n';

    html += '<div class="unit-tab">';
    html += renderCustomField('Unit of Issue',fieldseparator, dataRow['Unit of Issue']);
    html += '</div>\n';

    html += '<div class="quantity-tab">';
    html += renderCustomField('Qty',fieldseparator, parseInt(dataRow.Quantity.toString()));
    html += '</div>\n';

    html += '<div class="extended-tab">';
    html += renderCustomField('Extended Price',fieldseparator, numberWithCommas(dataRow['Extended Price'].slice(0,-2)),"Y");
    html += '</div>\n';

    html += '</div>\n';

    html += '<div id="expand" style="color:blue"> <u>Expand Details</u></div>';

    html += '</div>\n';
    return html;
}


function renderResultRight(dataRow,transactionId) {
   var html = "";
    html += '<div class="result-right">\n';
    html += '<div class="droppablerecord" id="'+transactionId+'"><img  title="Drag and drop on a portfolio" class="draghandle" alt="Drag Handle" src="./theme/img/icn_list.svg"></div>';
    html += '<div class="result-cost"><span class="result-cost-glyph">$</span><span class="result-cost-number">'+numberWithCommas(dataRow.unitPrice) +"</span></div>";
    html += '<div class="result-units">'+numberWithCommas(dataRow.unitsOrdered)+' Units</div>';
    if (PAGE_CONTEXT.render_transaction_delete) {
	html += '<img delete_id="'+transactionId+'" src="./theme/img/gnome_window_close.png" alt="delete" width="40px" height="40px">';
    }
    html += '</div>\n';
    return html;
}

function renderResultTop(dataRow,transactionId) {
   var html = "";
    html += '<div class="result-top">\n';
    html += renderResultLeft(dataRow);
    //html += renderResultRight(dataRow,transactionId);
    html += '</div>\n';
    return html;
}

function renderExpandArea(dataRow,scratchNumber) {
   var html = "";
    html +=      '<div style="clear:both;"></div>';
    var expandArea = "expandArea"+scratchNumber;
    html += '<span id="'+expandArea+'"></span>';
    html +=          '<div style="clear:both;"></div>';
    return html;
}

function renderStyledDetail(dataRow,scratchNumber) {
    var html = "";
    html += '<div class="result droppablerecord" id="scratch'+scratchNumber+'" p3id="'+dataRow.p3id+'">\n';
    html += renderResultTop(dataRow,dataRow.p3id);
    html += renderExpandArea(dataRow,scratchNumber);
    //html += renderResultBottom(dataRow);
    html += '</div>\n';
    return html;
}
