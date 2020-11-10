//aula 25 - metodos simples - classe teste
package com.mateusborja.java1.aula25;

public class TesteCarro {

	public static void main(String[] args) {

		Carro Palio = new Carro();

		Palio.marca = "Fiat";
		Palio.modelo = "Palio 4P";
		Palio.numPassageiros = 4;
		Palio.capCombustivel = 30;
		Palio.consCombustivel = 0.25;
		
		Palio.exibirAutonomia();

	}

}
