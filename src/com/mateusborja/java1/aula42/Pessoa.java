/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

//java 1 aula 41 classes abstratas - classe def
package com.mateusborja.java1.aula42;

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		System.out.println("classe pai pessoa");
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

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", " + "Endereço: " + this.endereco + ", " + "Telefone: " + this.telefone + "\n";
	}

}
