//java1 loiane aula 12
package com.mateusborja.java1.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();

		System.out.println("Seu nome completo é: " + nomeCompleto);

		System.out.println();
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		scan.next(); // ao invocar o metodo nao retorna erro caso coloque mais de uma informação
		System.out.println("Seu primeiro nome é: " + primeiroNome);

		System.out.println();
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");

		System.out.println();
		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura + " m");

		System.out.println();
		System.out.println(
				"Digite o seu primeiro nome, idade, quantidade de vilhos, altura e se tem bicinho de estimação");

		String firstName = scan.next();
		int age = scan.nextInt();
		byte haveChild = scan.nextByte();
		float height = scan.nextFloat();
		boolean haveDog = scan.nextBoolean();

		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + firstName);
		System.out.println("Idade: " + age);
		System.out.println("Quantidade de filhos: " + haveChild);
		System.out.println("Altura: " + height);
		System.out.println("Tem bicinho de estimação: " + haveDog);

		scan.close();

	}

}
