<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.av.model.Grupo"%>
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
						<li><a href="./ClassificacaoDeGrupoController">Classifica��o
								de Grupos</a></li>
						<li><a href="./ClassificacaoGeralController">Classifica��o
								Geral</a></li>
						<li><a href="./QuartasDeFinalController">Quartas de Final</a></li>

						<ul class="nav pull-right">
							<li class="dropdown" style="padding-left: 125px;"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="bootstrap/img/usuario.png"><b
									class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="configuracao.jsp">Configura��es</a></li>
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

	<div class="container" style="margin-top: 6%;">
		
		<div class="teste">
			<div class="span2">
				<table class="table table-bordered">
							<thead>
							<tr>
								<td>Grupo</td>
								<td>Time</td>
							</tr>
						</thead>
				
							<%
								List<Grupo> a = (List) request.getAttribute("GrupoA");
								if (a != null) {
									for (Grupo ga : a) {
							%>
							<tbody>
								<tr>

									<td><%=ga.getGrupo()%></td>
									<td><%=ga.getTime()%></td>
								</tr>
							</tbody>
							
							<%
								}
								}
							%>
					</table>
			</div>
			<div class="span2">
				<table class="table table-bordered">
							<thead>
							<tr>
								<td>Grupo</td>
								<td>Time</td>
							</tr>
						</thead>
						
							<%
								List<Grupo> b = (List) request.getAttribute("GrupoB");
								if (b != null) {
									for (Grupo gb : b) {
							%>
							<tr>

								<td><%=gb.getGrupo()%></td>
								<td><%=gb.getTime()%></td>
							</tr>
							<%
								}
								}
							%>
						
					</table>
			</div>	
		</div> <br/>
		
		<div class="botaoSorteia">
			<form method="post" action="./SortearGruposController">
			<input type="submit" name="btnSortear" value="Sortear" class="btn btn-large btn-success"/>
			</form>
		</div> <br/>
		
		<div class="teste2">
			<div class="span2">
				<table class="table table-bordered">
						<thead>
							<tr>
								<td>Grupo</td>
								<td>Time</td>
							</tr>
						</thead>
							<%
								List<Grupo> c = (List) request.getAttribute("GrupoC");
								if (c != null) {
									for (Grupo gc : c) {
							%>
							<tr>

								<td><%=gc.getGrupo()%></td>
								<td><%=gc.getTime()%></td>
							</tr>
							<%
								}
								}
							%>
					
					</table>
			</div>
			<div class="span2">
				<table class="table table-bordered">
						<thead>
							<tr>
								<td>Grupo</td>
								<td>Time</td>
							</tr>
						</thead>
							<%
								List<Grupo> d = (List) request.getAttribute("GrupoD");
								if (d != null) {
									for (Grupo gd : d) {
							%>
							<tr>

								<td><%=gd.getGrupo()%></td>
								<td><%=gd.getTime()%></td>
							</tr>
							<%
								}
								}
							%>
						
					</table>
			</div>
		</div>
			
		</form> <br/>

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
