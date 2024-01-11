<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pagina02</title>
</head>
<body>
<% String nome = request.getParameter("nome"); %>
<% int idade = Integer.parseInt(request.getParameter("idade")); %>

<% if (idade < 18){ %>
<p><%= nome %> é um Adolescente.<p>
<%} else{ %>
<p><%=nome%> é um adulto.<p>
<%} %>
</body>
</html>