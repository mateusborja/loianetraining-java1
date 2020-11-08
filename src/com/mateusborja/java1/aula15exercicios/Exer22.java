//java 1 loiane exercicio 22 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("quantidade em Kg Morango: ");
		double qtdeMorango = sc.nextDouble();

		System.out.print("quantidade em Kg Maça: ");
		double qtdeMaca = sc.nextDouble();

		double precoKgMorango = 0;
		double precoKgMaca = 0;

		if (qtdeMorango <= 5) {
			precoKgMorango = 8.0;

		} else {
			precoKgMorango = 0.0;

		}

		if (qtdeMaca <= 5) {
			precoKgMaca = 6.;

		} else {
			precoKgMaca = 4.5;

		}

		
		
		double precoTotalMorango = qtdeMorango * precoKgMorango;
		double precoTotalMaca = qtdeMaca * precoKgMaca;
		double precoParcial = precoKgMorango + precoTotalMaca;
		double precoTotal = precoParcial;

		if ((qtdeMorango + qtdeMaca) > 8 || precoParcial > 25.0) {
			precoTotal = precoParcial - (precoParcial / 100) * 10.0;
		}

		System.out.printf("%nPreço Total R$ %.2f.%n", precoTotal);
		sc.close();

	}

}
