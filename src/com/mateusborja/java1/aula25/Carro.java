//aula 25 - metodos simples - classe de definicao
package com.mateusborja.java1.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + (capCombustivel * consCombustivel) + "Km/l.");

	}

}
