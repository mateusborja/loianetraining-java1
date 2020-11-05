//java 1 loiane exercicio 09 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.print("primeiro numero: ");
		int num2 = sc.nextInt();

		System.out.print("primeiro numero: ");
		int num3 = sc.nextInt();

		// 3 numeros ordem decrescente
		System.out.println("\nordem decrescente: ");
		if (num1 < num2 && num1 < num3 && num3 < num2) {
			System.out.println(num2 + " - " + num3 + " - " + num1 + ".");

		} else if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num3 + " - " + num2 + " - " + num1 + ".");

		} else if (num2 < num1 && num2 < num3 && num1 < num3) {
			System.out.println(num3 + " - " + num1 + " - " + num2 + ".");

		} else if (num2 < num1 && num2 < num3 && num3 < num1) {
			System.out.println(num1 + " - " + num2 + " - " + num2 + ".");

		} else if (num3 < num1 && num3 < num2 && num2 < num1) {
			System.out.println(num1 + " - " + num2 + " - " + num3 + ".");

		} else if (num3 < num1 && num3 < num2 && num1 < num2) {
			System.out.println(num2 + " - " + num1 + " - " + num3 + ".");

		} else {
			System.out.println("opção inválida.");
		}

		sc.close();

	}

}
