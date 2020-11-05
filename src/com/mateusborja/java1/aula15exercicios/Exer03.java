//java 1 loiane exercicio 03 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("digite uma letra: (F ou M): ");

		String letra = sc.next();

		// nao se usa o operador relacional para comparar strings
		// a propria classe String possui um metodo (funcao) para fazer isso
//		if (letra == "f") {
//			System.out.println("F - Feminino.");
//
//		} else if (letra == "m") {
//			System.out.println("M - Masculino1.");
//
//		} else {
//			System.out.println("Sexo inválido.");
//
//		}

		// metodo .equalsIgnoreCase()
		// compara Strings e desconsidera o Case Sensitivite

		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino.");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino.");

		} else {
			System.out.println("Sexo inválido.");
		}

		sc.close();

	}

}
