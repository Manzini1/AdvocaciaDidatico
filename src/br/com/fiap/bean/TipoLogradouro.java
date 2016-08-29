package br.com.fiap.am.ltp.beans;

public class TipoLogradouro {
	private int codigoTipoLog;
	private String tipoLogradouro;
	
	public TipoLogradouro(int codigoTipoLog, String tipoLogradouro) {
		super();
		this.codigoTipoLog = codigoTipoLog;
		this.tipoLogradouro = tipoLogradouro;
	}

	public TipoLogradouro() {
		super();
	}

	public int getCodigoTipoLog() {
		return codigoTipoLog;
	}

	public void setCodigoTipoLog(int codigoTipoLog) {
		this.codigoTipoLog = codigoTipoLog;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
}
