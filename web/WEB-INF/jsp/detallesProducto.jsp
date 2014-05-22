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
                <img  alt="300x200" src="/Poxmania_280/images/camaraCanon.jpg" style="width: 100%; ">
            </div>
        </div>
    <div class="derecha">
        <h1 class="page-header">999.999 €</h1>
        <p class="lead">Bootstrap includes a responsive, mobile first fluid grid system that appropriately scales up to 12 columns as the device or viewport size increases. It includes <a href="#grid-example-basic">predefined classes</a> for easy layout options, as well as powerful <a href="#grid-less">mixins for generating more semantic layouts</a>.</p>
        <p><a href="<c:url value="/meterEnCarro?id=${prod.idproducto}" />" class="btn btn-primary" role="button">Comprar</a> <a href="/index" class="btn btn-default" role="button">Volver al inicio</a></p>
    </div>
        </div>
        
        
        
  
        
        
    </body>
</html>
