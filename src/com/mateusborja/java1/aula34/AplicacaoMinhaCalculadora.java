package com.mateusborja.java1.aula34;

public class AplicacaoMinhaCalculadora {

	static int resultSoma1;
	static int resultSoma2;

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora(); // com modificador static declarado na classe minha calculadora
														// nao e necessario instanciar a classe criando um objeto do
														// tipo MinhaCalculadora e chamando o Construtor da Classe.
														// Nesse caso o consrtutor e o Object

		calc.soma(3, 4); // sem o modificador static

		MinhaCalculadora.soma(32, 32);

		resultSoma1 = MinhaCalculadora.soma(32, 32);

		resultSoma2 = somar2Numeros(43, 23);

		System.out.println(resultSoma2);
	}

	static int somar2Numeros(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);

	}

}
