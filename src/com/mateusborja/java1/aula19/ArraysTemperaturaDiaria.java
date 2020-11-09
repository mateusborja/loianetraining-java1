//aula 19 array - armazenar temperatura durante 1 ano
package com.mateusborja.java1.aula19;

public class ArraysTemperaturaDiaria {

	public static void main(String[] args) {

		// nao convem
		double tempDiaria001 = 31.3;
		double tempDiaria002 = 32;
		double tempDiaria003 = 33.7;
		double tempDiaria004 = 34;
		double tempDiaria005 = 35;

		double[] temperaturas = new double[365];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 35;
		

		System.out.println("temp dia 1 = " + temperaturas[3] + "C");
		System.out.println("tamanho do array = " + temperaturas.length);

		System.out.println();
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("temperatura do dia " + (i + 1) + " é = " + temperaturas[i]);

		}

	}

}
