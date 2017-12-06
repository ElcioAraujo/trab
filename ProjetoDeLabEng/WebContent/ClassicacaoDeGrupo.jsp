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

	<div class="container" style="margin-top: 6%;">

		<div class="span9">
			<table class="table table-bordered">
				<thead>
					<tr>
						<td>Grupo</td>
						<td>Posicao</td>
						<td>Time</td>
						<td>Nº de Jogos</td>
						<td>Vitorias</td>
						<td>Empates</td>
						<td>Derrotas</td>
						<td>Gols Marcados</td>
						<td>Gols Sofridos</td>
						<td>Saldos</td>
						<td>Pontos</td>
					</tr>

				</thead>
				<tbody>

					<%
						List<Grupo> listaA = (List<Grupo>) request.getAttribute("GrupoA");

						if (listaA != null) {

							for (Grupo ga : listaA) {
								if (ga.getPosicao() <= 16) {
					%>
					<tr>
						<%
							} else {
						%>
					
					<tr style="background: red; color: #fff;">
						<%
							}
						%>
						<td><%=ga.getGrupo()%></td>
						<td><%=ga.getPosicao()%></td>
						<td><%=ga.getTime()%></td>
						<td><%=ga.getnJogos()%></td>
						<td><%=ga.getVitoria()%></td>
						<td><%=ga.getEmpate()%></td>
						<td><%=ga.getDerrota()%></td>
						<td><%=ga.getGolsMarcados()%></td>
						<td><%=ga.getGolsSofridos()%></td>
						<td><%=ga.getSaldo()%></td>
						<td><%=ga.getPontos()%></td>
					</tr>
					<%
						}
						}
					%>

				</tbody>
			</table>
		</div>
		<div class="span9">
			<table class="table table-bordered">
				<thead>
					<tr>
						<td>Grupo</td>
						<td>Posicao</td>
						<td>Time</td>
						<td>Nº de Jogos</td>
						<td>Vitorias</td>
						<td>Empates</td>
						<td>Derrotas</td>
						<td>Gols Marcados</td>
						<td>Gols Sofridos</td>
						<td>Saldos</td>
						<td>Pontos</td>
					</tr>

				</thead>
				<%
					List<Grupo> listaB = (List) request.getAttribute("GrupoB");

					if (listaB != null) {

						for (Grupo gb : listaB) {
							if (gb.getPosicao() <= 16) {
				%>
				<tr>
					<%
						} else {
					%>
				
				<tr style="background: red; color: #fff;">
					<%
						}
					%>
					<td><%=gb.getGrupo()%></td>
					<td><%=gb.getPosicao()%></td>
					<td><%=gb.getTime()%></td>
					<td><%=gb.getnJogos()%></td>
					<td><%=gb.getVitoria()%></td>
					<td><%=gb.getEmpate()%></td>
					<td><%=gb.getDerrota()%></td>
					<td><%=gb.getGolsMarcados()%></td>
					<td><%=gb.getGolsSofridos()%></td>
					<td><%=gb.getSaldo()%></td>
					<td><%=gb.getPontos()%></td>
				</tr>
				<%
					}
					}
				%>

				</tbody>
			</table>
		</div>

		<div class="span9">
			<table class="table table-bordered">
				<thead>
					<tr>
						<td>Grupo</td>
						<td>Posicao</td>
						<td>Time</td>
						<td>Nº de Jogos</td>
						<td>Vitorias</td>
						<td>Empates</td>
						<td>Derrotas</td>
						<td>Gols Marcados</td>
						<td>Gols Sofridos</td>
						<td>Saldos</td>
						<td>Pontos</td>
					</tr>

				</thead>
				<tbody>
					<%
						List<Grupo> listaC = (List<Grupo>) request.getAttribute("GrupoC");

						if (listaC != null) {

							for (Grupo gc : listaC) {
								if (gc.getPosicao() <= 16) {
					%>
					<tr>
						<%
							} else {
						%>
					
					<tr style="background: red; color: #fff;">
						<%
							}
						%>
						<td><%=gc.getGrupo()%></td>
						<td><%=gc.getPosicao()%></td>
						<td><%=gc.getTime()%></td>
						<td><%=gc.getnJogos()%></td>
						<td><%=gc.getVitoria()%></td>
						<td><%=gc.getEmpate()%></td>
						<td><%=gc.getDerrota()%></td>
						<td><%=gc.getGolsMarcados()%></td>
						<td><%=gc.getGolsSofridos()%></td>
						<td><%=gc.getSaldo()%></td>
						<td><%=gc.getPontos()%></td>
					</tr>
					<%
						}
						}
					%>

				</tbody>
			</table>
		</div>
		<div class="span9">
			<table class="table table-bordered">
				<thead>
					<tr>
						<td>Grupo</td>
						<td>Posicao</td>
						<td>Time</td>
						<td>Nº de Jogos</td>
						<td>Vitorias</td>
						<td>Empates</td>
						<td>Derrotas</td>
						<td>Gols Marcados</td>
						<td>Gols Sofridos</td>
						<td>Saldos</td>
						<td>Pontos</td>
					</tr>

				</thead>
				<tbody>
					<%
						List<Grupo> listaD = (List<Grupo>) request.getAttribute("GrupoD");

						if (listaD != null) {

							for (Grupo gd : listaD) {
								if (gd.getPosicao() <= 16) {
					%>
					<tr>
						<%
							} else {
						%>
					
					<tr style="background: red; color: #fff;">
						<%
							}
						%>
						<td><%=gd.getGrupo()%></td>
						<td><%=gd.getPosicao()%></td>
						<td><%=gd.getTime()%></td>
						<td><%=gd.getnJogos()%></td>
						<td><%=gd.getVitoria()%></td>
						<td><%=gd.getEmpate()%></td>
						<td><%=gd.getDerrota()%></td>
						<td><%=gd.getGolsMarcados()%></td>
						<td><%=gd.getGolsSofridos()%></td>
						<td><%=gd.getSaldo()%></td>
						<td><%=gd.getPontos()%></td>
					</tr>
					<%
						}
						}
					%>

				</tbody>
			</table>
		</div>

		<div class="span3 imagem" style="position: absolute; ;">
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