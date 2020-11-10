//aula 26 - metodos com retornos- classe de teste
package com.mateusborja.java1.aula26;

public class AplicacaoCarro {

	public static void main(String[] args) {

		Carro Palio = new Carro();

		Palio.marca = "Fiat";
		Palio.modelo = "Palio 4P";
		Palio.numPassageiros = 4;
		Palio.capCombustivel = 30;
		Palio.consCombustivel = 0.25;

		Palio.exibirAutonomia();

		System.out.println();
		double autonomia = Palio.obterAutonomia();

		System.out.println("Autonomia do Palio é = " + autonomia + "Km/l");

	}

}
