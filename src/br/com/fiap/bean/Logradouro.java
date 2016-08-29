package br.com.fiap.am.ltp.beans;

public class Logradouro {
	private String cep;
	private String logradouro;
	private TipoLogradouro tipoLogradouro;
	private Bairro bairro;
	public Logradouro(String cep, String logradouro,
			TipoLogradouro tipoLogradouro, Bairro bairro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.tipoLogradouro = tipoLogradouro;
		this.bairro = bairro;
	}
	public Logradouro() {
		super();
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
}
