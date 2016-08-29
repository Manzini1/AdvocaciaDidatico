package br.com.fiap.am.ltp.beans;

public class Bairro {
	private int codigoBairro;
	private String bairro;
	private Cidade cidade;
	public Bairro(int codigoBairro, String bairro, Cidade cidade) {
		super();
		this.codigoBairro = codigoBairro;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public Bairro() {
		super();
	}
	public int getCodigoBairro() {
		return codigoBairro;
	}
	public void setCodigoBairro(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
