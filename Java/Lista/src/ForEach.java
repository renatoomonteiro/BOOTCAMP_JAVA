import java.util.Scanner;
import java.util.ArrayList;
public class ForEach {

	public static void main(String[] args) {
		// FOREACH

		Scanner input = new Scanner(System.in);
		
		//Lista, sem tamanho definido, apenas o tipo de dado, que é Integer
		ArrayList<Integer> listaDeNotas = new ArrayList<>();
		
//		Inserindo elementos nos índices da lista
		listaDeNotas.add(6);
		listaDeNotas.add(2);
		listaDeNotas.add(8);
		listaDeNotas.add(10);
		listaDeNotas.add(5);		
		
//		for comum
		System.out.println("For comum");
		for(int i=0; i<listaDeNotas.size(); i++) {
			System.out.println(listaDeNotas.get(i));
		}
		
		System.out.println("For aprimorado");
//		for aprimorado
		for(Integer nota: listaDeNotas) {
			System.out.println(nota);
		}
			
		
		
	}

}
