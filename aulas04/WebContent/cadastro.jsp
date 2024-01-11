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
float peso = Float.parseFloat(request.getParameter("peso"));
String especie = request.getParameter ("especie");
%>

<h1>Cadastro de Animais</h1>
<p> O seguinte Animal foi cadastrado com sucesso</p>
<p>
		Nome:<%=nome%> <br>
		Idade:<%=idade%> <br>
		Peso:<%=peso%> <br>
		Especie:<%=especie%> <br>


</p>
</body>
</html>