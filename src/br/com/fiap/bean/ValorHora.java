package br.com.fiap.am.ltp.beans;

public class ValorHora {
	private Advogado cdAdvogado;
	private int codigoHistHora;
	private String vigencia;
	private float valorHora;
	
	public ValorHora() {
		super();
	}

	public ValorHora(Advogado cdAdvogado, int codigoHistHora,
			String vigencia, float valorHora) {
		super();
		this.cdAdvogado = cdAdvogado;
		this.codigoHistHora = codigoHistHora;
		this.vigencia = vigencia;
		this.valorHora = valorHora;
	}

	public Advogado getCdAdvogado() {
		return cdAdvogado;
	}

	public void setCdAdvogado(Advogado cdAdvogado) {
		this.cdAdvogado = cdAdvogado;
	}

	public int getCodigoHistHora() {
		return codigoHistHora;
	}

	public void setCodigoHistHora(int codigoHistHora) {
		this.codigoHistHora = codigoHistHora;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
}
