<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro</title>
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


     <div class="container" id="contenedor">

        <div class="row">
            <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                <form role="form" id="form" method="get" action=<c:url value="/insertarProducto"/>>
                    <h2>Alta de nuevo producto</h2>
                    <hr class="colorgraph">
                    <div class="row">
                            <div class="form-group">
                                <input type="text" class="form-control input-lg" placeholder="Nombre del producto" name="nombre" tabindex="1" required>
                            </div>
                    </div>
                    <div class="row">
                            <div class="form-group">
                                <select class="form-control" name="categoria" tabindex="1" required>
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
</select> 
                            </div>
                    </div>
                    <div class="row">
                            <div class="form-group">
                                <textarea class="form-control" rows="5" name="descripcion" tabindex="1" required></textarea>
                            </div>
                    </div>
                    <div class="row">
                            <div class="form-group">
                                <input type="text" class="form-control input-lg" placeholder="Precio" name="precio" tabindex="1" required>
                            </div>
                    </div>
                    <div class="row">
                            <div class="form-group">
                                <input type="text" class="form-control input-lg" placeholder="imagen" name="imagen" tabindex="1" required>
                            </div>
                    </div>
                    <div class="row">
                            <div class="form-group">
                                <input type="text" class="form-control input-lg" placeholder="Stock" name="stock" tabindex="1" required>
                            </div>
                    </div>
                    
                    
                    
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-6 col-md-6"><input type="submit" value="Insertar" class="btn btn-primary btn-block btn-lg" tabindex="9"></div>
                        <div class="col-xs-6 col-md-6"><a href=<c:url value="/opcionesAdminOK"/> class="btn btn-success btn-block btn-lg" tabindex="10" >Volver</a></div>
                    </div>
                </form>
            </div>
        </div>
        </div>

    </body>
</html>
