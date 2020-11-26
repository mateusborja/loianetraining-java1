/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula46exercicios;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6 * (lado * lado); //Math.pow(lado,2)
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado; //Math.pow(lado,3)
	}

}
