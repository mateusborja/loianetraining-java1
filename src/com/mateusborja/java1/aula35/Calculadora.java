//java 1 aula 35 recursividade, metodos que chamam eles mesmo e tem um ponto de parada utilizando a estrutura de dados do tipo pilha
// clase definicao
package com.mateusborja.java1.aula35;

public class Calculadora {

	public static int fatorialNaoRecursivo(int num) {

		if (num == 0) {
			return 1;
		}

		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	// fatorial(5) = 5 * 5-1 = fatorial(4);
	// fatorial(4) = 4 * 4-1 = fatorial(3);
	// fatorial(3) = 3 * 3-1 = fatorial(2);
	// fatorial(2) = 2 * 2-1 = fatorial(1);
	// fatorial(1) = 1 * 1-1 = fatorial(0);
	// fatorial(0) = 1;

	// metodo entra em loop infinito dessa maneira
	public static int fatorialRecursivoLoop(int num1) {
		return num1 * fatorialRecursivoLoop(num1 - 1);
	}

	public static int fatorialRecursivo(int num) {

		if (num == 1) {
			return 1;
		}
		return num * fatorialRecursivo(num - 1);
	}

}
