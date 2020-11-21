/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 37 heranca - classe def
package com.mateusborja.java1.aula38;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		System.out.println("classe filha aluno");
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
	public String toString() {
		return super.toString() + "Curso: " + getCurso() + ", " + "Notas: " + getNotas() + ", " + "\n";

	}

}
