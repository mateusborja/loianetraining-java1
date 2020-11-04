//java1 loiane aula 13
package com.mateusborja.java1.aula13;

public class ExemploOperadores {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiraString = "Esta é ";
		String segundaString = "uma String Concatenada. ";
		String terceiraString = primeiraString + segundaString;
		System.out.println(terceiraString);

	}

}
