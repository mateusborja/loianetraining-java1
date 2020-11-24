/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula44;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado {
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
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

	@Override
	void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	
	

}
