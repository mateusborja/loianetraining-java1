//java 1 loiane exercicio 01 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("turno que estuda: ");
		String turno = sc.next();

		if (turno.length() > 1) {
			System.out.println("Opção inválida.");
		} else {

			switch (turno) {
			case "m":
			case "M":
				System.out.println("Bom dia!");
				break;
			case "v":
			case "V":
				System.out.println("Bom tarde!");
				break;
			case "n":
			case "N":
				System.out.println("Boa noite!");
				break;
			default:
				System.out.println("Turno inválida!");

			}

		}

		sc.close();

	}

}
