package com.mateusborja.java1.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[4][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		notasAlunos[3][0] = 9;
		notasAlunos[3][1] = 10;
		notasAlunos[3][2] = 7;
		notasAlunos[3][3] = 9;


		int i, j;
		for (i = 0; i < notasAlunos.length; i++) {
			for (j = 0; j < notasAlunos.length; j++) {

				System.out.print(" " + notasAlunos[i][j]);

			}

		}

	}

}
