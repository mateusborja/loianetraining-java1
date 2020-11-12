//java 1 loiane - aula 33 (sobrecarga de metodos) - classe teste
package com.mateusborja.java1.aula33;

public class MyArr {

	public static void main(String[] args) {

		MinhaCalculadora c1 = new MinhaCalculadora();

	
		int[] vet1 = { 1, 18, 123, 101 };
		int[] vet2 = { 100, 8, 23, 11 };

		int sum1 = c1.soma(vet1, vet2);
		System.out.println("soma é " + sum1);

		int sum2 = c1.soma(vet2);
		System.out.println("soma é " + sum2);

	}

}
