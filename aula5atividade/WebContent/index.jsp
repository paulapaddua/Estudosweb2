<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="controller.Ingresso" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String filme = request.getParameter("filme");
	String sala = request.getParameter("sala");
	int horarioInicio = Integer.parseInt(request.getParameter("horarioInicio"));
	int horarioFim = Integer.parseInt(request.getParameter("horarioFim"));
	
	
	
	Ingresso conta = new Ingresso();
	conta.controleingresso(filme, sala, horarioInicio,horarioFim);
	%>
	
	<h1>Ingresso comprado com sucesso</h1>
	<p>Pegue a Pipoca,  Procure a sala <%=sala%> no horario <%=horarioInicio %> e curta o filme <%=filme%></p>
	
</body>
</html>