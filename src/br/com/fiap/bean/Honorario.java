package br.com.fiap.am.ltp.beans;

import java.util.Calendar;

public class Honorario {
	private int codLancamento;
	private TipoTarefa tarefa;
	private Processo nrProcesso;
	private String dataHonorario;
	private double qtdeHoras;
	private String observacao;
	private double total;
	public Honorario() {
		super();
	}
	public Honorario(int codLancamento, TipoTarefa tarefa, Processo nrProcesso,
			String dataHonorario, double qtdeHoras, String observacao) {
		super();
		this.codLancamento = codLancamento;
		this.tarefa = tarefa;
		this.nrProcesso = nrProcesso;
		this.dataHonorario = dataHonorario;
		this.qtdeHoras = qtdeHoras;
		this.observacao = observacao;
	}
	public int getCodLancamento() {
		return codLancamento;
	}
	public void setCodLancamento(int codLancamento) {
		this.codLancamento = codLancamento;
	}
	public TipoTarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(TipoTarefa tarefa) {
		this.tarefa = tarefa;
	}
	public Processo getNrProcesso() {
		return nrProcesso;
	}
	public void setNrProcesso(Processo nrProcesso) {
		this.nrProcesso = nrProcesso;
	}
	public String getDataHonorario() {
		return dataHonorario;
	}
	public void setDataHonorario(String dataHonorario) {
		this.dataHonorario = dataHonorario;
	}
	public double getQtdeHoras() {
		return qtdeHoras;
	}
	public void setQtdeHoras(double qtdeHoras) {
		this.qtdeHoras = qtdeHoras;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
	
	
	
}
