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
	<form action="Login" method="post">
		<div class="container">
			<h2> Login: </h2>
		</div>
		<input type="text" name="id" required="true" maxlength="12">
		<div class="container">
			<h2> Senha: </h2>
		</div>
		<input type="password" name="senha" required="true">
		<button type="submit"> Logar </button>
	</form>
</body>
</html>