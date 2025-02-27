/*Enunciado: 
 * 
 * Exercício proposto - Semana 4
 * 
 * 
 * Crie um Sistema de Livraria Online 
 * Suponha que você está criando um sistema para gerenciar uma livraria online e precisa implementar as classes 
 * Livro, LivroFisico e Ebook. 
 * A classe Livro deve ter os seguintes atributos: 
 * titulo: uma String representando o título do livro. 
 * autor: uma String representando o autor do livro. 
 * isbn: uma String representando o número de identificação do livro.
 * preco: um double representando o preço do livro. 
 * 
 * A classe LivroFisico deve herdar da classe Livro e ter os seguintes atributos adicionais: 
 * peso: um double representando o peso do livro físico. 
 * frete: um double representando o preço do frete do livro físico. 
 * 
 * A classe Ebook também deve herdar da classe Livro e ter um atributo adicional: 
 * tamanhoEmMb: um double representando o tamanho do arquivo do ebook em megabytes. 
 * Crie métodos construtores para as classes Livro, LivroFisico e Ebook. 
 * Além disso, crie um método calcularPrecoTotal na classe Livro que retorna o preço total do livro 
 * (incluindo o frete, se for um livro físico). 
 * 
 * Por fim, crie uma classe CarrinhoDeCompras que tenha um atributo livros que é um ArrayList de objetos do tipo Livro. 
 * A classe CarrinhoDeCompras deve ter um método calcularTotal que retorna o preço total de todos os livros no carrinho de compras 
 * (levando em consideração o preço total de cada livro, incluindo o frete, se for um livro físico). 
 * Lembre-se de usar o polimorfismo para trabalhar com objetos das classes Livro, LivroFisico e Ebook. 
 * Implemente essas classes em Java e crie um programa de exemplo que cria alguns livros físicos e ebooks, 
 * adiciona-os ao carrinho de compras e calcula o preço total. 
 * Exiba o preço total de cada livro, o preço total do frete (se for um livro físico), 
 * e o preço total de todos os livros no carrinho de compras.
 * */

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivroFisico evelynhugo = new LivroFisico("Os 7 maridos de Evelyn Hugo", "Taylor Jenkins Reid", "125214521", 35.30, 20, 25.3);
		
		ArrayList<Livro> livros = new ArrayList<Livro>();
		
		livros.add(evelynhugo);
		
		System.out.println(evelynhugo.autor);
		
	}

}
