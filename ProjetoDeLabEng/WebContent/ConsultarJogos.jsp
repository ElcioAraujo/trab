<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.av.model.Jogo"%>
<%@page import="java.util.List"%>
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
							<li class="dropdown" style="padding-left: 125px;"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="bootstrap/img/usuario.png"><b
									class="caret"></b></a>
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

	<div class="container" style="margin-top: 8%;">
		<form method="post" action="./ConsultaJogosController">
		<div style="margin-left: 30px; margin-bottom: 15px;">
			<LABEL for="dataJogo" style="color: white; font-weight: bold;">Data do Jogo:</LABEL><input type="text" name="txtData" value="01/02/2015" style="margin-left: 15px;"/> 
			<input type="submit" name="btn" value="Pesquisar" class="btn btn-success" style="margin-left: 15px;"/>
		</div>
			

			<div class="span5">
				<table class="table table-bordered">
					<thead>
						<tr>
							<td>Time A</td>
							<td>Gols Time A</td>
							<td>Gols Time B</td>
							<td>Time B</td>
						</tr>
					</thead>
					<tbody>
						<%
							List<Jogo> l = (List<Jogo>) request.getAttribute("JOGOS");
							if (l != null) {

								for (Jogo j : l) {
						%>

						<tr>
							<td><%=j.getTimeCasa()%></td>
							<td><%=j.getGolsTimeCasa()%></td>
							<td><%=j.getGolsTimeVisitante()%></td>
							<td><%=j.getTimeVisitante()%></td>
						</tr>
						<%
							}
							}
						%>

					</tbody>
				</table>

			</div>
		</form>

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
