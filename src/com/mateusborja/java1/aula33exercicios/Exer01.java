package com.mateusborja.java1.aula33exercicios;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();
		System.out.println(lampada.isLigada());

		lampada.desligar();
		System.out.println(lampada.isLigada());

		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
		lampada.mudarEstado();

	}

}
