package com.mateusborja.java1.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1;
		int ct = 10;

		System.out.println("0 a 10: " + ct);
		int sum = 0;

		while (i < ct) {
			System.out.println("i: " + i);
			sum += i;
			i++;
		}

		System.out.println("soma dos numeros: " + sum);

	}

}
