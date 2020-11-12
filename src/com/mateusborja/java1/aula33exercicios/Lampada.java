//java aula 33 exercicios (consrtutores e encapsulamento) - classe def
package com.mateusborja.java1.aula33exercicios;

public class Lampada {

	private String modelo;
	private String tensao;
	private String cor;
	private String tipoLuz;
	private String[] tipos;
	private int potencia;
	private int garantiaMeses;
	private boolean tipoAbajur;
	private double valorLampada;
	private double valorTotal;

	private boolean ligada;

	public Lampada() {
	}

	public Lampada(String modelo, String tensao, String cor, String tipoLuz, String[] tipos, int potencia,
			int garantiaMeses, boolean tipoAbajur, double valorLampada, double valorTotal, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.tipos = tipos;
		this.potencia = potencia;
		this.garantiaMeses = garantiaMeses;
		this.tipoAbajur = tipoAbajur;
		this.valorLampada = valorLampada;
		this.valorTotal = valorTotal;
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
		System.out.println("Ligar!");
	}

	public void desligar() {
		setLigada(false);
		System.out.println("Deslsigar!");
	}

	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("Lampada ligada.");
		} else {
			System.out.println("Lampada desligada.");

		}
	}

	public void mudarEstado() {
		if (ligada) {
			desligar();
			System.out.println("A lampada foi desligada!");
		} else {
			ligar();
			System.out.println("A lampada foi ligada!");
		}
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String getTensao() {
		return tensao;
	}

	public void setCor(String cor) {
		this.cor = cor;

	}

	public String getCor() {
		return cor;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
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

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

}
