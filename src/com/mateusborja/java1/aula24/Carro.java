//java1 aula 24 - class, objects and attributes
package com.mateusborja.java1.aula24;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	
	//Metodos Get e Sets // com variaveis
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getConsCombustivel() {
		return consCombustivel;
	}
	public void setConsCombustivel(double consCombustivel) {
		this.consCombustivel = consCombustivel;
	}
	double consCombustivel;


}
