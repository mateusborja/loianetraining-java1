/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 aula 45  herança casting e operador instaceoff - classe teste
package com.mateusborja.java1.aula45;

public class AplicacaoPessoa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Joao Honorio");
		aluno.setCurso("Desenvolvimento Java Developer");
		aluno.setTelefone("92 99828 4828");
		aluno.setEndereco("Rua Armando, 25, Bairro Centro");
		double notas1[] = { 10, 8, 7.5, 10, 8.0 };
		aluno.setNotas(notas1);
		System.out.println(aluno);

		Pessoa alunoPessoa = aluno; // upcasting
		Pessoa aluno2 = (Pessoa) new Aluno(); // convencao java Class objetc = new (Class) object 2 - casting manual

		Pessoa alunoPessoa1 = aluno;

		System.out.println(alunoPessoa);
		System.out.println(alunoPessoa1);

		// Pessoa aluno1 = (Pessoa) aluno4;

		Pessoa pessoa = new Pessoa();
		Aluno aluno5 = new Aluno();
		Professor prof = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa.");
		}

		if (aluno5 instanceof Aluno) {
			System.out.println("É do tipo Aluno.");
		}

		if (prof instanceof Professor) {
			System.out.println("É do tipo Professor.");
		}

		if (pessoa instanceof Professor) {
			System.out.println("É do tipo Professor.");
		} else {
			System.out.println("Váriavel \"pessoa\" não é do tipo Professor");
		}

		if (aluno2 instanceof Aluno) {
			System.out.println("É do tipo Aluno.");

		} else {
			System.out.println("Variável \"aluno2 \" não é do Tipo Aluno");
		}

	}

}
