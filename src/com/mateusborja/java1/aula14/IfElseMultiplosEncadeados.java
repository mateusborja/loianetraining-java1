//java if and else aula 14
package com.mateusborja.java1.aula14;

import java.util.Scanner;

public class IfElseMultiplosEncadeados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("que dia e hoje (1-7): ");
		int diaSemana = sc.nextInt();

		if (diaSemana == 1) {
			System.out.println("Hoje é Domingo.");
		} else if (diaSemana == 2) {
			System.out.println("Hoje é Segunda-Feira.");

		} else if (diaSemana == 3) {
			System.out.println("Hoje é Terça-Feira.");

		} else if (diaSemana == 4) {
			System.out.println("Hoje é Quarta-Feira.");

		} else if (diaSemana == 5) {
			System.out.println("Hoje é Quinta-Feira.");

		} else if (diaSemana == 6) {
			System.out.println("Hoje é Sexta-Feira.");

		} else if (diaSemana == 7) {
			System.out.println("Hoje é Sábado.");

		} else {
			System.out.println("Dia inválido.");
		}

		sc.close();
		
	}

}
