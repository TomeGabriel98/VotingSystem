<%@page import="model.Eleitor"%>
<%@page import="model.Candidato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Votação</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="./js/jquery-3.4.1.min.js"></script>
<script src="./js/script.js"></script>
</head>
<body>
	<% String verify = (String)request.getSession().getAttribute("verify"); %>
	
	
	<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitorLogado"); %>
	<form action="Votar" method="post">
		<% if(e.isLibera() && !e.isVotou()){ %>
			<div>
				<h1> Votação </h1>
			</div>
			<div>
				<label class="formLabel"> Digite o número do candidato:
					<input type="text" name="candidato" required="true" maxlength="2" size="10">
				</label>
				<button type="submit"> Votar </button>
			</div>
		<% }else {%>
			<p> Você não pode votar agora </p>
		<% } %>
	</form>
	<% if(verify != null){ %>
		<p> Número inválido, tente novamente </p>
	<% } %>
	<button id="sair"> Sair </button>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
</body>
</html>