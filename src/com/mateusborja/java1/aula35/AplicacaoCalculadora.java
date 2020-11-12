//java 1 aula 35 recursividade, classe teste
package com.mateusborja.java1.aula35;

public class AplicacaoCalculadora {

	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);

		int fatorialR = Calculadora.fatorialRecursivo(5);
		System.out.println(fatorialR);

	}

}
