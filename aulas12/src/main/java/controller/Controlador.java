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

@WebServlet(urlPatterns = {"/insert", "/read", "/select", "/update", "/delete"})
public class Controlador extends HttpServlet {

	DAO dao = new DAO();
	Cliente contato = new Cliente();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		
		if (action.equals("/insert")) {
			novoContato(request, response);
		} else if (action.equals("/read")) {
			listarContatos(request, response);
		} else if (action.equals("/select")) {
			selecionarContato(request, response);
		} else if (action.equals("/update")) {
			editarContato(request, response);
		} else if (action.equals("/delete")) {
			deletarContato(request, response);
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
	
	protected void selecionarContato (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//receber o id do contato que vai ser editado
		String idcon = request.getParameter("idcon");
		
		//setar a variavel auxiliar para salvar o id
		contato.setIdcon(idcon);
		
		//executar o método para selecionar contato do DAO
		dao.selecionarContato(contato);
		
		//Setar os atributos a serem enviados para o formulário 
		request.setAttribute("idcon", contato.getIdcon());
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("fone", contato.getFone());
		request.setAttribute("email", contato.getEmail());
		
		//Encaminhar ao documento editarContato.jsp
		RequestDispatcher rd = request.getRequestDispatcher("editarContato.jsp");
		rd.forward(request, response);
		
	}
	
	//método para editar o contato - UPDATE
	protected void editarContato (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Criando um objeto para enviar para o banco
		contato.setIdcon(request.getParameter("idcon"));
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		
		//executar o método para selecionar contato do DAO
		dao.alterarContato(contato);
		
		//Encaminhar a página de listar
		response.sendRedirect("index.html");
		
	}
	
	protected void deletarContato (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//criando um objeto para enviar para o banco
		contato.setIdcon(request.getParameter("idcon"));
		
		//executar o método de alterar contato
		dao.deletarContato(contato);
		
		//redirecionar a pagina de listar
		response.sendRedirect("index.html");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
