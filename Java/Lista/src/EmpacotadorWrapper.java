//import java.util.Scanner;
import java.util.ArrayList;
public class EmpacotadorWrapper {

	public static void main(String[] args) {
//		As listas não aceitam tipos de dados primitivos, os do tipo int, double, float, char, long.class 
//		(os que iniciam com letra minúscula no java)

//		Neste caso, utilizamos o Wrapper, os empacotadores de tipo no Java, que utilizam Integer, Double, etc
		
		//Scanner input = new Scanner(System.in);
		
		//ArrayList<String> listaDeCompras = new ArrayList<>();
		ArrayList<Integer> listaDeNotas = new ArrayList<>();
		
		//Inseri a nota 5 no índice zero da lista de notas com o método .add().
		listaDeNotas.add(5);
		
		//Exibi a nota no índice zero da lista com o método get
		System.out.println(listaDeNotas.get(0));
	}

}
