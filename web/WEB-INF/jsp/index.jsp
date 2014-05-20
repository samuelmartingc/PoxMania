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
        <link href="/Poxmania_280/css/signin.css" rel="stylesheet">
        <script src="/Poxmania_280/js/jquery.js" type="text/javascript"></script> 
        <script src="/Poxmania_280/js/indexSignIn.js" type="text/javascript"></script> 
        <!-- <c:url value="/css/common.css" /> -->
    </head>
    <body>
        
         <!-- Static navbar -->
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
            <li class="active"><a href="#">Todas</a></li>
            <li><a href="#about">Cámaras</a></li>
            <li><a href="#contact">Consolas</a></li>
            <li><a href="#contact">Electrodomésticos</a></li>
            <li><a href="#contact">Móviles</a></li>
            <li><a href="#contact">Tabletas</a></li>
            <li><a href="#contact">Televisores</a></li>
  
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li ><a id="loginLi" href="#">Login</a></li>
            <li><a href="./">Registrarse</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

<div class="container" id="logi">

      <form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->
        
        <h1>Hello World!</h1>
    </body>
</html>
