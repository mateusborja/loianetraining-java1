//java 1 loiane - aula 34 exercicios - exercicio 01 (modificador de acesso) - classe definicao
package com.mateusborja.java1.aula34exercicios;

public class Contador {

	private static int ct;

	public Contador() {
		ct++;
	}

	public static void incrementa() {
		Contador.ct++; // ou ct++
	}

	public static void zerar() {
		ct = 0;
	}

	public static int obterValor() {
		return ct;
	}

}
