//aula 26 - metodos com retornos- classe de definicao
package com.mateusborja.java1.aula26;

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

}
