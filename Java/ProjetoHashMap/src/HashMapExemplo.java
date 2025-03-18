//Estrutura de Dados - HASHMAP
import java.util.HashMap;
public class HashMapExemplo {

	public static void main(String[] args) {
		//Chave Valor
		HashMap<String,String> dicionario = new HashMap<>();
		HashMap<String,Double> estoque = new HashMap<>();
		

		dicionario.put("Palavra1", "Significado da palavra1");
		dicionario.put("Palavra2", "Significado da palavra2");
		dicionario.put("Palavra3", "Significado da palavra3");
		dicionario.put("Palavra4", "Significado da palavra4");
		
		
		
		estoque.put("Maçã", 30.0);
		estoque.put("Uva", 10.0);
		estoque.put("Melão", 20.0);
		
		System.out.println(dicionario.get("Palavra3"));
		System.out.println(estoque.get("Maçã"));
		
		for(String chave: estoque.keySet()) {
			System.out.println(chave + " - " + estoque.get(chave));
		}

	}

}
