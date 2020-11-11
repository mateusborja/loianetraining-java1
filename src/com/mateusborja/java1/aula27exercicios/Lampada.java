//aula 27 exercicios - exercicio 01 - classe definicao
package com.mateusborja.java1.aula27exercicios;

public class Lampada {
	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	String[] tipos;
	int potencia;
	int garantiaMeses;
	boolean tipoAbajur;
	double valorLampada;
	double valorTotal;

	boolean ligada;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void mostrarEstado() {
		if (ligada) {
			System.out.println("Lampada ligada.");
		} else {
			System.out.println("Lampada desligada.");

		}
	}

	public void mudarEstado() {
		if (ligada) {
			desligar();
			System.out.println("A lampada foi desligada!");
		} else {
			ligar();
			System.out.println("A lampada foi ligada!");
		}
	}

}
