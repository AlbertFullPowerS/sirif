<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 11:30 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/layouts/free/header.jsp"/>

    <title>Title</title>
</head>
<body>
<jsp:include page="/layouts/free/nav.jsp"/>
<table id="tablaDatos" style="display: none;">
    <tr>
        <th>equipo1</th>
        <th>equipo2</th>
        <th>campo</th>
        <th>horaInicio</th>
        <th>horaFin</th>
        <th>diaPartido</th>
    </tr>
    <tr>
        <td>America</td>
        <td>Pumas</td>
        <td>01</td>
        <td>12:00</td>
        <td>14:00</td>
        <td>2023-08-20</td>
    </tr>
    <tr>
        <td>Chivas</td>
        <td>Teleton</td>
        <td>02</td>
        <td>14:00</td>
        <td>16:00</td>
        <td>2023-08-20</td>
    </tr>
    <tr>
        <td>Neza</td>
        <td>Zacatepec</td>
        <td>03</td>
        <td>16:00</td>
        <td>18:00</td>
        <td>2023-08-20</td>
    </tr>
    <!-- Agrega más filas según sea necesario -->
</table>
<div id="contenedorTarjetas" class="row justify-content-md-center" style="margin: 2rem;">
</div>

<script>
    document.addEventListener("DOMContentLoaded", function() {
        const tabla = document.getElementById("tablaDatos");
        const contenedorTarjetas = document.getElementById("contenedorTarjetas");
        const titulo = "Informacion del partido";

        for (let i = 1; i < tabla.rows.length; i++) {
            const fila = tabla.rows[i];
            const equipo1 = fila.cells[0].textContent;
            const equipo2 = fila.cells[1].textContent;
            const campo = fila.cells[2].textContent;
            const inicio = fila.cells[3].textContent;
            const fin = fila.cells[4].textContent;
            const dia = fila.cells[5].textContent;

            const tarjeta = document.createElement("div");
            tarjeta.classList.add("card");
            tarjeta.classList.add("col-3");
            tarjeta.classList.add("boton-agregar");
            tarjeta.innerHTML = `
                <h4>${titulo}</h4>
                <h5>${equipo1} vs ${equipo2}</h5>
                <br>
                <p>Campo: ${campo}</p>
                <p>Hora de Inicio: ${inicio}</p>
                <p>Hora del Final: ${fin}</p>
                <p>Dia del Partido: ${dia}</p>
            `;

            contenedorTarjetas.appendChild(tarjeta);
        }
    });
</script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>

</body>
</html>
