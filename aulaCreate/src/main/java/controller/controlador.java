package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.DAO;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/insert"})
public class controlador extends HttpServlet {
	DAO dao = new DAO();
	Cliente contato = new Cliente();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		
		if(action.equals("/insert")) {
			novoContato(request, response);
		}
	}

	protected void novoContato(HttpServletRequest request, HttpServletResponse response) throws IOException {
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		
		dao.inserirContato(contato);
		
		PrintWriter saida = response.getWriter();
		saida.println("usuario cadastrado com sucesso");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
