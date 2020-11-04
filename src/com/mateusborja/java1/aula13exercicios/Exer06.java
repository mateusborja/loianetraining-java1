//java 1 loiane exercicio 06
package com.mateusborja.java1.aula13exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o raio do circulo: ");
        double raio = sc.nextDouble();

        //classe Math.PI ( classe Math com varios metodos )
        //double area = Math.PI * Math.pow(raio, 2);
        double area = Math.PI * raio * raio;
        System.out.printf("area do circulo: %.2f cm%n", area);

        sc.close();

    }

}
