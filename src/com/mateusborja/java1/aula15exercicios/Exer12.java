//java 1 loiane exercicio 12 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("valor hora: ");
		double valorHora = sc.nextDouble();

		System.out.print("horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;

		double percentualIR = 0;

		if (salarioBruto <= 0) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double impostoDeRenda = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10; // 10% de desconto
		double fgts = (salarioBruto / 100) * 11; // 11% de desconto

		double totalDescontos = impostoDeRenda + inss;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("\nSalario Bruto: (" + valorHora + " * " + horasTrabalhadas + ") R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): " + impostoDeRenda);
		System.out.println("(-) INSS (10%): " + inss);
		System.out.println("(-) FGTS (11%): " + fgts);
		System.out.println("(-) Total de Descontos: " + totalDescontos);
		System.out.println("Salario Liquido: R$ " + salarioLiquido);

		sc.close();

	}

}
