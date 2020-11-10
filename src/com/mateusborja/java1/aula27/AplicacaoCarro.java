//aula 27 - metodo com parametro e retorno - classe teste
package com.mateusborja.java1.aula27;

public class AplicacaoCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();

		carro.capCombustivel = 100;
		carro.consCombustivel = 0.2;

		double qtdCombustivel15Km = carro.calculaCombustivel(10);
		double qtdCombustivel25Km = carro.calculaCombustivel(15);

		System.out.println("Consumo medio em 10 km = " + qtdCombustivel15Km + " Litros");
		System.out.println("Consumo medio em 15 km = " + qtdCombustivel25Km + " Litros");

	}

}
