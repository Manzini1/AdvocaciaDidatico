package br.com.fiap.am.ltp.beans;

public class Hist_Proc_Taxa {
private Processo nrProcesso;
private Hist_Taxa cdTaxa;
private String dtValidade;

public Hist_Proc_Taxa() {
	super();
}

public Hist_Proc_Taxa(Processo nrProcesso, Hist_Taxa cdTaxa, String dtValidade) {
	super();
	this.nrProcesso = nrProcesso;
	this.cdTaxa = cdTaxa;
	this.dtValidade = dtValidade;
}

public Processo getNrProcesso() {
	return nrProcesso;
}

public void setNrProcesso(Processo nrProcesso) {
	this.nrProcesso = nrProcesso;
}

public Hist_Taxa getCdTaxa() {
	return cdTaxa;
}

public void setCdTaxa(Hist_Taxa cdTaxa) {
	this.cdTaxa = cdTaxa;
}

public String getDtValidade() {
	return dtValidade;
}

public void setDtValidade(String dtValidade) {
	this.dtValidade = dtValidade;
}


}
