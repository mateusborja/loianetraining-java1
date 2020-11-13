/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula35;

import java.util.Scanner;

public class FibonacciRecursivo {

	public static int fibonacciRecursivo(int num) {
		if (num < 2) {
			return 1;
		}

		return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("tel me a number: ");
		int fb1 = sc.nextInt();

		for (int i = 0; i < fb1; i++) {

			System.out.println(fibonacciRecursivo(i));

		}

		sc.close();
	}

}
