//java1 loiana aula 29 - classe definicao (construtores)
package com.mateusborja.java1.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel; // atributos estao com modificador default visto apenas no pacote

	public Carro() {
		System.out.println("Classe carro foi instanciada");

		numPassageiros = 4;
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		marca = marca;
		modelo = modelo;
		numPassageiros = numPassageiros;
		
	}

}
