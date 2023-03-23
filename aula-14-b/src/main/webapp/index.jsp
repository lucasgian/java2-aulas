<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Aluno</title>
</head>
<body>
<h1>Cadastro</h1>

<form method="post" action="cadastrar">
<div>
	<label>Nome: </label> <input type="text" name="nome" required/>
</div>
<div> 
	<label>Idade: </label> <input type="number" name="idade" required/>
</div>
<div> 
	<label>Nota: </label> <input type="text" name="nota" required/>
</div>

<input type="submit" value="Cadastrar Aluno" />
</form>
</body>
</html>