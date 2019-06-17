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
<title>Sistema de Votação</title>
</head>
<body>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
	<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitorLogado"); %>
	<form action="Votar" method="post">
		<% if(e.isLibera()){ %>
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
	<img alt="Aqui vai ficar a foto do miliante" src="">
</body>
</html>