package model;

public class Cliente {
	  private String nome;
	    private String cpf;
	    private int numeroDep;
	    private String profissao;

	    public Cliente(String nome, String cpf, int numeroDep, String profissao) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.numeroDep = numeroDep;
	        this.profissao = profissao;
	    }
	    
	    public String getNome() {
			return nome;}
	    
		public void setNome(String nome) {}
		
		public String getCpf() {
			return cpf;}
		public void setcpf(String cpf) {}
		
		public int getNumeroDep() {
			return numeroDep;}
		public void setnumerpDep(String numeroDep) {}
		
		public String getProfissao() {
			return profissao;}
		public void setprofissao(String profissao) {}
		
		

}
