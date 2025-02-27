
public class LivroFisico extends Livro {

	public double peso, frete;

	public LivroFisico(String titulo, String autor, String isbn, double preco, double peso, double frete) {
		super(titulo, autor, isbn, preco);
		this.peso = peso;
		this.frete = frete;
	}

}
