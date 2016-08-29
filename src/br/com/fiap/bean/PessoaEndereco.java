package br.com.fiap.am.ltp.beans;

public class PessoaEndereco {
private int codigoPessoaEnd;
private Pessoa cdPessoa;
private Logradouro cep;
private int nrEndereco;
private String dsComplemento;

public PessoaEndereco() {
	super();
}

public PessoaEndereco(int codigoPessoaEnd, Pessoa cdPessoa, Logradouro cep,
		int nrEndereco, String dsComplemento) {
	super();
	this.codigoPessoaEnd = codigoPessoaEnd;
	this.cdPessoa = cdPessoa;
	this.cep = cep;
	this.nrEndereco = nrEndereco;
	this.dsComplemento = dsComplemento;
}

public int getCodigoPessoaEnd() {
	return codigoPessoaEnd;
}

public void setCodigoPessoaEnd(int codigoPessoaEnd) {
	this.codigoPessoaEnd = codigoPessoaEnd;
}

public Pessoa getCdPessoa() {
	return cdPessoa;
}

public void setCdPessoa(Pessoa cdPessoa) {
	this.cdPessoa = cdPessoa;
}

public Logradouro getCep() {
	return cep;
}

public void setCep(Logradouro cep) {
	this.cep = cep;
}

public int getNrEndereco() {
	return nrEndereco;
}

public void setNrEndereco(int nrEndereco) {
	this.nrEndereco = nrEndereco;
}

public String getDsComplemento() {
	return dsComplemento;
}

public void setDsComplemento(String dsComplemento) {
	this.dsComplemento = dsComplemento;
}


}