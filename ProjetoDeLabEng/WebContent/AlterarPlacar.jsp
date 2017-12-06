<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.av.persistence.JogoDaoImpl"%>
<%@page import="br.av.persistence.JogoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.List"%>
<%@page import="br.av.persistence.JogoDaoImpl"%>
<%@page import="br.av.persistence.JogoDao"%>
<%@page import="br.av.model.Jogo"%>
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
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>


				<div class="nav-collapse collapse"
					style="padding-top: 10px; padding-bottom: 10px;">
					<div class="nav">
						<li><a href="./SortearGrupos.jsp">Sortear Grupos</a></li>
						<li><a href="./SortearJogosController">Sortear Jogos</a></li>
						<li><a href="./ConsultarJogos.jsp">Consultar Jogos</a></li>
						<li><a href="./AlterarPlacar.jsp">Alterar Placar</a></li>
						<li><a href="./ClassificacaoDeGrupoController">Classificação
								de Grupos</a></li>
						<li><a href="./ClassificacaoGeralController">Classificação
								Geral</a></li>
						<li><a href="./QuartasDeFinalController">Quartas de Final</a></li>

						<ul class="nav pull-right">
							<li class="dropdown" style="padding-left: 125px;"><a
								href="#" class="dropdown-toggle" data-toggle="dropdown"><img
									src="bootstrap/img/usuario.png"><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="configuracao.jsp">Configurações</a></li>
									<li class="divider"></li>
									<li class="nav-header">Logout</li>
									<li><a href="Encerrar.jsp" class="font-size: 12px">Encerrar</a></li>
								</ul></li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
	</div>

	<div class="container" style="margin-top: 5%;">
		<div style="margin-left: 30px; margin-bottom: 8px;">
		<form method="post" action="./AlterarPlacar.jsp" style="margin-top: 20px;">
			<label for="dataJogo" style="color: white; font-weight: bold;">Data do Jogo:</label>
			<input type="text" name="txtData" value="01/02/2015" style="margin-left: 15px;" /> 
			<input type="submit" name="btnPesquisar" value="Pesquisar" class="btn btn-success" style="margin-left: 15px;" />
		</form>
		</div>

		<div class="span8">

			<form method="post" action="" style="margin-top: 20px;">
			<%
			JogoDao iDao = new JogoDaoImpl();
			String data = request.getParameter("txtData");
			List<Jogo> jogo;
			int i = 0;
			try {
				jogo = iDao.buscaNomeTime(data);
				for (Jogo j : jogo) {
				
			%>	
			<label style="color: white ; font-weight: bolder ;"><%= j.getTimeCasa() %> :<input type="text" name="txtTimeCasa<%= i %>" class="span2"/> X <input type="textTimeVisitante<%= i %>" name="" class="span2"/> : <%= j.getTimeVisitante() %>  </label>
			<%
				i ++;
				}
			} catch (SQLException e) {
			e.printStackTrace();
			}
			%>
				<input type="submit" name="btnAlterar" value="Alterar Placar"
					class="btn btn-success" style="margin-left: 80%; margin-top: 20px;" />
			</form>

		</div>

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
