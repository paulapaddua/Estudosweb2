<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="controller.ControleAnimal"  %> 
<%@ page import="model.Animal" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ControleAnimal conta = new ControleAnimal();
	%>
	
	<% for (int i = 0; i < conta.animaisCadastrados.size(); i++){ %>
	<fieldset>
		<p>Nome: <%=conta.animaisCadastrados.get(i).getNome() %></p>
		<p>Idade: <%=conta.animaisCadastrados.get(i).getIdade() %></p>
		<p>Peso: <%=conta.animaisCadastrados.get(i).getPeso() %></p>
		<p>Especie: <%=conta.animaisCadastrados.get(i).getEspecie() %></p>
	</fieldset>
	<% } %>
</body>
</html>