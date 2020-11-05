//java 1 loiane exercicio 17 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("informe o ano: ");
		int ano = sc.nextInt();
		boolean anoBissexto = false;

		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			anoBissexto = true;
			System.out.println(ano + " é um ano bissexto.");

		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		sc.close();

	}

}
