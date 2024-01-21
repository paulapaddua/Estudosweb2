<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="controller.Ingresso" %>
    <%@ page import="model.filme" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Ingresso conta = new Ingresso();
	%>
	
	<% for (int i = 0; i < conta.controleingresso.size(); i++){ %>
	<fieldset>
		<p>filme: <%=conta.controleingresso.get(i).getFilme() %></p>
		<p>sala: <%=conta.controleingresso.get(i).getSala() %></p>
		<p>horario inicio: <%=conta.controleingresso.get(i).getHorarioInicio() %></p>
		<p>horario fim: <%=conta.controleingresso.get(i).getHorarioFim() %></p>
	</fieldset>
	<% } %>
</body>
</html>