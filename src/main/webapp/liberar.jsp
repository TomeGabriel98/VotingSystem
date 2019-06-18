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
<title>Sistema de Vota��o</title>
</head>
<body>
	<% String validou = (String)request.getSession().getAttribute("validou"); %>
	<% String nulo = (String)request.getSession().getAttribute("nulo"); %>
	
	<button id="sair">Sair</button>
	<button id="voltar" onclick="window.location.href='javascript:window.history.go(-1)'">Voltar</button>
	
	<div class="container">
		<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitor"); %>
		
		<form action="LiberaVotacao" method="post">
			<h1> Liberar Vota��o </h1>
			<label class="formLabel"> T�tulo do Eleitor: 
				<input type="text" name="titulo" required="true" maxlength="12">
			</label>
			
			
			
			<button id="validar"> Validar </button>
		</form>
		
		<% if(nulo != null){ %>
			<p> Este eleitor n�o foi encontrado </p>
		<% }else if(validou != null){ %>
			<p> <%= e.getNome() + " de t�tulo " + e.getTitulo() + " est� liberado para votar" %></p>
		<% } %>
		
	</div>
</body>
</html>