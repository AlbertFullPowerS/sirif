<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../CSS/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="shortcut icon" href="../Imagenes/mxlogo.png" />
    <link rel="stylesheet" href="../CSS/styleIndex.css"/>
    <title>Inicio</title>
    <jsp:include page="/layouts/header.jsp"/>
</head>
<jsp:include page="/layouts/navadmin.jsp"/>
<body style="background: #fff">

 <div class="overlay" id="overlay" >
        <div class="pop-up" id="pop-up">
            <a href="#" id="btn-cerrar" class="btn-cerrar"><i class="bi bi-x-lg"></i></a>
            <h2 class="equipo">Registro de estudiantes</h2>
            <form accept="" method="">
              <input type="text" name="nombre" placeholder="Nombre" required="">

              <input type="number" name="n_jug" placeholder="Cantidad de jugadores">

              <input type="file" name=""  accept="image/*" required>
            
              <br><input type="submit" name="" value="Agregar"> 
            </form>

        </div>
    </div>

<input type="checkbox" id="btn-modal">
<div class="container-modal">
      <div class="content-modal">
        <label for="btn-modal" class="btn-close" data-bs-dismiss="modal" aria-label="Close" style="float: right; cursor: pointer;" ></label> 
        <h2>Registro de jugadores</h2>


        <form accept="" method="" id="">
              <input type="text" name="nombre" placeholder="Nombres" required="">
              <input type="text" name="apellido1" placeholder="Apellido paterno" required="">
              <input type="text" name="apellido2" placeholder="Apellido materno">
              <input type="number" name="dorsal" placeholder="Numero dorsal">
              <input type="text" name="posicion" placeholder="Posición">                  

          <select required >
            <option disabled selected>Seleccionar equipo</option>
          <option value="${equipo.nombre}">${equipo.nombre}</option>
         </select>  
          <input type="file" name="" accept="image/*" required >

              <input type="submit" name="" value="Agregar" style="width: 100%;text-align: center;"> 
            </form>
        <div class="btn-cerrar">
         
        </div>
      </div>
    </div>

    <!--TERMINA LA 1° MODIFICACION-->


  <button href="#"  class="btn-abrir" id="btn-abrir" for="btn-menu">
    Registrar jugadores
  </button>
  <div class="boton-modal">
                    <label for="btn-modal">
                      Registrar equipo
                    </label>
                  </div>
<h1>Resumen de liga</h1>


<table class="container">
  <thead>
    <tr>
      <th><h1>Equipo</h1></th>
      <th><h1>Equipo</h1></th>
      <th><h1>Goles</h1></th>
      <th><h1>Horario</h1></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Pumas</td>
      <td>Chivas</td>
      <td>6</td>
      <td>01:32:50</td>
    </tr>
    <tr>
      <td>Cruz Azul</td>
      <td>Pumas</td>
      <td>1</td>
      <td>00:51:22</td>
    </tr>
    
  </tbody>
</table>

<script type="text/javascript">
  var btnAbrir = document.getElementById('btn-abrir');
var overlay = document.getElementById('overlay');
var pop = document.getElementById('pop-up');
var btnCerrar = document.getElementById('btn-cerrar');
var menuCheckbox = document.getElementById('btn-menu');

btnAbrir.addEventListener('click', function () {
  overlay.classList.add('active');
  // Cerrar el menú lateral al abrir el overlay
  menuCheckbox.checked = false;
});

btnCerrar.addEventListener('click', function () {
  overlay.classList.remove('active');
});
</script>
</body>
</html>
