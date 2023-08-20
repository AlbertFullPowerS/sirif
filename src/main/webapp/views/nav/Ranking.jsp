<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 11:29 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/layouts/free/header.jsp"/>

    <title>Title</title>
</head>
<body>
<jsp:include page="/layouts/free/nav.jsp"/>
<table>
    <tr>
        <th>Posición</th>
        <th></th>
        <th>Jugador</th>
        <th>Goles</th>
    </tr>
    <tr>
        <td>1</td>
        <td>
            <img src="Imagenes/vega.jpg" alt="Foto Jugador 1" class="player-photo">
        </td>
        <td class="player-details">
            <div>
                <p>Alexis Vega</p>
                <img src="Imagenes/guadalajara.png" alt="Logo Equipo 1" width="30" height="30">
                <p>Guadalajara</p>
            </div>
        </td>
        <td>10</td>
    </tr>


</table>
</body>
</html>
