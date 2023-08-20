<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 11:29 a. m.
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
<h3>Goles</h3>
<table class="table-light table-striped">


    <tr>
        <th>Posición</th>
        <th></th>
        <th>Jugador</th>
        <th>Goles</th>
    </tr>


<c:forEach var="player" items="${listGoals}" varStatus="s">
    <tr>
        <td><c:out value="${s.count}"/></td>
        <td>
            <img src="Imagenes/vega.jpg" alt="Foto Jugador 1" class="player-photo">
        </td>
        <td class="player-details">
            <div>
                <p><c:out value="${player.player.name}"/> <c:out value="${player.player.lastname}"/> <c:out value="${player.player.lastname2}"/></p>
                <img src="Imagenes/guadalajara.png" alt="Logo Equipo 1" width="30" height="30">
                <p><c:out value="${player.player.team.name_team}"/></p>
            </div>
        </td>
        <td><c:out value="${player.goals}"/></td>
    </tr>
</c:forEach>


</table>

<h3>Asistencia</h3>
<table class="table-light table-striped">


    <tr>
        <th>Posición</th>
        <th></th>
        <th>Jugador</th>
        <th>Asistencia</th>
    </tr>


    <c:forEach var="player" items="${listAsist}" varStatus="s">
        <tr>
            <td><c:out value="${s.count}"/></td>
            <td>
                <img src="Imagenes/vega.jpg" alt="Foto Jugador 1" class="player-photo">
            </td>
            <td class="player-details">
                <div>
                    <p><c:out value="${player.player.name}"/> <c:out value="${player.player.lastname}"/> <c:out value="${player.player.lastname2}"/></p>
                    <img src="Imagenes/guadalajara.png" alt="Logo Equipo 1" width="30" height="30">
                    <p><c:out value="${player.player.team.name_team}"/></p>
                </div>
            </td>
            <td><c:out value="${player.assistences}"/></td>
        </tr>
    </c:forEach>


</table>

<h3>Tarjetas rojas</h3>
<table class="table-light table-striped">


    <tr>
        <th>Posición</th>
        <th></th>
        <th>Jugador</th>
        <th>Tarjetas Roja</th>
        <th>Tarjetas Amarilla</th>

    </tr>


    <c:forEach var="player" items="${listCard}" varStatus="s">
        <tr>
            <td><c:out value="${s.count}"/></td>
            <td>
                <img src="Imagenes/vega.jpg" alt="Foto Jugador 1" class="player-photo">
            </td>
            <td class="player-details">
                <div>
                    <p><c:out value="${player.player.name}"/> <c:out value="${player.player.lastname}"/> <c:out value="${player.player.lastname2}"/></p>
                    <img src="Imagenes/guadalajara.png" alt="Logo Equipo 1" width="30" height="30">
                    <p><c:out value="${player.player.team.name_team}"/></p>
                </div>
            </td>
            <td><c:out value="${player.red_card}"/></td>
            <td><c:out value="${player.yel_card}"/></td>
        </tr>
    </c:forEach>


</table>
<jsp:include page="/layouts/free/footer.jsp"/>

</body>
</html>
