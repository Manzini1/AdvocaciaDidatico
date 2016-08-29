package br.com.fiap.am.ltp.beans;

public class Estado {
	private int codigoEstado;
	private String estado;
	private String sgEstado;
	public int getCodigoEstado() {
		return codigoEstado;
	}
	public Estado(int codigoEstado, String estado, String sgEstado) {
		super();
		this.codigoEstado = codigoEstado;
		this.estado = estado;
		this.sgEstado = sgEstado;
	}
	public Estado() {
		super();
	}
	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSgEstado() {
		return sgEstado;
	}
	public void setSgEstado(String sgEstado) {
		this.sgEstado = sgEstado;
	}

	
}
