<html>
<head>
<script src="${pageContext.request.contextPath}/jscript/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/jscript/jquery-ui.min.js"></script>

</head>
<script>
$(document).ready(function(){
	alert('hi')
	$('#test').click(function(){
		document.location.href="/";});
})


</script>
<span id="test">Go to homepage</span>
</html>