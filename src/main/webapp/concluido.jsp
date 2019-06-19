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
<title>Concluído</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="./js/jquery-3.4.1.min.js"></script>
<script src="./js/script.js"></script>
</head>
<body>
	<h1> Parabéns, seu voto foi computado </h1>
	<button id="sair"> Sair </button>
</body>
</html>