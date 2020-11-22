/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java aula 41 classes Abstratas

package com.mateusborja.java1.aula41;

public class AplicacaoTeste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		aluno.setEndereco("Rua 1, num 1");
		professor.setEndereco("Rua2, num2");

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
