package com.mateusborja.java1.aula19;

import java.util.Arrays;

public class ArrayComSuperFor {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 35;
		temperaturas[363] = 33.1;
		temperaturas[364] = 34.3;

		System.out.println("temp dia 1 = " + temperaturas[3] + "C");
		System.out.println("tamanho do array = " + temperaturas.length);

		System.out.println();

		for (double temp : temperaturas) { // nao tem o indice
			System.out.println("valores de temperatura = " + temp);
		}

	}

}
