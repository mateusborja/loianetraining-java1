package com.mateusborja.java1.aula10;

public class Variaveis {

	public static void main(String[] args) {

		// convensao java
		int idade = 1;
		int idadeAnoQueVem = idade++;
		String nome = "Loaine";
		String nomeDoMeuCachorro = "toto";
		String ano2014;

		// nao e convensao java
		int _idade;
		int $idade;
		String nome_do_meu_cachorro;
		String Nome_Do_Meu_Cachorro;

		idade = 25; // atribuindo novo valor

		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		// ma pratica
		int a = 10;
		String b = "Loiane";

		int soma1 = somar(2, 40);
		System.out.println("\nsoma = " + soma1);

		int subtracao1 = subtrair(290, 90);
		System.out.println("subtração = " + subtracao1);

		int divisao1 = dividir(90, 9);
		System.out.println("divisão = " + divisao1);

		int multiplicacao1 = multiplicar(8, 10);
		System.out.println("multiplicação = " + multiplicacao1);

	}

	public static int somar(int num1, int num2) { // metodo somar
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) { // metodo subtrair
		return num1 - num2;
	}

	public static int dividir(int num1, int num2) { // metodo dividir
		return num1 / num2;
	}

	public static int multiplicar(int num1, int num2) { // metodo multiplicar
		return num1 * num2;
	}

}
