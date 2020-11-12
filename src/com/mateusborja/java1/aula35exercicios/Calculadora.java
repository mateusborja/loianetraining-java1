//java 1 aula 35 exercicios - exercicio 01 - fibonacci - classe def
package com.mateusborja.java1.aula35exercicios;

public class Calculadora {

	public static int fibonacci(int num) {

		if (num < 2) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
