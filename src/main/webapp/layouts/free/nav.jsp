<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 09:49 a. m.
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<nav class="navbar">
    <!-- LOGO -->
    <div class="logo"><img src="${pageContext.request.contextPath}/assets/Imagenes/mxlogo.png" width="100px" height="75px" alt=""></img></div>

    <!-- NAVIGATION MENU -->
    <ul class="nav-links">

        <!-- NAVIGATION MENUS -->
        <div class="menu">

            <li><a href="${pageContext.request.contextPath}/page/inicio">Inicio</a></li>
            <li><a href="${pageContext.request.contextPath}/Horarios">Horarios</a></li>

            <li class="services">
                <span>Servicios</span>

                <!-- DROPDOWN MENU -->
                <ul class="dropdown">
                    <li><a href="${pageContext.request.contextPath}/Teams">Equipos</a></li>
                </ul>
            </li>

            <li><a href="${pageContext.request.contextPath}/ranking">Ranking</a></li>
            <li><a href="${pageContext.request.contextPath}/inicioSession">Iniciar Sesion</a></li>
        </div>
    </ul>
</nav>
