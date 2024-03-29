package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/agenda";
	private String user = "root";
	private String password = "padua123";
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
	
	
	public void inserirContato(Cliente contato) {
		String create = "insert into contatos (nome,fone,email) values(?,?,?)";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
		public ArrayList<Cliente> listarContatos() {
			ArrayList<Cliente> contatos = new ArrayList<>();
			String read = "select * from contatos order by nome";
			
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					String idcon = rs.getString(1);
					String nome = rs.getString(2);
					String fone = rs.getString(3);
					String email = rs.getString(4);
					contatos.add(new Cliente(idcon, nome, fone, email));
				}

				con.close();
				return contatos;
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		public void selecionarContato(Cliente cliente) {
			String select = "select * from contatos where idcon = ?";
			
			try {
				Connection con = conectar();
				
				PreparedStatement pst = con.prepareStatement(select);
				pst.setString(1, cliente.getIdcon());
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					cliente.setIdcon(rs.getString(1));
					cliente.setNome(rs.getString(2));
					cliente.setFone(rs.getString(3));
					cliente.setEmail(rs.getString(4));
				}
				con.close();
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void alterarContato(Cliente cliente) {
			
			String update = "update contatos set nome=?, fone=?, email=? where idcon=?";
			
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(update);
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getFone());
				pst.setString(3, cliente.getEmail());
				pst.setString(4, cliente.getIdcon());
				pst.executeUpdate();
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void deletarContato(Cliente cliente) {
			String delete = "delete from contatos where idcon=?";
			
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, cliente.getIdcon());
				pst.executeUpdate();
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			} 
		}

}
