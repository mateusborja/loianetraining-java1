//java 1 loiane exercicio 10
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("graus em Celius:  ");
		double celsius = sc.nextDouble();

		double fahrenheit = (celsius * 1.8) + 32;
		System.out.printf("graus em fahrenheit:  %.2fF%n", fahrenheit);

		sc.close();

	}

}
