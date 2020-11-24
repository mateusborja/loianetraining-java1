/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java1 loiane aula 43 exer01 - classe def
package com.mateusborja.java1.aula43exercicios;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		String s = "\n *** DADOS DA CONTA ***";
		s = "\nNome do Cliente: " + nomeCliente;
		s += "\nNúmero da Conta: " + numConta;
		s += "\nSaldo da Conta R$ " + saldo;
		return s;
	}
	
	

}
