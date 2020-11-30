/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 52 exception personalizada - classe def e teste
package com.mateusborja.java1.aula52;

public class DivisaoNaoExata extends Exception {

	private int num;
	private int denom;
	
	

	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	public int getNum() {
		return num;
	}

	public void setNum1(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "Divisão de " + num + " por " + denom + " não e inteiro!";
	}

}
