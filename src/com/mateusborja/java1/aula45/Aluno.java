/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 45  herança casting e operador instaceoff - classe def
package com.mateusborja.java1.aula45;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

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
	public String obterEquiquetaEndereco() {
		String s = "Enderedo do Aluno: ";
		s += super.getEndereco();
		return s;

	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCurso: " + curso;
		s += "\nNotas: ";
		for (double nota : notas) {
			s += nota + " ";
		}

		return s;
	}

}
