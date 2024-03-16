<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda de Contatos</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
	ArrayList<Cliente> lista = (ArrayList<Cliente>) request.getAttribute("contatos");
	%>
	
	<h1>Agenda de Contatos</h1>
	
	<a href="index.html" class="Botao">Início</a>
	
	<table id="tabela">
		<thead>
			<tr>
				<th>id</th>
				<th>Nome</th>
				<th>Telefone</th>
				<th>E-mail</th>
			</tr>
		</thead>
		
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++){
			%>
			<tr>
				<td><%=lista.get(i).getIdcon() %></td>
				<td><%=lista.get(i).getNome() %></td>
				<td><%=lista.get(i).getFone() %></td>
				<td><%=lista.get(i).getEmail() %></td>
			</tr>
			<%
			}
			%>
			
		</tbody>
	</table>


</body>
</html>