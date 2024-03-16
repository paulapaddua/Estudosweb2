package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO {
	
public void testeConexao() {}
public void inserirContato(Cliente contato) {	


	String create = "insert into contatos(nome, fone, email) values (?,?,?)";

	try {
		
		Connection con = conectar();
		
	
		PreparedStatement pst = con.prepareStatement(create);
		pst.setString(1,  contato.getNome());
		pst.setString(2,  contato.getFone());
		pst.setString(3,  contato.getemail());
		
		pst.executeUpdate();
		con.close();
	} catch (Exception e) {
		System.out.println(e);
		}
	}
private Connection conectar() {
	// TODO Auto-generated method stub
	return null;
}}
		
	


