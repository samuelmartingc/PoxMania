<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar carro</title>
    </head>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos del carro</title>
    </head>
    <body>
        <c:import url="cabeceraProductos.jsp" charEncoding="utf-8"/>
        
        <h1> Contenido del carro: ${nombre}</h1>
        
         
        <!-- formulario de modificación de pedido -->
         
        <form method="get" action="ModificarCarro" name="agregarEnCarro"> 
            <c:forEach var="producto" items="${carro.contenido}" >
            <p> <input type="checkbox" name="id" value="${producto.prod.idproducto}">
                 <img title="imagen" alt="imagen de ${producto.prod.nombreproducto}" src=".${producto.prod.imagen}"  height="50px">
                 Nombre: ${producto.prod.nombreproducto}  ${producto.prod.precio} &euro; 
                 Cantidad : <input type="text" name="${producto.prod.idproducto}" value="${producto.cantidad}" size="1"></p>
            </c:forEach>
            <h1> Total: ${carro.total} artículos ........... ${carro.precio} &euro;</h1>
            <br>
            <input type="checkbox" name="vaciar" value="si">Vaciar todo el carro
            <br><br>
            <input type="submit" name="accion" value="Modificar">
            <input type="submit" name="accion" value="Sacar">
        </form>
        <br><br>   
        <!-- formulario de realizar pedido -->   
        <form method="get" action="FinalizarPedido" name="agregarEnCarro"> 
            Nombre de pedido <input type="text" name="nombrePedido" required>
            <input type="submit" name="finalizarPedido" value="Finalizar pedido">
        </form>
        <br><br>
        
        <a href=<c:url value="/index" />>Volver</a>
       
        
    </body>
</html>
