/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java1 loiane aula 43 exer01 - classe teste
package com.mateusborja.java1.aula43exercicios;

public class AplicacaoContaBancaria {

	public static void main(String[] args) {

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Conta Simples");
		contaSimples.setNumConta("111111");
		contaSimples.depositar(100);

		System.out.println("***TESTE CONTA SIMPLES");
		System.out.println(contaSimples);
		realizarSaque(contaSimples, 80);
		realizarSaque(contaSimples, 30);
		verSaldo(contaSimples);

		System.out.println("\n***TESTE CONTA POUPANCA");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(23);
		
		realizarDeposito(contaPoupanca, 100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		System.out.println(contaPoupanca);
		if (contaPoupanca.calcularNovoSaldo(0.05)) {
			System.out.println("Rendimento Aplicado! Novo Saldo R$ " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não e dia de Rendimento. Novo Saldo não Calculado!");
		}

		
		System.out.println("\n***TESTE CONTA ESPECIAL");
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		realizarDeposito(contaEspecial, 100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);

		System.out.println(contaEspecial);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque de R$ " + valor + " efetuado com Sucesso! Seu saldo R$ " + conta.getSaldo());

		} else {
			System.out.println("Saldo insuficiente para sacar R$ " + valor + ". Seu saldo R$ " + conta.getSaldo());
		}

	}

	private static void realizarDeposito(ContaBancaria conta, double valor) {
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Seu depósito de R$ " + valor + ", foi efetuado com Sucesso! ");

		} else {
			System.out.println("Valor Incorreto! R$ " + valor);
		}

	}

	private static void verSaldo(ContaBancaria conta) {
		System.out.println("Saldo em Conta R$ " + conta.getSaldo());

	}

}
