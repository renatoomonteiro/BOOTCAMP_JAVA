import java.util.ArrayList;
public class CarrinhoDeCompras {

	public ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public double calcularTotal(double precoTotal, double frete) {
		return precoTotal + frete;
		
	}
	
}
