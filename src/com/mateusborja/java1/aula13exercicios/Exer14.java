//java 1 loiane exercicio 13
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("tamanho do arquivo em MB: ");
		double tamanhoArquivo = sc.nextDouble();

		System.out.print("velocidade da internet: ");
		double velocidadeInternet = sc.nextDouble();

		double tempo = tamanhoArquivo / velocidadeInternet;
		System.out.printf("tempo de download: %.1f min%n", tempo);

		sc.close();

	}

}
