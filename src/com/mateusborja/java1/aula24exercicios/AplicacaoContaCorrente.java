//aula 24 - execicio 05 - classe de teste
package com.mateusborja.java1.aula24exercicios;

public class AplicacaoContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500.00;

		conta.saldoContaCorrente = -10;

		System.out.println("Saldo em Conta R$ " + conta.saldoContaCorrente + ".");

	}

}
