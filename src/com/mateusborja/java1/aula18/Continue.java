package com.mateusborja.java1.aula18;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("entre com um números: ");
		int num1 = sc.nextInt();

		System.out.print("entre com um limite: ");
		int max = sc.nextInt();

		for (int i = num1; i < max; i++) {
			if (i % 7 == 0) { //multiplo de sete
				continue;
			}
			System.out.println("valor de i = " + i);

		}

		sc.close();
	}

}
