//java 1 aula 35 recursividade, metodos que chamam eles mesmo e tem um ponto de parada utilizando a estrutura de dados do tipo pilha
package com.mateusborja.java1.aula35;

public class FatorialNaoRecursivo {

	public static int fatorialNaoRecursivo(int num) {

		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

}
