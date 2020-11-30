/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 52 exception personalizada - classe def e teste
package com.mateusborja.java1.aula52;

public class ExceptionPersonalizada {

	public static void main(String[] args) {

		int[] arr1 = { 4, 8, 16, 21, 32, 64, 128 };
		int[] arr2 = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < arr1.length; i++) {

			try {
				if (arr1[i] % 2 != 0) {
					throw new DivisaoNaoExata(arr1[i], arr2[i]);
				}
				System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
				System.out.println("catch - erro capturado!");
				e.printStackTrace(); //metodo q imprime o tipo de erro chamando o construtor
				System.out.println();

			}
		}

	}

}
