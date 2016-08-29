package br.com.fiap.am.ltp.beans;

public class TipoTarefa {
	private int codigoTipoTarefa;
	private String tarefa;
	public TipoTarefa(int codigoTipoTarefa, String tarefa) {
		super();
		this.codigoTipoTarefa = codigoTipoTarefa;
		this.tarefa = tarefa;
	}
	public TipoTarefa() {
		super();
	}
	public int getCodigoTipoTarefa() {
		return codigoTipoTarefa;
	}
	public void setCodigoTipoTarefa(int codigoTipoTarefa) {
		this.codigoTipoTarefa = codigoTipoTarefa;
	}
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
}
