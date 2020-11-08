//java 1 loiane exercicio 23 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double precoKg = 0.0;

		System.out.print("qtde comprada: ");
		double qtdComprada = sc.nextDouble();

		System.out.print("tipo da carne (F-File / A-Alcatara / P-Picanha): ");
		String tipoCarne = sc.next();

		if (tipoCarne.equalsIgnoreCase("f")) {

			System.out.println(qtdComprada + " Kg - Filé");

			if (qtdComprada <= 5) {
				precoKg = 4.90;

			} else {
				precoKg = 5.80;
			}

		} else if (tipoCarne.equalsIgnoreCase("a")) {

			System.out.println(qtdComprada + " Kg - Alcatara");

			if (qtdComprada <= 5) {
				precoKg = 5.90;

			} else {
				precoKg = 6.80;
			}

		} else if (tipoCarne.equalsIgnoreCase("p")) {

			System.out.println(qtdComprada + " Kg - Picanha");

			if (qtdComprada <= 5) {
				precoKg = 6.90;

			} else {
				precoKg = 7.80;
			}

		}

		double total = qtdComprada * precoKg;
		System.out.println(qtdComprada + " Kg * " + precoKg + " = R$" + total);

		System.out.println("Cartao? 1 para Sim? ");
		int cartao = sc.nextInt();

		if (cartao == 1) {

			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: R$" + desconto);
			System.out.println("Valor a Pagar: R$ " + (total - desconto));

		} else {
			System.out.println("Valor a Pagar: R$ " + total);
		}

		sc.close();

	}

}
