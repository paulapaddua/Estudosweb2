<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina01</title>
</head>
<body>
<% int repeticao = Integer.parseInt(request.getParameter("repeticao")); %>
<% for (int i = 0; i < repeticao; i++) { %>
            <p>Uma frase qualquer!</p>
        <% } %>
</body>
</html>