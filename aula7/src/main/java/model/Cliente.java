package model;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	
	public Cliente(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;}
	public void setNome(String nome) {}
	
	public String getTelefone() {
		return telefone;}
	public void setTelefone(String telefone) {}
	
	public String getEmail() {
		return email;}
	public void setEmail(String email) {}
}
