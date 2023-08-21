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
		<a  class="touch" data-set ="<c:out value="${team.id_team}"/>">
		<div class="card">
			<img src="atlas.jpg">
			<span style="font-size: .8rem"><c:out value="${team.name_team}"/></span>
		</div>
		</a>
</c:forEach>
	</div>
	<form action="${pageContext.request.contextPath}/Teams" id="form">
		<input type="hidden" id="id" name="id">
	</form>
	</main>
	

<div class="wrapper">
  <h1>Jugadores</h1>
  <div class="cols">
<c:forEach var="player" items="${players}" varStatus="s">

			<div class="col" ontouchstart="this.classList.toggle('hover');">
				<div class="container">
					<div class="front" style="background-image: url(https://unsplash.it/500/500/)">
						<div class="inner">
							<p><c:out value="${player.name}"/></p>
              <span><c:out value="${player.playe6r_position}"/></span>
						</div>
					</div>
					<div class="back">
						<div class="inner">
						  <p><c:out value="${player.dorsal}"/></p>
						</div>
					</div>
				</div>
			</div>
</c:forEach>




		</div>
 </div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>

	$(document).ready(function() {
		let teamsList = document.querySelectorAll(".touch");

		teamsList.forEach((row, index) => {
			row.addEventListener('click', () => {
				document.getElementById("id").value = row.dataset.set;
				document.getElementById("form").submit();

			});
	});
	});
</script>
</body>
</html>
