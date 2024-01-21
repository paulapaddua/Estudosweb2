<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="controller.ControleAnimal" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
	String nome = request.getParameter("nome");
	String idadeStr = request.getParameter("idade");
	String pesoStr = request.getParameter("peso");
	String especie = request.getParameter("especie");
	
	int idade = (idadeStr != null && !idadeStr.isEmpty()) ? Integer.parseInt(idadeStr) : 0;
	float peso = (pesoStr != null && !pesoStr.isEmpty()) ? Float.parseFloat(pesoStr) : 0.0f;
	
	ControleAnimal conta = new ControleAnimal();
	conta.cadastrarAnimal(nome, idade, peso, especie);
	%>
	
	<h1>Cadastro de Animais</h1>
	
	<p> O seguinte animal foi cadastrado com sucesso </p>
	
	<p>
	
	Nome:<%=nome %><br>
	Idade:<%=idade %><br>
	Peso:<%=peso %><br>
	Espécie:<%=especie %><br>
	
	</p>
	
</body>
</html>