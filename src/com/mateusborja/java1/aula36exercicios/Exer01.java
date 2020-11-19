/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java1.aula36exercicios;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com nome da agenda");
		String nome = sc.nextLine();

		Agenda agenda = new Agenda(nome);
		// agenda.setNome(nome);
		// Agenda agenda = new Agenda();

		// 3 contatos

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("informacoes do contato " + (i + 1));

			Contato c = new Contato();
			System.out.println("nome: ");
			nome = sc.nextLine();
			c.setNome(nome);
			
			System.out.println("telefone: ");
			String telefone = sc.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("email: ");
			String email = sc.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;

		}
		
		agenda.setContato(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
			
		}

		sc.close();

	}

}
