//java 1 loiane exercicio 07 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.printf("primeiro numero: ");
		int num2 = sc.nextInt();

		System.out.printf("primeiro numero: ");
		int num3 = sc.nextInt();

		if (num1 == num2 && num1 == num3 && num2 == num1 && num2 == num3 && num3 == num1 && num3 == num2) {
			System.out.println("numeros iguais: " + num1 + ", " + num2 + " e " + num3 + ".");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println();
			System.out.println(num1 + " é o maior.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println();
			System.out.println(num2 + " é o maior.");

		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " é o maior.");
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " é o menor.");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " é o menor.");

		} else if (num3 < num1 && num3 < num2) {
			System.out.println(num3 + " é o menor.");

		} else {
			System.out.println();
			System.out.println("Opção inválida.");
		}

		sc.close();

	}

}
