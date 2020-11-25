/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

//java 1 aula 45  herança casting e operador instaceoff - classe def
package com.mateusborja.java1.aula45;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String obterEquiquetaEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		String s = "\n*** DADOS DA PESSOA ***";
		s += "\nNome: " + nome;
		s += "\nEndereço: " + endereco;
		s += "\nTelefone: " + telefone;
		return s;
	}

}
