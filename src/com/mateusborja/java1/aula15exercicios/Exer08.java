//java 1 loiane exercicio 08 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("primeiro preço: ");
		double preco1 = sc.nextDouble();

		System.out.print("segundo preço: ");
		double preco2 = sc.nextDouble();

		System.out.print("terceiro preço: ");
		double preco3 = sc.nextDouble();

		if (preco1 == preco2 && preco1 == preco3 && preco2 == preco1 && preco2 == preco3 && preco3 == preco1
				&& preco3 == preco2) {
			System.out.println();
			System.out.println("preços iguais.");
		} else if (preco1 < preco2 && preco1 < preco3) {
			System.out.println();
			System.out.println("compre o \"primeiro\" produto.");
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println();
			System.out.println("compre o \"segundo\" produto.");
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println();
			System.out.println("compre o \"terceiro\" produto.");
		} else {
			System.out.println();
			System.out.println("opção inválida.");
		}

		sc.close();

	}

}
