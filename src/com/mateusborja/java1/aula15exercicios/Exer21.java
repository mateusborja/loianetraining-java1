//java 1 loiane exercicio 21 - aula 15
package com.mateusborja.java1.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double descontoAlcool = 0;
		double descontoGalosina = 0;
		double valorGasolina = 2.50;
		double valorAlcool = 1.90;
		double valorSemDesconto = 0.0;
		double valorDesconto = 0.0;
		double valorPago = 0.0;

		boolean gasolina = false;
		boolean alcool = false;

		System.out.print("qtde de litros vendidos: ");
		double litrosVendidos = sc.nextDouble();

		System.out.print("tipo de combustivel (A-álcool ou G-Gasolina): ");
		String tipoCombustivel = sc.next();

		if (tipoCombustivel.equalsIgnoreCase("A")) {

			if (litrosVendidos <= 20.0) {
				descontoAlcool = 3.0;
				alcool = true;
				gasolina = false;

			} else if (litrosVendidos > 20.0) {
				descontoAlcool = 5.0;
				alcool = true;
				gasolina = false;
			}

			valorSemDesconto = litrosVendidos * valorAlcool;

		} else if (tipoCombustivel.equalsIgnoreCase("G")) {

			if (litrosVendidos <= 20.0) {
				descontoGalosina = 4.0;
				gasolina = true;
				alcool = false;

			} else if (litrosVendidos > 20.0) {
				descontoGalosina = 6.0;
				gasolina = true;
				alcool = false;
			}

			valorSemDesconto = litrosVendidos * valorGasolina;
		}

		if (gasolina == true) {
			valorDesconto = (valorSemDesconto / 100) * descontoGalosina;
			valorPago = valorSemDesconto - valorDesconto;

			System.out.printf("%nValor pago: R$ %.2f%n", valorPago);
		}

		if (alcool == true) {
			valorDesconto = (valorSemDesconto / 100) * descontoAlcool;
			valorPago = valorSemDesconto - valorDesconto;
			System.out.printf("%nValor pago: R$ %.2f%n", valorPago);

		}

		sc.close();

	}

}
