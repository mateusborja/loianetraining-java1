//java 1 aula 35 recursividade, metodos que chamam eles mesmo e tem um ponto de parada utilizando a estrutura de dados do tipo pilha
 package com.mateusborja.java1.aula35;

public class FatorialRecursivo {

	public static int fatorialRecursivo(int num) {

		if (num == 0) {
			return 1;
		}
		return num * fatorialRecursivo(num - 1);
	} 

}
