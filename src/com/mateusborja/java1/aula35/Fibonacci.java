/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula35;

public class Fibonacci {

	public static int fabonacci(int num) {

		if (num < 2) {
			return 1;

		}

		return fabonacci(num - 1) + fabonacci(num - 2);
	}

	static int fb1;

	public static void main(String[] args) {

		fb1 = Fibonacci.fabonacci(5);
		System.out.println(fb1);

		// serie fabonacci
		System.out.print("seq fabonacci 10 primeiros =");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + Fibonacci.fabonacci(i));

		}

	}

}
