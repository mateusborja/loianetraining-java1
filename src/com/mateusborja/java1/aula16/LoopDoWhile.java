package com.mateusborja.java1.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {

		int i = 1;
		int ct = 10;
		int sum = 0;

		System.out.println("0 a 10: " + ct);

		while (i <= ct) {
			System.out.println("valor de i: " + i);
			sum += i;
			i++;
		}

		System.out.println("soma dos numeros: " + sum + "\r");

		do {
			i++;
			System.out.println("valor de i: " + i);

		} while (i < 13);

		System.out.println("valor final de i: " + i);

	}
}
