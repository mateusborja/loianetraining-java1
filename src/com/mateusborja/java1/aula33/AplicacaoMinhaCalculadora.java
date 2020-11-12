//java 1 loiane - aula 33 (sobrecarga de metodos) - classe teste
package com.mateusborja.java1.aula33;

public class AplicacaoMinhaCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora c1 = new MinhaCalculadora();
		MinhaCalculadora c2 = new MinhaCalculadora();

		int sum1 = c1.soma(1, 2);
		double sum2 = c2.soma(1.0, 2.0);

		int[] vet1 = { 1, 2, 3, 54, 34 };
		int[] vet2 = { -1, -2, 13, 4, 4 };
		
		int somaVet1 = c1.soma(vet1);
		int somaVet2 = c1.soma(vet2);

		System.out.println("soma utilizando => soma(int num1, int num2) = " + sum1);
		System.out.println("soma utilizando => soma(double num1, double num2) = " + sum2);
		System.out.println("int[] vetorInteiros" + somaVet1 + "soma.");
		System.out.println("int[] vetorInteiros" + somaVet2 + "\nUtilizando o metodo soma.");

	}

}
