//java 1 loiane exercicio 13
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("ganhos por hora: ");
		double valorHora = sc.nextDouble();

		System.out.print("horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();

		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.printf("salario bruto: R$ %.2f%n", salarioBruto);

		double inss = (salarioBruto / 100) * 8;
		System.out.printf("inss: R$ %.2f%n", inss);

		double sindicato = (salarioBruto / 100) * 5;
		System.out.printf("sindicato: R$ %.2f%n", sindicato);

		double ir = (salarioBruto / 100) * 11;
		System.out.printf("importo de renda: R$ %.2f%n", ir);

		double totalDescontos = inss + sindicato + ir;
		System.out.printf("total de descontos: R$ %.2f%n", totalDescontos);
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.printf("salario liquido: R$ %.2f%n", salarioLiquido);

		sc.close();

	}

}
