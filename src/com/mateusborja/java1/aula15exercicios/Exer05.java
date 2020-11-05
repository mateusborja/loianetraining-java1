//java 1 loiane exercicio 05 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.printf("segunda nota: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Média: " + media + ". \nAprovado com distinçao..");

		} else if (media >= 7) {
			System.out.println("Média: " + media + ". \nAluno aprovado.");

		} else {
			System.out.println("Média: " + media + ". \nAluno reprovado.");

		}

		sc.close();

	}

}
