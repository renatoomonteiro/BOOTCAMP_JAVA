//ENUM - Básico

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DiaDaSemana diaEnum;
		
		//diaEnum = DiaDaSemana.DOMINGO;
		
		//FormaDePagamento formaPag = new FormaDePagamento.CARTAO_CREDITO;
		
		System.out.println("Escolha o dia da semana: ");
		
		//For Aprimorado
		for(DiaDaSemana dia : DiaDaSemana.values()) {
			System.out.println(dia);
		}
		
		String diaTexto = input.next();
		
		diaEnum = DiaDaSemana.valueOf(diaTexto.toUpperCase());
		
		System.out.println("\nO dia escolhido foi: " + diaEnum);
		
	}

}
