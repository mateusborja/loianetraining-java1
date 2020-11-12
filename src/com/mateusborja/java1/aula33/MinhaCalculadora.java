//java 1 loiane - aula 32 (sobrecarga de metodos) - classe definicao
package com.mateusborja.java1.aula33;

public class MinhaCalculadora {
	
	
	public int soma(int num1, int num2) {
		return num1 + num2;
	}

	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public int soma(int[] vetorInteiros) {
		int total = 0;

		for (int i = 0; i < vetorInteiros.length; i++) {
			total += vetorInteiros[i];

		}
		
		return total;
	}
	
	

}
