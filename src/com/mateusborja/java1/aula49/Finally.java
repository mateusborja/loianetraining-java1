/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 49 - try - tenta executar a app, 
//catch - captura a exception 
// finnaly - executa apos o try ou catch

package com.mateusborja.java1.aula49;

public class Finally {

	public static void main(String[] args) {

		int[] arr1 = { 4, 8, 16, 32, 64, 128 };
		int[] arr2 = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < arr1.length; i++) {
			try {
				System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.err.println("catch - erro capturado pelo catch");

			} finally {
				System.out.println("Bloco Final! - finally");
				System.out.println();
			}

		}

	}

}
