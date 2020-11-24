/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//java 1 loiane aula 44 - interface - classe def

package com.mateusborja.java1.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

	private String tamanho;
	private String raca;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	void emitirSom() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nTamanho: " + this.tamanho;
		s += "\nRaça: " + this.raca;

		return s;
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

}
