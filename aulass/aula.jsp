<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String nome = request.getParameter("nome");
int idade = Integer.parseInt(request.getParameter("idade"));
float altura = Float.parseFloat(request.getParameter("altura"));
%>
<h1>Dados do Atleta</h1>

<p>
Nome: <% out.print(nome);%> <br>
Idade: <% out.print(idade); %> <br>
Altura: <%out.print(altura);%> <br>
</p>

</body>
</html>