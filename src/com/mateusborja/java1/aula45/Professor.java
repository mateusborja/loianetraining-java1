/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 45  herança casting e operador instaceoff - classe def
package com.mateusborja.java1.aula45;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double salario;

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
	public String toString() {
		String s = super.toString();
		s += "\nLeciona o Curso: " + nomeCurso;
		s += "\nSalário: " + salario;
		return s;
	}

	@Override
	public String obterEquiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}

	public double calcularSalarioLiquido() {
		// TODO
		return 0;
	}

}
