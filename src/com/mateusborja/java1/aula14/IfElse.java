package com.mateusborja.java1.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite sua idade: ");

		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("maior de idade.");

		} else {
			System.out.println("não é maior de idade.");

		}

		sc.close();
	}

}
