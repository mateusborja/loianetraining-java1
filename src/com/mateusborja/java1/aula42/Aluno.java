/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 42 palavra chave final - classe def
package com.mateusborja.java1.aula42;

public class Aluno {

	private String curso;
	private double[] notas;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		// TODO
		return 0;

	}

	public boolean verificarAprovado() {
		// TODO
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Curso: " + getCurso() + ", " + "Notas: " + getNotas() + ", " + "\n";

	}

}
