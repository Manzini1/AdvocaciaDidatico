package br.com.fiap.am.ltp.beans;

import java.util.Calendar;

public class Boleto {
	private int numBoleto;
	private Processo processo;
	private Hist_Taxa taxa;
	private Calendar dtVencimento;
	private Calendar dtEmissao;
	private float valor;
	private Calendar dtPagamento;
	public Boleto(int numBoleto, Processo processo, Hist_Taxa taxa,
			Calendar dtVencimento, Calendar dtEmissao, float valor,
			Calendar dtPagamento) {
		super();
		this.numBoleto = numBoleto;
		this.processo = processo;
		this.taxa = taxa;
		this.dtVencimento = dtVencimento;
		this.dtEmissao = dtEmissao;
		this.valor = valor;
		this.dtPagamento = dtPagamento;
	}
	public Boleto() {
		super();
	}
	public int getNumBoleto() {
		return numBoleto;
	}
	public void setNumBoleto(int numBoleto) {
		this.numBoleto = numBoleto;
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public Hist_Taxa getTaxa() {
		return taxa;
	}
	public void setTaxa(Hist_Taxa taxa) {
		this.taxa = taxa;
	}
	public Calendar getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(Calendar dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public Calendar getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Calendar dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Calendar getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Calendar dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	
	
}
