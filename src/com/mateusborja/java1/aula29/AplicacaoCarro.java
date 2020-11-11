//java1 loiana aula 29 - classe teste (construtores)
package com.mateusborja.java1.aula29;

public class AplicacaoCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.modelo = "Ducato";
		// van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consCombustivel = 0.2;

		System.out.println(van.numPassageiros);

		Carro van2 = new Carro("Fiat Double", "Ducato", 10, 80, 0.2);

		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consCombustivel);

		Carro2 carro2 = new Carro2();
		
		

	}

}
