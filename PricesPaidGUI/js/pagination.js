// destroy pagination  if it exists and recreate...
// This is needed to keep jqPaginate from getting confused, 
// I don't know why.  I should send them email about it.
function recreatePagination() {
    var html = "";
    html += '<div class="large pagination">';
    html += '<a href="#" class="first" data-action="first" title="first page" alt="first page">&laquo;</a>';
    html += '<a href="#" class="previous" data-action="previous" title="previous page" alt="previous page">&lsaquo;</a>';
    html += '<label style="display:none" for="pag">pagination</label>';
    html += '<input type="text" readonly="readonly" data-max-page="40" id="pag" name="pag"/>';
    html += '<a href="#" class="next" data-action="next" title="next page" alt="next page">&rsaquo;</a>';
    html += '<a href="#" class="last" data-action="last" title="last page" alt="last page">&raquo;</a>';
    html += '</div>';
    $('#paginationHolder1').html(html);

// TODO:  uncomment this when we have a way to synchronzie the paginators
//    $('#paginationHolder2').html(html);
}
