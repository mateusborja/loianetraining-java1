/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula37;

public class AplicacaoPessoa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		Pessoa aluno1 = new Aluno();

		double notas[] = { 10, 8, 9.5 };

		aluno.setCurso("Java Developer");
		aluno.setNotas(notas);

		System.out.println(aluno.obterEtiqueta());

	}

}
