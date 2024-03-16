package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.PreparedQuery;

public class DAO {
	/** Módulo de conexão **/
	//Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/agenda";
	private String user = "root";
	private String password = "1234";
	
	//Método de conexão
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//CRUD CREATE
	
	public void inserirContato(Cliente contato) {
		String create = "insert into contatos (nome,fone,email) values(?,?,?)";
		
		try {
			//Abrir conexão
			Connection con = conectar();
			
			//preparar a query ara execução do bd
			PreparedStatement pst = con.prepareStatement(create);
			
			//substituir os ("?") por conteúdo
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			
			//executar a query
			pst.executeUpdate();
			
			//encerrar a conexão com o banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//CRUD READ
	
		public ArrayList<Cliente> listarContatos() {
			//criando um array para armazenar os objetos
			ArrayList<Cliente> contatos = new ArrayList<>();
			
			//definindo a query
			String read = "select * from contatos order by nome";
			
			try {
				//Abrir conexão
				Connection con = conectar();
				
				//preparar a query ara execução do bd
				PreparedStatement pst = con.prepareStatement(read);
				
				//executando a query
				ResultSet rs = pst.executeQuery();
				
				//recebendo os dados dos objetos
				while (rs.next()) {
					//pegando cada coluna do objeto
					String idcon = rs.getString(1);
					String nome = rs.getString(2);
					String fone = rs.getString(3);
					String email = rs.getString(4);
					//populando o arraylist
					contatos.add(new Cliente(idcon, nome, fone, email));
				}

				//encerrar a conexão com o banco
				con.close();
				
				//retornando o arraylist
				return contatos;
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}

}
