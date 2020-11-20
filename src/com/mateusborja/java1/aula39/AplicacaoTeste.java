/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula39;

public class AplicacaoTeste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Joao Silva", "Rua 9, Casa 25", "xxx-xxx-xx-x", "supletivo");
		Pessoa aluno1 = new Aluno();

		aluno1.setNome("joao");
		aluno1.setCpf("xxx.xxxx");

		if (aluno != null && aluno1 != null) {
			System.out.println(aluno.getNome() + " e " + aluno1.getNome());
		}


		
		Aluno[] notas = new Aluno[3];

		System.out.println(aluno.toString());

	}

}
