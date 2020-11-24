/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula43exercicios;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean sacar(double valor) {

		double saldoComLimite = this.getSaldo() + limite;

		if ((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nConta Especial";
		s += "\nLimite: " + getLimite();
		return s;
	}

}
