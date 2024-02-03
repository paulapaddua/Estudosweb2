package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;

public class Salvar extends HttpServlet {
	
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nome = request.getParameter("nome");
	        String cpf = request.getParameter("cpf");
	        int numeroDep = Integer.parseInt(request.getParameter("numeroDep"));
	        String profissao = request.getParameter("profissao");
	        
	        Cliente cli = new Cliente(nome, cpf, numeroDep, profissao);
	        
	        response.sendRedirect("sucesso.jsp?nome="+cli.getNome()+"&cpf="+cli.getCpf()+"&numeroDep="+cli.getNumeroDep()+"&profissao="+cli.getProfissao());
	}

}
