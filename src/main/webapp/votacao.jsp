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
<title>Sistema de Vota��o</title>
</head>
<body>
	<div>
		<h1> Vota��o </h1>
	</div>
	<div>
		<h2> Digite o n�mero do candidato: </h2>
	</div>
	<form action="Votar" method="post">
		<input type="text" name="candidato" required="true" maxlength="2" size="10">
		<button type="submit"> Votar </button>
		<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'"> Cancelar </button>
	</form>
	<img alt="Aqui vai ficar a foto do miliante" src="">
</body>
</html>