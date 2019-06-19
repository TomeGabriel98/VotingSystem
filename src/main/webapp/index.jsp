<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String contexto = request.getContextPath();
	if(!contexto.equals("")) contexto += "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Votação</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
</head>
<body>
	<% String mensagem = (String)request.getSession().getAttribute("mensagem"); %>
	<div class="container">
		<h1 class=page-header>Sistema Eleitoral</h1>
	</div>
	<form class="baseForm" action="Autentica" method="post">
		<div class="container">
			<label class="formLabel"> Login:
				<input type="text" name="id" required="true" maxlength="12">
			</label>
		</div>
		<div class="container">
			<label class="formLabel"> Senha:
				<input type="password" name="senha" required="true">
			</label>
		</div>
		<button type="submit" class="submitButton"> Logar </button>
	</form>
	<% if(mensagem != null){ %>
		<p> <%= mensagem %> </p>
	<%} %>
	
</body>
<footer>
	<img alt="Logo" src="./img/logo.png">
</footer>
</html>