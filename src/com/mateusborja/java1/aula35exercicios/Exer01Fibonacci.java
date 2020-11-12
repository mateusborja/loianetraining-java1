//java 1 aula 35 exercicios - exercicio 01 - fibonacci - classe teste
package com.mateusborja.java1.aula35exercicios;

public class Exer01Fibonacci {

	static int fibonnaciNums;

	public static void main(String[] args) {

		fibonnaciNums = Calculadora.fibonacci(3);
		System.out.println(fibonnaciNums);

		// sequencia de fibonacci
		System.out.print("10 primeiros numeros serie de fibonacci = ");

		for (int i = 0; i < 10; i++) {
			System.out.print(Calculadora.fibonacci(i) + " ");

		}

	}

}