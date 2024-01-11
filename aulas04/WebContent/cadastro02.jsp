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
        int peso = Integer.parseInt(request.getParameter("peso"));
        

        String faixaEtaria = (idade < 18) ? "adolescente" : "adulto";

        String setor = (peso < 100) ? "setor comum" : "setor de risco";
    %>

    <h2>Informações do Cadastro</h2>
    <p>O <%= faixaEtaria %> <%= nome %> deve ser enviado para o <%= setor %>.</p>
</body>
</html>