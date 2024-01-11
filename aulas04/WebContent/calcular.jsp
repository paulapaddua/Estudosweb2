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
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String operation = request.getParameter("operation");

    // Vari�vel para armazenar o resultado
    double resultado = 0;

    switch (operation) {
        case "adicao":
            resultado = num1 + num2;
            break;
        case "subtracao":
            resultado = num1 - num2;
            break;
        case "multiplicacao":
            resultado = num1 * num2;
            break;
        case "divisao":
            if (num2 != 0) {
                resultado = num1 / num2;
            } 
            break;
        default:
            out.println("Opera��o inv�lida.");
            return;
    }
%>
 <h1>Resultado da Opera��o</h1>
    <p>O resultado �: <%= resultado %></p>
</body>
</html>