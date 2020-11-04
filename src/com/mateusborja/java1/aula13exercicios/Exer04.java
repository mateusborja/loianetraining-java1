//java 1 loiane exercicio 04
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A media das notas e: %.2f%n ", media);

        sc.close();

    }

}
