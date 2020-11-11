//java 1 loiane aula 31 (modificadores public e private) - classe teste
package com.mateusborja.java1.aula31;

public class AplicacaoCarro {

	public static void main(String[] a) {

		Carro carro = new Carro();

		carro.marca = "Fiat";
		carro.capCombustivel = 45;
		carro.consCombustivel = 2;
		

		System.out.println(carro.calculaCombustivel(75));

	}

}
