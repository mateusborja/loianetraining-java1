//aula 24 - execicio 03 - classe de teste
package com.mateusborja.java1.aula24exercicios;

public class AplicacaoLivroLivraria {
	
	
	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Meu bem querer";
		livro.autor = "Joao Nascimento";
		livro.qtdePaginas = 300;
		livro.isbn = "ERS1200";
		livro.anoLancamento = 2015;
		
		livro.preco = 45.54;
		
		System.out.println("Preço dp Livro = R$ " + livro.preco);
		System.out.println("Nome do Autor = " + livro.autor);

		
	}
	
}
