//java 1 loiane exercicio 09
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("graus em Fahrenheit:  ");
		double fahrenheit = sc.nextDouble();

		double celsius = (5 * (fahrenheit - 32) / 9);
		System.out.printf("graus em celsius:  %.2fC%n", celsius);

		sc.close();

	}

}
