package br.com.fiap.am.ltp.beans;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
		
	public Pessoa() {
		super();
	}

	public Pessoa(int codigoPessoa, String nome) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
