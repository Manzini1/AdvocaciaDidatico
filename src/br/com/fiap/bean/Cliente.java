package br.com.fiap.am.ltp.beans;

public class Cliente extends Pessoa {
	private Pessoa cdCliente;
	private String razaoSocial;
	private String cnpj;
	private int inscEstadual;
	private String email;
	private String password;
	public Cliente() {
		super();
		
	}
	
	public Cliente(int codigoPessoa, String nome, Pessoa cdCliente,
			String razaoSocial, String cnpj, int inscEstadual, String email,
			String password) {
		super(codigoPessoa, nome);
		this.cdCliente = cdCliente;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.email = email;
		this.password = password;
	}

	public Pessoa getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(Pessoa cdCliente) {
		this.cdCliente = cdCliente;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(int inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
