/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula46exercicios;

import java.text.DecimalFormat;

public class AplicacaoFigura {

	public static void main(String[] args) {

		double arr[] = new double[4];

		System.out.print("colecao: ");
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i + Math.pow(i, 2);
			System.out.print(" " + arr[i]);
		}

		System.out.println();
		DecimalFormat dc = new DecimalFormat();
		Quadrado f1 = new Quadrado();
		f1.setLado(2);
		f1.setNome("Quadrado");

		Circulo f2 = new Circulo();
		f2.setRaio(2);
		f2.setNome("Circulo");

		Triangulo f3 = new Triangulo();
		f3.setBase(3);
		f3.setAltura(2);
		f3.setNome("Triangulo");

		Cubo f4 = new Cubo();
		f4.setLado(3);
		f4.setNome("Cubo");

		Cilindro f5 = new Cilindro();
		f5.setAltura(3);
		f5.setRaio(2);
		f5.setNome("Cilindro");

		Piramide f6 = new Piramide();
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setNumPolyBase(4);
		f6.setBase(f1);
		f6.setNome("Piramide");

		Retangulo f7 = new Retangulo();
		f7.setNome("Retangulo");
		f7.setBase(8);
		f7.setAltura(10);

		FiguraGeometrica figuras[] = new FiguraGeometrica[7];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		figuras[6] = f7;

		try {

			for (FiguraGeometrica figura : figuras) {
				System.out.println("\n******************");
				System.out.println(figura.getNome());

				if (figura instanceof Figura2D && figura != null) {
					Figura2D f2d = (Figura2D) figura;
					System.out.println("Area: " + dc.format(f2d.calcularArea()) + " cm.");
				}

				if (figura instanceof Figura3D && figuras != null) {
					Figura3D f3d = (Figura3D) figura;
					System.out.println("Area: " + dc.format(f3d.calcularArea()) + " cm.");
					System.out.println("Volume: " + dc.format(f3d.calcularVolume()) + " cm3.");
				}

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("**** OPERACAO REALIZADA COM SUCESSO ****");
			// TODO: handle exception
		}

	}

}
