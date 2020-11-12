 //aula 24 - execicio 01 - classe de definicao e comportamentos com metodos get e set
package com.mateusborja.java1.aula24exercicios;

public class Lampada {

	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	String[] tipos;
	int potencia;
	int garantiaMeses;
	boolean tipoAbajur;
	double valorLampada;
	double valorTotal;

	String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public double getValorLampada() {
		return valorLampada;
	}

	public void setValorLampada(double valorLampada) {
		this.valorLampada = valorLampada;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	

}
