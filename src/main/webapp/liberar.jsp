<%@page import="model.Eleitor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liberação</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="./js/jquery-3.4.1.min.js"></script>
<script src="./js/script.js"></script>
</head>
<body>
	<% String validou = (String)request.getSession().getAttribute("validou"); %>
	<% String nulo = (String)request.getSession().getAttribute("nulo"); %>	
	
	<div class="container">
		<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitor"); %>
		
		<form action="LiberaVotacao" method="post">
			<h1> Liberar Votação </h1>
			<label class="formLabel"> Título do Eleitor: 
				<input type="text" name="titulo" required="true" maxlength="12">
			</label>
			
			
			
			<button id="validar"> Validar </button>
		</form>
		
		<% if(nulo != null){ %>
			<p> Este eleitor não foi encontrado </p>
		<% }else if(validou != null){ %>
			<h2 id="validou" style="color:green;"> <%= e.getNome() + " de título " + e.getTitulo() + " está liberado para votar" %></h2>
		<% } %>
		
	</div>
	
	<button id="sair">Sair</button>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
</body>
</html>