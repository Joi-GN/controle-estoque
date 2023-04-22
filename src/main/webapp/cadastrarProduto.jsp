<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Cadastrar Produto</title>
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
		<h2>Cadastrar Produto</h2>
		<form action="cadastrar-produto" method="post">
			<input type="text" name="name" placeholder="Nome" maxlength="30" required>
            <input type="text" name="description" placeholder="Descrição" maxlength="120">
            <input type="number" name="stock" placeholder="Estoque" min="0" required>
            <input type="text" name="price" placeholder="Preço" pattern="[\d.]+" required>
            <input type="submit" value="Cadastrar">
            <p>
				<%
					String message = (String) request.getAttribute("message");
					if (message != null) 
						out.print(message);
				%>
            </p>
		</form>
	</main>
</body>
</html>