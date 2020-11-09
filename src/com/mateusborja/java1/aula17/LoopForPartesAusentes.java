package com.mateusborja.java1.aula17;

public class LoopForPartesAusentes {
	public static void main(String[] args) {

		int i = 0;
		for (; i < 50; i++) { // repeticao de 3 em 3
			System.out.println("valor de i = " + i);
			i += 2;
		}
	}

}
