import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeArray {

	public static void main(String[] args) {
		// Estrutura de Dados - ARRAY LIST

		// input, para entrada de dados
		Scanner input = new Scanner(System.in);

		// ArrayList de String, receberá os itens da lista de compras
		ArrayList<String> listaDeCompras = new ArrayList<>();

		// método de inserção na lista = listaDeCompras.add();
		listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijão");
		listaDeCompras.add("Farinha");
		listaDeCompras.add("Ovo");

//		Exibe o elemento na posição um da lista. Lembrando que começa em zero
		System.out.println(listaDeCompras.get(1));

//		Remove o elemento na posição um da lista
		listaDeCompras.remove(1);
		System.out.println(listaDeCompras.get(1));
	}

}
