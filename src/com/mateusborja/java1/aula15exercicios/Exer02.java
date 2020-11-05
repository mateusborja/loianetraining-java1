//java 1 loiane exercicio 02 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("digite um numero: ");

		int num = sc.nextInt();

		if (num >= 0) { // condicao de numero positivo
			System.out.println(num + " é um numero positivo.");

		} else {
			System.out.println(num + " é um numero negativo. ");

		}

		sc.close();

	}

}
