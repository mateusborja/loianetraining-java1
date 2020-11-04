//java 1 loiane exercicio 03
package com.mateusborja.java1.aula13exercicios;

import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Exer03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("primeiro numero:  ");
        int num1 = sc.nextInt();
        
        System.out.println("segundo numero:  ");
        int num2 = sc.nextInt();
        
        
        int sum = num1 + num2;
        System.out.println("soma e igual a: " + sum);

        sc.close();

    }

}
