<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="page-header">
	<!-- <img src="resources/img/logo.jpg" width="94" height="73">    -->
	<div class="logoDiv">
		<c:choose>
			<c:when
				test="${(commonBean.loggedinUser==null)||(fn:trim(commonBean.loggedinUser)=='')}">
				<a href="/AutoChoice/Home"><img class="logoImg"
					alt="Logo: GSA, AutoChoce, www.autochoice.gsa.gov"
					src="<c:url value="/resources/img/logo_4.jpg" />"></a>
			</c:when>
			<c:otherwise>
				<a href="/AutoChoice/StdItem"><img class="logoImg"
					alt="Logo: GSA, AutoChoce, www.autochoice.gsa.gov"
					src="<c:url value="/resources/img/logo_4.jpg" />"></a>
			</c:otherwise>
		</c:choose>
	</div>
	<ul role="navigation" class="nav navbar-nav navbar-right">
		<c:choose>
			<c:when
				test="${(commonBean.loggedinUser!=null)&&(fn:trim(commonBean.loggedinUser)!='')}">
				<li><a>Logged in User: <font color="#004e87">${commonBean.loggedinUser}</font></a></li>
				<li><a href="/AutoChoice/MyProfile">My Profile</a></li>
				<li><c:choose>
						<c:when
							test="${fn:contains(requestScope['javax.servlet.forward.request_uri'], 'ChangePassword')}">
							<a href="#">Change Password</a>
						</c:when>
						<c:otherwise>
							<a href="/AutoChoice/ChangePassword">Change Password</a>
						</c:otherwise>
					</c:choose></li>
			</c:when>
		</c:choose>


		<li><a href="#">Documentation/Links</a></li>
		<c:choose>
			<c:when
				test="${(commonBean.loggedinUser!=null)&&(fn:trim(commonBean.loggedinUser)!='')}">
				<li><a href="/AutoChoice/Logout" class="navActive">Logout</a></li>
			</c:when>
		</c:choose>
	</ul>
</div>