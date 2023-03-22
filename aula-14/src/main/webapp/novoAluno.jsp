<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo Aluno</title>
</head>
<body>
<h1>Deu certo</h1>

<%
 out.println("Ola Aluno  " +  request.getAttribute("nome"));
%>
</body>
</html>