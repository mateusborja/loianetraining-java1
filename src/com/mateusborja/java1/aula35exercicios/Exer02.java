/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java aula 35 exer02 somatorio de um numero

//somatorio
// 5 = 5 + 4 + 3 + 2 + 1 ou 5 + somatorio(4)
// 4 = 4 + 3 + 2 + 1 ou 4 + somatorio(3)
// 3 = 3 + 2 + 1 ou 3 + somatorio(2)
// 2 = 2 + 1 ou 2 + somatorio(1)
// 1 = 1 

package com.mateusborja.java1.aula35exercicios;

import java.util.Scanner;

public class Exer02 {

	public static int somatorio(int num) {

		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("digite um numero: ");
		int num = sc.nextInt();

		System.out.print("somatório de " + num + " é: " + somatorio(num) + " ");

		System.out.println();
		System.out.println();

		int x = 1;
		while (x <= 5) {
			System.out.println("somatório de " + x + " é: " + somatorio(x));
			x++;
		}

		sc.close();

	}

}
