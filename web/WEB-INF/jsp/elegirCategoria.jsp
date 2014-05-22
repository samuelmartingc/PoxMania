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

        <h1 id="overview" class="page-header">Opciones de administración</h1>

    

    
    
<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading"><span class="glyphicon glyphicon-align-justify"></span> Lista de categorias</div>
  <!-- List group -->
  <ul class="list-group">
      <c:forEach var="categoria" items="${listaCategorias}" >
          <li class="list-group-item" ><a href=<c:url value="/editarCategoriaConcreta?id=${categoria.idcategoria}"/> >${categoria.nombrecategoria} </a> </li>
      </c:forEach>
      
      
  </ul>
</div>
  
    
    
    </body>
</html>

