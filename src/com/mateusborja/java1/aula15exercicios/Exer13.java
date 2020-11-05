//java 1 loiane exercicio 13 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("dia semana: ");
		int diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Segunda-Feira.");
			break;

		case 3:
			System.out.println("Terça-Feira.");
			break;

		case 4:
			System.out.println("Quarta-Feira.");
			break;

		case 5:
			System.out.println("Quinta-Feira.");
			break;

		case 6:
			System.out.println("Sexta-Feira.");
			break;

		case 7:
			System.out.println("Sábado.");
			break;

		}

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
			System.out.println("Dia inválido");

		}

		sc.close();

	}

}
