package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/insert", "/read"})
public class controlador extends HttpServlet {

	DAO dao = new DAO();
	Cliente contato = new Cliente();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		
		if(action.equals("/insert")) {
			novoContato(request, response);
		} else if(action.equals("/read")) {
			listarContatos(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void novoContato(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		
		dao.inserirContato(contato);
		
		PrintWriter saida = response.getWriter();
		saida.println("Usuário cadastrado com sucesso!");
	}
	
	protected void listarContatos (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//criando um objeto que vai receber os dados do banco
		ArrayList<Cliente> lista = dao.listarContatos();
		
		//encaminhar a lista ao documento listarContatos.jsp
		request.setAttribute("contatos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarContatos.jsp");
		rd.forward(request, response);
	}

}
