package br.com.fiap.am.ltp.beans;

public class Processo {
	private int numProcesso;
	private Cliente cliente;
	private TipoCausa causa;
	private Advogado advogado;
	private Honorario honorario;
	private Despesa despesa;
	private String descricao;
	private String dtAbertura;
	private String dtFechamento;
	private int resultadoCausa;
	private String observacao;
	private int situacao;
	
	public Processo() {
		super();
	}

	public Processo(int numProcesso, Cliente cliente, TipoCausa causa,
			Advogado advogado, Honorario honorario, Despesa despesa,
			String descricao, String dtAbertura, String dtFechamento,
			int resultadoCausa, String observacao, int situacao) {
		super();
		this.numProcesso = numProcesso;
		this.cliente = cliente;
		this.causa = causa;
		this.advogado = advogado;
		this.honorario = honorario;
		this.despesa = despesa;
		this.descricao = descricao;
		this.dtAbertura = dtAbertura;
		this.dtFechamento = dtFechamento;
		this.resultadoCausa = resultadoCausa;
		this.observacao = observacao;
		this.situacao = situacao;
	}

	public int getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(int numProcesso) {
		this.numProcesso = numProcesso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoCausa getCausa() {
		return causa;
	}

	public void setCausa(TipoCausa causa) {
		this.causa = causa;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	public Honorario getHonorario() {
		return honorario;
	}

	public void setHonorario(Honorario honorario) {
		this.honorario = honorario;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public String getDtFechamento() {
		return dtFechamento;
	}

	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}

	public int getResultadoCausa() {
		return resultadoCausa;
	}

	public void setResultadoCausa(int resultadoCausa) {
		this.resultadoCausa = resultadoCausa;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	
	
	
		
	
}
