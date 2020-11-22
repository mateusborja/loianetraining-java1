/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 42 palavra chave final - classe teste
package com.mateusborja.java1.aula42;

public class AplicacaoTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		pessoa.setEndereco("Rua 1, num1");
		aluno.setCurso("curso 3d");
		professor.setSalario(500);

		System.out.println(pessoa.getEndereco());
		System.out.println(aluno.getCurso());
		System.out.println(professor.getSalario());
		
		System.out.println(Constantes.SITE_ALEX_BORJA);
		System.out.println(Constantes.SITE_MATEUS_BORJA);
		System.out.println(Constantes.SITE_BORJAPHOTOS);

	}

}
