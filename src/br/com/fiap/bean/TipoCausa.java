package br.com.fiap.am.ltp.beans;

public class TipoCausa {
	private int codigoCausa;
	private String causa;
	public TipoCausa(int codigoCausa, String causa) {
		super();
		this.codigoCausa = codigoCausa;
		this.causa = causa;
	}
	public TipoCausa() {
		super();
	}
	public int getCodigoCausa() {
		return codigoCausa;
	}
	public void setCodigoCausa(int codigoCausa) {
		this.codigoCausa = codigoCausa;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	
}
