<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Consultar Produto</title>
</head>
<body>
	<header>
		<h1>Controle de Estoque</h1>
		<nav>
			<ul>
				<li>
					<a href="cadastrarProduto.jsp">Cadastrar Produto</a>
				</li>
				<li>
					<a href="consultarProduto.jsp">Consultar Produto</a>
				</li>
			</ul>
		</nav>
	</header>
	<main>
		<h2>Consultar Produto</h2>
		<form action="" method="post">
			<input type="text" name="name" placeholder="Buscar pelo nome" required>
			<input type="submit" value="Consultar">
		</form>
	</main>
</body>
</html>