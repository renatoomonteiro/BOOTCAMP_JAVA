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

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		LivroFisico livroFisico = new LivroFisico("Os 7 Pecados Capitais", "Akira Toryama", "123456789", 15.20, 10, 20.5);
		LivroFisico livroF03 = new LivroFisico("Meu celular me chamou", "9998547", "Androidus Goegle", 55.0, 0.6, 8.0);
		LivroFisico livroF04 = new LivroFisico("Arlinda mulher", "13549", "Eguerlia Feia", 45.0, 0.3, 5.0);
		Livro livro = new LivroFisico("Título do livro físico", "Autor do livro físico", "123456789", 30.0, 0.7, 11.5);
		Livro livroF01 = new LivroFisico("Virei um cachorro", "12324687", "Antonio", 60.0, 0.8, 10.0);
		Livro livroF02 = new LivroFisico("Como construir um gerador", "648911668", "Zombarto Eletric", 47.0, 0.2, 3.0);
		
		Livro livroEbook = new Ebook("Título do livro Ebook", "Autor do Ebook", "123456789", 30.0, 22);
		Ebook ebook03 = new Ebook("Chamando", "6411118", "Terrous Medus", 15.5, 20);
		Ebook ebook04 = new Ebook("Quero pudim", "6799888", "Fluminus Delsius", 15.5, 20);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.livros.add(livroFisico);
		carrinho.livros.add(livroF03);
		carrinho.livros.add(livroF04);
		carrinho.livros.add(livro);
		carrinho.livros.add(livroF01);
		carrinho.livros.add(livroF02);
		
		
		carrinho.livros.add(livroEbook);
		carrinho.livros.add(ebook03);
		carrinho.livros.add(ebook04);
		
		//ArrayList<Livro> livros = new ArrayList<Livro>();
		//livros.add(livroFisico);
		
		System.out.println(livroFisico.getAutor());
		System.out.println(livroEbook.getAutor());
		
		System.out.println("Total a pagar: R$" + carrinho.calcularTotal());
		System.out.println("Livros do carrinho: " + carrinho.imprimirListaLivroFisico());
		
		
	}

}