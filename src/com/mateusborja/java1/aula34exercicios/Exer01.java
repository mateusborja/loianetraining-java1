//java 1 loiane - aula 34 exercicios - exercicio 01 (modificador de acesso) - classe teste
package com.mateusborja.java1.aula34exercicios;

public class Exer01 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementa();

		imprimirValor();
		
		Contador.zerar();
		Contador.incrementa();
		Contador.incrementa();
		Contador.incrementa();
		
		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
		
	}

}
