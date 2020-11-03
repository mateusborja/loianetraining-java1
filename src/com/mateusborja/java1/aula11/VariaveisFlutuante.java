//java 1 loiane aula 11
package com.mateusborja.java1.aula11;

import java.text.DecimalFormat;

public class VariaveisFlutuante {

	public static void main(String[] args) {
		
		DecimalFormat dc = new DecimalFormat();

		double valorPassagem = 2.90;

		float valorTomate = 3.95f;

		//utilizando o metodo format
		System.out.println("Valor da passagem = " + dc.format(valorPassagem));
		System.out.println("Valor do Tomate= " + dc.format(valorTomate));
		
		
		//utilizando o metodo de impressao printf com duas casas decimais
		System.out.println();
		System.out.printf("Valor da Passagem = %.2f%n", valorPassagem);
		System.out.printf("Valor do Tomate = %.2f%n", valorTomate);

	}

}
