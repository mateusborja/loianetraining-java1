//java 1 loiane exercicio 01 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("digite o primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.printf("digite o segundo numero: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("maior é: " + num1);

		} else if (num1 < num2) {
			System.out.println("maior é: " + num2);

		} else {
			System.out.println("numeros iguais: " + num1 + " e " + num2 + "!");

		}

		sc.close();

	}

}
