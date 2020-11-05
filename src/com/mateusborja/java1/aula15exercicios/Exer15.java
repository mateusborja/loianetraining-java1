//java 1 loiane exercicio 11 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("lado 1: ");
		int lado1 = sc.nextInt();

		System.out.print("lado 2: ");
		int lado2 = sc.nextInt();

		System.out.print("lado 3: ");
		int lado3 = sc.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("triangulo equilatero.");
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
				System.out.println("triangulo escaleno.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("triangulo isoceles.");

			}

		} else {
			System.out.println("não forma triangulo!");
		}

		sc.close();

	}

}
