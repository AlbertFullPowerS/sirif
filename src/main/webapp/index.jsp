<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/layouts/free/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/new/styleIndex.css">

</head>
<body>
<jsp:include page="/layouts/free/nav.jsp"/>
<!-- Hasta aqui termina navbar -->

<!-- Codigo dentro de la pagina principal -->
<div class="estilofondo">
    <div class="start container">
        <div class="row">
            <div class="col">
                <p class="estilo1">Bienvenido!</p>

                <H1 class="estilo2">Inicio de la liga</H1>

                <p class="estilo3">¡La emoción está en el aire! En las soleadas tierras de Temixco, <br>
                    un nuevo capítulo futbolístico está a punto de comenzar. Las <br>
                    calles vibran con el entusiasmo de los aficionados mientras la <br>
                    ciudad se prepara para el inicio de su propia liga de fútbol <br> <br>
                </p>

                <a href="${pageContext.request.contextPath}/Horarios"><button>Horarios</button></a>
            </div>
            <div class="col">
                <img src="${pageContext.request.contextPath}/assets/Imagenes/messi.jpg" alt="messi.jpg" class="messi">
            </div>
        </div>
    </div>

    <div class="estadisticas">
        <div class="texto">
            <h1 class="estilo5">ESTADISTICAS GENERALES</h1>

            <p class="estilo6">
                &nbsp; &nbsp;Para Mantenerte Al <br>
                Tanto De Nuestra Liga!
            </p>

            <p class="estilo7">
                Te dejamos un breve recuento de los datos mas destacados de nuestra liga
            </p>
        </div>

        <div class="cards">
            <button2 class="button2"><c:out value="${stadist.goals}"/> Goles</button2>
            <button3 class="button2"><c:out value="${stadist.assistences}"/> Faltas</button3>
            <button4 class="button2"><c:out value="${stadist.cardAll}"/>  Asistencias</button4>
        </div>
    </div>

    <div class="info">
        <h3 class="estilo8"> Informacion Importante</h3>
        <p class="estilo9"> Preguntas Frecuentes de la liga </p>

        <h6 class="estilo10">Aqui una muestra de las preguntas mas frecuentes de la liga</h6>
        <div class="info2 container text-left">
            <div class="row">

                <div class="estilo11 col">
                    ¿Que es el premio?
                    <br>
                    El premio de la liga es $1,000,000 de pesos mexicanos
                    <br>
                    <br>
                    ¿Que categoria compite?
                    <br>
                    Compiten los equipos de integrantes nacidos del 2003 - 2005.
                </div>

                <div class="estilo12 col">
                    Ubicacion de los partidos
                    <br>
                    Todos los partidos de la liga seran disputados en el municipio de Temixco.
                    <br>
                    <br>
                    ¿Que dias son los juegos?
                    <br>
                    Los juegos se disputan solo sabados y domingo.
                </div>

                <div class="estilo13 col">
                    ¿En que formato se juega?
                    <br>
                    Se disputan 19 jornadas todos contra todos, se clasifican los 8 primeros
                    lugares, y pasan a la siguiente ronda la cual es cuartos de final, seguido de las
                    semifinales y por ultimo una final, donde saldra un campeon
                    <br>
                    <br>
                    ¿Que mas puedo ver la pagina?
                    <br>
                    Se puede visualizar la tabla de ranking de los equipos, asi como también cada uno de los equipos,
                    que jugadores tienen mas goles, tarjetas etc.
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/layouts/free/footer.jsp"/>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>

</body>
</html>
