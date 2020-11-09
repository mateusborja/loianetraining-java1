package com.mateusborja.java1.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		Random random = new Random();
		int[] notas = new int[10];

		for (int i = 0; i < notas.length; i++) {

			int nota = notas[i];
			notas[i] = random.nextInt(10);
			System.out.println("" + notas[i]);
		}

		System.out.println();
		for (int nota : notas) {
			System.out.println("valor das notas = " + nota);
		}

	}

}
