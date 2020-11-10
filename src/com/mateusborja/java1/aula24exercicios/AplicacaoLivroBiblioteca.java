//aula 24 - execicio 04 - classe de teste
package com.mateusborja.java1.aula24exercicios;

import java.util.Date;

public class AplicacaoLivroBiblioteca {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();

		livro.nome = "Meu bem querer";
		livro.autor = "Joao Nascimento";
		livro.qtdePaginas = 300;
		livro.isbn = "ERS1200";
		livro.anoLancamento = 2015;

		livro.emprestado = true;
		livro.dataEntrega = new Date();

		System.out.println("Data do Emprestimo = " + livro.dataEntrega);

	}

}
