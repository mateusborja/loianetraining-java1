//java 1 loiane aula 11
package com.mateusborja.java1.aula11;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {

		int var1 = 2147483647; // valor maximo de um tipo primitivo int 2.147.483.647
		int var2 = 100;
		System.out.println(var1 + var2); // resultado volta para o valor minimo. numeros no java funciona como roleta -
											// varia entre min e max.

		int idade01 = 20;
		long idade02 = 23L;
		System.out.println(idade01 + idade02);

		double d1 = 123.4;
		double d2 = 1.234e2; // mesmo valor de 123.4 - notacao cientifica
		System.out.println(d1);
		System.out.println(d2);

		float f1 = 123.4f;
		System.out.println(f1);

		int decVal = 26;
		int hexVal = 0x1a;
		int octVal = 032;
		int binVal = 0b11010;
		System.out.println(decVal);
		System.out.println(hexVal);
		System.out.println(octVal);
		System.out.println(binVal);

		long creditCardNumber = 1234_5678_9012_3456L;
		long cpf = 101_134_156_56L;
		System.out.println(creditCardNumber);
		System.out.println(cpf);

	}

}
