<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Relat�rio</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="./js/jquery-3.4.1.min.js"></script>
<script src="./js/script.js"></script>
</head>
<body>
	
	<h1>Relat�rio</h1>
	
	<% Map<String,Integer> relatorio = (HashMap)request.getSession().getAttribute("candidatos"); 
	if (relatorio != null){%>
		<table border="1">
		<tr>
			<th><b> Candidato </b></th>
			<th><b> Votos </b></th>
		</tr>
		<% for (Map.Entry<String,Integer> pair : relatorio.entrySet()) { %>
			<tr>
				<td><%= pair.getKey()%></td>
				<td><%= pair.getValue()%></td>
			</tr>
		<% }}%>
	</table>
	
	
	<br>
	<button id="sair"> Sair </button>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
</body>
</html>