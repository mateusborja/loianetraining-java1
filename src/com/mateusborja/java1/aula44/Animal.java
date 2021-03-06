/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 loiane aula 44 - interface - classe def

package com.mateusborja.java1.aula44;

public abstract class Animal {

	private String nome;

	abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		String s = "**** DADOS DO ANIMAL ****";
		s += "\nNome: " + this.nome;
		return s;
	}

}
