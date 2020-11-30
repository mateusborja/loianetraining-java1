/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula52;

public class MinhaException {

	public static void main(String[] args) {

		int[] arr1 = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] arr2 = { 2, 0, 4, 8, 0, 2, 3 };

		for (int i = 0; i < arr1.length; i++) {
			try {
				
				if(arr1[i] % 2 != 0) {
					//lança a exception - deve contar o Exception com metodo getMessage()
					throw new Exception("Divisão não exata!");
					
				}
				System.out.println(arr1[i] + " / " + arr2[i] + " = " + (arr1[i] / arr2[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("catch - erro capturado!");

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
			}

		}

	}

}
