<%@page import="model.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String nome = request.getParameter("nome");
	String cpf  = request.getParameter("cpf");
	int numeroDep = Integer.parseInt(request.getParameter("numeroDep"));
	String profissao = request.getParameter("profissao");
	
	String localizacaoDepartamento = "";
	
	switch (numeroDep) {
    case 1:
    	localizacaoDepartamento = "Comunicação";
    	break;
    case 2:
    	localizacaoDepartamento = "RH";
    	break;
    case 3:
    	
    	localizacaoDepartamento = "Almoxarifado";
    	break;
    case 4:
    	localizacaoDepartamento = "Depósito";
    	break;
    	
    default:
    	out.println("Departamento desconhecido");
        return;
}

	%>
	
		<h1>Cliente</h1>
		<fieldset>
		<legend>O seguinte Cliente foi cadastrado</legend>
		
		<p>O seguinte Cliente foi cadastrado</p>
		<p>
		Nome:<%=nome %><br>
		CPF:<%=cpf %><br>
		Departamento:<%=numeroDep%> seu departamento é <%=localizacaoDepartamento %> <br>
		Profissao:<%=profissao %><br>
		
		
		</p>
		
		</fieldset>
</body>
</html>