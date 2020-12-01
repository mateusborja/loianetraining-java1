/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 exercicio 
package com.mateusborja.java1.aula52exercicio;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda(5);

		int opcao = 1;

		while (opcao != 4) {
			opcao = obterOpcaoMenu(sc);

			if (opcao == 1) { // consultar contato
				consultarContato(sc, agenda);

			} else if (opcao == 2) { // exibir agenda
				exibirAgenda(agenda);

			} else if (opcao == 3) { // adicionar contato
				adicionarContato(sc, agenda);

			}
		}

		sc.close();
		

	}

	public static void exibirAgenda(Agenda agenda) {
		System.out.println("Contatos da Agenda: ");
		if (agenda.toString() == null) {
			return;
		} else {
			System.out.println(agenda.toString());
			
		}

	}

	public static void adicionarContato(Scanner sc, Agenda agenda) {
		System.out.println("Entre com as Informações: ");
		String nome = leInformacaoString(sc, "Nome do Contato: ");
		String telefone = leInformacaoString(sc, "Telefone do Contato: ");
		String email = leInformacaoString(sc, "Email do Contato: ");
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		System.out.println("Contato a ser criado: ");
		System.out.println(contato);
		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void consultarContato(Scanner sc, Agenda agenda) {
		String nomeContato = leInformacaoString(sc, " Contato a ser pesquisado: ");

		try {

			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato Existe");
				System.out.println(agenda.toString());

			}

		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());

		}

	}

	public static String leInformacaoString(Scanner sc, String msg) {
		System.out.println(msg);
		String entrada = sc.nextLine();
		return entrada;

	}

	public static int obterOpcaoMenu(Scanner sc) {

		boolean entradaValida = false;
		int opcao = 1;

		while (!entradaValida) {
			System.out.println("\nDigite a opção Desejada: ");
			System.out.println("1> Consultar Contato ");
			System.out.println("2> Exibir Agenda ");
			System.out.println("3> Adicionar Contato");
			System.out.println("4> Sair\n");

			try {
				String entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida!");
				}

			} catch (Exception e) {
				System.out.println("Entrada Inválida, digite novamente\n");
			}

		}

		return opcao;

	}

}
