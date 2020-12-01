/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 exercicio 
package com.mateusborja.java1.aula52exercicio;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato)  {
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		return "Contato: " + nomeContato + " não existe na agenda!";
	}

}
 