/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

//java1 aula 36 - classe teste

package com.mateusborja.java1.aula36;

public class AplicacaoContato {

	public static void main(String[] args) {

		// Criando objt contato
		Contato contato = new Contato();

		contato.setNome("Mateus Borja");
		// contato.setEndereco("Rua Tucano n. 09");
		// contato.setTelefone("92 98221 80 78");

		System.out.println(contato.getNome());

		// Criando objt Endereco
		Endereco endereco = new Endereco();

		endereco.setRua("Rua Major Eustaquio");
		endereco.setNumero("n. 44 - Apto 601");
		endereco.setCidade("Uberaba");
		endereco.setEstado("Minas Gerais");
		endereco.setCep("38010-270");

		// setando objt endereco ao met da classe Contato
		contato.setEndereco(endereco);

		// verificacao de null excpetion
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getRua() + " " + contato.getEndereco().getNumero() + " "
					+ contato.getEndereco().getCidade() + " - " + contato.getEndereco().getCep());

		}

		// Criando objt Telefone

		Telefone telefone1 = new Telefone();

		telefone1.setTipo("Casa");
		telefone1.setDdd("092");
		telefone1.setNumero("3227 8909");

		// setando objt endereco ao met da classe Contato
		// contato.setTelefone(telefone1);
		if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}
		
		

	}

}
