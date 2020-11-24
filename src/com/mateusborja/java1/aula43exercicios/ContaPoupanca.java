/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java1 loiane aula 43 exer01 - classe def
package com.mateusborja.java1.aula43exercicios;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {

			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento)); // ou super.thissetSaldo - saldo +=
																					// saldo * taxaRendimento;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nConta Poupança";
		s += "\nDia do Rendimento: " + getDiaRendimento();
		return s;
	}

}
