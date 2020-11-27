/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 48 - multiplos catch
package com.mateusborja.java1.aula48;

public class MultiplosCatch {

	public static void main(String[] args) {

		int[] arr1 = { 4, 8, 16, 32, 64, 128 };
		int[] arr2 = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < arr1.length; i++) {
			try {
				System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

			} catch (ArithmeticException e) {
				System.out.println("erro ao dividir por zero!");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição de array, arr1 maior indice!");
			}

		}

	}

}
