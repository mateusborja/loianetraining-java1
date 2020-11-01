package com.mateusborja.aula09;

public class Aplicacao {

	public static void main(String[] args) {

		Animal a = new Animal();
		Animal rotveiller = new Cachorro();
		Animal persa = new Gato();

		rotveiller.falar();
		persa.falar();

		Cachorro c1 = new Cachorro();
		c1.falar();
		c1.morder();

		Animal vaca = new Vaca();
		vaca.falar();

	}

}
