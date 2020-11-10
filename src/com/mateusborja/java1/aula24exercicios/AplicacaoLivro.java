//aula 24 - execicio 02
package com.mateusborja.java1.aula24exercicios;

public class AplicacaoLivro {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Meu bem querer";
		livro.autor = "Joao Nascimento";
		livro.qtdePaginas = 300;
		livro.isbn = "ERS1200";
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do Livro = " + livro.nome);
		System.out.println("Nome do Autor = " + livro.autor);
		
		
	}

}
