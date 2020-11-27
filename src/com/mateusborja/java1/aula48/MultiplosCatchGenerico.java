/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula48;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {

		int[] arr1 = { 4, 8, 16, 32, 64, 128 };
		int[] arr2 = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < arr1.length; i++) {
			try {
				System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

			} catch (ArithmeticException e) {
				System.out.println("erro ao dividir por zero!");

			} catch (Throwable e) {
				System.err.println("Erro encontrado!");
			}

		}

	}

}
