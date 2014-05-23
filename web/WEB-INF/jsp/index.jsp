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
        <link href=<c:url value="/css/signin.css" /> rel="stylesheet">
        <script src=<c:url value="/js/jquery.js" /> type="text/javascript"></script> 
        <script src=<c:url value="/js/indexSignIn.js" /> type="text/javascript"></script> 
        
    </head>
    <body>
        
    <c:import url="cabeceraProductos.jsp" charEncoding="utf-8"/>
        <h1>Hello World!</h1>
        <h2>${message}</h2>
        
        <div class="listaproductos">
            <div class="row">
                
            <c:forEach var="producto" items="${listaproductos}" >
                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img  alt="300x200" src=<c:url value="${producto.imagen}"/> style="width: 300px; height: 200px;">
                        <div class="caption">
                            <h3 style="text-align: center">${producto.nombreproducto} ${producto.precio} <span class="glyphicon glyphicon-euro"></span></h3>
                            
                            <p><a href=<c:url value="/meterEnCarro?id=${producto.idproducto}" /> class="btn btn-primary" role="button">Añadir al carro</a> <a href=<c:url value="/detallesProducto?id=${producto.idproducto}" /> class="btn btn-default" role="button">Ver detalles</a></p>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </div>
        </div>
        
        



        
        
        
        
        
        
    </body>
</html>
