package br.com.fiap.am.ltp.beans;


public class Despesa {
	private int codigoLancamento;
	private TipoDepesas tipoDespesa;
	private String dtDespesa;
	private Processo nrProcesso;
	private float valor;
	private String observacao;
	public Despesa() {
		super();
	}
	
	public Despesa(int codigoLancamento, TipoDepesas tipoDespesa,
			String dtDespesa, Processo nrProcesso, float valor,
			String observacao) {
		super();
		this.codigoLancamento = codigoLancamento;
		this.tipoDespesa = tipoDespesa;
		this.dtDespesa = dtDespesa;
		this.nrProcesso = nrProcesso;
		this.valor = valor;
		this.observacao = observacao;
	}

	public int getCodigoLancamento() {
		return codigoLancamento;
	}
	public void setCodigoLancamento(int codigoLancamento) {
		this.codigoLancamento = codigoLancamento;
	}
	public TipoDepesas getTipoDespesa() {
		return tipoDespesa;
	}
	public void setTipoDespesa(TipoDepesas tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	public String getDtDespesa() {
		return dtDespesa;
	}
	public void setDtDespesa(String dtDespesa) {
		this.dtDespesa = dtDespesa;
	}
	public Processo getNrProcesso() {
		return nrProcesso;
	}
	public void setNrProcesso(Processo nrProcesso) {
		this.nrProcesso = nrProcesso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
