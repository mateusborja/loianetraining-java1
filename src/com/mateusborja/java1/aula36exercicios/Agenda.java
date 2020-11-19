/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula36exercicios;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public Agenda() {
	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContato(Contato[] contatos) {
		this.contatos = contatos;
	}

	//metodo que obtem as informações da agenda
	public String obterInfo() {
		String info = "Nome: " + nome + "\n";

		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}

		return info;
	}

}
