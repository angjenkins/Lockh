<div class="col-md-3">
	<div class="leftDiv">
		<div class="leftDivHeader">
			<h4 class="leftDivHeading">Vehicle Type</h4>
		</div>
		<ul class="leftMemu parent">
			<c:forEach items="${commonBean.autoChoiceVehTypeMap}" var="columns">
				<li><a href="javascript:void(0)"> <c:out
							value="${columns.key}" /></a>
					<ul class="leftSubMenu child">
						<c:forEach items="${columns.value}" var="child">
							<li class="leftMnuSubList">
							<a href="/AutoChoice/StdItem/${child.vehType}">
									<c:out value="${child.description}" />
							</a></li>
						</c:forEach>
					</ul></li>
			</c:forEach>



		</ul>
	</div>
</div>
