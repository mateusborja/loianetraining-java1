//java 1 loiane exercicio 11 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("nota 2: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		String aproveitamento = "";

		if (media >= 9 && media <= 10) {
			aproveitamento = "A";

		} else if (media >= 7.5 && media < 9) {
			aproveitamento = "B";

		} else if (media >= 6.0 && media < 7.5) {
			aproveitamento = "C";

		} else if (media >= 4.0 && media < 6) {
			aproveitamento = "D";

		} else if (media >= 0 && media < 4) {
			aproveitamento = "E";

		}

		System.out.println("\nNota1: " + nota1);
		System.out.println("Nota2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + aproveitamento);

		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado!");
			break;

		case "D":
		case "E":
			System.out.println("Reprovado!");
			break;

		}

		sc.close();

	}

}
