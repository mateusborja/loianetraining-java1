//java 1 loiane - aula 32 (metodos get e set) - classe teset
package com.mateusborja.java1.aula32;

public class AplicacaoCarro {

	public static void main(String[] a) {

		Carro van = new Carro();

		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		van.setSeisMarchas(false);

		System.out.println(van.getMarca());

	}

}
