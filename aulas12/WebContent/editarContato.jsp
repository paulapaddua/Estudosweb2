<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Criar novo contato</h1>
	
	<form action="update" method="get" >
	<table>
			<tr>
				<td>
					<input class="Caixa" type="text" name="idcon" placeholder="id do Contato"
					value="<%out.print(request.getAttribute("idcon"));%>">
				</td>
			</tr>
			<tr>
				<td>
					<input class="Caixa" type="text" name="nome" placeholder="Nome"
					value="<%out.print(request.getAttribute("nome"));%>">
				</td>
			</tr>
			<tr>
				<td>
					<input class="Caixa" type="text" name="fone" placeholder="Telefone"
					value="<%out.print(request.getAttribute("fone"));%>">
				</td>
			</tr>
			<tr>
				<td>
					<input class="Caixa" type="text" name="email" placeholder="E-mail"
					value="<%out.print(request.getAttribute("email"));%>">
				</td>
			</tr>
		</table>
		
		<input class="Botao" type="submit" value="Salvar">
	</form>

</body>
</html>