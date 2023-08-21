<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 11:30 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<jsp:include page="/layouts/free/header.jsp"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/new/servicios.css"/>

	<title>Title</title>
</head>
<body>
<jsp:include page="/layouts/free/nav.jsp"/>

<main>
		<div class="contenedor">

<c:forEach var="team" items="${teams}" varStatus="s">
		<a href="">
		<div class="card">
			<img src="atlas.jpg">
			<span style="font-size: .8rem"><c:out value="${team.name_team}"/></span>
		</div>
		</a>
</c:forEach>
	</div>

	</main>
	
</body>
</html>
