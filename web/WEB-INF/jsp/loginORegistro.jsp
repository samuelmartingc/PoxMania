<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <!-- para el login -->
        <script src=<c:url value="/js/jquery.js" /> type="text/javascript"></script> 
        <link href=<c:url value="/css/signin.css" /> rel="stylesheet">
    </head>
    <body>
        <div class="container">

      <form class="form-signinLoR" role="form">
        <h2 class="form-signin-heading">Login</h2>
        <input type="text" class="form-control" placeholder="Nick de usuario" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>
<br><br>
    <form class="form-signinLoR"  role="form">
        <button class="btn btn-lg btn-primary btn-block" id="registro" type="submit">Registrarse</button>
      </form>
    </div> <!-- /container -->
    </body>
</html>