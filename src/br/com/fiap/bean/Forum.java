package br.com.fiap.am.ltp.beans;

public class Forum  extends Pessoa{
	private Pessoa cdForum;
	private String dsForum;

	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Forum(int codigoPessoa, String nome, Pessoa cdForum, String dsForum) {
		super(codigoPessoa, nome);
		this.cdForum = cdForum;
		this.dsForum = dsForum;
	}

	public Pessoa getCdForum() {
		return cdForum;
	}

	public void setCdForum(Pessoa cdForum) {
		this.cdForum = cdForum;
	}

	public String getDsForum() {
		return dsForum;
	}

	public void setDsForum(String dsForum) {
		this.dsForum = dsForum;
	}

	
	
	
}
