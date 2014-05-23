<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Categorías</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav"> 
                <li ><a href=<c:url value="/index"/> >Todas</a></li>
                    <c:forEach var="categoria" items="${listaCategorias}" >
                    <li><a href=<c:url value="/indexEspecifico?cat=${categoria.idcategoria}" /> > ${categoria.nombrecategoria}</a></li>
                    </c:forEach>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:if test="${user == ''}">
                    <li ><a id="loginLi" href="#">Login</a></li>
                    <li><a href=<c:url value="/registro" />>Registrarse</a></li>
                    </c:if>
                    <c:if test="${user != ''}">
                    <li ><a id="user" href=<c:url value="/verMisPedidos?uId=${userid}" /> >${user}</a></li>
                    <li ><a id="user" href=<c:url value="/logout" /> >Logout</a></li>
                    </c:if>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a class="navbar-brand" href=<c:url value="/verCarro" /> ><span class="glyphicon glyphicon-shopping-cart"></span>Ver Carro</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</div>
<div class="container" id="logi">
    <form class="form-signin" role="form" action=<c:url value="/loginUsuario" />>
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" name="nick" class="form-control" placeholder="Nick" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div>

