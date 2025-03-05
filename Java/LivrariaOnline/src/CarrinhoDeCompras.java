import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

	public List<Livro> livros = new ArrayList<Livro>();
	
	public double calcularTotal() {
		
		double total = 0;
		
		for(Livro l : livros) {
			total += l.calcularPrecoTotal();
		}
		
		return total;
	}
	//Teste commit 02/03/2025
	
	
	
}