<%--
  Created by IntelliJ IDEA.
  User: cheto
  Date: 20/08/2023
  Time: 11:29 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <!-- Required meta tags -->
    <jsp:include page="/layouts/free/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/new/styleIndex.css">

    <title>login</title>
</head>
<body>
<jsp:include page="/layouts/free/nav.jsp"/>

<section>


        <div class="box">
            <div class="px-lg-5 pt-lg-4 pb-lg-3 p-4 mb-auto w-100">
             <img src="${pageContext.request.contextPath}/assets/Imagenes/mxlogo.png" width="100" height="32" viewBox="0 0 100 32" fill="none" class="img-fluid"/>
            </div>
            <div class="align-self-center w-100 px-lg-5 py-lg-4 p-4">
               <h1 class="font-weight-bold mb-4">BIENVENIDO</h1>
                <form class="mb-5"  id="loginForm" action="${pageContext.request.contextPath}/user/login" class="needs-validation" novalidate method="post">
                    <div class="mb-4">
                         <label for="username">Nombre se usuario</label>
                        <input style="color: black; " type="text" class="form-control" name="username" id="username"
                               placeholder="juanito123"required>
                       
                        <div class="invalid-feedback text-start">
                            Campo obligatorio
                        </div>
                        <div class="mb-4">
                             <label for="password">Contraseña</label>
                            <input style="color: black; "  type="password" name="password" class="form-control" id="password"
                                   placeholder="Password" required>
                           
                            <div class="invalid-feedback text-start">
                                Campo obligatorio
                            </div>
                           <input class="send" type="submit" name="" value="Iniciar sesión">
                        </div>
                    </div>
                </form>
            </div>
        </div>



</section>
<jsp:include page="/layouts/free/footer.jsp"/>

<!-- Optional JavaScript -->
<!-- Popper.js first, then Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"
        integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/feather-icons/dist/feather.min.js"></script>
<script>
    window.addEventListener("DOMContentLoaded", () => {
        feather.replace();
        const form = document.getElementById("loginForm");
        const btn = document.getElementById("login");
        form.addEventListener('submit', event => {
            btn.innerHTML = `<div class="d-flex justify-content-center">
                                <div class="spinner-border" role="status">
                                    <span class="visually-hidden">Loading...</span>
                                </div>
                            </div>`;
            btn.classList.add("disabled");
            if (!form.checkValidity()) {
                event.preventDefault();
                event.stopPropagation();
                btn.classList.remove("disabled");
                btn.innerHTML = `<i data-feather="log-in"></i> INICIAR SESIÓN`;
            }
            form.classList.add('was-validated');
        }, false);
        if (!${param['result'] != null ? param['result']: true}) {
            Swal.fire({
                title: 'Acceso denegado',
                text: '${param['message']}',
                icon: 'error',
                confirmButtonText: 'Aceptar'
            });
        }
    }, false);
</script>
</body>
</html>

