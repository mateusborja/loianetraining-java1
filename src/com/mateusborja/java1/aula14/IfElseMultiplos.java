package com.mateusborja.java1.aula14;

import java.util.Locale;
import java.util.Scanner;

public class IfElseMultiplos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// valor <= 10 - (barato);
		// 10 < valor < 15 - valor > 10 && valor < 15 (pedir desconto);
		// 15 >= valor <= 17 - valor > 15 && valor <= 17 (pesquisar mais);
		// valor > 17 - (muito caro);

		System.out.print("valor da mercadoria R$: ");
		double valor = sc.nextDouble();

		if (valor <= 10) {
			System.out.println("barato, pode comprar.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pode pedir desconto...");

		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais.");

		} else {
			System.out.println("Muito caro! \nProcure outro \"estabelecimento\".");

		}

		sc.close();

	}

}
