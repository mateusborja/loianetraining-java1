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

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("Lampada ligada.");
		} else {
			System.out.println("Lampada desligada.");

		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
			System.out.println("A lampada foi desligada!");
		} else {
			ligar();
			System.out.println("A lampada foi ligada!");
		}
	}

}
