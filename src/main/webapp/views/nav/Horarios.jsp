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


    <title>Title</title>
</head>
<body style="background-color: white">
<jsp:include page="/layouts/free/nav.jsp"/>
<table id="tablaDatos" style="display: none;">
    <tr>
        <th>equipo1</th>
        <th>equipo2</th>
        <th>horaInicio</th>
        <th>horaFin</th>
        <th>diaPartido</th>
    </tr>
<c:forEach var="matche" items="${matches}" varStatus="s">
    <tr>
        <td><c:out value="${matche.team.name_team}"/></td>
        <td><c:out value="${matche.team1.name_team}"/></td>
        <td><c:out value="${matche.start_hour}"/></td>
        <td><c:out value="${matche.end_hour}"/></td>
        <td><c:out value="${matche.date_match}"/></td>
    </tr>
</c:forEach>
    <!-- Agrega más filas según sea necesario -->
</table>
<div id="contenedorTarjetas" class="row justify-content-md-center" style="margin: 2rem;">
</div>

<script src="${pageContext.request.contextPath}/assets/js/Horaios.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>

</body>
</html>
