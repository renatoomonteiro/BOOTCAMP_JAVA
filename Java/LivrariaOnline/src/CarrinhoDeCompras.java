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
	
	public String imprimirListaLivroFisico() {

		for (Livro c : livros) {
				return "Titulo:" + c.getTitulo() + "-Autor:" + c.getAutor() + "-ISBN:" + c.getIsbn() + "-Preço:"
						+ c.getPreco() + "-Peso:" + ((LivroFisico) c).getPeso() + "-Frete:"
						+ ((LivroFisico) c).getFrete();
			

		}
		return "\nNão há livros!";
	}
	public String imprimirListaEBook() {
		
		for (Livro c : livros) {
			if (c instanceof Ebook) {
				return "Titulo:" + c.getTitulo() + "-Autor:" + c.getAutor() + "-ISBN:" + c.getIsbn()
				+ "-Preço:" + c.getPreco() + "-TamanhoEmMb:" + ((Ebook) c).getTamanhoEmMb(); 
			}
		}
		return "\nNão há livros!";
	}
	
	
	
	
	
}