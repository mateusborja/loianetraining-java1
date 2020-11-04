//java switch case aula 15
package com.mateusborja.java1.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("que dia e hoje (1-7): ");
		int diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Hoje é Domingo.");
			break;
		case 2:
			System.out.println("Hoje é Segunda-Feira.");
			break;
		case 3:
			System.out.println("Hoje é Terça-Feira.");
			break;
		case 4:
			System.out.println("Hoje é Quarta-Feira.");
			break;
		case 5:
			System.out.println("Hoje é Quinta-Feira.");
			break;
		case 6:
			System.out.println("Hoje é Sexta-Feira.");
			break;
		case 7:
			System.out.println("Hoje é Sabado.");
			break;
		default:
			System.out.println("Dia inválido.");
		}

		// logica para dia util ou final de semana.
		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil.");
			break;
		case 1:
		case 7:
			System.out.println("Final de Semana.");
			break;
		default:
			System.out.println("Dia inválido.");
		}

		sc.close();

	}

}
