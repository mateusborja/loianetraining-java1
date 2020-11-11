//java 1 loiana aula 30 (palavra this) - classe teste
package com.mateusborja.java1.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double consCombustivel;
	double capCombustivel;

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("construtor com 3 parametros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("construtor com 2 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double consCombustivel, double capCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.consCombustivel = consCombustivel;
		this.capCombustivel = capCombustivel;
		System.out.println("construtor com 5 parametros");
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do Carro é: " + (this.capCombustivel * this.consCombustivel) + "Km/l.");

	}

	double obterAutonomia() {
		System.out.println("Metodo Obter Autonomia foi chamado.");
		// bloco de codigo

		double temp = capCombustivel * 0.06;
		return (this.capCombustivel * this.consCombustivel) - temp; // no final return e o tipo de dado do metodo

	}

	double calculaCombustivel(double km) {
		double qtdCombustivel = km / this.consCombustivel;
		return qtdCombustivel;

	}

}
