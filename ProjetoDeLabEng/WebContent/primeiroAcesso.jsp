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
body {
	background-image: url("bootstrap/img/campo.jpg");
}

</STYLE>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">

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
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> 
				<div class="nav-collapse collapse">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"
							style="padding-top: 20px; padding-bottom: -5px;"><img
								src="bootstrap/img/usuario.png"><b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li class="nav-header">Logout</li>
								<li><a href="Encerrar.jsp" class="font-size: 12px">Encerrar</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container"
		style="margin-top: 5%; text-align: center; font-weight: bold; color: white;">

		<h2 style="padding-left: 100px; padding-top: 25px; text-align: left;">Olá,
			Seja Bem - Vindo(a)!</h2>
		<label for="mensagem"
			style="padding-top: 10px; text-align: center; font-size: 16px;">Esse
			é seu primeiro acesso, por favor, insira seus dados.</label>

		<!-- FORMULARIO -->
		<form method="post" action="./UsuarioController">
			<div class="form-conf" style="font-weight: bold; color: black; padding-left: 15px;">
				Email :<input type="email" placeholder="mail@example.com" style="width: 50%;" name="txtEmail"><br /> 
				Login :<input type="text" placeholder="Usuario" name="txtLogin"><br /> 
				Senha :<input type="password" placeholder="Digite a nova senha" name="txtSenha"><br />
			</div>
			<button type="submit" class=" btn btn-success direita btn-large"
				name="btnSalvar" style="margin-right: 30%;" value="Salvar">Salvar</button>
		</form>
		<!--./FormulÃ¡rio-->

		<div class="span4 imagem">
			<img src="bootstrap/img/login.png">
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