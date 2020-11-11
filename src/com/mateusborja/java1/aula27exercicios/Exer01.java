//aula 27 exercicios - exercicio 01 - classe teste
package com.mateusborja.java1.aula27exercicios;

public class Exer01 {
	
	public static void main(String[] a) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		System.out.println("A lampada está " + lampada.ligada); // modo sem incremento dos metodo

		lampada.desligar();
		System.out.println("A lampada está " + lampada.ligada); // modo sem incremento dos metodo
		
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		
		
		
		
		
		
		
	}

}
