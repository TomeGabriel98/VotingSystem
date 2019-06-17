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
<title>Sistema de Votação</title>
</head>
<body>
	<button id="sair">Sair</button>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
	
	<div class="container">
		<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitor"); %>
		
		<form action="LiberaVotacao" method="post">
			<h1> Liberar Votação </h1>
			<label class="formLabel"> Título do Eleitor: 
				<input type="text" name="titulo" required="true" maxlength="12">
			</label>
			
			<button id="validar"> Validar </button>
			<% if(e.isLibera()){ %>
				<p> <%= e.getNome() + " de título " + e.getTitulo() + " está liberado para votar" %></p>
			<% } else{ %>
				<p> Este eleitor não foi encontrado </p>
			<% } %>
		</form>
	</div>
</body>
</html>