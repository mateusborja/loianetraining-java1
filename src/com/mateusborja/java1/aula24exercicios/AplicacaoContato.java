//aula 24 - execicio 06 - classe de teste
package com.mateusborja.java1.aula24exercicios;

public class AplicacaoContato {

	public static void main(String[] args) {

		Contato contato1 = new Contato();

		contato1.nome = "Joao";
		contato1.endereco = "Rua Paulista, 99";

		contato1.email = "joao@mail.com.br";

		contato1.telefones = new String[4];
		contato1.telefones[0] = "9929 11 11";
		contato1.telefones[1] = "8918 22 22";

		System.out.println("Telefone Tim do Joao: " + contato1.telefones[0]);

	}

}
