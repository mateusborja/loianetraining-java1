/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 43 classe Object abstratas - classe teste
package com.mateusborja.java1.aula43;

public class AplicacaoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		aluno1.setCurso("Developer in Java");
		double notas1[] = { 10, 8, 7.5 };
		aluno1.setNotas(notas1);

		System.out.println(aluno1.toString());

		String s1 = "asdfasdfasdf";
		String s2 = "asdfasdfasdF";
		//System.out.println(s1 == s2); // avalia a referencia (end de memoria)
		//System.out.println(s1.equals(s2)); // avalia os valores e end de memoria
		//System.out.println(s1.equalsIgnoreCase(s2)); // avalia tudo incluindo Sensitive Case
		
		aluno2.setCurso("Developer in Java");
		double notas2[] = { 10, 8, 7.5 };
		aluno2.setNotas(notas2);
		
		System.out.println(aluno2.equals(aluno2));

	}

}
