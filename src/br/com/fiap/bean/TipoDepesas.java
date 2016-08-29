package br.com.fiap.am.ltp.beans;

public class TipoDepesas {
	private int codigoDespesa;
	private String despesa;
	public TipoDepesas(int codigoDespesa, String despesa) {
		super();
		this.codigoDespesa = codigoDespesa;
		this.despesa = despesa;
	}
	public TipoDepesas() {
		super();
	}
	public int getCodigoDespesa() {
		return codigoDespesa;
	}
	public void setCodigoDespesa(int codigoDespesa) {
		this.codigoDespesa = codigoDespesa;
	}
	public String getDespesa() {
		return despesa;
	}
	public void setDespesa(String despesa) {
		this.despesa = despesa;
	}
	
}
