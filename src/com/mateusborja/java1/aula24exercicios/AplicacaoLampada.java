//aula 24 - execicio 01
package com.mateusborja.java1.aula24exercicios;

public class AplicacaoLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.modelo = "A60";
		lampada.tensao = "Bibolti";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarelo";
		lampada.tipoLuz = "Amarelo";
		lampada.tipoAbajur = true;

		lampada.tipos = new String[] { "ABajur" };
		lampada.tipos = new String[5];

		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeoes";

	}

}
