/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 37 heranca - classe def
package com.mateusborja.java1.aula37;

public class Aluno extends Pessoa {

	private String curso;
	private String[] notas;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		//TODO
		return 0;
		
	}
	
	public boolean verificarAprovado() {
		//TODO
		return true;
	}

}
