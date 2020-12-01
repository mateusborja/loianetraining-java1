/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 exercicio 
package com.mateusborja.java1.aula52exercicio;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}

		if (cheia) {
			// lancar exception de agenda cheia
			throw new AgendaCheiaException();
		}
	}

	public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;

				}

			}

		}
		// lancar exception de contato nao existe
		throw new ContatoNaoExisteException(nome);

	}

	@Override
	public String toString() {
		String s = "";
		for (Contato contato : contatos) {
			if (contato != null) {
				s += contato.toString() + "\n";

			}

		}

		return s;
	}

}
