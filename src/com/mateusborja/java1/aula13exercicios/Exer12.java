//java 1 loiane exercicio 12
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("altura: ");
		double altura = sc.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;
		System.out.printf("peso ideal: %.2f Kg%n", pesoIdeal);

		sc.close();

	}

}
