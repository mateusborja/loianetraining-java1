//java 1 loiane exercicio 11
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com um numero inteiro: ");
		int num1 = sc.nextInt();

		System.out.println("entre com outro numero inteiro: ");
		int num2 = sc.nextInt();

		System.out.println("numero real: ");
		double num3 = sc.nextDouble();

		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3); // double resultado3 = (num3 * 3);
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.printf("Resultado 3: %.2f%n", resultado3);

		sc.close();

	}

}
