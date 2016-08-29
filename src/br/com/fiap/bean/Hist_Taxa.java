package br.com.fiap.am.ltp.beans;

import java.util.Calendar;

public class Hist_Taxa {
	private int codigoTaxa;
	private String vigencia;
	private float taxaJuros;
	private float moraDiaria;
	private float taxaAdmin;
	public Hist_Taxa() {
		super();
	}
	public Hist_Taxa(int codigoTaxa, String vigencia, float taxaJuros,
			float moraDiaria, float taxaAdmin) {
		super();
		this.codigoTaxa = codigoTaxa;
		this.vigencia = vigencia;
		this.taxaJuros = taxaJuros;
		this.moraDiaria = moraDiaria;
		this.taxaAdmin = taxaAdmin;
	}
	public int getCodigoTaxa() {
		return codigoTaxa;
	}
	public void setCodigoTaxa(int codigoTaxa) {
		this.codigoTaxa = codigoTaxa;
	}
	public String getVigencia() {
		return vigencia;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	public float getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public float getMoraDiaria() {
		return moraDiaria;
	}
	public void setMoraDiaria(float moraDiaria) {
		this.moraDiaria = moraDiaria;
	}
	public float getTaxaAdmin() {
		return taxaAdmin;
	}
	public void setTaxaAdmin(float taxaAdmin) {
		this.taxaAdmin = taxaAdmin;
	}
	
	
}
