/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java aula 40 polimorfismo - classe teste
package com.mateusborja.java1.aula40;

public class AplicacaoPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 2, num2");
		professor.setEndereco("Rua 3, num3");

		System.out.println(pessoa.obterEquiquetaEndereco());
		System.out.println(aluno.obterEquiquetaEndereco());
		System.out.println(professor.obterEquiquetaEndereco());

	}

}
