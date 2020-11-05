//java 1 loiane exercicio 11 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("salario: R$ ");

		double salario = sc.nextDouble();
		double percentual = 0.0;

		if (salario <= 280) {
			percentual = 20;

		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}

		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;

		System.out.printf("%nsalário: R$ %.2f%n", salario);
		System.out.printf("percentual de aumento: %.1f%%%n", percentual);
		System.out.printf("aumento: R$ R$ %.2f%n", aumento);
		System.out.printf("salário ajustado: R$ %.2f%n", salarioAjustado);

		sc.close();

	}

}
