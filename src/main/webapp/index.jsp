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
</head>
<body>
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
</body>
</html>