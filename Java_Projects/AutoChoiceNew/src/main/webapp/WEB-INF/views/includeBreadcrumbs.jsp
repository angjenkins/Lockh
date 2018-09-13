<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<ul id="breadcrumbs-one">
	<div id="breadcrumb">
		<ul class="crumbs">
			<li class="first"><a class="zindex9" href="#"><span></span>Place
					Orders</a></li>
			         <li><a class="zindex8" href="#"><c:out value="${orderBean.selectionBy}"/></a> </li>
			         <li><a class="zindex7" href="/AutoChoice/StdItem/${orderBean.vehType}"> <c:out value="${orderBean.vehDescription}"/></a> </li>
			       
		</ul>
	</div>
</ul>
<div class="clrDiv"></div>
