package br.com.fiap.am.ltp.beans;

public class TipoTelefone {
	private int codigoTipoTel;
	private String tipoTelefone;
	public TipoTelefone(int codigoTipoTel, String tipoTelefone) {
		super();
		this.codigoTipoTel = codigoTipoTel;
		this.tipoTelefone = tipoTelefone;
	}
	public TipoTelefone() {
		super();
	}
	public int getCodigoTipoTel() {
		return codigoTipoTel;
	}
	public void setCodigoTipoTel(int codigoTipoTel) {
		this.codigoTipoTel = codigoTipoTel;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
}
