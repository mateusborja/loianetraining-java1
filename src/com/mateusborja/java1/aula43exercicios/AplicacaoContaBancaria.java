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

		System.out.println(contaSimples);
		realizarSaque(contaSimples, 80);
		realizarSaque(contaSimples, 30);

		realizarDeposito(contaSimples, 100);
		verSaldo(contaSimples);

	}

	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque de R$ " + valor + " realizado com Sucesso! Seu saldo R$ " + conta.getSaldo());

		} else {
			System.out.println("Saldo insuficiente para sacar R$ " + valor + ". Seu saldo R$ " + conta.getSaldo());
		}

	}

	public static void realizarDeposito(ContaBancaria conta, double valor) {
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Seu depósito de R$ " + valor + ", foi realizado com Sucesso! ");

		} else {
			System.out.println("Valor Incorreto! R$ " + valor);
		}

	}

	public static void verSaldo(ContaBancaria conta) {
		System.out.println("Saldo em Conta R$ " + conta.getSaldo());

	}

}
