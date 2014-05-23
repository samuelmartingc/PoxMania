<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Elegir producto</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>      
        <script src=<c:url value="/js/jquery.js" /> type="text/javascript"></script> 
    </head>
    <body>
        <h1 id="overview" class="page-header">Eleccion de producto</h1>
        <div class="panel panel-default">
            <div class="panel-heading"><span class="glyphicon glyphicon-align-justify"></span> Lista de productos</div>
            <ul class="list-group">
                <c:forEach var="producto" items="${listaProductos}" >
                    <li class="list-group-item" ><a href=<c:url value="/editarProductoConcreto?id=${producto.idproducto}"/> >${producto.nombreproducto} </a> </li>
                    </c:forEach>
            </ul>
        </div>
    </body>
</html>

