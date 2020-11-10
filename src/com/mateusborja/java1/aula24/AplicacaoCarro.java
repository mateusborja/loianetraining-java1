//java1 aula 24 - class, objects and attributes
package com.mateusborja.java1.aula24;

public class AplicacaoCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		Carro fusca = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		fusca.marca = "Volksvagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consCombustivel = 0.15;

		System.out.println();
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
