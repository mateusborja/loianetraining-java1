//java 1 loiane - aula 33 (sobrecarga de metodos) - classe definicao
package com.mateusborja.java1.aula33;

public class MinhaCalculadora {

	private int[] vetInteiros;

	public int soma(int num1, int num2) {
		return num1 + num2;
	}

	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public int soma(int[] vetNum1) {
		int total = 0;

		for (int i = 0; i < vetNum1.length; i++) {
			total += vetNum1[i];
		}
		return total;
	}

	public int soma(int[] vetNum1, int[] vetNum2) {
		int num1Total = 0;
		int num2Total = 0;

		for (int i = 0; i < vetNum1.length; i++) {
			num1Total += vetNum1[i];
		}
		for (int j = 0; j < vetNum2.length; j++) {
			num2Total += vetNum2[j];
		}
		return num1Total + num2Total;
	}

	public void setVetInteiros(int[] vetInteiros) {
		this.vetInteiros = vetInteiros;
	}

}
