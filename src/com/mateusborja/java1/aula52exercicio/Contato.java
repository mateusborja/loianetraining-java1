/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 exercicio 
package com.mateusborja.java1.aula52exercicio;

public class Contato {

	private static int contador = 0;
	private int id;
	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		contador++;
		id += contador;

	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[";
		s += "Id: " + getId();
		s += " Nome: " + getNome();
		s += " Telefone: " + getTelefone();
		s += " Email: " + getEmail();
		s += " ]\n";
		return s;
	}

}
