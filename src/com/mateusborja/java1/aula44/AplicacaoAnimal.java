/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula44;

public class AplicacaoAnimal {

	public static void main(String[] args) {

		Papagaio papagaio = new Papagaio();
		Cachorro cachorro = new Cachorro();

		cachorro.setNome("Esquilo");
		cachorro.setRaca("buldog");
		cachorro.setTamanho("Médio");
		System.out.println(cachorro);

		papagaio.setNome("Joao");
		System.out.println(papagaio);

		Gato gato = new Gato();
		gato.setNome("puff");
		gato.setRaca("Leopard");
		System.out.println(gato);

		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Juruna");
		System.out.println(cavalo);

	}

}
