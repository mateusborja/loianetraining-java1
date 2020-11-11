//java 1 loiane aula 31 (modificadores public e private) - classe teste
package com.mateusborja.java1.aula31;

public class Carro {

	public String marca;
	String modelo;
	public int numPassageiros;
	double consCombustivel;
	public double capCombustivel;

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros, double consCombustivel, double capCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.consCombustivel = consCombustivel;
		this.capCombustivel = capCombustivel;
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do Carro é: " + (this.capCombustivel * this.consCombustivel) + "Km/l.");

	}

	public double obterAutonomia() {
		System.out.println("Metodo Obter Autonomia foi chamado.");
		// bloco de codigo

		double temp = capCombustivel * 0.06;
		return (this.capCombustivel * this.consCombustivel) - temp; // no final return e o tipo de dado do metodo

	}

	private double divideKmPorConsumoCombustivel(double km) { // metodo criado para calcular consumo com modificador
																// private, visto apenas nessa classe (metodo auxiliar)
		return km / this.consCombustivel;

	}

	public double calculaCombustivel(double km) {

		return this.divideKmPorConsumoCombustivel(km);

	}

}
