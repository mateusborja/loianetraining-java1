/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java1 aula 50 usando throws
package com.mateusborja.java1.aula50;

import java.util.Scanner;

public class UsandoThrows {
	
	public static void main(String[] args) {

		
		System.out.print("digite um numero: ");
		System.out.println();
		try {
			double num = lerNumero();
			System.out.print("Você digitou: " + num);
		} catch (Exception e) {
			System.out.println("entrada inválida!");
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		return num;

	}

}
