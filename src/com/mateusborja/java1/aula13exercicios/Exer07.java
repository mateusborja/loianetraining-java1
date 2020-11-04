//java 1 loiane exercicio 07
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("digite o lado do quadrado:  ");
		double lado = sc.nextDouble();

		double area = Math.pow(lado, 2);
		System.out.printf("area do quadrado e: %.1f m%n", area);
		System.out.printf("dobro da area: %.1f m%n", area * 2);

		sc.close();

	}

}
