/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 41 classes abstratas - classe def
package com.mateusborja.java1.aula41;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double salario;

	public Professor() {
		super();
	}

	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String obterEquiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Impressão:");
		System.out.println(this.obterEquiquetaEndereco());
	}

	public double calcularSalarioLiquido() {
		// TODO
		return 0;
	}

}
