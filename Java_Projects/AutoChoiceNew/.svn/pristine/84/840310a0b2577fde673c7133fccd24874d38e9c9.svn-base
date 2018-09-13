<%@ include file="includeTop.jsp"%>
<html>
<head>
<%@ include file="includeHead.jsp"%>
<script>
$(document).ready(function(){
	$('th').click(function(){
	    var table = $(this).parents('table').eq(0)
	    var rows = table.find('tr:gt(0)').toArray().sort(comparer($(this).index()))
	    this.asc = !this.asc
	    if (!this.asc){rows = rows.reverse()}
	    for (var i = 0; i < rows.length; i++){table.append(rows[i])}
	    table.find('tr').removeClass('alternateRow');
	    table.find('tr:nth-child(odd)').addClass('alternateRow');
	})
	function comparer(index) {
	    return function(a, b) {
	        var valA = getCellValue(a, index), valB = getCellValue(b, index)
	        return $.isNumeric(valA) && $.isNumeric(valB) ? valA - valB : valA.localeCompare(valB)
	    }
	}
	function getCellValue(row, index){ return $(row).children('td').eq(index).html() }
});
</script>
<style>
	.tableHeader th {
	padding: 2.5px;
	text-align:center;
	font-size:12px;
	}
	.wmd-view-topscroll{
	position:fixed;
	bottom:0;
	right:2.4%;
	}
</style>
</head>
<body class="fsrBody">		
	<br>
	<div id="bodyContent">
		<%@ include file="includeBanner.jsp"%>
		<div class="row">
		<div class="col-md-12 mainContent">
		<div style="overflow-x:scroll ;">
		<div style="display: inline-block;">
		<table style="width:97%; padding:5px;">
			<tr>
				<td style="text-align: center;"><span class="titleText">FSR Build Report Results</span></td>			
			</tr>
			<c:if test="${fn:length(fsrBean.returnMessage) > 0 }">
				<tr>
					<td style="text-align:center;"><c:out value="${fsrBean.returnMessage }"/></td>
				</tr>										
			</c:if>
			<tr>
				<td>
					<form:form commandName="fsrBean" modelAttribute="fsrBean" method="post" name="myForm">
						<div class="wmd-view-topscroll">
						    <div class="scroll-div1">
						    </div>
						</div>
						<div class="vehInfBorder vehInfoFixed">						
						<table id="fluidTable" class="vehQtyTable tableWidth100 font11 tableCellPadding">
							<thead>
								<tr class="tableHeader" >
									<c:forEach items="${fsrBean.reportBuilderResult[0]}" var="column">
										<th style="cursor:n-resize;"><c:out value="${column.key}" /></th>
									</c:forEach>
								</tr>						
							</thead>
							<tbody>
								<c:forEach varStatus="status" items="${fsrBean.reportBuilderResult}"	var="columns">						
									<tr <c:if test="${status.count%2 eq 0 }">class="alternateRow"</c:if>>
										<c:forEach items="${columns}" var="column">
											<td><c:out value="${column.value}" /></td>
										</c:forEach>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						</div>
					</form:form>
					
				</td>
			</tr>
		</table>
		</div>
		</div>
		</div>
		</div>
	</div>
	<%@ include file="includeFooter.jsp"%>
	<script type="text/javascript">
		var menu=new menu.dd("menu");
		menu.init("menu","menuhover");
		$(function(){
			var tableWidth=$("#fluidTable").width();
			$(".scroll-div1").width(tableWidth);
			var rightSideWidth=$(".col-md-9").width();
			$(".wmd-view-topscroll").width(rightSideWidth);
			if(tableWidth<=rightSideWidth){
				$(".wmd-view-topscroll").hide();	
			}
		    $(".wmd-view-topscroll").scroll(function(){
		        $(".vehInfoFixed")
		            .scrollLeft($(".wmd-view-topscroll").scrollLeft());
		    });
		    
		   
		});
	</script>	
</body>
</html>