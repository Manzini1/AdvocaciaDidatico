package br.com.fiap.am.ltp.beans;

public class Cidade {
	private int codigoCidade;
	private String cidade;
	private Estado estado;
	public Cidade(int codigoCidade, String cidade, Estado estado) {
		super();
		this.codigoCidade = codigoCidade;
		this.cidade = cidade;
		this.estado = estado;
	}
	public Cidade() {
		super();
	}
	public int getCodigoCidade() {
		return codigoCidade;
	}
	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
