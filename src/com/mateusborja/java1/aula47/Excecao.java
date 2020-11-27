/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			
			int arr[] = new int[4];
			System.out.println("Antes da exception");
			arr[5] = 1;


			System.out.println("Dentro da exception");
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Tratando o erro");
		}
		
		System.out.println("Apos o tratamento da exception");
		
		
		try {
			
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			
		}

	}

}
