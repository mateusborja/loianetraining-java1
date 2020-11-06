//java 1 loiane exercicio 18 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("digite um numero: ");

		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println(num1 + " é um número par.");

		} else {
			System.out.println(num1 + " é um número impar.");	

		}

		sc.close();

	}

}
