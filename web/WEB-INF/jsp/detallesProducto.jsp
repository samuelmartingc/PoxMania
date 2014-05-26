<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Detalles del producto</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <!-- para el login -->
        <link href=<c:url value="/css/signin.css" /> rel="stylesheet">
        <link href=<c:url value="/css/detallesProducto.css" /> rel="stylesheet">
        <script src=<c:url value="/js/jquery.js" /> type="text/javascript"></script> 
        <script src=<c:url value="/js/indexSignIn.js" /> type="text/javascript"></script> 
    </head>
    <body>
        <c:import url="cabeceraProductos.jsp" charEncoding="utf-8"/>      
        <h2>${prod.nombreproducto}</h2>
        <div class="main">
            <h1 class="page-header">Camara cara</h1>
            <div class="izquierda">
                <div class="thumbnail">
                    <img  alt="300x200" src=<c:url value="${prod.imagen}" /> style="width: 100%; ">
                </div>
            </div>
            <div class="derecha">
                <h1 class="page-header">${prod.precio} €</h1>
                <p class="lead">${prod.descripcion}</p>
                <p class="lead">Quedan en stock ${prod.stock} unidades</p>
                <p>
                    <c:if test="${prod.stock > 0}">
                        <c:if test="${prod.stock < 5}">
                        <h2 style="color:red">¡¡ Date prisa que quedan pocos !!</h2></p><p>
                        </c:if>
                        <a href="<c:url value="/meterEnCarro?id=${prod.idproducto}" />" class="btn btn-primary" role="button">Comprar</a>
                    </c:if>
                    <c:if test="${prod.stock <= 0}">
                        <a href="<c:url value="/meterEnCarro?id=${prod.idproducto}" />" class="btn btn-primary" role="button" disabled>Comprar</a>
                    </c:if>
                    <a href="<c:url value="/index"/>" class="btn btn-default" role="button">Volver al inicio</a></p>
            </div>
        </div>
        <c:import url="footer.jsp" charEncoding="utf-8"/>
    </body>
</html>
