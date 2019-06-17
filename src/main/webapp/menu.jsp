<%@page import="model.Eleitor" %>
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
<title>Home</title>
</head>
<body>
	<button id="sair"> Sair </button>
	<% Eleitor e = (Eleitor)request.getSession().getAttribute("eleitorLogado"); %>
	
	<p> Olá <%= e.getCategoria().toLowerCase() + " " + e.getNome() %></p>
	
	<nav id="menu">
			<ul>
				<li><a href="/VotingSystem/Votar"> Votar </a> </li>
				<%if(e.getCategoria().toLowerCase().equals("mesario")){ %>
					<li><a href="/VotingSystem/LiberaVotacao"> Liberar Votação </a></li>
				<%} %>
				<%if( e.getCategoria().toLowerCase().equals("chefe")){ %>
					<li><a href="/VotingSystem/LiberaVotacao"> Liberar Votação </a></li>
					<li><a href="/VotingSystem/Relatorio"> Relatório </a></li>
				<%} %>
			</ul>
	</nav>
	
</body>
</html>