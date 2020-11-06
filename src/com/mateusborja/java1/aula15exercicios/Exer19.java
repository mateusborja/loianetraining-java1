//java 1 loiane exercicio 19 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.print("segundo numero: ");
		int num2 = sc.nextInt();

		System.out.print("operação: + - / *: ");
		String operacao = sc.next();

		double resultado = 0;
		boolean validar = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("operação inválida.");
			validar = false;
			break;
		}

		if (validar == false) {

		} else {

			System.out.println("\nresultado: " + resultado);
		}

		// flag validar
		if (validar) {
			if (resultado >= 0) {
				System.out.println("numero positivo.");
			} else {
				System.out.println("numero negativo.");

			}

			if (resultado % 2 == 0) {
				System.out.println("numero par.");
			} else {
				System.out.println("numero impar.");

			}
		}

		sc.close();

	}

}

