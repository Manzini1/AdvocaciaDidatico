package br.com.fiap.am.ltp.beans;

public class Telefone {
	private int codigoTel;
	private TipoTelefone tipoTelefone;
	private short dddFone;
	private String numeroFone;
	public Telefone(int codigoTel, TipoTelefone tipoTelefone, short dddFone,
			String numeroFone) {
		super();
		this.codigoTel = codigoTel;
		this.tipoTelefone = tipoTelefone;
		this.dddFone = dddFone;
		this.numeroFone = numeroFone;
	}
	public Telefone() {
		super();
	}
	public int getCodigoTel() {
		return codigoTel;
	}
	public void setCodigoTel(int codigoTel) {
		this.codigoTel = codigoTel;
	}
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public short getDddFone() {
		return dddFone;
	}
	public void setDddFone(short dddFone) {
		this.dddFone = dddFone;
	}
	public String getNumeroFone() {
		return numeroFone;
	}
	public void setNumeroFone(String numeroFone) {
		this.numeroFone = numeroFone;
	}
	
	
}
