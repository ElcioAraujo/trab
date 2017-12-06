<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Interfatec</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<STYLE type="text/css">
	body{
		background-image: url("bootstrap/img/campo.jpg");
	}
	
</STYLE>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap2/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="bootstrap2/css/bootstrap-responsive.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Fav and touch icons -->
<link rel="shortcut icon" href="bootstrap/img/iconeBola.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="Login.jsp"
				style="padding-top: 20px; padding-bottom: 22px; margin-left: 85px;">Interfatec</a>
		</div>
	</div>

	<div class="container">

		<div class="span4" style="padding-left: 15%;">
			<!-- FORMULARIO -->
			<form class="form-signin" style="margin-top: 120px;" action="./UsuarioController" method="post">
				<h4 class="form-signin-heading">Login</h4>
				<input type="text" class="input-block-level" placeholder="usuario" name="txtUsuario">
				<h4 class="form-signin-heading">Senha</h4>
				<input type="password" class="input-block-level" placeholder="senha" name="txtSenha">
				<button class="btn btn-large btn-success" type="submit" name="entrar" value="Entrar">Entrar</button>
			</form>
		</div>

		<div class="span5" style="padding-left: 5%;">
			<img src="bootstrap/img/login.png"
				style="float: right; margin-top: 40%; padding-left: 50px;">
		</div>

		<div class="span1" style="margin-left: 20%;">
			<img src="bootstrap/img/saopaulo.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/corithians.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/palmeiras.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/santos.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/vasco.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/gremio.png">
		</div>
		<div class="span1">
			<img src="bootstrap/img/atletico.png">
		</div>


	</div>
	<!--/container-->

	<!-- Le javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/jquery-1.11.3.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>

</body>
</html>
