/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 43 classe Object abstratas - classe def
package com.mateusborja.java1.aula43;

import java.util.Arrays;

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
		super.toString();
		String s = "Curso: " + curso + "\nNotas: ";
		for (double nota : notas) {
			s += nota + " ";
		}
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}

		return false;
	}

}
