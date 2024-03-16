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
				<th>Nome</th>
				<th>Telefone</th>
				<th>E-mail</th>
				<th>Opção</th>
			</tr>
		</thead>
		
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++){
			%>
			<tr>
				<td><%=lista.get(i).getNome() %></td>
				<td><%=lista.get(i).getFone() %></td>
				<td><%=lista.get(i).getEmail() %></td>
				<td>
					<a href="select?idcon=<%=lista.get(i).getIdcon()%>" class="Botao">Editar</a>
					<a href="delete?idcon=<%=lista.get(i).getIdcon()%>" class="Botao">Apagar</a>
				</td>
			</tr>
			<%
			}
			%>
			
		</tbody>
	</table>


</body>
</html>