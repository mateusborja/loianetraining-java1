//java 1 loiane exercicio 16 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("valor de a: ");
		int a = sc.nextInt();

		if (a == 0) {
			System.out.println("a = 0. Não é equacao de 2 grau.");

		} else {

		}

		System.out.print("valor de b: ");
		int b = sc.nextInt();

		System.out.print("valor de c: ");
		int c = sc.nextInt();

		double delta = Math.pow(b, 2) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Não possui raiz real. Delta Negativo.");

		} else {

			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			System.out.printf("%ndelta = %.1f%n", delta);
			System.out.printf("x1 = %.1f%n", x1);
			System.out.printf("x2 = %.1f%n", x2);

		}

		sc.close();

	}

}
