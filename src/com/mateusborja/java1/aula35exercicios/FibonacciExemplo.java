/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula35exercicios;

public class FibonacciExemplo {

	public static int calculoFibonacci(int num) {
		if (num < 2) {
			return 1;
		}

		return calculoFibonacci(num - 1) + calculoFibonacci(num - 2);
	}

	static int somaSequencia;
	static int i;

	public static void main(String[] args) {

		System.out.print("sequencia: ");
		for (i = 0; i < 12; i++) {
			System.out.print(" " + calculoFibonacci(i));

			somaSequencia += calculoFibonacci(i);

		}

		System.out.println();
		System.out.println("soma da seq = " + somaSequencia);

		int pares = 0;
		System.out.println();
		System.out.print("pares = " + pares);
		for (int i = 0; i < 12; i++) {
			pares = calculoFibonacci(i);
			if (pares % 2 == 0) {
				System.out.print(" " + pares);

			}

		}

	}

}
