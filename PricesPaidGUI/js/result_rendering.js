// These are specific to our result-rendering.

 function format_transactionData(transactionData) {
        var transactionData_copy = []
        jQuery.extend(true,transactionData_copy,transactionData)
        for (var i = 0; i < transactionData_copy.length; i++){
                unitPrice =  numberWithCommas(transactionData_copy[i]['unitPrice'].slice(0,-2))
                extendedPrice =  numberWithCommas(transactionData_copy[i]['Extended Price'].slice(0,-2))
		transactionData_copy[i]['Quantity'] = parseInt(transactionData_copy[i]['Quantity'].toString())
                transactionData_copy[i]['unitPrice'] = '$' +  unitPrice
                transactionData_copy[i]['Extended Price'] = '$' +  extendedPrice
        }
        return transactionData_copy
}

function refreshSort(grid,transactionData,col,ord,currentPage) {
    sortByColumnAndRedraw(transactionData,col,ord,currentPage);
    grid.setData(transactionData);
    grid.invalidateAllRows();
    grid.render();
    redrawDetailArea(transactionData,currentPage);
}


function sortByColumn(transactionData,col,asc) {
    // We need to reset the currentPage when we sort
    var currentSortCol = col;
    var isAsc = asc;
    var stringSort = function(a,b) {
	var ret;
	if (a[currentSortCol] < b[currentSortCol]) {
	    ret = 1;
	} else if (a[currentSortCol] > b[currentSortCol]) {
            ret = -1;
	} else {
            ret = 0;
	}
	if (isAsc) 
	    return -1*ret;
	else 
	    return ret;
   }
    var numberSort = function(a,b) {
	var ret;
	if (parseFloat(a[currentSortCol]) < parseFloat(b[currentSortCol])) {
	    ret = 1;
	} else if (parseFloat(a[currentSortCol]) > parseFloat(b[currentSortCol])) {
            ret = -1;
	} else {
            ret = 0;
	}
	if (isAsc) 
	    return -1*ret;
	else 
	    return ret;
    }
    transactionData.sort(currentSortCol == "unitPrice" || 
			 currentSortCol == "Quantity" || currentSortCol == "Extended Price" ? numberSort : stringSort);
    return transactionData;
}

function sortByColumnAndRedraw(transactionData,col,asc,currentPage) {
    sortByColumn(transactionData,col,asc);
    redrawDetailArea(transactionData,currentPage);
}

function refreshSort(grid,transactionData,col,ord,currentPage) {
    sortByColumnAndRedraw(transactionData,col,ord,currentPage);
    grid.setData(transactionData);
    grid.invalidateAllRows();
    grid.render();
    redrawDetailArea(transactionData,currentPage);
}



    function redrawDetailArea(transactionData,page,render_delete) {
	var detailAreaDiv = $("#"+'detailArea');
	detailAreaDiv.empty();
	var smallSlice = transactionData.slice(page*PAGESIZE,
Math.min((page+1)*PAGESIZE,transactionData.length));
	smallSlice.forEach(function (e,i,a) {
            detailAreaDiv.append(renderStyledDetail(e,SCRATCH_NUMBER,render_delete));
	    //$(document).on( "click", "#scratch"+SCRATCH_NUMBER  , detailItemHandler);
	    $(document).on( "click", "#scratch"+SCRATCH_NUMBER + "    #expand" , detailItemHandler);
	    $("img[delete_id='"+e.p3id+"']").click(function () {
		var content_key = $(this).attr('delete_id');
                var deco = HANDLER_NAMESPACE_OBJECT.portfolio_url;
		var portfolio = PAGE_CONTEXT.portfolio_name;
                 $.post(deco+"/delete_association/"+portfolio+"/"+content_key,
			HANDLER_NAMESPACE_OBJECT.portfolio_post_data,
			HANDLER_NAMESPACE_OBJECT.decoration_deleted_function
                       ).fail(function() { alert("The addition of that record to the content_area portfolio failed."); });

            });
	    itemDetailAssociation[SCRATCH_NUMBER] = i+page*PAGESIZE;
	    SCRATCH_NUMBER++;
	});

// Now we must make the drag/drop work.
       //$( ".droppablerecord" ).droppable({
       //    tolerance: "touch",
       //    drop: function(event, ui) {
	       
       //        var text = ui.draggable.attr('id').substring("draggable-id-".length);
       //          var portfolio = isPortfolio(text);
       //	 var key = $(this).attr('p3id');
       //          var deco = (portfolio) ? HANDLER_NAMESPACE_OBJECT.portfolio_url
       //		                        : HANDLER_NAMESPACE_OBJECT.tag_url;
       //          $.post(deco+"/add_record/"+text+"/"+key,
       //	        function () {
       //		    $(HANDLER_NAMESPACE_OBJECT.decoration_add_dialog_id).dialog('open');
       //			}
       //                  ).fail(function() { alert("The addition of that record to the content_area portfolio failed."); });
       //      }
	//});

       //$( ".droppablerecord" ).draggable({ revert: true });

    }
