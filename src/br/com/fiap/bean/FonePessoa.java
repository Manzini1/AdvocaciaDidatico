package br.com.fiap.am.ltp.beans;

public class FonePessoa {
	
	private Pessoa cdPessoa;
	private Telefone cdTelefone;
	private int ramal;
	
	public FonePessoa() {
		super();
	}

	public FonePessoa(Pessoa cdPessoa, Telefone cdTelefone, int ramal) {
		super();
		this.cdPessoa = cdPessoa;
		this.cdTelefone = cdTelefone;
		this.ramal = ramal;
	}

	public Pessoa getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Pessoa cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public Telefone getCdTelefone() {
		return cdTelefone;
	}

	public void setCdTelefone(Telefone cdTelefone) {
		this.cdTelefone = cdTelefone;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	

}
