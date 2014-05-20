<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>      
        <script src=<c:url value="/js/jquery.js" /> type="text/javascript"></script> 
    </head>
    <body>

<div class="container">
    <h1> estoy en admin opciones </h1><br>
    Los productos estarán categorizados y el administrador podrá insertar, editar y
eliminar categorías.
<br>
El responsable de la aplicación web de POXmania podrá administrar su contenido.
<br>
El responsable podrá cambiar el estado de los pedidos: Nuevo, En preparación, Listo
para enviar, De camino.
<br>
En la página de administración se podrán dar de alta y baja los artículos. También se
podrá modificar su stock, precio, etc.<br>
      <form class="form-signinLoR" role="form" action="/opcionesAdmin" method="get">
        <h2 class="form-signin-heading">Acceso restringido a administradores del sistema</h2>
        <input type="text" class="form-control" placeholder="Nombre de administrador" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>

    </div> <!-- /container -->


    </body>
</html>

