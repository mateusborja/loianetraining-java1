//java 1 loiane exercicio 04 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("digite uma letra: ");

		String letra = sc.next();

//		if (letra.equalsIgnoreCase("a") || letra.equals("e") || letra.equalsIgnoreCase("i")
//				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
//			System.out.println(letra + " - é uma vogal.");
//		} else {
//			System.out.println(letra + " - é uma consoante.");
//		}

		if (letra.length() > 1) {
			System.out.println("Letra inválida.");

		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println(letra + " - é uma vogal.");
				break;
			default:
				System.out.println(letra + " - é uma consoante.");
			}

		}

		sc.close();

	}

}
