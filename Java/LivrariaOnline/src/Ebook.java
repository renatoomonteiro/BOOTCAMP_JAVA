
public class Ebook extends Livro{
	
	public double tamanhoEmMb;

	public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
		super(titulo, autor, isbn, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}
	
	
}
