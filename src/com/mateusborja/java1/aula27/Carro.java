//aula 27 - metodo com parametro e retorno - classe definicao
package com.mateusborja.java1.aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do Carro é: " + (capCombustivel * consCombustivel) + "Km/l.");

	}

	double obterAutonomia() {
		System.out.println("Metodo Obter Autonomia foi chamado.");
		// bloco de codigo

		double temp = capCombustivel * 0.06;
		return (capCombustivel * consCombustivel) - temp; // no final return e o tipo de dado do metodo

	}

	double calculaCombustivel(double km) {

		double qtdCombustivel = km / consCombustivel;

		return qtdCombustivel;

	}

}
