
public class Livro {
	
	public String titulo, autor, isbn;
	public double preco;

	public Livro(String titulo, String autor, String isbn, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}
	
	
	public double calcularPrecoTotal(double preco, double frete ) {
		
		this.preco = preco;
		//this.livroFisico.frete = frete;
		return preco + frete;
	}
}
