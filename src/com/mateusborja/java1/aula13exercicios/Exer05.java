//java 1 loiane exercicio 05
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite os metros: ");
        double metros = sc.nextDouble();

        //1m = 100cm
        double conversao = metros * 100;
        System.out.printf("valor em cm: %.2f cm%n ", conversao);

        sc.close();

    }

}
