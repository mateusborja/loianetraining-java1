//java 1 loiane exercicio 08
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor/hora:  ");
		double valorHora = sc.nextDouble();

		System.out.print("horas trabalhadas:  ");
		double horas = sc.nextDouble();

		double salario = valorHora * horas;
		System.out.printf("seu salario e: R$ %.2f%n ", salario);

		sc.close();

	}

}
