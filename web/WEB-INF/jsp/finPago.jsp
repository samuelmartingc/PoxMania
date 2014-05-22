<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Finalizacion de su compra</h1> <br>
        <h2>En unos días le llegará su pedido, muchas gracias por su confianza</h2>
        <h3>El importe total es de ${total} € </h3>
        <a href=<c:url value="/index"/> class="btn btn-success btn-block btn-lg" tabindex="10" >Volver al inicio</a>
    </body>
</html>
