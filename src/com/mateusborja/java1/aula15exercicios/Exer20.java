//java 1 loiane exercicio 11 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Telefonou para a Vítima? S/N ");
		String resp1 = sc.next();

		System.out.print("Esteve no local do crime? S/N ");
		String resp2 = sc.next();

		System.out.print("Mora perto da vítima? S/N ");
		String resp3 = sc.next();

		System.out.print("Já trabalhou com a vítima? S/N ");
		String resp4 = sc.next();

		System.out.print("Devia para a vítima? S/N ");
		String resp5 = sc.next();

		int ct = 0;

		if (resp1.equalsIgnoreCase("S")) {
			ct++;
		}

		if (resp2.equalsIgnoreCase("S")) {
			ct++;

		}

		if (resp3.equalsIgnoreCase("S")) {
			ct++;

		}

		if (resp4.equalsIgnoreCase("S")) {
			ct++;

		}

		if (resp5.equalsIgnoreCase("S")) {
			ct++;
		}

		if (ct == 2) {
			System.out.println("\nVocê é Suspeito!");
		} else if (ct == 3 || ct == 4) {
			System.out.println("\nCúmplice do Crime");
		} else if (ct == 5) {
			System.out.println("\nAssasino!");
		} else if (ct == 0 || ct == 1) {
			System.out.println("\nPessoa Inoscente!");
		}

		sc.close();

	}

}
