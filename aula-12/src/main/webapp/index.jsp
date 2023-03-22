<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="formulario.css">

<title>Insert title here</title>
</head>
<body>
<h2>Cadastro Novo Aluno</h2>

<form method="get" action="CadastroAlunoServlet">
  <label for="nome">Nome:</label>
  <input type="text" id="nome" name="nome" required>

  <label for="idade">Idade:</label>
  <input type="number" id="idade" name="idade" required>

	<input value="Novo Aluno" type="submit">
</form>

</body>
</html>